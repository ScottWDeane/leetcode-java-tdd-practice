package tdd;

import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class MinutesBetweenTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    }

    @Test
    public void whenCalledWithString_shouldReturnInteger() {
        assertTrue(MinutesBetweenTwoTimes.calcDifference("anyString") instanceof Integer);
    }
}
