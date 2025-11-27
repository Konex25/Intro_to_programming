import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Task2B {

    // Reverse the list
    public static void reverseList(ArrayList<Integer> list) {
        for (int i = 0, j = list.size() - 1; i < j; i++, j--) {
            int tmp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, tmp);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter how many numbers you want to generate:");
        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int n = sc.nextInt();
        // Create the list that will store random numbers
        ArrayList<Integer> nums = new ArrayList<>();

        // Generate n random numbers from 1 to 10 and add them to the list
        for (int i = 0; i < n; i++) {
            nums.add(r.nextInt(10) + 1);
        }

        // Reverse the list
        reverseList(nums);
        // Print the reversed list
        System.out.println(nums);

        sc.close(); // Close scanner
    }
}