import java.util.Scanner;  
import java.util.Arrays; 
public class p1 {  
   
        }  
        
    }  
    
public static void main(String args[]){
int k;
Scanner sc=new Scanner(System.in);
for(int i=1;i<=5;i++)
{
System.out.println("employee "+i+" details-->");
System.out.print("enter basic pay: ");
int bp=sc.nextInt();
System.out.println("total earnings for employee "+i+" = "+(bp+0.8*bp+0.15*bp));
}
}
