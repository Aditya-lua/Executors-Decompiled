package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.i6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2533i6 {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2654t6 f9048a;

    static {
        int i10 = C2486e3.f8956a;
        f9048a = new C2676v6();
    }

    /* JADX INFO: renamed from: A */
    public static void m11471A(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11308t(i10, list, z10);
    }

    /* JADX INFO: renamed from: B */
    public static void m11472B(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11301m(i10, list, z10);
    }

    /* JADX INFO: renamed from: C */
    public static void m11473C(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11283G(i10, list, z10);
    }

    /* JADX INFO: renamed from: D */
    public static void m11474D(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11291c(i10, list, z10);
    }

    /* JADX INFO: renamed from: E */
    public static void m11475E(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11294f(i10, list, z10);
    }

    /* JADX INFO: renamed from: a */
    public static void m11476a(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11295g(i10, list, z10);
    }

    /* JADX INFO: renamed from: b */
    public static void m11477b(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11313y(i10, list, z10);
    }

    /* JADX INFO: renamed from: c */
    public static void m11478c(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11290b(i10, list, z10);
    }

    /* JADX INFO: renamed from: d */
    public static void m11479d(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11310v(i10, list, z10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m11480e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static int m11481f(int i10, InterfaceC2697x5 interfaceC2697x5, InterfaceC2522h6 interfaceC2522h6) {
        int iM11173v = AbstractC2443a4.m11173v(i10 << 3);
        return iM11173v + iM11173v + ((AbstractC2464c3) interfaceC2697x5).mo11332c(interfaceC2522h6);
    }

    /* JADX INFO: renamed from: g */
    public static int m11482g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2663u4)) {
            int iM11174w = 0;
            while (i10 < size) {
                iM11174w += AbstractC2443a4.m11174w(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM11174w;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        int iM11174w2 = 0;
        while (i10 < size) {
            iM11174w2 += AbstractC2443a4.m11174w(c2663u4.m11770c(i10));
            i10++;
        }
        return iM11174w2;
    }

    /* JADX INFO: renamed from: h */
    public static int m11483h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2443a4.m11173v(i10 << 3) + 4);
    }

    /* JADX INFO: renamed from: i */
    public static int m11484i(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: j */
    public static int m11485j(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2443a4.m11173v(i10 << 3) + 8);
    }

    /* JADX INFO: renamed from: k */
    public static int m11486k(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: l */
    public static int m11487l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2663u4)) {
            int iM11174w = 0;
            while (i10 < size) {
                iM11174w += AbstractC2443a4.m11174w(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM11174w;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        int iM11174w2 = 0;
        while (i10 < size) {
            iM11174w2 += AbstractC2443a4.m11174w(c2663u4.m11770c(i10));
            i10++;
        }
        return iM11174w2;
    }

    /* JADX INFO: renamed from: m */
    public static int m11488m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2565l5)) {
            int iM11174w = 0;
            while (i10 < size) {
                iM11174w += AbstractC2443a4.m11174w(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iM11174w;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        int iM11174w2 = 0;
        while (i10 < size) {
            iM11174w2 += AbstractC2443a4.m11174w(c2565l5.m11538c(i10));
            i10++;
        }
        return iM11174w2;
    }

    /* JADX INFO: renamed from: n */
    public static int m11489n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2663u4)) {
            int iM11173v = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM11173v += AbstractC2443a4.m11173v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iM11173v;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        int iM11173v2 = 0;
        while (i10 < size) {
            int iM11770c = c2663u4.m11770c(i10);
            iM11173v2 += AbstractC2443a4.m11173v((iM11770c >> 31) ^ (iM11770c + iM11770c));
            i10++;
        }
        return iM11173v2;
    }

    /* JADX INFO: renamed from: o */
    public static int m11490o(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2565l5)) {
            int iM11174w = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iM11174w += AbstractC2443a4.m11174w((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iM11174w;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        int iM11174w2 = 0;
        while (i10 < size) {
            long jM11538c = c2565l5.m11538c(i10);
            iM11174w2 += AbstractC2443a4.m11174w((jM11538c >> 63) ^ (jM11538c + jM11538c));
            i10++;
        }
        return iM11174w2;
    }

    /* JADX INFO: renamed from: p */
    public static int m11491p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2663u4)) {
            int iM11173v = 0;
            while (i10 < size) {
                iM11173v += AbstractC2443a4.m11173v(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM11173v;
        }
        C2663u4 c2663u4 = (C2663u4) list;
        int iM11173v2 = 0;
        while (i10 < size) {
            iM11173v2 += AbstractC2443a4.m11173v(c2663u4.m11770c(i10));
            i10++;
        }
        return iM11173v2;
    }

    /* JADX INFO: renamed from: q */
    public static int m11492q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2565l5)) {
            int iM11174w = 0;
            while (i10 < size) {
                iM11174w += AbstractC2443a4.m11174w(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iM11174w;
        }
        C2565l5 c2565l5 = (C2565l5) list;
        int iM11174w2 = 0;
        while (i10 < size) {
            iM11174w2 += AbstractC2443a4.m11174w(c2565l5.m11538c(i10));
            i10++;
        }
        return iM11174w2;
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2654t6 m11493r() {
        return f9048a;
    }

    /* JADX INFO: renamed from: s */
    public static Object m11494s(Object obj, int i10, int i11, Object obj2, AbstractC2654t6 abstractC2654t6) {
        if (obj2 == null) {
            obj2 = abstractC2654t6.mo11760a(obj);
        }
        ((C2665u6) obj2).m11785j(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    /* JADX INFO: renamed from: t */
    public static void m11495t(AbstractC2509g4 abstractC2509g4, Object obj, Object obj2) {
        if (((AbstractC2619q4) obj2).zzb.f9063a.isEmpty()) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: u */
    public static void m11496u(AbstractC2654t6 abstractC2654t6, Object obj, Object obj2) {
        AbstractC2652t4 abstractC2652t4 = (AbstractC2652t4) obj;
        C2665u6 c2665u6M11777e = abstractC2652t4.zzc;
        C2665u6 c2665u6 = ((AbstractC2652t4) obj2).zzc;
        if (!C2665u6.m11776c().equals(c2665u6)) {
            if (C2665u6.m11776c().equals(c2665u6M11777e)) {
                c2665u6M11777e = C2665u6.m11777e(c2665u6M11777e, c2665u6);
            } else {
                c2665u6M11777e.m11781d(c2665u6);
            }
        }
        abstractC2652t4.zzc = c2665u6M11777e;
    }

    /* JADX INFO: renamed from: v */
    public static void m11497v(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11300l(i10, list, z10);
    }

    /* JADX INFO: renamed from: w */
    public static void m11498w(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11286J(i10, list, z10);
    }

    /* JADX INFO: renamed from: x */
    public static void m11499x(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11278B(i10, list, z10);
    }

    /* JADX INFO: renamed from: y */
    public static void m11500y(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11277A(i10, list, z10);
    }

    /* JADX INFO: renamed from: z */
    public static void m11501z(int i10, List list, InterfaceC2534i7 interfaceC2534i7, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2534i7.mo11304p(i10, list, z10);
    }
}
