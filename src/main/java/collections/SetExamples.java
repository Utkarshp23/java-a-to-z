package collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetExamples {

    public static void hashSetExamples() {
        // HashSet example
        HashSet<Integer> hasSet = new HashSet<>();
        hasSet.add(5);
        hasSet.add(10);  
        hasSet.add(15);
        hasSet.add(10);
        hasSet.add(20);

        System.out.println("HashSet: " + hasSet);
        System.out.println("contains 10: " + hasSet.contains(10));
    }

    public static void linkedHashSetExamples() {
        // LinkedHashSet example
        // LinkedHashSet maintains insertion order
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("apple");
        linkedHashSet.add("banana");
        linkedHashSet.add("cherry");
        linkedHashSet.add("banana"); // duplicate, will not be added
        linkedHashSet.add("date");

        // Print the LinkedHashSet
        //System.out.println("LinkedHashSet: " + linkedHashSet);

        //Iterate through the LinkedHashSet
        System.out.println("Iterating through LinkedHashSet:");
        for (String fruit : linkedHashSet) {
            System.out.println(fruit);
        }
    }

    public static void treeSetExamples() {
        // TreeSet example
        // TreeSet maintains natural ordering
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("kiwi");
        treeSet.add("grape");
        treeSet.add("fig");
        treeSet.add("orange");

        // Print the TreeSet
        System.out.println("TreeSet: " + treeSet);
    }

    public static void treeSetWithCustomComparator() {
        // TreeSet with custom comparator
        //TreeSet<String> treeSet = new TreeSet<>(Comparator.comparingInt(String:: length));  
        TreeSet<String> treeSet = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        });
        treeSet.add("kiwi");
        treeSet.add("grape");
        treeSet.add("fig");
        treeSet.add("orange");
        treeSet.add("a");

        System.out.println("TreeSet: " + treeSet);
    }
    public static void main(String[] args) {

        //hashSetExamples();

        //linkedHashSetExamples();

        //treeSetExamples();

        treeSetWithCustomComparator();
    }
}
