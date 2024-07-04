import java.io.*;

class M {
    void method() throws IOException {
        throw new IOException("device error");
    }

}

class exp {
    public static void main(String agrs[]) throws IOException {
        try {
            M m=new M();
       m.method();
            
        } catch (Exception e) {
            // TODO: handle exception
               
      // System.out.println("normal flow");
        }
        String s="    priyanka";
        System.out.println(s);

    }
}
