package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class f0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u4 f6436a;
    public final String b;

    public f0(u4 u4Var, String str) {
        this.f6436a = u4Var;
        this.b = str;
    }

    @Override // com.google.android.gms.internal.measurement.h0
    public final u4 a(q qVar) {
        u4 u4VarC = this.f6436a.c();
        u4VarC.g(this.b, qVar);
        return u4VarC;
    }
}
