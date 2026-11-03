package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f0 f2040a = c();
    public static final f0 b = new g0();

    public static f0 a() {
        return f2040a;
    }

    public static f0 b() {
        return b;
    }

    public static f0 c() {
        if (c1.f1997d) {
            return null;
        }
        try {
            return (f0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
