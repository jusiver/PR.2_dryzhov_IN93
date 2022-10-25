package company.model;

import java.util.Objects;

public class Employee {

    private String name;
    private String departmentName;
    private double salary;
    private int ID;
    private int managerID;

    public Employee(String name, String departmentName, double salary, int ID, int managerID) {
        this.name = name;
        this.departmentName = departmentName;
        this.salary = salary;
        this.ID = ID;
        this.managerID = managerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        this.managerID = managerID;
    }

    @Override
    public String toString() {
        return ID + ". Name: " + name + '\n' +
                "Department Name: " + departmentName + '\n' +
                "Salary: " + salary + '\n' +
                "ID: " + ID + '\n' +
                "Manger ID: " + managerID + '\n';
    }

    public boolean equals(Employee emp) {
        return this.ID == emp.ID;
    }
}
