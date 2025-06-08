package thisAndsuper;

public class Person {
    String isim;
    int yas;

    public Person(String isim, int yas) {
        this.isim  = isim;
        this.yas = yas;
    }
    public void printInfo() {
        System.out.println("Ad: " + isim + ", Yaş: " + yas);
    }

}
