package p504w1;

import java.lang.reflect.Array;

/* JADX INFO: renamed from: w1.c */
/* JADX INFO: loaded from: classes.dex */
public class C12279c {
    /* JADX INFO: renamed from: a */
    public static <T> T[] m45593a(T[] tArr, int i10) {
        if (tArr.length < i10) {
            return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
        }
        if (tArr.length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }
}
