package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.q3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2259q3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f8591e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2331u3 f8592f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2259q3(C2331u3 c2331u3, Activity activity) {
        super(c2331u3.f8681a, true);
        this.f8591e = activity;
        Objects.requireNonNull(c2331u3);
        this.f8592f = c2331u3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8592f.f8681a.m10814m())).onActivityStoppedByScionActivityInfo(zzdf.m11161a(this.f8591e), this.f8336b);
    }
}
