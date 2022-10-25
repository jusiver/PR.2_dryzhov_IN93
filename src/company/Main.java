package company;

import company.exceptions.EmployeeInRegistryException;
import company.model.Employee;
import company.model.Registry;

import java.text.DecimalFormat;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat formatter = new DecimalFormat("#.##");

        Registry registry = Registry.getWorkersRegistry();

        //for (int i = 0; i < 5; i++) {
        //    try {
        //        registry.addEmployee(new Employee("Name №" + (i + 1), "Department №" + (i + 1),
        //                Double.parseDouble(formatter.format(Math.random() * 1000)), i + 1, (int) (Math.random() * 5)));
        //    } catch (EmployeeInRegistryException e) {
        //        System.out.println(e.getMessage());
        //    }
        //}

        try {
            registry.addEmployee(new Employee("Robert", "Some department", 1345.123, 1, 4));
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        try {
            registry.addEmployee(new Employee("John", "Some department", 1345.123, 2, 4));
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        try {
            registry.addEmployee(new Employee("Walter", "Some department", 1345.123, 1, 4));
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        try {
            registry.addEmployee(new Employee("Alexus", "Some department", 1345.123, 4, 4));
        } catch (EmployeeInRegistryException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(registry);

    }
}