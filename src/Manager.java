import java.util.ArrayList;
import java.time.LocalDate;
public class Manager extends Employee{
    private ArrayList<Goal>  goals;

    public Manager(String name, String lastName, String adres, String email, String pesel, int rokZatrudnienia) {
        super(name, lastName, adres, email, pesel, rokZatrudnienia);
        this.goals = new ArrayList<>();
    }

    public void addGoals(Goal goal) {
            goals.add(goal);
    }
    public double calculateMonthlyCost() {
        double pensja = super.calculateMonthlyCost();
        LocalDate currentMonth = LocalDate.now();

        for (Goal goal : goals) {
            if (goal.getDate().getMonth() == currentMonth.getMonth() && goal.getDate().getYear() == currentMonth.getYear()) {
                pensja += goal.getBonus();
            }
        }
        return pensja;
    }
}


