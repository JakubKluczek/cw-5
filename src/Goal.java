import java.time.LocalDate;
public class Goal {
    private LocalDate date;
    private String name;
    private int bonus;

    public Goal(int year, int month, int day, String name, int bonus) {
        this.date = LocalDate.of(year, month, day);
        this.name = name;
        this.bonus = bonus;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public int getBonus() {
        return bonus;
    }
}
