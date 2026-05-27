public class Whileloop {
    public static void main(String[] args) {

        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("running");
            }

            else {
                System.out.println("not running");
            }

            dice += 1;
        }
    }

}
