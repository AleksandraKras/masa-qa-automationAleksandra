package Cats;
import java.util.ArrayList;

public class MyCats {
    public static void main(String[] args) {

        ArrayList<Cat> Mycats = new ArrayList<>();
        Mycats.add(new Cat("Odin", "grey", 3));
        Mycats.add(new Cat("Dva", "white", 1));
        Mycats.add(new Cat("Tri", "grey", 5));
        Mycats.add(new Cat("Cheture", "black", 3));
        Mycats.add(new Cat("Pyat", "white", 5));

        Mycats.forEach(cat -> System.out.println(cat.toString()));

    }
}

