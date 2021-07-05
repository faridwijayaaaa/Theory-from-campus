package PengaturanWaktu;

import java.time.LocalTime;
import java.time.Duration;

public class CobaDuration02 {
    public static void main(String[] args) {
        Duration D1, D2;
        LocalTime waktuIni, waktuAwal, waktuAkhir;

        D1 = Duration.parse("PT1H40M45S");
        D2 = Duration.parse("PT2H33M");

        waktuIni = LocalTime.now();
        waktuAwal = (LocalTime) D1.subtractFrom(waktuIni); // Waktu saat ini Dikurangi D1.
        waktuAkhir = (LocalTime) D2.addTo(waktuIni); // Waktu saat ini Ditambah D2.

        System.out.print("Waktu saat ini : ");
        CobaDuration01.cetak(waktuIni);
        System.out.print("Waktu awal : ");
        CobaDuration01.cetak(waktuAwal);
        System.out.print("Waktu akhir : ");
        CobaDuration01.cetak(waktuAkhir);
    }
}
