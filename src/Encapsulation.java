public class Encapsulation {

    private String name; // in this always declare in private

    public String getname() {
        return name;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Encapsulation e1 = new Encapsulation();
        e1.setname("Ravi");
        e1.getname();
        e1.display();

    }

}
