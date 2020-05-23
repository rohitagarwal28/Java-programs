import java.util.*;
class array21
{
public static void main(String args[])
{
int a[][]=new int[3][3],i,j,b[][]=new int[3][3],c[][]=new int[3][3],k;
Scanner sc=new Scanner(System.in);
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.println("enter a["+(i+1)+"]["+(j+1)+"]:");
a[i][j]=sc.nextInt();
}
}
System.out.println("matrix a:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{System.out.println("enter b["+(i+1)+"]["+(j+1)+"]:");
b[i][j]=sc.nextInt();
}
}
System.out.println("matrix b:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(b[i][j]+"\t");
}
System.out.println();
}
System.out.println("multiplication of matrix a and b is:");
//System.out.println("matrix a:");
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
c[i][j]=0;
for(k=0;k<3;k++)
{
c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
}
}
}
for(i=0;i<3;i++)
{
for(j=0;j<3;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}