import java.util.ArrayList;

public class Manager extends Employee{
    private ArrayList<Task> tasks;

    public Manager(String name, String lastName, String adres, String email, String pesel, String rokZatrudnienia) {
        super(name, lastName, adres, email, pesel, rokZatrudnienia);
    }



    public void addCompletedTask(Task task){
        tasks.add(task);
    }
}

