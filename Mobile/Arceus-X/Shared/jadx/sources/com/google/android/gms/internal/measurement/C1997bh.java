package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.bh */
/* JADX INFO: loaded from: classes.dex */
public final class C1997bh extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final InterfaceC2091gg f8120c;

    public C1997bh(InterfaceC2091gg interfaceC2091gg) {
        super("internal.logger");
        this.f8120c = interfaceC2091gg;
        this.f8357b.put("log", new C1978ah(this, false, true));
        this.f8357b.put("silent", new C2032de(this, "silent"));
        ((AbstractC2147k) this.f8357b.get("silent")).mo9952d("log", new C1978ah(this, true, true));
        this.f8357b.put("unmonitored", new C2052ef(this, "unmonitored"));
        ((AbstractC2147k) this.f8357b.get("unmonitored")).mo9952d("log", new C1978ah(this, false, false));
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        return InterfaceC2255q.f8587zo;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC2091gg m9831j() {
        return this.f8120c;
    }
}
