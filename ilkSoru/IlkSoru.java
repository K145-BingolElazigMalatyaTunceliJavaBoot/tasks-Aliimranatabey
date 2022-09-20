package ilkSoru;

import java.util.Scanner;

public class IlkSoru {
    public static void main(String[] args) {
        Scanner grs = new Scanner(System.in);
        System.out.println("NOTUNUZU GİRİNİZ : ");
        int not = grs.nextInt();
        if (0 <= not && not < 35) {
            System.out.println("FF");
        } else if (35 <= not && not < 50) {
            System.out.println("DC");
        } else if (50 <= not && not < 70) {
            System.out.println("BB");
        } else if (70 <= not && not <= 100) {
            System.out.println("AA");
        } else {
            System.out.println("Geçersiz Not Girişi !");
        }
    }
}
