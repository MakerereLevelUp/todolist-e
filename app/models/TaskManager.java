package models;

import models.Task;

import java.util.ArrayList;

/**
 * Created by k-packxs on 3/22/14.
 */
public class TaskManager {

   private ArrayList<Task> taskList = new ArrayList<>();

    public TaskManager(){
    }

    public void addTask(Task task){

        taskList.add(task);
    }

   public ArrayList<Task> getTaskList(){
       return taskList;
   }



}
