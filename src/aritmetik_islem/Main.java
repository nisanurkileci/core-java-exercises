package aritmetik_islem;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Birinci sayıyı girin: ");
        double sayi1 = scanner.nextDouble();

        System.out.print("İkinci sayıyı girin: ");
        double sayi2 = scanner.nextDouble();

        double toplam = sayi1 + sayi2;
        double fark = sayi1 - sayi2;
        double carpim = sayi1 * sayi2;
        double bolum = sayi2 != 0 ? sayi1 / sayi2 : Double.NaN;

        System.out.println("Toplama: " + toplam);
        System.out.println("Çıkarma: " + fark);
        System.out.println("Çarpma: " + carpim);

        if (sayi2 != 0) {
            System.out.println("Bölme: " + bolum);
        } else {
            System.out.println("Bölme: Tanımsız (0'a bölme hatası)");
        }

        scanner.close();
    }

}
