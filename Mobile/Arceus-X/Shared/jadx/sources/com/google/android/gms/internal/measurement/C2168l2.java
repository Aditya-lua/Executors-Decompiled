package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.l2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2168l2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8387e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f8388f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Bundle f8389g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2349v3 f8390h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2168l2(C2349v3 c2349v3, String str, String str2, Bundle bundle) {
        super(c2349v3, true);
        this.f8387e = str;
        this.f8388f = str2;
        this.f8389g = bundle;
        Objects.requireNonNull(c2349v3);
        this.f8390h = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8390h.m10814m())).clearConditionalUserProperty(this.f8387e, this.f8388f, this.f8389g);
    }
}
