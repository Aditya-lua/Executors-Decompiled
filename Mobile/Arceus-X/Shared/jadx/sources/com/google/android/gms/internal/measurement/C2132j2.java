package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;
import p571y9.BinderC13134b;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.j2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2132j2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8330e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f8331f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f8332g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f8333h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2349v3 f8334i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2132j2(C2349v3 c2349v3, String str, String str2, Object obj, boolean z10) {
        super(c2349v3, true);
        this.f8330e = str;
        this.f8331f = str2;
        this.f8332g = obj;
        this.f8333h = z10;
        Objects.requireNonNull(c2349v3);
        this.f8334i = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8334i.m10814m())).setUserProperty(this.f8330e, this.f8331f, BinderC13134b.m48743u2(this.f8332g), this.f8333h, this.f8335a);
    }
}
