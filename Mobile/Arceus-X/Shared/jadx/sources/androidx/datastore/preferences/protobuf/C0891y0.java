package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.y0 */
/* JADX INFO: loaded from: classes.dex */
public final class C0891y0 {

    /* JADX INFO: renamed from: a */
    public static final InterfaceC0887w0 f3155a = m4235c();

    /* JADX INFO: renamed from: b */
    public static final InterfaceC0887w0 f3156b = new C0889x0();

    /* JADX INFO: renamed from: a */
    public static InterfaceC0887w0 m4233a() {
        return f3155a;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC0887w0 m4234b() {
        return f3156b;
    }

    /* JADX INFO: renamed from: c */
    public static InterfaceC0887w0 m4235c() {
        if (C0830c1.f2837d) {
            return null;
        }
        try {
            return (InterfaceC0887w0) Class.forName("androidx.datastore.preferences.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
