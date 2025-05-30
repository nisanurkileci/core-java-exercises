package car;

public class Main {
    public static void main(String[] args) {
        Car araba = new Car();

        araba.marka = "Mercedes";
        araba.model = "G63";
        araba.yil = 2025;

        System.out.println("Marka: " + araba.marka);
        System.out.println("Model: " + araba.model);
        System.out.println("Yıl: " + araba.yil);
    }
}
