public class Threads2 extends Thread {

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Threads2 t1 = new Threads2();
        t1.start();

    }

}
