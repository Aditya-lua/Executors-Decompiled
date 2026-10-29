package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f6451a;
    public final String b;

    public g0(u4 u4Var, String str) {
        this.f6451a = u4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final u4 a(q qVar) {
        u4 u4VarC = this.f6451a.c();
        u4VarC.f(this.b, qVar);
        return u4VarC;
    }
}
