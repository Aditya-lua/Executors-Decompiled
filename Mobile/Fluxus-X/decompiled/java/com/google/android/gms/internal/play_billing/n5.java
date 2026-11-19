package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class n5 implements v5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v5[] f7190a;

    public n5(v5... v5VarArr) {
        this.f7190a = v5VarArr;
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final u5 a(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            v5 v5Var = this.f7190a[i10];
            if (v5Var.b(cls)) {
                return v5Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.android.gms.internal.play_billing.v5
    public final boolean b(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f7190a[i10].b(cls)) {
                return true;
            }
        }
        return false;
    }
}
