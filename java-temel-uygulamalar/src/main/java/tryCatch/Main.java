package tryCatch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        try {
            int sonuc = sayi1 / sayi2;
            System.out.println("Sonuç: " + sonuc);
        } catch (ArithmeticException e) {
            System.out.println("Hata: Sıfıra bölme yapılamaz");
        }

    }
}
