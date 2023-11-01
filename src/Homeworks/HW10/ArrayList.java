package Homeworks.HW10;

public class ArrayList<T> {

    public static void main(String[] args) {

        ArrayList<String> integers = new ArrayList<>();
        integers.add(new String("bob")); // 0
        integers.add(new String("dady"));
        integers.add(new String("dog"));
        integers.add(new String("cat")); // 3
        integers.add(new String("danya"));
        integers.add(new String("bodya"));
        integers.add(new String("max")); // 6
        integers.add(new String("evgeniy"));
        integers.add(new String("alex"));
        integers.add(new String("olga")); // 9
        integers.add(new String("daria"));
        integers.add(new String("senya")); // 11


    }
    private int size;
    private T[] array;

    public ArrayList() {
        this.size = 0;
        this.array = (T[]) new Object[10];
    }

    public ArrayList(int size) {
        this.size = size;
        this.array = (T[]) new Object[size];
    }

    public int size() {
        return size;
    }

    public int indexOf(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i] == element) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean contains(T element) {
        return indexOf(element) != -1;
    }

    public boolean add(T element) {
        increaseCapacity(size + 1);
        array[size] = element;
        size++;
        return true;
    }

    public boolean add(T element, int index) {
        if (index < 0 || index > size) {
            return false;
        }
        increaseCapacity(size + 1);
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
        return true;
    }

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        T removedElement = array[index];
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size -1] = null;
        size--;
        return removedElement;
    }

    public T getIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        return array[index];
    }

    public int getIndex(T element){
        if (array[0].equals(element)) {
            return 0;
        } else {
            return getIndex(element, 1);
        }
    }

    private int getIndex(T element, int index){
        if (index > size - 1) {
            return -1;
        }
        if (array[index].equals(element)) {
            return index;
        }else{
            return getIndex(element, index + 1);
        }
    }

    private void increaseCapacity(int minCapacity) {
        if (minCapacity > array.length) {
            int newCapacity = Math.max(array.length * 2, minCapacity);
            T[] newArray = (T[]) new Object[newCapacity];
            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("{");
        for (int i = 0; i < this.size ; i++) {
            if (array[i] == null) {
                continue;
            }
            result.append(array[i] + ", ");
        }
        result.replace(result.length()-2, result.length()-1, "}");
        return result.toString();
    }
}
