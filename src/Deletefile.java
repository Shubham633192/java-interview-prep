import java.io.*;

public class Deletefile {

    public static void main(String[] args) {

        File myobj = new File("firstfile.txt");
        if (myobj.delete()) {
            System.out.println("deleted" + myobj.getName());
        }

        else {
            System.out.println("error");
        }
    }
}