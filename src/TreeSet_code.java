import java.util.Collection;
import java.util.TreeSet;

public class TreeSet_code {

    public static void main(String[] args) {

        TreeSet<Integer> num = new TreeSet<>();

        num.add(1);
        num.add(5);
        num.add(4);
        num.add(2);
        num.add(3);
        for (int n : num) {
            System.out.println(n);
        }

    }
}
