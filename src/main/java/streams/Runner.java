package streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List< Integer > numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Sum of even numbers
        int sumOfEvens = numbers.stream()
                .filter(num -> num % 2 == 0)
                .reduce(0, Integer::sum);
        System.out.println(sumOfEvens);

        int sumOfOdds = numbers.stream()
                .filter(num -> num % 2 == 1)
                .reduce(0, Integer::sum);

        System.out.println(sumOfOdds);

        double avg = numbers.stream()
                .mapToDouble(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(avg);

        int min = numbers.stream()
                .min(Comparator.comparingInt(a -> a))
                .orElse(0);

        System.out.println(min);

        int max = numbers.stream()
                .max((a , b) -> b - a)
                .orElse(0);

        System.out.println(max);

    }

}
