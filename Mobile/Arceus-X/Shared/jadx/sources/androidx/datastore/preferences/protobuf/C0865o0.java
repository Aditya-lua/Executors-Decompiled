package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.o0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0865o0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0859m0 f2962a = m3915c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0859m0 f2963b = new C0862n0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0859m0 m3913a() {
        return f2962a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0859m0 m3914b() {
        return f2963b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0859m0 m3915c() {
        if (C0830c1.f2837d) {
            return null;
        }
        try {
            return (InterfaceC0859m0) Class.forName("androidx.datastore.preferences.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
