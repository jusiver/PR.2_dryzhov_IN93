package company.exceptions;

import company.model.Employee;

public class EmployeeInRegistryException extends Exception {

    private static final String MESSAGE = "Такий працівник вже існує в реєстрі";

    public EmployeeInRegistryException() {
        super(MESSAGE);
    }

    public EmployeeInRegistryException(String message) {
        super(message);
    }

    public EmployeeInRegistryException(Employee addingEmp, Employee existingEmp) {
        super (MESSAGE + '\n' +
                "Існуючий працівник: \n" + existingEmp + '\n' +
                "Працівник, що додається: \n" + addingEmp);
    }

}
