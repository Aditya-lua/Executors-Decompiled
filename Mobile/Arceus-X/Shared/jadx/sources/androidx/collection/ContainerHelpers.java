package androidx.collection;

/* JADX INFO: loaded from: classes4.dex */
class ContainerHelpers {
    static final int[] EMPTY_INTS = new int[0];
    static final long[] EMPTY_LONGS = new long[0];
    static final Object[] EMPTY_OBJECTS = new Object[0];

    public static int idealIntArraySize(int need) {
        return idealByteArraySize(need * 4) / 4;
    }

    public static int idealLongArraySize(int need) {
        return idealByteArraySize(need * 8) / 8;
    }

    public static int idealByteArraySize(int need) {
        for (int i10 = 4; i10 < 32; i10++) {
            if (need <= (1 << i10) - 12) {
                return (1 << i10) - 12;
            }
        }
        return need;
    }

    public static boolean equal(Object a10, Object b) {
        return a10 == b || (a10 != null && a10.equals(b));
    }

    static int binarySearch(int[] array, int size, int value) {
        int lo2 = 0;
        int hi2 = size - 1;
        while (lo2 <= hi2) {
            int mid = (lo2 + hi2) >>> 1;
            int midVal = array[mid];
            if (midVal < value) {
                lo2 = mid + 1;
            } else if (midVal > value) {
                hi2 = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo2;
    }

    static int binarySearch(long[] array, int size, long value) {
        int lo2 = 0;
        int hi2 = size - 1;
        while (lo2 <= hi2) {
            int mid = (lo2 + hi2) >>> 1;
            long midVal = array[mid];
            if (midVal < value) {
                lo2 = mid + 1;
            } else if (midVal > value) {
                hi2 = mid - 1;
            } else {
                return mid;
            }
        }
        return ~lo2;
    }

    private ContainerHelpers() {
    }
}
