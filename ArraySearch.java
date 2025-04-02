import java.util.Scanner;
public class ArraySearch{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of elemets in the array:");
   int n=sc.nextInt();
   int[] array=new int[n];
   System.out.println("Enter the elements of array:");
    for(int i=0;i<n;i++){
     array[i]=sc.nextInt();
     }
    System.out.println("Enter the element to search:");
    int target=sc.nextInt();
    int index=-1;
    for(int i=0;i<array.length;i++){
     if(array[i]==target){
      index=i;
      break;
      }
      }
    if(index!=-1){
        System.out.println("Elemet is found at index:"+(index+1));}
    else{
         System.out.println("Element is not found!");
         }
     sc.close();
     }}
     
    
