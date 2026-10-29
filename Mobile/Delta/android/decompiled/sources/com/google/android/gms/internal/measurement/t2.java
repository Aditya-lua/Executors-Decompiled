package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class t2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f6798e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6799f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(v3 v3Var, r1 r1Var) {
        super(v3Var, true);
        this.f6798e = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6799f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6799f.m())).getGmpAppId(this.f6798e);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6798e.l(null);
    }
}
