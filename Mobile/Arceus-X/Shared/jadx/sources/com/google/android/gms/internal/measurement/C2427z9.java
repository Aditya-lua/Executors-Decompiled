package com.google.android.gms.internal.measurement;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.z9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2427z9 extends C2201n {

    /* JADX INFO: renamed from: b */
    public final C1998c f8883b;

    public C2427z9(C1998c c1998c) {
        this.f8883b = c1998c;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.gms.internal.measurement.C2201n, com.google.android.gms.internal.measurement.InterfaceC2255q
    /* JADX INFO: renamed from: e */
    public final InterfaceC2255q mo9953e(String str, C2332u4 c2332u4, List list) {
        switch (str.hashCode()) {
            case 21624207:
                if (str.equals("getEventName")) {
                    C2351v5.m10828a("getEventName", 0, list);
                    return new C2327u(this.f8883b.m9834c().m9768b());
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    C2351v5.m10828a("getTimestamp", 0, list);
                    return new C2129j(Double.valueOf(this.f8883b.m9834c().m9767a()));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    C2351v5.m10828a("getParamValue", 1, list);
                    return C2370w6.m10914a(this.f8883b.m9834c().m9771e(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc()));
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    C2351v5.m10828a("getParams", 0, list);
                    Map mapM9772f = this.f8883b.m9834c().m9772f();
                    C2201n c2201n = new C2201n();
                    for (String str2 : mapM9772f.keySet()) {
                        c2201n.mo9952d(str2, C2370w6.m10914a(mapM9772f.get(str2)));
                    }
                    return c2201n;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    C2351v5.m10828a("setParamValue", 2, list);
                    String strZzc = c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc();
                    InterfaceC2255q interfaceC2255qM10776a = c2332u4.m10776a((InterfaceC2255q) list.get(1));
                    this.f8883b.m9834c().m9770d(strZzc, C2351v5.m10837j(interfaceC2255qM10776a));
                    return interfaceC2255qM10776a;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    C2351v5.m10828a("setEventName", 1, list);
                    InterfaceC2255q interfaceC2255qM10776a2 = c2332u4.m10776a((InterfaceC2255q) list.get(0));
                    if (InterfaceC2255q.f8587zo.equals(interfaceC2255qM10776a2) || InterfaceC2255q.f8580Ao.equals(interfaceC2255qM10776a2)) {
                        throw new IllegalArgumentException("Illegal event name");
                    }
                    this.f8883b.m9834c().m9769c(interfaceC2255qM10776a2.zzc());
                    return new C2327u(interfaceC2255qM10776a2.zzc());
                }
                break;
        }
        return super.mo9953e(str, c2332u4, list);
    }
}
