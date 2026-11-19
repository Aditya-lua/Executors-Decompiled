package m0;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f22691a;
    public final l1.a b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Void> f22694e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.c.a<Void> f22695f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public pe.x<Void> f22698i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f22696g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f22697h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final pe.x<Void> f22692c = y1.c.a(new y1.c.InterfaceC0761c() { // from class: m0.w0
        @Override // y1.c.InterfaceC0761c
        public final Object a(y1.c.a aVar) {
            return y0.j(this.f22675a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final pe.x<Void> f22693d = y1.c.a(new y1.c.InterfaceC0761c() { // from class: m0.x0
        @Override // y1.c.InterfaceC0761c
        public final Object a(y1.c.a aVar) {
            return y0.k(this.f22689a, aVar);
        }
    });

    public y0(l1 l1Var, l1.a aVar) {
        this.f22691a = l1Var;
        this.b = aVar;
    }

    public static /* synthetic */ Object j(y0 y0Var, y1.c.a aVar) {
        y0Var.f22694e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object k(y0 y0Var, y1.c.a aVar) {
        y0Var.f22695f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // m0.a1
    public void a(int i10) {
        p0.z.b();
        if (this.f22696g) {
            return;
        }
        this.f22691a.w(i10);
    }

    @Override // m0.a1
    public void b(Bitmap bitmap) {
        p0.z.b();
        if (this.f22696g) {
            return;
        }
        this.f22691a.y(bitmap);
    }

    @Override // m0.a1
    public void c() {
        p0.z.b();
        if (this.f22696g || this.f22697h) {
            return;
        }
        this.f22697h = true;
        this.f22691a.j();
        g0.f1.g gVarL = this.f22691a.l();
        if (gVarL != null) {
            gVarL.c();
        }
    }

    @Override // m0.a1
    public void d(g0.f1.i iVar) {
        p0.z.b();
        if (this.f22696g) {
            return;
        }
        o();
        r();
        this.f22691a.A(iVar);
    }

    @Override // m0.a1
    public void e(g0.h1 h1Var) {
        p0.z.b();
        if (this.f22696g) {
            return;
        }
        o();
        r();
        s(h1Var);
    }

    @Override // m0.a1
    public void f(g0.h1 h1Var) {
        p0.z.b();
        if (this.f22696g) {
            return;
        }
        boolean zF = this.f22691a.f();
        if (!zF) {
            s(h1Var);
        }
        r();
        this.f22694e.f(h1Var);
        if (zF) {
            this.b.f(this.f22691a);
        }
    }

    @Override // m0.a1
    public void g(androidx.camera.core.d dVar) {
        p0.z.b();
        if (this.f22696g) {
            dVar.close();
            return;
        }
        o();
        r();
        this.f22691a.z(dVar);
    }

    @Override // m0.a1
    public boolean h() {
        return this.f22696g;
    }

    @Override // m0.a1
    public void i() {
        p0.z.b();
        if (this.f22696g) {
            return;
        }
        if (!this.f22697h) {
            c();
        }
        this.f22694e.c(null);
    }

    public final void l(g0.h1 h1Var) {
        p0.z.b();
        this.f22696g = true;
        pe.x<Void> xVar = this.f22698i;
        Objects.requireNonNull(xVar);
        xVar.cancel(true);
        this.f22694e.f(h1Var);
        this.f22695f.c(null);
    }

    public void m(g0.h1 h1Var) {
        p0.z.b();
        if (this.f22693d.isDone()) {
            return;
        }
        l(h1Var);
        s(h1Var);
    }

    public void n() {
        p0.z.b();
        if (this.f22693d.isDone()) {
            return;
        }
        l(new g0.h1(3, "The request is aborted silently and retried.", null));
        this.b.f(this.f22691a);
    }

    public final void o() {
        x2.g.j(this.f22692c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public pe.x<Void> p() {
        p0.z.b();
        return this.f22692c;
    }

    public pe.x<Void> q() {
        p0.z.b();
        return this.f22693d;
    }

    public final void r() {
        if (!this.f22691a.t() || this.f22691a.s()) {
            if (!this.f22691a.t()) {
                x2.g.j(!this.f22693d.isDone(), "The callback can only complete once.");
            }
            this.f22695f.c(null);
        }
    }

    public final void s(g0.h1 h1Var) {
        p0.z.b();
        this.f22691a.x(h1Var);
    }

    public void t(pe.x<Void> xVar) {
        p0.z.b();
        x2.g.j(this.f22698i == null, "CaptureRequestFuture can only be set once.");
        this.f22698i = xVar;
    }
}
