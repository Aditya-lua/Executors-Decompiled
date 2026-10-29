package com.google.android.gms.internal.measurement;

import android.app.Activity;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.r3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2277r3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Activity f8604e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ BinderC2275r1 f8605f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2331u3 f8606g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2277r3(C2331u3 c2331u3, Activity activity, BinderC2275r1 binderC2275r1) {
        super(c2331u3.f8681a, true);
        this.f8604e = activity;
        this.f8605f = binderC2275r1;
        Objects.requireNonNull(c2331u3);
        this.f8606g = c2331u3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8606g.f8681a.m10814m())).onActivitySaveInstanceStateByScionActivityInfo(zzdf.m11161a(this.f8604e), this.f8605f, this.f8336b);
    }
}
