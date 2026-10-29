package ie;

import p169he.C6384n;

/* JADX INFO: renamed from: ie.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6781l0 {
    /* JADX INFO: renamed from: a */
    public static Object m29009a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m29010b(Object... objArr) {
        m29011c(objArr, objArr.length);
        return objArr;
    }

    /* JADX INFO: renamed from: c */
    public static Object[] m29011c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m29009a(objArr[i11], i11);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: d */
    public static <T> T[] m29012d(T[] tArr, int i10) {
        return (T[]) C6785n0.m29022b(tArr, i10);
    }

    /* JADX INFO: renamed from: e */
    public static <T> T[] m29013e(Object[] objArr, int i10, int i11, T[] tArr) {
        C6384n.m27933q(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = (T[]) m29012d(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }
}
