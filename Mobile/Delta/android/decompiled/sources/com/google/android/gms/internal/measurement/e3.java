package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class e3 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f6423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6424f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e3(v3 v3Var, boolean z10) {
        super(v3Var, true);
        this.f6423e = z10;
        Objects.requireNonNull(v3Var);
        this.f6424f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6424f.m())).setDataCollectionEnabled(this.f6423e);
    }
}
