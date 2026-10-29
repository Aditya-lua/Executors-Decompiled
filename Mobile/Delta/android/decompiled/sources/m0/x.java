package m0;

import android.util.Size;
import android.view.Surface;
import com.google.mlkit.vision.barcode.common.Barcode;
import g0.m1;
import g0.n1;
import g0.r1;
import java.util.List;
import java.util.Objects;
import n0.j2;
import n0.k2;
import n0.u1;

/* JADX INFO: loaded from: classes.dex */
public class x {
    public androidx.camera.core.f b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.camera.core.f f23667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.camera.core.f f23668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public u0.a f23669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f23670f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public v0 f23666a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public j0 f23671g = null;

    public class a extends n0.u {
        public a() {
        }

        public static /* synthetic */ void e(a aVar) {
            v0 v0Var = x.this.f23666a;
            if (v0Var != null) {
                v0Var.p();
            }
        }

        @Override // n0.u
        public void d(int i10) {
            q0.c.e().execute(new Runnable() { // from class: m0.w
                @Override // java.lang.Runnable
                public final void run() {
                    x.a.e(this.f23664a);
                }
            });
        }
    }

    public class b implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ v0 f23673a;

        public b(v0 v0Var) {
            this.f23673a = v0Var;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            p0.z.b();
            if (this.f23673a == x.this.f23666a) {
                r1.l("CaptureNode", "request aborted, id=" + x.this.f23666a.e());
                if (x.this.f23671g != null) {
                    x.this.f23671g.i();
                }
                x.this.f23666a = null;
            }
        }
    }

    public static abstract class c {
        public n0.u b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public u1 f23675c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public u1 f23676d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n0.u f23674a = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public u1 f23677e = null;

        public class a extends n0.u {
            public a() {
            }
        }

        public static c n(Size size, int i10, List<Integer> list, boolean z10, m1 m1Var, k0 k0Var) {
            return new m0.b(size, i10, list, z10, m1Var, k0Var, new x0.u(), new x0.u());
        }

        public n0.u a() {
            return this.f23674a;
        }

        public abstract x0.u<b1.a> b();

        public abstract m1 c();

        public abstract int d();

        public abstract List<Integer> e();

        public abstract k0 f();

        public u1 g() {
            return this.f23677e;
        }

        public abstract x0.u<v0> h();

        public n0.u i() {
            return this.b;
        }

        public u1 j() {
            return this.f23676d;
        }

        public abstract Size k();

        public u1 l() {
            u1 u1Var = this.f23675c;
            Objects.requireNonNull(u1Var);
            return u1Var;
        }

        public abstract boolean m();

        public void o(n0.u uVar) {
            this.f23674a = uVar;
        }

        public void p(Surface surface, Size size, int i10) {
            this.f23677e = new k2(surface, size, i10);
        }

        public void q(n0.u uVar) {
            this.b = uVar;
        }

        public void r(Surface surface) {
            x2.g.j(this.f23676d == null, "The secondary surface is already set.");
            this.f23676d = new k2(surface, k(), d());
        }

        public void s(Surface surface) {
            x2.g.j(this.f23675c == null, "The surface is already set.");
            this.f23675c = new k2(surface, k(), d());
        }
    }

    public static /* synthetic */ void a(x xVar, j2 j2Var) {
        xVar.getClass();
        try {
            androidx.camera.core.d dVarB = j2Var.b();
            if (dVarB != null) {
                xVar.k(dVarB);
                return;
            }
            v0 v0Var = xVar.f23666a;
            if (v0Var != null) {
                xVar.p(b1.a.c(v0Var.e(), new g0.h1(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e10) {
            v0 v0Var2 = xVar.f23666a;
            if (v0Var2 != null) {
                xVar.p(b1.a.c(v0Var2.e(), new g0.h1(2, "Failed to acquire latest image", e10)));
            }
        }
    }

    public static /* synthetic */ void b(x xVar, v0 v0Var) {
        xVar.l(v0Var);
        xVar.f23671g.h(v0Var);
    }

    public static /* synthetic */ void d(androidx.camera.core.f fVar) {
        if (fVar != null) {
            fVar.j();
        }
    }

    public static /* synthetic */ void e(x xVar, j2 j2Var) {
        xVar.getClass();
        try {
            androidx.camera.core.d dVarB = j2Var.b();
            if (dVarB != null) {
                xVar.m(dVarB);
            }
        } catch (IllegalStateException e10) {
            r1.d("CaptureNode", "Failed to acquire latest image of postview", e10);
        }
    }

    public static /* synthetic */ void f(androidx.camera.core.f fVar) {
        if (fVar != null) {
            fVar.j();
        }
    }

    public static j2 h(m1 m1Var, int i10, int i11, int i12) {
        return m1Var != null ? m1Var.a(i10, i11, i12, 4, 0L) : n1.a(i10, i11, i12, 4);
    }

    public int i() {
        p0.z.b();
        x2.g.j(this.b != null, "The ImageReader is not initialized.");
        return this.b.i();
    }

    public final void j(androidx.camera.core.d dVar) {
        v0 v0Var;
        v0 v0Var2;
        p0.z.b();
        u0.a aVar = this.f23669e;
        Objects.requireNonNull(aVar);
        aVar.a().accept(u0.b.c(this.f23666a, dVar));
        v0 v0Var3 = this.f23666a;
        c cVar = this.f23670f;
        boolean z10 = cVar != null && cVar.e().size() > 1;
        if (z10 && (v0Var2 = this.f23666a) != null) {
            v0Var2.k().u(dVar.getFormat(), true);
        }
        if (!z10 || ((v0Var = this.f23666a) != null && v0Var.k().s())) {
            this.f23666a = null;
        }
        v0Var3.s();
    }

    public void k(androidx.camera.core.d dVar) {
        p0.z.b();
        if (this.f23666a == null) {
            r1.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + dVar);
            dVar.close();
            return;
        }
        if (((Integer) dVar.H2().c().d(this.f23666a.j())) != null) {
            j(dVar);
        } else {
            r1.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            dVar.close();
        }
    }

    public void l(v0 v0Var) {
        p0.z.b();
        x2.g.j(v0Var.i().size() == 1, "only one capture stage is supported.");
        x2.g.j(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f23666a = v0Var;
        r0.n.j(v0Var.a(), new b(v0Var), q0.c.b());
    }

    public final void m(androidx.camera.core.d dVar) {
        if (this.f23666a == null) {
            r1.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            dVar.close();
        } else {
            u0.a aVar = this.f23669e;
            Objects.requireNonNull(aVar);
            aVar.d().accept(u0.b.c(this.f23666a, dVar));
        }
    }

    public void n() {
        p0.z.b();
        c cVar = this.f23670f;
        Objects.requireNonNull(cVar);
        androidx.camera.core.f fVar = this.b;
        Objects.requireNonNull(fVar);
        o(cVar, fVar, this.f23667c, this.f23668d);
    }

    public final void o(c cVar, final androidx.camera.core.f fVar, final androidx.camera.core.f fVar2, final androidx.camera.core.f fVar3) {
        cVar.l().d();
        cVar.l().k().a(new Runnable() { // from class: m0.s
            @Override // java.lang.Runnable
            public final void run() {
                fVar.j();
            }
        }, q0.c.e());
        if (cVar.g() != null) {
            cVar.g().d();
            cVar.g().k().a(new Runnable() { // from class: m0.t
                @Override // java.lang.Runnable
                public final void run() {
                    x.f(fVar3);
                }
            }, q0.c.e());
        }
        if (cVar.e().size() <= 1 || cVar.j() == null) {
            return;
        }
        cVar.j().d();
        cVar.j().k().a(new Runnable() { // from class: m0.u
            @Override // java.lang.Runnable
            public final void run() {
                x.d(fVar2);
            }
        }, q0.c.e());
    }

    public void p(b1.a aVar) {
        p0.z.b();
        v0 v0Var = this.f23666a;
        if (v0Var == null || v0Var.e() != aVar.b()) {
            return;
        }
        this.f23666a.n(aVar.a());
    }

    public final void q(j2 j2Var) {
        j2Var.f(new j2.a() { // from class: m0.v
            @Override // n0.j2.a
            public final void a(j2 j2Var2) {
                x.a(this.f23651a, j2Var2);
            }
        }, q0.c.e());
    }

    public void r(androidx.camera.core.b.a aVar) {
        p0.z.b();
        x2.g.j(this.b != null, "The ImageReader is not initialized.");
        this.b.k(aVar);
    }

    public u0.a s(c cVar) {
        x2.a<v0> aVar;
        j2 j2Var;
        androidx.camera.core.e eVar;
        j2 j2Var2;
        x2.g.j(this.f23670f == null && this.b == null, "CaptureNode does not support recreation yet.");
        this.f23670f = cVar;
        Size sizeK = cVar.k();
        int iD = cVar.d();
        boolean zM = cVar.m();
        n0.u aVar2 = new a();
        boolean z10 = cVar.e().size() > 1;
        n0.u uVarB = null;
        if (zM || cVar.c() != null) {
            j0 j0Var = new j0(h(cVar.c(), sizeK.getWidth(), sizeK.getHeight(), iD));
            this.f23671g = j0Var;
            aVar = new x2.a() { // from class: m0.p
                @Override // x2.a
                public final void accept(Object obj) {
                    x.b(this.f23625a, (v0) obj);
                }
            };
            j2Var = j0Var;
            eVar = null;
        } else {
            if (z10) {
                androidx.camera.core.e eVar2 = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), Barcode.FORMAT_QR_CODE, 4);
                n0.u uVarB2 = n0.v.b(aVar2, eVar2.m());
                eVar = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), 32, 4);
                n0.u[] uVarArr = {aVar2, eVar.m()};
                aVar2 = uVarB2;
                uVarB = n0.v.b(uVarArr);
                j2Var2 = eVar2;
            } else {
                androidx.camera.core.e eVar3 = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), iD, 4);
                aVar2 = n0.v.b(aVar2, eVar3.m());
                j2Var2 = eVar3;
                eVar = null;
            }
            aVar = new x2.a() { // from class: m0.o
                @Override // x2.a
                public final void accept(Object obj) {
                    this.f23623a.l((v0) obj);
                }
            };
            j2Var = j2Var2;
        }
        cVar.o(aVar2);
        if (z10 && uVarB != null) {
            cVar.q(uVarB);
        }
        Surface surface = j2Var.getSurface();
        Objects.requireNonNull(surface);
        cVar.s(surface);
        this.b = new androidx.camera.core.f(j2Var);
        q(j2Var);
        k0 k0VarF = cVar.f();
        if (k0VarF != null) {
            j2 j2VarH = h(cVar.c(), k0VarF.c().getWidth(), k0VarF.c().getHeight(), k0VarF.b());
            j2VarH.f(new j2.a() { // from class: m0.q
                @Override // n0.j2.a
                public final void a(j2 j2Var3) {
                    x.e(this.f23627a, j2Var3);
                }
            }, q0.c.e());
            this.f23668d = new androidx.camera.core.f(j2VarH);
            cVar.p(j2VarH.getSurface(), k0VarF.c(), k0VarF.b());
        }
        if (z10 && eVar != null) {
            cVar.r(eVar.getSurface());
            this.f23667c = new androidx.camera.core.f(eVar);
            q(eVar);
        }
        cVar.h().a(aVar);
        cVar.b().a(new x2.a() { // from class: m0.r
            @Override // x2.a
            public final void accept(Object obj) {
                this.f23629a.p((b1.a) obj);
            }
        });
        u0.a aVarE = u0.a.e(cVar.d(), cVar.e());
        this.f23669e = aVarE;
        return aVarE;
    }
}
