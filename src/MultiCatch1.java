public class MultiCatch1 {

    public static void main(String[] args) {

        try {
            int[] num = { 1, 2, 3, 4, 5 };
            System.out.println(num[0]);
            int result = 10 / 0;

        }

        catch (ArithmeticException e) {
            System.out.println("Arithmetic issue");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("array issue ");
        }

        catch (Exception e) {
            System.out.println("Something went worng");
        }
    }

}
