import java.util.*;
class array1
{
public static void main(String args[])
{
int a[]=new int[6],i,sum=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter 6 elements in array:");
for(i=0;i<6;i++)
{
a[i]=sc.nextInt();
sum=sum+a[i];
}
System.out.println("elemnents are:");
for(i=0;i<6;i++)
{
System.out.println(a[i]);
}
System.out.println("sum of 1-d array is:"+sum);
}
}