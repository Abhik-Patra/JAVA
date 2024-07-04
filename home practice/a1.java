
//package home practice;
import java.util.*;

public class a1 extends Exception {

    public static void main(String args[]) {
        int arr[] = { 1, 2, 3, 4 }, index, count_of_retries = 0;
        Scanner sc = new Scanner(System.in);
        while (true && count_of_retries < 5) {
            try {
                System.out.println("enter value of index");
                index = sc.nextInt();
                System.out.println("arr[" + index + "] value is " + arr[index]);
                if (index > 3)
                throw new ArrayIndexOutOfBoundsException();
                break;
            // } catch (a1 e) {
                
             }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Invalid index");
                count_of_retries++;
            }
        }
        if (count_of_retries == 5)
            System.out.println("error");
    }

    }
