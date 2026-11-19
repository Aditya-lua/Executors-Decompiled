package f0;

import g0.m;
import java.util.concurrent.Executor;
import n0.n1;
import pe.x;
import r0.n;
import z.y;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f14863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f14864d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1.c.a<Void> f14867g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14862a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f14865e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.a.C0758a f14866f = new y.a.C0758a();

    public g(y yVar, Executor executor) {
        this.f14863c = yVar;
        this.f14864d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final y1.c.a aVar) {
        gVar.f14864d.execute(new Runnable() { // from class: f0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f14861a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final y1.c.a aVar) {
        gVar.f14864d.execute(new Runnable() { // from class: f0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f14859a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public x<Void> g(l lVar) {
        h(lVar);
        return n.s(y1.c.a(new y1.c.InterfaceC0761c() { // from class: f0.a
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return g.a(this.f14856a, aVar);
            }
        }));
    }

    public final void h(l lVar) {
        synchronized (this.f14865e) {
            this.f14866f.c(lVar);
        }
    }

    public void i(y.a.C0758a c0758a) {
        synchronized (this.f14865e) {
            c0758a.d(this.f14866f.a(), n1.c.ALWAYS_OVERRIDE);
        }
    }

    public x<Void> j() {
        k();
        return n.s(y1.c.a(new y1.c.InterfaceC0761c() { // from class: f0.c
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return g.b(this.f14858a, aVar);
            }
        }));
    }

    public final void k() {
        synchronized (this.f14865e) {
            this.f14866f = new y.a.C0758a();
        }
    }

    public final void l() {
        y1.c.a<Void> aVar = this.f14867g;
        if (aVar != null) {
            aVar.c(null);
            this.f14867g = null;
        }
    }

    public final void m(Exception exc) {
        y1.c.a<Void> aVar = this.f14867g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f14867g = null;
        }
    }

    public y.a n() {
        y.a aVarB;
        synchronized (this.f14865e) {
            aVarB = this.f14866f.b();
        }
        return aVarB;
    }

    public void o(final boolean z10) {
        this.f14864d.execute(new Runnable() { // from class: f0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f14857a.p(z10);
            }
        });
    }

    public final void p(boolean z10) {
        if (this.f14862a == z10) {
            return;
        }
        this.f14862a = z10;
        if (!z10) {
            m(new m.a("The camera control has became inactive."));
        } else if (this.b) {
            r();
        }
    }

    public final void q(y1.c.a<Void> aVar) {
        this.b = true;
        m(new m.a("Camera2CameraControl was updated with new options."));
        this.f14867g = aVar;
        if (this.f14862a) {
            r();
        }
    }

    public final void r() {
        this.f14863c.r0().a(new Runnable() { // from class: f0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f14860a.l();
            }
        }, this.f14864d);
        this.b = false;
    }
}
