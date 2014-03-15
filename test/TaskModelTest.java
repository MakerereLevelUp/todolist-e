import models.Task;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.core.Is.is;


public class TaskModelTest {

    @Test
    public void shouldTestModelForList(){
        Task task = new Task(1,"Practising TDD");
        int result = task.numberOfTasks();
        Assert.assertThat(result, is(2));
    }
}
