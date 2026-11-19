package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4 f6511a;
    public final String b;

    public g0(y4 y4Var, String str) {
        this.f6511a = y4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final y4 a(q qVar) {
        y4 y4VarC = this.f6511a.c();
        y4VarC.f(this.b, qVar);
        return y4VarC;
    }
}
