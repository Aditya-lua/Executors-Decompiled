package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0852k implements InterfaceC0881t1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC0849j f2937a;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.k$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f2938a;

        static {
            int[] iArr = new int[C0878s1.b.values().length];
            f2938a = iArr;
            try {
                iArr[C0878s1.b.f3009j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2938a[C0878s1.b.f3008i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2938a[C0878s1.b.f3006g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2938a[C0878s1.b.f3016q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2938a[C0878s1.b.f3018s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2938a[C0878s1.b.f3014o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2938a[C0878s1.b.f3007h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2938a[C0878s1.b.f3004e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2938a[C0878s1.b.f3017r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2938a[C0878s1.b.f3019t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2938a[C0878s1.b.f3005f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2938a[C0878s1.b.f3010k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C0852k(AbstractC0849j abstractC0849j) {
        AbstractC0849j abstractC0849j2 = (AbstractC0849j) C0892z.m4237b(abstractC0849j, "output");
        this.f2937a = abstractC0849j2;
        abstractC0849j2.f2904a = this;
    }

    /* JADX INFO: renamed from: P */
    public static C0852k m3777P(AbstractC0849j abstractC0849j) {
        C0852k c0852k = abstractC0849j.f2904a;
        return c0852k != null ? c0852k : new C0852k(abstractC0849j);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: A */
    public void mo3778A(int i10, List<Boolean> list, boolean z10) {
        if (list instanceof C0834e) {
            m3793Q(i10, (C0834e) list, z10);
        } else {
            m3794R(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: B */
    public void mo3779B(int i10, float f10) {
        this.f2937a.m3726x0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    @Deprecated
    /* JADX INFO: renamed from: C */
    public void mo3780C(int i10) {
        this.f2937a.mo3701V0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: D */
    public void mo3781D(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C0890y) {
            m3836q0(i10, (C0890y) list, z10);
        } else {
            m3838r0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: E */
    public void mo3782E(int i10, int i11) {
        this.f2937a.m3720r0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: F */
    public void mo3783F(int i10, List<Long> list, boolean z10) {
        if (list instanceof C0847i0) {
            m3822j0(i10, (C0847i0) list, z10);
        } else {
            m3824k0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: G */
    public void mo3784G(int i10, List<Double> list, boolean z10) {
        if (list instanceof C0855l) {
            m3800X(i10, (C0855l) list, z10);
        } else {
            m3801Y(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: H */
    public void mo3785H(int i10, int i11) {
        this.f2937a.m3695P0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: I */
    public void mo3786I(int i10, List<AbstractC0840g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f2937a.mo3716n0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: J */
    public void mo3787J(int i10, List<?> list, InterfaceC0842g1 interfaceC0842g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo3791N(i10, list.get(i11), interfaceC0842g1);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: K */
    public void mo3788K(int i10, AbstractC0840g abstractC0840g) {
        this.f2937a.mo3716n0(i10, abstractC0840g);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: L */
    public void mo3789L(int i10, Object obj, InterfaceC0842g1 interfaceC0842g1) {
        this.f2937a.mo3687H0(i10, (InterfaceC0874r0) obj, interfaceC0842g1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: M */
    public <K, V> void mo3790M(int i10, C0853k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f2937a.m3709d0()) {
            m3798V(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f2937a.mo3701V0(i10, 2);
            this.f2937a.mo3703X0(C0853k0.m3853b(aVar, entry.getKey(), entry.getValue()));
            C0853k0.m3855e(this.f2937a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: N */
    public void mo3791N(int i10, Object obj, InterfaceC0842g1 interfaceC0842g1) {
        this.f2937a.m3680A0(i10, (InterfaceC0874r0) obj, interfaceC0842g1);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: O */
    public void mo3792O(int i10, List<?> list, InterfaceC0842g1 interfaceC0842g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo3789L(i10, list.get(i11), interfaceC0842g1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m3793Q(int i10, C0834e c0834e, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0834e.size()) {
                this.f2937a.mo3712j0(i10, c0834e.m3383c(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3655e = 0;
        for (int i12 = 0; i12 < c0834e.size(); i12++) {
            iM3655e += AbstractC0849j.m3655e(c0834e.m3383c(i12));
        }
        this.f2937a.mo3703X0(iM3655e);
        while (i11 < c0834e.size()) {
            this.f2937a.m3713k0(c0834e.m3383c(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m3794R(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.mo3712j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3655e = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3655e += AbstractC0849j.m3655e(list.get(i12).booleanValue());
        }
        this.f2937a.mo3703X0(iM3655e);
        while (i11 < list.size()) {
            this.f2937a.m3713k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: S */
    public final <V> void m3795S(int i10, boolean z10, V v5, C0853k0.a<Boolean, V> aVar) {
        this.f2937a.mo3701V0(i10, 2);
        this.f2937a.mo3703X0(C0853k0.m3853b(aVar, Boolean.valueOf(z10), v5));
        C0853k0.m3855e(this.f2937a, aVar, Boolean.valueOf(z10), v5);
    }

    /* JADX INFO: renamed from: T */
    public final <V> void m3796T(int i10, C0853k0.a<Integer, V> aVar, Map<Integer, V> map) {
        int size = map.size();
        int[] iArr = new int[size];
        Iterator<Integer> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            iArr[i11] = it.next().intValue();
            i11++;
        }
        Arrays.sort(iArr);
        for (int i12 = 0; i12 < size; i12++) {
            int i13 = iArr[i12];
            V v5 = map.get(Integer.valueOf(i13));
            this.f2937a.mo3701V0(i10, 2);
            this.f2937a.mo3703X0(C0853k0.m3853b(aVar, Integer.valueOf(i13), v5));
            C0853k0.m3855e(this.f2937a, aVar, Integer.valueOf(i13), v5);
        }
    }

    /* JADX INFO: renamed from: U */
    public final <V> void m3797U(int i10, C0853k0.a<Long, V> aVar, Map<Long, V> map) {
        int size = map.size();
        long[] jArr = new long[size];
        Iterator<Long> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            jArr[i11] = it.next().longValue();
            i11++;
        }
        Arrays.sort(jArr);
        for (int i12 = 0; i12 < size; i12++) {
            long j10 = jArr[i12];
            V v5 = map.get(Long.valueOf(j10));
            this.f2937a.mo3701V0(i10, 2);
            this.f2937a.mo3703X0(C0853k0.m3853b(aVar, Long.valueOf(j10), v5));
            C0853k0.m3855e(this.f2937a, aVar, Long.valueOf(j10), v5);
        }
    }

    /* JADX INFO: renamed from: V */
    public final <K, V> void m3798V(int i10, C0853k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f2938a[aVar.f2942a.ordinal()]) {
            case 1:
                V v5 = map.get(Boolean.FALSE);
                if (v5 != null) {
                    m3795S(i10, false, v5, aVar);
                }
                V v10 = map.get(Boolean.TRUE);
                if (v10 != null) {
                    m3795S(i10, true, v10, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                m3796T(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                m3797U(i10, aVar, map);
                return;
            case 12:
                m3799W(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f2942a);
        }
    }

    /* JADX INFO: renamed from: W */
    public final <V> void m3799W(int i10, C0853k0.a<String, V> aVar, Map<String, V> map) {
        int size = map.size();
        String[] strArr = new String[size];
        Iterator<String> it = map.keySet().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            strArr[i11] = it.next();
            i11++;
        }
        Arrays.sort(strArr);
        for (int i12 = 0; i12 < size; i12++) {
            String str = strArr[i12];
            V v5 = map.get(str);
            this.f2937a.mo3701V0(i10, 2);
            this.f2937a.mo3703X0(C0853k0.m3853b(aVar, str, v5));
            C0853k0.m3855e(this.f2937a, aVar, str, v5);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m3800X(int i10, C0855l c0855l, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0855l.size()) {
                this.f2937a.m3718p0(i10, c0855l.m3861c(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3663j = 0;
        for (int i12 = 0; i12 < c0855l.size(); i12++) {
            iM3663j += AbstractC0849j.m3663j(c0855l.m3861c(i12));
        }
        this.f2937a.mo3703X0(iM3663j);
        while (i11 < c0855l.size()) {
            this.f2937a.m3719q0(c0855l.m3861c(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m3801Y(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3718p0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3663j = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3663j += AbstractC0849j.m3663j(list.get(i12).doubleValue());
        }
        this.f2937a.mo3703X0(iM3663j);
        while (i11 < list.size()) {
            this.f2937a.m3719q0(list.get(i11).doubleValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m3802Z(int i10, C0890y c0890y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0890y.size()) {
                this.f2937a.m3720r0(i10, c0890y.m4228h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3665l = 0;
        for (int i12 = 0; i12 < c0890y.size(); i12++) {
            iM3665l += AbstractC0849j.m3665l(c0890y.m4228h(i12));
        }
        this.f2937a.mo3703X0(iM3665l);
        while (i11 < c0890y.size()) {
            this.f2937a.m3721s0(c0890y.m4228h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: a */
    public void mo3803a(int i10, List<Float> list, boolean z10) {
        if (list instanceof C0884v) {
            m3814f0(i10, (C0884v) list, z10);
        } else {
            m3816g0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m3804a0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3720r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3665l = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3665l += AbstractC0849j.m3665l(list.get(i12).intValue());
        }
        this.f2937a.mo3703X0(iM3665l);
        while (i11 < list.size()) {
            this.f2937a.m3721s0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: b */
    public final void mo3805b(int i10, Object obj) {
        if (obj instanceof AbstractC0840g) {
            this.f2937a.mo3690K0(i10, (AbstractC0840g) obj);
        } else {
            this.f2937a.mo3689J0(i10, (InterfaceC0874r0) obj);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m3806b0(int i10, C0890y c0890y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0890y.size()) {
                this.f2937a.mo3722t0(i10, c0890y.m4228h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3667n = 0;
        for (int i12 = 0; i12 < c0890y.size(); i12++) {
            iM3667n += AbstractC0849j.m3667n(c0890y.m4228h(i12));
        }
        this.f2937a.mo3703X0(iM3667n);
        while (i11 < c0890y.size()) {
            this.f2937a.mo3723u0(c0890y.m4228h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: c */
    public void mo3807c(int i10, int i11) {
        this.f2937a.mo3722t0(i10, i11);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m3808c0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.mo3722t0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3667n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3667n += AbstractC0849j.m3667n(list.get(i12).intValue());
        }
        this.f2937a.mo3703X0(iM3667n);
        while (i11 < list.size()) {
            this.f2937a.mo3723u0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: d */
    public void mo3809d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC0835e0)) {
            while (i11 < list.size()) {
                this.f2937a.mo3699T0(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC0835e0 interfaceC0835e0 = (InterfaceC0835e0) list;
            while (i11 < list.size()) {
                m3826l0(i10, interfaceC0835e0.m3385q(i11));
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m3810d0(int i10, C0847i0 c0847i0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0847i0.size()) {
                this.f2937a.mo3724v0(i10, c0847i0.m3565h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3669p = 0;
        for (int i12 = 0; i12 < c0847i0.size(); i12++) {
            iM3669p += AbstractC0849j.m3669p(c0847i0.m3565h(i12));
        }
        this.f2937a.mo3703X0(iM3669p);
        while (i11 < c0847i0.size()) {
            this.f2937a.mo3725w0(c0847i0.m3565h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: e */
    public void mo3811e(int i10, String str) {
        this.f2937a.mo3699T0(i10, str);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m3812e0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.mo3724v0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3669p = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3669p += AbstractC0849j.m3669p(list.get(i12).longValue());
        }
        this.f2937a.mo3703X0(iM3669p);
        while (i11 < list.size()) {
            this.f2937a.mo3725w0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: f */
    public void mo3813f(int i10, long j10) {
        this.f2937a.mo3704Y0(i10, j10);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m3814f0(int i10, C0884v c0884v, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0884v.size()) {
                this.f2937a.m3726x0(i10, c0884v.m4164c(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3671r = 0;
        for (int i12 = 0; i12 < c0884v.size(); i12++) {
            iM3671r += AbstractC0849j.m3671r(c0884v.m4164c(i12));
        }
        this.f2937a.mo3703X0(iM3671r);
        while (i11 < c0884v.size()) {
            this.f2937a.m3727y0(c0884v.m4164c(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: g */
    public void mo3815g(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C0890y) {
            m3818h0(i10, (C0890y) list, z10);
        } else {
            m3820i0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m3816g0(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3726x0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3671r = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3671r += AbstractC0849j.m3671r(list.get(i12).floatValue());
        }
        this.f2937a.mo3703X0(iM3671r);
        while (i11 < list.size()) {
            this.f2937a.m3727y0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: h */
    public void mo3817h(int i10, int i11) {
        this.f2937a.mo3683D0(i10, i11);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m3818h0(int i10, C0890y c0890y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0890y.size()) {
                this.f2937a.mo3683D0(i10, c0890y.m4228h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3676w = 0;
        for (int i12 = 0; i12 < c0890y.size(); i12++) {
            iM3676w += AbstractC0849j.m3676w(c0890y.m4228h(i12));
        }
        this.f2937a.mo3703X0(iM3676w);
        while (i11 < c0890y.size()) {
            this.f2937a.mo3684E0(c0890y.m4228h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: i */
    public void mo3819i(int i10, long j10) {
        this.f2937a.m3693N0(i10, j10);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m3820i0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.mo3683D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3676w = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3676w += AbstractC0849j.m3676w(list.get(i12).intValue());
        }
        this.f2937a.mo3703X0(iM3676w);
        while (i11 < list.size()) {
            this.f2937a.mo3684E0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: j */
    public void mo3821j(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C0890y) {
            m3806b0(i10, (C0890y) list, z10);
        } else {
            m3808c0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m3822j0(int i10, C0847i0 c0847i0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0847i0.size()) {
                this.f2937a.m3685F0(i10, c0847i0.m3565h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3678y = 0;
        for (int i12 = 0; i12 < c0847i0.size(); i12++) {
            iM3678y += AbstractC0849j.m3678y(c0847i0.m3565h(i12));
        }
        this.f2937a.mo3703X0(iM3678y);
        while (i11 < c0847i0.size()) {
            this.f2937a.m3686G0(c0847i0.m3565h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: k */
    public void mo3823k(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C0890y) {
            m3844u0(i10, (C0890y) list, z10);
        } else {
            m3846v0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m3824k0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3685F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3678y = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3678y += AbstractC0849j.m3678y(list.get(i12).longValue());
        }
        this.f2937a.mo3703X0(iM3678y);
        while (i11 < list.size()) {
            this.f2937a.m3686G0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: l */
    public void mo3825l(int i10, List<Long> list, boolean z10) {
        if (list instanceof C0847i0) {
            m3840s0(i10, (C0847i0) list, z10);
        } else {
            m3842t0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m3826l0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f2937a.mo3699T0(i10, (String) obj);
        } else {
            this.f2937a.mo3716n0(i10, (AbstractC0840g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: m */
    public void mo3827m(int i10, long j10) {
        this.f2937a.m3697R0(i10, j10);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m3828m0(int i10, C0890y c0890y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0890y.size()) {
                this.f2937a.m3691L0(i10, c0890y.m4228h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3637L = 0;
        for (int i12 = 0; i12 < c0890y.size(); i12++) {
            iM3637L += AbstractC0849j.m3637L(c0890y.m4228h(i12));
        }
        this.f2937a.mo3703X0(iM3637L);
        while (i11 < c0890y.size()) {
            this.f2937a.m3692M0(c0890y.m4228h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: n */
    public void mo3829n(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C0890y) {
            m3802Z(i10, (C0890y) list, z10);
        } else {
            m3804a0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final void m3830n0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3691L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3637L = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3637L += AbstractC0849j.m3637L(list.get(i12).intValue());
        }
        this.f2937a.mo3703X0(iM3637L);
        while (i11 < list.size()) {
            this.f2937a.m3692M0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: o */
    public void mo3831o(int i10, int i11) {
        this.f2937a.mo3702W0(i10, i11);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m3832o0(int i10, C0847i0 c0847i0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0847i0.size()) {
                this.f2937a.m3693N0(i10, c0847i0.m3565h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3639N = 0;
        for (int i12 = 0; i12 < c0847i0.size(); i12++) {
            iM3639N += AbstractC0849j.m3639N(c0847i0.m3565h(i12));
        }
        this.f2937a.mo3703X0(iM3639N);
        while (i11 < c0847i0.size()) {
            this.f2937a.m3694O0(c0847i0.m3565h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: p */
    public void mo3833p(int i10, double d10) {
        this.f2937a.m3718p0(i10, d10);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m3834p0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3693N0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3639N = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3639N += AbstractC0849j.m3639N(list.get(i12).longValue());
        }
        this.f2937a.mo3703X0(iM3639N);
        while (i11 < list.size()) {
            this.f2937a.m3694O0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: q */
    public void mo3835q(int i10, List<Long> list, boolean z10) {
        if (list instanceof C0847i0) {
            m3832o0(i10, (C0847i0) list, z10);
        } else {
            m3834p0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m3836q0(int i10, C0890y c0890y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0890y.size()) {
                this.f2937a.m3695P0(i10, c0890y.m4228h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3641P = 0;
        for (int i12 = 0; i12 < c0890y.size(); i12++) {
            iM3641P += AbstractC0849j.m3641P(c0890y.m4228h(i12));
        }
        this.f2937a.mo3703X0(iM3641P);
        while (i11 < c0890y.size()) {
            this.f2937a.m3696Q0(c0890y.m4228h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: r */
    public void mo3837r(int i10, List<Long> list, boolean z10) {
        if (list instanceof C0847i0) {
            m3848w0(i10, (C0847i0) list, z10);
        } else {
            m3850x0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m3838r0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3695P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3641P = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3641P += AbstractC0849j.m3641P(list.get(i12).intValue());
        }
        this.f2937a.mo3703X0(iM3641P);
        while (i11 < list.size()) {
            this.f2937a.m3696Q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: s */
    public void mo3839s(int i10, long j10) {
        this.f2937a.mo3724v0(i10, j10);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m3840s0(int i10, C0847i0 c0847i0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0847i0.size()) {
                this.f2937a.m3697R0(i10, c0847i0.m3565h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3643R = 0;
        for (int i12 = 0; i12 < c0847i0.size(); i12++) {
            iM3643R += AbstractC0849j.m3643R(c0847i0.m3565h(i12));
        }
        this.f2937a.mo3703X0(iM3643R);
        while (i11 < c0847i0.size()) {
            this.f2937a.m3698S0(c0847i0.m3565h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: t */
    public InterfaceC0881t1.a mo3841t() {
        return InterfaceC0881t1.a.ASCENDING;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m3842t0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.m3697R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3643R = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3643R += AbstractC0849j.m3643R(list.get(i12).longValue());
        }
        this.f2937a.mo3703X0(iM3643R);
        while (i11 < list.size()) {
            this.f2937a.m3698S0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: u */
    public void mo3843u(int i10, long j10) {
        this.f2937a.m3685F0(i10, j10);
    }

    /* JADX INFO: renamed from: u0 */
    public final void m3844u0(int i10, C0890y c0890y, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0890y.size()) {
                this.f2937a.mo3702W0(i10, c0890y.m4228h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3648W = 0;
        for (int i12 = 0; i12 < c0890y.size(); i12++) {
            iM3648W += AbstractC0849j.m3648W(c0890y.m4228h(i12));
        }
        this.f2937a.mo3703X0(iM3648W);
        while (i11 < c0890y.size()) {
            this.f2937a.mo3703X0(c0890y.m4228h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: v */
    public void mo3845v(int i10, boolean z10) {
        this.f2937a.mo3712j0(i10, z10);
    }

    /* JADX INFO: renamed from: v0 */
    public void m3846v0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.mo3702W0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3648W = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3648W += AbstractC0849j.m3648W(list.get(i12).intValue());
        }
        this.f2937a.mo3703X0(iM3648W);
        while (i11 < list.size()) {
            this.f2937a.mo3703X0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: w */
    public void mo3847w(int i10, int i11) {
        this.f2937a.m3691L0(i10, i11);
    }

    /* JADX INFO: renamed from: w0 */
    public final void m3848w0(int i10, C0847i0 c0847i0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c0847i0.size()) {
                this.f2937a.mo3704Y0(i10, c0847i0.m3565h(i11));
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3650Y = 0;
        for (int i12 = 0; i12 < c0847i0.size(); i12++) {
            iM3650Y += AbstractC0849j.m3650Y(c0847i0.m3565h(i12));
        }
        this.f2937a.mo3703X0(iM3650Y);
        while (i11 < c0847i0.size()) {
            this.f2937a.mo3705Z0(c0847i0.m3565h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    @Deprecated
    /* JADX INFO: renamed from: x */
    public void mo3849x(int i10) {
        this.f2937a.mo3701V0(i10, 3);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m3850x0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2937a.mo3704Y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2937a.mo3701V0(i10, 2);
        int iM3650Y = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM3650Y += AbstractC0849j.m3650Y(list.get(i12).longValue());
        }
        this.f2937a.mo3703X0(iM3650Y);
        while (i11 < list.size()) {
            this.f2937a.mo3705Z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: y */
    public void mo3851y(int i10, List<Long> list, boolean z10) {
        if (list instanceof C0847i0) {
            m3810d0(i10, (C0847i0) list, z10);
        } else {
            m3812e0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0881t1
    /* JADX INFO: renamed from: z */
    public void mo3852z(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C0890y) {
            m3828m0(i10, (C0890y) list, z10);
        } else {
            m3830n0(i10, list, z10);
        }
    }
}
