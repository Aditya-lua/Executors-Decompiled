package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class j3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o3 f6559e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6560f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(z3 z3Var, o3 o3Var) {
        super(z3Var, true);
        this.f6559e = o3Var;
        Objects.requireNonNull(z3Var);
        this.f6560f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6560f.m())).setEventInterceptor(this.f6559e);
    }
}
