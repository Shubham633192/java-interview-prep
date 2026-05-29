class Animal {
    public void work() {
        System.out.println("Animal is eating");
    }
}

class dog extends Animal {
    public void sound() {
        System.out.println("dog bark>>>>");
    }
}

public class Inheritance {
    public static void main(String[] args) {

        dog d1 = new dog();
        d1.work();
        d1.sound();
    }

}
