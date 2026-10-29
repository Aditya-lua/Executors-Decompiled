package p136ft;

/* JADX INFO: renamed from: ft.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C5834h {
    /* JADX INFO: renamed from: a */
    public static <T> void m26190a(T t8, Class<T> cls) {
        if (t8 != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m26191b(T t8) {
        t8.getClass();
        return t8;
    }

    /* JADX INFO: renamed from: c */
    public static <T> T m26192c(T t8, String str) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException(str);
    }

    /* JADX INFO: renamed from: d */
    public static <T> T m26193d(T t8, String str, Object obj) {
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

    /* JADX INFO: renamed from: e */
    public static <T> T m26194e(T t8) {
        if (t8 != null) {
            return t8;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
