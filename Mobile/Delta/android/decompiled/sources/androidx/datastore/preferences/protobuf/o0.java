package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m0 f2096a = c();
    public static final m0 b = new n0();

    public static m0 a() {
        return f2096a;
    }

    public static m0 b() {
        return b;
    }

    public static m0 c() {
        if (c1.f1997d) {
            return null;
        }
        try {
            return (m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
