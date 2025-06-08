package wrapper;

public class Main {

    public static void main(String[] args) {
        int sayi = 42; // primitive
        Integer sayiWrapper = sayi;
        int sayiUnboxed = sayiWrapper;

        System.out.println("int değeri: " + sayi);
        System.out.println("Integer wrapper değeri: " + sayiWrapper);
        System.out.println("Unboxed int değeri: " + sayiUnboxed);
    }

}
