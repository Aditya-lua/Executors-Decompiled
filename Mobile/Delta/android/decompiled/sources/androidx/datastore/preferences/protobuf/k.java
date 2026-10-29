package androidx.datastore.preferences.protobuf;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k implements t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f2232a;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2233a;

        static {
            int[] iArr = new int[s1.b.values().length];
            f2233a = iArr;
            try {
                iArr[s1.b.f2293j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2233a[s1.b.f2292i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2233a[s1.b.f2290g.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2233a[s1.b.f2300q.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2233a[s1.b.f2302s.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2233a[s1.b.f2298o.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2233a[s1.b.f2291h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2233a[s1.b.f2288e.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f2233a[s1.b.f2301r.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f2233a[s1.b.f2303t.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f2233a[s1.b.f2289f.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f2233a[s1.b.f2294k.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public k(j jVar) {
        j jVar2 = (j) z.b(jVar, "output");
        this.f2232a = jVar2;
        jVar2.f2206a = this;
    }

    public static k P(j jVar) {
        k kVar = jVar.f2206a;
        return kVar != null ? kVar : new k(jVar);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void A(int i10, List<Boolean> list, boolean z10) {
        if (list instanceof e) {
            Q(i10, (e) list, z10);
        } else {
            R(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void B(int i10, float f10) {
        this.f2232a.x0(i10, f10);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    @Deprecated
    public void C(int i10) {
        this.f2232a.V0(i10, 4);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void D(int i10, List<Integer> list, boolean z10) {
        if (list instanceof y) {
            q0(i10, (y) list, z10);
        } else {
            r0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void E(int i10, int i11) {
        this.f2232a.r0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void F(int i10, List<Long> list, boolean z10) {
        if (list instanceof i0) {
            j0(i10, (i0) list, z10);
        } else {
            k0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void G(int i10, List<Double> list, boolean z10) {
        if (list instanceof l) {
            X(i10, (l) list, z10);
        } else {
            Y(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void H(int i10, int i11) {
        this.f2232a.P0(i10, i11);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void I(int i10, List<g> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            this.f2232a.n0(i10, list.get(i11));
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void J(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            N(i10, list.get(i11), g1Var);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void K(int i10, g gVar) {
        this.f2232a.n0(i10, gVar);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void L(int i10, Object obj, g1 g1Var) {
        this.f2232a.H0(i10, (r0) obj, g1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public <K, V> void M(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        if (this.f2232a.d0()) {
            V(i10, aVar, map);
            return;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.f2232a.V0(i10, 2);
            this.f2232a.X0(k0.b(aVar, entry.getKey(), entry.getValue()));
            k0.e(this.f2232a, aVar, entry.getKey(), entry.getValue());
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void N(int i10, Object obj, g1 g1Var) {
        this.f2232a.A0(i10, (r0) obj, g1Var);
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void O(int i10, List<?> list, g1 g1Var) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            L(i10, list.get(i11), g1Var);
        }
    }

    public final void Q(int i10, e eVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < eVar.size()) {
                this.f2232a.j0(i10, eVar.c(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < eVar.size(); i12++) {
            iE += j.e(eVar.c(i12));
        }
        this.f2232a.X0(iE);
        while (i11 < eVar.size()) {
            this.f2232a.k0(eVar.c(i11));
            i11++;
        }
    }

    public final void R(int i10, List<Boolean> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.j0(i10, list.get(i11).booleanValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iE = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iE += j.e(list.get(i12).booleanValue());
        }
        this.f2232a.X0(iE);
        while (i11 < list.size()) {
            this.f2232a.k0(list.get(i11).booleanValue());
            i11++;
        }
    }

    public final <V> void S(int i10, boolean z10, V v5, k0.a<Boolean, V> aVar) {
        this.f2232a.V0(i10, 2);
        this.f2232a.X0(k0.b(aVar, Boolean.valueOf(z10), v5));
        k0.e(this.f2232a, aVar, Boolean.valueOf(z10), v5);
    }

    public final <V> void T(int i10, k0.a<Integer, V> aVar, Map<Integer, V> map) {
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
            this.f2232a.V0(i10, 2);
            this.f2232a.X0(k0.b(aVar, Integer.valueOf(i13), v5));
            k0.e(this.f2232a, aVar, Integer.valueOf(i13), v5);
        }
    }

    public final <V> void U(int i10, k0.a<Long, V> aVar, Map<Long, V> map) {
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
            this.f2232a.V0(i10, 2);
            this.f2232a.X0(k0.b(aVar, Long.valueOf(j10), v5));
            k0.e(this.f2232a, aVar, Long.valueOf(j10), v5);
        }
    }

    public final <K, V> void V(int i10, k0.a<K, V> aVar, Map<K, V> map) {
        switch (a.f2233a[aVar.f2236a.ordinal()]) {
            case 1:
                V v5 = map.get(Boolean.FALSE);
                if (v5 != null) {
                    S(i10, false, v5, aVar);
                }
                V v10 = map.get(Boolean.TRUE);
                if (v10 != null) {
                    S(i10, true, v10, aVar);
                    return;
                }
                return;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                T(i10, aVar, map);
                return;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                U(i10, aVar, map);
                return;
            case 12:
                W(i10, aVar, map);
                return;
            default:
                throw new IllegalArgumentException("does not support key type: " + aVar.f2236a);
        }
    }

    public final <V> void W(int i10, k0.a<String, V> aVar, Map<String, V> map) {
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
            this.f2232a.V0(i10, 2);
            this.f2232a.X0(k0.b(aVar, str, v5));
            k0.e(this.f2232a, aVar, str, v5);
        }
    }

    public final void X(int i10, l lVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < lVar.size()) {
                this.f2232a.p0(i10, lVar.c(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < lVar.size(); i12++) {
            iJ += j.j(lVar.c(i12));
        }
        this.f2232a.X0(iJ);
        while (i11 < lVar.size()) {
            this.f2232a.q0(lVar.c(i11));
            i11++;
        }
    }

    public final void Y(int i10, List<Double> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.p0(i10, list.get(i11).doubleValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iJ = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iJ += j.j(list.get(i12).doubleValue());
        }
        this.f2232a.X0(iJ);
        while (i11 < list.size()) {
            this.f2232a.q0(list.get(i11).doubleValue());
            i11++;
        }
    }

    public final void Z(int i10, y yVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < yVar.size()) {
                this.f2232a.r0(i10, yVar.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < yVar.size(); i12++) {
            iL += j.l(yVar.h(i12));
        }
        this.f2232a.X0(iL);
        while (i11 < yVar.size()) {
            this.f2232a.s0(yVar.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void a(int i10, List<Float> list, boolean z10) {
        if (list instanceof v) {
            f0(i10, (v) list, z10);
        } else {
            g0(i10, list, z10);
        }
    }

    public final void a0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.r0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += j.l(list.get(i12).intValue());
        }
        this.f2232a.X0(iL);
        while (i11 < list.size()) {
            this.f2232a.s0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public final void b(int i10, Object obj) {
        if (obj instanceof g) {
            this.f2232a.K0(i10, (g) obj);
        } else {
            this.f2232a.J0(i10, (r0) obj);
        }
    }

    public final void b0(int i10, y yVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < yVar.size()) {
                this.f2232a.t0(i10, yVar.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < yVar.size(); i12++) {
            iN += j.n(yVar.h(i12));
        }
        this.f2232a.X0(iN);
        while (i11 < yVar.size()) {
            this.f2232a.u0(yVar.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void c(int i10, int i11) {
        this.f2232a.t0(i10, i11);
    }

    public final void c0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.t0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += j.n(list.get(i12).intValue());
        }
        this.f2232a.X0(iN);
        while (i11 < list.size()) {
            this.f2232a.u0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void d(int i10, List<String> list) {
        int i11 = 0;
        if (!(list instanceof e0)) {
            while (i11 < list.size()) {
                this.f2232a.T0(i10, list.get(i11));
                i11++;
            }
        } else {
            e0 e0Var = (e0) list;
            while (i11 < list.size()) {
                l0(i10, e0Var.q(i11));
                i11++;
            }
        }
    }

    public final void d0(int i10, i0 i0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < i0Var.size()) {
                this.f2232a.v0(i10, i0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            iP += j.p(i0Var.h(i12));
        }
        this.f2232a.X0(iP);
        while (i11 < i0Var.size()) {
            this.f2232a.w0(i0Var.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void e(int i10, String str) {
        this.f2232a.T0(i10, str);
    }

    public final void e0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.v0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += j.p(list.get(i12).longValue());
        }
        this.f2232a.X0(iP);
        while (i11 < list.size()) {
            this.f2232a.w0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void f(int i10, long j10) {
        this.f2232a.Y0(i10, j10);
    }

    public final void f0(int i10, v vVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < vVar.size()) {
                this.f2232a.x0(i10, vVar.c(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < vVar.size(); i12++) {
            iR += j.r(vVar.c(i12));
        }
        this.f2232a.X0(iR);
        while (i11 < vVar.size()) {
            this.f2232a.y0(vVar.c(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void g(int i10, List<Integer> list, boolean z10) {
        if (list instanceof y) {
            h0(i10, (y) list, z10);
        } else {
            i0(i10, list, z10);
        }
    }

    public final void g0(int i10, List<Float> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.x0(i10, list.get(i11).floatValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += j.r(list.get(i12).floatValue());
        }
        this.f2232a.X0(iR);
        while (i11 < list.size()) {
            this.f2232a.y0(list.get(i11).floatValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void h(int i10, int i11) {
        this.f2232a.D0(i10, i11);
    }

    public final void h0(int i10, y yVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < yVar.size()) {
                this.f2232a.D0(i10, yVar.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < yVar.size(); i12++) {
            iW += j.w(yVar.h(i12));
        }
        this.f2232a.X0(iW);
        while (i11 < yVar.size()) {
            this.f2232a.E0(yVar.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void i(int i10, long j10) {
        this.f2232a.N0(i10, j10);
    }

    public final void i0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.D0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += j.w(list.get(i12).intValue());
        }
        this.f2232a.X0(iW);
        while (i11 < list.size()) {
            this.f2232a.E0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void j(int i10, List<Integer> list, boolean z10) {
        if (list instanceof y) {
            b0(i10, (y) list, z10);
        } else {
            c0(i10, list, z10);
        }
    }

    public final void j0(int i10, i0 i0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < i0Var.size()) {
                this.f2232a.F0(i10, i0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            iY += j.y(i0Var.h(i12));
        }
        this.f2232a.X0(iY);
        while (i11 < i0Var.size()) {
            this.f2232a.G0(i0Var.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void k(int i10, List<Integer> list, boolean z10) {
        if (list instanceof y) {
            u0(i10, (y) list, z10);
        } else {
            v0(i10, list, z10);
        }
    }

    public final void k0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.F0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += j.y(list.get(i12).longValue());
        }
        this.f2232a.X0(iY);
        while (i11 < list.size()) {
            this.f2232a.G0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void l(int i10, List<Long> list, boolean z10) {
        if (list instanceof i0) {
            s0(i10, (i0) list, z10);
        } else {
            t0(i10, list, z10);
        }
    }

    public final void l0(int i10, Object obj) {
        if (obj instanceof String) {
            this.f2232a.T0(i10, (String) obj);
        } else {
            this.f2232a.n0(i10, (g) obj);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void m(int i10, long j10) {
        this.f2232a.R0(i10, j10);
    }

    public final void m0(int i10, y yVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < yVar.size()) {
                this.f2232a.L0(i10, yVar.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < yVar.size(); i12++) {
            iL += j.L(yVar.h(i12));
        }
        this.f2232a.X0(iL);
        while (i11 < yVar.size()) {
            this.f2232a.M0(yVar.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void n(int i10, List<Integer> list, boolean z10) {
        if (list instanceof y) {
            Z(i10, (y) list, z10);
        } else {
            a0(i10, list, z10);
        }
    }

    public final void n0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.L0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iL = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iL += j.L(list.get(i12).intValue());
        }
        this.f2232a.X0(iL);
        while (i11 < list.size()) {
            this.f2232a.M0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void o(int i10, int i11) {
        this.f2232a.W0(i10, i11);
    }

    public final void o0(int i10, i0 i0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < i0Var.size()) {
                this.f2232a.N0(i10, i0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            iN += j.N(i0Var.h(i12));
        }
        this.f2232a.X0(iN);
        while (i11 < i0Var.size()) {
            this.f2232a.O0(i0Var.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void p(int i10, double d10) {
        this.f2232a.p0(i10, d10);
    }

    public final void p0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.N0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iN = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iN += j.N(list.get(i12).longValue());
        }
        this.f2232a.X0(iN);
        while (i11 < list.size()) {
            this.f2232a.O0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void q(int i10, List<Long> list, boolean z10) {
        if (list instanceof i0) {
            o0(i10, (i0) list, z10);
        } else {
            p0(i10, list, z10);
        }
    }

    public final void q0(int i10, y yVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < yVar.size()) {
                this.f2232a.P0(i10, yVar.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < yVar.size(); i12++) {
            iP += j.P(yVar.h(i12));
        }
        this.f2232a.X0(iP);
        while (i11 < yVar.size()) {
            this.f2232a.Q0(yVar.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void r(int i10, List<Long> list, boolean z10) {
        if (list instanceof i0) {
            w0(i10, (i0) list, z10);
        } else {
            x0(i10, list, z10);
        }
    }

    public void r0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.P0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iP = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iP += j.P(list.get(i12).intValue());
        }
        this.f2232a.X0(iP);
        while (i11 < list.size()) {
            this.f2232a.Q0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void s(int i10, long j10) {
        this.f2232a.v0(i10, j10);
    }

    public final void s0(int i10, i0 i0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < i0Var.size()) {
                this.f2232a.R0(i10, i0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            iR += j.R(i0Var.h(i12));
        }
        this.f2232a.X0(iR);
        while (i11 < i0Var.size()) {
            this.f2232a.S0(i0Var.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public t1.a t() {
        return t1.a.ASCENDING;
    }

    public final void t0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.R0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iR = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iR += j.R(list.get(i12).longValue());
        }
        this.f2232a.X0(iR);
        while (i11 < list.size()) {
            this.f2232a.S0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void u(int i10, long j10) {
        this.f2232a.F0(i10, j10);
    }

    public final void u0(int i10, y yVar, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < yVar.size()) {
                this.f2232a.W0(i10, yVar.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < yVar.size(); i12++) {
            iW += j.W(yVar.h(i12));
        }
        this.f2232a.X0(iW);
        while (i11 < yVar.size()) {
            this.f2232a.X0(yVar.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void v(int i10, boolean z10) {
        this.f2232a.j0(i10, z10);
    }

    public void v0(int i10, List<Integer> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.W0(i10, list.get(i11).intValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iW = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iW += j.W(list.get(i12).intValue());
        }
        this.f2232a.X0(iW);
        while (i11 < list.size()) {
            this.f2232a.X0(list.get(i11).intValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void w(int i10, int i11) {
        this.f2232a.L0(i10, i11);
    }

    public final void w0(int i10, i0 i0Var, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < i0Var.size()) {
                this.f2232a.Y0(i10, i0Var.h(i11));
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < i0Var.size(); i12++) {
            iY += j.Y(i0Var.h(i12));
        }
        this.f2232a.X0(iY);
        while (i11 < i0Var.size()) {
            this.f2232a.Z0(i0Var.h(i11));
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    @Deprecated
    public void x(int i10) {
        this.f2232a.V0(i10, 3);
    }

    public final void x0(int i10, List<Long> list, boolean z10) {
        int i11 = 0;
        if (!z10) {
            while (i11 < list.size()) {
                this.f2232a.Y0(i10, list.get(i11).longValue());
                i11++;
            }
            return;
        }
        this.f2232a.V0(i10, 2);
        int iY = 0;
        for (int i12 = 0; i12 < list.size(); i12++) {
            iY += j.Y(list.get(i12).longValue());
        }
        this.f2232a.X0(iY);
        while (i11 < list.size()) {
            this.f2232a.Z0(list.get(i11).longValue());
            i11++;
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void y(int i10, List<Long> list, boolean z10) {
        if (list instanceof i0) {
            d0(i10, (i0) list, z10);
        } else {
            e0(i10, list, z10);
        }
    }

    @Override // androidx.datastore.preferences.protobuf.t1
    public void z(int i10, List<Integer> list, boolean z10) {
        if (list instanceof y) {
            m0(i10, (y) list, z10);
        } else {
            n0(i10, list, z10);
        }
    }
}
