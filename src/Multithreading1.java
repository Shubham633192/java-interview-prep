class Foodpreparation extends Thread {

    public void run() {

        for (int i = 0; i <= 5; i++) {
            System.out.println(i);

            try {
                Thread.sleep(1000);
            }

            catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }

    }
}

class DelivaryPartner extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("Delivary : " + i);

            try {
                Thread.sleep(1000);
            }

            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

    }
}

public class Multithreading1 {

    public static void main(String[] args) {

        Foodpreparation food = new Foodpreparation();
        food.start();

        DelivaryPartner deli = new DelivaryPartner();
        deli.start();
    }
}
