import java.util.Scanner;
class two_D
{  
    int l,b;  
   }  
   class three_D extends two_D
   {  
    int h;
   }  

   

    public class p1
    {
    
    public static void main(String args[]){  
      three_D t=new three_D();  
      Scanner sc=new Scanner(System.in);
      System.out.println("enter l,b,h: ");
      t.l=sc.nextInt();
      t.b=sc.nextInt();
      t.h=sc.nextInt();
      int cost_per_sqFt=40*(t.l*t.b);
      int cost_per_cubic=60*(t.l*t.b*t.h);
      System.out.println("cost of plastic sheet is Rs "+cost_per_sqFt);
      System.out.println("cost of plastic box is Rs "+cost_per_cubic);

   }  
   }