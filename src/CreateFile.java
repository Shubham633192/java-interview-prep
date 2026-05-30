import java.io.*;

public class CreateFile {
    public static void main(String[] args) {
        try {
            File ob = new File("firstfile.txt");

            if (ob.createNewFile()) {
                System.out.println("File created" + ob.getName());
            }

            else {
                System.out.println("file already exists");
            }
        }

        catch (IOException e) {
            System.out.print("error occure");
        }
    }

}
