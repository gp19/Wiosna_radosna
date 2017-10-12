/**
 * Created by gp19 on 2017-10-12.
 */
public class Thing {

    private int mValue; //Zmienna przechowujaca wartosc przedmiotu
    private int mSize; //Zmienna przechowujaca rozmiar przedmiotu

    public Thing(int value, int size){
        mValue = value;
        mSize = size;
    }

    public int getValue(){
        return mValue;
    }

    public int getSize(){
        return mSize;
    }

}
