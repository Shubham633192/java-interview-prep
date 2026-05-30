public class Threads1 extends Thread {
    public void run() {
        System.out.println("Shubham");
    }

    public static void main(String[] args) {
        Threads1 t1 = new Threads1();
        t1.start();

    }

}
