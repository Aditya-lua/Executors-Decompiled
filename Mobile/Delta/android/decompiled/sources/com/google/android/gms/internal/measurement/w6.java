package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class w6 {
    public static q a(Object obj) {
        if (obj == null) {
            return q.Ao;
        }
        if (obj instanceof String) {
            return new u((String) obj);
        }
        if (obj instanceof Double) {
            return new j((Double) obj);
        }
        if (obj instanceof Long) {
            return new j(Double.valueOf(((Long) obj).doubleValue()));
        }
        if (obj instanceof Integer) {
            return new j(Double.valueOf(((Integer) obj).doubleValue()));
        }
        if (obj instanceof Boolean) {
            return new g((Boolean) obj);
        }
        if (!(obj instanceof Map)) {
            if (!(obj instanceof List)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            f fVar = new f();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                fVar.p(fVar.k(), a(it.next()));
            }
            return fVar;
        }
        n nVar = new n();
        Map map = (Map) obj;
        for (Object string : map.keySet()) {
            q qVarA = a(map.get(string));
            if (string != null) {
                if (!(string instanceof String)) {
                    string = string.toString();
                }
                nVar.d((String) string, qVarA);
            }
        }
        return nVar;
    }

    public static q b(c8 c8Var) {
        if (c8Var == null) {
            return q.f6743zo;
        }
        int iQ = c8Var.Q() - 1;
        if (iQ == 1) {
            return c8Var.H() ? new u(c8Var.J()) : q.Go;
        }
        if (iQ == 2) {
            return c8Var.N() ? new j(Double.valueOf(c8Var.O())) : new j(null);
        }
        if (iQ == 3) {
            return c8Var.K() ? new g(Boolean.valueOf(c8Var.L())) : new g(null);
        }
        if (iQ != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listF = c8Var.F();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(b((c8) it.next()));
        }
        return new r(c8Var.G(), arrayList);
    }
}
