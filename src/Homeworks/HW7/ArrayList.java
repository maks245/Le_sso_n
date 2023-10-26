package Homeworks.HW7;

public class ArrayList {
        private int size;
        private int[] array;

        public ArrayList() {
            this.size = 0;
            this.array = new int[10];
        }

        public ArrayList(int size) {
            this.size = size;
            this.array = new int[size];
        }

        public int size() {
            return size;
        }

        public int indexOf(int number) {
            for (int i = 0; i < size; i++) {
                if (array[i] == number) {
                    return i;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return size == 0;
        }

        public boolean contains(int number) {
            return indexOf(number) != -1;
        }

        public boolean add(int number) {
            increaseCapacity(size + 1);
            array[size] = number;
            size++;
            return true;
        }

        public boolean add(int number, int index) {
            if (index < 0 || index > size) {
                return false;
            }
            increaseCapacity(size + 1);
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = number;
            size++;
            return true;
        }

        public int remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index is out of bounds.");
            }
            int removedElement = array[index];
            for (int i = index; i < size - 1; i++) {
                array[i] = array[i + 1];
            }
            size--;
            return removedElement;
        }

        public int get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException("Index is out of bounds.");
            }
            return array[index];
        }

        private void increaseCapacity(int minCapacity) {
            if (minCapacity > array.length) {
                int newCapacity = Math.max(array.length * 2, minCapacity);
                int[] newArray = new int[newCapacity];
                for (int i = 0; i < size; i++) {
                    newArray[i] = array[i];
                }

                array = newArray;
            }
        }
    }
