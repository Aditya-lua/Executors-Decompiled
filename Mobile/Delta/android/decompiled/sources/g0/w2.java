package g0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import k0.DynamicRangeFeature;
import k0.FpsRangeFeature;
import k0.VideoStabilizationFeature;
import n0.i4;
import n0.j4;
import n0.o3;
import n0.t3;

/* JADX INFO: loaded from: classes.dex */
public abstract class w2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public i4<?> f17584e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public i4<?> f17585f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Set<i0.b> f17586g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public i4<?> f17587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public t3 f17588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public i4<?> f17589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Rect f17590k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public n0.p0 f17592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public n0.p0 f17593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public n f17594o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f17595p;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f17581a = false;
    public final Set<c> b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f17582c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f17583d = b.INACTIVE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Matrix f17591l = new Matrix();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public o3 f17596q = o3.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public o3 f17597r = o3.b();

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17598a;

        static {
            int[] iArr = new int[VideoStabilizationFeature.b.values().length];
            f17598a = iArr;
            try {
                iArr[VideoStabilizationFeature.b.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17598a[VideoStabilizationFeature.b.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17598a[VideoStabilizationFeature.b.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum b {
        ACTIVE,
        INACTIVE
    }

    public interface c {
        void g(w2 w2Var);

        void m(w2 w2Var);

        void n(w2 w2Var);

        void s(w2 w2Var);
    }

    public w2(i4<?> i4Var) {
        this.f17585f = i4Var;
        this.f17587h = i4Var;
    }

    public Set<k0> A(n0.o0 o0Var) {
        return null;
    }

    public Set<Integer> B() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    public int C() {
        return ((n0.i2) this.f17587h).J(0);
    }

    public abstract i4.b<?, ?, ?> D(n0.n1 n1Var);

    public Rect E() {
        return this.f17590k;
    }

    public boolean F(int i10) {
        Iterator<Integer> it = B().iterator();
        while (it.hasNext()) {
            if (x0.z0.e(i10, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    public boolean G() {
        return this.f17581a;
    }

    public boolean H(n0.p0 p0Var) {
        int iQ = q();
        if (iQ == -1 || iQ == 0) {
            return false;
        }
        if (iQ == 1) {
            return true;
        }
        if (iQ == 2) {
            return p0Var.l();
        }
        throw new AssertionError("Unknown mirrorMode: " + iQ);
    }

    public i4<?> I(n0.o0 o0Var, i4<?> i4Var, i4<?> i4Var2) {
        n0.x2 x2VarK0;
        if (i4Var2 != null) {
            x2VarK0 = n0.x2.l0(i4Var2);
            x2VarK0.m0(s0.q.M);
        } else {
            x2VarK0 = n0.x2.k0();
        }
        if (this.f17585f.a(n0.i2.f24684m) || this.f17585f.a(n0.i2.f24688q)) {
            n0.n1.a<a1.c> aVar = n0.i2.f24692u;
            if (x2VarK0.a(aVar)) {
                x2VarK0.m0(aVar);
            }
        }
        i4<?> i4Var3 = this.f17585f;
        n0.n1.a<a1.c> aVar2 = n0.i2.f24692u;
        if (i4Var3.a(aVar2)) {
            n0.n1.a<Size> aVar3 = n0.i2.f24690s;
            if (x2VarK0.a(aVar3) && ((a1.c) this.f17585f.e(aVar2)).d() != null) {
                x2VarK0.m0(aVar3);
            }
        }
        Iterator<n0.n1.a<?>> it = this.f17585f.b().iterator();
        while (it.hasNext()) {
            n0.n1.P(x2VarK0, x2VarK0, this.f17585f, it.next());
        }
        if (i4Var != null) {
            for (n0.n1.a<?> aVar4 : i4Var.b()) {
                if (!aVar4.c().equals(s0.q.M.c())) {
                    n0.n1.P(x2VarK0, x2VarK0, i4Var, aVar4);
                }
            }
        }
        if (x2VarK0.a(n0.i2.f24688q)) {
            n0.n1.a<Integer> aVar5 = n0.i2.f24684m;
            if (x2VarK0.a(aVar5)) {
                x2VarK0.m0(aVar5);
            }
        }
        n0.n1.a<a1.c> aVar6 = n0.i2.f24692u;
        if (x2VarK0.a(aVar6) && ((a1.c) x2VarK0.e(aVar6)).a() != 0) {
            x2VarK0.G(i4.E, Boolean.TRUE);
        }
        c(x2VarK0);
        return Q(o0Var, D(x2VarK0));
    }

    public final void J() {
        this.f17583d = b.ACTIVE;
        M();
    }

    public final void K() {
        this.f17583d = b.INACTIVE;
        M();
    }

    public final void L() {
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().n(this);
        }
    }

    public final void M() {
        int iOrdinal = this.f17583d.ordinal();
        if (iOrdinal == 0) {
            Iterator<c> it = this.b.iterator();
            while (it.hasNext()) {
                it.next().s(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<c> it2 = this.b.iterator();
            while (it2.hasNext()) {
                it2.next().m(this);
            }
        }
    }

    public final void N() {
        Iterator<c> it = this.b.iterator();
        while (it.hasNext()) {
            it.next().g(this);
        }
    }

    public void O() {
    }

    public void P() {
    }

    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        return bVar.e();
    }

    public void R() {
        this.f17581a = true;
    }

    public void S() {
        this.f17581a = false;
    }

    public t3 T(n0.n1 n1Var) {
        t3 t3Var = this.f17588i;
        if (t3Var != null) {
            return t3Var.i().d(n1Var).a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    public t3 U(t3 t3Var, t3 t3Var2) {
        return t3Var;
    }

    public void V() {
    }

    public final void W(c cVar) {
        this.b.remove(cVar);
    }

    public void X(n nVar) {
        x2.g.a(nVar == null || F(nVar.g()));
        this.f17594o = nVar;
    }

    public void Y(Set<i0.b> set) {
        this.f17586g = set != null ? new HashSet(set) : null;
    }

    public void Z(Matrix matrix) {
        this.f17591l = new Matrix(matrix);
    }

    public final void a(c cVar) {
        this.b.add(cVar);
    }

    public boolean a0(int i10) {
        int iJ = ((n0.i2) l()).J(-1);
        if (iJ != -1 && iJ == i10) {
            return false;
        }
        i4.b<?, ?, ?> bVarD = D(this.f17585f);
        w0.e.a(bVarD, i10);
        this.f17585f = bVarD.e();
        n0.p0 p0VarI = i();
        if (p0VarI == null) {
            this.f17587h = this.f17585f;
            return true;
        }
        this.f17587h = I(p0VarI.k(), this.f17584e, this.f17589j);
        return true;
    }

    public void b(o3.b bVar, t3 t3Var) {
        if (!t3.f24861a.equals(t3Var.c())) {
            bVar.v(t3Var.c());
            return;
        }
        synchronized (this.f17582c) {
            try {
                List listC = ((n0.p0) x2.g.g(this.f17592m)).k().l().c(AeFpsRangeQuirk.class);
                boolean z10 = true;
                if (listC.size() > 1) {
                    z10 = false;
                }
                x2.g.b(z10, "There should not have more than one AeFpsRangeQuirk.");
                if (!listC.isEmpty()) {
                    bVar.v(((AeFpsRangeQuirk) listC.get(0)).a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b0(Rect rect) {
        this.f17590k = rect;
    }

    public final void c(n0.x2 x2Var) {
        r1.a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f17586g + ", this = " + this);
        Set<i0.b> set = this.f17586g;
        if (set == null) {
            return;
        }
        k0 k0VarF = DynamicRangeFeature.f21993j;
        Range<Integer> range = t3.f24861a;
        VideoStabilizationFeature.b bVarF = VideoStabilizationFeature.f22010j;
        for (i0.b bVar : set) {
            if (bVar instanceof DynamicRangeFeature) {
                k0VarF = ((DynamicRangeFeature) bVar).getDynamicRange();
            } else if (bVar instanceof FpsRangeFeature) {
                FpsRangeFeature cVar = (FpsRangeFeature) bVar;
                range = new Range<>(Integer.valueOf(cVar.getMinFps()), Integer.valueOf(cVar.getMaxFps()));
            } else if (bVar instanceof VideoStabilizationFeature) {
                bVarF = ((VideoStabilizationFeature) bVar).getMode();
            }
        }
        if ((this instanceof a2) || s0.f.e0(this)) {
            x2Var.G(n0.h2.f24672l, k0VarF);
        }
        x2Var.G(i4.C, range);
        int i10 = a.f17598a[bVarF.ordinal()];
        if (i10 == 1) {
            x2Var.G(i4.H, 1);
            x2Var.G(i4.I, 1);
        } else if (i10 == 2) {
            x2Var.G(i4.H, 0);
            x2Var.G(i4.I, 2);
        } else {
            if (i10 != 3) {
                return;
            }
            x2Var.G(i4.H, 2);
            x2Var.G(i4.I, 0);
        }
    }

    public final void c0(n0.p0 p0Var) {
        V();
        synchronized (this.f17582c) {
            try {
                n0.p0 p0Var2 = this.f17592m;
                if (p0Var == p0Var2) {
                    W(p0Var2);
                    this.f17592m = null;
                }
                n0.p0 p0Var3 = this.f17593n;
                if (p0Var == p0Var3) {
                    W(p0Var3);
                    this.f17593n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f17588i = null;
        this.f17590k = null;
        this.f17587h = this.f17585f;
        this.f17584e = null;
        this.f17589j = null;
    }

    @SuppressLint({"WrongConstant"})
    public final void d(n0.p0 p0Var, n0.p0 p0Var2, i4<?> i4Var, i4<?> i4Var2) {
        synchronized (this.f17582c) {
            try {
                this.f17592m = p0Var;
                this.f17593n = p0Var2;
                a(p0Var);
                if (p0Var2 != null) {
                    a(p0Var2);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f17584e = i4Var;
        this.f17589j = i4Var2;
        this.f17587h = I(p0Var.k(), this.f17584e, this.f17589j);
        O();
    }

    public void d0(List<o3> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f17596q = list.get(0);
        if (list.size() > 1) {
            this.f17597r = list.get(1);
        }
        Iterator<o3> it = list.iterator();
        while (it.hasNext()) {
            for (n0.u1 u1Var : it.next().p()) {
                if (u1Var.g() == null) {
                    u1Var.p(getClass());
                }
            }
        }
    }

    public i4<?> e() {
        return this.f17585f;
    }

    public void e0(t3 t3Var, t3 t3Var2) {
        this.f17588i = U(t3Var, t3Var2);
    }

    public int f() {
        return ((n0.i2) this.f17587h).t(-1);
    }

    public void f0(n0.n1 n1Var) {
        this.f17588i = T(n1Var);
    }

    public t3 g() {
        return this.f17588i;
    }

    public Size h() {
        t3 t3Var = this.f17588i;
        if (t3Var != null) {
            return t3Var.f();
        }
        return null;
    }

    public n0.p0 i() {
        n0.p0 p0Var;
        synchronized (this.f17582c) {
            p0Var = this.f17592m;
        }
        return p0Var;
    }

    public n0.l0 j() {
        synchronized (this.f17582c) {
            try {
                n0.p0 p0Var = this.f17592m;
                if (p0Var == null) {
                    return n0.l0.f24725a;
                }
                return p0Var.e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String k() {
        return ((n0.p0) x2.g.h(i(), "No camera attached to use case: " + this)).k().e();
    }

    public i4<?> l() {
        return this.f17587h;
    }

    public abstract i4<?> m(boolean z10, j4 j4Var);

    public n n() {
        return this.f17594o;
    }

    public Set<i0.b> o() {
        return this.f17586g;
    }

    public int p() {
        return this.f17587h.p();
    }

    public int q() {
        return ((n0.i2) this.f17587h).g0(-1);
    }

    public String r() {
        String strU = this.f17587h.u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strU);
        return strU;
    }

    public String s() {
        return this.f17595p;
    }

    public int t(n0.p0 p0Var) {
        return u(p0Var, false);
    }

    public int u(n0.p0 p0Var, boolean z10) {
        int iW = p0Var.k().w(C());
        return (p0Var.q() || !z10) ? iW : p0.a0.w(-iW);
    }

    public n0.p0 v() {
        n0.p0 p0Var;
        synchronized (this.f17582c) {
            p0Var = this.f17593n;
        }
        return p0Var;
    }

    public String w() {
        if (v() == null) {
            return null;
        }
        return v().k().e();
    }

    public o3 x() {
        return this.f17597r;
    }

    public Matrix y() {
        return this.f17591l;
    }

    public o3 z() {
        return this.f17596q;
    }
}
