import java.util.Scanner;
public class arrsum
{
 public static void main(String args[])
{
 int i,a[]=new int[10],sum=0;
 Scanner sc=new Scanner(System.in);
 System.out.println("enter the elements");
 for(i=0;i<10;i++)
{
 a[i]=sc.nextInt();
}
for(i=0;i<10;i++)
{
 if(i%2==0)
 {
  sum=sum+a[i];
}
}
 System.out.println("sum="+sum);

}
}