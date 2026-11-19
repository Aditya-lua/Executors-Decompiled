package com.google.android.gms.internal.measurement;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class fd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final pd f6505a;

    static {
        ad adVar = ad.f6375c;
        f6505a = new rd();
    }

    public static int A(List list) {
        return list.size() * 4;
    }

    public static int B(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qa.G(i10 << 3) + 4);
    }

    public static int C(List list) {
        return list.size() * 8;
    }

    public static int D(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (qa.G(i10 << 3) + 8);
    }

    public static int E(int i10, Object obj, dd ddVar) {
        int i11 = i10 << 3;
        if (!(obj instanceof bc)) {
            return qa.G(i11) + qa.d((sc) obj, ddVar);
        }
        int iG = qa.G(i11);
        int iB = ((bc) obj).b();
        return iG + qa.G(iB) + iB;
    }

    public static pd a() {
        return f6505a;
    }

    public static boolean b(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static void c(wa waVar, Object obj, Object obj2) {
        if (((hb) obj2).zzb.f6373a.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void d(pd pdVar, Object obj, Object obj2) {
        kb kbVar = (kb) obj;
        qd qdVarC = kbVar.zzc;
        qd qdVar = ((kb) obj2).zzc;
        if (!qd.a().equals(qdVar)) {
            if (qd.a().equals(qdVarC)) {
                qdVarC = qd.c(qdVarC, qdVar);
            } else {
                qdVarC.l(qdVar);
            }
        }
        kbVar.zzc = qdVarC;
    }

    public static Object e(Object obj, int i10, int i11, Object obj2, pd pdVar) {
        if (obj2 == null) {
            obj2 = pdVar.a(obj);
        }
        ((qd) obj2).k(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void f(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.C(i10, list, z10);
    }

    public static void g(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.f(i10, list, z10);
    }

    public static void h(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.x(i10, list, z10);
    }

    public static void i(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.c(i10, list, z10);
    }

    public static void j(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.q(i10, list, z10);
    }

    public static void k(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.m(i10, list, z10);
    }

    public static void l(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.z(i10, list, z10);
    }

    public static void m(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.L(i10, list, z10);
    }

    public static void n(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.B(i10, list, z10);
    }

    public static void o(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.b(i10, list, z10);
    }

    public static void p(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.I(i10, list, z10);
    }

    public static void q(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.y(i10, list, z10);
    }

    public static void r(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.g(i10, list, z10);
    }

    public static void s(int i10, List list, ce ceVar, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        ceVar.H(i10, list, z10);
    }

    public static int t(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof gc)) {
            int iA = 0;
            while (i10 < size) {
                iA += qa.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        gc gcVar = (gc) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += qa.a(gcVar.w0(i10));
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
        if (!(list instanceof gc)) {
            int iA = 0;
            while (i10 < size) {
                iA += qa.a(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iA;
        }
        gc gcVar = (gc) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += qa.a(gcVar.w0(i10));
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
        if (!(list instanceof gc)) {
            int iA = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iA += qa.a((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iA;
        }
        gc gcVar = (gc) list;
        int iA2 = 0;
        while (i10 < size) {
            long jW0 = gcVar.w0(i10);
            iA2 += qa.a((jW0 >> 63) ^ (jW0 + jW0));
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
        if (!(list instanceof lb)) {
            int iA = 0;
            while (i10 < size) {
                iA += qa.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        lb lbVar = (lb) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += qa.a(lbVar.c(i10));
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
        if (!(list instanceof lb)) {
            int iA = 0;
            while (i10 < size) {
                iA += qa.a(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iA;
        }
        lb lbVar = (lb) list;
        int iA2 = 0;
        while (i10 < size) {
            iA2 += qa.a(lbVar.c(i10));
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
        if (!(list instanceof lb)) {
            int iG = 0;
            while (i10 < size) {
                iG += qa.G(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iG;
        }
        lb lbVar = (lb) list;
        int iG2 = 0;
        while (i10 < size) {
            iG2 += qa.G(lbVar.c(i10));
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
        if (!(list instanceof lb)) {
            int iG = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iG += qa.G((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iG;
        }
        lb lbVar = (lb) list;
        int iG2 = 0;
        while (i10 < size) {
            int iC = lbVar.c(i10);
            iG2 += qa.G((iC >> 31) ^ (iC + iC));
            i10++;
        }
        return iG2;
    }
}
