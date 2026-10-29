package p169he;

/* JADX INFO: renamed from: he.n */
/* JADX INFO: loaded from: classes2.dex */
public final class C6384n {
    /* JADX INFO: renamed from: a */
    public static String m27917a(int i10, int i11, String str) {
        if (i10 < 0) {
            return C6388r.m27957c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C6388r.m27957c("%s (%s) must be less than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: b */
    public static String m27918b(int i10, int i11, String str) {
        if (i10 < 0) {
            return C6388r.m27957c("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return C6388r.m27957c("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        StringBuilder sb2 = new StringBuilder(26);
        sb2.append("negative size: ");
        sb2.append(i11);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX INFO: renamed from: c */
    public static String m27919c(int i10, int i11, int i12) {
        if (i10 < 0 || i10 > i12) {
            return m27918b(i10, i12, "start index");
        }
        return (i11 < 0 || i11 > i12) ? m27918b(i11, i12, "end index") : C6388r.m27957c("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
    }

    /* JADX INFO: renamed from: d */
    public static void m27920d(boolean z10) {
        if (!z10) {
            throw new IllegalArgumentException();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m27921e(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m27922f(boolean z10, String str, char c10) {
        if (!z10) {
            throw new IllegalArgumentException(C6388r.m27957c(str, Character.valueOf(c10)));
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m27923g(boolean z10, String str, int i10, int i11) {
        if (!z10) {
            throw new IllegalArgumentException(C6388r.m27957c(str, Integer.valueOf(i10), Integer.valueOf(i11)));
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m27924h(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalArgumentException(C6388r.m27957c(str, obj));
        }
    }

    /* JADX INFO: renamed from: i */
    public static void m27925i(boolean z10, String str, Object obj, Object obj2) {
        if (!z10) {
            throw new IllegalArgumentException(C6388r.m27957c(str, obj, obj2));
        }
    }

    /* JADX INFO: renamed from: j */
    public static int m27926j(int i10, int i11) {
        return m27927k(i10, i11, "index");
    }

    /* JADX INFO: renamed from: k */
    public static int m27927k(int i10, int i11, String str) {
        if (i10 < 0 || i10 >= i11) {
            throw new IndexOutOfBoundsException(m27917a(i10, i11, str));
        }
        return i10;
    }

    /* JADX INFO: renamed from: l */
    public static <T> T m27928l(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: m */
    public static <T> T m27929m(T t8, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    /* JADX INFO: renamed from: n */
    public static <T> T m27930n(T t8, String str, Object obj) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(C6388r.m27957c(str, obj));
    }

    /* JADX INFO: renamed from: o */
    public static int m27931o(int i10, int i11) {
        return m27932p(i10, i11, "index");
    }

    /* JADX INFO: renamed from: p */
    public static int m27932p(int i10, int i11, String str) {
        if (i10 < 0 || i10 > i11) {
            throw new IndexOutOfBoundsException(m27918b(i10, i11, str));
        }
        return i10;
    }

    /* JADX INFO: renamed from: q */
    public static void m27933q(int i10, int i11, int i12) {
        if (i10 < 0 || i11 < i10 || i11 > i12) {
            throw new IndexOutOfBoundsException(m27919c(i10, i11, i12));
        }
    }

    /* JADX INFO: renamed from: r */
    public static void m27934r(boolean z10) {
        if (!z10) {
            throw new IllegalStateException();
        }
    }

    /* JADX INFO: renamed from: s */
    public static void m27935s(boolean z10, Object obj) {
        if (!z10) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m27936t(boolean z10, String str, Object obj) {
        if (!z10) {
            throw new IllegalStateException(C6388r.m27957c(str, obj));
        }
    }
}
