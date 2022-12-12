// For: src/test/java/FizzbuzzTest.java
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzbuzzTest {
    @Test
    void testGenerateNumberOne() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(1);
        assertEquals("1", result);
        // Note that in JUnit, the expected value comes first
        // This is called 'Yoda Conditions'.
    }


    @Test
    void testGenerateNumberTwo() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(2);
        assertEquals("2", result);
    }
    @Test
    void testGenerateThreeReturnsFizz() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(3);
        assertEquals("Fizz", result);
    }
    @Test
    void testGenerateFiveReturnsBuzz() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(5);
        assertEquals("Buzz", result);
    }
    @Test
    void testGenerateFifteenReturnsFizzBuzz() {
        Fizzbuzz subject = new Fizzbuzz();
        String result = subject.generate(15);
        assertEquals("FizzBuzz", result);
    }


}