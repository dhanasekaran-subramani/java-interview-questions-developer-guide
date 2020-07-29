package com.ds2.tutorials;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

/**
 * Java Program to demonstrate how to use LocalDate, LocalTime, and * LocalDateTime in Java 8.
 */
public class LocalDateTimeDemo {

    public static void main(String[] args) {
        // Formatting dates in Java 8
        LocalDateTime now = LocalDateTime.now();
        // Example 1 - print date as 2016-06-16 (yyyy-MM-dd)
        String isoDate = now.format(DateTimeFormatter.ISO_DATE);
        System.out.println("ISO date format: " + isoDate);
        // Example 2 - print date as 20160616 (yyyyMMdd)
        String basicIsoDate = now.format(DateTimeFormatter.BASIC_ISO_DATE);
        System.out.println("Basic ISO date format: " + basicIsoDate);
        // Example 3 - formatting date in British or Indian date format dd-MM-yyyy
        String indianDateFormat = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("formatting in Indian date format: " + indianDateFormat);
        // Example 4 - formatting date in USA date format (06-16-2016)
        DateTimeFormatter americanDateFormat = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String americanDate = now.format(americanDateFormat);
        System.out.println("USA date format : " + americanDate);
        // Example 5 - formatting in Japanese date format (16-06-16)
        DateTimeFormatter japan = DateTimeFormatter.ofPattern("yy-MM-dd");
        String japanese = now.format(japan);
        System.out.println("Date in Japan dateformat : " + japanese);
        // Example 6 - format in ISO date time format
        String isoDateTime = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println("Date in ISO date time format: " + isoDateTime);
        // Example 7 - french date formatting 16. juin 2016
        DateTimeFormatter french = DateTimeFormatter.ofPattern("d. MMMM yyyy", new Locale("fr"));
        String frenchDate = now.format(french);
        System.out.println("Date in french format: " + frenchDate);
        // Example 8 - using short german date/time formatting (06.16.16 12:07)
        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT).withLocale(new Locale("de"));
        String germanDateTime = now.format(formatter);
        System.out.println("Date in short german format : " + germanDateTime);
        // Example 9 - formatting time in ISO_TIME format
        String isoTime = now.format(DateTimeFormatter.ISO_TIME);
        System.out.println("time in ISO TIME format : " + isoTime);
        // Example 10 - printing date in long format e.g. 16th June 2016
        String longFormat = now.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy"));
        System.out.println("date in long format : " + longFormat);
        // Example 11 - formatting date with timezone
        ZonedDateTime dateWithTimeZone = ZonedDateTime.of(now, ZoneId.of("Europe/London"));
        String withTimeZone = dateWithTimeZone.format(DateTimeFormatter.ISO_ZONED_DATE_TIME);
        System.out.println("date time with timezone : " + withTimeZone);
        // Parsing text to Date in Java 8
        LocalDate fromIsoDate = LocalDate.parse("2015-02-23");
        LocalDate fromCustomPattern = LocalDate.parse("20-03-2017", DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate invalidDate = LocalDate.parse("16-02-2018");
        // parsing text to LocalTime in Java 8
        LocalTime fromIsoTime = LocalTime.parse("12:07:43.048");
        LocalTime fromPattern = LocalTime.parse("11:06:32", DateTimeFormatter.ofPattern("HH:mm:ss"));
        // converting String LocalDateTime andZonedDateTime in Java 8
        LocalDateTime fromIsoDateTime = LocalDateTime.parse("2016-06-16T13:12:38.954");
        ZonedDateTime fromIsoZonedDateTime = ZonedDateTime.parse("2016-06-16T13:12:38.954+01:00[Europe/London]");
    }
}


