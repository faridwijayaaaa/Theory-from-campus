package PengaturanWaktu;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CobaLocalDateTime {
    public static void info(LocalDateTime DT) {
        int A1, A2, A3, A4, A5, A6, A7, A8;
        String S1, S2;

        A1 = DT.getDayOfMonth();
        S1 = DT.getDayOfWeek().toString();
        A2 = DT.getDayOfYear();
        S2 = DT.getMonth().toString();
        A3 = DT.getMonthValue();
        A4 = DT.getYear();
        A5 = DT.getHour();
        A6 = DT.getMinute();
        A7 = DT.getSecond();
        A8 = DT.getNano();

        System.out.println("Day OF Month : " + A1);
        System.out.println("Day OF Week : " + S1);
        System.out.println("Day OF Year : " + A2);
        System.out.println("Month (num)  : " + S2 + " ( " + A3 + " )");
        System.out.println("Year        : " + A4);
        System.out.println("Hour        : " + A5);
        System.out.println("Minutes     : " + A6);
        System.out.println("Seconds     : " + A7);
        System.out.println("Nano S      : " + A8);
    }

    public static void main(String[] args) {
        LocalDateTime DT1, DT2, DT3, DT4, DT5, DT_Max, DT_Min;
        LocalDate LD = LocalDate.parse("2014-06-01");
        LocalTime LT = LocalTime.parse("06:30:05");
        DT1 = LocalDateTime.now();
        DT2 = LocalDateTime.of(2010, Month.OCTOBER, 20, 12, 30, 55);
        DT3 = LocalDateTime.of(2008, 8, 20, 10, 45);
        DT4 = LocalDateTime.parse("2017-03-01T10:10:30");
        DT5 = LocalDateTime.of(LD, LT);

        DT_Max = DT1;
        if (DT_Max.compareTo(DT2) > 0)
            DT_Max = DT2;
        if (DT_Max.compareTo(DT3) > 0)
            DT_Max = DT3;
        if (DT_Max.compareTo(DT4) > 0)
            DT_Max = DT4;
        if (DT_Max.compareTo(DT5) > 0)
            DT_Max = DT5;
        System.out.println("Date Time TerAwal : " + DT_Max);
        info(DT_Max);
        System.out.println();

        DT_Min = DT1;
        if (DT_Min.isBefore(DT2))
            DT_Min = DT2;
        if (DT_Min.isBefore(DT3))
            DT_Min = DT3;
        if (DT_Min.isBefore(DT4))
            DT_Min = DT4;
        if (DT_Min.isBefore(DT5))
            DT_Min = DT5;
        System.out.println("Date Time TerAkhir : " + DT_Min);
        info(DT_Min);
        System.out.println();
        System.out.println("Seratus Hari Lagi : " + DT1.plus(100, ChronoUnit.DAYS));
        System.out.println("Seratus Hari yang Lalu : " + DT1.minusDays(100));
        System.out.println("Seratus Minutes lagi : " + DT1.plusMinutes(100));
        System.out.println("Seratus Minutes yang lalu : " + DT1.minus(100, ChronoUnit.MINUTES));
    }
}