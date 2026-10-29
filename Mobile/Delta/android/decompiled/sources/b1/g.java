package b1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import g0.i0;
import g0.k0;
import g0.r1;
import g0.w2;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import me.x;
import n0.c3;
import n0.h2;
import n0.i2;
import n0.i4;
import n0.j4;
import n0.n1;
import n0.o0;
import n0.o3;
import n0.p0;
import n0.t3;
import n0.u3;
import n0.x2;
import p0.a0;
import p0.z;
import x0.n0;
import x0.t;
import x0.v0;
import y0.r;

/* JADX INFO: loaded from: classes.dex */
public class g extends w2 {
    public n0 A;
    public n0 B;
    public n0 C;
    public n0 D;
    public n0 E;
    public n0 F;
    public o3.b G;
    public o3.b H;
    public o3.c I;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f3794s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k f3795t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final i0 f3796u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final i0 f3797v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public v0 f3798w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v0 f3799x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public r f3800y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public v0 f3801z;

    public interface a {
        x<Void> a(int i10, int i11);
    }

    public g(p0 p0Var, p0 p0Var2, i0 i0Var, i0 i0Var2, Set<w2> set, j4 j4Var) {
        super(v0(set));
        this.f3794s = v0(set);
        this.f3796u = i0Var;
        this.f3797v = i0Var2;
        this.f3795t = new k(p0Var, p0Var2, set, j4Var, new a() { // from class: b1.f
            @Override // b1.g.a
            public final x a(int i10, int i11) {
                return g.h0(this.f3793a, i10, i11);
            }
        });
        F0(set);
    }

    public static boolean A0(w2 w2Var) {
        return w2Var instanceof g;
    }

    public static /* synthetic */ void g0(g gVar, String str, String str2, i4 i4Var, t3 t3Var, t3 t3Var2, o3 o3Var, o3.g gVar2) {
        if (gVar.i() == null) {
            return;
        }
        gVar.j0();
        gVar.d0(gVar.m0(str, str2, i4Var, t3Var, t3Var2));
        gVar.L();
        gVar.f3795t.Q();
    }

