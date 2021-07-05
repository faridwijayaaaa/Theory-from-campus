package PengaturanWaktu;

import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class CobaYeatMonth {
    public static void Info(YearMonth YM) {
        int A1, A2, A3, A4;
        String S1;
        A1 = YM.getYear();
        S1 = YM.getMonth().toString();
        A2 = YM.getMonthValue();
        A3 = YM.lengthOfMonth();
        A4 = YM.lengthOfYear();

        System.out.println("Year            : " + A1);
        System.out.println("Month (num)     : " + S1 + "(" + A2 + ")");
        System.out.println("Length of Month : " + A3);
        System.out.println("Length of Year  : " + A4);
        System.out.println("Kabisat         : " + YM.isLeapYear());
    }

    public static void main(String[] args) {
        YearMonth YM1, YM2, YM3, YM4, YM_Max, YM_Min;
        Period p = Period.of(2, 3, 0);
        long jarak;

        YM1 = YearMonth.now();
        YM2 = YearMonth.of(2021, 3);
        YM3 = YearMonth.of(2018, Month.APRIL);
        YM4 = YearMonth.parse("2021-02");

        YM_Max = YM1;
        if (YM_Max.compareTo(YM2) > 0)
            YM_Max = YM2;
        if (YM_Max.compareTo(YM3) > 0)
            YM_Max = YM3;
        if (YM_Max.compareTo(YM4) > 0)
            YM_Max = YM4;
        System.out.println("Year Month terAwal : " + YM_Max);

        YM_Min = YM1;
        if (YM_Min.isBefore(YM2))
            YM_Min = YM2;
        if (YM_Min.isBefore(YM3))
            YM_Min = YM3;
        if (YM_Min.isBefore(YM4))
            YM_Min = YM4;
        System.out.println("Year Month terAkhir : " + YM_Min);

        System.out.println("Info Year Month terAkhir : ");
        Info(YM_Min);
        System.out.println("-----------------------------------");

        System.out.println("2 tahun lebih 3 bulan lagi, adalah " + YM1.plus(p));
        System.out.println("2 tahun lebih 3 bulan sebelum ini, adalah " + YM1.minus(p));
        System.out.println("10 Bulan lagi, adalah " + YM1.plus(10, ChronoUnit.MONTHS));
        System.out.println("10 Bulan sebelum ini, adalah " + YM1.minus(10, ChronoUnit.MONTHS));

        jarak = YM3.until(YM2, ChronoUnit.YEARS);
        long jarak2 = YM3.until(YM2, ChronoUnit.MONTHS);
        System.out.println("Rentang waktu YM2 dan YM3, adalah " + jarak + " Tahun " + jarak2 + " Bulan");
    }
}
