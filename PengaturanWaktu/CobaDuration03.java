package PengaturanWaktu;

import java.time.LocalDateTime;
import java.time.Duration;
import java.time.Month;

public class CobaDuration03 {
    public static void cetak(LocalDateTime LT) {
        System.out.println(LT.getDayOfMonth() + " " + LT.getMonth() + " " + LT.getYear() + " " + LT.getHour() + ":"
                + LT.getMinute() + ":" + LT.getSecond());
    }

    public static void main(String[] args) {
        Duration D;
        LocalDateTime waktuAwal, waktuAkhir;

        waktuAwal = LocalDateTime.of(2021, Month.JANUARY, 1, 13, 30, 23);
        waktuAkhir = LocalDateTime.parse("2021-04-15T22:45:10");
        D = Duration.between(waktuAwal, waktuAkhir);

        System.out.print("Waktu Awal : ");
        cetak(waktuAwal);
        System.out.print("Waktu Akhir : ");
        cetak(waktuAkhir);

        System.out.println("Waktu yang diperlukan : " + D.toDays() + " Hari " + D.toHours() % 24 + ":"
                + D.toMinutes() % 60 + ":" + D.toSeconds() % 60);
    }
}
