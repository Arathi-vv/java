class student{
   String name;
   int rollno;
   int mark;
   }
   
  
public class arrayobj{
  public static void main(String[] args){
    student s1=new student();
    s1.name="anu";
    s1.rollno=1;
    s1.mark=90;
   student s2=new student();
    s2.name="arun";
    s2.rollno=2;
    s2.mark=80;
    student st[]=new student[3];
     st[0]=s1;
     st[1]=s2;
    for(int i=0;i<st.length;i++){
    if (st[i] != null) {
     System.out.println(st[i].name+":"+st[i].mark);
     }
     }
     }}
