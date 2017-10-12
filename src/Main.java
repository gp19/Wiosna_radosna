import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Grzesław on 2017-10-12.
 */
public class Main {

    static int n; //liczba przedmiotow
    static int J, S; //rozmiary plecakow Jasia i Stasia
    ArrayList<Thing> things = new ArrayList<>(); //tablica przechowujaca wartosci i rozmiary przedmiotow

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        getBasicData();

    }

    public static void getBasicData() {
        int k;

        do {
            k = 0;

            n = input.nextInt();
            J = input.nextInt();
            S = input.nextInt();

            if (n < 0 | n > 100) k = 1;
            if (J < 0 | J > 500) k = 1;
            if (S < 0 | J > 500) k = 1;

            if (k == 1) System.out.println("Incorrect input.\n");

        } while (k == 1);
    }

}
