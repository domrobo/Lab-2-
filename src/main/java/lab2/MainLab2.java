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
        TextProcessor processor = new TextProcessor(text);

        String[] words = processor.getUniqueWordsSorted();
        processor.printWords(words);
    }





}
