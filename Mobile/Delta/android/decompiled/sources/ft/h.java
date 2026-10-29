package ft;

/* JADX INFO: loaded from: classes3.dex */
public final class h {
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

    public static <T> T d(T t8, String str, Object obj) {
        if (t8 != null) {
            return t8;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (str.indexOf("%s") != str.lastIndexOf("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
        }
        if (obj instanceof Class) {
            obj = ((Class) obj).getCanonicalName();
        }
        throw new NullPointerException(str.replace("%s", String.valueOf(obj)));
    }

    public static <T> T e(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
