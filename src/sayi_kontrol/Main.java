package sayi_kontrol;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        if (sayi > 0) {
            System.out.println("Pozitif sayı");
        } else if (sayi < 0) {
            System.out.println("Negatif sayı");
        } else {
            System.out.println("Sayı sıfır");
        }
    }
}
