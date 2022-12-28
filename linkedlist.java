/*~Write a program on LinkedList and implement following tasks
• Add objects
• Add objects at specific location
• Remove by value
• Return the size of LinkedList
*/

import java.util.LinkedList;

public class chit14A {
    public static void main(String[] args) {
        // Create a new LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Add objects to the LinkedList
        list.add("apple");
        list.add("banana");
        list.add("orange");

        // Add an object at a specific location
        list.add(1, "grapes");

        // Remove an object by value
        list.remove("banana");

        // Return the size of the LinkedList
        int size = list.size();
        System.out.println("Size of LinkedList: " + size);
    }
}
