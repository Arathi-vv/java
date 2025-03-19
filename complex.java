import java.util.Scanner;
class comp{
 int real;
 int imaginary;
 comp(int real,int imaginary)
  {
   this.real=real;
   this.imaginary=imaginary;
   }
  void display()
  {
   System.out.println(real+"+"+imaginary+"i");
   }
  void add(int r1,int i1,int r2,int i2)
   {
   int sumReal=r1+r2;
   int sumImaginary=i1+i2;
   System.out.println("After Addition="+sumReal+"+"+sumImaginary+"i");
   }}
   class complex{
   public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the real part of the 1st complex number");
    int real1=sc.nextInt();
    System.out.println("Enter the imaginary part of the 1st complex number");
    int img1=sc.nextInt();  
    System.out.println("Enter the real part of the 2nd complex number");
    int real2=sc.nextInt(); 
    System.out.println("Enter the real part of the 2nd complex number");
    int img2=sc.nextInt();  
    comp first=new comp(real1,img1);
    comp second=new comp(real2,img2);
    System.out.println("Complex Numbers are:");
    first.display();
    second.display();
    first.add(first.real,first.imaginary,second.real,second.imaginary);
    }}
