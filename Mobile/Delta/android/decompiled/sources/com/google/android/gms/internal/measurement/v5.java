package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class v5 {
    public static void a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static void c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    public static boolean d(q qVar) {
        if (qVar == null) {
            return false;
        }
        Double dZzd = qVar.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    public static n0 e(String str) {
        n0 n0VarA = null;
        if (str != null && !str.isEmpty()) {
            n0VarA = n0.a(Integer.parseInt(str));
        }
        if (n0VarA != null) {
            return n0VarA;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    public static boolean f(q qVar, q qVar2) {
        if (!qVar.getClass().equals(qVar2.getClass())) {
            return false;
        }
        if ((qVar instanceof v) || (qVar instanceof o)) {
            return true;
        }
        if (qVar instanceof j) {
            if (Double.isNaN(qVar.zzd().doubleValue()) || Double.isNaN(qVar2.zzd().doubleValue())) {
                return false;
            }
            return qVar.zzd().equals(qVar2.zzd());
        }
        if (qVar instanceof u) {
            return qVar.zzc().equals(qVar2.zzc());
        }
        if (qVar instanceof g) {
            return qVar.zze().equals(qVar2.zze());
        }
        return qVar == qVar2;
    }

    public static int g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    public static long h(double d10) {
        return ((long) g(d10)) & 4294967295L;
    }

    public static double i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    public static Object j(q qVar) {
        if (q.Ao.equals(qVar)) {
            return null;
        }
        if (q.f6743zo.equals(qVar)) {
            return "";
        }
        if (qVar instanceof n) {
            return k((n) qVar);
        }
        if (!(qVar instanceof f)) {
            return !qVar.zzd().isNaN() ? qVar.zzd() : qVar.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((f) qVar).iterator();
        while (it.hasNext()) {
            Object objJ = j((q) it.next());
            if (objJ != null) {
                arrayList.add(objJ);
            }
        }
        return arrayList;
    }

    public static Map k(n nVar) {
        HashMap map = new HashMap();
        for (String str : nVar.h()) {
            Object objJ = j(nVar.c(str));
            if (objJ != null) {
                map.put(str, objJ);
            }
        }
        return map;
    }

    public static int l(u4 u4Var) {
        int iG = g(u4Var.h("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iG > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        u4Var.e("runtime.counter", new j(Double.valueOf(iG)));
        return iG;
    }
}
