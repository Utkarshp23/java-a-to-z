import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class ListInterface {

    

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        List<String> linkedList = new LinkedList<>();
        List<String> vector = new Vector<>();

        // String[] fruits = {"Apple", "Banana", "Orange", "Mango"};
        // for (String fruit : fruits) {
        //     arrayList.add(fruit);
        //     linkedList.add(fruit);
        //     vector.add(fruit);
        // }

        // // Print all lists
        // System.out.println("ArrayList: " + arrayList);
        // System.out.println("LinkedList: " + linkedList);
        // System.out.println("Vector: " + vector);

        // // Exercise 2: Insertion at Specific Index
        // System.out.println("\n=== Exercise 2: Insertion at Index 2 ===");
        // arrayList.add(2, "Grape");
        // linkedList.add(2, "Grape");
        // vector.add(2, "Grape");
        // System.out.println("ArrayList after insertion: " + arrayList);
        // System.out.println("LinkedList after insertion: " + linkedList);
        // System.out.println("Vector after insertion: " + vector);

        // System.out.println("\n=== Exercise 3: Removal at Index 2 ===");
        // arrayList.remove(2);
        // linkedList.remove("Grape");   
        // vector.remove(2);    
        // System.out.println("ArrayList after removal: " + arrayList);
        // System.out.println("LinkedList after removal: " + linkedList);
        // System.out.println("Vector after removal: " + vector);

        // // Exercise 5: Performance Comparison
        // System.out.println("\n=== Exercise 5: Performance Comparison ===");
        // int operations = 10000;
        // 

        // // Measure insertion at the beginning
        // long startTime = System.nanoTime();
        // for (int i = 0; i < operations; i++) {
        //     arrayList.add(0, "Test" + i);
        // }
        // long arrayListInsertTime = System.nanoTime() - startTime;

        // startTime = System.nanoTime();
        // for (int i = 0; i < operations; i++) {
        //     linkedList.add(0, "Test" + i);
        // }
        // long linkedListInsertTime = System.nanoTime() - startTime;

        // startTime = System.nanoTime();
        // for (int i = 0; i < operations; i++) {
        //     vector.add(0, "Test" + i);
        // }
        // long vectorInsertTime = System.nanoTime() - startTime;

        // System.out.printf("Insertion at beginning (%,d ops):\n", operations);
        // System.out.printf("ArrayList: %,d ns\n", arrayListInsertTime);
        // System.out.printf("LinkedList: %,d ns\n", linkedListInsertTime);
        // System.out.printf("Vector: %,d ns\n", vectorInsertTime);

        // Exercise 6: Thread-Safety with Vector
        System.out.println("\n=== Exercise 6: Thread-Safety with Vector ===");
        Vector<Integer> sharedVector = new Vector<>();
        Random random = new Random();
        Runnable addTask = () -> {
            for (int i = 0; i < 1000; i++) {
                sharedVector.add(random.nextInt(100));
            }
        };

        Thread t1 = new Thread(addTask);
        Thread t2 = new Thread(addTask);
        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Vector size after concurrent additions: " + sharedVector.size());
        
    }
}
