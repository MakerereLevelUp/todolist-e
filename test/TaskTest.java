import models.Task;
import models.TaskManager;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by k-packxs on 3/15/14.
 */
public class TaskTest {


    @Test
    public void shouldTestTaskHasNameAndDuration(){
       Task task=new Task("Pray",3);

    assertThat(task.getName(),is("Pray"));
    assertThat(task.getDuration(),is(3));

    }

    @Test
    public void shouldTestAddOfTaskToList(){
    TaskManager taskManager = new TaskManager();
    Task task = new Task("Pray",3);
    taskManager.addTask(task);
   ArrayList<Task> taskList= taskManager.getTaskList();
    assertThat(taskList.size(),is(1));
}





 }