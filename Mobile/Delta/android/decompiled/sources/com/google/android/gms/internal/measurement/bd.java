package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class bd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ld f6390a;

    static {
        wc wcVar = wc.f6869c;
        f6390a = new nd();
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ma.G(i10 << 3) + 4);
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (ma.G(i10 << 3) + 8);
    }

    public static int E(int i10, Object obj, zc zcVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof xb)) {
            return ma.G(i11) + ma.d((oc) obj, zcVar);
        }
        int iG = ma.G(i11);
        int iB = ((xb) obj).b();
        return iG + ma.G(iB) + iB;
    }

    public static ld a() {
        return f6390a;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(sa saVar, Object obj, Object obj2) {
        if (((db) obj2).zzb.f6867a.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void d(ld ldVar, Object obj, Object obj2) {
        gb gbVar = (gb) obj;
        md mdVarC = gbVar.zzc;
        md mdVar = ((gb) obj2).zzc;
        if (!md.a().equals(mdVar)) {
            if (md.a().equals(mdVarC)) {
                mdVarC = md.c(mdVarC, mdVar);
            } else {
                mdVarC.l(mdVar);
            }
        }
        gbVar.zzc = mdVarC;
    }

    public static Object e(Object obj, int i10, int i11, Object obj2, ld ldVar) {
        if (obj2 == null) {
            obj2 = ldVar.a(obj);
        }
        ((md) obj2).k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.C(i10, list, z10);
    }

    public static void g(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.f(i10, list, z10);
    }

    public static void h(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.x(i10, list, z10);
    }

    public static void i(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.c(i10, list, z10);
    }

    public static void j(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.q(i10, list, z10);
    }

    public static void k(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.m(i10, list, z10);
    }

    public static void l(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.z(i10, list, z10);
    }

    public static void m(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.L(i10, list, z10);
    }

    public static void n(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.B(i10, list, z10);
    }

    public static void o(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.b(i10, list, z10);
    }

    public static void p(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.I(i10, list, z10);
    }

    public static void q(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.y(i10, list, z10);
    }

    public static void r(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.g(i10, list, z10);
    }

    public static void s(int i10, List list, yd ydVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ydVar.H(i10, list, z10);
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cc)) {
            int iA = 0;
            while (i10 < size) {
                iA += ma.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        cc ccVar = (cc) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += ma.a(ccVar.x0(i10));
            i10++;
        }
        return iA2;
    }

    public static int u(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cc)) {
            int iA = 0;
            while (i10 < size) {
                iA += ma.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        cc ccVar = (cc) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += ma.a(ccVar.x0(i10));
            i10++;
        }
        return iA2;
    }

    public static int v(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof cc)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += ma.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        cc ccVar = (cc) list;
        int iA2 = 0;
        while (i10 < size) {
            long jX0 = ccVar.x0(i10);
            iA2 += ma.a((jX0 >> 63) ^ (jX0 + jX0));
            i10++;
        }
        return iA2;
    }

    public static int w(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int iA = 0;
            while (i10 < size) {
                iA += ma.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        hb hbVar = (hb) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += ma.a(hbVar.c(i10));
            i10++;
        }
        return iA2;
    }

    public static int x(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int iA = 0;
            while (i10 < size) {
                iA += ma.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        hb hbVar = (hb) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += ma.a(hbVar.c(i10));
            i10++;
        }
        return iA2;
    }

    public static int y(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int iG = 0;
            while (i10 < size) {
                iG += ma.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG;
        }
        hb hbVar = (hb) list;
        int iG2 = 0;
        while (i10 < size) {
            iG2 += ma.G(hbVar.c(i10));
            i10++;
        }
        return iG2;
    }

    public static int z(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof hb)) {
            int iG = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iG += ma.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iG;
        }
        hb hbVar = (hb) list;
        int iG2 = 0;
        while (i10 < size) {
            int iC = hbVar.c(i10);
            iG2 += ma.G((iC >> 31) ^ (iC + iC));
            i10++;
        }
        return iG2;
    }
}
