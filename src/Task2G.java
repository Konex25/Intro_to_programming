import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Task2G {

    private static final int ELEMENTS = 1_000_000;
    private static final int DELETES = 10_000;

    public static void main(String[] args) {

        // Create lists
        List<Integer> arrayList = createArrayList();
        List<Integer> linkedList = createLinkedList();

        // Measure time for ArrayList
        long arrayListTime = measureDeleteFromBeginning(arrayList);

        // Measure time for LinkedList
        long linkedListTime = measureDeleteFromBeginning(linkedList);

        // Print results
        System.out.println("Delete from beginning (" + DELETES + " deletes):");
        System.out.println("ArrayList time:  " + arrayListTime + " ms");
        System.out.println("LinkedList time: " + linkedListTime + " ms");
    }

    // Fill ArrayList with integers
    private static List<Integer> createArrayList() {
        List<Integer> list = new ArrayList<>(ELEMENTS);
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
        return list;
    }

    // Fill LinkedList with integers
    private static List<Integer> createLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
        return list;
    }

    // Measure deleting from index 0
    private static long measureDeleteFromBeginning(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < DELETES; i++) {
            list.remove(0); // remove first element
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}