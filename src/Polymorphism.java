
// method overridiing in his child clas parent class ke method ko apne tareeke
// se likhta hai 

class Animal {
    void sound() {
        System.out.println("Sound of the animal ");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("dog bark...");
    }
}

public class Polymorphism {

    // method overloading in this same ethod name but different paramenter
    // static int method1(int a, int b) {
    // return a + b;
    // }

    // static int method1(int a, int b, int c) {
    // return a + b + c;
    // }

    public static void main(String[] args) {

        // System.out.println(method1(5, 10));
        // System.out.println(method1(9, 10, 20));

        Dog d1 = new Dog();
        d1.sound();
    }

}
