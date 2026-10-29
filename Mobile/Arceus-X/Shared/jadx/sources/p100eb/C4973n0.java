package p100eb;

/* JADX INFO: renamed from: eb.n0 */
/* JADX INFO: loaded from: classes.dex */
public final class C4973n0 {
    /* JADX INFO: renamed from: a */
    public static int m23677a(int i10, int i11, String str) {
        String strM23687a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strM23687a = C4985p0.m23687a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                throw new IllegalArgumentException("negative size: " + i11);
            }
            strM23687a = C4985p0.m23687a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strM23687a);
    }

    /* JADX INFO: renamed from: b */
    public static int m23678b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m23683g(i10, i11, "index"));
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static void m23679c(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m23680d(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(C4985p0.m23687a(str, Character.valueOf(c10)));
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m23681e(int i10, int i11, int i12) {
        String strM23683g;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM23683g = m23683g(i10, i12, "start index");
            } else {
                strM23683g = (i11 < 0 || i11 > i12) ? m23683g(i11, i12, "end index") : C4985p0.m23687a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM23683g);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m23682f(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException((String) obj);
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m23683g(int i10, int i11, String str) {
        if (i10 < 0) {
            return C4985p0.m23687a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C4985p0.m23687a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException("negative size: " + i11);
    }
}
