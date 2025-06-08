package arrayList;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> city = new ArrayList<>();

        city.add("İzmir");
        city.add("Ankara");
        city.add("İstanbul");

        for (String sehir : city) {
            System.out.println(sehir);
        }
    }

}
