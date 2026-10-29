package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import java.util.Objects;
import p305n9.C8953m;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i3 */
/* JADX INFO: loaded from: classes.dex */
public final class C2116i3 extends AbstractRunnableC2133j3 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Long f8237e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ String f8238f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f8239g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Bundle f8240h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ boolean f8241i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean f8242j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ C2349v3 f8243k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2116i3(C2349v3 c2349v3, Long l10, String str, String str2, Bundle bundle, boolean z10, boolean z11) {
        super(c2349v3, true);
        this.f8237e = l10;
        this.f8238f = str;
        this.f8239g = str2;
        this.f8240h = bundle;
        this.f8241i = z10;
        this.f8242j = z11;
        Objects.requireNonNull(c2349v3);
        this.f8243k = c2349v3;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractRunnableC2133j3
    /* JADX INFO: renamed from: a */
    public final void mo9575a() {
        Long l10 = this.f8237e;
        ((InterfaceC2329u1) C8953m.m36047l(this.f8243k.m10814m())).logEvent(this.f8238f, this.f8239g, this.f8240h, this.f8241i, this.f8242j, l10 == null ? this.f8335a : l10.longValue());
    }
}
