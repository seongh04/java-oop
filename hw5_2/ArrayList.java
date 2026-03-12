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

            if (i < size - 1)
                result += ", ";
        }

        result += "]";
        return result;
    }

    @Override
    public void add(E object) {
        if (size == data.length) {
            resize();
        }

        data[size++] = object;
    }

    @Override
    public void add(int index, E object) {
        checkBounds(index, true);

        if (size == data.length) {
            resize();
        }

        if (index != size) {
            System.arraycopy(data, index, data, index + 1, size - index);
        }

        data[index] = object;
        size++;
    }

    @Override
    public E get(int index) {
        checkBounds(index, false);

        return data[index];
    }

    @Override
    public E remove(int index) {
        checkBounds(index, false);

        E removedItem = data[index];

        for (int i = index; i < size - 1; i++) {
            data[i] = data[i + 1];
        }

        data[size - 1] = null;
        size--;

        return removedItem;
    }

    @Override
    public void removeAll() {
        data = (E[]) new Object[12];
        size = 0;
    }

    @Override
    public int size() {
        return size;
    }

    private void resize() {
        E[] newData = (E[]) new Object[size + 12];

        for (int i = 0; i < size; i++) {
            newData[i] = data[i];
        }

        data = newData;
    }

    private void checkBounds(int index, boolean allowLast) {
        if (isNotWithinBounds(index, allowLast)) {
            throw new IndexOutOfBoundsException("Index: " + index + " Size: " + size);
        }
    }

    private boolean isNotWithinBounds(int index, boolean allowLast) {
        if (allowLast) {
            return index < 0 || index > size;
        } else {
            return index < 0 || index >= size;
        }
    }
}
