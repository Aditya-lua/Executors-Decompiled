package ie;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: ie.n0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6785n0 {
    /* JADX INFO: renamed from: a */
    public static <T> T[] m29021a(Object[] objArr, int i10, int i11, T[] tArr) {
        return (T[]) Arrays.copyOfRange(objArr, i10, i11, tArr.getClass());
    }

    /* JADX INFO: renamed from: b */
    public static <T> T[] m29022b(T[] tArr, int i10) {
        return (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i10));
    }

    /* JADX INFO: renamed from: c */
    public static <E> Set<E> m29023c() {
        return C6776j.m28969f();
    }

    /* JADX INFO: renamed from: d */
    public static <K, V> Map<K, V> m29024d() {
        return C6774i.m28924s();
    }
}
