import java.util.Scanner;
public class calc{
 public static void main(String[] args){
   Scanner sc= new Scanner(System.in);
   int a,b;
   System.out.println("Enter 2 numbers:");
   a=sc.nextInt();
   b=sc.nextInt();
   while(true){
   System.out.println("1)ADD\n2)SUB\n3)MUL\n4)DIV\n5)EXIT");
   System.out.println("Enter a option:");
   int opt=sc.nextInt();
   switch(opt){
    case 1:System.out.println("sum of 2 numbers:"+(a+b));
           break;
    case 2:System.out.println(a-b);
           break;
    case 3:System.out.println(a*b);
           break;
    case 4:System.out.println(a/b);
           break;
    case 5:System.exit(0);
           break;
    default:
     System.out.println("invalid choice");
 
     
     
     
 }}}}
      
       
        
      
