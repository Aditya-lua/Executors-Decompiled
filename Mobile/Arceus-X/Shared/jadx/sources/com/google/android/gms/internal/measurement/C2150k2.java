package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.k2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2150k2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f8359e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2349v3 f8360f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2150k2(C2349v3 c2349v3, Bundle bundle) {
        super(c2349v3, true);
        this.f8359e = bundle;
        Objects.requireNonNull(c2349v3);
        this.f8360f = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8360f.m10814m())).setConditionalUserProperty(this.f8359e, this.f8335a);
    }
}
