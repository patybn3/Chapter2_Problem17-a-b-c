/**
 * @author Patricia N. Antlitz
 * @version 1.0
 */
public interface PairInterface<T>
{
    void setFirst(T first);
    void setSecond(T second);

    T getFirst();
    T getSecond();
}
