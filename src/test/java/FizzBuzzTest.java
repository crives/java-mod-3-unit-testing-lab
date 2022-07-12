import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {
    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void fizzBuzzString() {
        String testString = "foe";
        String test = fizzBuzz.fizzBuzzString(testString);
        assertEquals("Fizz", test);

        String testString2 = "bob";
        String test2 = fizzBuzz.fizzBuzzString(testString2);
        assertEquals("Buzz", test2);

        String testString3 = "fob";
        String test3 = fizzBuzz.fizzBuzzString(testString3);
        assertEquals("FizzBuzz", test3);

        String testString4 = null;
        String test4 = fizzBuzz.fizzBuzzString(testString4);
        assertNull(test4);

        String testString5 = "hello";
        String test5 = fizzBuzz.fizzBuzzString(testString5);
        assertEquals("hello", test5);
    }
}