package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class v2 extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f6872a;

    public v2(w2 w2Var, Runnable runnable) {
        this.f6872a = runnable;
        Objects.requireNonNull(w2Var);
    }

    @Override // com.google.android.gms.internal.measurement.a2
    public final void zze() {
        this.f6872a.run();
    }
}
