import models.Task;
import models.TaskManager;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class TaskManagerTest {

    @Test
    public void ItShouldBeEmptyWhenCreated(){

        TaskManager taskManager = new TaskManager();
        assertThat(taskManager.tasks.size(),is(0));

    }

    @Test
    public void ItShouldAddTask(){
        TaskManager taskManager = new TaskManager();
        taskManager.add(new Task("Testing storage",1L));
        assertThat(taskManager.tasks.size(), is(1));
    }




}
