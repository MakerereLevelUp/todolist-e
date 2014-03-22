package models;

import java.util.ArrayList;

public class Task {

    private String name;
    private int duration;
    private int id;

    public Task( String name, int duration, int id){
        this.name=name;
        this.duration=duration;
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public int getDuration(){
        return duration;
    }

    public int getId(){
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (duration != task.duration) return false;
        if (id != task.id) return false;
        if (!name.equals(task.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + duration;
        result = 31 * result + id;
        return result;
    }

    public static ArrayList<Task> taskList(){
        ArrayList<Task> list = new ArrayList<Task>();
        return list;
    }
}
