package models;

import models.Task;

import java.util.ArrayList;

public class TaskManager {

   private ArrayList<Task> taskList = new ArrayList<Task>();

    public TaskManager(){
    }

    public void addTask(Task task){

        taskList.add(task);
    }

   public ArrayList<Task> getTaskList(){
       return taskList;
   }


    public ArrayList<Task> tasks = new ArrayList<Task>();

    public void add(Task task) {

        tasks.add(task);
    }
}
