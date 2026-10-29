package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.p2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2240p2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8555e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2349v3 f8556f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2240p2(C2349v3 c2349v3, String str) {
        super(c2349v3, true);
        this.f8555e = str;
        Objects.requireNonNull(c2349v3);
        this.f8556f = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8556f.m10814m())).beginAdUnitExposure(this.f8555e, this.f8336b);
    }
}
