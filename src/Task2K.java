public class Task2K {

    public static void main(String[] args) {
        int[] nums = {4, 9, 1, 7, 3, 9, 8};

        int second = findSecondLargest(nums);
        System.out.println("Second largest: " + second);
    }

    // Find second largest number in array
    private static int findSecondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int n : arr) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n > second && n != max) {
                second = n;
            }
        }

        return second;
    }
}