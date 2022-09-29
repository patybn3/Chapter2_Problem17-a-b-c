public class BasicPair<T> implements PairInterface<T>
{
    T firstInstance;
    T secondInstance;

    public BasicPair(T setFirstInstance, T setSecondInstance)
    {
        firstInstance = setFirstInstance;
        secondInstance = setSecondInstance;
    }

    @Override
    public void setFirst(T first) {
        this.firstInstance = first;
    }

    @Override
    public void setSecond(T second) {
        this.secondInstance = second;
    }

    @Override
    public T getFirst() {
        return firstInstance;
    }

    @Override
    public T getSecond() {
        return secondInstance;
    }
}
