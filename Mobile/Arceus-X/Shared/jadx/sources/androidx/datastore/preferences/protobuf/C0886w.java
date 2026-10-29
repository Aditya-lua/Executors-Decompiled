package androidx.datastore.preferences.protobuf;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.w */
/* JADX INFO: loaded from: classes.dex */
public class C0886w implements InterfaceC0871q0 {

    /* JADX INFO: renamed from: a */
    public static final C0886w f3134a = new C0886w();

    /* JADX INFO: renamed from: c */
    public static C0886w m4170c() {
        return f3134a;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0871q0
    /* JADX INFO: renamed from: a */
    public InterfaceC0868p0 mo3748a(Class<?> cls) {
        if (!AbstractC0888x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (InterfaceC0868p0) AbstractC0888x.m4173C(cls.asSubclass(AbstractC0888x.class)).m4193q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0871q0
    /* JADX INFO: renamed from: b */
    public boolean mo3749b(Class<?> cls) {
        return AbstractC0888x.class.isAssignableFrom(cls);
    }
}
