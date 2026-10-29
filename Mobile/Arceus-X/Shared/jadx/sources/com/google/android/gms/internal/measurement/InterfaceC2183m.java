package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.m */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2183m {
    /* JADX INFO: renamed from: b */
    static InterfaceC2255q m10368b(InterfaceC2183m interfaceC2183m, InterfaceC2255q interfaceC2255q, C2332u4 c2332u4, List list) {
        if (interfaceC2183m.mo9954g(interfaceC2255q.zzc())) {
            InterfaceC2255q interfaceC2255qMo9951c = interfaceC2183m.mo9951c(interfaceC2255q.zzc());
            if (interfaceC2255qMo9951c instanceof AbstractC2147k) {
                return ((AbstractC2147k) interfaceC2255qMo9951c).mo9763h(c2332u4, list);
            }
            throw new IllegalArgumentException(String.format("%s is not a function", interfaceC2255q.zzc()));
        }
        if (!"hasOwnProperty".equals(interfaceC2255q.zzc())) {
            throw new IllegalArgumentException(String.format("Object has no function %s", interfaceC2255q.zzc()));
        }
        C2351v5.m10828a("hasOwnProperty", 1, list);
        return interfaceC2183m.mo9954g(c2332u4.m10776a((InterfaceC2255q) list.get(0)).zzc()) ? InterfaceC2255q.f8584Eo : InterfaceC2255q.f8585Fo;
    }

    /* JADX INFO: renamed from: f */
    static Iterator m10369f(Map map) {
        return new C2165l(map.keySet().iterator());
    }

    /* JADX INFO: renamed from: c */
    InterfaceC2255q mo9951c(String str);

    /* JADX INFO: renamed from: d */
    void mo9952d(String str, InterfaceC2255q interfaceC2255q);

    /* JADX INFO: renamed from: g */
    boolean mo9954g(String str);
}
