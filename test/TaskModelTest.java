import models.Task;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaskModelTest {

    @Test
    public void itShouldHaveTheAttributesForTask(){
        Task task = new Task(1,"Practising TDD");
        assertThat(task.getId(), is(1L));
        assertThat(task.getName(), is("Practising TDD"));
    }


    @Test
    public void itShouldBeUnique(){
        Task task = new Task( "group practising TDD", 1);
        assertThat(task,  is(new Task("group practising TDD", 1)));
            }
    
}
