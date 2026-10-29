package com.google.android.gms.internal.measurement;

import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z2 */
/* JADX INFO: loaded from: classes.dex */
public final class C2420z2 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ String f8876e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f8877f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ boolean f8878g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ BinderC2275r1 f8879h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2349v3 f8880i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2420z2(C2349v3 c2349v3, String str, String str2, boolean z10, BinderC2275r1 binderC2275r1) {
        super(c2349v3, true);
        this.f8876e = str;
        this.f8877f = str2;
        this.f8878g = z10;
        this.f8879h = binderC2275r1;
        Objects.requireNonNull(c2349v3);
        this.f8880i = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        ((InterfaceC2329u1) C8953m.m36047l(this.f8880i.m10814m())).getUserProperties(this.f8876e, this.f8877f, this.f8878g, this.f8879h);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: b */
    public final void mo9843b() {
        this.f8879h.mo10588l(null);
    }
}
