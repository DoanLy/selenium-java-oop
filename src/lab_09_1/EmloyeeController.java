package lab_09_1;

import java.util.List;

public class EmloyeeController {

    public int calculateTotalSalary(List<Employee> employeeList) {
        int totalSalary = 0;
        for (Employee employee : employeeList) {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
}
