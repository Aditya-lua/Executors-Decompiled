package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class a3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f6366e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6367f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a3(z3 z3Var, r1 r1Var) {
        super(z3Var, true);
        this.f6366e = r1Var;
        Objects.requireNonNull(z3Var);
        this.f6367f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6367f.m())).getCurrentScreenName(this.f6366e);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void b() {
        this.f6366e.l(null);
    }
}
