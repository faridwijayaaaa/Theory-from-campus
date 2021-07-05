package PengaturanWaktu;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class CobaLocalTime {
    public static void info(LocalTime LT) {
        int A1, A2, A3, A4;
        A1 = LT.getHour();
        A2 = LT.getMinute();
        A3 = LT.getSecond();
        A4 = LT.getNano();

        System.out.println("Hour    : " + A1);
        System.out.println("Minute  : " + A2);
        System.out.println("Second  : " + A3);
        System.out.println("Nano S  : " + A4);
    }

    public static void main(String[] args) {
        LocalTime LT1, LT2, LT3, LT4, LT_Max, LT_Min;

        LT1 = LocalTime.now();
        LT2 = LocalTime.of(20, 21);
        LT3 = LocalTime.of(21, 18, 20);
        LT4 = LocalTime.parse("06:30:10");

        LT_Max = LT1;
        if (LT_Max.compareTo(LT2) > 0)
            LT_Max = LT2;
        if (LT_Max.compareTo(LT3) > 0)
            LT_Max = LT3;
        if (LT_Max.compareTo(LT4) > 0)
            LT_Max = LT4;
        System.out.println("Waktu terAwal : " + LT_Max);
        System.out.println("Info Waktu Terawal : ");
        info(LT_Max);
        System.out.println("");

        LT_Min = LT1;
        if (LT_Min.compareTo(LT2) < 0)
            LT_Min = LT2;
        if (LT_Min.compareTo(LT3) < 0)
            LT_Min = LT3;
        if (LT_Min.compareTo(LT4) < 0)
            LT_Min = LT4;
        System.out.println("Waktu terAkhir : " + LT_Min);
        System.out.println("Info Waktu Terakhir : ");
        info(LT_Min);

        System.out.println("\n100 Menit lagi Pukul : " + LT1.plus(100, ChronoUnit.MINUTES));
        System.out.println("60 Menit yang lalu Pukul : " + LT1.minus(60, ChronoUnit.MINUTES));

        // PRINT LocalTime Menurut dengan inisiasi Format diatas
    }
}
