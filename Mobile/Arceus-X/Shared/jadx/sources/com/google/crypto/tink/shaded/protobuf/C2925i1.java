package com.google.crypto.tink.shaded.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.i1 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2925i1 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f10890a = m13651B();

    /* JADX INFO: renamed from: b */
    public static final AbstractC2940n1<?, ?> f10891b = m13652C();

    /* JADX INFO: renamed from: c */
    public static final AbstractC2940n1<?, ?> f10892c = new C2946p1();

    /* JADX INFO: renamed from: A */
    public static <UT, UB> UB m13650A(Object obj, int i10, List<Integer> list, C2900a0.e eVar, UB ub, AbstractC2940n1<UT, UB> abstractC2940n1) {
        if (eVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!eVar.m13387a(iIntValue)) {
                    ub = (UB) m13659J(obj, i10, iIntValue, ub, abstractC2940n1);
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
            if (eVar.m13387a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) m13659J(obj, i10, iIntValue2, ub, abstractC2940n1);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }

    /* JADX INFO: renamed from: B */
    public static Class<?> m13651B() {
        if (C2907c1.f10823d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static AbstractC2940n1<?, ?> m13652C() {
        try {
            Class<?> clsM13653D = m13653D();
            if (clsM13653D == null) {
                return null;
            }
            return (AbstractC2940n1) clsM13653D.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Class<?> m13653D() {
        if (C2907c1.f10823d) {
            return null;
        }
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T, FT extends C2959u.b<FT>> void m13654E(AbstractC2947q<FT> abstractC2947q, T t8, T t10) {
        C2959u<T> c2959uMo14058c = abstractC2947q.mo14058c(t10);
        if (c2959uMo14058c.m14199m()) {
            return;
        }
        abstractC2947q.mo14059d(t8).m14204u(c2959uMo14058c);
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m13655F(InterfaceC2939n0 interfaceC2939n0, T t8, T t10, long j10) {
        C2949q1.m14083R(t8, j10, interfaceC2939n0.mo13984a(C2949q1.m14068C(t8, j10), C2949q1.m14068C(t10, j10)));
    }

    /* JADX INFO: renamed from: G */
    public static <T, UT, UB> void m13656G(AbstractC2940n1<UT, UB> abstractC2940n1, T t8, T t10) {
        abstractC2940n1.mo14007p(t8, abstractC2940n1.mo14002k(abstractC2940n1.mo13998g(t8), abstractC2940n1.mo13998g(t10)));
    }

    /* JADX INFO: renamed from: H */
    public static void m13657H(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC2967y.class.isAssignableFrom(cls) && !C2907c1.f10823d && (cls2 = f10890a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m13658I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static <UT, UB> UB m13659J(Object obj, int i10, int i11, UB ub, AbstractC2940n1<UT, UB> abstractC2940n1) {
        if (ub == null) {
            ub = abstractC2940n1.mo13997f(obj);
        }
        abstractC2940n1.mo13996e(ub, i10, i11);
        return ub;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC2940n1<?, ?> m13660K() {
        return f10891b;
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC2940n1<?, ?> m13661L() {
        return f10892c;
    }

    /* JADX INFO: renamed from: M */
    public static void m13662M(int i10, List<Boolean> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13881A(i10, list, z10);
    }

    /* JADX INFO: renamed from: N */
    public static void m13663N(int i10, List<AbstractC2920h> list, InterfaceC2958t1 interfaceC2958t1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13889I(i10, list);
    }

    /* JADX INFO: renamed from: O */
    public static void m13664O(int i10, List<Double> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13887G(i10, list, z10);
    }

    /* JADX INFO: renamed from: P */
    public static void m13665P(int i10, List<Integer> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13932n(i10, list, z10);
    }

    /* JADX INFO: renamed from: Q */
    public static void m13666Q(int i10, List<Integer> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13924j(i10, list, z10);
    }

    /* JADX INFO: renamed from: R */
    public static void m13667R(int i10, List<Long> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13950y(i10, list, z10);
    }

    /* JADX INFO: renamed from: S */
    public static void m13668S(int i10, List<Float> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13906a(i10, list, z10);
    }

    /* JADX INFO: renamed from: T */
    public static void m13669T(int i10, List<?> list, InterfaceC2958t1 interfaceC2958t1, InterfaceC2919g1 interfaceC2919g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13895O(i10, list, interfaceC2919g1);
    }

    /* JADX INFO: renamed from: U */
    public static void m13670U(int i10, List<Integer> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13918g(i10, list, z10);
    }

    /* JADX INFO: renamed from: V */
    public static void m13671V(int i10, List<Long> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13886F(i10, list, z10);
    }

    /* JADX INFO: renamed from: W */
    public static void m13672W(int i10, List<?> list, InterfaceC2958t1 interfaceC2958t1, InterfaceC2919g1 interfaceC2919g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13892L(i10, list, interfaceC2919g1);
    }

    /* JADX INFO: renamed from: X */
    public static void m13673X(int i10, List<Integer> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13951z(i10, list, z10);
    }

    /* JADX INFO: renamed from: Y */
    public static void m13674Y(int i10, List<Long> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13938q(i10, list, z10);
    }

    /* JADX INFO: renamed from: Z */
    public static void m13675Z(int i10, List<Integer> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13884D(i10, list, z10);
    }

    /* JADX INFO: renamed from: a */
    public static int m13676a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(size) : size * AbstractC2929k.m13783d(i10, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m13677a0(int i10, List<Long> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13928l(i10, list, z10);
    }

    /* JADX INFO: renamed from: b */
    public static int m13678b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m13679b0(int i10, List<String> list, InterfaceC2958t1 interfaceC2958t1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13912d(i10, list);
    }

    /* JADX INFO: renamed from: c */
    public static int m13680c(int i10, List<AbstractC2920h> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13775U = size * AbstractC2929k.m13775U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM13775U += AbstractC2929k.m13790h(list.get(i11));
        }
        return iM13775U;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m13681c0(int i10, List<Integer> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13926k(i10, list, z10);
    }

    /* JADX INFO: renamed from: d */
    public static int m13682d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13684e = m13684e(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13684e) : iM13684e + (size * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m13683d0(int i10, List<Long> list, InterfaceC2958t1 interfaceC2958t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC2958t1.mo13940r(i10, list, z10);
    }

    /* JADX INFO: renamed from: e */
    public static int m13684e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2969z)) {
            int iM13794l = 0;
            while (i10 < size) {
                iM13794l += AbstractC2929k.m13794l(list.get(i10).intValue());
                i10++;
            }
            return iM13794l;
        }
        C2969z c2969z = (C2969z) list;
        int iM13794l2 = 0;
        while (i10 < size) {
            iM13794l2 += AbstractC2929k.m13794l(c2969z.m14366h(i10));
            i10++;
        }
        return iM13794l2;
    }

    /* JADX INFO: renamed from: f */
    public static int m13685f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(size * 4) : size * AbstractC2929k.m13795m(i10, 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m13686g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m13687h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(size * 8) : size * AbstractC2929k.m13797o(i10, 0L);
    }

    /* JADX INFO: renamed from: i */
    public static int m13688i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m13689j(int i10, List<InterfaceC2954s0> list, InterfaceC2919g1 interfaceC2919g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13801s = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM13801s += AbstractC2929k.m13801s(i10, list.get(i11), interfaceC2919g1);
        }
        return iM13801s;
    }

    /* JADX INFO: renamed from: k */
    public static int m13690k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13691l = m13691l(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13691l) : iM13691l + (size * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: l */
    public static int m13691l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2969z)) {
            int iM13805w = 0;
            while (i10 < size) {
                iM13805w += AbstractC2929k.m13805w(list.get(i10).intValue());
                i10++;
            }
            return iM13805w;
        }
        C2969z c2969z = (C2969z) list;
        int iM13805w2 = 0;
        while (i10 < size) {
            iM13805w2 += AbstractC2929k.m13805w(c2969z.m14366h(i10));
            i10++;
        }
        return iM13805w2;
    }

    /* JADX INFO: renamed from: m */
    public static int m13692m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iM13693n = m13693n(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13693n) : iM13693n + (list.size() * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: n */
    public static int m13693n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2927j0)) {
            int iM13807y = 0;
            while (i10 < size) {
                iM13807y += AbstractC2929k.m13807y(list.get(i10).longValue());
                i10++;
            }
            return iM13807y;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM13807y2 = 0;
        while (i10 < size) {
            iM13807y2 += AbstractC2929k.m13807y(c2927j0.m13723h(i10));
            i10++;
        }
        return iM13807y2;
    }

    /* JADX INFO: renamed from: o */
    public static int m13694o(int i10, Object obj, InterfaceC2919g1 interfaceC2919g1) {
        return obj instanceof C2912e0 ? AbstractC2929k.m13755A(i10, (C2912e0) obj) : AbstractC2929k.m13760F(i10, (InterfaceC2954s0) obj, interfaceC2919g1);
    }

    /* JADX INFO: renamed from: p */
    public static int m13695p(int i10, List<?> list, InterfaceC2919g1 interfaceC2919g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13775U = AbstractC2929k.m13775U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iM13775U += obj instanceof C2912e0 ? AbstractC2929k.m13756B((C2912e0) obj) : AbstractC2929k.m13762H((InterfaceC2954s0) obj, interfaceC2919g1);
        }
        return iM13775U;
    }

    /* JADX INFO: renamed from: q */
    public static int m13696q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13697r = m13697r(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13697r) : iM13697r + (size * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: r */
    public static int m13697r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2969z)) {
            int iM13770P = 0;
            while (i10 < size) {
                iM13770P += AbstractC2929k.m13770P(list.get(i10).intValue());
                i10++;
            }
            return iM13770P;
        }
        C2969z c2969z = (C2969z) list;
        int iM13770P2 = 0;
        while (i10 < size) {
            iM13770P2 += AbstractC2929k.m13770P(c2969z.m14366h(i10));
            i10++;
        }
        return iM13770P2;
    }

    /* JADX INFO: renamed from: s */
    public static int m13698s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13699t = m13699t(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13699t) : iM13699t + (size * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: t */
    public static int m13699t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2927j0)) {
            int iM13772R = 0;
            while (i10 < size) {
                iM13772R += AbstractC2929k.m13772R(list.get(i10).longValue());
                i10++;
            }
            return iM13772R;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM13772R2 = 0;
        while (i10 < size) {
            iM13772R2 += AbstractC2929k.m13772R(c2927j0.m13723h(i10));
            i10++;
        }
        return iM13772R2;
    }

    /* JADX INFO: renamed from: u */
    public static int m13700u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM13775U = AbstractC2929k.m13775U(i10) * size;
        if (!(list instanceof InterfaceC2915f0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iM13775U += obj instanceof AbstractC2920h ? AbstractC2929k.m13790h((AbstractC2920h) obj) : AbstractC2929k.m13774T((String) obj);
                i11++;
            }
            return iM13775U;
        }
        InterfaceC2915f0 interfaceC2915f0 = (InterfaceC2915f0) list;
        while (i11 < size) {
            Object objM13493q = interfaceC2915f0.m13493q(i11);
            iM13775U += objM13493q instanceof AbstractC2920h ? AbstractC2929k.m13790h((AbstractC2920h) objM13493q) : AbstractC2929k.m13774T((String) objM13493q);
            i11++;
        }
        return iM13775U;
    }

    /* JADX INFO: renamed from: v */
    public static int m13701v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13702w = m13702w(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13702w) : iM13702w + (size * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: w */
    public static int m13702w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2969z)) {
            int iM13777W = 0;
            while (i10 < size) {
                iM13777W += AbstractC2929k.m13777W(list.get(i10).intValue());
                i10++;
            }
            return iM13777W;
        }
        C2969z c2969z = (C2969z) list;
        int iM13777W2 = 0;
        while (i10 < size) {
            iM13777W2 += AbstractC2929k.m13777W(c2969z.m14366h(i10));
            i10++;
        }
        return iM13777W2;
    }

    /* JADX INFO: renamed from: x */
    public static int m13703x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM13704y = m13704y(list);
        return z10 ? AbstractC2929k.m13775U(i10) + AbstractC2929k.m13757C(iM13704y) : iM13704y + (size * AbstractC2929k.m13775U(i10));
    }

    /* JADX INFO: renamed from: y */
    public static int m13704y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C2927j0)) {
            int iM13779Y = 0;
            while (i10 < size) {
                iM13779Y += AbstractC2929k.m13779Y(list.get(i10).longValue());
                i10++;
            }
            return iM13779Y;
        }
        C2927j0 c2927j0 = (C2927j0) list;
        int iM13779Y2 = 0;
        while (i10 < size) {
            iM13779Y2 += AbstractC2929k.m13779Y(c2927j0.m13723h(i10));
            i10++;
        }
        return iM13779Y2;
    }

    /* JADX INFO: renamed from: z */
    public static <UT, UB> UB m13705z(Object obj, int i10, List<Integer> list, C2900a0.d<?> dVar, UB ub, AbstractC2940n1<UT, UB> abstractC2940n1) {
        if (dVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (dVar.mo612a(iIntValue) == null) {
                    ub = (UB) m13659J(obj, i10, iIntValue, ub, abstractC2940n1);
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
            if (dVar.mo612a(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) m13659J(obj, i10, iIntValue2, ub, abstractC2940n1);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }
}
