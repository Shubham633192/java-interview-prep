public class Method_Overloading {

    // method overloading means same method name with different parameter and
    // different work perform as per given inatruction

    static int method(int x, int y) {
        return x + y;
    }

    static double method(double a, double b) {
        return a + b;
    }

    static void method() {
        System.out.println("this is a overloading method ");
    }

    public static void main(String[] args) {
        int num1 = method(5, 5);
        double num2 = method(2.3, 3.5);

        System.out.println("int method" + num1);

        System.out.println("double method" + num2);

    }
}
