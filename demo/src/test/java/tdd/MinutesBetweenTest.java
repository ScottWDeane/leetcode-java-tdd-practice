package tdd;

import static org.junit.Assert.assertTrue;
import org.apache.commons.lang3.StringUtils;
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

    @Test
    public void whenExtractFirstTime_withTenAmToElevenAm_shouldExtractUpToFirstCharacters() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.extractFirstTime("10:00am-11:00am"),
                "10:00am"));
    }

    @Test
    public void whenExtractFirstTime_withElevenAmToTwelvePm_shouldExtractUpToFirstCharacters() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.extractFirstTime("11:00am-12:00pm"),
                "11:00am"));
    }

}
