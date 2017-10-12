import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gp19 on 2017-10-12.
 */
public class Main {

    static int n = 0; //Liczba przedmiotow
    static int J, S; //Rozmiary plecakow Jasia i Stasia
    static ArrayList<Thing> things = new ArrayList<>(); //Tablica przechowujaca wartosci i rozmiary przedmiotow

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        getBasicData(); //Pobranie liczby przedmiotow oraz rozmiarow plecakow Jasia i Stasia
        getThingsParameters(); //Wywolanie funkcji wczytujacej rozmiary i wartosci rzeczy i zapisanie ich w tablicy things

    }

    //Funkcja do wczytywania liczby przedmiotow oraz pojemnosci plecakow
    public static void getBasicData() {

        int k;

        do {
            k = 0;

            //Wczytanie wartosci zmiennych
            n = input.nextInt();
            J = input.nextInt();
            S = input.nextInt();

            //Zabezpieczenie zakresu zmiennych
            if (n < 0 | n > 100) k = 1;
            if (J < 0 | J > 500) k = 1;
            if (S < 0 | J > 500) k = 1;

            if (k == 1) System.out.println("Incorrect input.\n"); //Informacja o niepoprawnym wejsciu

        } while (k == 1); //Jesli zakresy sa bledne, wczytuje jeszcze raz

    }

    //Funkcja do wczytywania wartosci oraz rozmiarow przedmiotow, zapisywanie danych w ArrayList
    public static void getThingsParameters() {

        for (int i = 0; i < n; i++) {
            Thing thing;
            thing = new Thing(input.nextInt(), input.nextInt()); //Zapisanie do obiektu jego wartosci i rozmiaru z biezacego wejscia
            things.add(thing); //Dodanie kolejnego przedmiotu do ArrayList
        }

    }

}
