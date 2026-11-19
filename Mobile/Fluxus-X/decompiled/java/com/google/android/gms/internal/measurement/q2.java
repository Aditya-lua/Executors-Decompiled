package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class q2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Boolean f6783e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6784f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q2(z3 z3Var, Boolean bool) {
        super(z3Var, true);
        this.f6783e = bool;
        Objects.requireNonNull(z3Var);
        this.f6784f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6784f.m())).setMeasurementEnabled(this.f6783e.booleanValue(), this.f6717a);
    }
}
