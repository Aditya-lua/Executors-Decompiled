package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0831d {

    /* JADX INFO: renamed from: a */
    public static boolean f2840a;

    /* JADX INFO: renamed from: b */
    public static final Class<?> f2841b = m3368a("libcore.io.Memory");

    /* JADX INFO: renamed from: c */
    public static final boolean f2842c;

    static {
        f2842c = (f2840a || m3368a("org.robolectric.Robolectric") == null) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static <T> Class<T> m3368a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Class<?> m3369b() {
        return f2841b;
    }

    /* JADX INFO: renamed from: c */
    public static boolean m3370c() {
        if (f2840a) {
            return true;
        }
        return (f2841b == null || f2842c) ? false : true;
    }
}
