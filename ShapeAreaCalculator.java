import java.util.Scanner;
public class ShapeAreaCalculator {
    public double area(double radius) {
        return Math.PI * radius * radius;
    }
    public double area(double length, double breadth) {
        return length * breadth;
    }
    public double area(float base, float height) {
        return 0.5 * base * height;
    }
    public int area(int side) {
        return side * side;
    }
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShapeAreaCalculator calc = new ShapeAreaCalculator();

        System.out.println("Choose shape to calculate area:");
        System.out.println("1. Circle\n2. Rectangle\n3. Triangle\n4. Square");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("Enter radius of the circle: ");
                double radius = sc.nextDouble();
                System.out.println("Area of Circle = " + calc.area(radius));
                break;
            case 2:
                System.out.print("Enter length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter breadth of the rectangle: ");
                double breadth = sc.nextDouble();
                System.out.println("Area of Rectangle = " + calc.area(length, breadth));
                break;
            case 3:
                System.out.print("Enter base of the triangle: ");
                float base = sc.nextFloat();
                System.out.print("Enter height of the triangle: ");
                float height = sc.nextFloat();
                System.out.println("Area of Triangle = " + calc.area(base, height));
                break;
            case 4:
                System.out.print("Enter side of the square: ");
                int side = sc.nextInt();
                System.out.println("Area of Square = " + calc.area(side));
                break;
            default:
                System.out.println("Invalid choice!");
        }

        sc.close();
    }
}

