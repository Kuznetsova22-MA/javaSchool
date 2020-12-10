package homeWork_5;

import java.util.Collection;

public interface MethodsForCollection<T> {
    T max(Collection<T> collection);
    double middle(Collection<T> collection);
    Collection<T> sort(Collection<T> collection);

}
