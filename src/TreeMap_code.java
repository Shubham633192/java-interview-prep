import java.util.*;

public class TreeMap_code {
    public static void main(String[] args) {

        TreeMap<Integer, String> T1 = new TreeMap<>();
        T1.put(1, "Ravi");
        T1.put(5, "Karan");
        T1.put(4, "Arjun");
        T1.put(3, "Kavi");

        for (int i : T1.keySet()) {
            System.out.println(i);
        }

        for (String name : T1.values()) {
            System.out.println(name);
        }

        for (int i : T1.keySet()) {
            System.out.println(i + " " + T1.get(i));
        }

    }
}