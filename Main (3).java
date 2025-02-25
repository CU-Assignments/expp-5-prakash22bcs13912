import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> numberStrings = new ArrayList<>();
        numberStrings.add("10");
        numberStrings.add("20");
        numberStrings.add("30");

        List<Integer> numbers = new ArrayList<>();
        for (String numStr : numberStrings) {
            numbers.add(Integer.parseInt(numStr)); // Parsing string to Integer (autoboxing)
        }

        int sum = 0;
        for (int num : numbers) {
            sum += num; // Unboxing Integer to int
        }

        System.out.println("Sum of integers: " + sum);
    }
}
