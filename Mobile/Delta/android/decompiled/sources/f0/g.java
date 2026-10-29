package f0;

import g0.m;
import java.util.concurrent.Executor;
import me.x;
import n0.n1;
import r0.n;
import z.y;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f15790c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f15791d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1.c.a<Void> f15794g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f15789a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f15792e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.a.C0647a f15793f = new y.a.C0647a();

    public g(y yVar, Executor executor) {
        this.f15790c = yVar;
        this.f15791d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final y1.c.a aVar) {
        gVar.f15791d.execute(new Runnable() { // from class: f0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f15788a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final y1.c.a aVar) {
        gVar.f15791d.execute(new Runnable() { // from class: f0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f15786a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public x<Void> g(l lVar) {
        h(lVar);
        return n.s(y1.c.a(new y1.c.InterfaceC0650c() { // from class: f0.a
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return g.a(this.f15783a, aVar);
            }
        }));
    }

    public final void h(l lVar) {
        synchronized (this.f15792e) {
            this.f15793f.c(lVar);
        }
    }

    public void i(y.a.C0647a c0647a) {
        synchronized (this.f15792e) {
            c0647a.d(this.f15793f.a(), n1.c.ALWAYS_OVERRIDE);
        }
    }

    public x<Void> j() {
        k();
        return n.s(y1.c.a(new y1.c.InterfaceC0650c() { // from class: f0.c
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return g.b(this.f15785a, aVar);
            }
        }));
    }

    public final void k() {
        synchronized (this.f15792e) {
            this.f15793f = new y.a.C0647a();
        }
    }

    public final void l() {
        y1.c.a<Void> aVar = this.f15794g;
        if (aVar != null) {
            aVar.c(null);
            this.f15794g = null;
        }
    }

    public final void m(Exception exc) {
        y1.c.a<Void> aVar = this.f15794g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f15794g = null;
        }
    }

    public y.a n() {
        y.a aVarB;
        synchronized (this.f15792e) {
            aVarB = this.f15793f.b();
        }
        return aVarB;
    }

    public void o(final boolean z10) {
        this.f15791d.execute(new Runnable() { // from class: f0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f15784a.p(z10);
            }
        });
    }

    public final void p(boolean z10) {
        if (this.f15789a == z10) {
            return;
        }
        this.f15789a = z10;
        if (!z10) {
            m(new m.a("The camera control has became inactive."));
        } else if (this.b) {
            r();
        }
    }

    public final void q(y1.c.a<Void> aVar) {
        this.b = true;
        m(new m.a("Camera2CameraControl was updated with new options."));
        this.f15794g = aVar;
        if (this.f15789a) {
            r();
        }
    }

    public final void r() {
        this.f15790c.r0().a(new Runnable() { // from class: f0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f15787a.l();
            }
        }, this.f15791d);
        this.b = false;
    }
}
