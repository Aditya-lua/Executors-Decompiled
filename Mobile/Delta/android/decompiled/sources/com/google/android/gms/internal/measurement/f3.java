package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class f3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ k3 f6438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6439f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(v3 v3Var, k3 k3Var) {
        super(v3Var, true);
        this.f6438e = k3Var;
        Objects.requireNonNull(v3Var);
        this.f6439f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6439f.m())).setEventInterceptor(this.f6438e);
    }
}
