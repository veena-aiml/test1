import java.util.Scanner;
class prime
{
public static void main(String args[])
{
int i,m=0,flag=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter n value:");
int n=sc.nextInt();
m=n/2;
if((n==0)||(n==1))
{
System.out.println(n+"is not prime");
}
else
{
for(i=2;i<m;i++)
{
if(n%i==0)
{
System.out.println(n+"is not prime");
flag=1;
break;
}
}
if(flag==0)
{
System.out.println(n+"is prime");
  System.out.println("it is correct answer");
}
}
}
}
