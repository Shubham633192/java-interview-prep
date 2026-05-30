import java.io.*;
import java.util.*;

public class Readfile {
    public static void main(String[] args) {

        File myobj = new File("firstfile.txt");

        try (Scanner mr = new Scanner(myobj)) {
            while (mr.hasNextLine()) {
                String data = mr.nextLine();
                System.out.println(data);
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("An error occured");
        }
    }

}
