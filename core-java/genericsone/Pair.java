package genericsone;

/**
 * @author spiritree
 * @date 2017/10/18
 */
public class Pair<T> {
    private T first;
    private T second;
    public Pair() {
        first = null;
        second = null;
    }
    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }
    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }
    public void setFirst(T newValue) {
        this.first = newValue;
    }
    public void setSecond(T newValue) {
        this.second = newValue;
    }
}