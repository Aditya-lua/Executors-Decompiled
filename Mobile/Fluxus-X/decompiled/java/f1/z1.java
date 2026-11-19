package f1;

import android.view.Surface;
import g0.v2;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f15140a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m1.o f15141c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public m1.l f15142d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Surface f15143e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public v2 f15144f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Executor f15145g = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public m1.l.c.a f15146h = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public b f15147i = b.NOT_INITIALIZED;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public pe.x<Void> f15148j = r0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public y1.c.a<Void> f15149k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public pe.x<m1.l> f15150l = r0.n.n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public y1.c.a<m1.l> f15151m = null;

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
        this.f15140a = executor2;
        this.b = executor;
        this.f15141c = oVar;
    }

    public static /* synthetic */ Object c(z1 z1Var, y1.c.a aVar) {
        z1Var.f15149k = aVar;
        return "ReleasedFuture " + z1Var;
    }

    public static /* synthetic */ Object e(z1 z1Var, y1.c.a aVar) {
        z1Var.f15151m = aVar;
        return "ReadyToReleaseFuture " + z1Var;
    }

    public static /* synthetic */ Object f(z1 z1Var, v2 v2Var, m1.p1 p1Var, y1.c.a aVar) {
        z1Var.j(v2Var, p1Var, aVar);
        return "ConfigureVideoEncoderFuture " + z1Var;
    }

    public static /* synthetic */ void g(final z1 z1Var, y1.c.a aVar, v2 v2Var, final Surface surface) {
        Executor executor;
        int iOrdinal = z1Var.f15147i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (v2Var.v()) {
                    g0.r1.a("VideoEncoderSession", "Not provide surface, " + Objects.toString(v2Var, "EMPTY") + " is already serviced.");
                    aVar.c(null);
                    z1Var.h();
                    return;
                }
                z1Var.f15143e = surface;
                g0.r1.a("VideoEncoderSession", "provide surface: " + surface);
                v2Var.w(surface, z1Var.b, new x2.a() { // from class: f1.s1
                    @Override // x2.a
                    public final void accept(Object obj) {
                        this.f15105a.o((v2.g) obj);
                    }
                });
                z1Var.f15147i = b.READY;
                aVar.c(z1Var.f15142d);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (z1Var.f15146h != null && (executor = z1Var.f15145g) != null) {
                        executor.execute(new Runnable() { // from class: f1.t1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f15107a.f15146h.a(surface);
                            }
                        });
                    }
                    g0.r1.l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + z1Var.f15147i + " is not handled");
                }
            }
        }
        g0.r1.a("VideoEncoderSession", "Not provide surface in " + z1Var.f15147i);
        aVar.c(null);
    }

    public final void h() {
        int iOrdinal = this.f15147i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            r();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            g0.r1.a("VideoEncoderSession", "closeInternal in " + this.f15147i + " state");
            this.f15147i = b.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            g0.r1.a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f15147i + " is not handled");
    }

    public pe.x<m1.l> i(final v2 v2Var, final m1.p1 p1Var) {
        if (this.f15147i.ordinal() != 0) {
            return r0.n.n(new IllegalStateException("configure() shouldn't be called in " + this.f15147i));
        }
        this.f15147i = b.INITIALIZING;
        this.f15144f = v2Var;
        g0.r1.a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f15148j = y1.c.a(new y1.c.InterfaceC0761c() { // from class: f1.v1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return z1.c(this.f15113a, aVar);
            }
        });
        this.f15150l = y1.c.a(new y1.c.InterfaceC0761c() { // from class: f1.w1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return z1.e(this.f15122a, aVar);
            }
        });
        pe.x xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: f1.x1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return z1.f(this.f15132a, v2Var, p1Var, aVar);
            }
        });
        r0.n.j(xVarA, new a(), this.b);
        return r0.n.s(xVarA);
    }

    public final void j(final v2 v2Var, m1.p1 p1Var, final y1.c.a<m1.l> aVar) {
        try {
            m1.l lVarA = this.f15141c.a(this.f15140a, p1Var, v2Var.r());
            this.f15142d = lVarA;
            m1.l.b bVarB = lVarA.b();
            if (bVarB instanceof m1.l.c) {
                ((m1.l.c) bVarB).a(this.b, new m1.l.c.a() { // from class: f1.y1
                    @Override // m1.l.c.a
                    public final void a(Surface surface) {
                        z1.g(this.f15136a, aVar, v2Var, surface);
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
        if (this.f15147i != b.READY) {
            return null;
        }
        return this.f15143e;
    }

    public pe.x<m1.l> l() {
        return r0.n.s(this.f15150l);
    }

    public m1.l m() {
        return this.f15142d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    public boolean n(v2 v2Var) {
        int iOrdinal = this.f15147i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f15144f == v2Var) {
                    return true;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("State " + this.f15147i + " is not handled");
                    }
                } else if (this.f15144f == v2Var) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void o(v2.g gVar) {
        g0.r1.a("VideoEncoderSession", "Surface can be closed: " + gVar.b().hashCode());
        Surface surfaceB = gVar.b();
        if (surfaceB != this.f15143e) {
            surfaceB.release();
            return;
        }
        this.f15143e = null;
        this.f15151m.c(this.f15142d);
        h();
    }

    public void p(Executor executor, m1.l.c.a aVar) {
        this.f15145g = executor;
        this.f15146h = aVar;
    }

    public pe.x<Void> q() {
        h();
        return r0.n.s(this.f15148j);
    }

    public void r() {
        int iOrdinal = this.f15147i.ordinal();
        if (iOrdinal == 0) {
            this.f15147i = b.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.f15147i + " is not handled");
            }
            g0.r1.a("VideoEncoderSession", "terminateNow in " + this.f15147i + ", No-op");
            return;
        }
        this.f15147i = b.RELEASED;
        this.f15151m.c(this.f15142d);
        this.f15144f = null;
        if (this.f15142d == null) {
            g0.r1.l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f15149k.c(null);
            return;
        }
        g0.r1.a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f15142d);
        this.f15142d.a();
        this.f15142d.f().a(new Runnable() { // from class: f1.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15111a.f15149k.c(null);
            }
        }, this.b);
        this.f15142d = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f15144f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
