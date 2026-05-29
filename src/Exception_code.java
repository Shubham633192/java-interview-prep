import java.util.*;

public class Exception_code {

    public static void main(String[] args) {
        try {
            int[] mynum = { 1, 2, 3, 4, 5 };
            System.out.println(mynum[10]);

        }

        catch (Exception e) {

            System.out.println("Something went run");

        }

        finally {
            System.out.println("always it work");
        }
    }
}
