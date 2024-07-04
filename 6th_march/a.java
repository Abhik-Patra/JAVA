public class a {
    
public static void main(String args[]) {
    String originalStr = "Hello";
String reversedStr = "";

for (int i = 0; i < originalStr.length(); i++) {
  reversedStr = reversedStr + originalStr.charAt(i)  ;
}

System.out.println("Reversed string: "+ reversedStr);
}
}
