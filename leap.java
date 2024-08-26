import java.util.Scanner;
class leap
{
public static void main(String args[])
{
int year;
System.out.println("enter the year : ");
Scanner sc=new Scanner (System.in);
year=sc.nextInt();
if (((year%4==0)&&(year%100!=0))||(year%400==0))
System.out.println("leap year");
else
System.out.println("not leap year");
}
}
