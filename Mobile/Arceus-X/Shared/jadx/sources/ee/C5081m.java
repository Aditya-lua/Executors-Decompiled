package ee;

/* JADX INFO: renamed from: ee.m */
/* JADX INFO: loaded from: classes2.dex */
public final class C5081m {
    /* JADX INFO: renamed from: a */
    public static int m23815a(int i10, int i11, String str) {
        String strM23819a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strM23819a = C5083n.m23819a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strM23819a = C5083n.m23819a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strM23819a);
    }

    /* JADX INFO: renamed from: b */
    public static int m23816b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m23818d(i10, i11, "index"));
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static void m23817c(int i10, int i11, int i12) {
        String strM23818d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM23818d = m23818d(i10, i12, "start index");
            } else {
                strM23818d = (i11 < 0 || i11 > i12) ? m23818d(i11, i12, "end index") : C5083n.m23819a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM23818d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m23818d(int i10, int i11, String str) {
        if (i10 < 0) {
            return C5083n.m23819a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C5083n.m23819a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
