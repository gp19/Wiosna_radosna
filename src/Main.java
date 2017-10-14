import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by gp19 on 2017-10-12.
 */
class Main {

    private static int n = 0; //Liczba przedmiotow
    private static int J, S; //Rozmiary plecakow Jasia i Stasia
    private static final ArrayList<Item> items = new ArrayList<>(); //Tablica przechowujaca wartosci i rozmiary przedmiotow
    private static final Solution[] solutions = new Solution[2]; //Tablica przechowujaca dwa mozliwe rozwiazania
    private static Solution closingSolution;

    private static final Scanner input = new Scanner(System.in);


    public static void main(String[] args) {

        getBasicData(); //Pobranie liczby przedmiotow oraz rozmiarow plecakow Jasia i Stasia
        getItemsParameters(); //Wywolanie funkcji wczytujacej rozmiary i wartosci rzeczy i zapisanie ich w tablicy things
        sortObjects(); //Sortuj obiekty wedlug ilorazu wartosci i rozmiaru od najwiekszego do najmniejszego
        calculateSolution(J, S, 0); //Oblicz rozwiazania, pierwsze - zaczynajac od pierwszego plecaka
        calculateSolution(S, J, 1); //drugie - zaczynajac od drugiego
        determineClosingSolution(); //okresl ostateczne rozwiazanie
        printSolution(); //wydrukuj ostateczne rozwiazanie

    }


    //Funkcja do wczytywania liczby przedmiotow oraz pojemnosci plecakow
    private static void getBasicData() {
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
    private static void getItemsParameters() {

        for (int i = 0; i < n; i++) {

            int k;
            int value, size;

            do {
                k = 0;

                value = input.nextInt();
                size = input.nextInt();

                if (value > 100 | size > 100 | value < 1 | size < 1) k = 1;

                if (k == 1) System.out.println("Incorrect input");

            } while (k == 1);

            items.add(new Item(value, size, i + 1)); //Dodanie kolejnego przedmiotu do ArrayList

        }
    }


    //Funkcja sortujaca przedmioty wedlug ilorazu wartosci i rozmiaru od najwiekszej do najmmniejszej
    private static void sortObjects() {

        int k;

        do {
            k = 0;
            for (int i = 0; i < n - 1; i++) {
                Item term;
                if (items.get(i + 1).getQuotient() > items.get(i).getQuotient()) {
                    k = 1;
                    term = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, term);
                }

                if ((items.get(i + 1).getQuotient() == items.get(i).getQuotient()) & (items.get(i + 1).getSize() > items.get(i).getSize())) {
                    k = 1;
                    term = items.get(i);
                    items.set(i, items.get(i + 1));
                    items.set(i + 1, term);
                }
            }
        } while (k == 1);

    }


    //Funkcja obliczajaca rozwiazanie dla dwoch plecakow w danej kolejnosci na podstawie ilorazu wartosci i rozmiaru przedmiotow
    private static void calculateSolution(int firstKnapsackCapacity, int secondKnapsackCapacity, int solutionIndex) {

        int maxValue = 0;
        StringBuilder firstKnapsackIndices = new StringBuilder();
        StringBuilder secondKnapsackIndices = new StringBuilder();

        for (int i = 0; i < n; i++) {

            Item currentItem = items.get(i);

            if (currentItem.getSize() <= firstKnapsackCapacity) {

                firstKnapsackCapacity -= currentItem.getSize();
                maxValue += currentItem.getValue();
                firstKnapsackIndices.append(currentItem.getIndex()).append(" ");

            } else {

                if (currentItem.getSize() <= secondKnapsackCapacity) {
                    secondKnapsackCapacity -= currentItem.getSize();
                    maxValue += currentItem.getValue();
                    secondKnapsackIndices.append(currentItem.getIndex()).append(" ");
                }

            }
        }

        solutions[solutionIndex] = new Solution(maxValue, firstKnapsackIndices.toString(), secondKnapsackIndices.toString());

    }


    private static void determineClosingSolution() {

        int maxValue;
        String firstKnapsackIndices;
        String secondKnapsackIndices;

        if (solutions[0].getMaxValue() >= solutions[1].getMaxValue()) {
            maxValue = solutions[0].getMaxValue();
            firstKnapsackIndices = solutions[0].getFirstKnapsackIndices();
            secondKnapsackIndices = solutions[0].getSecondKnapsackIndices();
        } else {
            maxValue = solutions[1].getMaxValue();
            firstKnapsackIndices = solutions[1].getSecondKnapsackIndices();
            secondKnapsackIndices = solutions[1].getFirstKnapsackIndices();
        }

        closingSolution = new Solution(maxValue,firstKnapsackIndices, secondKnapsackIndices);

    }

    private static void printSolution(){

        System.out.println("\n" + closingSolution.getMaxValue()
                        + "\n" + closingSolution.getFirstKnapsackIndices()
                        + "\n" + closingSolution.getSecondKnapsackIndices());

    }

}
