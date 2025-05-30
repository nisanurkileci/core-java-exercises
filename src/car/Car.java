package car;

public class Car {
    String marka;
    String model;
    int yil;


    public Car(String markaA, String modelA, int yilA) {
        marka = markaA;
        model = modelA;
        yil = yilA;
    }

    public void arababilgileri() {
        System.out.println("Marka: " + marka);
        System.out.println("Model: " + model);
        System.out.println("Yıl: " + yil);
    }
}
