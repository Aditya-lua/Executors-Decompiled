package n2;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public final class g {
    public static int[] a(int[] iArr, int i10, int i11) {
        if (i10 + 1 > iArr.length) {
            int[] iArr2 = new int[c(i10)];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr = iArr2;
        }
        iArr[i10] = i11;
        return iArr;
    }

    public static <T> T[] b(T[] tArr, int i10, T t8) {
        if (i10 + 1 > tArr.length) {
            Object[] objArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), c(i10));
            System.arraycopy(tArr, 0, objArr, 0, i10);
            tArr = (T[]) objArr;
        }
        tArr[i10] = t8;
        return tArr;
    }

    public static int c(int i10) {
        if (i10 <= 4) {
            return 8;
        }
        return i10 * 2;
    }
}
