import java.util.Scanner;
class Complex {
    int real;
    int imag;
    Complex(int r, int i) {
        real = r;
        imag = i;
    }
    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }
    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}
public class complexMain{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter real and imaginary part of first complex number: ");
        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        System.out.print("Enter real and imaginary part of second complex number: ");
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.add(c2);
        System.out.print("Sum = ");
        sum.display();
        sc.close();
    }
}

