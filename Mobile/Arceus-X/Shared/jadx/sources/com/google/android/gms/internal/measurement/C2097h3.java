package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2097h3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BinderC2169l3 f8214e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2349v3 f8215f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2097h3(C2349v3 c2349v3, BinderC2169l3 binderC2169l3) {
        super(c2349v3, true);
        this.f8214e = binderC2169l3;
        Objects.requireNonNull(c2349v3);
        this.f8215f = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8215f.m10814m())).unregisterOnMeasurementEventListener(this.f8214e);
    }
}
