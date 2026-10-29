package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class i0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f6483a;
    public final String b;

    public i0(u4 u4Var, String str) {
        this.f6483a = u4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final u4 a(q qVar) {
        u4 u4Var = this.f6483a;
        u4Var.f(this.b, qVar);
        return u4Var;
    }
}
