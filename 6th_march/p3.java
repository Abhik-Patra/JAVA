class shape{  
    double area;  

    void show_area(){}
}
   class circle extends shape
   {  
    int r=2;
    
   } 

   class rectangle extends shape
   {  
    int length=3,breadth=4; 
    
   } 
public class p3
{
 public static void main(String args[]){  
      circle c=new circle();  
      rectangle r=new rectangle(); 
      System.out.println("Area of circle is:"+ (c.r*2*3.1));  
      System.out.println("Area of rectangle is:"+ (r.length*r.breadth));  
   }  
   }