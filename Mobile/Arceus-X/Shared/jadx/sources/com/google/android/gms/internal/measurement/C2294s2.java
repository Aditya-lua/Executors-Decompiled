package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.s2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2294s2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Runnable f8634e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2349v3 f8635f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2294s2(C2349v3 c2349v3, Runnable runnable) {
        super(c2349v3, true);
        this.f8634e = runnable;
        Objects.requireNonNull(c2349v3);
        this.f8635f = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8635f.m10814m())).retrieveAndUploadBatches(new BinderC2276r2(this, this.f8634e));
    }
}
