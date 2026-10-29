package com.google.android.gms.internal.measurement;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.eh */
/* JADX INFO: loaded from: classes.dex */
public final class C2054eh extends AbstractC2147k {

    /* JADX INFO: renamed from: c */
    public final C2389x7 f8169c;

    /* JADX INFO: renamed from: d */
    public final Map f8170d;

    public C2054eh(C2389x7 c2389x7) {
        super("require");
        this.f8170d = new HashMap();
        this.f8169c = c2389x7;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2147k
    /* JADX INFO: renamed from: h */
    public final InterfaceC2255q mo9763h(C2332u4 c2332u4, List list) {
        InterfaceC2255q interfaceC2255q;
        C2351v5.m10828a("require", 1, list);
        String strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc();
        Map map = this.f8170d;
        if (map.containsKey(strZzc)) {
            return (InterfaceC2255q) map.get(strZzc);
        }
        Map map2 = this.f8169c.f8771a;
        if (map2.containsKey(strZzc)) {
            try {
                interfaceC2255q = (InterfaceC2255q) ((Callable) map2.get(strZzc)).call();
            } catch (Exception unused) {
                throw new IllegalStateException("Failed to create API implementation: ".concat(String.valueOf(strZzc)));
            }
        } else {
            interfaceC2255q = InterfaceC2255q.f8587zo;
        }
        if (interfaceC2255q instanceof AbstractC2147k) {
            this.f8170d.put(strZzc, (AbstractC2147k) interfaceC2255q);
        }
        return interfaceC2255q;
    }
}
