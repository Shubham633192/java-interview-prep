import java.io.*;

public class Writefile {
    public static void main(String[] args) {

        try {
            FileWriter fl = new FileWriter("firstfile.txt");

            fl.write("My self Shubham Mishra and today i am very very sad");
            fl.close();

            System.out.println("Successfull wrote");
        }

        catch (IOException e) {
            System.out.println("Some wnet worng");
        }
    }

}
