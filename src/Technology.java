public class Technology {
    private String nazwa;
    private int bonus;

    public Technology(String nazwa, int bonus) {
        this.nazwa = nazwa;
        this.bonus = bonus;
    }
    public int getBonus() {
        return bonus;
    }

    public String getNazwa() {
        return nazwa;
    }
}
