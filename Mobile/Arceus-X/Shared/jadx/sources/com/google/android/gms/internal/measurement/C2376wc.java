package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.wc */
/* JADX INFO: loaded from: classes.dex */
public final class C2376wc {

    /* JADX INFO: renamed from: c */
    public static final C2376wc f8740c = new C2376wc();

    /* JADX INFO: renamed from: b */
    public final ConcurrentMap f8742b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a */
    public final InterfaceC1974ad f8741a = new C2068fc();

    /* JADX INFO: renamed from: a */
    public static C2376wc m10951a() {
        return f8740c;
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2430zc m10952b(Class cls) {
        C2267qb.m10576a(cls, "messageType");
        ConcurrentMap concurrentMap = this.f8742b;
        InterfaceC2430zc interfaceC2430zcMo9765a = (InterfaceC2430zc) concurrentMap.get(cls);
        if (interfaceC2430zcMo9765a == null) {
            interfaceC2430zcMo9765a = this.f8741a.mo9765a(cls);
            C2267qb.m10576a(cls, "messageType");
            InterfaceC2430zc interfaceC2430zc = (InterfaceC2430zc) concurrentMap.putIfAbsent(cls, interfaceC2430zcMo9765a);
            if (interfaceC2430zc != null) {
                return interfaceC2430zc;
            }
        }
        return interfaceC2430zcMo9765a;
    }
}
