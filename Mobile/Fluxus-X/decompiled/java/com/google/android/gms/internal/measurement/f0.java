package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y4 f6501a;
    public final String b;

    public f0(y4 y4Var, String str) {
        this.f6501a = y4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final y4 a(q qVar) {
        y4 y4VarC = this.f6501a.c();
        y4VarC.g(this.b, qVar);
        return y4VarC;
    }
}
