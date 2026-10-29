package p071d8;

/* JADX INFO: renamed from: d8.d */
/* JADX INFO: loaded from: classes.dex */
public final class C4472d {
    /* JADX INFO: renamed from: a */
    public static <T> void m22417a(T t8, Class<T> cls) {
        if (t8 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m22418b(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m22419c(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }
}
