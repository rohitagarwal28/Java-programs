import java.util.Scanner;
class Rectanglee
{
 public
 int l,b,area;
 Scanner sc=new Scanner(System.in);
 void input()
{
 System.out.println("enter the length and breadth of rectangle"); 
 l=sc.nextInt();
 b=sc.nextInt();
 area=l*b;
}
 void show()
{
 System.out.println(area);
}
}
class Cuboid extends Rectanglee
{
 public
 int h,volume;
 void read()
{
 System.out.println("enter the height of cuboid");
 h=sc.nextInt();
 volume=super.l*super.b*h;
}
void display()
{
 System.out.println("volume="+volume);
}
}
class result
{
 public static void main(String args[])
 {
   result r=new result();
   r.input();
   r.show();
   r.read();
   r.display();
}
 
 