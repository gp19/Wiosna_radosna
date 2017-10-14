/**
 * Created by gp19 on 2017-10-12.
 */
public class Item {

    private int mValue; //Zmienna przechowujaca wartosc przedmiotu
    private int mSize; //Zmienna przechowujaca rozmiar przedmiotu
    private double mQuotient;
    private String mIndex;

    public Item(int value, int size, int index) {

        mValue = value;
        mSize = size;
        mIndex = Integer.toString(index);

        mQuotient = (double) mValue / (double) mSize;

    }

    public int getValue() {
        return mValue;
    }

    public int getSize() {
        return mSize;
    }

    public double getQuotient() {
        return mQuotient;
    }

    public String getIndex() {
        return mIndex;
    }

}
