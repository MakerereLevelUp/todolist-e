package models;

import play.data.Form;
import play.data.validation.Constraints;
import play.db.ebean.*;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

@Entity
public class Task extends Model {

    @Constraints.Required
    public String name;

    @Id
    public Long id;

    public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

    public Task( String name, Long id){
        this.name=name;
        this.id = id;
    }

    public static ArrayList<Task> taskList(){
        ArrayList<Task> list = new ArrayList<Task>();
        return list;
    }

    public static List<Task> all(){
        return find.all();
    }

    public  static void create(Task task){
        task.save();
    }

    public static void delete(Long id) {
        find.ref(id).delete();
    }

    public static Task getTaskById(Long id){
        return find.ref(id);
    }
}
