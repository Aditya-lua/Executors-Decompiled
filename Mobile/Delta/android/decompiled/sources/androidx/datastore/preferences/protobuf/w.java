package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
public class w implements q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f2382a = new w();

    public static w c() {
        return f2382a;
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public p0 a(Class<?> cls) {
        if (!x.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (p0) x.C(cls.asSubclass(x.class)).q();
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.q0
    public boolean b(Class<?> cls) {
        return x.class.isAssignableFrom(cls);
    }
}
