package Overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        int sonuc1 = calc.add(4, 5);
        int sonuc2 = calc.add(1, 2, 3);

        System.out.println(sonuc1);
        System.out.println( sonuc2);
    }
}
