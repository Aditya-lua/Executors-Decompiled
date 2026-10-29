package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.w6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2370w6 {
    /* JADX INFO: renamed from: a */
    public static InterfaceC2255q m10914a(Object obj) {
        if (obj == null) {
            return InterfaceC2255q.f8580Ao;
        }
        if (obj instanceof String) {
            return new C2327u((String) obj);
        }
        if (obj instanceof Double) {
            return new C2129j((Double) obj);
        }
        if (obj instanceof Long) {
            return new C2129j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new C2129j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new C2074g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            C2055f c2055f = new C2055f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c2055f.m9960p(c2055f.m9957k(), m10914a(it.next()));
            }
            return c2055f;
        }
        C2201n c2201n = new C2201n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            InterfaceC2255q interfaceC2255qM10914a = m10914a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                c2201n.mo9952d((String) string, interfaceC2255qM10914a);
            }
        }
        return c2201n;
    }

    /* JADX INFO: renamed from: b */
    public static InterfaceC2255q m10915b(C2007c8 c2007c8) {
        if (c2007c8 == null) {
            return InterfaceC2255q.f8587zo;
        }
        int iM9868Q = c2007c8.m9868Q() - 1;
        if (iM9868Q == 1) {
            return c2007c8.m9862H() ? new C2327u(c2007c8.m9863J()) : InterfaceC2255q.f8586Go;
        }
        if (iM9868Q == 2) {
            return c2007c8.m9866N() ? new C2129j(Double.valueOf(c2007c8.m9867O())) : new C2129j(null);
        }
        if (iM9868Q == 3) {
            return c2007c8.m9864K() ? new C2074g(Boolean.valueOf(c2007c8.m9865M())) : new C2074g(null);
        }
        if (iM9868Q != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listM9860F = c2007c8.m9860F();
        ArrayList arrayList = new ArrayList();
        Iterator it = listM9860F.iterator();
        while (it.hasNext()) {
            arrayList.add(m10915b((C2007c8) it.next()));
        }
        return new C2273r(c2007c8.m9861G(), arrayList);
    }
}
