package ArrayList;

import java.lang.reflect.Array;
import java.util.Arrays;

public class CustomArrayList {
    Object[] ar;
    int index = 0;

    public CustomArrayList() {
        ar = new Object[10];
    }

    public CustomArrayList(int size) {
        ar = new Object[size];
    }

    public void insert(Object obj) {
        if (index == ar.length) {
            int newSize = ar.length + (ar.length / 2);
            ar = Arrays.copyOf(ar, newSize);
            // instead of this..create one new array and copy all element and return new
            // array
        }
        ar[index] = obj;
        index++;
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        // System.out.println(ar.length);
        for (int i = 0; i < index; i++) {
            if (null != ar[i]) {

                if (i == (index - 1)) {
                    sb.append(ar[i]);
                } else {
                    sb.append(ar[i] + ", ");
                }
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public int size() {
        int sizee = 0;
        for (Object a : ar) {
            if (a != null) {
                sizee++;
            }
        }
        return sizee;
    }

    public Object get(int indexToGet) throws Exception {
        if (ar.length < indexToGet) {
            throw new Exception("you are trying to get element where not present");
        }
        return ar[indexToGet];
    }

    public Object remove(int deleteToIndex) throws Exception {

        Object obj = get(deleteToIndex);
        for (int i = deleteToIndex; i < ar.length - 1; i++) {
            if (null != ar[i + 1]) {
                ar[i] = ar[i + 1];
            }
        }
        ar[--index] = null;
        System.out.println(index);
        return obj;

    }

    public Object fastRemove(int deleteToIndex) throws Exception {
        Object obj = get(deleteToIndex);
        int numOfShift = index - deleteToIndex - 1;
        if (numOfShift > 0)
            System.arraycopy(ar, deleteToIndex + 1, ar, deleteToIndex, numOfShift);
        ar[--index] = null;
        return obj;
    }

}