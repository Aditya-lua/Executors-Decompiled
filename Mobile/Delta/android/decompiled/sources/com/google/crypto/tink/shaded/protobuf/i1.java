package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f8468a = B();
    public static final n1<?, ?> b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1<?, ?> f8469c = new p1();

    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, a0.e eVar, UB ub, n1<UT, UB> n1Var) {
        if (eVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.a(iIntValue)) {
                    ub = (UB) J(obj, i10, iIntValue, ub, n1Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (eVar.a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) J(obj, i10, iIntValue2, ub, n1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }

    public static Class<?> B() {
        if (c1.f8413d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static n1<?, ?> C() {
        try {
            Class<?> clsD = D();
            if (clsD == null) {
                return null;
            }
            return (n1) clsD.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static Class<?> D() {
        if (c1.f8413d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends u.b<FT>> void E(q<FT> qVar, T t8, T t10) {
        u<T> uVarC = qVar.c(t10);
        if (uVarC.m()) {
            return;
        }
        qVar.d(t8).u(uVarC);
    }

    public static <T> void F(n0 n0Var, T t8, T t10, long j10) {
        q1.R(t8, j10, n0Var.a(q1.C(t8, j10), q1.C(t10, j10)));
    }

    public static <T, UT, UB> void G(n1<UT, UB> n1Var, T t8, T t10) {
        n1Var.p(t8, n1Var.k(n1Var.g(t8), n1Var.g(t10)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!y.class.isAssignableFrom(cls) && !c1.f8413d && (cls2 = f8468a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    public static boolean I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static <UT, UB> UB J(Object obj, int i10, int i11, UB ub, n1<UT, UB> n1Var) {
        if (ub == null) {
            ub = n1Var.f(obj);
        }
        n1Var.e(ub, i10, i11);
        return ub;
    }

    public static n1<?, ?> K() {
        return b;
    }

    public static n1<?, ?> L() {
        return f8469c;
    }

    public static void M(int i10, List<Boolean> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.A(i10, list, z10);
    }

    public static void N(int i10, List<h> list, t1 t1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.I(i10, list);
    }

    public static void O(int i10, List<Double> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.G(i10, list, z10);
    }

    public static void P(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.n(i10, list, z10);
    }

    public static void Q(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.j(i10, list, z10);
    }

    public static void R(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.y(i10, list, z10);
    }

    public static void S(int i10, List<Float> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.a(i10, list, z10);
    }

    public static void T(int i10, List<?> list, t1 t1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.O(i10, list, g1Var);
    }

    public static void U(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.g(i10, list, z10);
    }

    public static void V(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.F(i10, list, z10);
    }

    public static void W(int i10, List<?> list, t1 t1Var, g1 g1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.L(i10, list, g1Var);
    }

    public static void X(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.z(i10, list, z10);
    }

    public static void Y(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.q(i10, list, z10);
    }

    public static void Z(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.D(i10, list, z10);
    }

    public static int a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size) : size * k.d(i10, true);
    }

    public static void a0(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.l(i10, list, z10);
    }

    public static int b(List<?> list) {
        return list.size();
    }

    public static void b0(int i10, List<String> list, t1 t1Var) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.d(i10, list);
    }

    public static int c(int i10, List<h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * k.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += k.h(list.get(i11));
        }
        return iU;
    }

    public static void c0(int i10, List<Integer> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.k(i10, list, z10);
    }

    public static int d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iE = e(list);
        return z10 ? k.U(i10) + k.C(iE) : iE + (size * k.U(i10));
    }

    public static void d0(int i10, List<Long> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.r(i10, list, z10);
    }

    public static int e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iL = 0;
            while (i10 < size) {
                iL += k.l(list.get(i10).intValue());
                i10++;
            }
            return iL;
        }
        z zVar = (z) list;
        int iL2 = 0;
        while (i10 < size) {
            iL2 += k.l(zVar.h(i10));
            i10++;
        }
        return iL2;
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size * 4) : size * k.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? k.U(i10) + k.C(size * 8) : size * k.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<s0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += k.s(i10, list.get(i11), g1Var);
        }
        return iS;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? k.U(i10) + k.C(iL) : iL + (size * k.U(i10));
    }

    public static int l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iW = 0;
            while (i10 < size) {
                iW += k.w(list.get(i10).intValue());
                i10++;
            }
            return iW;
        }
        z zVar = (z) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += k.w(zVar.h(i10));
            i10++;
        }
        return iW2;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? k.U(i10) + k.C(iN) : iN + (list.size() * k.U(i10));
    }

    public static int n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j0)) {
            int iY = 0;
            while (i10 < size) {
                iY += k.y(list.get(i10).longValue());
                i10++;
            }
            return iY;
        }
        j0 j0Var = (j0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += k.y(j0Var.h(i10));
            i10++;
        }
        return iY2;
    }

    public static int o(int i10, Object obj, g1 g1Var) {
        return obj instanceof e0 ? k.A(i10, (e0) obj) : k.F(i10, (s0) obj, g1Var);
    }

    public static int p(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = k.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iU += obj instanceof e0 ? k.B((e0) obj) : k.H((s0) obj, g1Var);
        }
        return iU;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? k.U(i10) + k.C(iR) : iR + (size * k.U(i10));
    }

    public static int r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iP = 0;
            while (i10 < size) {
                iP += k.P(list.get(i10).intValue());
                i10++;
            }
            return iP;
        }
        z zVar = (z) list;
        int iP2 = 0;
        while (i10 < size) {
            iP2 += k.P(zVar.h(i10));
            i10++;
        }
        return iP2;
    }

    public static int s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iT = t(list);
        return z10 ? k.U(i10) + k.C(iT) : iT + (size * k.U(i10));
    }

    public static int t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j0)) {
            int iR = 0;
            while (i10 < size) {
                iR += k.R(list.get(i10).longValue());
                i10++;
            }
            return iR;
        }
        j0 j0Var = (j0) list;
        int iR2 = 0;
        while (i10 < size) {
            iR2 += k.R(j0Var.h(i10));
            i10++;
        }
        return iR2;
    }

    public static int u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iU = k.U(i10) * size;
        if (!(list instanceof f0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iU += obj instanceof h ? k.h((h) obj) : k.T((String) obj);
                i11++;
            }
            return iU;
        }
        f0 f0Var = (f0) list;
        while (i11 < size) {
            Object objQ = f0Var.q(i11);
            iU += objQ instanceof h ? k.h((h) objQ) : k.T((String) objQ);
            i11++;
        }
        return iU;
    }

    public static int v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iW = w(list);
        return z10 ? k.U(i10) + k.C(iW) : iW + (size * k.U(i10));
    }

    public static int w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof z)) {
            int iW = 0;
            while (i10 < size) {
                iW += k.W(list.get(i10).intValue());
                i10++;
            }
            return iW;
        }
        z zVar = (z) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += k.W(zVar.h(i10));
            i10++;
        }
        return iW2;
    }

    public static int x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iY = y(list);
        return z10 ? k.U(i10) + k.C(iY) : iY + (size * k.U(i10));
    }

    public static int y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof j0)) {
            int iY = 0;
            while (i10 < size) {
                iY += k.Y(list.get(i10).longValue());
                i10++;
            }
            return iY;
        }
        j0 j0Var = (j0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += k.Y(j0Var.h(i10));
            i10++;
        }
        return iY2;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, a0.d<?> dVar, UB ub, n1<UT, UB> n1Var) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.a(iIntValue) == null) {
                    ub = (UB) J(obj, i10, iIntValue, ub, n1Var);
                    it.remove();
                }
            }
            return ub;
        }
        int size = list.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            Integer num = list.get(i12);
            int iIntValue2 = num.intValue();
            if (dVar.a(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) J(obj, i10, iIntValue2, ub, n1Var);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }
}
