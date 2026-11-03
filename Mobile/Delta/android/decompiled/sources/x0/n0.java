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
    public final int f35093a;
    public final Matrix b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f35094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f35095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f35096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f35097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t3 f35098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f35099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f35100i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public v2 f35102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f35103l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f35101j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Set<Runnable> f35104m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f35105n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List<x2.a<v2.h>> f35106o = new ArrayList();

    public static class a extends u1 {

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final ne.x<Surface> f35107o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public y1.c.a<Surface> f35108p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public u1 f35109q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public q0 f35110r;

        public a(Size size, int i10) {
            super(size, i10);
            this.f35107o = y1.c.a(new y1.c.InterfaceC0665c() { // from class: x0.l0
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return n0.a.r(this.f35089a, aVar);
                }
            });
        }

        public static /* synthetic */ void q(a aVar) {
            q0 q0Var = aVar.f35110r;
            if (q0Var != null) {
                q0Var.f();
            }
            if (aVar.f35109q == null) {
                aVar.f35108p.d();
            }
            aVar.f35109q = null;
        }

        public static /* synthetic */ Object r(a aVar, y1.c.a aVar2) {
            aVar.f35108p = aVar2;
            return "SettableFuture hashCode: " + aVar.hashCode();
        }

        @Override // n0.u1
        public void d() {
            super.d();
            p0.z.e(new Runnable() { // from class: x0.k0
                @Override // java.lang.Runnable
                public final void run() {
                    n0.a.q(this.f35086a);
                }
            });
        }

        @Override // n0.u1
        public ne.x<Surface> o() {
            return this.f35107o;
        }

        public boolean s() {
            p0.z.b();
            return this.f35109q == null && !m();
        }

        public void t(q0 q0Var) {
            x2.g.j(this.f35110r == null, "Consumer can only be linked once.");
            this.f35110r = q0Var;
        }

        public boolean u(final u1 u1Var, Runnable runnable) {
            p0.z.b();
            x2.g.g(u1Var);
            u1 u1Var2 = this.f35109q;
            if (u1Var2 == u1Var) {
                return false;
            }
            x2.g.j(u1Var2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            x2.g.b(h().equals(u1Var.h()), String.format("The provider's size(%s) must match the parent(%s)", h(), u1Var.h()));
            x2.g.b(i() == u1Var.i(), String.format("The provider's format(%s) must match the parent(%s)", Integer.valueOf(i()), Integer.valueOf(u1Var.i())));
            x2.g.j(!m(), "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f35109q = u1Var;
            r0.n.t(u1Var.j(), this.f35108p);
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
        this.f35097f = i10;
        this.f35093a = i11;
        this.f35098g = t3Var;
        this.b = matrix;
        this.f35094c = z10;
        this.f35095d = rect;
        this.f35100i = i12;
        this.f35099h = i13;
        this.f35096e = z11;
        this.f35103l = new a(t3Var.f(), i11);
    }

    public static /* synthetic */ void a(final n0 n0Var) {
        n0Var.getClass();
        q0.c.e().execute(new Runnable() { // from class: x0.i0
            @Override // java.lang.Runnable
            public final void run() {
                n0.b(this.f35082a);
            }
        });
    }

    public static /* synthetic */ void b(n0 n0Var) {
        if (n0Var.f35105n) {
            return;
        }
        n0Var.v();
    }

    public static /* synthetic */ void c(n0 n0Var, int i10, int i11) {
        boolean z10;
        boolean z11 = true;
        if (n0Var.f35100i != i10) {
            n0Var.f35100i = i10;
            z10 = true;
        } else {
            z10 = false;
        }
        if (n0Var.f35099h != i11) {
            n0Var.f35099h = i11;
        } else {
            z11 = z10;
        }
        if (z11) {
            n0Var.x();
        }
    }

    public static /* synthetic */ ne.x d(n0 n0Var, final a aVar, int i10, j2.a aVar2, j2.a aVar3, Surface surface) {
        n0Var.getClass();
        x2.g.g(surface);
        try {
            aVar.l();
            q0 q0Var = new q0(surface, n0Var.t(), i10, n0Var.f35098g.f(), aVar2, aVar3, n0Var.b);
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
        this.f35104m.add(runnable);
    }

    public void f(x2.a<v2.h> aVar) {
        x2.g.g(aVar);
        this.f35106o.add(aVar);
    }

    public final void g() {
        x2.g.j(!this.f35101j, "Consumer can only be linked once.");
        this.f35101j = true;
    }

    public final void h() {
        x2.g.j(!this.f35105n, "Edge is already closed.");
    }

    public final void i() {
        p0.z.b();
        this.f35103l.d();
        this.f35105n = true;
        this.f35106o.clear();
        this.f35104m.clear();
    }

    public ne.x<j2> j(final int i10, final j2.a aVar, final j2.a aVar2) {
        p0.z.b();
        h();
        g();
        final a aVar3 = this.f35103l;
        return r0.n.y(aVar3.j(), new r0.a() { // from class: x0.g0
            @Override // r0.a
            public final ne.x apply(Object obj) {
                return n0.d(this.f35074a, aVar3, i10, aVar, aVar2, (Surface) obj);
            }
        }, q0.c.e());
    }

    public v2 k(n0.p0 p0Var) {
        return l(p0Var, true);
    }

    public v2 l(n0.p0 p0Var, boolean z10) {
        p0.z.b();
        h();
        v2 v2Var = new v2(this.f35098g.f(), p0Var, z10, this.f35098g.b(), this.f35098g.g(), this.f35098g.c(), new Runnable() { // from class: x0.e0
            @Override // java.lang.Runnable
            public final void run() {
                n0.a(this.f35066a);
            }
        });
        try {
            final u1 u1VarN = v2Var.n();
            a aVar = this.f35103l;
            Objects.requireNonNull(aVar);
            if (aVar.u(u1VarN, new d0(aVar))) {
                ne.x<Void> xVarK = aVar.k();
                Objects.requireNonNull(u1VarN);
                xVarK.a(new Runnable() { // from class: x0.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        u1VarN.d();
                    }
                }, q0.c.b());
            }
            this.f35102k = v2Var;
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
        this.f35103l.d();
    }

    public Rect n() {
        return this.f35095d;
    }

    public u1 o() {
        p0.z.b();
        h();
        g();
        return this.f35103l;
    }

    public int p() {
        return this.f35093a;
    }

    public int q() {
        return this.f35100i;
    }

    public Matrix r() {
        return this.b;
    }

    public t3 s() {
        return this.f35098g;
    }

    public int t() {
        return this.f35097f;
    }

    public String toString() {
        return "SurfaceEdge{targets=" + this.f35097f + ", format=" + this.f35093a + ", resolution=" + this.f35098g.f() + ", cropRect=" + this.f35095d + ", rotationDegrees=" + this.f35100i + ", mirroring=" + this.f35096e + ", sensorToBufferTransform= " + this.b + ", rotationInTransform= " + p0.a0.g(this.b) + ", isMirrorInTransform= " + p0.a0.l(this.b) + ", isClosed=" + this.f35105n + '}';
    }

    public boolean u() {
        return this.f35094c;
    }

    public void v() {
        p0.z.b();
        h();
        if (this.f35103l.s()) {
            return;
        }
        this.f35101j = false;
        this.f35103l.d();
        this.f35103l = new a(this.f35098g.f(), this.f35093a);
        Iterator<Runnable> it = this.f35104m.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public boolean w() {
        return this.f35096e;
    }

    public final void x() {
        p0.z.b();
        v2.h hVarG = v2.h.g(this.f35095d, this.f35100i, this.f35099h, u(), this.b, this.f35096e);
        v2 v2Var = this.f35102k;
        if (v2Var != null) {
            v2Var.y(hVarG);
        }
        Iterator<x2.a<v2.h>> it = this.f35106o.iterator();
        while (it.hasNext()) {
            it.next().accept(hVarG);
        }
    }

    public void y(u1 u1Var) {
        p0.z.b();
        h();
        a aVar = this.f35103l;
        Objects.requireNonNull(aVar);
        aVar.u(u1Var, new d0(aVar));
    }

    public void z(final int i10, final int i11) {
        p0.z.e(new Runnable() { // from class: x0.h0
            @Override // java.lang.Runnable
            public final void run() {
                n0.c(this.f35078a, i10, i11);
            }
        });
    }
}
