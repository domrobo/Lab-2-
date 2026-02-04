package lab2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainLab2Test {

    @Test
    void testGetUniqueWordsSorted() {
        String input = "Код чистий, код гарний.";
        String[] expected = {"гарний", "Код", "чистий"};

        String[] result = MainLab2.getUniqueWordsSorted(input);

        assertArrayEquals(expected, result, "Слова мають бути відсортовані та без дублікатів");
    }

    @Test
    void testEmptyInput() {
        String[] result = MainLab2.getUniqueWordsSorted("");
        assertEquals(1, result.length);
    }
}