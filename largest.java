import java.util.Scanner;
public class largest{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter 2 numbers:");
  int a=sc.nextInt();
  int b=sc.nextInt();
  if(a>b)
  System.out.println(a+"is largest");
  else if(a<b)
   System.out.println(b+"is largest");
  else
   System.out.println(a+"and"+b+"are equal");
   }}
