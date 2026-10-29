package m0;

import android.graphics.Bitmap;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class y0 implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l1 f23681a;
    public final l1.a b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public y1.c.a<Void> f23684e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y1.c.a<Void> f23685f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public me.x<Void> f23688i;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f23686g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f23687h = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final me.x<Void> f23682c = y1.c.a(new y1.c.InterfaceC0650c() { // from class: m0.w0
        @Override // y1.c.InterfaceC0650c
        public final Object a(y1.c.a aVar) {
            return y0.j(this.f23665a, aVar);
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final me.x<Void> f23683d = y1.c.a(new y1.c.InterfaceC0650c() { // from class: m0.x0
        @Override // y1.c.InterfaceC0650c
        public final Object a(y1.c.a aVar) {
            return y0.k(this.f23679a, aVar);
        }
    });

    public y0(l1 l1Var, l1.a aVar) {
        this.f23681a = l1Var;
        this.b = aVar;
    }

    public static /* synthetic */ Object j(y0 y0Var, y1.c.a aVar) {
        y0Var.f23684e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object k(y0 y0Var, y1.c.a aVar) {
        y0Var.f23685f = aVar;
        return "RequestCompleteFuture";
    }

    @Override // m0.a1
    public void a(int i10) {
        p0.z.b();
        if (this.f23686g) {
            return;
        }
        this.f23681a.w(i10);
    }

    @Override // m0.a1
    public void b(Bitmap bitmap) {
        p0.z.b();
        if (this.f23686g) {
            return;
        }
        this.f23681a.y(bitmap);
    }

    @Override // m0.a1
    public void c() {
        p0.z.b();
        if (this.f23686g || this.f23687h) {
            return;
        }
        this.f23687h = true;
        this.f23681a.j();
        g0.f1.g gVarL = this.f23681a.l();
        if (gVarL != null) {
            gVarL.c();
        }
    }

    @Override // m0.a1
    public void d(g0.f1.i iVar) {
        p0.z.b();
        if (this.f23686g) {
            return;
        }
        o();
        r();
        this.f23681a.A(iVar);
    }

    @Override // m0.a1
    public void e(g0.h1 h1Var) {
        p0.z.b();
        if (this.f23686g) {
            return;
        }
        o();
        r();
        s(h1Var);
    }

    @Override // m0.a1
    public void f(g0.h1 h1Var) {
        p0.z.b();
        if (this.f23686g) {
            return;
        }
        boolean zF = this.f23681a.f();
        if (!zF) {
            s(h1Var);
        }
        r();
        this.f23684e.f(h1Var);
        if (zF) {
            this.b.f(this.f23681a);
        }
    }

    @Override // m0.a1
    public void g(androidx.camera.core.d dVar) {
        p0.z.b();
        if (this.f23686g) {
            dVar.close();
            return;
        }
        o();
        r();
        this.f23681a.z(dVar);
    }

    @Override // m0.a1
    public boolean h() {
        return this.f23686g;
    }

    @Override // m0.a1
    public void i() {
        p0.z.b();
        if (this.f23686g) {
            return;
        }
        if (!this.f23687h) {
            c();
        }
        this.f23684e.c(null);
    }

    public final void l(g0.h1 h1Var) {
        p0.z.b();
        this.f23686g = true;
        me.x<Void> xVar = this.f23688i;
        Objects.requireNonNull(xVar);
        xVar.cancel(true);
        this.f23684e.f(h1Var);
        this.f23685f.c(null);
    }

    public void m(g0.h1 h1Var) {
        p0.z.b();
        if (this.f23683d.isDone()) {
            return;
        }
        l(h1Var);
        s(h1Var);
    }

    public void n() {
        p0.z.b();
        if (this.f23683d.isDone()) {
            return;
        }
        l(new g0.h1(3, "The request is aborted silently and retried.", null));
        this.b.f(this.f23681a);
    }

    public final void o() {
        x2.g.j(this.f23682c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    public me.x<Void> p() {
        p0.z.b();
        return this.f23682c;
    }

    public me.x<Void> q() {
        p0.z.b();
        return this.f23683d;
    }

    public final void r() {
        if (!this.f23681a.t() || this.f23681a.s()) {
            if (!this.f23681a.t()) {
                x2.g.j(!this.f23683d.isDone(), "The callback can only complete once.");
            }
            this.f23685f.c(null);
        }
    }

    public final void s(g0.h1 h1Var) {
        p0.z.b();
        this.f23681a.x(h1Var);
    }

    public void t(me.x<Void> xVar) {
        p0.z.b();
        x2.g.j(this.f23688i == null, "CaptureRequestFuture can only be set once.");
        this.f23688i = xVar;
    }
}
