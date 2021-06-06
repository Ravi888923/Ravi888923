import java.util.*;
class fibonaccinumber
{
  public static void main(String args[])
{
   int a,b,c,n,i;
   a=b=1;
   Scanner input = new Scanner(System.in);
   System.out.println("enter no up to which fibonacci number should be printe");
   n=input.nextInt();
   for(i=1;i<=n;i++)
   {
     System.out.println(""+a);
     c=a+b;
     a=b;
     b=c;
   }
 }
}