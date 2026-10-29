package com.google.crypto.tink.shaded.protobuf;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l */
/* JADX INFO: loaded from: classes2.dex */
public final class C2932l implements InterfaceC2958t1 {

    /* JADX INFO: renamed from: a */
    public final AbstractC2929k f10940a;

    /* JADX INFO: renamed from: com.google.crypto.tink.shaded.protobuf.l$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f10941a;

        static {
            int[] iArr = new int[C2955s1.b.values().length];
            f10941a = iArr;
            try {
                iArr[C2955s1.b.f11003j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10941a[C2955s1.b.f11002i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10941a[C2955s1.b.f11000g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10941a[C2955s1.b.f11010q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10941a[C2955s1.b.f11012s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10941a[C2955s1.b.f11008o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10941a[C2955s1.b.f11001h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10941a[C2955s1.b.f10998e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10941a[C2955s1.b.f11011r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10941a[C2955s1.b.f11013t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10941a[C2955s1.b.f10999f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f10941a[C2955s1.b.f11004k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public C2932l(AbstractC2929k abstractC2929k) {
        AbstractC2929k abstractC2929k2 = (AbstractC2929k) C2900a0.m13380b(abstractC2929k, "output");
        this.f10940a = abstractC2929k2;
        abstractC2929k2.f10920a = this;
    }

    /* JADX INFO: renamed from: P */
    public static C2932l m13880P(AbstractC2929k abstractC2929k) {
        C2932l c2932l = abstractC2929k.f10920a;
        return c2932l != null ? c2932l : new C2932l(abstractC2929k);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: A */
    public void mo13881A(int i10, List<Boolean> list, boolean z10) {
        if (list instanceof C2914f) {
            m13896Q(i10, (C2914f) list, z10);
        } else {
            m13897R(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: B */
    public void mo13882B(int i10, float f10) {
        this.f10940a.m13845u0(i10, f10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    @Deprecated
    /* JADX INFO: renamed from: C */
    public void mo13883C(int i10) {
        this.f10940a.mo13823O0(i10, 4);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: D */
    public void mo13884D(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C2969z) {
            m13931m0(i10, (C2969z) list, z10);
        } else {
            m13933n0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: E */
    public void mo13885E(int i10, int i11) {
        this.f10940a.m13839o0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: F */
    public void mo13886F(int i10, List<Long> list, boolean z10) {
        if (list instanceof C2927j0) {
            m13917f0(i10, (C2927j0) list, z10);
        } else {
            m13919g0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: G */
    public void mo13887G(int i10, List<Double> list, boolean z10) {
        if (list instanceof C2935m) {
            m13899T(i10, (C2935m) list, z10);
        } else {
            m13900U(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: H */
    public void mo13888H(int i10, int i11) {
        this.f10940a.m13818J0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: I */
    public void mo13889I(int i10, List<AbstractC2920h> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f10940a.mo13836l0(i10, list.get(i11));
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: J */
    public <K, V> void mo13890J(int i10, C2933l0.a<K, V> aVar, Map<K, V> map) {
        if (this.f10940a.m13831d0()) {
            m13898S(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f10940a.mo13823O0(i10, 2);
            this.f10940a.mo13825Q0(C2933l0.m13952b(aVar, entry.getKey(), entry.getValue()));
            C2933l0.m13953d(this.f10940a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: K */
    public void mo13891K(int i10, Object obj, InterfaceC2919g1 interfaceC2919g1) {
        this.f10940a.m13847w0(i10, (InterfaceC2954s0) obj, interfaceC2919g1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: L */
    public void mo13892L(int i10, List<?> list, InterfaceC2919g1 interfaceC2919g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo13894N(i10, list.get(i11), interfaceC2919g1);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: M */
    public void mo13893M(int i10, AbstractC2920h abstractC2920h) {
        this.f10940a.mo13836l0(i10, abstractC2920h);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: N */
    public void mo13894N(int i10, Object obj, InterfaceC2919g1 interfaceC2919g1) {
        this.f10940a.mo13811C0(i10, (InterfaceC2954s0) obj, interfaceC2919g1);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: O */
    public void mo13895O(int i10, List<?> list, InterfaceC2919g1 interfaceC2919g1) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            mo13891K(i10, list.get(i11), interfaceC2919g1);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m13896Q(int i10, C2914f c2914f, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2914f.size()) {
                this.f10940a.mo13834j0(i10, c2914f.m13486h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13784e = 0;
        for (int i12 = 0; i12 < c2914f.size(); i12++) {
            iM13784e += AbstractC2929k.m13784e(c2914f.m13486h(i12));
        }
        this.f10940a.mo13825Q0(iM13784e);
        while (i11 < c2914f.size()) {
            this.f10940a.m13835k0(c2914f.m13486h(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m13897R(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.mo13834j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13784e = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13784e += AbstractC2929k.m13784e(list.get(i12).booleanValue());
        }
        this.f10940a.mo13825Q0(iM13784e);
        while (i11 < list.size()) {
            this.f10940a.m13835k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: S */
    public final <K, V> void m13898S(int i10, C2933l0.a<K, V> aVar, Map<K, V> map) {
        int[] iArr = a.f10941a;
        throw null;
    }

    /* JADX INFO: renamed from: T */
    public final void m13899T(int i10, C2935m c2935m, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2935m.size()) {
                this.f10940a.m13837m0(i10, c2935m.m13967h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13792j = 0;
        for (int i12 = 0; i12 < c2935m.size(); i12++) {
            iM13792j += AbstractC2929k.m13792j(c2935m.m13967h(i12));
        }
        this.f10940a.mo13825Q0(iM13792j);
        while (i11 < c2935m.size()) {
            this.f10940a.m13838n0(c2935m.m13967h(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: U */
    public final void m13900U(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13837m0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13792j = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13792j += AbstractC2929k.m13792j(list.get(i12).doubleValue());
        }
        this.f10940a.mo13825Q0(iM13792j);
        while (i11 < list.size()) {
            this.f10940a.m13838n0(list.get(i11).doubleValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: V */
    public final void m13901V(int i10, C2969z c2969z, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2969z.size()) {
                this.f10940a.m13839o0(i10, c2969z.m14366h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13794l = 0;
        for (int i12 = 0; i12 < c2969z.size(); i12++) {
            iM13794l += AbstractC2929k.m13794l(c2969z.m14366h(i12));
        }
        this.f10940a.mo13825Q0(iM13794l);
        while (i11 < c2969z.size()) {
            this.f10940a.m13840p0(c2969z.m14366h(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m13902W(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13839o0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13794l = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13794l += AbstractC2929k.m13794l(list.get(i12).intValue());
        }
        this.f10940a.mo13825Q0(iM13794l);
        while (i11 < list.size()) {
            this.f10940a.m13840p0(list.get(i11).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m13903X(int i10, C2969z c2969z, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2969z.size()) {
                this.f10940a.mo13841q0(i10, c2969z.m14366h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13796n = 0;
        for (int i12 = 0; i12 < c2969z.size(); i12++) {
            iM13796n += AbstractC2929k.m13796n(c2969z.m14366h(i12));
        }
        this.f10940a.mo13825Q0(iM13796n);
        while (i11 < c2969z.size()) {
            this.f10940a.mo13842r0(c2969z.m14366h(i11));
            i11++;
        }
    }

    /* JADX INFO: renamed from: Y */
    public final void m13904Y(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.mo13841q0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13796n = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13796n += AbstractC2929k.m13796n(list.get(i12).intValue());
        }
        this.f10940a.mo13825Q0(iM13796n);
        while (i11 < list.size()) {
            this.f10940a.mo13842r0(list.get(i11).intValue());
            i11++;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final void m13905Z(int i10, C2927j0 c2927j0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2927j0.size()) {
                this.f10940a.mo13843s0(i10, c2927j0.m13723h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13798p = 0;
        for (int i12 = 0; i12 < c2927j0.size(); i12++) {
            iM13798p += AbstractC2929k.m13798p(c2927j0.m13723h(i12));
        }
        this.f10940a.mo13825Q0(iM13798p);
        while (i11 < c2927j0.size()) {
            this.f10940a.mo13844t0(c2927j0.m13723h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: a */
    public void mo13906a(int i10, List<Float> list, boolean z10) {
        if (list instanceof C2963w) {
            m13909b0(i10, (C2963w) list, z10);
        } else {
            m13911c0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m13907a0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.mo13843s0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13798p = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13798p += AbstractC2929k.m13798p(list.get(i12).longValue());
        }
        this.f10940a.mo13825Q0(iM13798p);
        while (i11 < list.size()) {
            this.f10940a.mo13844t0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: b */
    public final void mo13908b(int i10, Object obj) {
        if (obj instanceof AbstractC2920h) {
            this.f10940a.mo13813E0(i10, (AbstractC2920h) obj);
        } else {
            this.f10940a.mo13812D0(i10, (InterfaceC2954s0) obj);
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m13909b0(int i10, C2963w c2963w, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2963w.size()) {
                this.f10940a.m13845u0(i10, c2963w.m14295h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13800r = 0;
        for (int i12 = 0; i12 < c2963w.size(); i12++) {
            iM13800r += AbstractC2929k.m13800r(c2963w.m14295h(i12));
        }
        this.f10940a.mo13825Q0(iM13800r);
        while (i11 < c2963w.size()) {
            this.f10940a.m13846v0(c2963w.m14295h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: c */
    public void mo13910c(int i10, int i11) {
        this.f10940a.mo13841q0(i10, i11);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m13911c0(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13845u0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13800r = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13800r += AbstractC2929k.m13800r(list.get(i12).floatValue());
        }
        this.f10940a.mo13825Q0(iM13800r);
        while (i11 < list.size()) {
            this.f10940a.m13846v0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: d */
    public void mo13912d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof InterfaceC2915f0)) {
            while (i11 < list.size()) {
                this.f10940a.mo13822N0(i10, list.get(i11));
                i11++;
            }
        } else {
            InterfaceC2915f0 interfaceC2915f0 = (InterfaceC2915f0) list;
            while (i11 < list.size()) {
                m13921h0(i10, interfaceC2915f0.m13493q(i11));
                i11++;
            }
        }
    }

    /* JADX INFO: renamed from: d0 */
    public final void m13913d0(int i10, C2969z c2969z, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2969z.size()) {
                this.f10940a.mo13849y0(i10, c2969z.m14366h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13805w = 0;
        for (int i12 = 0; i12 < c2969z.size(); i12++) {
            iM13805w += AbstractC2929k.m13805w(c2969z.m14366h(i12));
        }
        this.f10940a.mo13825Q0(iM13805w);
        while (i11 < c2969z.size()) {
            this.f10940a.mo13850z0(c2969z.m14366h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: e */
    public void mo13914e(int i10, String str) {
        this.f10940a.mo13822N0(i10, str);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m13915e0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.mo13849y0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13805w = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13805w += AbstractC2929k.m13805w(list.get(i12).intValue());
        }
        this.f10940a.mo13825Q0(iM13805w);
        while (i11 < list.size()) {
            this.f10940a.mo13850z0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: f */
    public void mo13916f(int i10, long j10) {
        this.f10940a.mo13826R0(i10, j10);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m13917f0(int i10, C2927j0 c2927j0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2927j0.size()) {
                this.f10940a.m13809A0(i10, c2927j0.m13723h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13807y = 0;
        for (int i12 = 0; i12 < c2927j0.size(); i12++) {
            iM13807y += AbstractC2929k.m13807y(c2927j0.m13723h(i12));
        }
        this.f10940a.mo13825Q0(iM13807y);
        while (i11 < c2927j0.size()) {
            this.f10940a.m13810B0(c2927j0.m13723h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: g */
    public void mo13918g(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C2969z) {
            m13913d0(i10, (C2969z) list, z10);
        } else {
            m13915e0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m13919g0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13809A0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13807y = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13807y += AbstractC2929k.m13807y(list.get(i12).longValue());
        }
        this.f10940a.mo13825Q0(iM13807y);
        while (i11 < list.size()) {
            this.f10940a.m13810B0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: h */
    public void mo13920h(int i10, int i11) {
        this.f10940a.mo13849y0(i10, i11);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m13921h0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f10940a.mo13822N0(i10, (String) obj);
        } else {
            this.f10940a.mo13836l0(i10, (AbstractC2920h) obj);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: i */
    public void mo13922i(int i10, long j10) {
        this.f10940a.m13816H0(i10, j10);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m13923i0(int i10, C2969z c2969z, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2969z.size()) {
                this.f10940a.m13814F0(i10, c2969z.m14366h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13766L = 0;
        for (int i12 = 0; i12 < c2969z.size(); i12++) {
            iM13766L += AbstractC2929k.m13766L(c2969z.m14366h(i12));
        }
        this.f10940a.mo13825Q0(iM13766L);
        while (i11 < c2969z.size()) {
            this.f10940a.m13815G0(c2969z.m14366h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: j */
    public void mo13924j(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C2969z) {
            m13903X(i10, (C2969z) list, z10);
        } else {
            m13904Y(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m13925j0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13814F0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13766L = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13766L += AbstractC2929k.m13766L(list.get(i12).intValue());
        }
        this.f10940a.mo13825Q0(iM13766L);
        while (i11 < list.size()) {
            this.f10940a.m13815G0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: k */
    public void mo13926k(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C2969z) {
            m13939q0(i10, (C2969z) list, z10);
        } else {
            m13941r0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: k0 */
    public final void m13927k0(int i10, C2927j0 c2927j0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2927j0.size()) {
                this.f10940a.m13816H0(i10, c2927j0.m13723h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13768N = 0;
        for (int i12 = 0; i12 < c2927j0.size(); i12++) {
            iM13768N += AbstractC2929k.m13768N(c2927j0.m13723h(i12));
        }
        this.f10940a.mo13825Q0(iM13768N);
        while (i11 < c2927j0.size()) {
            this.f10940a.m13817I0(c2927j0.m13723h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: l */
    public void mo13928l(int i10, List<Long> list, boolean z10) {
        if (list instanceof C2927j0) {
            m13935o0(i10, (C2927j0) list, z10);
        } else {
            m13937p0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m13929l0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13816H0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13768N = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13768N += AbstractC2929k.m13768N(list.get(i12).longValue());
        }
        this.f10940a.mo13825Q0(iM13768N);
        while (i11 < list.size()) {
            this.f10940a.m13817I0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: m */
    public void mo13930m(int i10, long j10) {
        this.f10940a.m13820L0(i10, j10);
    }

    /* JADX INFO: renamed from: m0 */
    public final void m13931m0(int i10, C2969z c2969z, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2969z.size()) {
                this.f10940a.m13818J0(i10, c2969z.m14366h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13770P = 0;
        for (int i12 = 0; i12 < c2969z.size(); i12++) {
            iM13770P += AbstractC2929k.m13770P(c2969z.m14366h(i12));
        }
        this.f10940a.mo13825Q0(iM13770P);
        while (i11 < c2969z.size()) {
            this.f10940a.m13819K0(c2969z.m14366h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: n */
    public void mo13932n(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C2969z) {
            m13901V(i10, (C2969z) list, z10);
        } else {
            m13902W(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m13933n0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13818J0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13770P = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13770P += AbstractC2929k.m13770P(list.get(i12).intValue());
        }
        this.f10940a.mo13825Q0(iM13770P);
        while (i11 < list.size()) {
            this.f10940a.m13819K0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: o */
    public void mo13934o(int i10, int i11) {
        this.f10940a.mo13824P0(i10, i11);
    }

    /* JADX INFO: renamed from: o0 */
    public final void m13935o0(int i10, C2927j0 c2927j0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2927j0.size()) {
                this.f10940a.m13820L0(i10, c2927j0.m13723h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13772R = 0;
        for (int i12 = 0; i12 < c2927j0.size(); i12++) {
            iM13772R += AbstractC2929k.m13772R(c2927j0.m13723h(i12));
        }
        this.f10940a.mo13825Q0(iM13772R);
        while (i11 < c2927j0.size()) {
            this.f10940a.m13821M0(c2927j0.m13723h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: p */
    public void mo13936p(int i10, double d10) {
        this.f10940a.m13837m0(i10, d10);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m13937p0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.m13820L0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13772R = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13772R += AbstractC2929k.m13772R(list.get(i12).longValue());
        }
        this.f10940a.mo13825Q0(iM13772R);
        while (i11 < list.size()) {
            this.f10940a.m13821M0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: q */
    public void mo13938q(int i10, List<Long> list, boolean z10) {
        if (list instanceof C2927j0) {
            m13927k0(i10, (C2927j0) list, z10);
        } else {
            m13929l0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m13939q0(int i10, C2969z c2969z, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2969z.size()) {
                this.f10940a.mo13824P0(i10, c2969z.m14366h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13777W = 0;
        for (int i12 = 0; i12 < c2969z.size(); i12++) {
            iM13777W += AbstractC2929k.m13777W(c2969z.m14366h(i12));
        }
        this.f10940a.mo13825Q0(iM13777W);
        while (i11 < c2969z.size()) {
            this.f10940a.mo13825Q0(c2969z.m14366h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: r */
    public void mo13940r(int i10, List<Long> list, boolean z10) {
        if (list instanceof C2927j0) {
            m13943s0(i10, (C2927j0) list, z10);
        } else {
            m13945t0(i10, list, z10);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m13941r0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.mo13824P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13777W = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13777W += AbstractC2929k.m13777W(list.get(i12).intValue());
        }
        this.f10940a.mo13825Q0(iM13777W);
        while (i11 < list.size()) {
            this.f10940a.mo13825Q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: s */
    public void mo13942s(int i10, long j10) {
        this.f10940a.mo13843s0(i10, j10);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m13943s0(int i10, C2927j0 c2927j0, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < c2927j0.size()) {
                this.f10940a.mo13826R0(i10, c2927j0.m13723h(i11));
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13779Y = 0;
        for (int i12 = 0; i12 < c2927j0.size(); i12++) {
            iM13779Y += AbstractC2929k.m13779Y(c2927j0.m13723h(i12));
        }
        this.f10940a.mo13825Q0(iM13779Y);
        while (i11 < c2927j0.size()) {
            this.f10940a.mo13827S0(c2927j0.m13723h(i11));
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: t */
    public InterfaceC2958t1.a mo13944t() {
        return InterfaceC2958t1.a.ASCENDING;
    }

    /* JADX INFO: renamed from: t0 */
    public final void m13945t0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f10940a.mo13826R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f10940a.mo13823O0(i10, 2);
        int iM13779Y = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iM13779Y += AbstractC2929k.m13779Y(list.get(i12).longValue());
        }
        this.f10940a.mo13825Q0(iM13779Y);
        while (i11 < list.size()) {
            this.f10940a.mo13827S0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: u */
    public void mo13946u(int i10, long j10) {
        this.f10940a.m13809A0(i10, j10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: v */
    public void mo13947v(int i10, boolean z10) {
        this.f10940a.mo13834j0(i10, z10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: w */
    public void mo13948w(int i10, int i11) {
        this.f10940a.m13814F0(i10, i11);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    @Deprecated
    /* JADX INFO: renamed from: x */
    public void mo13949x(int i10) {
        this.f10940a.mo13823O0(i10, 3);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: y */
    public void mo13950y(int i10, List<Long> list, boolean z10) {
        if (list instanceof C2927j0) {
            m13905Z(i10, (C2927j0) list, z10);
        } else {
            m13907a0(i10, list, z10);
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.InterfaceC2958t1
    /* JADX INFO: renamed from: z */
    public void mo13951z(int i10, List<Integer> list, boolean z10) {
        if (list instanceof C2969z) {
            m13923i0(i10, (C2969z) list, z10);
        } else {
            m13925j0(i10, list, z10);
        }
    }
}
