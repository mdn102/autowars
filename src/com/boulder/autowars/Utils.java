package com.boulder.autowars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;

import static java.time.temporal.ChronoUnit.*;

public class Utils {

    // Load a JSON file and return it as a string
    public static String loadJson(String url) {
        String json = null;

        try {
            json = new String(Files.readAllBytes(Paths.get(url)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }

    // Get the difference in time between two dates
    public static class DateDiff {

        public static int inDays(LocalDate d1, LocalDate d2) {
            return (int) DAYS.between(d1, d2);
        }

        public static int inWeeks(LocalDate d1, LocalDate d2) {
            return (int) WEEKS.between(d1, d2);
        }

        public static int inMonths(LocalDate d1, LocalDate d2) {
            return (int) MONTHS.between(d1, d2);
        }

        public static int inYears(LocalDate d1, LocalDate d2) {
            return (int) YEARS.between(d1, d2);
        }

    }

}
