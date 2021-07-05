package PengaturanWaktu;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class CobaPeriod02 {
    public static void main(String[] args) {
        Period P1, P2;
        LocalDate hariIni, tglAwal, tglAkhir, x;

        hariIni = LocalDate.now();
        P1 = Period.parse("P1Y2M3D");
        P2 = Period.parse("P5M");
        x = hariIni.plus(7, ChronoUnit.DAYS);

        tglAwal = (LocalDate) P1.subtractFrom(hariIni);
        tglAkhir = (LocalDate) P2.addTo(hariIni);

        System.out.println(x);

        System.out.print("Hari ini : ");
        CobaPeriod01.cetak(hariIni);

        System.out.print("Tanggal Awal : ");
        CobaPeriod01.cetak(tglAwal);

        System.out.print("Tanggal Akhir : ");
        CobaPeriod01.cetak(tglAkhir);
    }
}
