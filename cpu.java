public class cpu{
 static class processor
 {
  int cores;
  String manufacture;
  processor(int cores,String manufacture){
   this.cores=cores;
   this.manufacture=manufacture;}
   void display()
   {
    System.out.println("Processor info");
    System.out.println("No.of Cores="+cores);
    System.out.println("Manufacture="+manufacture+"\n");
    }}
   static class RAM{
    int memory;
    String manufacture;
    RAM(int memory,String manufacture){
     this.memory=memory;
     this.manufacture=manufacture;
     }
    void display(){
     System.out.println("RAM info");
    System.out.println("Memory="+memory+"GB");
    System.out.println("Manufacture="+manufacture+"\n");
    }}
   public static void main(String[] args)
   {
    RAM ram=new RAM(8,"Intel");
    processor processor=new processor(8,"Samsung");
    ram.display();
    processor.display();
    }}
