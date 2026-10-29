package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w0 f2397a = c();
    public static final w0 b = new x0();

    public static w0 a() {
        return f2397a;
    }

    public static w0 b() {
        return b;
    }

    public static w0 c() {
        if (c1.f2152d) {
            return null;
        }
        try {
            return (w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
