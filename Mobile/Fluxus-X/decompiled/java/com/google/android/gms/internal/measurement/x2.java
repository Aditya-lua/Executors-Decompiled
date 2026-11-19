package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class x2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f6919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6920f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2(z3 z3Var, r1 r1Var) {
        super(z3Var, true);
        this.f6919e = r1Var;
        Objects.requireNonNull(z3Var);
        this.f6920f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6920f.m())).getGmpAppId(this.f6919e);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void b() {
        this.f6919e.l(null);
    }
}
