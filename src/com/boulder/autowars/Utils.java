package com.boulder.autowars;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.util.Date;

import static java.time.temporal.ChronoUnit.DAYS;

public class Utils {

    public static String loadJson(String url) {
        String json = null;

        try {
            json = new String(Files.readAllBytes(Paths.get(url)));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return json;
    }

    public static class DateDiff {

        public static int inDays(LocalDate d1, LocalDate d2) {

            Period period = Period.between(d1, d2);
            int diff = (int) DAYS.between(d1, d2);
            System.out.println(diff);
            return diff;
        }

    }

}
