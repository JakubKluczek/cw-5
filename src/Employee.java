import java.util.ArrayList;
import java.time.LocalDate;

public class Employee {

    protected String name;
    protected String lastName;
    protected String adres;
    protected String email;
    protected String pesel;
    protected int rokZatrudnienia;

    protected double baseSalary= 3000;


    public Employee(String name, String lastName, String adres, String email, String pesel, int rokZatrudnienia) {
        this.name = name;
        this.lastName = lastName;
        this.adres = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;
    }

    public double calculateMonthlyCost(){
        int obecnyRok = LocalDate.now().getYear();
        int lataPracy = obecnyRok - rokZatrudnienia;

        return baseSalary + (1000 * lataPracy);
    }
}


