package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0873r {

    /* JADX INFO: renamed from: a */
    public static final AbstractC0867p<?> f2995a = new C0870q();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0867p<?> f2996b = m4024c();

    /* JADX INFO: renamed from: a */
    public static AbstractC0867p<?> m4022a() {
        AbstractC0867p<?> abstractC0867p = f2996b;
        if (abstractC0867p != null) {
            return abstractC0867p;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    /* JADX INFO: renamed from: b */
    public static AbstractC0867p<?> m4023b() {
        return f2995a;
    }

    /* JADX INFO: renamed from: c */
    public static AbstractC0867p<?> m4024c() {
        if (C0830c1.f2837d) {
            return null;
        }
        try {
            return (AbstractC0867p) Class.forName("androidx.datastore.preferences.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
            return null;
        }
    }
}
