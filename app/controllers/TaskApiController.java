package controllers;

import com.fasterxml.jackson.databind.JsonNode;
import models.Task;
import play.libs.Json;
import play.mvc.Result;
import scala.collection.parallel.Tasks;

import java.util.List;

import static play.mvc.Results.ok;

public class TaskApiController {

    public static Result allTasks(){
        List<Task> tasks = Task.all();
        JsonNode jsonNode = Json.toJson(tasks);
        return ok(jsonNode);
    }

    public static Result getTask(Long id){
       // int ids = (int) id;

        Task task = Task.getTaskById(id);
        JsonNode jsonNode=null;
        try {
        jsonNode = Json.toJson(task);
        }catch (java.lang.IllegalArgumentException ile){
            //task.id=0;
            task.name="Not found";
        }

        return ok(jsonNode);
    }

    public static Result addTask(Long id, String name){
        Task.create(new Task(name,id));
        JsonNode jsonNode = Json.toJson("Added new task");
        return ok(jsonNode);
    }
}
