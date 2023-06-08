package tdd;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FizzBuzzTest {
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void whenFizzBuzzReceivesAnyInt_thenReturnAnyString() {
        assertTrue(FizzBuzz.calcFizzBuzz(0) instanceof String);
    }

    @Test
    public void whenInputIsIntThree_thenReturnStringFizz() {
        assertTrue(FizzBuzz.calcFizzBuzz(3) == "Fizz");
    }

    @Test
    public void whenInputIsFive_thenReturnStringBuzz() {
        assertTrue(FizzBuzz.calcFizzBuzz(5) == "Buzz");
    }

}
