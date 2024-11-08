import java.util.Arrays;

public class StreamTask {

    public static int getSumSquareEven(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 == 0)     // Filter only even numbers
                .map(n -> n * n)            // Square each even number
                .sum();                     // Sum all of squared values
    }

    public static int[] getSortedOddsArray(int[] numbers) {
        return Arrays.stream(numbers)
                .filter(n -> n % 2 != 0)    // Filter only odd numbers
                .sorted()                   // Sort in ascending order
                .toArray();                 // Convert to int array
    }
}
