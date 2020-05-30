import java.util.Scanner;
public class search
{   
  int stud[]=new int[10];
  int i,n,flag=0;
  Scanner sc=new Scanner(System.in);
  void read()
   {
     System.out.println("enter the elements");
    
   for(i=0;i<10;i++)
      {
     stud[i]=sc.nextInt();
       }
   }
    void search()
  {
	System.out.println("enter the element to be found");
         n=sc.nextInt();
      for(i=0;i<=10;i++)
    { 
      if(stud[i]==n)    
       {
         flag=1;
	  break;
	}
	else
        flag=0;
}

	if(flag==1)
	System.out.println("no is found");
	if(flag==0)
	System.out.println("no is not found");
	}
	public static void main(String args[])
          {
             search sr=new search();
              sr.read();
	      sr.search();
}
}
     
    	
    	