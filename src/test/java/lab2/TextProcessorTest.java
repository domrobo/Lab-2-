package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    void testGetUniqueWordsSorted_Basic() {
        String input = "яблуко Груша яблуко";
        TextProcessor processor = new TextProcessor(input);

        String[] expected = {"Груша", "яблуко"};
        assertArrayEquals(expected, processor.getUniqueWordsSorted(),
                "Має повертати унікальні слова з сортуванням без урахування регістру");
    }

    @Test
    void testGetUniqueWordsSorted_Punctuation() {
        String input = "код, код; код — код!";
        TextProcessor processor = new TextProcessor(input);

        String[] expected = {"код"};
        assertArrayEquals(expected, processor.getUniqueWordsSorted(),
                "Має ігнорувати розділові знаки");
    }

    @Test
    void testGetUniqueWordsSorted_Empty() {
        TextProcessor processor = new TextProcessor("");
        String[] result = processor.getUniqueWordsSorted();
        assertTrue(result.length == 0 || result[0].isEmpty(),
                "Має коректно обробляти пустий рядок");
    }
}