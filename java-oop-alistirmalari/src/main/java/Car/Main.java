package Car;

public class Main {

    public static void main(String[] args) {
        Vehicle arac = new Vehicle();
        arac.start();

        Car araba = new Car();
        araba.speed = 120;
        System.out.println("Hız:" + araba.speed + " km/s");
        araba.start();
      /*  araba.setBrand("T");
        araba.setModel("H");
        araba.setYear(5);

        System.out.println("Marka: " + araba.getBrand());
        System.out.println("Model: " + araba.getModel());
        System.out.println("Yıl: " + araba.getYear());
      */
    }
}
