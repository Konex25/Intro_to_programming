import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2F {

    private static final int ELEMENTS = 1_000_000;
    private static final int INSERTS = 10_000;

    public static void main(String[] args) {

        // Create lists
        List<Integer> arrayList = createArrayList();
        List<Integer> linkedList = createLinkedList();

        // Measure time for ArrayList
        long arrayListTime = measureRandomInsert(arrayList);

        // Measure time for LinkedList
        long linkedListTime = measureRandomInsert(linkedList);

        // Print results
        System.out.println("Insert at random positions (" + INSERTS + " inserts):");
        System.out.println("ArrayList time:  " + arrayListTime + " ms");
        System.out.println("LinkedList time: " + linkedListTime + " ms");
    }

    // Fill ArrayList
    private static List<Integer> createArrayList() {
        List<Integer> list = new ArrayList<>(ELEMENTS);
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
        return list;
    }

    // Fill LinkedList
    private static List<Integer> createLinkedList() {
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
        return list;
    }

    // Measure inserting at random positions
    private static long measureRandomInsert(List<Integer> list) {
        Random random = new Random();
        long start = System.currentTimeMillis();

        for (int i = 0; i < INSERTS; i++) {
            int index = random.nextInt(list.size()); // random index
            list.add(index, -i); // insert element
        }

        long end = System.currentTimeMillis();
        return end - start;
    }
}