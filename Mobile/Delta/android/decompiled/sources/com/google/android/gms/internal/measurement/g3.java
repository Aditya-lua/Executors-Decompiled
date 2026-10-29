package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class g3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l3 f6455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6456f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g3(v3 v3Var, l3 l3Var) {
        super(v3Var, true);
        this.f6455e = l3Var;
        Objects.requireNonNull(v3Var);
        this.f6456f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6456f.m())).registerOnMeasurementEventListener(this.f6455e);
    }
}
