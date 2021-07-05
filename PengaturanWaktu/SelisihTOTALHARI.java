package PengaturanWaktu;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class SelisihTOTALHARI {
    public static void main(String[] args) {
        LocalDate Soekarno, Hatta;
        LocalDateTime DT1, DT2;
        Soekarno = LocalDate.parse("1901-06-01");
        Hatta = LocalDate.parse("1902-08-12");
        LocalTime LT = LocalTime.of(0, 0);
        DT1 = LocalDateTime.of(Soekarno, LT);
        DT2 = LocalDateTime.of(Hatta, LT);
        long p = Duration.between(DT1, DT2).toDays();
        System.out.println("Jarak Antara tanggal Kemerdekaan dan tanggal Lahir Pancasila : " + p);

    }
}
