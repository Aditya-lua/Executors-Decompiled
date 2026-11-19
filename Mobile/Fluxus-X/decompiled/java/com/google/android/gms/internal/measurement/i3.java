package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class i3 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(z3 z3Var, boolean z10) {
        super(z3Var, true);
        this.f6542e = z10;
        Objects.requireNonNull(z3Var);
        this.f6543f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6543f.m())).setDataCollectionEnabled(this.f6542e);
    }
}
