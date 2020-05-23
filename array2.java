import java.util.*;
class array2
{
public static void main(String args[])
{
int a[][]=new int[2][2],i,j,b[][]=new int[2][2];
Scanner sc=new Scanner(System.in);
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.println("enter a["+(i+1)+"]["+(j+1)+"]:");
a[i][j]=sc.nextInt();
}
}
System.out.println("matrix a:");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{System.out.println("enter b["+(i+1)+"]["+(j+1)+"]:");
b[i][j]=sc.nextInt();
}
}
System.out.println("matrix b:");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
System.out.println("sum of matrix a and b is:");
//System.out.println("matrix a:");
for(i=0;i<2;i++)
{
for(j=0;j<2;j++)
{
System.out.print(a[i][j]+b[i][j]+"\t");
}
System.out.println();
}
}
}