public class ArrayPair<T> implements PairInterface<T>
{
    protected T arrayOfObj[];

    public ArrayPair(T setFirstObj, T setSecObj)
    {
        arrayOfObj = (T[]) new Object[2];
        arrayOfObj[0] = setFirstObj;
        arrayOfObj[1] = setSecObj;
    }

    @Override
    public void setFirst(T first) {
        arrayOfObj[0] = first;
    }

    @Override
    public void setSecond(T second) {
        arrayOfObj[1] = second;
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
