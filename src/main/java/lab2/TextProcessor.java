package lab2;

import java.util.Arrays;

public class TextProcessor {
    private String text;

    public TextProcessor(String text) {
        this.text = text;
    }

    public String[] getUniqueWordsSorted() {
        String[] words = this.text.split("[.,—;!\\sі]+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        String[] temp = new String[words.length];
        int count = 0;
        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equalsIgnoreCase(words[i - 1])) {
                temp[count] = words[i];
                count++;
            }
        }
        return Arrays.copyOf(temp, count);
    }
    public void printWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }
}
