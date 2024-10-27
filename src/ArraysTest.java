import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.Arrays;

import static org.testng.Assert.assertEquals;

public class ArraysTest {

    /**
     * Test data for common array elements.
     *
     * @return test data array
     */
    @DataProvider(name = "ArrayUtil")
    public static Object[][] arrays() {
        return new Object[][]{
                {
                        new String[]{"Python", "JAVA", "PHP", "C#", "C++", "SQL"},
                        new String[]{"MySQL", "SQL", "SQLite", "Oracle", "PostgreSQL", "DB2", "JAVA"},
                        new String[]{"JAVA", "SQL"}
                },
                {
                        new String[]{"here", "is", "some", "text", ".", "text"},
                        new String[]{"some", "text", "above", "."},
                        new String[]{"some", "text", "."}
                },
                {
                        new String[]{"apple", "banana", "cherry"},
                        new String[]{"cherry", "date", "apple", "fig"},
                        new String[]{"apple", "cherry"}
                },
                {
                        new String[]{"car", "bike", "bus"},
                        new String[]{"train", "plane", "boat"},
                        new String[]{}
                }
        };
    }

    @Test(dataProvider = "ArrayUtil")
    public void testFindCommon(String[] array1, String[] array2, String[] expectedResult) {
        String[] actualResult = ArrayUtil.findCommon(array1, array2);
        Arrays.sort(actualResult);  // Sorting both arrays to ignore order in comparisons
        Arrays.sort(expectedResult);
        assertEquals(actualResult, expectedResult, "Common elements are not correct");
    }
}
