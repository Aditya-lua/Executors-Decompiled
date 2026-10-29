package com.google.android.gms.internal.measurement;

import com.appsflyer.sdk_base.referrer.Payload;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.dh */
/* JADX INFO: loaded from: classes.dex */
public final class C2035dh extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final C2111hh f8152c;

    public C2035dh(C2111hh c2111hh) {
        super("internal.registerCallback");
        this.f8152c = c2111hh;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        C2351v5.m10828a(this.f8356a, 3, list);
        String strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc();
        InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(1));
        if (!(interfaceC2255qM10776a instanceof C2237p)) {
            throw new IllegalArgumentException("Invalid callback type");
        }
        InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(2));
        if (!(interfaceC2255qM10776a2 instanceof C2201n)) {
            throw new IllegalArgumentException("Invalid callback params");
        }
        C2201n c2201n = (C2201n) interfaceC2255qM10776a2;
        if (!c2201n.mo9954g(Payload.TYPE)) {
            throw new IllegalArgumentException("Undefined rule type");
        }
        this.f8152c.m10277a(strZzc, c2201n.mo9954g("priority") ? C2351v5.m10834g(c2201n.mo9951c("priority").zzd().doubleValue()) : 1000, (C2237p) interfaceC2255qM10776a, c2201n.mo9951c(Payload.TYPE).zzc());
        return InterfaceC2255q.f8587zo;
    }
}
