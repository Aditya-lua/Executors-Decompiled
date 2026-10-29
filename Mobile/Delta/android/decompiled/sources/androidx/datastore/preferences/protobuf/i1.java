package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Class<?> f2202a = B();
    public static final n1<?, ?> b = C();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final n1<?, ?> f2203c = new p1();

    public static <UT, UB> UB A(Object obj, int i10, List<Integer> list, z.c cVar, UB ub, n1<UT, UB> n1Var) {
        if (cVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.a(iIntValue)) {
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
            if (cVar.a(iIntValue2)) {
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
        if (c1.f2152d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
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
        if (c1.f2152d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static <T, FT extends t.b<FT>> void E(p<FT> pVar, T t8, T t10) {
        t<T> tVarC = pVar.c(t10);
        if (tVarC.n()) {
            return;
        }
        pVar.d(t8).v(tVarC);
    }

    public static <T> void F(m0 m0Var, T t8, T t10, long j10) {
        q1.O(t8, j10, m0Var.a(q1.z(t8, j10), q1.z(t10, j10)));
    }

    public static <T, UT, UB> void G(n1<UT, UB> n1Var, T t8, T t10) {
        n1Var.p(t8, n1Var.k(n1Var.g(t8), n1Var.g(t10)));
    }

    public static void H(Class<?> cls) {
        Class<?> cls2;
        if (!x.class.isAssignableFrom(cls) && !c1.f2152d && (cls2 = f2202a) != null && !cls2.isAssignableFrom(cls)) {
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
        return f2203c;
    }

    public static void M(int i10, List<Boolean> list, t1 t1Var, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        t1Var.A(i10, list, z10);
    }

    public static void N(int i10, List<g> list, t1 t1Var) {
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
        t1Var.J(i10, list, g1Var);
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
        t1Var.O(i10, list, g1Var);
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
        return z10 ? j.U(i10) + j.C(size) : size * j.d(i10, true);
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

    public static int c(int i10, List<g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = size * j.U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iU += j.h(list.get(i11));
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
        return z10 ? j.U(i10) + j.C(iE) : iE + (size * j.U(i10));
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
        if (!(list instanceof y)) {
            int iL = 0;
            while (i10 < size) {
                iL += j.l(list.get(i10).intValue());
                i10++;
            }
            return iL;
        }
        y yVar = (y) list;
        int iL2 = 0;
        while (i10 < size) {
            iL2 += j.l(yVar.h(i10));
            i10++;
        }
        return iL2;
    }

    public static int f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size * 4) : size * j.m(i10, 0);
    }

    public static int g(List<?> list) {
        return list.size() * 4;
    }

    public static int h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? j.U(i10) + j.C(size * 8) : size * j.o(i10, 0L);
    }

    public static int i(List<?> list) {
        return list.size() * 8;
    }

    public static int j(int i10, List<r0> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iS = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iS += j.s(i10, list.get(i11), g1Var);
        }
        return iS;
    }

    public static int k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iL = l(list);
        return z10 ? j.U(i10) + j.C(iL) : iL + (size * j.U(i10));
    }

    public static int l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iW = 0;
            while (i10 < size) {
                iW += j.w(list.get(i10).intValue());
                i10++;
            }
            return iW;
        }
        y yVar = (y) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += j.w(yVar.h(i10));
            i10++;
        }
        return iW2;
    }

    public static int m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iN = n(list);
        return z10 ? j.U(i10) + j.C(iN) : iN + (list.size() * j.U(i10));
    }

    public static int n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iY = 0;
            while (i10 < size) {
                iY += j.y(list.get(i10).longValue());
                i10++;
            }
            return iY;
        }
        i0 i0Var = (i0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += j.y(i0Var.h(i10));
            i10++;
        }
        return iY2;
    }

    public static int o(int i10, Object obj, g1 g1Var) {
        return obj instanceof d0 ? j.A(i10, (d0) obj) : j.F(i10, (r0) obj, g1Var);
    }

    public static int p(int i10, List<?> list, g1 g1Var) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iU = j.U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iU += obj instanceof d0 ? j.B((d0) obj) : j.H((r0) obj, g1Var);
        }
        return iU;
    }

    public static int q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iR = r(list);
        return z10 ? j.U(i10) + j.C(iR) : iR + (size * j.U(i10));
    }

    public static int r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iP = 0;
            while (i10 < size) {
                iP += j.P(list.get(i10).intValue());
                i10++;
            }
            return iP;
        }
        y yVar = (y) list;
        int iP2 = 0;
        while (i10 < size) {
            iP2 += j.P(yVar.h(i10));
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
        return z10 ? j.U(i10) + j.C(iT) : iT + (size * j.U(i10));
    }

    public static int t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iR = 0;
            while (i10 < size) {
                iR += j.R(list.get(i10).longValue());
                i10++;
            }
            return iR;
        }
        i0 i0Var = (i0) list;
        int iR2 = 0;
        while (i10 < size) {
            iR2 += j.R(i0Var.h(i10));
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
        int iU = j.U(i10) * size;
        if (!(list instanceof e0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iU += obj instanceof g ? j.h((g) obj) : j.T((String) obj);
                i11++;
            }
            return iU;
        }
        e0 e0Var = (e0) list;
        while (i11 < size) {
            Object objQ = e0Var.q(i11);
            iU += objQ instanceof g ? j.h((g) objQ) : j.T((String) objQ);
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
        return z10 ? j.U(i10) + j.C(iW) : iW + (size * j.U(i10));
    }

    public static int w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof y)) {
            int iW = 0;
            while (i10 < size) {
                iW += j.W(list.get(i10).intValue());
                i10++;
            }
            return iW;
        }
        y yVar = (y) list;
        int iW2 = 0;
        while (i10 < size) {
            iW2 += j.W(yVar.h(i10));
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
        return z10 ? j.U(i10) + j.C(iY) : iY + (size * j.U(i10));
    }

    public static int y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof i0)) {
            int iY = 0;
            while (i10 < size) {
                iY += j.Y(list.get(i10).longValue());
                i10++;
            }
            return iY;
        }
        i0 i0Var = (i0) list;
        int iY2 = 0;
        while (i10 < size) {
            iY2 += j.Y(i0Var.h(i10));
            i10++;
        }
        return iY2;
    }

    public static <UT, UB> UB z(Object obj, int i10, List<Integer> list, z.b<?> bVar, UB ub, n1<UT, UB> n1Var) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bVar.a(iIntValue) == null) {
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
            if (bVar.a(iIntValue2) != null) {
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
