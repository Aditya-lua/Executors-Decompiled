package f0;

import g0.m;
import java.util.concurrent.Executor;
import n0.n1;
import ne.x;
import r0.n;
import z.y;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y f16386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f16387d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public y1.c.a<Void> f16390g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f16385a = false;
    public boolean b = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f16388e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public y.a.C0662a f16389f = new y.a.C0662a();

    public g(y yVar, Executor executor) {
        this.f16386c = yVar;
        this.f16387d = executor;
    }

    public static /* synthetic */ Object a(final g gVar, final y1.c.a aVar) {
        gVar.f16387d.execute(new Runnable() { // from class: f0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f16384a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final y1.c.a aVar) {
        gVar.f16387d.execute(new Runnable() { // from class: f0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f16382a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    public x<Void> g(l lVar) {
        h(lVar);
        return n.s(y1.c.a(new y1.c.InterfaceC0665c() { // from class: f0.a
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return g.a(this.f16379a, aVar);
            }
        }));
    }

    public final void h(l lVar) {
        synchronized (this.f16388e) {
            this.f16389f.c(lVar);
        }
    }

    public void i(y.a.C0662a c0662a) {
        synchronized (this.f16388e) {
            c0662a.d(this.f16389f.a(), n1.c.ALWAYS_OVERRIDE);
        }
    }

    public x<Void> j() {
        k();
        return n.s(y1.c.a(new y1.c.InterfaceC0665c() { // from class: f0.c
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return g.b(this.f16381a, aVar);
            }
        }));
    }

    public final void k() {
        synchronized (this.f16388e) {
            this.f16389f = new y.a.C0662a();
        }
    }

    public final void l() {
        y1.c.a<Void> aVar = this.f16390g;
        if (aVar != null) {
            aVar.c(null);
            this.f16390g = null;
        }
    }

    public final void m(Exception exc) {
        y1.c.a<Void> aVar = this.f16390g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f16390g = null;
        }
    }

    public y.a n() {
        y.a aVarB;
        synchronized (this.f16388e) {
            aVarB = this.f16389f.b();
        }
        return aVarB;
    }

    public void o(final boolean z10) {
        this.f16387d.execute(new Runnable() { // from class: f0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f16380a.p(z10);
            }
        });
    }

    public final void p(boolean z10) {
        if (this.f16385a == z10) {
            return;
        }
        this.f16385a = z10;
        if (!z10) {
            m(new m.a("The camera control has became inactive."));
        } else if (this.b) {
            r();
        }
    }

    public final void q(y1.c.a<Void> aVar) {
        this.b = true;
        m(new m.a("Camera2CameraControl was updated with new options."));
        this.f16390g = aVar;
        if (this.f16385a) {
            r();
        }
    }

    public final void r() {
        this.f16386c.r0().a(new Runnable() { // from class: f0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f16383a.l();
            }
        }, this.f16387d);
        this.b = false;
    }
}
