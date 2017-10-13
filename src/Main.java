import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gp19 on 2017-10-12.
 */
public class Main {

    private static int n = 0; //Liczba przedmiotow
    private static int J, S; //Rozmiary plecakow Jasia i Stasia
    private static ArrayList<Item> items = new ArrayList<>(); //Tablica przechowujaca wartosci i rozmiary przedmiotow

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        getBasicData(); //Pobranie liczby przedmiotow oraz rozmiarow plecakow Jasia i Stasia
        getItemsParameters(); //Wywolanie funkcji wczytujacej rozmiary i wartosci rzeczy i zapisanie ich w tablicy things

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
            if (S < 0 | S > 500) k = 1;

            if (k == 1) System.out.println("Incorrect input.\n"); //Informacja o niepoprawnym wejsciu

        } while (k == 1); //Jesli zakresy sa bledne, wczytuje jeszcze raz

    }

    //Funkcja do wczytywania wartosci oraz rozmiarow przedmiotow, zapisywanie danych w ArrayList
    public static void getItemsParameters() {

        for (int i = 0; i < n; i++) {

            int k;
            int value, size;

            do {
                k = 0;

                value = input.nextInt();
                size = input.nextInt();

                if (value > 100 | size > 100 | value < 1 | size < 1) k = 1;

                if(k==1) System.out.println("Incorrect input");

            } while (k == 1);

            items.add(new Item(value, size)); //Dodanie kolejnego przedmiotu do ArrayList

        }
    }
}
