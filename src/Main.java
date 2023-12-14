import java.lang.Math;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Character alhaitham = new Character("Alhaitham", true, "Dendro", 0, 0);
        Character neuvillette = new Character("Neuvillette", true, "Hydro", 0, 0);
        Character kuki = new Character("Kuki Shinobu", false, "Electro", 0, 0);

        System.out.println(alhaitham.toString());
        System.out.println(neuvillette.toString());
        System.out.println(kuki.toString());

        System.out.println("you have " + Character.getCharNum() + " character(s)");

        for (int i = 0; i < 7; i++) { // c6 wish
            System.out.println(Character.wishSim());
        }

    }

}