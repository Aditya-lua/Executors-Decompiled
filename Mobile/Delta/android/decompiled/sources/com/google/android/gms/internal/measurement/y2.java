package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class y2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f7026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f7027f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(v3 v3Var, r1 r1Var) {
        super(v3Var, true);
        this.f7026e = r1Var;
        Objects.requireNonNull(v3Var);
        this.f7027f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f7027f.m())).getCurrentScreenClass(this.f7026e);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f7026e.l(null);
    }
}
