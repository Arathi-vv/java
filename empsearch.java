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
    public void displayEmployeeDetails() {
        System.out.println("Employee No: " + eNo);
        System.out.println("Employee Name: " + eName);
        System.out.println("Employee Salary: " + eSalary);
    }
}
public class empsearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        Employee[] employees = new Employee[n];
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1) + ":");
            System.out.print("Enter Employee No: ");
            int eNo = scanner.nextInt();
            scanner.nextLine(); 
            System.out.print("Enter Employee Name: ");
            String eName = scanner.nextLine();
            System.out.print("Enter Employee Salary: ");
            double eSalary = scanner.nextDouble();
            employees[i] = new Employee(eNo, eName, eSalary);
        }
        System.out.print("\nEnter Employee No to search: ");
        int searchENo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < n; i++) {
            if (employees[i].eNo == searchENo) {
                System.out.println("\nEmployee found:");
                employees[i].displayEmployeeDetails();
                found = true;
                break;
            }
        }
   if (!found) {
            System.out.println("Employee with Employee No " + searchENo + " not found.");
        }

        scanner.close();}}
    


