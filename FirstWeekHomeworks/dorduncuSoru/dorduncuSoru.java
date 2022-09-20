package dorduncuSoru;

import java.util.Random;

public class dorduncuSoru {
    public static void main(String[] args) {
        Random random = new Random();
        int sayi = 0;
        int sayac = 0;
        while (sayi < 50 || sayi > 100) {
            sayi = random.nextInt(500);
            System.out.println(sayi);
            sayac++;
        }
        System.out.println(sayac + ".Seçimde bulunan random sayı : " + sayi);
    }
}
