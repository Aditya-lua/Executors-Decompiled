package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class o2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6735e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f6736f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r1 f6737g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ z3 f6738h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(z3 z3Var, String str, String str2, r1 r1Var) {
        super(z3Var, true);
        this.f6735e = str;
        this.f6736f = str2;
        this.f6737g = r1Var;
        Objects.requireNonNull(z3Var);
        this.f6738h = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6738h.m())).getConditionalUserProperties(this.f6735e, this.f6736f, this.f6737g);
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void b() {
        this.f6737g.l(null);
    }
}
