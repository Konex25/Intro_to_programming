import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Task2C {

    private static List<String> createWords() {
        List<String> words = new ArrayList<>(4);
        Collections.addAll(words, "This", "is", "simple", "sentence.");
        return words;
    }

    // Concatenates all words into a single sentence with spaces
    private static String buildSentence(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.size(); i++) {
            sb.append(words.get(i));
            if (i < words.size() - 1) {
                sb.append(" "); // add space between words
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        List<String> words = createWords(); // get the list of words
        String sentence = buildSentence(words);  // concatenate them
        System.out.println(sentence);            // print final sentence
    }

}
