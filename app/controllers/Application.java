package controllers;

import models.Task;
import play.*;
import play.mvc.*;
import play.data.Form;

import views.html.*;

import java.util.List;

public class Application extends Controller {

    static Form<Task> taskForm = Form.form(Task.class);

    public static Result index() {
        return ok("Your new application is ready.");
    }

    public static Result tasks(){

       /*
       TaskManager taskManager = new TaskManager();
        taskManager.add(new Task("checking app",2,  3));
        taskManager.add(new Task("rendering views", 3, 3));
        */
        return  ok(activities.render(Task.all(), taskForm));
    }

    public static Result newTask(){
        Form<Task> filledForm = taskForm.bindFromRequest();
        if(filledForm.hasErrors()){
            return badRequest(
                    activities.render(Task.all(), filledForm)
            );
        }else{
            Task.create(filledForm.get());
            return redirect(controllers.routes.Application.tasks());
        }
    }

    public static Result deleteTask(Long id){
        Task.delete(id);
        return redirect(controllers.routes.Application.tasks());
    }
}
