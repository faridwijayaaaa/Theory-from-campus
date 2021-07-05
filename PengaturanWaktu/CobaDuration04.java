package PengaturanWaktu;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Duration;

public class CobaDuration04 {
    public static void main(String[] args) {
        Duration D1, D2;
        LocalDateTime waktuIni, waktuAwal, waktuAkhir;

        D1 = Duration.parse("P15DT13H20M45S");
        D2 = Duration.parse("P20DT5H15M");

        waktuIni = LocalDateTime.now();
        waktuAwal = (LocalDateTime) D1.subtractFrom(waktuIni);
        waktuAkhir = (LocalDateTime) D2.addTo(waktuIni);

        System.out.print("Waktu Saat ini : ");
        CobaDuration03.cetak(waktuIni);
        System.out.print("Waktu Awal : ");
        CobaDuration03.cetak(waktuAwal);
        System.out.print("Waktu Akhir : ");
        CobaDuration03.cetak(waktuAkhir);
    }
}
