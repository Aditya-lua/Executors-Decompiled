package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f6842e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6843f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(z3 z3Var, String str) {
        super(z3Var, true);
        this.f6842e = str;
        Objects.requireNonNull(z3Var);
        this.f6843f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6843f.m())).beginAdUnitExposure(this.f6842e, this.b);
    }
}
