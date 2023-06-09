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
    public void whenConvertTimeToMinutes_withNineAM_shouldReturnInt540() {
        assertTrue(MinutesBetweenTwoTimes.convertTimeToMinutes("9:00am") == 540);
    };

    @Test
    public void whenConvertTimeToMinutes_withNineThirtyAM_shouldReturnInt570() {
        assertTrue(MinutesBetweenTwoTimes.convertTimeToMinutes("9:30am") == 570);
    }

    @Test
    public void whenConvertTimeToMinutes_withThreeFifteenPM_shouldReturnInt915() {
        assertTrue(MinutesBetweenTwoTimes.convertTimeToMinutes("3:15pm") == 915);
    }

    @Test
    public void whenConvertTimeToMinutes_withElevenFiftyNinePM_shouldReturnInt1439() {
        assertTrue(MinutesBetweenTwoTimes.convertTimeToMinutes("11:59pm") == 1439);
    }

    @Test
    public void whenExtractSecondTime_withElevenAmToTwelvePm_shouldReturnString12PM() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.extractSecondTime("11:00am-12:00pm"),
                "12:00pm"));
    }


}
