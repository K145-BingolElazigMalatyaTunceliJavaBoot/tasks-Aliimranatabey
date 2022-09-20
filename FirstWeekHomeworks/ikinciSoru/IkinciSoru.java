package ikinciSoru;

public class IkinciSoru {
    public static void main(String[] args) {
        int toplam = 0;
        for (int sayi = 3; sayi <= 100; sayi++) {
            int kontrol = 0;
            for (int i = 2; i < sayi; i++) {
                if (sayi % i == 0) {
                    kontrol = 1;
                    break;
                }
            }

            if (kontrol == 0) {
                toplam = toplam + sayi;

            }
        }
        System.out.println("3 ile 100 arasında asal sayıların toplamı : " + toplam);
    }
}
