package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p<?> f2087a = new q();
    public static final p<?> b = c();

    public static p<?> a() {
        p<?> pVar = b;
        if (pVar != null) {
            return pVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    public static p<?> b() {
        return f2087a;
    }

    public static p<?> c() {
        if (c1.f1958d) {
            return null;
        }
        try {
            return (p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
