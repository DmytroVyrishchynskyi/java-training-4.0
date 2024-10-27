import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

    /**
     * Finds the common elements between two arrays (String values).
     *
     * @param array1 first array
     * @param array2 second array
     * @return String array with common elements
     */
    public static String[] findCommon(String[] array1, String[] array2) {
        Set<String> set1 = new HashSet<>();
        Set<String> commonSet = new HashSet<>();

        // Add elements from the first array to set1
        for (String s : array1) {
            set1.add(s);
        }

        // Find common elements from the second array in set1 by checking elements
        for (String s : array2) {
            if (set1.contains(s)) {
                commonSet.add(s);
            }
        }

        // Convert the common set to an array and return
        return commonSet.toArray(new String[0]);
    }
}
