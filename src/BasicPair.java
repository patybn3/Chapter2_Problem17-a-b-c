/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
public class BasicPair<T> implements PairInterface<T>
{
    T firstInstance;
    T secondInstance;

    public BasicPair(T setFirstInstance, T setSecondInstance)
    {
        //setting the value of the variables to what was given to the parameters
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
