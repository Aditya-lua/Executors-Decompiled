package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.c3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2002c3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Bundle f8125e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2275r1 f8126f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2349v3 f8127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2002c3(C2349v3 c2349v3, Bundle bundle, BinderC2275r1 binderC2275r1) {
        super(c2349v3, true);
        this.f8125e = bundle;
        this.f8126f = binderC2275r1;
        Objects.requireNonNull(c2349v3);
        this.f8127g = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8127g.m10814m())).performAction(this.f8125e, this.f8126f, this.f8335a);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: b */
    public final void mo9843b() {
        this.f8126f.mo10588l(null);
    }
}
