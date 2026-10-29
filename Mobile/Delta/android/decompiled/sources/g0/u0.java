package g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import n0.c3;
import n0.i4;
import n0.j4;
import n0.o3;
import n0.t3;

/* JADX INFO: loaded from: classes.dex */
public final class u0 extends w2 {
    public static final d B = new d();
    public static final Boolean C = null;
    public o3.c A;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Object f17517s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x0 f17518t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Executor f17519u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public a f17520v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rect f17521w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Matrix f17522x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public o3.b f17523y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public n0.u1 f17524z;

    public interface a {
        default Size c() {
            return null;
        }

        default int d() {
            return 0;
        }

        default void f(Matrix matrix) {
        }

        void k(androidx.camera.core.d dVar);
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public static final class c implements n0.i2.a<c>, i4.b<u0, n0.f2, c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final n0.x2 f17525a;

        public c() {
            this(n0.x2.k0());
        }

        public static c g(n0.n1 n1Var) {
            return new c(n0.x2.l0(n1Var));
        }

        @Override // g0.l0
        public n0.w2 a() {
            return this.f17525a;
        }

        public u0 f() {
            n0.f2 f2VarE = e();
            n0.i2.Y(f2VarE);
            return new u0(f2VarE);
        }

        @Override // n0.i4.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public n0.f2 e() {
            return new n0.f2(c3.j0(this.f17525a));
        }

        public c i(Executor executor) {
            a().G(s0.r.O, executor);
            return this;
        }

        public c j(int i10) {
            a().G(n0.f2.Q, Integer.valueOf(i10));
            return this;
        }

        public c k(j4.b bVar) {
            a().G(i4.G, bVar);
            return this;
        }

        public c l(Size size) {
            a().G(n0.i2.f24689r, size);
            return this;
        }

