package androidx.datastore.preferences.protobuf;

import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.i1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0848i1 {

    /* JADX INFO: renamed from: a */
    public static final Class<?> f2899a = m3571B();

    /* JADX INFO: renamed from: b */
    public static final AbstractC0863n1<?, ?> f2900b = m3572C();

    /* JADX INFO: renamed from: c */
    public static final AbstractC0863n1<?, ?> f2901c = new C0869p1();

    /* JADX INFO: renamed from: A */
    public static <UT, UB> UB m3570A(Object obj, int i10, List<Integer> list, C0892z.c cVar, UB ub, AbstractC0863n1<UT, UB> abstractC0863n1) {
        if (cVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (!cVar.m4245a(iIntValue)) {
                    ub = (UB) m3579J(obj, i10, iIntValue, ub, abstractC0863n1);
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
            if (cVar.m4245a(iIntValue2)) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) m3579J(obj, i10, iIntValue2, ub, abstractC0863n1);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }

    /* JADX INFO: renamed from: B */
    public static Class<?> m3571B() {
        if (C0830c1.f2837d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessage");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: C */
    public static AbstractC0863n1<?, ?> m3572C() {
        try {
            Class<?> clsM3573D = m3573D();
            if (clsM3573D == null) {
                return null;
            }
            return (AbstractC0863n1) clsM3573D.getConstructor(null).newInstance(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static Class<?> m3573D() {
        if (C0830c1.f2837d) {
            return null;
        }
        try {
            return Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static <T, FT extends C0879t.b<FT>> void m3574E(AbstractC0867p<FT> abstractC0867p, T t8, T t10) {
        C0879t<T> c0879tMo3936c = abstractC0867p.mo3936c(t10);
        if (c0879tMo3936c.m4082n()) {
            return;
        }
        abstractC0867p.mo3937d(t8).m4087v(c0879tMo3936c);
    }

    /* JADX INFO: renamed from: F */
    public static <T> void m3575F(InterfaceC0859m0 interfaceC0859m0, T t8, T t10, long j10) {
        C0872q1.m3974O(t8, j10, interfaceC0859m0.mo3877a(C0872q1.m4002z(t8, j10), C0872q1.m4002z(t10, j10)));
    }

    /* JADX INFO: renamed from: G */
    public static <T, UT, UB> void m3576G(AbstractC0863n1<UT, UB> abstractC0863n1, T t8, T t10) {
        abstractC0863n1.mo3906p(t8, abstractC0863n1.mo3901k(abstractC0863n1.mo3897g(t8), abstractC0863n1.mo3897g(t10)));
    }

    /* JADX INFO: renamed from: H */
    public static void m3577H(Class<?> cls) {
        Class<?> cls2;
        if (!AbstractC0888x.class.isAssignableFrom(cls) && !C0830c1.f2837d && (cls2 = f2899a) != null && !cls2.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Message classes must extend GeneratedMessage or GeneratedMessageLite");
        }
    }

    /* JADX INFO: renamed from: I */
    public static boolean m3578I(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    /* JADX INFO: renamed from: J */
    public static <UT, UB> UB m3579J(Object obj, int i10, int i11, UB ub, AbstractC0863n1<UT, UB> abstractC0863n1) {
        if (ub == null) {
            ub = abstractC0863n1.mo3896f(obj);
        }
        abstractC0863n1.mo3895e(ub, i10, i11);
        return ub;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC0863n1<?, ?> m3580K() {
        return f2900b;
    }

    /* JADX INFO: renamed from: L */
    public static AbstractC0863n1<?, ?> m3581L() {
        return f2901c;
    }

    /* JADX INFO: renamed from: M */
    public static void m3582M(int i10, List<Boolean> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3778A(i10, list, z10);
    }

    /* JADX INFO: renamed from: N */
    public static void m3583N(int i10, List<AbstractC0840g> list, InterfaceC0881t1 interfaceC0881t1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3786I(i10, list);
    }

    /* JADX INFO: renamed from: O */
    public static void m3584O(int i10, List<Double> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3784G(i10, list, z10);
    }

    /* JADX INFO: renamed from: P */
    public static void m3585P(int i10, List<Integer> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3829n(i10, list, z10);
    }

    /* JADX INFO: renamed from: Q */
    public static void m3586Q(int i10, List<Integer> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3821j(i10, list, z10);
    }

    /* JADX INFO: renamed from: R */
    public static void m3587R(int i10, List<Long> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3851y(i10, list, z10);
    }

    /* JADX INFO: renamed from: S */
    public static void m3588S(int i10, List<Float> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3803a(i10, list, z10);
    }

    /* JADX INFO: renamed from: T */
    public static void m3589T(int i10, List<?> list, InterfaceC0881t1 interfaceC0881t1, InterfaceC0842g1 interfaceC0842g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3787J(i10, list, interfaceC0842g1);
    }

    /* JADX INFO: renamed from: U */
    public static void m3590U(int i10, List<Integer> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3815g(i10, list, z10);
    }

    /* JADX INFO: renamed from: V */
    public static void m3591V(int i10, List<Long> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3783F(i10, list, z10);
    }

    /* JADX INFO: renamed from: W */
    public static void m3592W(int i10, List<?> list, InterfaceC0881t1 interfaceC0881t1, InterfaceC0842g1 interfaceC0842g1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3792O(i10, list, interfaceC0842g1);
    }

    /* JADX INFO: renamed from: X */
    public static void m3593X(int i10, List<Integer> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3852z(i10, list, z10);
    }

    /* JADX INFO: renamed from: Y */
    public static void m3594Y(int i10, List<Long> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3835q(i10, list, z10);
    }

    /* JADX INFO: renamed from: Z */
    public static void m3595Z(int i10, List<Integer> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3781D(i10, list, z10);
    }

    /* JADX INFO: renamed from: a */
    public static int m3596a(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(size) : size * AbstractC0849j.m3654d(i10, true);
    }

    /* JADX INFO: renamed from: a0 */
    public static void m3597a0(int i10, List<Long> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3825l(i10, list, z10);
    }

    /* JADX INFO: renamed from: b */
    public static int m3598b(List<?> list) {
        return list.size();
    }

    /* JADX INFO: renamed from: b0 */
    public static void m3599b0(int i10, List<String> list, InterfaceC0881t1 interfaceC0881t1) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3809d(i10, list);
    }

    /* JADX INFO: renamed from: c */
    public static int m3600c(int i10, List<AbstractC0840g> list) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3646U = size * AbstractC0849j.m3646U(i10);
        for (int i11 = 0; i11 < list.size(); i11++) {
            iM3646U += AbstractC0849j.m3661h(list.get(i11));
        }
        return iM3646U;
    }

    /* JADX INFO: renamed from: c0 */
    public static void m3601c0(int i10, List<Integer> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3823k(i10, list, z10);
    }

    /* JADX INFO: renamed from: d */
    public static int m3602d(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3604e = m3604e(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3604e) : iM3604e + (size * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: d0 */
    public static void m3603d0(int i10, List<Long> list, InterfaceC0881t1 interfaceC0881t1, boolean z10) {
        if (list == null || list.isEmpty()) {
            return;
        }
        interfaceC0881t1.mo3837r(i10, list, z10);
    }

    /* JADX INFO: renamed from: e */
    public static int m3604e(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0890y)) {
            int iM3665l = 0;
            while (i10 < size) {
                iM3665l += AbstractC0849j.m3665l(list.get(i10).intValue());
                i10++;
            }
            return iM3665l;
        }
        C0890y c0890y = (C0890y) list;
        int iM3665l2 = 0;
        while (i10 < size) {
            iM3665l2 += AbstractC0849j.m3665l(c0890y.m4228h(i10));
            i10++;
        }
        return iM3665l2;
    }

    /* JADX INFO: renamed from: f */
    public static int m3605f(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(size * 4) : size * AbstractC0849j.m3666m(i10, 0);
    }

    /* JADX INFO: renamed from: g */
    public static int m3606g(List<?> list) {
        return list.size() * 4;
    }

    /* JADX INFO: renamed from: h */
    public static int m3607h(int i10, List<?> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(size * 8) : size * AbstractC0849j.m3668o(i10, 0L);
    }

    /* JADX INFO: renamed from: i */
    public static int m3608i(List<?> list) {
        return list.size() * 8;
    }

    /* JADX INFO: renamed from: j */
    public static int m3609j(int i10, List<InterfaceC0874r0> list, InterfaceC0842g1 interfaceC0842g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3672s = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM3672s += AbstractC0849j.m3672s(i10, list.get(i11), interfaceC0842g1);
        }
        return iM3672s;
    }

    /* JADX INFO: renamed from: k */
    public static int m3610k(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3611l = m3611l(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3611l) : iM3611l + (size * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: l */
    public static int m3611l(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0890y)) {
            int iM3676w = 0;
            while (i10 < size) {
                iM3676w += AbstractC0849j.m3676w(list.get(i10).intValue());
                i10++;
            }
            return iM3676w;
        }
        C0890y c0890y = (C0890y) list;
        int iM3676w2 = 0;
        while (i10 < size) {
            iM3676w2 += AbstractC0849j.m3676w(c0890y.m4228h(i10));
            i10++;
        }
        return iM3676w2;
    }

    /* JADX INFO: renamed from: m */
    public static int m3612m(int i10, List<Long> list, boolean z10) {
        if (list.size() == 0) {
            return 0;
        }
        int iM3613n = m3613n(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3613n) : iM3613n + (list.size() * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: n */
    public static int m3613n(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0847i0)) {
            int iM3678y = 0;
            while (i10 < size) {
                iM3678y += AbstractC0849j.m3678y(list.get(i10).longValue());
                i10++;
            }
            return iM3678y;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM3678y2 = 0;
        while (i10 < size) {
            iM3678y2 += AbstractC0849j.m3678y(c0847i0.m3565h(i10));
            i10++;
        }
        return iM3678y2;
    }

    /* JADX INFO: renamed from: o */
    public static int m3614o(int i10, Object obj, InterfaceC0842g1 interfaceC0842g1) {
        return obj instanceof C0832d0 ? AbstractC0849j.m3626A(i10, (C0832d0) obj) : AbstractC0849j.m3631F(i10, (InterfaceC0874r0) obj, interfaceC0842g1);
    }

    /* JADX INFO: renamed from: p */
    public static int m3615p(int i10, List<?> list, InterfaceC0842g1 interfaceC0842g1) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3646U = AbstractC0849j.m3646U(i10) * size;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            iM3646U += obj instanceof C0832d0 ? AbstractC0849j.m3627B((C0832d0) obj) : AbstractC0849j.m3633H((InterfaceC0874r0) obj, interfaceC0842g1);
        }
        return iM3646U;
    }

    /* JADX INFO: renamed from: q */
    public static int m3616q(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3617r = m3617r(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3617r) : iM3617r + (size * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: r */
    public static int m3617r(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0890y)) {
            int iM3641P = 0;
            while (i10 < size) {
                iM3641P += AbstractC0849j.m3641P(list.get(i10).intValue());
                i10++;
            }
            return iM3641P;
        }
        C0890y c0890y = (C0890y) list;
        int iM3641P2 = 0;
        while (i10 < size) {
            iM3641P2 += AbstractC0849j.m3641P(c0890y.m4228h(i10));
            i10++;
        }
        return iM3641P2;
    }

    /* JADX INFO: renamed from: s */
    public static int m3618s(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3619t = m3619t(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3619t) : iM3619t + (size * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: t */
    public static int m3619t(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0847i0)) {
            int iM3643R = 0;
            while (i10 < size) {
                iM3643R += AbstractC0849j.m3643R(list.get(i10).longValue());
                i10++;
            }
            return iM3643R;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM3643R2 = 0;
        while (i10 < size) {
            iM3643R2 += AbstractC0849j.m3643R(c0847i0.m3565h(i10));
            i10++;
        }
        return iM3643R2;
    }

    /* JADX INFO: renamed from: u */
    public static int m3620u(int i10, List<?> list) {
        int size = list.size();
        int i11 = 0;
        if (size == 0) {
            return 0;
        }
        int iM3646U = AbstractC0849j.m3646U(i10) * size;
        if (!(list instanceof InterfaceC0835e0)) {
            while (i11 < size) {
                Object obj = list.get(i11);
                iM3646U += obj instanceof AbstractC0840g ? AbstractC0849j.m3661h((AbstractC0840g) obj) : AbstractC0849j.m3645T((String) obj);
                i11++;
            }
            return iM3646U;
        }
        InterfaceC0835e0 interfaceC0835e0 = (InterfaceC0835e0) list;
        while (i11 < size) {
            Object objM3385q = interfaceC0835e0.m3385q(i11);
            iM3646U += objM3385q instanceof AbstractC0840g ? AbstractC0849j.m3661h((AbstractC0840g) objM3385q) : AbstractC0849j.m3645T((String) objM3385q);
            i11++;
        }
        return iM3646U;
    }

    /* JADX INFO: renamed from: v */
    public static int m3621v(int i10, List<Integer> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3622w = m3622w(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3622w) : iM3622w + (size * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: w */
    public static int m3622w(List<Integer> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0890y)) {
            int iM3648W = 0;
            while (i10 < size) {
                iM3648W += AbstractC0849j.m3648W(list.get(i10).intValue());
                i10++;
            }
            return iM3648W;
        }
        C0890y c0890y = (C0890y) list;
        int iM3648W2 = 0;
        while (i10 < size) {
            iM3648W2 += AbstractC0849j.m3648W(c0890y.m4228h(i10));
            i10++;
        }
        return iM3648W2;
    }

    /* JADX INFO: renamed from: x */
    public static int m3623x(int i10, List<Long> list, boolean z10) {
        int size = list.size();
        if (size == 0) {
            return 0;
        }
        int iM3624y = m3624y(list);
        return z10 ? AbstractC0849j.m3646U(i10) + AbstractC0849j.m3628C(iM3624y) : iM3624y + (size * AbstractC0849j.m3646U(i10));
    }

    /* JADX INFO: renamed from: y */
    public static int m3624y(List<Long> list) {
        int size = list.size();
        int i10 = 0;
        if (size == 0) {
            return 0;
        }
        if (!(list instanceof C0847i0)) {
            int iM3650Y = 0;
            while (i10 < size) {
                iM3650Y += AbstractC0849j.m3650Y(list.get(i10).longValue());
                i10++;
            }
            return iM3650Y;
        }
        C0847i0 c0847i0 = (C0847i0) list;
        int iM3650Y2 = 0;
        while (i10 < size) {
            iM3650Y2 += AbstractC0849j.m3650Y(c0847i0.m3565h(i10));
            i10++;
        }
        return iM3650Y2;
    }

    /* JADX INFO: renamed from: z */
    public static <UT, UB> UB m3625z(Object obj, int i10, List<Integer> list, C0892z.b<?> bVar, UB ub, AbstractC0863n1<UT, UB> abstractC0863n1) {
        if (bVar == null) {
            return ub;
        }
        if (!(list instanceof RandomAccess)) {
            Iterator<Integer> it = list.iterator();
            while (it.hasNext()) {
                int iIntValue = it.next().intValue();
                if (bVar.m4244a(iIntValue) == null) {
                    ub = (UB) m3579J(obj, i10, iIntValue, ub, abstractC0863n1);
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
            if (bVar.m4244a(iIntValue2) != null) {
                if (i12 != i11) {
                    list.set(i11, num);
                }
                i11++;
            } else {
                ub = (UB) m3579J(obj, i10, iIntValue2, ub, abstractC0863n1);
            }
        }
        if (i11 != size) {
            list.subList(i11, size).clear();
        }
        return ub;
    }
}
