package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class w2 extends n3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f6900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ z3 f6901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w2(z3 z3Var, Runnable runnable) {
        super(z3Var, true);
        this.f6900e = runnable;
        Objects.requireNonNull(z3Var);
        this.f6901f = z3Var;
    }

    @Override // com.google.android.gms.internal.measurement.n3
    public final void a() {
        ((u1) o9.s.l(this.f6901f.m())).retrieveAndUploadBatches(new v2(this, this.f6900e));
    }
}
