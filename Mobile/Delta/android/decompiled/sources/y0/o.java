package y0;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import g0.i0;
import g0.j2;
import g0.k0;
import g0.r1;
import g0.v2;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import x0.c0;
import x0.r0;

/* JADX INFO: loaded from: classes.dex */
public class o implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f36305a;
    public final HandlerThread b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f36306c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f36307d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f36308e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f36309f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f36310g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<j2, Surface> f36311h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f36312i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f36313j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static xt.n<k0, i0, i0, r0> f36314a = new xt.n() { // from class: y0.n
            @Override // xt.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((k0) obj, (i0) obj2, (i0) obj3);
            }
        };

        public static r0 a(k0 k0Var, i0 i0Var, i0 i0Var2) {
            return f36314a.invoke(k0Var, i0Var, i0Var2);
        }
    }

    public o(k0 k0Var, i0 i0Var, i0 i0Var2) {
        this(k0Var, Collections.EMPTY_MAP, i0Var, i0Var2);
    }

    public static /* synthetic */ void e(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f36309f) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    public static /* synthetic */ void f() {
    }

    public static /* synthetic */ void g(o oVar, SurfaceTexture surfaceTexture, Surface surface, v2.g gVar) {
        oVar.getClass();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        oVar.f36308e--;
        oVar.n();
    }

    public static /* synthetic */ void h(o oVar) {
        oVar.f36309f = true;
        oVar.n();
    }

    public static /* synthetic */ void i(o oVar, j2 j2Var, j2.b bVar) {
        oVar.getClass();
        j2Var.close();
        Surface surfaceRemove = oVar.f36311h.remove(j2Var);
        if (surfaceRemove != null) {
            oVar.f36305a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ void j(final o oVar, final j2 j2Var) {
        Surface surfaceR2 = j2Var.r2(oVar.f36306c, new x2.a() { // from class: y0.j
            @Override // x2.a
            public final void accept(Object obj) {
                o.i(this.f36300a, j2Var, (j2.b) obj);
            }
        });
        oVar.f36305a.j(surfaceR2);
        oVar.f36311h.put(j2Var, surfaceR2);
    }

    public static /* synthetic */ void k(final o oVar, v2 v2Var) {
        oVar.f36308e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f36305a.t(v2Var.u()));
        surfaceTexture.setDefaultBufferSize(v2Var.q().getWidth(), v2Var.q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v2Var.w(surface, oVar.f36306c, new x2.a() { // from class: y0.m
            @Override // x2.a
            public final void accept(Object obj) {
                o.g(this.f36303a, surfaceTexture, surface, (v2.g) obj);
            }
        });
        if (v2Var.u()) {
            oVar.f36312i = surfaceTexture;
        } else {
            oVar.f36313j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f36307d);
        }
    }

    public static /* synthetic */ void l(o oVar, k0 k0Var, Map map, y1.c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f36305a.h(k0Var, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object m(final o oVar, final k0 k0Var, final Map map, final y1.c.a aVar) {
        oVar.getClass();
        oVar.o(new Runnable() { // from class: y0.i
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                o.l(this.f36297a, k0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void n() {
        if (this.f36309f && this.f36308e == 0) {
            Iterator<j2> it = this.f36311h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f36311h.clear();
            this.f36305a.k();
            this.b.quit();
        }
    }

    private void o(Runnable runnable) {
        p(runnable, new Runnable() { // from class: y0.l
            @Override // java.lang.Runnable
            public final void run() {
                o.f();
            }
        });
    }

    private void p(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f36306c.execute(new Runnable() { // from class: y0.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.e(this.f36301a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            r1.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void q(final k0 k0Var, final Map<z0.d.e, c0> map) {
        try {
            y1.c.a(new y1.c.InterfaceC0665c() { // from class: y0.g
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return o.m(this.f36294a, k0Var, map, aVar);
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

    @Override // x0.r0
    public void a() {
        if (this.f36310g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: y0.e
            @Override // java.lang.Runnable
            public final void run() {
                o.h(this.f36292a);
            }
        });
    }

    @Override // g0.k2
    public void b(final v2 v2Var) {
        if (this.f36310g.get()) {
            v2Var.z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.f
            @Override // java.lang.Runnable
            public final void run() {
                o.k(this.f36293a, v2Var);
            }
        };
        Objects.requireNonNull(v2Var);
        p(runnable, new x0.p(v2Var));
    }

    @Override // g0.k2
    public void d(final j2 j2Var) {
        if (this.f36310g.get()) {
            j2Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.h
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f36296a, j2Var);
            }
        };
        Objects.requireNonNull(j2Var);
        p(runnable, new x0.n(j2Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f36310g.get() || (surfaceTexture2 = this.f36312i) == null || this.f36313j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f36313j.updateTexImage();
        for (Map.Entry<j2, Surface> entry : this.f36311h.entrySet()) {
            Surface value = entry.getValue();
            j2 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f36305a.v(surfaceTexture.getTimestamp(), value, key, this.f36312i, this.f36313j);
                } catch (RuntimeException e10) {
                    r1.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    public o(k0 k0Var, Map<z0.d.e, c0> map, i0 i0Var, i0 i0Var2) {
        this.f36308e = 0;
        this.f36309f = false;
        this.f36310g = new AtomicBoolean(false);
        this.f36311h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f36307d = handler;
        this.f36306c = q0.c.f(handler);
        this.f36305a = new c(i0Var, i0Var2);
        try {
            q(k0Var, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }
}
