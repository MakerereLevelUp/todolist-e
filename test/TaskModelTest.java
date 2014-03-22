import models.Task;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaskModelTest {

    @Test
    public void itShouldHaveTheAttributesForTask(){
        Task task = new Task("Practising TDD", 1,4);
        assertThat(task.getId(), is(4));
        assertThat(task.getName(), is("Practising TDD"));
    }


    @Test
    public void itShouldBeUnique(){
        Task task = new Task( "group practising TDD", 1, 3);
            assertThat(task,  is(new Task("group practising TDD", 1, 3)));
        }
}
