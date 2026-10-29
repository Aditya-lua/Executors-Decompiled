package androidx.core.content.res;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes4.dex */
final class GrowingArrayUtils {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    public static <T> T[] append(T[] tArr, int i10, T t8) {
        if (i10 > tArr.length) {
            throw new AssertionError();
        }
        if (i10 + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i10));
            System.arraycopy(tArr, 0, objArr, 0, i10);
            tArr = (T[]) objArr;
        }
        tArr[i10] = t8;
        return tArr;
    }

    public static int[] append(int[] array, int currentSize, int element) {
        if (currentSize > array.length) {
            throw new AssertionError();
        }
        if (currentSize + 1 > array.length) {
            int[] newArray = new int[growSize(currentSize)];
            System.arraycopy(array, 0, newArray, 0, currentSize);
            array = newArray;
        }
        array[currentSize] = element;
        return array;
    }

    public static long[] append(long[] array, int currentSize, long element) {
        if (currentSize > array.length) {
            throw new AssertionError();
        }
        if (currentSize + 1 > array.length) {
            long[] newArray = new long[growSize(currentSize)];
            System.arraycopy(array, 0, newArray, 0, currentSize);
            array = newArray;
        }
        array[currentSize] = element;
        return array;
    }

    public static boolean[] append(boolean[] array, int currentSize, boolean element) {
        if (currentSize > array.length) {
            throw new AssertionError();
        }
        if (currentSize + 1 > array.length) {
            boolean[] newArray = new boolean[growSize(currentSize)];
            System.arraycopy(array, 0, newArray, 0, currentSize);
            array = newArray;
        }
        array[currentSize] = element;
        return array;
    }

    public static <T> T[] insert(T[] tArr, int i10, int i11, T t8) {
        if (i10 > tArr.length) {
            throw new AssertionError();
        }
        if (i10 + 1 <= tArr.length) {
            System.arraycopy(tArr, i11, tArr, i11 + 1, i10 - i11);
            tArr[i11] = t8;
            return tArr;
        }
        T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), growSize(i10)));
        System.arraycopy(tArr, 0, tArr2, 0, i11);
        tArr2[i11] = t8;
        System.arraycopy(tArr, i11, tArr2, i11 + 1, tArr.length - i11);
        return tArr2;
    }

    public static int[] insert(int[] array, int currentSize, int index, int element) {
        if (currentSize > array.length) {
            throw new AssertionError();
        }
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }
        int[] newArray = new int[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static long[] insert(long[] array, int currentSize, int index, long element) {
        if (currentSize > array.length) {
            throw new AssertionError();
        }
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }
        long[] newArray = new long[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static boolean[] insert(boolean[] array, int currentSize, int index, boolean element) {
        if (currentSize > array.length) {
            throw new AssertionError();
        }
        if (currentSize + 1 <= array.length) {
            System.arraycopy(array, index, array, index + 1, currentSize - index);
            array[index] = element;
            return array;
        }
        boolean[] newArray = new boolean[growSize(currentSize)];
        System.arraycopy(array, 0, newArray, 0, index);
        newArray[index] = element;
        System.arraycopy(array, index, newArray, index + 1, array.length - index);
        return newArray;
    }

    public static int growSize(int currentSize) {
        if (currentSize <= 4) {
            return 8;
        }
        return currentSize * 2;
    }

    private GrowingArrayUtils() {
    }
}
