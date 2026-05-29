import java.util.*;

public class ArrayList_code {
    public static void main(String[] args) {

        // here in arraylistwe can add a nubmer of data element and we can edit it as
        // per out requirement , this means it is mutable in nature

        // differece in normal array and in this i as in this we can modify it but if we
        // want to do in array so we can to create new but here we can modify it

        ArrayList<String> cars = new ArrayList<>();

        // Adding element
        cars.add("Volve");
        cars.add("Rolls Royce");

        // adding element at particluar index

        cars.add(0, "Rolls Royce Phantom");

        // Accessing element

        cars.get(0); // get used to accessing

        // change the element

        cars.set(0, "Range Rover"); // byusing set

        // Delete

        cars.remove(1);

        // clear

        // it is used to delete all

        // size

        cars.size();

        // Loop through it

        for (int i = 0; i < cars.size(); i++) {
            System.out.println(cars.get(i));
        }
    }

}
