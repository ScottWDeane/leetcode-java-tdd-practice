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
        assertTrue(MinutesBetweenTwoTimes
                .calcDifferenceBetweenTimesRunner("anyString") instanceof Integer);
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

    @Test
    public void whenExtractSecondTime_withElevenThirtyAmToTwelveThirtyPm_shouldReturnStringTwelveThirtyPM() {
        assertTrue(StringUtils.equals(MinutesBetweenTwoTimes.extractSecondTime("11:30am-12:30pm"),
                "12:30pm"));
    }

    @Test
    public void whenSubtractMethod_withArguments_OneHundred_and_OneHundredAndFifty_shouldReturnFifty() {
        int firstTime = 100; // 1:40 AM
        int secondTime = 150; // 2:30 AM
        int expectedMinutesDifference = 50;
        assertTrue(MinutesBetweenTwoTimes.subtractTimes(firstTime,
                secondTime) == expectedMinutesDifference);
    }

    @Test
    public void whenSubtractMethod_withArguments_TwoHundredFiftyFive_and_SevenHundredThirty_shouldReturnFourHundredSeventyFive() {
        int firstTime = 255; // 4:15 AM
        int secondTime = 730; // 12:10 PM
        int expectedMinutesDifference = 475;
        assertTrue(MinutesBetweenTwoTimes.subtractTimes(firstTime,
                secondTime) == expectedMinutesDifference);
    }

    @Test
    public void whenRan_withTimesEightAMToThreeThirtyPM_shouldResultIn_FourHundredFifty() {
        String times = "8:00am-3:30pm";
        String firstTime = MinutesBetweenTwoTimes.extractFirstTime(times);
        String secondTime = MinutesBetweenTwoTimes.extractSecondTime(times);
        int firstTimeAsMinutes = MinutesBetweenTwoTimes.convertTimeToMinutes(firstTime);
        int secondTimeAsMinutes = MinutesBetweenTwoTimes.convertTimeToMinutes(secondTime);
        int expectedMinutesDifference = 450;
        assertTrue(MinutesBetweenTwoTimes.subtractTimes(firstTimeAsMinutes,
                secondTimeAsMinutes) == expectedMinutesDifference);
    }

    @Test
    public void whenRan_withTimesNinePMToSixThirtyAM_shouldResultIn_FiveHundredSeventy() {
        String times = "9:00pm-6:30am";
        String firstTime = MinutesBetweenTwoTimes.extractFirstTime(times);
        String secondTime = MinutesBetweenTwoTimes.extractSecondTime(times);
        int firstTimeAsMinutes = MinutesBetweenTwoTimes.convertTimeToMinutes(firstTime);
        int secondTimeAsMinutes = MinutesBetweenTwoTimes.convertTimeToMinutes(secondTime);
        int expectedMinutesDifference = 570;
        assertTrue(MinutesBetweenTwoTimes.subtractTimes(firstTimeAsMinutes,
                secondTimeAsMinutes) == expectedMinutesDifference);
    }

}
