public class Constructor {

    int modelyear;
    String modelname;

    public Constructor(int year, String name) {
        modelyear = year;
        modelname = name;
    }

    public static void main(String[] args) {
        Constructor c1 = new Constructor(1966, "Mustang");
        System.out.println(c1.modelyear + " " + c1.modelname);

    }

}
