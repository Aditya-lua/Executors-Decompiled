package w1;

import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes.dex */
public class c {
    public static <T> T[] a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
