package x0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import g0.j2;
import g0.v2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import n0.t3;
import n0.u1;

/* JADX INFO: loaded from: classes.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34595a;
    public final Matrix b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f34596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f34597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f34598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f34599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t3 f34600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f34601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34602i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v2 f34604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f34605l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34603j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<Runnable> f34606m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f34607n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<x2.a<v2.h>> f34608o = new ArrayList();

    public static class a extends u1 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final me.x<Surface> f34609o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public y1.c.a<Surface> f34610p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public u1 f34611q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public q0 f34612r;

        public a(Size size, int i10) {
            super(size, i10);
            this.f34609o = y1.c.a(new y1.c.InterfaceC0650c() { // from class: x0.l0
                @Override // y1.c.InterfaceC0650c
                public final Object a(y1.c.a aVar) {
                    return n0.a.r(this.f34591a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            q0 q0Var = aVar.f34612r;
            if (q0Var != null) {
                q0Var.f();
            }
            if (aVar.f34611q == null) {
                aVar.f34610p.d();
            }
            aVar.f34611q = null;
        }

        public static /* synthetic */ Object r(a aVar, y1.c.a aVar2) {
            aVar.f34610p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // n0.u1
        public void d() {
            super.d();
            p0.z.e(new Runnable() { // from class: x0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.q(this.f34588a);
                }
            });
        }

        @Override // n0.u1
        public me.x<Surface> o() {
            return this.f34609o;
        }

        public boolean s() {
            p0.z.b();
            return this.f34611q == null && !m();
        }

        public void t(q0 q0Var) {
            x2.g.j(this.f34612r == null, "Consumer can only be linked once.");
            this.f34612r = q0Var;
        }

        public boolean u(final u1 u1Var, Runnable runnable) {
            p0.z.b();
            x2.g.g(u1Var);
            u1 u1Var2 = this.f34611q;
            if (u1Var2 == u1Var) {
                return false;
            }
            x2.g.j(u1Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            x2.g.b(h().equals(u1Var.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), u1Var.h()));
            x2.g.b(i() == u1Var.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(u1Var.i())));
            x2.g.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f34611q = u1Var;
            r0.n.t(u1Var.j(), this.f34610p);
            u1Var.l();
            k().a(new Runnable() { // from class: x0.m0
                @Override // java.lang.Runnable
                public final void run() {
                    u1Var.e();
                }
            }, q0.c.b());
            u1Var.f().a(runnable, q0.c.e());
            return true;
        }
    }

    public n0(int i10, int i11, t3 t3Var, Matrix matrix, boolean z10, Rect rect, int i12, int i13, boolean z11) {
        this.f34599f = i10;
        this.f34595a = i11;
        this.f34600g = t3Var;
        this.b = matrix;
        this.f34596c = z10;
        this.f34597d = rect;
        this.f34602i = i12;
        this.f34601h = i13;
        this.f34598e = z11;
        this.f34605l = new a(t3Var.f(), i11);
    }

    public static /* synthetic */ void a(final n0 n0Var) {
        n0Var.getClass();
        q0.c.e().execute(new Runnable() { // from class: x0.i0
            @Override // java.lang.Runnable
            public final void run() {
                n0.b(this.f34584a);
            }
        });
    }

    public static /* synthetic */ void b(n0 n0Var) {
        if (n0Var.f34607n) {
            return;
        }
        n0Var.v();
    }

    public static /* synthetic */ void c(n0 n0Var, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (n0Var.f34602i != i10) {
            n0Var.f34602i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n0Var.f34601h != i11) {
            n0Var.f34601h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            n0Var.x();
        }
    }

    public static /* synthetic */ me.x d(n0 n0Var, final a aVar, int i10, j2.a aVar2, j2.a aVar3, Surface surface) {
        n0Var.getClass();
        x2.g.g(surface);
        try {
            aVar.l();
            q0 q0Var = new q0(surface, n0Var.t(), i10, n0Var.f34600g.f(), aVar2, aVar3, n0Var.b);
            q0Var.e().a(new Runnable() { // from class: x0.j0
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.e();
                }
            }, q0.c.b());
            aVar.t(q0Var);
            return r0.n.p(q0Var);
        } catch (u1.a e10) {
            return r0.n.n(e10);
        }
    }

    public void e(Runnable runnable) {
        p0.z.b();
        h();
        this.f34606m.add(runnable);
    }

    public void f(x2.a<v2.h> aVar) {
        x2.g.g(aVar);
        this.f34608o.add(aVar);
    }

    public final void g() {
        x2.g.j(!this.f34603j, "Consumer can only be linked once.");
        this.f34603j = true;
    }

    public final void h() {
        x2.g.j(!this.f34607n, "Edge is already closed.");
    }

    public final void i() {
        p0.z.b();
        this.f34605l.d();
        this.f34607n = true;
        this.f34608o.clear();
        this.f34606m.clear();
    }

    public me.x<j2> j(final int i10, final j2.a aVar, final j2.a aVar2) {
        p0.z.b();
        h();
        g();
        final a aVar3 = this.f34605l;
        return r0.n.y(aVar3.j(), new r0.a() { // from class: x0.g0
            @Override // r0.a
            public final me.x apply(Object obj) {
                return n0.d(this.f34576a, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, q0.c.e());
    }

    public v2 k(n0.p0 p0Var) {
        return l(p0Var, true);
    }

    public v2 l(n0.p0 p0Var, boolean z10) {
        p0.z.b();
        h();
        v2 v2Var = new v2(this.f34600g.f(), p0Var, z10, this.f34600g.b(), this.f34600g.g(), this.f34600g.c(), new Runnable() { // from class: x0.e0
            @Override // java.lang.Runnable
            public final void run() {
                n0.a(this.f34568a);
            }
        });
        try {
            final u1 u1VarN = v2Var.n();
            a aVar = this.f34605l;
            Objects.requireNonNull(aVar);
            if (aVar.u(u1VarN, new d0(aVar))) {
                me.x<Void> xVarK = aVar.k();
                Objects.requireNonNull(u1VarN);
                xVarK.a(new Runnable() { // from class: x0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u1VarN.d();
                    }
                }, q0.c.b());
            }
            this.f34604k = v2Var;
            x();
            return v2Var;
        } catch (RuntimeException e10) {
            v2Var.z();
            throw e10;
        } catch (u1.a e11) {
            throw new AssertionError("Surface is somehow already closed", e11);
        }
    }

    public final void m() {
        p0.z.b();
        h();
        this.f34605l.d();
    }

    public Rect n() {
        return this.f34597d;
    }

    public u1 o() {
        p0.z.b();
        h();
        g();
        return this.f34605l;
    }

    public int p() {
        return this.f34595a;
    }

    public int q() {
        return this.f34602i;
    }

    public Matrix r() {
        return this.b;
    }

    public t3 s() {
        return this.f34600g;
    }

    public int t() {
        return this.f34599f;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f34599f + ", format=" + this.f34595a + ", resolution=" + this.f34600g.f() + ", cropRect=" + this.f34597d + ", rotationDegrees=" + this.f34602i + ", mirroring=" + this.f34598e + ", sensorToBufferTransform= " + this.b + ", rotationInTransform= " + p0.a0.g(this.b) + ", isMirrorInTransform= " + p0.a0.l(this.b) + ", isClosed=" + this.f34607n + '}';
    }

    public boolean u() {
        return this.f34596c;
    }

    public void v() {
        p0.z.b();
        h();
        if (this.f34605l.s()) {
            return;
        }
        this.f34603j = false;
        this.f34605l.d();
        this.f34605l = new a(this.f34600g.f(), this.f34595a);
        Iterator<Runnable> it = this.f34606m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean w() {
        return this.f34598e;
    }

    public final void x() {
        p0.z.b();
        v2.h hVarG = v2.h.g(this.f34597d, this.f34602i, this.f34601h, u(), this.b, this.f34598e);
        v2 v2Var = this.f34604k;
        if (v2Var != null) {
            v2Var.y(hVarG);
        }
        Iterator<x2.a<v2.h>> it = this.f34608o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarG);
        }
    }

    public void y(u1 u1Var) {
        p0.z.b();
        h();
        a aVar = this.f34605l;
        Objects.requireNonNull(aVar);
        aVar.u(u1Var, new d0(aVar));
    }

    public void z(final int i10, final int i11) {
        p0.z.e(new Runnable() { // from class: x0.h0
            @Override // java.lang.Runnable
            public final void run() {
                n0.c(this.f34580a, i10, i11);
            }
        });
    }
}
