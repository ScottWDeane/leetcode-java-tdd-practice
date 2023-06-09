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

    public static String convertToEUTime(String americanTime) {
        String convertedTime = americanTime.substring(0, americanTime.length() - 2);
        if (StringUtils.equalsIgnoreCase(americanTime.substring(americanTime.length() - 2), "pm")) {
            int originalTimeHourAsInt =
                    Integer.parseInt(americanTime.substring(0, americanTime.indexOf(":")));
            String originalTimeMinutesAsString = americanTime
                    .substring(americanTime.indexOf(":") + 1, americanTime.length() - 2);
            convertedTime = Integer.toString(originalTimeHourAsInt + 12) + ":"
                    + originalTimeMinutesAsString;
            return convertedTime;
        } else if (StringUtils.equalsIgnoreCase(americanTime.substring(americanTime.length() - 2),
                "am")) {
            return convertedTime;
        }
        return "15:00";
    }

}
