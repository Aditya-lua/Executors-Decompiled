package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2330u2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ BinderC2275r1 f8679e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2349v3 f8680f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2330u2(C2349v3 c2349v3, BinderC2275r1 binderC2275r1) {
        super(c2349v3, true);
        this.f8679e = binderC2275r1;
        Objects.requireNonNull(c2349v3);
        this.f8680f = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8680f.m10814m())).getCachedAppInstanceId(this.f8679e);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: b */
    public final void mo9843b() {
        this.f8679e.mo10588l(null);
    }
}
