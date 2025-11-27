import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task2A {

    private static List<String> createNames() {
        List<String> names = new ArrayList<>(5); // preallocate capacity
        Collections.addAll(names, "Anna", "Kamil", "Ola", "Bartek", "Monika");
        return names;
    }

    // Prints names, removes one each cycle
    private static void printAndShrink(List<String> names) {
        while (!names.isEmpty()) {

            // Print all names using for-each loop
            for (String n : names) {
                System.out.println(n);
            }

            // Remove first name
            names.removeFirst();

            // Print empty line for output clarity
            System.out.println();
        }
    }

    public static void main(String[] args) {
        List<String> names = createNames();
        printAndShrink(names);
    }
}