package p562y0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import p140g0.C5894i0;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.InterfaceC5900j2;
import p366q0.C10417c;
import p531x0.InterfaceC12580c0;
import p531x0.InterfaceC12610r0;
import p531x0.RunnableC12601n;
import p531x0.RunnableC12605p;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;
import p590z0.C13675d;
import p615zt.InterfaceC14057n;

/* JADX INFO: renamed from: y0.o */
/* JADX INFO: loaded from: classes.dex */
public class C12991o implements InterfaceC12610r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final C12979c f45970a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f45971b;

    /* JADX INFO: renamed from: c */
    public final Executor f45972c;

    /* JADX INFO: renamed from: d */
    public final Handler f45973d;

    /* JADX INFO: renamed from: e */
    public int f45974e;

    /* JADX INFO: renamed from: f */
    public boolean f45975f;

    /* JADX INFO: renamed from: g */
    public final AtomicBoolean f45976g;

    /* JADX INFO: renamed from: h */
    public final Map<InterfaceC5900j2, Surface> f45977h;

    /* JADX INFO: renamed from: i */
    public SurfaceTexture f45978i;

    /* JADX INFO: renamed from: j */
    public SurfaceTexture f45979j;

    /* JADX INFO: renamed from: y0.o$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static InterfaceC14057n<C5902k0, C5894i0, C5894i0, InterfaceC12610r0> f45980a = new InterfaceC14057n() { // from class: y0.n
            @Override // p615zt.InterfaceC14057n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new C12991o((C5902k0) obj, (C5894i0) obj2, (C5894i0) obj3);
            }
        };

        /* JADX INFO: renamed from: a */
        public static InterfaceC12610r0 m48275a(C5902k0 c5902k0, C5894i0 c5894i0, C5894i0 c5894i1) {
            return f45980a.invoke(c5902k0, c5894i0, c5894i1);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12991o(C5902k0 c5902k0, C5894i0 c5894i0, C5894i0 c5894i1) {
        this(c5902k0, Collections.EMPTY_MAP, c5894i0, c5894i1);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m48262e(C12991o c12991o, Runnable runnable, Runnable runnable2) {
        if (c12991o.f45975f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m48263f() {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m48264g(C12991o c12991o, SurfaceTexture surfaceTexture, Surface surface, C5948v2.g gVar) {
        c12991o.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c12991o.f45974e--;
        c12991o.m48271n();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m48265h(C12991o c12991o) {
        c12991o.f45975f = true;
        c12991o.m48271n();
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m48266i(C12991o c12991o, InterfaceC5900j2 interfaceC5900j2, InterfaceC5900j2.b bVar) {
        c12991o.getClass();
        interfaceC5900j2.close();
        Surface surfaceRemove = c12991o.f45977h.remove(interfaceC5900j2);
        if (surfaceRemove != null) {
            c12991o.f45970a.m47040r(surfaceRemove);
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m48267j(final C12991o c12991o, final InterfaceC5900j2 interfaceC5900j2) {
        Surface surfaceMo26506q2 = interfaceC5900j2.mo26506q2(c12991o.f45972c, new InterfaceC12631a() { // from class: y0.j
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C12991o.m48266i(this.f45962a, interfaceC5900j2, (InterfaceC5900j2.b) obj);
            }
        });
        c12991o.f45970a.m47032j(surfaceMo26506q2);
        c12991o.f45977h.put(interfaceC5900j2, surfaceMo26506q2);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m48268k(final C12991o c12991o, C5948v2 c5948v2) {
        c12991o.f45974e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c12991o.f45970a.m48258t(c5948v2.m26659u()));
        surfaceTexture.setDefaultBufferSize(c5948v2.m26655q().getWidth(), c5948v2.m26655q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        c5948v2.m26661w(surface, c12991o.f45972c, new InterfaceC12631a() { // from class: y0.m
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C12991o.m48264g(this.f45967a, surfaceTexture, surface, (C5948v2.g) obj);
            }
        });
        if (c5948v2.m26659u()) {
            c12991o.f45978i = surfaceTexture;
        } else {
            c12991o.f45979j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(c12991o, c12991o.f45973d);
        }
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m48269l(C12991o c12991o, C5902k0 c5902k0, Map map, C12997c.a aVar) throws Throwable {
        c12991o.getClass();
        try {
            c12991o.f45970a.mo47030h(c5902k0, map);
            aVar.m48314c(null);
        } catch (RuntimeException e10) {
            aVar.m48317f(e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m48270m(final C12991o c12991o, final C5902k0 c5902k0, final Map map, final C12997c.a aVar) {
        c12991o.getClass();
        c12991o.m48272o(new Runnable() { // from class: y0.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C12991o.m48269l(this.f45958a, c5902k0, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: renamed from: n */
    private void m48271n() {
        if (this.f45975f && this.f45974e == 0) {
            Iterator<InterfaceC5900j2> it = this.f45977h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f45977h.clear();
            this.f45970a.mo47033k();
            this.f45971b.quit();
        }
    }

    /* JADX INFO: renamed from: o */
    private void m48272o(Runnable runnable) {
        m48273p(runnable, new Runnable() { // from class: y0.l
            @Override // java.lang.Runnable
            public final void run() {
                C12991o.m48263f();
            }
        });
    }

    /* JADX INFO: renamed from: p */
    private void m48273p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f45972c.execute(new Runnable() { // from class: y0.k
                @Override // java.lang.Runnable
                public final void run() {
                    C12991o.m48262e(this.f45964a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            C5931r1.m26573m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m48274q(final C5902k0 c5902k0, final Map<C13675d.e, InterfaceC12580c0> map) {
        try {
            C12997c.m48311a(new C12997c.c() { // from class: y0.g
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C12991o.m48270m(this.f45953a, c5902k0, map, aVar);
                }
            }).get();
        } catch (InterruptedException | ExecutionException e10) {
            e = e10;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (!(e instanceof RuntimeException)) {
                throw new IllegalStateException("Failed to create DefaultSurfaceProcessor", e);
            }
            throw ((RuntimeException) e);
        }
    }

    @Override // p531x0.InterfaceC12610r0
    /* JADX INFO: renamed from: a */
    public void mo46980a() {
        if (this.f45976g.getAndSet(true)) {
            return;
        }
        m48272o(new Runnable() { // from class: y0.e
            @Override // java.lang.Runnable
            public final void run() {
                C12991o.m48265h(this.f45950a);
            }
        });
    }

    @Override // p140g0.InterfaceC5904k2
    /* JADX INFO: renamed from: b */
    public void mo26520b(final C5948v2 c5948v2) {
        if (this.f45976g.get()) {
            c5948v2.m26664z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.f
            @Override // java.lang.Runnable
            public final void run() {
                C12991o.m48268k(this.f45951a, c5948v2);
            }
        };
        Objects.requireNonNull(c5948v2);
        m48273p(runnable, new RunnableC12605p(c5948v2));
    }

    @Override // p140g0.InterfaceC5904k2
    /* JADX INFO: renamed from: d */
    public void mo26521d(final InterfaceC5900j2 interfaceC5900j2) {
        if (this.f45976g.get()) {
            interfaceC5900j2.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.h
            @Override // java.lang.Runnable
            public final void run() {
                C12991o.m48267j(this.f45956a, interfaceC5900j2);
            }
        };
        Objects.requireNonNull(interfaceC5900j2);
        m48273p(runnable, new RunnableC12601n(interfaceC5900j2));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f45976g.get() || (surfaceTexture2 = this.f45978i) == null || this.f45979j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f45979j.updateTexImage();
        for (Map.Entry<InterfaceC5900j2, Surface> entry : this.f45977h.entrySet()) {
            Surface value = entry.getValue();
            InterfaceC5900j2 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f45970a.m48259v(surfaceTexture.getTimestamp(), value, key, this.f45978i, this.f45979j);
                } catch (RuntimeException e10) {
                    C5931r1.m26564d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12991o(C5902k0 c5902k0, Map<C13675d.e, InterfaceC12580c0> map, C5894i0 c5894i0, C5894i0 c5894i1) {
        this.f45974e = 0;
        this.f45975f = false;
        this.f45976g = new AtomicBoolean(false);
        this.f45977h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f45971b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f45973d = handler;
        this.f45972c = C10417c.m40085f(handler);
        this.f45970a = new C12979c(c5894i0, c5894i1);
        try {
            m48274q(c5902k0, map);
        } catch (RuntimeException e10) {
            mo46980a();
            throw e10;
        }
    }
}
