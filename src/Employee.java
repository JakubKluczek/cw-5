import java.util.ArrayList;

public class Employee {

    protected String name;
    protected String lastName;
    protected String adres;
    protected String email;
    protected String pesel;
    protected int rokZatrudnienia;


    public Employee(String name, String lastName, String adres, String email, String pesel, int rokZatrudnienia) {
        this.name = name;
        this.lastName = lastName;
        this.pesel = adres;
        this.email = email;
        this.pesel = pesel;
        this.rokZatrudnienia = rokZatrudnienia;

    }
    public ArrayList<Employee> employees;
    public ArrayList<Employee> czasPracy;
    public double calculateMonthlyCost(){
        int baseSalary= 3000;
        int annualIncrease= 1000;
        int totalSalary= baseSalary + yearsOfWork * annualIncrease;
        return totalSalary;



    }



}


