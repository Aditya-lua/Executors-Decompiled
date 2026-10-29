package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r1 f6837e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6838f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2(v3 v3Var, r1 r1Var) {
        super(v3Var, true);
        this.f6837e = r1Var;
        Objects.requireNonNull(v3Var);
        this.f6838f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6838f.m())).generateEventId(this.f6837e);
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void b() {
        this.f6837e.l(null);
    }
}
