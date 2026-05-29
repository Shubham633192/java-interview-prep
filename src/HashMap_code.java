import java.util.*;

public class HashMap_code {

    public static void main(String[] args) {

        HashMap<Integer, String> citycapital = new HashMap<>();

        citycapital.put(1, "Raj");
        citycapital.put(2, "Kavi");
        citycapital.put(3, "ravi");
        citycapital.put(4, "navi");

        for (int i : citycapital.keySet()) {
            System.out.println(i);

        }

        for (String i : citycapital.values()) {
            System.out.println(i);

        }

        for (int name : citycapital.keySet()) {
            System.out.println("Key " + name + "Values" + citycapital.get(name));
        }

        citycapital.containsKey(3);

        System.out.println(citycapital.containsKey(3));

    }
}
