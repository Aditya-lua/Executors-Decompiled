package p100eb;

/* JADX INFO: renamed from: eb.r1 */
/* JADX INFO: loaded from: classes.dex */
public final class C4998r1 {
    /* JADX INFO: renamed from: a */
    public static Object m23697a(Object obj, int i10) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i10);
    }

    /* JADX INFO: renamed from: b */
    public static Object[] m23698b(Object[] objArr, int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            m23697a(objArr[i11], i11);
        }
        return objArr;
    }
}
