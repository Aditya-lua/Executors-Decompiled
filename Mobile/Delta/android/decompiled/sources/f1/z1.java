package f1;

import android.view.Surface;
import g0.v2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f16067a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.o f16068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m1.l f16069d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f16070e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f16071f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f16072g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m1.l.c.a f16073h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f16074i = b.NOT_INITIALIZED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public me.x<Void> f16075j = r0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1.c.a<Void> f16076k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public me.x<m1.l> f16077l = r0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y1.c.a<m1.l> f16078m = null;

    public class a implements r0.c<m1.l> {
        public a() {
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(m1.l lVar) {
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            g0.r1.m("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            z1.this.r();
        }
    }

    public enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public z1(m1.o oVar, Executor executor, Executor executor2) {
        this.f16067a = executor2;
        this.b = executor;
        this.f16068c = oVar;
    }

    public static /* synthetic */ Object c(z1 z1Var, y1.c.a aVar) {
        z1Var.f16076k = aVar;
        return "ReleasedFuture " + z1Var;
    }

    public static /* synthetic */ Object e(z1 z1Var, y1.c.a aVar) {
        z1Var.f16078m = aVar;
        return "ReadyToReleaseFuture " + z1Var;
    }

    public static /* synthetic */ Object f(z1 z1Var, v2 v2Var, m1.p1 p1Var, y1.c.a aVar) {
        z1Var.j(v2Var, p1Var, aVar);
        return "ConfigureVideoEncoderFuture " + z1Var;
    }

    public static /* synthetic */ void g(final z1 z1Var, y1.c.a aVar, v2 v2Var, final Surface surface) {
        Executor executor;
        int iOrdinal = z1Var.f16074i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (v2Var.v()) {
                    g0.r1.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(v2Var, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    z1Var.h();
                    return;
                }
                z1Var.f16070e = surface;
                g0.r1.a("VideoEncoderSession", "provide surface: " + surface);
                v2Var.w(surface, z1Var.b, new x2.a() { // from class: f1.s1
                    @Override // x2.a
                    public final void accept(Object obj) {
                        this.f16032a.o((v2.g) obj);
                    }
                });
                z1Var.f16074i = b.READY;
                aVar.c(z1Var.f16069d);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (z1Var.f16073h != null && (executor = z1Var.f16072g) != null) {
                        executor.execute(new Runnable() { // from class: f1.t1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f16034a.f16073h.a(surface);
                            }
                        });
                    }
                    g0.r1.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + z1Var.f16074i + " is not handled");
                }
            }
        }
        g0.r1.a("VideoEncoderSession", "Not provide surface in " + z1Var.f16074i);
        aVar.c(null);
    }

    public final void h() {
        int iOrdinal = this.f16074i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            r();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            g0.r1.a("VideoEncoderSession", "closeInternal in " + this.f16074i + " state");
            this.f16074i = b.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            g0.r1.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f16074i + " is not handled");
    }

    public me.x<m1.l> i(final v2 v2Var, final m1.p1 p1Var) {
        if (this.f16074i.ordinal() != 0) {
            return r0.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f16074i));
        }
        this.f16074i = b.INITIALIZING;
        this.f16071f = v2Var;
        g0.r1.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f16075j = y1.c.a(new y1.c.InterfaceC0650c() { // from class: f1.v1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return z1.c(this.f16040a, aVar);
            }
        });
        this.f16077l = y1.c.a(new y1.c.InterfaceC0650c() { // from class: f1.w1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return z1.e(this.f16049a, aVar);
            }
        });
        me.x xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: f1.x1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return z1.f(this.f16059a, v2Var, p1Var, aVar);
            }
        });
        r0.n.j(xVarA, new a(), this.b);
        return r0.n.s(xVarA);
    }

    public final void j(final v2 v2Var, m1.p1 p1Var, final y1.c.a<m1.l> aVar) {
        try {
            m1.l lVarA = this.f16068c.a(this.f16067a, p1Var, v2Var.r());
            this.f16069d = lVarA;
            m1.l.b bVarB = lVarA.b();
            if (bVarB instanceof m1.l.c) {
                ((m1.l.c) bVarB).a(this.b, new m1.l.c.a() { // from class: f1.y1
                    @Override // m1.l.c.a
                    public final void a(Surface surface) {
                        z1.g(this.f16063a, aVar, v2Var, surface);
                    }
                });
            } else {
                aVar.f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (m1.k1 e10) {
            g0.r1.d("VideoEncoderSession", "Unable to initialize video encoder.", e10);
            aVar.f(e10);
        }
    }

    public Surface k() {
        if (this.f16074i != b.READY) {
            return null;
        }
        return this.f16070e;
    }

    public me.x<m1.l> l() {
        return r0.n.s(this.f16077l);
    }

    public m1.l m() {
        return this.f16069d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    public boolean n(v2 v2Var) {
        int iOrdinal = this.f16074i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f16071f == v2Var) {
                    return true;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("State " + this.f16074i + " is not handled");
                    }
                } else if (this.f16071f == v2Var) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(v2.g gVar) {
        g0.r1.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface surfaceB = gVar.b();
        if (surfaceB != this.f16070e) {
            surfaceB.release();
            return;
        }
        this.f16070e = null;
        this.f16078m.c(this.f16069d);
        h();
    }

    public void p(Executor executor, m1.l.c.a aVar) {
        this.f16072g = executor;
        this.f16073h = aVar;
    }

    public me.x<Void> q() {
        h();
        return r0.n.s(this.f16075j);
    }

    public void r() {
        int iOrdinal = this.f16074i.ordinal();
        if (iOrdinal == 0) {
            this.f16074i = b.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.f16074i + " is not handled");
            }
            g0.r1.a("VideoEncoderSession", "terminateNow in " + this.f16074i + ", No-op");
            return;
        }
        this.f16074i = b.RELEASED;
        this.f16078m.c(this.f16069d);
        this.f16071f = null;
        if (this.f16069d == null) {
            g0.r1.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f16076k.c(null);
            return;
        }
        g0.r1.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f16069d);
        this.f16069d.a();
        this.f16069d.f().a(new Runnable() { // from class: f1.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f16038a.f16076k.c(null);
            }
        }, this.b);
        this.f16069d = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f16071f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
