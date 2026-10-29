package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.n */
/* JADX INFO: loaded from: classes.dex */
public final class C0861n {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f2955a = m3888c();

    /* JADX INFO: renamed from: a */
    public static C0864o m3886a() {
        C0864o c0864oM3887b = m3887b("getEmptyRegistry");
        return c0864oM3887b != null ? c0864oM3887b : C0864o.f2958c;
    }

    /* JADX INFO: renamed from: b */
    public static final C0864o m3887b(String str) {
        Class<?> cls = f2955a;
        if (cls == null) {
            return null;
        }
        try {
            return (C0864o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static Class<?> m3888c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
