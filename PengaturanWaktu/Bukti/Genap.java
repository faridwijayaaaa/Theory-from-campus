package PengaturanWaktu.Bukti;

import java.time.Duration;
import java.time.LocalTime;

public class Genap {
    public static void main(String[] args) {
        Duration D;
        LocalTime LT, waktu;
        D = Duration.ofSeconds(234);
        waktu = LocalTime.of(1, 0);

        // Cara ke satu cuk
        LT = (LocalTime) D.addTo(LocalTime.of(0, 0));
        int p = 1;
        while (LT.compareTo(waktu) < 0) {
            LT = (LocalTime) D.addTo(LT);
            if (LT.compareTo(waktu) > 0)
                break;
            p++;
        }
        System.out.println("Sepeda mengelilingi Lapangan " + p + " kali dalam waktu 1 jam");
        System.out.println();

        // Cara ke Dua cuk
        int putaran = waktu.toSecondOfDay() / 234;
        System.out.println("Sepeda mengelilingi Lapangan " + putaran + " kali dalam waktu 1 jam");
    }
}
