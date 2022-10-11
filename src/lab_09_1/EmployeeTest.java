package lab_09_1;

import java.util.Arrays;
import java.util.List;

public class EmployeeTest {
    public static void main(String[] args) {
        // from up data from objects
        Employee Ly = new FTE();
        Employee Truc = new Contractor();
        List<Employee> employeeList = Arrays.asList(Ly, Truc);

        // Calling controller to process data
        int totalSalary = new EmloyeeController().calculateTotalSalary(employeeList);
        System.out.println("Total: " + totalSalary);

    }
}
