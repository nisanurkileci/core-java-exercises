package hashSet;

import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> meyveler = new HashSet<>();

        meyveler.add("elma");
        meyveler.add("elma");
        meyveler.add("muz");
        meyveler.add("kiraz");

        for (String meyve : meyveler) {
            System.out.println(meyve);
        }
    }


}
