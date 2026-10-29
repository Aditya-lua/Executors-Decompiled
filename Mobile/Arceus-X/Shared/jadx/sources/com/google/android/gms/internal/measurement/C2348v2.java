package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2348v2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BinderC2275r1 f8700e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2349v3 f8701f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2348v2(C2349v3 c2349v3, BinderC2275r1 binderC2275r1) {
        super(c2349v3, true);
        this.f8700e = binderC2275r1;
        Objects.requireNonNull(c2349v3);
        this.f8701f = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8701f.m10814m())).generateEventId(this.f8700e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: b */
    public final void mo9843b() {
        this.f8700e.mo10588l(null);
    }
}
