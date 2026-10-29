package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ec implements mc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mc[] f6429a;

    public ec(mc... mcVarArr) {
        this.f6429a = mcVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f6429a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.mc
    public final lc b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            mc mcVar = this.f6429a[i10];
            if (mcVar.a(cls)) {
                return mcVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
