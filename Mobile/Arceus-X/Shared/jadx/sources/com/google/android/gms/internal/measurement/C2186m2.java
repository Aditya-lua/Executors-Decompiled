package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2186m2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8409e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f8410f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ BinderC2275r1 f8411g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2349v3 f8412h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2186m2(C2349v3 c2349v3, String str, String str2, BinderC2275r1 binderC2275r1) {
        super(c2349v3, true);
        this.f8409e = str;
        this.f8410f = str2;
        this.f8411g = binderC2275r1;
        Objects.requireNonNull(c2349v3);
        this.f8412h = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8412h.m10814m())).getConditionalUserProperties(this.f8409e, this.f8410f, this.f8411g);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: b */
    public final void mo9843b() {
        this.f8411g.mo10588l(null);
    }
}
