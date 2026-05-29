public class Thiskeywork {
    String name;
    int age;

    Thiskeywork(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void method() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {
        Thiskeywork t1 = new Thiskeywork("Ravi", 20);
        t1.method();

    }

}
