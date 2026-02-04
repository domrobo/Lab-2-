package lab2;

import java.util.Arrays;

public class MainLab2 {
    public static void main(String[] args) {
        String text = "Програмування — це не лише написання коду. " +
                "Код має бути чистим, а написання коду приносити задоволення. " +
                "Справжнє програмування вимагає дисципліни, " +
                "адже дисципліна допомагає створювати якісний продукт. " +
                "Кожен продукт має свою мету, " +
                "і ця мета надихає нас працювати краще.";
        String[] words = getUniqueWordsSorted(text);
        printWords(words);
    }

    public static String[] getUniqueWordsSorted(String text) {
        String[] words = text.split("[.,\\sі—]+");
        Arrays.sort(words, String.CASE_INSENSITIVE_ORDER);

        String[] temp = new String[words.length];
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            if (i == 0 || !words[i].equalsIgnoreCase(words[i - 1])) {
                temp[count] = words[i];
                count++;
            }
        }

        String[] result = new String[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }

        return result;
    }
    public static void printWords(String[] words) {
        for (String word : words) {
            System.out.println(word);
        }
    }


}
