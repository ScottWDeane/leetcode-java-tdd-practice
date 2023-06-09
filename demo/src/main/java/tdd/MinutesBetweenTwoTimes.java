package tdd;

import org.apache.commons.lang3.StringUtils;

public class MinutesBetweenTwoTimes {
    public static void main(String[] args) {

    }

    public static Integer calcDifference(String string) {
        return 1;
    }

    public static String extractFirstTime(String times) {
        int indexOfDash = times.indexOf("-");
        String firstTime = times.substring(0, indexOfDash);
        return firstTime;
    }

    public static int convertTimeToMinutes(String originalTime) {
        return 540;
    }

}
