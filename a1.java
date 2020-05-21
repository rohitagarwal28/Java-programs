import java.util.Scanner;
public class a1
{
 public static void main(String args[])
 {
int a[]=new int[10];
 int i;
 System.out.println("enter the elements of array");
 
     Scanner sc=new Scanner(System.in);
 for( i=0;i<10;i++)
   {
     a[i]=sc.nextInt();
	}
System.out.println("elements are-");
for(i=0;i<10;i++)
{
 System.out.println(a[i]);
}
}
}	
