package tdd;

import static org.junit.Assert.assertTrue;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class MinutesBetweenTest {
    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(true);
    };

    @Test
    public void whenCalledWithString_shouldReturnInteger() {
        assertTrue(MinutesBetweenTwoTimes.calcDifference("anyString") instanceof Integer);
    };

    @Test
    public void whenExtractFirstTime_withTenAmToElevenAm_shouldExtractUpToFirstCharacters() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.extractFirstTime("10:00am-11:00am"),
                "10:00am"));
    };

    @Test
    public void whenExtractFirstTime_withElevenAmToTwelvePm_shouldReturnString11AM() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.extractFirstTime("11:00am-12:00pm"),
                "11:00am"));
    };

    @Test
    public void whenConvertToEUTime_withThreePM_shouldConvertToEUTimeFifteenOClock() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.convertToEUTime("3:00pm"), "15:00"));
    };

    @Test
    public void whenConvertToEUTime_withEightPM_shouldConvertToEUTimeTwentyOClock() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.convertToEUTime("8:00pm"), "20:00"));
    };

    @Test
    public void whenConvertToEUTime_withEightThirtyPM_shouldConvertToEUTimeTwentyThirtyOClock() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.convertToEUTime("8:30pm"), "20:30"));
    };

}
