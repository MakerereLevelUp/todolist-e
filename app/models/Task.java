package models;

import java.util.ArrayList;

public class Task {

    private String name;
    private int duration;

    public Task( String name, int duration){
        this.name=name;
        this.duration=duration;
    }

    public String getName(){



    return name;

}

    public int getDuration(){



        return duration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Task)) return false;

        Task task = (Task) o;

        if (duration != task.duration) return false;
        if (!name.equals(task.name)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (duration ^ (duration >>> 32));
        result = 31 * result + name.hashCode();
        return result;
    }

    public static ArrayList<Task> taskList(){
        ArrayList<Task> list = new ArrayList<Task>();
        return list;
    }
}
