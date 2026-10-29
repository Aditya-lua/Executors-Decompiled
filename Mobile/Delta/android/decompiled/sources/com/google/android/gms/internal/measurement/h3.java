package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class h3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f6466e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6467f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(v3 v3Var, l3 l3Var) {
        super(v3Var, true);
        this.f6466e = l3Var;
        Objects.requireNonNull(v3Var);
        this.f6467f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6467f.m())).unregisterOnMeasurementEventListener(this.f6466e);
    }
}
