class Rectangle {
   int length = 2, breadth = 3;
}

class Box extends Rectangle {
   int height = 4;
}

class HollowBox extends Box {
   int thickness = 1;
}

public class p2 {
   public static void main(String args[]){  
       HollowBox h=new HollowBox();  
      System.out.println("area of rectangle:"+ (h.length*h.breadth));  
      System.out.println("volume of box:"+ (h.height*h.length*h.breadth));
      System.out.println("volume of hollow box:"+((h.thickness+h.height)*
      (h.thickness+h.breadth)*(h.thickness+h.length)-(h.height*h.length*h.breadth) ));  
   }
}