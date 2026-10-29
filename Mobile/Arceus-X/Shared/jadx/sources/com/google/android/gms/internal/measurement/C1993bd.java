package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C1993bd {

    /* JADX INFO: renamed from: a */
    public static final AbstractC2179ld f8114a;

    static {
        C2376wc c2376wc = C2376wc.f8740c;
        f8114a = new C2215nd();
    }

    /* JADX INFO: renamed from: A */
    public static int m9796A(List list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: B */
    public static int m9797B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2194ma.m10380G(i10 << 3) + 4);
    }

    /* JADX INFO: renamed from: C */
    public static int m9798C(List list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: D */
    public static int m9799D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (AbstractC2194ma.m10380G(i10 << 3) + 8);
    }

    /* JADX INFO: renamed from: E */
    public static int m9800E(int i10, Object obj, InterfaceC2430zc interfaceC2430zc) {
        int i11 = i10 << 3;
        if (!(obj instanceof C2393xb)) {
            return AbstractC2194ma.m10380G(i11) + AbstractC2194ma.m10384d((InterfaceC2232oc) obj, interfaceC2430zc);
        }
        int iM10380G = AbstractC2194ma.m10380G(i11);
        int iM10980b = ((C2393xb) obj).m10980b();
        return iM10380G + AbstractC2194ma.m10380G(iM10980b) + iM10980b;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC2179ld m9801a() {
        return f8114a;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m9802b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: c */
    public static void m9803c(AbstractC2302sa abstractC2302sa, Object obj, Object obj2) {
        if (((AbstractC2029db) obj2).zzb.f8737a.isEmpty()) {
            return;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static void m9804d(AbstractC2179ld abstractC2179ld, Object obj, Object obj2) {
        AbstractC2086gb abstractC2086gb = (AbstractC2086gb) obj;
        C2197md c2197mdM10391c = abstractC2086gb.zzc;
        C2197md c2197md = ((AbstractC2086gb) obj2).zzc;
        if (!C2197md.m10389a().equals(c2197md)) {
            if (C2197md.m10389a().equals(c2197mdM10391c)) {
                c2197mdM10391c = C2197md.m10391c(c2197mdM10391c, c2197md);
            } else {
                c2197mdM10391c.m10400l(c2197md);
            }
        }
        abstractC2086gb.zzc = c2197mdM10391c;
    }

    /* JADX INFO: renamed from: e */
    public static Object m9805e(Object obj, int i10, int i11, Object obj2, AbstractC2179ld abstractC2179ld) {
        if (obj2 == null) {
            obj2 = abstractC2179ld.mo10364a(obj);
        }
        ((C2197md) obj2).m10399k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    /* JADX INFO: renamed from: f */
    public static void m9806f(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10435C(i10, list, z10);
    }

    /* JADX INFO: renamed from: g */
    public static void m9807g(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10450f(i10, list, z10);
    }

    /* JADX INFO: renamed from: h */
    public static void m9808h(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10468x(i10, list, z10);
    }

    /* JADX INFO: renamed from: i */
    public static void m9809i(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10447c(i10, list, z10);
    }

    /* JADX INFO: renamed from: j */
    public static void m9810j(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10461q(i10, list, z10);
    }

    /* JADX INFO: renamed from: k */
    public static void m9811k(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10457m(i10, list, z10);
    }

    /* JADX INFO: renamed from: l */
    public static void m9812l(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10470z(i10, list, z10);
    }

    /* JADX INFO: renamed from: m */
    public static void m9813m(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10444L(i10, list, z10);
    }

    /* JADX INFO: renamed from: n */
    public static void m9814n(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10434B(i10, list, z10);
    }

    /* JADX INFO: renamed from: o */
    public static void m9815o(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10446b(i10, list, z10);
    }

    /* JADX INFO: renamed from: p */
    public static void m9816p(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10441I(i10, list, z10);
    }

    /* JADX INFO: renamed from: q */
    public static void m9817q(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10469y(i10, list, z10);
    }

    /* JADX INFO: renamed from: r */
    public static void m9818r(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10451g(i10, list, z10);
    }

    /* JADX INFO: renamed from: s */
    public static void m9819s(int i10, List list, InterfaceC2413yd interfaceC2413yd, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2413yd.mo10440H(i10, list, z10);
    }

    /* JADX INFO: renamed from: t */
    public static int m9820t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2011cc)) {
            int iM10381a = 0;
            while (i10 < size) {
                iM10381a += AbstractC2194ma.m10381a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iM10381a;
        }
        C2011cc c2011cc = (C2011cc) list;
        int iM10381a2 = 0;
        while (i10 < size) {
            iM10381a2 += AbstractC2194ma.m10381a(c2011cc.mo9893x0(i10));
            i10++;
        }
        return iM10381a2;
    }

    /* JADX INFO: renamed from: u */
    public static int m9821u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2011cc)) {
            int iM10381a = 0;
            while (i10 < size) {
                iM10381a += AbstractC2194ma.m10381a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iM10381a;
        }
        C2011cc c2011cc = (C2011cc) list;
        int iM10381a2 = 0;
        while (i10 < size) {
            iM10381a2 += AbstractC2194ma.m10381a(c2011cc.mo9893x0(i10));
            i10++;
        }
        return iM10381a2;
    }

    /* JADX INFO: renamed from: v */
    public static int m9822v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2011cc)) {
            int iM10381a = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iM10381a += AbstractC2194ma.m10381a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iM10381a;
        }
        C2011cc c2011cc = (C2011cc) list;
        int iM10381a2 = 0;
        while (i10 < size) {
            long jMo9893x0 = c2011cc.mo9893x0(i10);
            iM10381a2 += AbstractC2194ma.m10381a((jMo9893x0 >> 63) ^ (jMo9893x0 + jMo9893x0));
            i10++;
        }
        return iM10381a2;
    }

    /* JADX INFO: renamed from: w */
    public static int m9823w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2105hb)) {
            int iM10381a = 0;
            while (i10 < size) {
                iM10381a += AbstractC2194ma.m10381a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM10381a;
        }
        C2105hb c2105hb = (C2105hb) list;
        int iM10381a2 = 0;
        while (i10 < size) {
            iM10381a2 += AbstractC2194ma.m10381a(c2105hb.m10191c(i10));
            i10++;
        }
        return iM10381a2;
    }

    /* JADX INFO: renamed from: x */
    public static int m9824x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2105hb)) {
            int iM10381a = 0;
            while (i10 < size) {
                iM10381a += AbstractC2194ma.m10381a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM10381a;
        }
        C2105hb c2105hb = (C2105hb) list;
        int iM10381a2 = 0;
        while (i10 < size) {
            iM10381a2 += AbstractC2194ma.m10381a(c2105hb.m10191c(i10));
            i10++;
        }
        return iM10381a2;
    }

    /* JADX INFO: renamed from: y */
    public static int m9825y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2105hb)) {
            int iM10380G = 0;
            while (i10 < size) {
                iM10380G += AbstractC2194ma.m10380G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iM10380G;
        }
        C2105hb c2105hb = (C2105hb) list;
        int iM10380G2 = 0;
        while (i10 < size) {
            iM10380G2 += AbstractC2194ma.m10380G(c2105hb.m10191c(i10));
            i10++;
        }
        return iM10380G2;
    }

    /* JADX INFO: renamed from: z */
    public static int m9826z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2105hb)) {
            int iM10380G = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iM10380G += AbstractC2194ma.m10380G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iM10380G;
        }
        C2105hb c2105hb = (C2105hb) list;
        int iM10380G2 = 0;
        while (i10 < size) {
            int iM10191c = c2105hb.m10191c(i10);
            iM10380G2 += AbstractC2194ma.m10380G((iM10191c >> 31) ^ (iM10191c + iM10191c));
            i10++;
        }
        return iM10380G2;
    }
}
