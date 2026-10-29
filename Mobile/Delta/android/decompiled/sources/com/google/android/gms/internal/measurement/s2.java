package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class s2 extends j3 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Runnable f6781e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ v3 f6782f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(v3 v3Var, Runnable runnable) {
        super(v3Var, true);
        this.f6781e = runnable;
        Objects.requireNonNull(v3Var);
        this.f6782f = v3Var;
    }

    @Override // com.google.android.gms.internal.measurement.j3
    public final void a() {
        ((u1) n9.m.l(this.f6782f.m())).retrieveAndUploadBatches(new r2(this, this.f6781e));
    }
}
