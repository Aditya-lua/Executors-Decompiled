package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f2246a = c();

    public static o a() {
        o oVarB = b("getEmptyRegistry");
        return oVarB != null ? oVarB : o.f2248c;
    }

    public static final o b(String str) {
        Class<?> cls = f2246a;
        if (cls == null) {
            return null;
        }
        try {
            return (o) cls.getDeclaredMethod(str, null).invoke(null, null);
        } catch (Exception unused) {
            return null;
        }
    }

    public static Class<?> c() {
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }
}
