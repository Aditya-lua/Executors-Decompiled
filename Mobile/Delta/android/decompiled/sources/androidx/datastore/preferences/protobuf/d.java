package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f1999a;
    public static final Class<?> b = a("libcore.io.Memory");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final boolean f2000c;

    static {
        f2000c = (f1999a || a("org.robolectric.Robolectric") == null) ? false : true;
    }

    public static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> b() {
        return b;
    }

    public static boolean c() {
        if (f1999a) {
            return true;
        }
        return (b == null || f2000c) ? false : true;
    }
}
