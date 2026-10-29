package p292mf;

/* JADX INFO: renamed from: mf.d0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8495d0 {
    /* JADX INFO: renamed from: a */
    public static void m34311a(boolean z10, String str) {
        if (!z10) {
            throw new IllegalArgumentException(str);
        }
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m34312b(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m34313c(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: d */
    public static void m34314d(boolean z10, String str) {
        if (!z10) {
            throw new IllegalStateException(str);
        }
    }
}
