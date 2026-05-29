import java.util.*;

public class HashSet_code {
    public static void main(String[] args) {

        HashSet<Integer> h1 = new HashSet<>();

        h1.add(1);
        h1.add(3);
        h1.add(5);
        h1.add(8);

        for (int i = 0; i <= 10; i++) {
            if (h1.contains(i)) {
                System.out.println("we found i " + i);
            } else {
                System.out.println("we donot found i " + i);
            }
        }

    }

}
