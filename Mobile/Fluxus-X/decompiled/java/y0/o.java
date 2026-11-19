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
    public final c f37144a;
    public final HandlerThread b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f37145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f37146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f37147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f37149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<j2, Surface> f37150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public SurfaceTexture f37151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public SurfaceTexture f37152j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static pu.n<k0, i0, i0, r0> f37153a = new pu.n() { // from class: y0.n
            @Override // pu.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return new o((k0) obj, (i0) obj2, (i0) obj3);
            }
        };

        public static r0 a(k0 k0Var, i0 i0Var, i0 i0Var2) {
            return f37153a.invoke(k0Var, i0Var, i0Var2);
        }
    }

    public o(k0 k0Var, i0 i0Var, i0 i0Var2) {
        this(k0Var, Collections.EMPTY_MAP, i0Var, i0Var2);
    }

    public static /* synthetic */ void e(o oVar, Runnable runnable, Runnable runnable2) {
        if (oVar.f37148f) {
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
        oVar.f37147e--;
        oVar.n();
    }

    public static /* synthetic */ void h(o oVar) {
        oVar.f37148f = true;
        oVar.n();
    }

    public static /* synthetic */ void i(o oVar, j2 j2Var, j2.b bVar) {
        oVar.getClass();
        j2Var.close();
        Surface surfaceRemove = oVar.f37150h.remove(j2Var);
        if (surfaceRemove != null) {
            oVar.f37144a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ void j(final o oVar, final j2 j2Var) {
        Surface surfaceT2 = j2Var.t2(oVar.f37145c, new x2.a() { // from class: y0.j
            @Override // x2.a
            public final void accept(Object obj) {
                o.i(this.f37139a, j2Var, (j2.b) obj);
            }
        });
        oVar.f37144a.j(surfaceT2);
        oVar.f37150h.put(j2Var, surfaceT2);
    }

    public static /* synthetic */ void k(final o oVar, v2 v2Var) {
        oVar.f37147e++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(oVar.f37144a.t(v2Var.u()));
        surfaceTexture.setDefaultBufferSize(v2Var.q().getWidth(), v2Var.q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v2Var.w(surface, oVar.f37145c, new x2.a() { // from class: y0.m
            @Override // x2.a
            public final void accept(Object obj) {
                o.g(this.f37142a, surfaceTexture, surface, (v2.g) obj);
            }
        });
        if (v2Var.u()) {
            oVar.f37151i = surfaceTexture;
        } else {
            oVar.f37152j = surfaceTexture;
            surfaceTexture.setOnFrameAvailableListener(oVar, oVar.f37146d);
        }
    }

    public static /* synthetic */ void l(o oVar, k0 k0Var, Map map, y1.c.a aVar) throws Throwable {
        oVar.getClass();
        try {
            oVar.f37144a.h(k0Var, map);
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
                o.l(this.f37136a, k0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    private void n() {
        if (this.f37148f && this.f37147e == 0) {
            Iterator<j2> it = this.f37150h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            this.f37150h.clear();
            this.f37144a.k();
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
            this.f37145c.execute(new Runnable() { // from class: y0.k
                @Override // java.lang.Runnable
                public final void run() {
                    o.e(this.f37140a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            r1.m("DualSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    private void q(final k0 k0Var, final Map<z0.d.e, c0> map) {
        try {
            y1.c.a(new y1.c.InterfaceC0761c() { // from class: y0.g
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return o.m(this.f37133a, k0Var, map, aVar);
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
        if (this.f37149g.getAndSet(true)) {
            return;
        }
        o(new Runnable() { // from class: y0.e
            @Override // java.lang.Runnable
            public final void run() {
                o.h(this.f37131a);
            }
        });
    }

    @Override // g0.k2
    public void b(final v2 v2Var) {
        if (this.f37149g.get()) {
            v2Var.z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.f
            @Override // java.lang.Runnable
            public final void run() {
                o.k(this.f37132a, v2Var);
            }
        };
        Objects.requireNonNull(v2Var);
        p(runnable, new x0.p(v2Var));
    }

    @Override // g0.k2
    public void d(final j2 j2Var) {
        if (this.f37149g.get()) {
            j2Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: y0.h
            @Override // java.lang.Runnable
            public final void run() {
                o.j(this.f37135a, j2Var);
            }
        };
        Objects.requireNonNull(j2Var);
        p(runnable, new x0.n(j2Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        SurfaceTexture surfaceTexture2;
        if (this.f37149g.get() || (surfaceTexture2 = this.f37151i) == null || this.f37152j == null) {
            return;
        }
        surfaceTexture2.updateTexImage();
        this.f37152j.updateTexImage();
        for (Map.Entry<j2, Surface> entry : this.f37150h.entrySet()) {
            Surface value = entry.getValue();
            j2 key = entry.getKey();
            if (key.getFormat() == 34) {
                try {
                    this.f37144a.v(surfaceTexture.getTimestamp(), value, key, this.f37151i, this.f37152j);
                } catch (RuntimeException e10) {
                    r1.d("DualSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            }
        }
    }

    public o(k0 k0Var, Map<z0.d.e, c0> map, i0 i0Var, i0 i0Var2) {
        this.f37147e = 0;
        this.f37148f = false;
        this.f37149g = new AtomicBoolean(false);
        this.f37150h = new LinkedHashMap();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f37146d = handler;
        this.f37145c = q0.c.f(handler);
        this.f37144a = new c(i0Var, i0Var2);
        try {
            q(k0Var, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }
}
