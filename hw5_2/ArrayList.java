package hw5_2;

public class ArrayList<E> implements List<E> {
    private E[] data;
    private int size;

    public ArrayList() {
        this.size = 0;
        this.data = (E[]) new Object[12];
    }

    @Override
    public String toString() {
        String result = "[";

        for (int i = 0; i < size; i++) {
            result += data[i];

            if(i < size - 1)
                result += ", ";
        }

        result += "]";
        return result;
    }

    @Override
    public void add(E object) {
        data[size++] = object;
    }

    @Override
    public E get(int index) {
        if (isNotWithinBounds(index)) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }

        return data[index];
    }

    @Override
    public int size() {
        return size;
    }

    private boolean isWithinBounds(int index) {
        return index >= 0 && index < size;
    }

    private boolean isNotWithinBounds(int index) {
        return index < 0 || index >= size;
    }
}
