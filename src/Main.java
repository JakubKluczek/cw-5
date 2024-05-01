import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();

        Programista dev = new Programista("John", "Doe", "123456789", "john@doe.com", "New York", 2020);
        Technology t=new Technology("Java", 800);
        dev.addTechnology(t);
        employees.add(dev);

        Tester tester = new Tester("Jane", "Smith", "987654321", "jena@smith.com", "Los Amgeles", 2021);
        tester.addTaskType("UX/UX");
        employees.add(tester);

        Manager manager= new Manager("Bob", "Johnson", "Chicago", "bob@johnson.com", "1122334455", 2019);
        Goal g=new Goal(2010, 10, 15, "Implementing FB login", 1000);
        manager.addGoals(g);
        employees.add(manager);

        int totalAmount = 0;
        for (Employee employee : employees) {
            totalAmount += employee.calculateMonthlyCost();

        }
        System.out.println("Total amount to be paid this month:" + totalAmount + " zł");

    }
}
