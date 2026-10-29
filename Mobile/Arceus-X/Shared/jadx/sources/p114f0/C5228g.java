package p114f0;

import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p140g0.InterfaceC5909m;
import p296n0.InterfaceC8795n1;
import p397r0.C10773n;
import p561y.C12964a;
import p563y1.C12997c;
import p589z.C13658y;

/* JADX INFO: renamed from: f0.g */
/* JADX INFO: loaded from: classes.dex */
public final class C5228g {

    /* JADX INFO: renamed from: c */
    public final C13658y f20274c;

    /* JADX INFO: renamed from: d */
    public final Executor f20275d;

    /* JADX INFO: renamed from: g */
    public C12997c.a<Void> f20278g;

    /* JADX INFO: renamed from: a */
    public boolean f20272a = false;

    /* JADX INFO: renamed from: b */
    public boolean f20273b = false;

    /* JADX INFO: renamed from: e */
    public final Object f20276e = new Object();

    /* JADX INFO: renamed from: f */
    public C12964a.a f20277f = new C12964a.a();

    public C5228g(C13658y c13658y, Executor executor) {
        this.f20274c = c13658y;
        this.f20275d = executor;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Object m24190a(final C5228g c5228g, final C12997c.a aVar) {
        c5228g.f20275d.execute(new Runnable() { // from class: f0.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f20270a.m24206q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Object m24191b(final C5228g c5228g, final C12997c.a aVar) {
        c5228g.f20275d.execute(new Runnable() { // from class: f0.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f20267a.m24206q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    /* JADX INFO: renamed from: g */
    public InterfaceFutureC9440x<Void> m24196g(C5233l c5233l) {
        m24197h(c5233l);
        return C10773n.m40996s(C12997c.m48311a(new C12997c.c() { // from class: f0.a
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5228g.m24190a(this.f20263a, aVar);
            }
        }));
    }

    /* JADX INFO: renamed from: h */
    public final void m24197h(C5233l c5233l) {
        synchronized (this.f20276e) {
            this.f20277f.m48219c(c5233l);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m24198i(C12964a.a aVar) {
        synchronized (this.f20276e) {
            aVar.m48220d(this.f20277f.mo6684a(), InterfaceC8795n1.c.ALWAYS_OVERRIDE);
        }
    }

    /* JADX INFO: renamed from: j */
    public InterfaceFutureC9440x<Void> m24199j() {
        m24200k();
        return C10773n.m40996s(C12997c.m48311a(new C12997c.c() { // from class: f0.c
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5228g.m24191b(this.f20266a, aVar);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public final void m24200k() {
        synchronized (this.f20276e) {
            this.f20277f = new C12964a.a();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m24201l() {
        C12997c.a<Void> aVar = this.f20278g;
        if (aVar != null) {
            aVar.m48314c(null);
            this.f20278g = null;
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m24202m(Exception exc) {
        C12997c.a<Void> aVar = this.f20278g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.m48317f(exc);
            this.f20278g = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public C12964a m24203n() {
        C12964a c12964aM48218b;
        synchronized (this.f20276e) {
            c12964aM48218b = this.f20277f.m48218b();
        }
        return c12964aM48218b;
    }

    /* JADX INFO: renamed from: o */
    public void m24204o(final boolean z10) {
        this.f20275d.execute(new Runnable() { // from class: f0.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f20264a.m24205p(z10);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public final void m24205p(boolean z10) {
        if (this.f20272a == z10) {
            return;
        }
        this.f20272a = z10;
        if (!z10) {
            m24202m(new InterfaceC5909m.a("The camera control has became inactive."));
        } else if (this.f20273b) {
            m24207r();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m24206q(C12997c.a<Void> aVar) {
        this.f20273b = true;
        m24202m(new InterfaceC5909m.a("Camera2CameraControl was updated with new options."));
        this.f20278g = aVar;
        if (this.f20272a) {
            m24207r();
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m24207r() {
        this.f20274c.m49801r0().mo37173a(new Runnable() { // from class: f0.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f20269a.m24201l();
            }
        }, this.f20275d);
        this.f20273b = false;
    }
}
