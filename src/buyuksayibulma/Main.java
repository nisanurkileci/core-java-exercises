package buyuksayibulma;
import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("1. sayıyı girin: ");
        int sayi1 = input.nextInt();

        System.out.print("2. sayıyı girin: ");
        int sayi2 = input.nextInt();

        System.out.print("3. sayıyı girin: ");
        int sayi3 = input.nextInt();

        int enBuyuk = sayi1;

        if (sayi2 > enBuyuk) {
            enBuyuk = sayi2;
        }
        if (sayi3 > enBuyuk) {
            enBuyuk = sayi3;
        }

        System.out.println("En büyük sayı: " + enBuyuk);
    }
}
