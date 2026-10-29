package com.google.android.gms.internal.play_billing;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final t6 f7107a;

    static {
        int i10 = e3.f7032a;
        f7107a = new v6();
    }

    public static void A(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.t(i10, list, z10);
    }

    public static void B(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.m(i10, list, z10);
    }

    public static void C(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.G(i10, list, z10);
    }

    public static void D(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.c(i10, list, z10);
    }

    public static void E(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.f(i10, list, z10);
    }

    public static void a(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.g(i10, list, z10);
    }

    public static void b(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.y(i10, list, z10);
    }

    public static void c(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.b(i10, list, z10);
    }

    public static void d(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.v(i10, list, z10);
    }

    public static boolean e(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    @Deprecated
    public static int f(int i10, x5 x5Var, h6 h6Var) {
        int iV = a4.v(i10 << 3);
        return iV + iV + ((c3) x5Var).c(h6Var);
    }

    public static int g(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u4)) {
            int iW = 0;
            while (i10 < size) {
                iW += a4.w(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iW;
        }
        u4 u4Var = (u4) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += a4.w(u4Var.c(i10));
            i10++;
        }
        return iW2;
    }

    public static int h(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (a4.v(i10 << 3) + 4);
    }

    public static int i(List list) {
        return list.size() * 4;
    }

    public static int j(int i10, List list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return size * (a4.v(i10 << 3) + 8);
    }

    public static int k(List list) {
        return list.size() * 8;
    }

    public static int l(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u4)) {
            int iW = 0;
            while (i10 < size) {
                iW += a4.w(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iW;
        }
        u4 u4Var = (u4) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += a4.w(u4Var.c(i10));
            i10++;
        }
        return iW2;
    }

    public static int m(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iW = 0;
            while (i10 < size) {
                iW += a4.w(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iW;
        }
        l5 l5Var = (l5) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += a4.w(l5Var.c(i10));
            i10++;
        }
        return iW2;
    }

    public static int n(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u4)) {
            int iV = 0;
            while (i10 < size) {
                int iIntValue = ((Integer) list.get(i10)).intValue();
                iV += a4.v((iIntValue >> 31) ^ (iIntValue + iIntValue));
                i10++;
            }
            return iV;
        }
        u4 u4Var = (u4) list;
        int iV2 = 0;
        while (i10 < size) {
            int iC = u4Var.c(i10);
            iV2 += a4.v((iC >> 31) ^ (iC + iC));
            i10++;
        }
        return iV2;
    }

    public static int o(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iW = 0;
            while (i10 < size) {
                long jLongValue = ((Long) list.get(i10)).longValue();
                iW += a4.w((jLongValue >> 63) ^ (jLongValue + jLongValue));
                i10++;
            }
            return iW;
        }
        l5 l5Var = (l5) list;
        int iW2 = 0;
        while (i10 < size) {
            long jC = l5Var.c(i10);
            iW2 += a4.w((jC >> 63) ^ (jC + jC));
            i10++;
        }
        return iW2;
    }

    public static int p(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof u4)) {
            int iV = 0;
            while (i10 < size) {
                iV += a4.v(((Integer) list.get(i10)).intValue());
                i10++;
            }
            return iV;
        }
        u4 u4Var = (u4) list;
        int iV2 = 0;
        while (i10 < size) {
            iV2 += a4.v(u4Var.c(i10));
            i10++;
        }
        return iV2;
    }

    public static int q(List list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof l5)) {
            int iW = 0;
            while (i10 < size) {
                iW += a4.w(((Long) list.get(i10)).longValue());
                i10++;
            }
            return iW;
        }
        l5 l5Var = (l5) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += a4.w(l5Var.c(i10));
            i10++;
        }
        return iW2;
    }

    public static t6 r() {
        return f7107a;
    }

    public static Object s(Object obj, int i10, int i11, Object obj2, t6 t6Var) {
        if (obj2 == null) {
            obj2 = t6Var.a(obj);
        }
        ((u6) obj2).j(i10 << 3, Long.valueOf(i11));
        return obj2;
    }

    public static void t(g4 g4Var, Object obj, Object obj2) {
        if (((q4) obj2).zzb.f7119a.isEmpty()) {
            return;
        }
        throw null;
    }

    public static void u(t6 t6Var, Object obj, Object obj2) {
        t4 t4Var = (t4) obj;
        u6 u6VarE = t4Var.zzc;
        u6 u6Var = ((t4) obj2).zzc;
        if (!u6.c().equals(u6Var)) {
            if (u6.c().equals(u6VarE)) {
                u6VarE = u6.e(u6VarE, u6Var);
            } else {
                u6VarE.d(u6Var);
            }
        }
        t4Var.zzc = u6VarE;
    }

    public static void v(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.l(i10, list, z10);
    }

    public static void w(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.J(i10, list, z10);
    }

    public static void x(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.B(i10, list, z10);
    }

    public static void y(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.A(i10, list, z10);
    }

    public static void z(int i10, List list, i7 i7Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        i7Var.p(i10, list, z10);
    }
}
