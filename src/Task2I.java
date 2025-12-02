public class Task2I {

    public static void main(String[] args) {
        String text = "Hello anybody who reads it!";
        int result = countVowels(text);

        System.out.println("Vowels count: " + result);
    }

    // Count vowels in a string
    private static int countVowels(String input) {
        int count = 0;
        String vowels = "aąeęiouóAĄEĘIOUÓ";

        for (char c : input.toCharArray()) {
            if (vowels.indexOf(c) != -1) { // check if vowel
                count++;
            }
        }

        return count;
    }
}