package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class bb implements mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final bb f6389a = new bb();

    public static bb c() {
        return f6389a;
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final boolean a(Class cls) {
        return gb.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final lc b(Class cls) {
        if (!gb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (lc) gb.t(cls.asSubclass(gb.class)).E(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
