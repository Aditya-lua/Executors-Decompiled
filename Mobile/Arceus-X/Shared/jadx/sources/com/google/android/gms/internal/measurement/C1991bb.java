package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.bb */
/* JADX INFO: loaded from: classes.dex */
public final class C1991bb implements InterfaceC2196mc {

    /* JADX INFO: renamed from: a */
    public static final C1991bb f8113a = new C1991bb();

    /* JADX INFO: renamed from: c */
    public static C1991bb m9793c() {
        return f8113a;
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2196mc
    /* JADX INFO: renamed from: a */
    public final boolean mo9794a(Class cls) {
        return AbstractC2086gb.class.isAssignableFrom(cls);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2196mc
    /* JADX INFO: renamed from: b */
    public final InterfaceC2178lc mo9795b(Class cls) {
        if (!AbstractC2086gb.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (InterfaceC2178lc) AbstractC2086gb.m10056s(cls.asSubclass(AbstractC2086gb.class)).mo9579E(3, null, null);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e10);
        }
    }
}
