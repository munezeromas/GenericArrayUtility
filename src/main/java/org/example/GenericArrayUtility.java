package org.example;
import java.lang.reflect.Array;

public class GenericArrayUtility {

    public static <T> T[] mergeArrays(T[] a, T[] b) {
        if (a == null && b == null) {
            return (T[]) new Object[0];
        } else if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }

        int totalLength = a.length + b.length;
        T[] result = (T[]) Array.newInstance(a.getClass().getComponentType(), totalLength);

        System.arraycopy(a, 0, result, 0, a.length);
        System.arraycopy(b, 0, result, a.length, b.length);

        return result;
    }
}

