package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c3;
import n0.f3;
import n0.i4;
import n0.j4;
import n0.o3;
import n0.t3;

/* JADX INFO: loaded from: classes.dex */
public final class a2 extends w2 {
    public static final b A = new b();
    public static final Executor B = q0.c.e();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public c f17330s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Executor f17331t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public o3.b f17332u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public n0.u1 f17333v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public x0.n0 f17334w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v2 f17335x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public x0.v0 f17336y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public o3.c f17337z;

    public static final class a implements i4.b<a2, f3, a>, n0.i2.a<a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0.x2 f17338a;

        public a() {
            this(n0.x2.k0());
        }

        public static a g(n0.n1 n1Var) {
            return new a(n0.x2.l0(n1Var));
        }

        @Override // g0.l0
        public n0.w2 a() {
            return this.f17338a;
        }

        public a2 f() {
            f3 f3VarE = e();
            n0.i2.Y(f3VarE);
            return new a2(f3VarE);
        }

        @Override // n0.i4.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public f3 e() {
            return new f3(c3.j0(this.f17338a));
        }

        public a i(j4.b bVar) {
            a().G(i4.G, bVar);
            return this;
        }

        public a j(k0 k0Var) {
            a().G(n0.h2.f24672l, k0Var);
            return this;
        }

        public a k(boolean z10) {
            a().G(i4.F, Boolean.valueOf(z10));
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a b(a1.c cVar) {
            a().G(n0.i2.f24692u, cVar);
            return this;
        }

        public a m(int i10) {
            a().G(i4.A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public a n(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().G(n0.i2.f24684m, Integer.valueOf(i10));
            return this;
        }

        public a o(Class<a2> cls) {
            a().G(s0.q.N, cls);
            if (a().h(s0.q.M, null) == null) {
                p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public a p(String str) {
            a().G(s0.q.M, str);
            return this;
        }

        @Override // n0.i2.a
        @Deprecated
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a d(Size size) {
            a().G(n0.i2.f24688q, size);
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a c(int i10) {
            a().G(n0.i2.f24685n, Integer.valueOf(i10));
            a().G(n0.i2.f24686o, Integer.valueOf(i10));
            return this;
        }

        public a(n0.x2 x2Var) {
            this.f17338a = x2Var;
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls != null && !cls.equals(a2.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            i(j4.b.PREVIEW);
            o(a2.class);
            n0.n1.a<Integer> aVar = n0.i2.f24687p;
            if (((Integer) x2Var.h(aVar, -1)).intValue() == -1) {
                x2Var.G(aVar, 2);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a1.c f17339a;
        public static final f3 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k0 f17340c;

        static {
            a1.c cVarA = new a1.c.a().d(a1.a.f68c).f(a1.d.f77c).a();
            f17339a = cVarA;
            k0 k0Var = k0.f17469c;
            f17340c = k0Var;
            b = new a().m(2).n(0).b(cVarA).k(true).j(k0Var).e();
        }

        public f3 a() {
            return b;
        }
    }

    public interface c {
        void a(v2 v2Var);
    }

    public a2(f3 f3Var) {
        super(f3Var);
        this.f17331t = B;
    }

    public static /* synthetic */ void g0(a2 a2Var, o3 o3Var, o3.g gVar) {
        if (a2Var.i() == null) {
            return;
        }
        a2Var.t0((f3) a2Var.l(), a2Var.g());
        a2Var.L();
    }

    private void k0() {
        o3.c cVar = this.f17337z;
        if (cVar != null) {
            cVar.b();
            this.f17337z = null;
        }
        n0.u1 u1Var = this.f17333v;
        if (u1Var != null) {
            u1Var.d();
            this.f17333v = null;
        }
        x0.v0 v0Var = this.f17336y;
        if (v0Var != null) {
            v0Var.f();
            this.f17336y = null;
        }
        x0.n0 n0Var = this.f17334w;
        if (n0Var != null) {
            n0Var.i();
            this.f17334w = null;
        }
        v2 v2Var = this.f17335x;
        if (v2Var != null) {
            v2Var.l();
        }
        this.f17335x = null;
    }

    @Override // g0.w2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n0.n1 n1Var) {
        return a.g(n1Var);
    }

    @Override // g0.w2
    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        bVar.a().G(n0.h2.f24670j, 34);
        return bVar.e();
    }

    @Override // g0.w2
    public t3 T(n0.n1 n1Var) {
        this.f17332u.g(n1Var);
        d0(o0.a(new Object[]{this.f17332u.p()}));
        return g().i().d(n1Var).a();
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        r1.a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        t0((f3) l(), t3Var);
        return t3Var;
    }

    @Override // g0.w2
    public void V() {
        k0();
    }

    @Override // g0.w2
    public void b0(Rect rect) {
        super.b0(rect);
        p0();
    }

    public final void j0(o3.b bVar, t3 t3Var) {
        if (this.f17330s != null) {
            bVar.n(this.f17333v, t3Var.b(), s(), q());
        }
        o3.c cVar = this.f17337z;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: g0.z1
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                a2.g0(this.f17640a, o3Var, gVar);
            }
        });
        this.f17337z = cVar2;
        bVar.u(cVar2);
    }

    public final o3.b l0(f3 f3Var, t3 t3Var) {
        p0.z.b();
        n0.p0 p0VarI = i();
        Objects.requireNonNull(p0VarI);
        final n0.p0 p0Var = p0VarI;
        k0();
        x2.g.i(this.f17334w == null);
        Matrix matrixY = y();
        boolean zQ = p0Var.q();
        Rect rectM0 = m0(t3Var.f());
        Objects.requireNonNull(rectM0);
        this.f17334w = new x0.n0(1, 34, t3Var, matrixY, zQ, rectM0, u(p0Var, H(p0Var)), f(), s0(p0Var));
        n nVarN = n();
        if (nVarN != null) {
            this.f17336y = new x0.v0(p0Var, nVarN.a());
            this.f17334w.e(new Runnable() { // from class: g0.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17580a.L();
                }
            });
            z0.f fVarJ = z0.f.j(this.f17334w);
            x0.n0 n0Var = this.f17336y.j(x0.v0.b.c(this.f17334w, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n0Var);
            n0Var.e(new Runnable() { // from class: g0.x1
                @Override // java.lang.Runnable
                public final void run() {
                    a2 a2Var = this.f17622a;
                    a2Var.n0(a2Var.f17334w, p0Var);
                }
            });
            this.f17335x = n0Var.k(p0Var);
            this.f17333v = this.f17334w.o();
        } else {
            this.f17334w.e(new Runnable() { // from class: g0.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17580a.L();
                }
            });
            v2 v2VarK = this.f17334w.k(p0Var);
            this.f17335x = v2VarK;
            this.f17333v = v2VarK.n();
        }
        if (this.f17330s != null) {
            o0();
        }
        o3.b bVarR = o3.b.r(f3Var, t3Var.f());
        bVarR.A(t3Var.g());
        b(bVarR, t3Var);
        bVarR.z(f3Var.E());
        if (t3Var.d() != null) {
            bVarR.g(t3Var.d());
        }
        j0(bVarR, t3Var);
        return bVarR;
    }

    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        b bVar = A;
        n0.n1 n1VarA = j4Var.a(bVar.a().X(), 1);
        if (z10) {
            n1VarA = n0.n1.L(n1VarA, bVar.a());
        }
        if (n1VarA == null) {
            return null;
        }
        return D(n1VarA).e();
    }

    public final Rect m0(Size size) {
        if (E() != null) {
            return E();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    public final void n0(x0.n0 n0Var, n0.p0 p0Var) {
        p0.z.b();
        if (p0Var == i()) {
            n0Var.v();
        }
    }

    public final void o0() {
        p0();
        final c cVar = (c) x2.g.g(this.f17330s);
        final v2 v2Var = (v2) x2.g.g(this.f17335x);
        this.f17331t.execute(new Runnable() { // from class: g0.y1
            @Override // java.lang.Runnable
            public final void run() {
                cVar.a(v2Var);
            }
        });
    }

    public final void p0() {
        n0.p0 p0VarI = i();
        x0.n0 n0Var = this.f17334w;
        if (p0VarI == null || n0Var == null) {
            return;
        }
        n0Var.z(u(p0VarI, H(p0VarI)), f());
    }

    public void q0(c cVar) {
        r0(B, cVar);
    }

    public void r0(Executor executor, c cVar) {
        p0.z.b();
        if (cVar == null) {
            this.f17330s = null;
            K();
            return;
        }
        this.f17330s = cVar;
        this.f17331t = executor;
        if (h() != null) {
            t0((f3) l(), g());
            L();
        }
        J();
    }

    public final boolean s0(n0.p0 p0Var) {
        return p0Var.q() && H(p0Var);
    }

    public final void t0(f3 f3Var, t3 t3Var) {
        o3.b bVarL0 = l0(f3Var, t3Var);
        this.f17332u = bVarL0;
        d0(o0.a(new Object[]{bVarL0.p()}));
    }

    public String toString() {
        return "Preview:" + r();
    }
}
