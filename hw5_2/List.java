package hw5_2;

public interface List<E> {
    void add(E object);
    void add(int index, E object);
    E get(int index);
    E remove(int index);
	void removeAll();
    int size();
}
