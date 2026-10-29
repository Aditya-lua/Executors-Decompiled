package p115f1;

import android.view.Surface;
import java.util.Objects;
import java.util.concurrent.Executor;
import ne.InterfaceFutureC9440x;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p282m1.AbstractC8383p1;
import p282m1.C8368k1;
import p282m1.InterfaceC8369l;
import p282m1.InterfaceC8378o;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;

/* JADX INFO: renamed from: f1.z1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5314z1 {

    /* JADX INFO: renamed from: a */
    public final Executor f20651a;

    /* JADX INFO: renamed from: b */
    public final Executor f20652b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8378o f20653c;

    /* JADX INFO: renamed from: d */
    public InterfaceC8369l f20654d = null;

    /* JADX INFO: renamed from: e */
    public Surface f20655e = null;

    /* JADX INFO: renamed from: f */
    public C5948v2 f20656f = null;

    /* JADX INFO: renamed from: g */
    public Executor f20657g = null;

    /* JADX INFO: renamed from: h */
    public InterfaceC8369l.c.a f20658h = null;

    /* JADX INFO: renamed from: i */
    public b f20659i = b.NOT_INITIALIZED;

    /* JADX INFO: renamed from: j */
    public InterfaceFutureC9440x<Void> f20660j = C10773n.m40991n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: k */
    public C12997c.a<Void> f20661k = null;

    /* JADX INFO: renamed from: l */
    public InterfaceFutureC9440x<InterfaceC8369l> f20662l = C10773n.m40991n(new IllegalStateException("Cannot close the encoder before configuring."));

    /* JADX INFO: renamed from: m */
    public C12997c.a<InterfaceC8369l> f20663m = null;

    /* JADX INFO: renamed from: f1.z1$a */
    public class a implements InterfaceC10762c<InterfaceC8369l> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(InterfaceC8369l interfaceC8369l) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C5931r1.m26573m("VideoEncoderSession", "VideoEncoder configuration failed.", th2);
            C5314z1.this.m24622r();
        }
    }

    /* JADX INFO: renamed from: f1.z1$b */
    public enum b {
        NOT_INITIALIZED,
        INITIALIZING,
        PENDING_RELEASE,
        READY,
        RELEASED
    }

    public C5314z1(InterfaceC8378o interfaceC8378o, Executor executor, Executor executor2) {
        this.f20651a = executor2;
        this.f20652b = executor;
        this.f20653c = interfaceC8378o;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m24607c(C5314z1 c5314z1, C12997c.a aVar) {
        c5314z1.f20661k = aVar;
        return "ReleasedFuture " + c5314z1;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m24609e(C5314z1 c5314z1, C12997c.a aVar) {
        c5314z1.f20663m = aVar;
        return "ReadyToReleaseFuture " + c5314z1;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m24610f(C5314z1 c5314z1, C5948v2 c5948v2, AbstractC8383p1 abstractC8383p1, C12997c.a aVar) {
        c5314z1.m24614j(c5948v2, abstractC8383p1, aVar);
        return "ConfigureVideoEncoderFuture " + c5314z1;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m24611g(final C5314z1 c5314z1, C12997c.a aVar, C5948v2 c5948v2, final Surface surface) {
        Executor executor;
        int iOrdinal = c5314z1.f20659i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (c5948v2.m26660v()) {
                    C5931r1.m26561a("VideoEncoderSession", "Not provide surface, " + Objects.toString(c5948v2, "EMPTY") + " is already serviced.");
                    aVar.m48314c(null);
                    c5314z1.m24612h();
                    return;
                }
                c5314z1.f20655e = surface;
                C5931r1.m26561a("VideoEncoderSession", "provide surface: " + surface);
                c5948v2.m26661w(surface, c5314z1.f20652b, new InterfaceC12631a() { // from class: f1.s1
                    @Override // p533x2.InterfaceC12631a
                    public final void accept(Object obj) {
                        this.f20606a.m24619o((C5948v2.g) obj);
                    }
                });
                c5314z1.f20659i = b.READY;
                aVar.m48314c(c5314z1.f20654d);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    if (c5314z1.f20658h != null && (executor = c5314z1.f20657g) != null) {
                        executor.execute(new Runnable() { // from class: f1.t1
                            @Override // java.lang.Runnable
                            public final void run() {
                                this.f20609a.f20658h.mo24320a(surface);
                            }
                        });
                    }
                    C5931r1.m26572l("VideoEncoderSession", "Surface is updated in READY state: " + surface);
                    return;
                }
                if (iOrdinal != 4) {
                    throw new IllegalStateException("State " + c5314z1.f20659i + " is not handled");
                }
            }
        }
        C5931r1.m26561a("VideoEncoderSession", "Not provide surface in " + c5314z1.f20659i);
        aVar.m48314c(null);
    }

    /* JADX INFO: renamed from: h */
    public final void m24612h() {
        int iOrdinal = this.f20659i.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            m24622r();
            return;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            C5931r1.m26561a("VideoEncoderSession", "closeInternal in " + this.f20659i + " state");
            this.f20659i = b.PENDING_RELEASE;
            return;
        }
        if (iOrdinal == 4) {
            C5931r1.m26561a("VideoEncoderSession", "closeInternal in RELEASED state, No-op");
            return;
        }
        throw new IllegalStateException("State " + this.f20659i + " is not handled");
    }

    /* JADX INFO: renamed from: i */
    public InterfaceFutureC9440x<InterfaceC8369l> m24613i(final C5948v2 c5948v2, final AbstractC8383p1 abstractC8383p1) {
        if (this.f20659i.ordinal() != 0) {
            return C10773n.m40991n(new IllegalStateException("configure() shouldn't be called in " + this.f20659i));
        }
        this.f20659i = b.INITIALIZING;
        this.f20656f = c5948v2;
        C5931r1.m26561a("VideoEncoderSession", "Create VideoEncoderSession: " + this);
        this.f20660j = C12997c.m48311a(new C12997c.c() { // from class: f1.v1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5314z1.m24607c(this.f20617a, aVar);
            }
        });
        this.f20662l = C12997c.m48311a(new C12997c.c() { // from class: f1.w1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5314z1.m24609e(this.f20628a, aVar);
            }
        });
        InterfaceFutureC9440x interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: f1.x1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5314z1.m24610f(this.f20639a, c5948v2, abstractC8383p1, aVar);
            }
        });
        C10773n.m40987j(interfaceFutureC9440xM48311a, new a(), this.f20652b);
        return C10773n.m40996s(interfaceFutureC9440xM48311a);
    }

    /* JADX INFO: renamed from: j */
    public final void m24614j(final C5948v2 c5948v2, AbstractC8383p1 abstractC8383p1, final C12997c.a<InterfaceC8369l> aVar) {
        try {
            InterfaceC8369l interfaceC8369lMo24327a = this.f20653c.mo24327a(this.f20651a, abstractC8383p1, c5948v2.m26656r());
            this.f20654d = interfaceC8369lMo24327a;
            InterfaceC8369l.b bVarMo33989b = interfaceC8369lMo24327a.mo33989b();
            if (bVarMo33989b instanceof InterfaceC8369l.c) {
                ((InterfaceC8369l.c) bVarMo33989b).mo34042a(this.f20652b, new InterfaceC8369l.c.a() { // from class: f1.y1
                    @Override // p282m1.InterfaceC8369l.c.a
                    /* JADX INFO: renamed from: a */
                    public final void mo24320a(Surface surface) {
                        C5314z1.m24611g(this.f20645a, aVar, c5948v2, surface);
                    }
                });
            } else {
                aVar.m48317f(new AssertionError("The EncoderInput of video isn't a SurfaceInput."));
            }
        } catch (C8368k1 e10) {
            C5931r1.m26564d("VideoEncoderSession", "Unable to initialize video encoder.", e10);
            aVar.m48317f(e10);
        }
    }

    /* JADX INFO: renamed from: k */
    public Surface m24615k() {
        if (this.f20659i != b.READY) {
            return null;
        }
        return this.f20655e;
    }

    /* JADX INFO: renamed from: l */
    public InterfaceFutureC9440x<InterfaceC8369l> m24616l() {
        return C10773n.m40996s(this.f20662l);
    }

    /* JADX INFO: renamed from: m */
    public InterfaceC8369l m24617m() {
        return this.f20654d;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0034  */
    /* JADX WARN: Code duplicated, block: B:17:0x0038 A[RETURN] */
    /* JADX INFO: renamed from: n */
    public boolean m24618n(C5948v2 c5948v2) {
        int iOrdinal = this.f20659i.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                if (this.f20656f == c5948v2) {
                    return true;
                }
            } else if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    if (iOrdinal != 4) {
                        throw new IllegalStateException("State " + this.f20659i + " is not handled");
                    }
                } else if (this.f20656f == c5948v2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m24619o(C5948v2.g gVar) {
        C5931r1.m26561a("VideoEncoderSession", "Surface can be closed: " + gVar.mo26500b().hashCode());
        Surface surfaceMo26500b = gVar.mo26500b();
        if (surfaceMo26500b != this.f20655e) {
            surfaceMo26500b.release();
            return;
        }
        this.f20655e = null;
        this.f20663m.m48314c(this.f20654d);
        m24612h();
    }

    /* JADX INFO: renamed from: p */
    public void m24620p(Executor executor, InterfaceC8369l.c.a aVar) {
        this.f20657g = executor;
        this.f20658h = aVar;
    }

    /* JADX INFO: renamed from: q */
    public InterfaceFutureC9440x<Void> m24621q() {
        m24612h();
        return C10773n.m40996s(this.f20660j);
    }

    /* JADX INFO: renamed from: r */
    public void m24622r() {
        int iOrdinal = this.f20659i.ordinal();
        if (iOrdinal == 0) {
            this.f20659i = b.RELEASED;
            return;
        }
        if (iOrdinal != 1 && iOrdinal != 2 && iOrdinal != 3) {
            if (iOrdinal != 4) {
                throw new IllegalStateException("State " + this.f20659i + " is not handled");
            }
            C5931r1.m26561a("VideoEncoderSession", "terminateNow in " + this.f20659i + ", No-op");
            return;
        }
        this.f20659i = b.RELEASED;
        this.f20663m.m48314c(this.f20654d);
        this.f20656f = null;
        if (this.f20654d == null) {
            C5931r1.m26572l("VideoEncoderSession", "There's no VideoEncoder to release! Finish release completer.");
            this.f20661k.m48314c(null);
            return;
        }
        C5931r1.m26561a("VideoEncoderSession", "VideoEncoder is releasing: " + this.f20654d);
        this.f20654d.mo33987a();
        this.f20654d.mo33997f().mo37173a(new Runnable() { // from class: f1.u1
            @Override // java.lang.Runnable
            public final void run() {
                this.f20615a.f20661k.m48314c(null);
            }
        }, this.f20652b);
        this.f20654d = null;
    }

    public String toString() {
        return "VideoEncoderSession@" + hashCode() + " for " + Objects.toString(this.f20656f, "SURFACE_REQUEST_NOT_CONFIGURED");
    }
}
