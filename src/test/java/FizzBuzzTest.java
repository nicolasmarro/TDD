import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FizzBuzzTest {

    @Test
    void fizzBuzz_Given1_ShouldBe1() {
        String result = FizzBuzz.fizzBuzz(1);
        Assertions.assertEquals("1", result);
    }

    @Test
    void fizzBuzz_Given2_ShouldBe2() {
        String result = FizzBuzz.fizzBuzz(2);
        Assertions.assertEquals("2", result);
    }

}
