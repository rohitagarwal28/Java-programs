import java.util.*;
class array
{
public static void main(String args[])
{
int a[]=new int[6],i;
Scanner sc=new Scanner(System.in);
System.out.println("enter 6 elements in array:");
for(i=0;i<6;i++)
{
a[i]=sc.nextInt();
}
System.out.println("elemnents are:");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
}
}