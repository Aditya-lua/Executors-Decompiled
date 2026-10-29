package he;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 {
    public static Object a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        StringBuilder sb2 = new StringBuilder(20);
        sb2.append("at index ");
        sb2.append(i10);
        throw new NullPointerException(sb2.toString());
    }

    public static Object[] b(Object... objArr) {
        c(objArr, objArr.length);
        return objArr;
    }

    public static Object[] c(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            a(objArr[i11], i11);
        }
        return objArr;
    }

    public static <T> T[] d(T[] tArr, int i10) {
        return (T[]) n0.b(tArr, i10);
    }

    public static <T> T[] e(Object[] objArr, int i10, int i11, T[] tArr) {
        ge.n.q(i10, i10 + i11, objArr.length);
        if (tArr.length < i11) {
            tArr = (T[]) d(tArr, i11);
        } else if (tArr.length > i11) {
            tArr[i11] = null;
        }
        System.arraycopy(objArr, i10, tArr, 0, i11);
        return tArr;
    }
}
