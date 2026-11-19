package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class u2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6865f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(z3 z3Var, String str) {
        super(z3Var, true);
        this.f6864e = str;
        Objects.requireNonNull(z3Var);
        this.f6865f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6865f.m())).endAdUnitExposure(this.f6864e, this.b);
    }
}
