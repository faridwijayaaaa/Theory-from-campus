package PengaturanWaktu;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class CobaLocalDate {
    public static void Info(LocalDate LD) {
        int A1 = LD.getDayOfMonth(); // Hari keberapa di sebulan
        String A2 = LD.getDayOfWeek().toString(); //
        int A3 = LD.getDayOfYear(); // Hari ke berapa dari setahun
        String A4 = LD.getMonth().toString(); //
        int A5 = LD.getMonthValue();
        int A6 = LD.getYear();

        System.out.println("Day Of Month    : " + A1);
        System.out.println("Day Of Week     : " + A2);
        System.out.println("Day Of Year     : " + A3);
        System.out.println("Month (num)     : " + A4 + " (" + A5 + ")");
        System.out.println("Year            : " + A6);
        System.out.println("Kabisat         : " + LD.isLeapYear());
    }

    public static void main(String[] args) {
        LocalDate LD1, LD2, LD3, LD4, LD_Max, LD_Min;
        LD1 = LocalDate.now();
        LD2 = LocalDate.of(2002, Month.SEPTEMBER, 17);
        LD3 = LocalDate.of(2005, 9, 17);
        LD4 = LocalDate.parse("2011-09-17");

        // Membandingkan tanggal dengan keadaan -1 Jika A<B, 0 Jika A=B, 1 Jika A>B
        LD_Max = LD1;
        if (LD_Max.isAfter(LD2))
            LD_Max = LD2;
        if (LD_Max.isAfter(LD3))
            LD_Max = LD3;
        if (LD_Max.isAfter(LD4))
            LD_Max = LD4;
        System.out.println("Tanggal Tertua : " + LD_Max);
        System.out.println("Info tanggal Tertua :");
        Info(LD_Max);
        System.out.println();

        LD_Min = LD1;
        if (LD_Min.isBefore(LD2))
            LD_Min = LD2;
        if (LD_Min.isBefore(LD3))
            LD_Min = LD3;
        if (LD_Min.isBefore(LD4))
            LD_Min = LD4;
        System.out.println("Tanggal Termuda : " + LD_Min);
        System.out.println("Info tanggal Termuda :");
        Info(LD_Min);

        System.out.println("Seratus hari lagi tanggal " + LD1.plus(100, ChronoUnit.DAYS));
        System.out.println("Seratus hari yang lalu tanggal " + LD1.minus(100, ChronoUnit.DAYS));
    }
}