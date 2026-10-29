package com.google.android.gms.internal.measurement;

import java.util.Objects;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r2 */
/* JADX INFO: loaded from: classes.dex */
public final class BinderC2276r2 extends AbstractBinderC2419z1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Runnable f8603a;

    public BinderC2276r2(C2294s2 c2294s2, Runnable runnable) {
        this.f8603a = runnable;
        Objects.requireNonNull(c2294s2);
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC1963a2
    public final void zze() {
        this.f8603a.run();
    }
}
