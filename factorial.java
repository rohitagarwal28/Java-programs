public class factorial
{
public static void factoria(int x)
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
System.out.println("factorial :"+y);
}
}
 public static void main(String args[])
{ 
  int a=5;
  factoria(a);
}
}
