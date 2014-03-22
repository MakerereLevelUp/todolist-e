package models;

<<<<<<< HEAD
import models.Task;
=======
>>>>>>> adding tasks to the list

import java.util.ArrayList;

public class TaskManager {
<<<<<<< HEAD

   private ArrayList<Task> taskList = new ArrayList<Task>();

    public TaskManager(){
    }

    public void addTask(Task task){

        taskList.add(task);
    }

   public ArrayList<Task> getTaskList(){
       return taskList;
   }



=======
    public ArrayList<Task> tasks = new ArrayList<Task>();

    public void add(Task task) {

        tasks.add(task);
    }
>>>>>>> adding tasks to the list
}
