package Car;

public class Main {
    public static void main(String[] args) {
        Car araba = new Car();

        araba.setBrand("T");
        araba.setModel("H");
        araba.setYear(5);

        System.out.println("Marka: " + araba.getBrand());
        System.out.println("Model: " + araba.getModel());
        System.out.println("Yıl: " + araba.getYear());

    }
}


