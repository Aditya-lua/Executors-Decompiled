package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r1 f6534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ z3 f6535g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(z3 z3Var, String str, r1 r1Var) {
        super(z3Var, true);
        this.f6533e = str;
        this.f6534f = r1Var;
        Objects.requireNonNull(z3Var);
        this.f6535g = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6535g.m())).getMaxUserProperties(this.f6533e, this.f6534f);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void b() {
        this.f6534f.l(null);
    }
}
