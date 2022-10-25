package company.model;

import company.exceptions.EmployeeInRegistryException;

import java.util.ArrayList;
import java.util.List;

public class Registry {

    private static Registry workersRegistry; // Registry - instance of Registry.class
    private List<Employee> employeeList;

    public Registry() {
        this.employeeList = new ArrayList<>();
    }

    public static Registry getWorkersRegistry() {
        if (workersRegistry == null)
            workersRegistry = new Registry();

        return workersRegistry;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void addEmployee(Employee emp) throws EmployeeInRegistryException {
        for (Employee empFromList : employeeList) {
            if (emp.equals(empFromList))
                throw new EmployeeInRegistryException(emp, empFromList);
        }

        employeeList.add(emp);
    }

    public Employee getEmployeeById(int id) {
        return employeeList.get(id);
    }

    @Override
    public String toString() {
        StringBuilder empList = new StringBuilder();

        for (Employee emp : employeeList)
            empList.append(emp).append('\n');

        return "Registry: " + '\n' +
                empList + '\n';
    }
}