    public static /* synthetic */ x h0(g gVar, int i10, int i11) {
        v0 v0Var = gVar.f3799x;
        return v0Var != null ? v0Var.e().c(i10, i11) : r0.n.n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    private void j0() {
        o3.c cVar = this.I;
        if (cVar != null) {
            cVar.b();
            this.I = null;
        }
        n0 n0Var = this.A;
        if (n0Var != null) {
            n0Var.i();
            this.A = null;
        }
        n0 n0Var2 = this.B;
        if (n0Var2 != null) {
            n0Var2.i();
            this.B = null;
        }
        n0 n0Var3 = this.C;
        if (n0Var3 != null) {
            n0Var3.i();
            this.C = null;
        }
        n0 n0Var4 = this.D;
        if (n0Var4 != null) {
            n0Var4.i();
            this.D = null;
        }
        n0 n0Var5 = this.E;
        if (n0Var5 != null) {
            n0Var5.i();
            this.E = null;
        }
        n0 n0Var6 = this.F;
        if (n0Var6 != null) {
            n0Var6.i();
            this.F = null;
        }
        v0 v0Var = this.f3799x;
        if (v0Var != null) {
            v0Var.f();
            this.f3799x = null;
        }
        r rVar = this.f3800y;
        if (rVar != null) {
            rVar.d();
            this.f3800y = null;
        }
        v0 v0Var2 = this.f3798w;
        if (v0Var2 != null) {
            v0Var2.f();
            this.f3798w = null;
        }
        v0 v0Var3 = this.f3801z;
        if (v0Var3 != null) {
            v0Var3.f();
            this.f3801z = null;
        }
    }

    public static List<j4.b> q0(w2 w2Var) {
        ArrayList arrayList = new ArrayList();
        if (!A0(w2Var)) {
            arrayList.add(w2Var.l().X());
            return arrayList;
        }
        Iterator<w2> it = ((g) w2Var).s0().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().l().X());
        }
        return arrayList;
    }

    public static int r0(w2 w2Var) {
        return w2Var.l().S().q();
    }

    private Rect t0(Size size) {
        return E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    public static i v0(Set<w2> set) {
        n0.w2 w2VarA = new h().a();
        w2VarA.G(h2.f24670j, 34);
        ArrayList arrayList = new ArrayList();
        for (w2 w2Var : set) {
            if (w2Var.l().a(i4.G)) {
                arrayList.add(w2Var.l().X());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        w2VarA.G(i.Q, arrayList);
        w2VarA.G(i2.f24687p, 2);
        w2VarA.G(i4.K, u3.PREVIEW_VIDEO_STILL);
        return new i(c3.j0(w2VarA));
    }

    @Override // g0.w2
    public Set<k0> A(o0 o0Var) {
        Set<w2> setS0 = s0();
        HashSet hashSet = null;
        if (setS0.isEmpty()) {
            return null;
        }
        Iterator<w2> it = setS0.iterator();
        while (it.hasNext()) {
            Set<k0> setA = it.next().A(o0Var);
            if (setA != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setA);
                } else {
                    hashSet.retainAll(setA);
                }
            }
        }
        return hashSet;
    }

    @Override // g0.w2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    public final void B0(Size size, o3.b bVar) {
        Iterator<w2> it = s0().iterator();
        while (it.hasNext()) {
            o3 o3VarP = o3.b.r(it.next().l(), size).p();
            bVar.c(o3VarP.k());
            bVar.a(o3VarP.o());
            bVar.d(o3VarP.m());
            bVar.b(o3VarP.c());
            bVar.g(o3VarP.g());
        }
    }

    public final void C0(o3.b bVar) {
        Iterator<w2> it = s0().iterator();
        int iF = -1;
        while (it.hasNext()) {
            iF = o3.f(iF, r0(it.next()));
        }
        if (iF != -1) {
            bVar.B(iF);
        }
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n1 n1Var) {
        return new h(x2.l0(n1Var));
    }

    public final void D0(n0 n0Var, v0 v0Var, boolean z10) {
        boolean z11 = E() != null;
        Map<w2, z0.f> mapE = this.f3795t.E(n0Var, C(), z11, z10);
        v0.c cVarJ = v0Var.j(v0.b.c(n0Var, new ArrayList(mapE.values())));
        HashMap map = new HashMap();
        for (Map.Entry<w2, z0.f> entry : mapE.entrySet()) {
            map.put(entry.getKey(), cVarJ.get(entry.getValue()));
        }
        this.f3795t.T(map, this.f3795t.J(n0Var, z11));
    }

    public final void E0(n0 n0Var, n0 n0Var2, r rVar, t3 t3Var) {
        if (n() == null) {
            boolean z10 = E() != null;
            Map<w2, y0.d> mapF = this.f3795t.F(n0Var, n0Var2, C(), z10);
            r.c cVarG = this.f3800y.g(r.b.d(n0Var, n0Var2, new ArrayList(mapF.values())));
            HashMap map = new HashMap();
            for (Map.Entry<w2, y0.d> entry : mapF.entrySet()) {
                map.put(entry.getKey(), cVarG.get(entry.getValue()));
            }
            this.f3795t.T(map, this.f3795t.J(n0Var, z10));
            return;
        }
        this.E = rVar.g(r.b.d(n0Var, n0Var2, Arrays.asList(this.f3795t.y(n0Var, n0Var2, C(), E() != null)))).values().iterator().next();
        if (n().e() == 1) {
            this.F = this.E;
        } else {
            n0 n0Var3 = this.E;
            Objects.requireNonNull(n0Var3);
            p0 p0VarI = i();
            Objects.requireNonNull(p0VarI);
            this.F = w0(n0Var3, p0VarI);
        }
        p0 p0VarI2 = i();
        Objects.requireNonNull(p0VarI2);
        v0 v0VarL0 = l0(p0VarI2, t3Var);
        this.f3801z = v0VarL0;
        D0(this.F, v0VarL0, true);
    }

    public void F0(Set<w2> set) {
        Y(set.iterator().next().o());
    }

    @Override // g0.w2
    public void O() {
        super.O();
        this.f3795t.t();
    }

    @Override // g0.w2
    public void P() {
        super.P();
        this.f3795t.N();
    }

    @Override // g0.w2
    public i4<?> Q(o0 o0Var, i4.b<?, ?, ?> bVar) {
        this.f3795t.M(bVar.a());
        return bVar.e();
    }

    @Override // g0.w2
    public void R() {
        super.R();
        this.f3795t.O();
    }

    @Override // g0.w2
    public void S() {
        super.S();
        this.f3795t.P();
    }

    @Override // g0.w2
    public t3 T(n1 n1Var) {
        this.G.g(n1Var);
        d0(g0.o0.a(new Object[]{this.G.p()}));
        return g().i().d(n1Var).a();
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        r1.a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        d0(m0(k(), w(), l(), t3Var, t3Var2));
        J();
        return t3Var;
    }

    @Override // g0.w2
    public void V() {
        super.V();
        j0();
        this.f3795t.V();
    }

    public final void i0(o3.b bVar, final String str, final String str2, final i4<?> i4Var, final t3 t3Var, final t3 t3Var2) {
        o3.c cVar = this.I;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: b1.e
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                g.g0(this.f3788a, str, str2, i4Var, t3Var, t3Var2, o3Var, gVar);
            }
        });
        this.I = cVar2;
        bVar.u(cVar2);
    }

    public final r k0(p0 p0Var, p0 p0Var2, t3 t3Var, i0 i0Var, i0 i0Var2) {
        return new r(p0Var, p0Var2, y0.o.a.a(t3Var.b(), i0Var, i0Var2));
    }

    public final v0 l0(p0 p0Var, t3 t3Var) {
        if (n() == null || n().e() != 1) {
            return new v0(p0Var, t.a.a(t3Var.b()));
        }
        v0 v0Var = new v0(p0Var, n().a());
        this.f3798w = v0Var;
        return v0Var;
    }

    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        n1 n1VarA = j4Var.a(this.f3794s.X(), 1);
        if (z10) {
            n1VarA = n1.L(n1VarA, this.f3794s.n());
        }
        if (n1VarA == null) {
            return null;
        }
        return D(n1VarA).e();
    }

    public final List<o3> m0(String str, String str2, i4<?> i4Var, t3 t3Var, t3 t3Var2) {
        z.b();
        if (t3Var2 != null) {
            n0 n0VarN0 = n0(str, str2, i4Var, t3Var, t3Var2);
            n0 n0VarO0 = o0(str, str2, i4Var, t3Var, t3Var2);
            r rVarK0 = k0(i(), v(), t3Var, this.f3796u, this.f3797v);
            this.f3800y = rVarK0;
            E0(n0VarN0, n0VarO0, rVarK0, t3Var);
            return g0.o0.a(new Object[]{this.G.p(), this.H.p()});
        }
        n0 n0VarN1 = n0(str, str2, i4Var, t3Var, null);
        p0 p0VarI = i();
        Objects.requireNonNull(p0VarI);
        v0 v0VarL0 = l0(p0VarI, t3Var);
        this.f3799x = v0VarL0;
        D0(n0VarN1, v0VarL0, false);
        return g0.o0.a(new Object[]{this.G.p()});
    }

    public final n0 n0(String str, String str2, i4<?> i4Var, t3 t3Var, t3 t3Var2) {
        Matrix matrixY = y();
        p0 p0VarI = i();
        Objects.requireNonNull(p0VarI);
        boolean zQ = p0VarI.q();
        Rect rectT0 = t0(t3Var.f());
        Objects.requireNonNull(rectT0);
        p0 p0VarI2 = i();
        Objects.requireNonNull(p0VarI2);
        int iT = t(p0VarI2);
        p0 p0VarI3 = i();
        Objects.requireNonNull(p0VarI3);
        n0 n0Var = new n0(3, 34, t3Var, matrixY, zQ, rectT0, iT, -1, H(p0VarI3));
        this.A = n0Var;
        boolean z10 = str2 != null;
        p0 p0VarI4 = i();
        Objects.requireNonNull(p0VarI4);
        this.C = z0(n0Var, p0VarI4, z10);
        o3.b bVarP0 = p0(this.A, i4Var, t3Var);
        this.G = bVarP0;
        i0(bVarP0, str, str2, i4Var, t3Var, t3Var2);
        return this.C;
    }

    public final n0 o0(String str, String str2, i4<?> i4Var, t3 t3Var, t3 t3Var2) {
        Matrix matrixY = y();
        p0 p0VarV = v();
        Objects.requireNonNull(p0VarV);
        boolean zQ = p0VarV.q();
        Rect rectT0 = t0(t3Var2.f());
        Objects.requireNonNull(rectT0);
        p0 p0VarV2 = v();
        Objects.requireNonNull(p0VarV2);
        int iT = t(p0VarV2);
        p0 p0VarV3 = v();
        Objects.requireNonNull(p0VarV3);
        n0 n0Var = new n0(3, 34, t3Var2, matrixY, zQ, rectT0, iT, -1, H(p0VarV3));
        this.B = n0Var;
        p0 p0VarV4 = v();
        Objects.requireNonNull(p0VarV4);
        this.D = z0(n0Var, p0VarV4, true);
        o3.b bVarP0 = p0(this.B, i4Var, t3Var2);
        this.H = bVarP0;
        i0(bVarP0, str, str2, i4Var, t3Var, t3Var2);
        return this.D;
    }

    public final o3.b p0(n0 n0Var, i4<?> i4Var, t3 t3Var) {
        o3.b bVarR = o3.b.r(i4Var, t3Var.f());
        C0(bVarR);
        B0(t3Var.f(), bVarR);
        bVarR.n(n0Var.o(), t3Var.b(), null, -1);
        bVarR.j(this.f3795t.H());
        if (t3Var.d() != null) {
            bVarR.g(t3Var.d());
        }
        bVarR.A(t3Var.g());
        b(bVarR, t3Var);
        return bVarR;
    }

    public Set<w2> s0() {
        return this.f3795t.D();
    }

    public final Rect u0(n0 n0Var) {
        return ((g0.n) x2.g.g(n())).h() == 1 ? a0.r(n0Var.s().f()) : n0Var.n();
    }

    public final n0 w0(n0 n0Var, p0 p0Var) {
        this.f3798w = new v0(p0Var, n().a());
        int iY0 = y0();
        Rect rectU0 = u0(n0Var);
        z0.f fVarI = z0.f.i(n0Var.t(), n0Var.p(), rectU0, a0.f(rectU0, iY0), iY0, x0(), true);
        n0 n0Var2 = this.f3798w.j(v0.b.c(n0Var, Collections.singletonList(fVarI))).get(fVarI);
        Objects.requireNonNull(n0Var2);
        return n0Var2;
    }

    public final boolean x0() {
        if (((g0.n) x2.g.g(n())).h() == 1) {
            p0 p0Var = (p0) x2.g.g(i());
            if (p0Var.l() && p0Var.q()) {
                return true;
            }
        }
        return false;
    }

    public final int y0() {
        if (((g0.n) x2.g.g(n())).h() == 1) {
            return t((p0) x2.g.g(i()));
        }
        return 0;
    }

    public final n0 z0(n0 n0Var, p0 p0Var, boolean z10) {
        return (n() == null || n().h() == 2 || z10 || n().e() == 1) ? n0Var : w0(n0Var, p0Var);
    }
}
