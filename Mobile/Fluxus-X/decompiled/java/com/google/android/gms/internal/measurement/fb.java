package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class fb implements qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final fb f6504a = new fb();

    public static fb c() {
        return f6504a;
    }

    @Override // com.google.android.gms.internal.measurement.qc
    public final boolean a(Class cls) {
        return kb.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.qc
    public final pc b(Class cls) {
        if (!kb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (pc) kb.s(cls.asSubclass(kb.class)).E(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
