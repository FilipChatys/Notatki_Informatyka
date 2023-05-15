import java.util.*;
public class BrudnopisNaProgramy {

    public static String[] uniqueNames(String[] array1, String[] array2) {
        Set<String> uniqueNamesSet = new HashSet<>();

        // Add all names from array1 to the set
        for (String name : array1) {
            uniqueNamesSet.add(name);
        }

        // Add all names from array2 to the set
        for (String name : array2) {
            uniqueNamesSet.add(name);
        }

        // Convert the set back to an array
        String[] uniqueNamesArray = new String[uniqueNamesSet.size()];
        uniqueNamesSet.toArray(uniqueNamesArray);

        return uniqueNamesArray;
    }

    public static void main(String[] args) {
        String[] array1 = {"John", "Mary", "Alice"};
        String[] array2 = {"Bob", "Mary", "Alice"};

        String[] uniqueNamesArray = uniqueNames(array1, array2);

        // Print the unique names
        for (String name : uniqueNamesArray) {
            System.out.println(name);
        }
    }
}