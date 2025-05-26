package scanner_kullanma;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İsminizi girin: ");
        String isim = scanner.nextLine();

        System.out.print("Yaşınızı girin: ");
        int yas = scanner.nextInt();

        System.out.println("Merhaba " + isim + ", yaşınız: " + yas);

        scanner.close();
    }
}
