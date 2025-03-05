import java.util.Scanner;
class Matrix{
 private int[][] matrix;
 public Matrix(int rows,int cols){
  matrix=new int[rows][cols];
  }
 public void inputMatrix(Scanner sc){
  for(int i=0;i<matrix.length;i++){
     for(int j=0;j<matrix[0].length;j++){
      matrix[i][j]=sc.nextInt();
      }}}
 public Matrix add(Matrix other){
   Matrix result=new Matrix(matrix.length,matrix[0].length);
   for(int i=0;i<matrix.length;i++){
     for(int j=0;j<matrix[0].length;j++){
      result.matrix[i][j]=this.matrix[i][j]+other.matrix[i][j];
      }}
     return result;
     }
 public void display(){
  for(int i=0;i<matrix.length;i++){
     for(int j=0;j<matrix[0].length;j++){
      System.out.print(matrix[i][j]+"\t");
      }
     System.out.println();
  }}}
public class MatrixAdd
 {
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the number of rows:");
   int rows=sc.nextInt();
    System.out.println("Enter the number of columns:");
   int cols=sc.nextInt();
   Matrix matrix1=new Matrix(rows,cols);
   Matrix matrix2=new Matrix(rows,cols);
   System.out.println("Enter the elements of 1st matrix:");
   matrix1.inputMatrix(sc);
   System.out.println("Enter the elements of 2nd matrix:");
   matrix2.inputMatrix(sc);
   Matrix sumMatrix=matrix1.add(matrix2);
   System.out.println("Sum of matrices:");
   sumMatrix.display();
   sc.close();
   }}
   
   
   
   
   
   
   
