
import java.util.ArrayList;

public class Programista extends Employee{
    private ArrayList<Technology> technologie;

    public Programista(String name, String lastName, String adres, String email, String pesel, int rokZatrudnienia) {
        super(name, lastName, adres, email, pesel, rokZatrudnienia);
        this.technologie=new ArrayList<>();

    }
    public void addTechnology(Technology technology){

        technologie.add(technology);

    }

    public double calculateMonthlyCost() {

        double pensja = super.calculateMonthlyCost();
        for (Technology technologia : technologie) {
            pensja += technologia.getBonus();
        }
        return pensja;
    }




}
