package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a7 {
    public static q a(Object obj) {
        if (obj == null) {
            return q.Do;
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
                fVar.n(fVar.j(), a(it.next()));
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

    public static q b(g8 g8Var) {
        if (g8Var == null) {
            return q.Co;
        }
        int iO = g8Var.O() - 1;
        if (iO == 1) {
            return g8Var.H() ? new u(g8Var.I()) : q.Ko;
        }
        if (iO == 2) {
            return g8Var.L() ? new j(Double.valueOf(g8Var.M())) : new j(null);
        }
        if (iO == 3) {
            return g8Var.J() ? new g(Boolean.valueOf(g8Var.K())) : new g(null);
        }
        if (iO != 4) {
            throw new IllegalArgumentException("Unknown type found. Cannot convert entity");
        }
        List listF = g8Var.F();
        ArrayList arrayList = new ArrayList();
        Iterator it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(b((g8) it.next()));
        }
        return new r(g8Var.G(), arrayList);
    }
}
