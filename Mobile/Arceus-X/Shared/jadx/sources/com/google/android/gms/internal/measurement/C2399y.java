package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.y */
/* JADX INFO: loaded from: classes.dex */
public final class C2399y {

    /* JADX INFO: renamed from: a */
    public final Map f8858a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final C2166l0 f8859b = new C2166l0();

    public C2399y() {
        m10989a(new C2363w());
        m10989a(new C2417z());
        m10989a(new C1961a0());
        m10989a(new C2037e0());
        m10989a(new C2130j0());
        m10989a(new C2148k0());
        m10989a(new C2184m0());
    }

    /* JADX INFO: renamed from: a */
    public final void m10989a(AbstractC2381x abstractC2381x) {
        Iterator it = abstractC2381x.f8765a.iterator();
        while (it.hasNext()) {
            this.f8858a.put(((EnumC2202n0) it.next()).m10409b().toString(), abstractC2381x);
        }
    }

    /* JADX INFO: renamed from: b */
    public final InterfaceC2255q m10990b(C2332u4 c2332u4, InterfaceC2255q interfaceC2255q) {
        C2351v5.m10839l(c2332u4);
        if (!(interfaceC2255q instanceof C2273r)) {
            return interfaceC2255q;
        }
        C2273r c2273r = (C2273r) interfaceC2255q;
        ArrayList arrayListM10585c = c2273r.m10585c();
        String strM10584b = c2273r.m10584b();
        Map map = this.f8858a;
        return (map.containsKey(strM10584b) ? (AbstractC2381x) map.get(strM10584b) : this.f8859b).mo9574a(strM10584b, c2332u4, arrayListM10585c);
    }
}
