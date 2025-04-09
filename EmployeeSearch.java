import java.util.Scanner;
class Employee {
    int eNo;
    String eName;
    double eSalary;
    public Employee(int eNo, String eName, double eSalary) {
        this.eNo = eNo;
        this.eName = eName;
        this.eSalary = eSalary;
    }
    public void displayEmployee() {
        System.out.println("Employee Number: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}
public class EmployeeSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee Number: ");
            int eNo = scanner.nextInt(); 
            scanner.nextLine();
            System.out.print("Enter Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double eSalary = scanner.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.print("\nEnter the Employee Number to search: ");
        int searchNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchNo) {
                System.out.println("\nEmployee found:");
                employees[i].displayEmployee();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\nEmployee with Employee Number " + searchNo + " not found.");
        }

        scanner.close();
    }
}

