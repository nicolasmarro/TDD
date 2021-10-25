import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FizzBuzzTest {

    @Test
    void fizzBuzz_Given1_ShouldBe1() {
        String result = FizzBuzz.fizzBuzz(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    void fizzBuzz_GivenMultiple5_ShouldBeFizz() {
        String result = fb.fizzBuzz(25);
        Assertions.assertEquals("Fizz", result);
    }

    @Test
    void fizzBuzz_GivenMultiple7_ShouldBeBuzz() {
        String result = fb.fizzBuzz(21);
        Assertions.assertEquals("Buzz", result);
    }

    @Test
    void fizzBuzz_GivenMultiple5and7_ShouldBeFizzBuzz() {
        String result = fb.fizzBuzz(35);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void fizzBuzz_GivenNegativeNumber_ShouldBeThrowIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> fb.fizzBuzz(-1));
    }

    @Test
    void fizzBuzz_GivenNumberContains66_ShouldBeFizzBuzz() {
        String result = fb.fizzBuzz(5669);
        Assertions.assertEquals("FizzBuzz", result);
    }

    @Test
    void generate_Given3And4_ShouldReturn34Fizz6() {
        List<String> result = fb.generate(3, 4);
        Assertions.assertEquals(List.of("3", "4", "Fizz", "6"), result);
    }
}
