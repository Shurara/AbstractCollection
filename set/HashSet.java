import java.util.*;

public class HashSet<T> implements Set<T> {

    private static final Boolean EXIST = true;

    private final Map<T, Boolean> elements = new HashMap<>();

    @Override
    public int size() {
        // BEGIN (write your solution here)
        return elements.size();
        // END
    }

    @Override
    public boolean isEmpty() {
        // BEGIN (write your solution here)
        return elements.size() > 0;
        // END
    }

    @Override
    public boolean contains(Object o) {
        // BEGIN (write your solution here)
        for(T item : elements.keySet()){
            if(item.equals(o)){
                return true;
            }
        }
        // END
        return false;
    }

    @Override
    public Iterator<T> iterator() {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public Object[] toArray() {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean add(T t) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean remove(Object o) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        // BEGIN (write your solution here)

        // END
    }

    @Override
    public void clear() {
        // BEGIN (write your solution here)
        elements = (HashMap<>())new Object[1];
        size = 0;
        // END
    }
}