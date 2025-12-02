import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Task2D {

    // No. of elements & accesses
    private static final int ELEMENTS = 1_000_000;
    private static final int ACCESSES = 10_000;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>(ELEMENTS);
        List<Integer> linkedList = new LinkedList<>();

        // Fill lists with simple data
        fillList(arrayList);
        fillList(linkedList);

        // Use one Random for both tests
        Random random = new Random();

        // Measure time for ArrayList
        long arrayListTime = measureRandomAccessTime(arrayList, random);

        // Reset seed for fair comparison
        random = new Random();

        // Measure time for LinkedList
        long linkedListTime = measureRandomAccessTime(linkedList, random);

        // Print results
        System.out.println("Random access benchmark (" + ACCESSES + " reads):");
        System.out.println("ArrayList time:  " + arrayListTime + " ms");
        System.out.println("LinkedList time: " + linkedListTime + " ms");
    }

    // Fill list with ints
    private static void fillList(List<Integer> list) {
        for (int i = 0; i < ELEMENTS; i++) {
            list.add(i);
        }
    }

    // Measure time of ACCESSES random gets from the list
    private static long measureRandomAccessTime(List<Integer> list, Random random) {
        long start = System.currentTimeMillis();

        int sum = 0;
        for (int i = 0; i < ACCESSES; i++) {
            int index = random.nextInt(ELEMENTS); // random index
            sum += list.get(index);
        }
        int test = ELEMENTS;
        long end = System.currentTimeMillis();
        System.out.println("Checksum: " + sum);
        return end - start;
    }
}