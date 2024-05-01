import java.util.ArrayList;
public class Tester extends Employee{
    private ArrayList<Testy> rodzajeTestow;
    private final int bonusPerTest = 300;
    public Tester(String name, String lastName, String pesel, String email, String adres, int rokZatrudnienia) {
        super(name, lastName, pesel, email, adres, rokZatrudnienia);
        this.rodzajeTestow= new ArrayList<>();
    }
    public void addTaskType (String Testy){
        rodzajeTestow.add(new Testy(name));
    }


    public double calculateMonthlyCost() {
        double pensja = super.calculateMonthlyCost();

            pensja += rodzajeTestow.size() * bonusPerTest;

        return pensja;
    }
}
