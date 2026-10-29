package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;
import p571y9.BinderC13134b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.a3 */
/* JADX INFO: loaded from: classes.dex */
public final class C1964a3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8089e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f8090f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2349v3 f8091g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1964a3(C2349v3 c2349v3, boolean z10, int i10, String str, Object obj, Object obj2, Object obj3) {
        super(c2349v3, false);
        this.f8089e = str;
        this.f8090f = obj;
        Objects.requireNonNull(c2349v3);
        this.f8091g = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8091g.m10814m())).logHealthData(5, this.f8089e, BinderC13134b.m48743u2(this.f8090f), BinderC13134b.m48743u2(null), BinderC13134b.m48743u2(null));
    }
}
