package donguvetoplam;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir sayı girin: ");
        int n = input.nextInt();

        if (n <= 0) {
            System.out.println("Lütfen pozitif bir sayı girin.");
        } else {
            int toplam = 0;

            for (int i = 1; i <= n; i++) {
                toplam += i;
            }

            System.out.println("1'den " + n + "'e kadar olan sayıların toplamı: " + toplam);
        }
    }

}
