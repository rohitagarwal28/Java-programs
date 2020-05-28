public class factorial
{
public static void factorial1(int x)
{int y=1;
if(x==0)
System.out.println("factorial :1");
else
{
while(x!=0)
{
y=y*x;
x--;
}
}
}
 public static void main(String args[])
{ 
  int a=5;
  factorial1(a);
}
}
