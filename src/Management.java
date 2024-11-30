import java.util.ArrayList;

public class Management {
    public static void main(String[] args) {
        String[] employeeNames = {"Alice", "Bob", "Charlie", "Diana", "Edward", "Fiona"};
        int[] employeeSalaries = {5000, 7000, 8000, 7500, 8200, 6000};
        String[] employeeDepartments = {"HR", "IT", "IT", "HR", "Finance", "Finance"};
        System.out.println(getEmployeeCountInDepartment(employeeNames, employeeDepartments, "IT"));
    }

    static int getEmployeeCountInDepartment(String[] employeeNames, String[] employeeDepartments, String department) {
        ArrayList<String> departmentEmployees = new ArrayList<>();
        for (int i = 0; i < employeeNames.length; i++) {
            for (int j = 0; j < employeeDepartments.length; j++) {
                if (i == j && employeeDepartments[j] == department) {
                    departmentEmployees.add(employeeNames[i]);
                }
            }

        }
        return departmentEmployees.size();


    }
    static int getEmployeeInDepartmentSalaries(String[] employeeNames, String[] employeeSalaries, String department) {
        ArrayList<String> departmentEmployees = new ArrayList<>();
        for (int i = 0; i < employeeNames.length; i++) {
            for (int j = 0; j < employeeSalaries.length; j++) {
                if (i == j && employeeSalaries[j] == department) {
                    departmentEmployees.add(employeeNames[i]);
                }
            }

        }
        return departmentEmployees.size();


    }
}

