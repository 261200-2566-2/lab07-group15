import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class CustomSet<T> implements Set<T> {
    private final HashMap<T, Integer> storage = new HashMap<>();

    @Override
    public int size() {
        return storage.size();
    }

    @Override
    public boolean isEmpty() {
        return storage.isEmpty();
    }

    @Override
    public boolean contains(Object key) {
        return storage.containsKey(key);
    }

    @Override
    public Iterator iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(Object o) {
        if (!storage.containsKey(o)) {
            storage.put((T) o, 1);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean remove(Object o) {
        return storage.remove(o) != null;
    }

    @Override
    public boolean addAll(Collection c) {
        boolean modified = false;
        for (Object element : c) {
            if (add(element)) {
                modified = true;
            }
        }
        return modified;
    }

    @Override
    public void clear() {
        storage.clear();
    }

    @Override
    public boolean removeAll(Collection c) {
        return storage.keySet().removeAll(c);
    }

    @Override
    public boolean retainAll(Collection c) {
        return storage.keySet().retainAll(c);
    }

    @Override
    public boolean containsAll(Collection c) {
        return storage.keySet().containsAll(c);
    }

}
