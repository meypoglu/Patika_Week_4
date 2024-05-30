import java.lang.reflect.Array;
import java.util.Arrays;

public class Practice_List_Class<T> {
    private int capacity;
    private T[] array;
    private int appendCounter;

    public Practice_List_Class(Class<T> c) {
        this.capacity = 10;
        T[] arr = (T[]) Array.newInstance(c, this.capacity);
        this.array = arr;
    }

    public Practice_List_Class(Class<T> c, int capacity) {
        this.capacity = capacity;
        T[] arr = (T[]) Array.newInstance(c, this.capacity);
        this.array = arr;
    }

    void getCapacity() {
        System.out.println("Dizinin kapasitesi: " + this.capacity);
    }

    void size() {
        System.out.println("Dizideki eleman sayısı: " + (this.appendCounter));
    }

    void add(T data) {
        if (this.appendCounter == this.capacity) {
            this.array = Arrays.copyOf(this.array, this.array.length * 2);
            this.capacity = this.capacity * 2;
        }
        this.array[appendCounter] = data;
        this.appendCounter += 1;
    }

    void getList() {
        System.out.println(Arrays.toString(this.array));
    }
}
