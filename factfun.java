import java.util.Scanner;
public class factfun
{
 int n;
 void input()
 {
 System.out.println("enter the number");
 Scanner sc=new Scanner(System.in);
 n=sc.nextInt();
 } 
 void fact()
 {
  int i,f=1;
  for(i=1;i<=n;i++)
  {
    f=f*i;
   }
   System.out.println(f);
   }
   public static void main(String args[])
    {
      factfun f=new factfun();
      f.input();
      f.fact();
}
}