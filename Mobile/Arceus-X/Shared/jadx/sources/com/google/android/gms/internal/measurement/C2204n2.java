package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.n2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2204n2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ zzdf f8501e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f8502f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f8503g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ C2349v3 f8504h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2204n2(C2349v3 c2349v3, zzdf zzdfVar, String str, String str2) {
        super(c2349v3, true);
        this.f8501e = zzdfVar;
        this.f8502f = str;
        this.f8503g = str2;
        Objects.requireNonNull(c2349v3);
        this.f8504h = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8504h.m10814m())).setCurrentScreenByScionActivityInfo(this.f8501e, this.f8502f, this.f8503g, this.f8335a);
    }
}