        public c m(k0 k0Var) {
            if (!Objects.equals(k0.f17470d, k0Var)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().G(n0.h2.f24672l, k0Var);
            return this;
        }

        public c n(int i10) {
            a().G(n0.f2.R, Integer.valueOf(i10));
            return this;
        }

        public c o(int i10) {
            a().G(n0.f2.T, Integer.valueOf(i10));
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public c b(a1.c cVar) {
            a().G(n0.i2.f24692u, cVar);
            return this;
        }

        public c q(int i10) {
            a().G(i4.A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        public c r(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            a().G(n0.i2.f24684m, Integer.valueOf(i10));
            return this;
        }

        public c s(Class<u0> cls) {
            a().G(s0.q.N, cls);
            if (a().h(s0.q.M, null) == null) {
                t(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c t(String str) {
            a().G(s0.q.M, str);
            return this;
        }

        @Override // n0.i2.a
        @Deprecated
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c d(Size size) {
            a().G(n0.i2.f24688q, size);
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c c(int i10) {
            a().G(n0.i2.f24685n, Integer.valueOf(i10));
            return this;
        }

        public c(n0.x2 x2Var) {
            this.f17525a = x2Var;
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls == null || cls.equals(u0.class)) {
                k(j4.b.IMAGE_ANALYSIS);
                s(u0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Size f17526a;
        public static final k0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final a1.c f17527c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n0.f2 f17528d;

        static {
            Size size = new Size(640, 480);
            f17526a = size;
            k0 k0Var = k0.f17470d;
            b = k0Var;
            a1.c cVarA = new a1.c.a().d(a1.a.f68c).f(new a1.d(w0.d.f33584c, 1)).a();
            f17527c = cVarA;
            f17528d = new c().l(size).q(1).r(0).b(cVarA).m(k0Var).e();
        }

        public n0.f2 a() {
            return f17528d;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public u0(n0.f2 f2Var) {
        super(f2Var);
        this.f17517s = new Object();
    }

    public static /* synthetic */ void g0(androidx.camera.core.f fVar, androidx.camera.core.f fVar2) {
        fVar.j();
        if (fVar2 != null) {
            fVar2.j();
        }
    }

    public static /* synthetic */ void h0(u0 u0Var, x0 x0Var, o3 o3Var, o3.g gVar) {
        if (u0Var.i() == null) {
            return;
        }
        u0Var.k0();
        x0Var.f();
        o3.b bVarL0 = u0Var.l0(u0Var.k(), (n0.f2) u0Var.l(), (t3) x2.g.g(u0Var.g()));
        u0Var.f17523y = bVarL0;
        u0Var.d0(o0.a(new Object[]{bVarL0.p()}));
        u0Var.L();
    }

    public static /* synthetic */ List j0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n0.n1 n1Var) {
        return c.g(n1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // g0.w2
    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        final Size sizeC;
        synchronized (this.f17517s) {
            try {
                a aVar = this.f17520v;
                sizeC = aVar != null ? aVar.c() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sizeC == null) {
            return bVar.e();
        }
        if (o0Var.w(((Integer) bVar.a().h(n0.i2.f24685n, 0)).intValue()) % 180 == 90) {
            sizeC = new Size(sizeC.getHeight(), sizeC.getWidth());
        }
        i4 i4VarE = bVar.e();
        n0.n1.a<Size> aVar2 = n0.i2.f24688q;
        if (!i4VarE.a(aVar2)) {
            bVar.a().G(aVar2, sizeC);
        }
        i4 i4VarE2 = bVar.e();
        n0.n1.a aVar3 = n0.i2.f24692u;
        if (i4VarE2.a(aVar3)) {
            a1.c cVar = (a1.c) e().h(aVar3, null);
            a1.c.a aVar4 = cVar == null ? new a1.c.a() : a1.c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new a1.d(sizeC, 1));
            }
            if (cVar == null) {
                aVar4.e(new a1.b() { // from class: g0.t0
                    @Override // a1.b
                    public final List a(List list, int i10) {
                        return u0.j0(sizeC, list, i10);
                    }
                });
            }
            bVar.a().G(aVar3, aVar4.a());
        }
        return bVar.e();
    }

    @Override // g0.w2
    public t3 T(n0.n1 n1Var) {
        this.f17523y.g(n1Var);
        d0(o0.a(new Object[]{this.f17523y.p()}));
        return g().i().d(n1Var).a();
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        r1.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        o3.b bVarL0 = l0(k(), (n0.f2) l(), t3Var);
        this.f17523y = bVarL0;
        d0(o0.a(new Object[]{bVarL0.p()}));
        return t3Var;
    }

    @Override // g0.w2
    public void V() {
        k0();
        synchronized (this.f17517s) {
            this.f17518t.i();
            this.f17518t = null;
        }
    }

    @Override // g0.w2
    public void Z(Matrix matrix) {
        super.Z(matrix);
        synchronized (this.f17517s) {
            try {
                x0 x0Var = this.f17518t;
                if (x0Var != null) {
                    x0Var.u(matrix);
                }
                this.f17522x = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // g0.w2
    public void b0(Rect rect) {
        super.b0(rect);
        synchronized (this.f17517s) {
            try {
                x0 x0Var = this.f17518t;
                if (x0Var != null) {
                    x0Var.v(rect);
                }
                this.f17521w = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void k0() {
        p0.z.b();
        o3.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
            this.A = null;
        }
        n0.u1 u1Var = this.f17524z;
        if (u1Var != null) {
            u1Var.d();
            this.f17524z = null;
        }
    }

    public o3.b l0(String str, n0.f2 f2Var, t3 t3Var) {
        final x0 x0Var;
        p0.z.b();
        Size sizeF = t3Var.f();
        Executor executor = (Executor) x2.g.g(f2Var.e0(q0.c.c()));
        boolean z10 = true;
        int iN0 = m0() == 1 ? n0() : 4;
        final androidx.camera.core.f fVar = f2Var.j0() != null ? new androidx.camera.core.f(f2Var.j0().a(sizeF.getWidth(), sizeF.getHeight(), p(), iN0, 0L)) : new androidx.camera.core.f(n1.a(sizeF.getWidth(), sizeF.getHeight(), p(), iN0));
        synchronized (this.f17517s) {
            s0();
            x0Var = this.f17518t;
        }
        boolean zQ0 = i() != null ? q0(i()) : false;
        int height = zQ0 ? sizeF.getHeight() : sizeF.getWidth();
        int width = zQ0 ? sizeF.getWidth() : sizeF.getHeight();
        int i10 = p0() == 2 ? 1 : 35;
        boolean z11 = p() == 35 && p0() == 2;
        boolean z12 = p() == 35 && p0() == 3;
        if (p() != 35 || ((i() == null || t(i()) == 0) && !Boolean.TRUE.equals(o0()))) {
            z10 = false;
        }
        final androidx.camera.core.f fVar2 = (z11 || (z10 && !z12)) ? new androidx.camera.core.f(n1.a(height, width, i10, fVar.e())) : null;
        if (fVar2 != null) {
            x0Var.s(fVar2);
        }
        v0();
        fVar.f(x0Var, executor);
        o3.b bVarR = o3.b.r(f2Var, t3Var.f());
        if (t3Var.d() != null) {
            bVarR.g(t3Var.d());
        }
        n0.u1 u1Var = this.f17524z;
        if (u1Var != null) {
            u1Var.d();
        }
        n0.k2 k2Var = new n0.k2(fVar.getSurface(), sizeF, p());
        this.f17524z = k2Var;
        k2Var.k().a(new Runnable() { // from class: g0.q0
            @Override // java.lang.Runnable
            public final void run() {
                u0.g0(fVar, fVar2);
            }
        }, q0.c.e());
        bVarR.A(t3Var.g());
        b(bVarR, t3Var);
        bVarR.n(this.f17524z, t3Var.b(), null, -1);
        o3.c cVar = this.A;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: g0.r0
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                u0.h0(this.f17506a, x0Var, o3Var, gVar);
            }
        });
        this.A = cVar2;
        bVarR.u(cVar2);
        return bVarR;
    }

    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        d dVar = B;
        n0.n1 n1VarA = j4Var.a(dVar.a().X(), 1);
        if (z10) {
            n1VarA = n0.n1.L(n1VarA, dVar.a());
        }
        if (n1VarA == null) {
            return null;
        }
        return D(n1VarA).e();
    }

    public int m0() {
        return ((n0.f2) l()).h0(0);
    }

    public int n0() {
        return ((n0.f2) l()).i0(6);
    }

    public Boolean o0() {
        return ((n0.f2) l()).k0(C);
    }

    public int p0() {
        return ((n0.f2) l()).l0(1);
    }

    public final boolean q0(n0.p0 p0Var) {
        return r0() && t(p0Var) % 180 != 0;
    }

    public boolean r0() {
        return ((n0.f2) l()).m0(Boolean.FALSE).booleanValue();
    }

    public final void s0() {
        a aVar;
        synchronized (this.f17517s) {
            try {
                n0.f2 f2Var = (n0.f2) l();
                if (f2Var.h0(0) == 1) {
                    this.f17518t = new y0();
                } else {
                    this.f17518t = new androidx.camera.core.c(f2Var.e0(q0.c.c()));
                }
                this.f17518t.q(p0());
                this.f17518t.r(r0());
                n0.p0 p0VarI = i();
                Boolean boolO0 = o0();
                boolean zA = p0VarI != null ? p0VarI.k().l().a(OnePixelShiftQuirk.class) : false;
                x0 x0Var = this.f17518t;
                if (boolO0 != null) {
                    zA = boolO0.booleanValue();
                }
                x0Var.p(zA);
                if (p0VarI != null) {
                    this.f17518t.t(t(p0VarI));
                }
                Rect rect = this.f17521w;
                if (rect != null) {
                    this.f17518t.v(rect);
                }
                Matrix matrix = this.f17522x;
                if (matrix != null) {
                    this.f17518t.u(matrix);
                }
                Executor executor = this.f17519u;
                if (executor != null && (aVar = this.f17520v) != null) {
                    this.f17518t.o(executor, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void t0(Executor executor, final a aVar) {
        synchronized (this.f17517s) {
            try {
                x0 x0Var = this.f17518t;
                if (x0Var != null) {
                    x0Var.o(executor, new a() { // from class: g0.s0
                        @Override // g0.u0.a
                        public final void k(androidx.camera.core.d dVar) {
                            aVar.k(dVar);
                        }
                    });
                }
                if (this.f17520v == null) {
                    J();
                }
                this.f17519u = executor;
                this.f17520v = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + r();
    }

    public void u0(int i10) {
        if (a0(i10)) {
            v0();
        }
    }

    public final void v0() {
        synchronized (this.f17517s) {
            try {
                n0.p0 p0VarI = i();
                if (p0VarI != null) {
                    this.f17518t.t(t(p0VarI));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
