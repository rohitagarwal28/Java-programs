import java.util.Scanner;
public class student
{
 String name,branch;
 int id,age;
 void info()
  {
   System.out.println("enter the student details");
   Scanner sc=new Scanner(System.in);
   System.out.println("enter name");
   name=sc.next();
   System.out.println("enter branch");
   branch=sc.next();
   System.out.println("enter id");
   id=sc.nextInt();
   System.out.println("enter age");
   age=sc.nextInt();
  }
  void display()
  {
   System.out.println(name);
   System.out.println(branch);
   System.out.println(id);
   System.out.println(age);
 } 
}
  class stud
 {
  public static void main(String args[])
  {
   student s=new student();
   s.info();
   s.display();
}
} 
