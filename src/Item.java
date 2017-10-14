/**
 * Created by gp19 on 2017-10-12.
 */
class Item {

    private final int mValue; //Zmienna przechowujaca wartosc przedmiotu
    private final int mSize; //Zmienna przechowujaca rozmiar przedmiotu
    private final double mQuotient;
    private final String mIndex;

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
