import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzz {
    private int number;

    public FizzBuzz() {
    }

    public String fizzBuzz(int nb) throws IllegalArgumentException {

        if (String.valueOf(nb).contains("66") || (isMultipleOf5(nb) && isMultipleOf7(nb))) {
            return "FizzBuzz";
        }
        else if (isMultipleOf5(nb)) {
            return "Fizz";
        }
        else if (isMultipleOf7(nb)) {
            return "Buzz";
        }
        else if (isNegative(nb)) {
            throw new IllegalArgumentException("Nombre négatif");
        }
        else {
            return String.valueOf(nb);
        }
    }

    public List<String> generate(int start, int numberToGenerate) {
        return IntStream.range(start, start + numberToGenerate)
                .mapToObj(nb -> fizzBuzz(nb))
                .collect(Collectors.toUnmodifiableList());

        /*autre possibilité
        List<String> result = new ArrayList<>();
        for(int i = start; i<start+numberToGenerate; i++) {
            result.add(fizzBuzz(i));
        }
        return result;*/
    }

    private boolean isMultipleOf5(int nb) {
        return nb % 5 == 0;
    }

    private boolean isMultipleOf7(int nb) {
        return nb % 7 == 0;
    }

    private boolean isNegative(int nb) {
        return nb < 0;
    }

    public static void main(String[] args) {
        FizzBuzz fizzBuzz = new FizzBuzz();
        System.out.println(fizzBuzz.fizzBuzz(35));
    }
}
