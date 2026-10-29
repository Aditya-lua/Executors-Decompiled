package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.h0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0844h0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0838f0 f2889a = m3545c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0838f0 f2890b = new C0841g0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0838f0 m3543a() {
        return f2889a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0838f0 m3544b() {
        return f2890b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0838f0 m3545c() {
        if (C0830c1.f2837d) {
            return null;
        }
        try {
            return (InterfaceC0838f0) Class.forName("androidx.datastore.preferences.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
