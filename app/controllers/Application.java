package controllers;

import models.Task;
import models.TaskManager;
import play.*;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

    public static Result tasks(){

      TaskManager taskManager = new TaskManager();
        taskManager.add(new Task("checking app",2,  3));
        taskManager.add(new Task("rendering views", 3, 3));
        return  ok(
                views.html.index.render("not good"));
    }
}
