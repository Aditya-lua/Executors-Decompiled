package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class k3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3 f6572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6573f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3(z3 z3Var, p3 p3Var) {
        super(z3Var, true);
        this.f6572e = p3Var;
        Objects.requireNonNull(z3Var);
        this.f6573f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6573f.m())).registerOnMeasurementEventListener(this.f6572e);
    }
}
