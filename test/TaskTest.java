import models.Task;
import models.TaskManager;
import org.junit.Test;

import java.util.ArrayList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TaskTest {


    @Test
    public void shouldTestTaskHasNameAndId(){
       Task task=new Task("Pray",1L);

    assertThat(task.name,is("Pray"));
    assertThat(task.id,is(1L));

    }

    @Test
    public void shouldTestAddOfTaskToList(){
    TaskManager taskManager = new TaskManager();
    Task task = new Task("Pray",1L);
    taskManager.addTask(task);
   ArrayList<Task> taskList= taskManager.getTaskList();
    assertThat(taskList.size(),is(1));
}

 }