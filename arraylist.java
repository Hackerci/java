/*
Write a program on ArrayList and implement following tasks
• Add objects
• Add objects at specific location
• Remove by value
• Check if the array is empty
*/
import java.util.ArrayList;

public class chit14B {
    public static void main(String[] args) {
        // Create a new ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Add objects to the ArrayList
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Add an object at a specific location
        list.add(1, "grapes");

        // Remove an object by value
        list.remove("banana");

        // Check if the ArrayList is empty
        boolean isEmpty = list.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);
    }
}
