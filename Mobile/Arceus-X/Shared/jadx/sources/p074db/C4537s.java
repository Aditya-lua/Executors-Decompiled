package p074db;

/* JADX INFO: renamed from: db.s */
/* JADX INFO: loaded from: classes.dex */
public final class C4537s {
    /* JADX INFO: renamed from: a */
    public static void m22509a(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m22510b(int i10, int i11, String str) {
        String strM22514a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strM22514a = C4538t.m22514a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            strM22514a = C4538t.m22514a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strM22514a);
    }

    /* JADX INFO: renamed from: c */
    public static int m22511c(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m22513e(i10, i11, "index"));
        }
        return i10;
    }

    /* JADX INFO: renamed from: d */
    public static void m22512d(int i10, int i11, int i12) {
        String strM22513e;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM22513e = m22513e(i10, i12, "start index");
            } else {
                strM22513e = (i11 < 0 || i11 > i12) ? m22513e(i11, i12, "end index") : C4538t.m22514a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM22513e);
        }
    }

    /* JADX INFO: renamed from: e */
    public static String m22513e(int i10, int i11, String str) {
        if (i10 < 0) {
            return C4538t.m22514a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C4538t.m22514a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
