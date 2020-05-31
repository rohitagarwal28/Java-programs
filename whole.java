import java.util.*;
class exam
{
public
int sub1;
int sub2;
int sub3;
 int sub4;
int total=0;
float avg;
Scanner sc=new Scanner(System.in);
void input()
{
System.out.println("Enter marks ");
sub1=sc.nextInt();
sub2=sc.nextInt();
sub3=sc.nextInt();
sub4=sc.nextInt();
 total=(sub1+sub2+sub3+sub4);
avg=(float)total/4;
}
void output()
{
System.out.println("total marks of students "+total);
System.out.println("average marks of students "+avg);
}
}

class result extends exam
{
public
int student_id;
Scanner sc=new Scanner(System.in);
void getinput()
{
System.out.println("enter the student_id");
student_id=sc.nextInt();
}
void putoutput()
{
System.out.println("student_id is"+student_id);
if (avg>=90)
{
System.out.println("the grade is first");
}
else if(avg<90 && avg>=70)
{
System.out.println("the grade is second");
}
else
{
System.out.println("fail");
}
}
}

class whole
{
public static void main(String args[])
{
result r=new result();
r.input();
r.getinput();
r.putoutput();
r.output();
}
}
