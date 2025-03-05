class product{
 int pcode;
 String pname;
 double price;
 product(int a,String b,double c){
  pcode=a;
  pname=b;
  price=c;
  }
  void display(){
   System.out.println(pcode+"\t\t"+pname+"\t\t"+price);
   }
   }
class productDemo{
 static void lowest(product p1,product p2,product p3){
  if(p1.price<=p2.price&&p1.price<=p3.price){
       System.out.println("product 1 price is lowest");
       }
  else if(p2.price<=p1.price&&p2.price<=p3.price){
       System.out.println("product 2 price is lowest");
       }
  else{
       System.out.println("product 3 price is lowest");
       }}
  public static void main(String args[]){
    product obj1=new product(1,"p1",10000);
    product obj2=new product(1,"p2",50000);
    product obj3=new product(1,"p3",2000);
    System.out.println("\nproduct_code\t Product_name\tProduct_price");
    obj1.display();
    obj2.display();
    obj3.display();
    lowest(obj1,obj2,obj3);
    }}
