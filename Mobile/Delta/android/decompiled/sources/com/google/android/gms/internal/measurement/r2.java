package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class r2 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6829a;

    public r2(s2 s2Var, Runnable runnable) {
        this.f6829a = runnable;
        Objects.requireNonNull(s2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a2
    public final void zze() {
        this.f6829a.run();
    }
}
