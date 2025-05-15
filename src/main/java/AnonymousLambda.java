// Java program to demonstrate the use of lambda expressions
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AnonymousLambda {

   public static void main(String[] args) {

        // List<Integer> list = Arrays.asList(4,2,3,1,5);

        // Collections.sort(list, new java.util.Comparator<Integer>() {
        //     @Override
        //     public int compare(Integer a, Integer b) {
        //         return a - b;
        //     }
        // });

        // System.out.println(list);

        // Collections.sort(list,(a,b)->a-b);
        // System.out.println(list);

        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread is running using an anonymous class!");
            }
        });

        thread.start();

        Thread thread2 = new Thread(() -> System.out.println("Thread is running using a lambda expression!"));
        thread2.start();

    }
   
        
    
}
