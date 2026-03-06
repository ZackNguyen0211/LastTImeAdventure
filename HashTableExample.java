import java.util.HashMap;
import java.util.Map;

public class HashTableExample {

    public static void main(String[] args) {
        // Create a hash table to store roll numbers and student names
        Map<Integer, String> hashTable = new HashMap<>();

        // Insert roll numbers and names into the hash table
        hashTable.put(101, "Alice");
        hashTable.put(102, "Bob");
        hashTable.put(103, "Charlie");
        hashTable.put(104, "Diana");

        // Search for a name by roll number
        int searchRollNumber = 102;
        if (hashTable.containsKey(searchRollNumber)) {
            System.out.println("Student with roll number " + searchRollNumber + ": " + hashTable.get(searchRollNumber));
        } else {
            System.out.println("Student with roll number " + searchRollNumber + " not found.");
        }
    }
}