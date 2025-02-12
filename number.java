import java.util.Scanner;
public class number{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter a number:");
  int a=sc.nextInt();
  if(a<0)
    System.out.println("number is negative");
  else if(a>0)
    System.out.println("number is positive");
  else
    System.out.println("number is zero");
  }}
