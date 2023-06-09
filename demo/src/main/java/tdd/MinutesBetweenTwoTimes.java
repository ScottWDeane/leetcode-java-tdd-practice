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

    public static String extractSecondTime(String times) {
        return "12:00pm";
    }

    public static int convertTimeToMinutes(String originalTime) {
        int totalMinutes = 0;
        // grab the hours
        int originalTimeHourAsInt =
                Integer.parseInt(originalTime.substring(0, originalTime.indexOf(":")));
        // if last two characters are "pm", then we need to add 12 to the original time
        if (StringUtils.equalsIgnoreCase(originalTime.substring(originalTime.length() - 2), "pm")) {
            totalMinutes = (originalTimeHourAsInt + 12) * 60;
        } else {
            totalMinutes = originalTimeHourAsInt * 60;
        }
        // grab the minutes
        int originalTimeMinutes = Integer.parseInt(
                originalTime.substring(originalTime.indexOf(":") + 1, originalTime.length() - 2));
        // add minutes to total minutes
        return totalMinutes + originalTimeMinutes;
    }

}
