/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
public class ArrayPair<T> implements PairInterface<T>
{
    //required array of generic type
    protected T arrayOfObj[];

    //constructor, two parameters must be passes. I used a constructor to pass them.
    public ArrayPair(T setFirstObj, T setSecObj)
    {
        //cant initiate array in a implemented file, casted
        arrayOfObj = (T[]) new Object[2];
        //setting elements, will test with Strings, and Integers
        arrayOfObj[0] = setFirstObj;
        arrayOfObj[1] = setSecObj;
    }

    @Override
    public void setFirst(T first) {
        //this keyword should be used to make use of the interface methods, setFirst...
        this.arrayOfObj[0] = first;
    }

    @Override
    public void setSecond(T second) {
        this.arrayOfObj[1] = second;
    }

    @Override
    public T getFirst() {
        return arrayOfObj[0];
    }

    @Override
    public T getSecond() {
        return arrayOfObj[1];
    }
}
