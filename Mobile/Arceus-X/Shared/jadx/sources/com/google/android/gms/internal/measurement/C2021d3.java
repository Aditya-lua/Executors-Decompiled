package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.d3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2021d3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8145e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2275r1 f8146f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2349v3 f8147g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2021d3(C2349v3 c2349v3, String str, BinderC2275r1 binderC2275r1) {
        super(c2349v3, true);
        this.f8145e = str;
        this.f8146f = binderC2275r1;
        Objects.requireNonNull(c2349v3);
        this.f8147g = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8147g.m10814m())).getMaxUserProperties(this.f8145e, this.f8146f);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: b */
    public final void mo9843b() {
        this.f8146f.mo10588l(null);
    }
}
