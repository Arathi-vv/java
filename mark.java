import java.util.Scanner;
public class mark {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter marks of the student: ");
        int marks = scanner.nextInt();
        char grade;
        switch (marks / 10) {
            case 10:
            case 9:
                grade = 'A'; 
                break;
            case 8:
                grade = 'B'; 
                break;
            case 7:
                grade = 'C'; 
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("The grade for the student is: " + grade);
        scanner.close();
    }
}
