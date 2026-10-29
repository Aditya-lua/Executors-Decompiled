package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2408y8 extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final C1998c f8864c;

    public C2408y8(C1998c c1998c) {
        super("internal.eventLogger");
        this.f8864c = c1998c;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        C2351v5.m10828a(this.f8356a, 3, list);
        String strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc();
        long jM10836i = (long) C2351v5.m10836i(c2332u4.m10776a((InterfaceC2255q) list.get(1)).zzd().doubleValue());
        InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(2));
        this.f8864c.m9836e(strZzc, jM10836i, interfaceC2255qM10776a instanceof C2201n ? C2351v5.m10838k((C2201n) interfaceC2255qM10776a) : new HashMap());
        return InterfaceC2255q.f8587zo;
    }
}
