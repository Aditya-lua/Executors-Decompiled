package m0;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f24331a;
    public final l1.a b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Void> f24334e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.c.a<Void> f24335f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ne.x<Void> f24338i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f24336g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f24337h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ne.x<Void> f24332c = y1.c.a(new y1.c.InterfaceC0665c() { // from class: m0.w0
        @Override // y1.c.InterfaceC0665c
        public final Object a(y1.c.a aVar) {
            return y0.j(this.f24315a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ne.x<Void> f24333d = y1.c.a(new y1.c.InterfaceC0665c() { // from class: m0.x0
        @Override // y1.c.InterfaceC0665c
        public final Object a(y1.c.a aVar) {
            return y0.k(this.f24329a, aVar);
        }
    });

    public y0(l1 l1Var, l1.a aVar) {
        this.f24331a = l1Var;
        this.b = aVar;
    }

    public static /* synthetic */ Object j(y0 y0Var, y1.c.a aVar) {
        y0Var.f24334e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object k(y0 y0Var, y1.c.a aVar) {
        y0Var.f24335f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // m0.a1
    public void a(int i10) {
        p0.z.b();
        if (this.f24336g) {
            return;
        }
        this.f24331a.w(i10);
    }

    @Override // m0.a1
    public void b(Bitmap bitmap) {
        p0.z.b();
        if (this.f24336g) {
            return;
        }
        this.f24331a.y(bitmap);
    }

    @Override // m0.a1
    public void c() {
        p0.z.b();
        if (this.f24336g || this.f24337h) {
            return;
        }
        this.f24337h = true;
        this.f24331a.j();
        g0.f1.g gVarL = this.f24331a.l();
        if (gVarL != null) {
            gVarL.c();
        }
    }

    @Override // m0.a1
    public void d(g0.f1.i iVar) {
        p0.z.b();
        if (this.f24336g) {
            return;
        }
        o();
        r();
        this.f24331a.A(iVar);
    }

    @Override // m0.a1
    public void e(g0.h1 h1Var) {
        p0.z.b();
        if (this.f24336g) {
            return;
        }
        o();
        r();
        s(h1Var);
    }

    @Override // m0.a1
    public void f(g0.h1 h1Var) {
        p0.z.b();
        if (this.f24336g) {
            return;
        }
        boolean zF = this.f24331a.f();
        if (!zF) {
            s(h1Var);
        }
        r();
        this.f24334e.f(h1Var);
        if (zF) {
            this.b.f(this.f24331a);
        }
    }

    @Override // m0.a1
    public void g(androidx.camera.core.d dVar) {
        p0.z.b();
        if (this.f24336g) {
            dVar.close();
            return;
        }
        o();
        r();
        this.f24331a.z(dVar);
    }

    @Override // m0.a1
    public boolean h() {
        return this.f24336g;
    }

    @Override // m0.a1
    public void i() {
        p0.z.b();
        if (this.f24336g) {
            return;
        }
        if (!this.f24337h) {
            c();
        }
        this.f24334e.c(null);
    }

    public final void l(g0.h1 h1Var) {
        p0.z.b();
        this.f24336g = true;
        ne.x<Void> xVar = this.f24338i;
        Objects.requireNonNull(xVar);
        xVar.cancel(true);
        this.f24334e.f(h1Var);
        this.f24335f.c(null);
    }

    public void m(g0.h1 h1Var) {
        p0.z.b();
        if (this.f24333d.isDone()) {
            return;
        }
        l(h1Var);
        s(h1Var);
    }

    public void n() {
        p0.z.b();
        if (this.f24333d.isDone()) {
            return;
        }
        l(new g0.h1(3, "The request is aborted silently and retried.", null));
        this.b.f(this.f24331a);
    }

    public final void o() {
        x2.g.j(this.f24332c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public ne.x<Void> p() {
        p0.z.b();
        return this.f24332c;
    }

    public ne.x<Void> q() {
        p0.z.b();
        return this.f24333d;
    }

    public final void r() {
        if (!this.f24331a.t() || this.f24331a.s()) {
            if (!this.f24331a.t()) {
                x2.g.j(!this.f24333d.isDone(), "The callback can only complete once.");
            }
            this.f24335f.c(null);
        }
    }

    public final void s(g0.h1 h1Var) {
        p0.z.b();
        this.f24331a.x(h1Var);
    }

    public void t(ne.x<Void> xVar) {
        p0.z.b();
        x2.g.j(this.f24338i == null, "CaptureRequestFuture can only be set once.");
        this.f24338i = xVar;
    }
}
