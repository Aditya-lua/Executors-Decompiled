package p125fb;

/* JADX INFO: renamed from: fb.z0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5581z0 {
    /* JADX INFO: renamed from: a */
    public static int m25235a(int i10, int i11, String str) {
        String strM25151a;
        if (i10 >= 0 && i10 < i11) {
            return i10;
        }
        if (i10 < 0) {
            strM25151a = C5498a1.m25151a("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        } else {
            if (i11 < 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
                sb2.append("negative size: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            strM25151a = C5498a1.m25151a("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IndexOutOfBoundsException(strM25151a);
    }

    /* JADX INFO: renamed from: b */
    public static int m25236b(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m25238d(i10, i11, "index"));
        }
        return i10;
    }

    /* JADX INFO: renamed from: c */
    public static void m25237c(int i10, int i11, int i12) {
        String strM25238d;
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            if (i10 < 0 || i10 > i12) {
                strM25238d = m25238d(i10, i12, "start index");
            } else {
                strM25238d = (i11 < 0 || i11 > i12) ? m25238d(i11, i12, "end index") : C5498a1.m25151a("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            }
            throw new IndexOutOfBoundsException(strM25238d);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m25238d(int i10, int i11, String str) {
        if (i10 < 0) {
            return C5498a1.m25151a("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C5498a1.m25151a("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 15);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }
}
