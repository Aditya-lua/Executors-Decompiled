package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class ic implements qc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qc[] f6548a;

    public ic(qc... qcVarArr) {
        this.f6548a = qcVarArr;
    }

    @Override // com.google.android.gms.internal.measurement.qc
    public final boolean a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f6548a[i10].a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.qc
    public final pc b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            qc qcVar = this.f6548a[i10];
            if (qcVar.a(cls)) {
                return qcVar.b(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
