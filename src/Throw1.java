public class Throw1 {

    static void checkAge(int age) {

        if (age < 18) {
            throw new ArithmeticException("Access denied You aren ot enough age to vote");
        }

        else {
            System.out.println("You are eligible to vote");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }

}
