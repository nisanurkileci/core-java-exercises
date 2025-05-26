package switchcase_kulanma;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("0-100 arasında bir not girin: ");
        int not = scanner.nextInt();

        if (not < 0 || not > 100) {
            System.out.println("Geçersiz not girdiniz.");
        } else {
            switch (not / 10) {
                case 10:
                case 9:
                    System.out.println("Harf notu: A");
                    break;
                case 8:
                    System.out.println("Harf notu: B");
                    break;
                case 7:
                    System.out.println("Harf notu: C");
                    break;
                case 6:
                    System.out.println("Harf notu: D");
                    break;
                default:
                    System.out.println("Harf notu: F");
            }
        }

        scanner.close();
    }
}
