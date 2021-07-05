package PengaturanWaktu;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

public class CobaPeriod01 {
    public static void cetak(LocalDate LD) {
        System.out.println(LD.getDayOfMonth() + " " + LD.getMonth() + " " + LD.getYear());
    }

    public static void main(String[] args) {
        Period P;
        LocalDate hariIni, tglLahir;

        hariIni = LocalDate.now();
        tglLahir = LocalDate.of(2001, Month.SEPTEMBER, 17);
        P = Period.between(tglLahir, hariIni);

        System.out.print("Hari ini : ");
        cetak(hariIni);

        System.out.print("Tanggal Lahir : ");
        cetak(tglLahir);

        System.out.println(
                "Umur anda : " + P.getYears() + " Tahun + " + P.getMonths() + " Bulan + " + P.getDays() + " Hari");
    }
}