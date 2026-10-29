package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class o4 implements v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o4 f7198a = new o4();

    public static o4 c() {
        return f7198a;
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final u5 a(Class cls) {
        if (!t4.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (u5) t4.t(cls.asSubclass(t4.class)).p(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final boolean b(Class cls) {
        return t4.class.isAssignableFrom(cls);
    }
}
