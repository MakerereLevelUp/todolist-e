import models.Task;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static play.test.Helpers.fakeApplication;
import static play.test.Helpers.running;


public class TaskModelTest {

    @Test
    public void itShouldHaveTheAttributesForTask(){
        Task task = new Task("Practising TDD",1);
        assertThat(task.name, is("Practising TDD"));
    }

/*
    @Test
    public void itShouldBeUnique(){
        Task task = new Task( "group practising TDD",2);
            assertThat(task,  is(new Task("group practising TDD",2)));
        }
*/

    @Test
    public void findById(){
        running(fakeApplication(),new Runnable() {
            @Override
            public void run() {
                Task task1 = new Task("pray",1);
                Task task2 = new Task("eat",2);
                task1.save();
                task2.save();
                Integer size = Task.all().size();
                assertThat(size, is(2));
            }
        });
    }
}
