package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.v5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2351v5 {
    /* JADX INFO: renamed from: a */
    public static void m10828a(String str, int i10, List list) {
        if (list.size() != i10) {
            throw new IllegalArgumentException(String.format("%s operation requires %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10829b(String str, int i10, List list) {
        if (list.size() < i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at least %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10830c(String str, int i10, List list) {
        if (list.size() > i10) {
            throw new IllegalArgumentException(String.format("%s operation requires at most %s parameters found %s", str, Integer.valueOf(i10), Integer.valueOf(list.size())));
        }
    }

    /* JADX INFO: renamed from: d */
    public static boolean m10831d(InterfaceC2255q interfaceC2255q) {
        if (interfaceC2255q == null) {
            return false;
        }
        Double dZzd = interfaceC2255q.zzd();
        return !dZzd.isNaN() && dZzd.doubleValue() >= 0.0d && dZzd.equals(Double.valueOf(Math.floor(dZzd.doubleValue())));
    }

    /* JADX INFO: renamed from: e */
    public static EnumC2202n0 m10832e(String str) {
        EnumC2202n0 enumC2202n0M10408a = null;
        if (str != null && !str.isEmpty()) {
            enumC2202n0M10408a = EnumC2202n0.m10408a(Integer.parseInt(str));
        }
        if (enumC2202n0M10408a != null) {
            return enumC2202n0M10408a;
        }
        throw new IllegalArgumentException(String.format("Unsupported commandId %s", str));
    }

    /* JADX INFO: renamed from: f */
    public static boolean m10833f(InterfaceC2255q interfaceC2255q, InterfaceC2255q interfaceC2255q2) {
        if (!interfaceC2255q.getClass().equals(interfaceC2255q2.getClass())) {
            return false;
        }
        if ((interfaceC2255q instanceof C2345v) || (interfaceC2255q instanceof C2219o)) {
            return true;
        }
        if (interfaceC2255q instanceof C2129j) {
            if (Double.isNaN(interfaceC2255q.zzd().doubleValue()) || Double.isNaN(interfaceC2255q2.zzd().doubleValue())) {
                return false;
            }
            return interfaceC2255q.zzd().equals(interfaceC2255q2.zzd());
        }
        if (interfaceC2255q instanceof C2327u) {
            return interfaceC2255q.zzc().equals(interfaceC2255q2.zzc());
        }
        if (interfaceC2255q instanceof C2074g) {
            return interfaceC2255q.zze().equals(interfaceC2255q2.zze());
        }
        return interfaceC2255q == interfaceC2255q2;
    }

    /* JADX INFO: renamed from: g */
    public static int m10834g(double d10) {
        if (Double.isNaN(d10) || Double.isInfinite(d10) || d10 == 0.0d) {
            return 0;
        }
        return (int) ((((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10))) % 4.294967296E9d);
    }

    /* JADX INFO: renamed from: h */
    public static long m10835h(double d10) {
        return ((long) m10834g(d10)) & 4294967295L;
    }

    /* JADX INFO: renamed from: i */
    public static double m10836i(double d10) {
        if (Double.isNaN(d10)) {
            return 0.0d;
        }
        if (Double.isInfinite(d10) || d10 == 0.0d || d10 == 0.0d) {
            return d10;
        }
        return ((double) (d10 > 0.0d ? 1 : -1)) * Math.floor(Math.abs(d10));
    }

    /* JADX INFO: renamed from: j */
    public static Object m10837j(InterfaceC2255q interfaceC2255q) {
        if (InterfaceC2255q.f8580Ao.equals(interfaceC2255q)) {
            return null;
        }
        if (InterfaceC2255q.f8587zo.equals(interfaceC2255q)) {
            return "";
        }
        if (interfaceC2255q instanceof C2201n) {
            return m10838k((C2201n) interfaceC2255q);
        }
        if (!(interfaceC2255q instanceof C2055f)) {
            return !interfaceC2255q.zzd().isNaN() ? interfaceC2255q.zzd() : interfaceC2255q.zzc();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((C2055f) interfaceC2255q).iterator();
        while (it.hasNext()) {
            Object objM10837j = m10837j((InterfaceC2255q) it.next());
            if (objM10837j != null) {
                arrayList.add(objM10837j);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: k */
    public static Map m10838k(C2201n c2201n) {
        HashMap map = new HashMap();
        for (String str : c2201n.m10407h()) {
            Object objM10837j = m10837j(c2201n.mo9951c(str));
            if (objM10837j != null) {
                map.put(str, objM10837j);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: l */
    public static int m10839l(C2332u4 c2332u4) {
        int iM10834g = m10834g(c2332u4.m10783h("runtime.counter").zzd().doubleValue() + 1.0d);
        if (iM10834g > 1000000) {
            throw new IllegalStateException("Instructions allowed exceeded");
        }
        c2332u4.m10780e("runtime.counter", new C2129j(Double.valueOf(iM10834g)));
        return iM10834g;
    }
}
