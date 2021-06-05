import java.util.*;
class addition
{
  public static void main(String args[])
   {
      int a=5,i,sum,n,c=0;
        
      Scanner input = new Scanner(System.in);
      System.out.println("enter the value of n");
      n = input.nextInt();
     
      sum=a+(n-1);
      System.out.println("sum="+sum);
           
       i=5;
      while(i<=sum)
       {
          c=c+i;
          i++;
       }  
       
       System.out.println("the ans is:"+c);
       
   }
}