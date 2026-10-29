package d8;

/* JADX INFO: loaded from: classes.dex */
public final class d {
    public static <T> void a(T t8, Class<T> cls) {
        if (t8 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    public static <T> T b(T t8) {
        t8.getClass();
        return t8;
    }

    public static <T> T c(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }
}
