import java.util.*;
public class factorial1
{
public static void swap(int x,int z)
{int y;
y=x;
x=z;
z=y;
System.out.println("after swapping:\nx="+x+"\ny="+z);
}
 public static void main(String args[])
{
  Scanner s=new Scanner(System.in); 
  int a,b;
System.out.println("enter number:");
a=s.nextInt();
b=s.nextInt();
System.out.println("before swapping:\nx="+a+"\ny="+b);
  swap(a,b);
}
}
