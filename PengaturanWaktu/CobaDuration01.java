package PengaturanWaktu;

import java.time.Duration;
import java.time.LocalTime;

public class CobaDuration01 {
    public static void cetak(LocalTime LT) {
        System.out.println(LT.getHour() + ":" + LT.getMinute() + ":" + LT.getSecond());
    }

    public static void main(String[] args) {
        Duration D;
        LocalTime waktuAwal, waktuAkhir;

        waktuAwal = LocalTime.of(6, 0, 0);
        waktuAkhir = LocalTime.now();
        D = Duration.between(waktuAwal, waktuAkhir);

        System.out.print("Waktu awal : ");
        cetak(waktuAwal);
        System.out.print("Waktu akhir : ");
        cetak(waktuAkhir);
        System.out.println(
                "Waktu yang diperlukan adalah : " + D.toHours() + ":" + D.toMinutes() % 60 + ":" + D.toSeconds() % 60);
    }
}
