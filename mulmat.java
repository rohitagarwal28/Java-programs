import java.util.Scanner;
public class addmatrix
{
 public static void main(String args[])
 {
  int a[][]=new int[3][3];
  int b[][]=new int[3][3];
  int c[][]=new int[3][3];
  int i,j,k;
  Scanner sc=new Scanner(System.in);
  System.out.println("enter first array");
   for(i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
	{
          a[i][j]=sc.nextInt();
 	}
    }
for(i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
	{
          System.out.print("\t"+a[i][j]);
        }
       System.out.println();
    }	
System.out.println("enter second array");
   for(i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
	{
          b[i][j]=sc.nextInt();
 	}
    }
for(i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
	{
          System.out.print("\t"+b[i][j]);
        }
       System.out.println();
    }	
    System.out.println("sum of matrix=");
   for(i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
	{
	  for(k=0;k<3;k++)
           {
 	     
         c[i][j]=c[i][j]+a[i][k]*b[k][j];
 	}
    }
}

     for(i=0;i<3;i++)
    {
     for(j=0;j<3;j++)
	{
    System.out.print("\t"+c[i][j]);
}
System.out.println();
}
}
}