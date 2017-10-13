/**
 * Created by gp19 on 2017-10-12.
 */
public class Item {

    private int mValue; //Zmienna przechowujaca wartosc przedmiotu
    private int mSize; //Zmienna przechowujaca rozmiar przedmiotu
    private int mQuotient;

    public Item(int value, int size) {
        mValue = value;
        mSize = size;

        mQuotient = mValue / mSize;
    }

    public int getValue() {
        return mValue;
    }

    public int getSize() {
        return mSize;
    }

    public int getQuotient() {
        return mQuotient;
    }

}
