package company.model;



public class Manager extends Employee {

    private double bonus;

    public Manager(String name, String departmentName, double salary, int ID, int managerID, double bonus) {
        super(name, departmentName, salary, ID, managerID);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
