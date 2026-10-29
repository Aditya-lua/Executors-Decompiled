package x0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import g0.j2;
import g0.r1;
import g0.v2;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class t implements r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f34638a;
    public final HandlerThread b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f34639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Handler f34640d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f34641e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f34642f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f34643g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map<j2, Surface> f34644h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f34645i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f34646j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List<b> f34647k;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static t.a<g0.k0, r0> f34648a = new t.a() { // from class: x0.s
            @Override // t.a
            public final Object apply(Object obj) {
                return new t((g0.k0) obj);
            }
        };

        public static r0 a(g0.k0 k0Var) {
            return f34648a.apply(k0Var);
        }
    }

    public static abstract class b {
        public static x0.a d(int i10, int i11, y1.c.a<Void> aVar) {
            return new x0.a(i10, i11, aVar);
        }

        public abstract y1.c.a<Void> a();

        public abstract int b();

        public abstract int c();
    }

    public t(g0.k0 k0Var) {
        this(k0Var, Collections.EMPTY_MAP);
    }

    public static /* synthetic */ void f(t tVar, v2 v2Var, SurfaceTexture surfaceTexture, Surface surface, v2.g gVar) {
        tVar.getClass();
        v2Var.l();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        tVar.f34645i--;
        tVar.r();
    }

    public static /* synthetic */ void g(t tVar) {
        tVar.f34646j = true;
        tVar.r();
    }

    public static /* synthetic */ void h(t tVar, g0.k0 k0Var, Map map, y1.c.a aVar) throws Throwable {
        tVar.getClass();
        try {
            tVar.f34638a.h(k0Var, map);
            aVar.c(null);
        } catch (RuntimeException e10) {
            aVar.f(e10);
        }
    }

    public static /* synthetic */ Object i(final t tVar, int i10, int i11, final y1.c.a aVar) {
        tVar.getClass();
        final x0.a aVarD = b.d(i10, i11, aVar);
        tVar.t(new Runnable() { // from class: x0.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f34585a.f34647k.add(aVarD);
            }
        }, new Runnable() { // from class: x0.k
            @Override // java.lang.Runnable
            public final void run() {
                aVar.f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    public static /* synthetic */ void j(t tVar, v2 v2Var, v2.h hVar) {
        tVar.getClass();
        z0.d.e eVar = z0.d.e.DEFAULT;
        if (v2Var.o().d() && hVar.e()) {
            eVar = z0.d.e.YUV;
        }
        tVar.f34638a.o(eVar);
    }

    public static /* synthetic */ void k(final t tVar, final j2 j2Var) {
        Surface surfaceQ2 = j2Var.q2(tVar.f34639c, new x2.a() { // from class: x0.r
            @Override // x2.a
            public final void accept(Object obj) {
                t.l(this.f34635a, j2Var, (j2.b) obj);
            }
        });
        tVar.f34638a.j(surfaceQ2);
        tVar.f34644h.put(j2Var, surfaceQ2);
    }

    public static /* synthetic */ void l(t tVar, j2 j2Var, j2.b bVar) {
        tVar.getClass();
        j2Var.close();
        Surface surfaceRemove = tVar.f34644h.remove(j2Var);
        if (surfaceRemove != null) {
            tVar.f34638a.r(surfaceRemove);
        }
    }

    public static /* synthetic */ Object m(final t tVar, final g0.k0 k0Var, final Map map, final y1.c.a aVar) {
        tVar.getClass();
        tVar.s(new Runnable() { // from class: x0.g
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                t.h(this.f34573a, k0Var, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    public static /* synthetic */ void n() {
    }

    public static /* synthetic */ void p(final t tVar, final v2 v2Var) {
        tVar.f34645i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(tVar.f34638a.g());
        surfaceTexture.setDefaultBufferSize(v2Var.q().getWidth(), v2Var.q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        v2Var.x(tVar.f34639c, new v2.i() { // from class: x0.e
            @Override // g0.v2.i
            public final void a(v2.h hVar) {
                t.j(this.f34567a, v2Var, hVar);
            }
        });
        v2Var.w(surface, tVar.f34639c, new x2.a() { // from class: x0.f
            @Override // x2.a
            public final void accept(Object obj) {
                t.f(this.f34569a, v2Var, surfaceTexture, surface, (v2.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(tVar, tVar.f34640d);
    }

    public static /* synthetic */ void q(t tVar, Runnable runnable, Runnable runnable2) {
        if (tVar.f34646j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @Override // x0.r0
    public void a() {
        if (this.f34641e.getAndSet(true)) {
            return;
        }
        s(new Runnable() { // from class: x0.q
            @Override // java.lang.Runnable
            public final void run() {
                t.g(this.f34617a);
            }
        });
    }

    @Override // g0.k2
    public void b(final v2 v2Var) {
        if (this.f34641e.get()) {
            v2Var.z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: x0.o
            @Override // java.lang.Runnable
            public final void run() {
                t.p(this.f34613a, v2Var);
            }
        };
        Objects.requireNonNull(v2Var);
        t(runnable, new p(v2Var));
    }

    @Override // x0.r0
    public me.x<Void> c(final int i10, final int i11) {
        return r0.n.s(y1.c.a(new y1.c.InterfaceC0650c() { // from class: x0.d
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return t.i(this.f34564a, i10, i11, aVar);
            }
        }));
    }

    @Override // g0.k2
    public void d(final j2 j2Var) {
        if (this.f34641e.get()) {
            j2Var.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: x0.m
            @Override // java.lang.Runnable
            public final void run() {
                t.k(this.f34592a, j2Var);
            }
        };
        Objects.requireNonNull(j2Var);
        t(runnable, new n(j2Var));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f34641e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f34642f);
        jt.r<Surface, Size, float[]> rVar = null;
        for (Map.Entry<j2, Surface> entry : this.f34644h.entrySet()) {
            Surface value = entry.getValue();
            j2 key = entry.getKey();
            key.N1(this.f34643g, this.f34642f);
            if (key.getFormat() == 34) {
                try {
                    this.f34638a.n(surfaceTexture.getTimestamp(), this.f34643g, value);
                } catch (RuntimeException e10) {
                    r1.d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                x2.g.j(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                x2.g.j(rVar == null, "Only one JPEG output is supported.");
                rVar = new jt.r<>(value, key.i(), (float[]) this.f34643g.clone());
            }
        }
        try {
            x(rVar);
        } catch (RuntimeException e11) {
            u(e11);
        }
    }

    public final void r() {
        if (this.f34646j && this.f34645i == 0) {
            Iterator<j2> it = this.f34644h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f34647k.iterator();
            while (it2.hasNext()) {
                it2.next().a().f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f34644h.clear();
            this.f34638a.k();
            this.b.quit();
        }
    }

    public final void s(Runnable runnable) {
        t(runnable, new Runnable() { // from class: x0.h
            @Override // java.lang.Runnable
            public final void run() {
                t.n();
            }
        });
    }

    public final void t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f34639c.execute(new Runnable() { // from class: x0.i
                @Override // java.lang.Runnable
                public final void run() {
                    t.q(this.f34582a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            r1.m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    public final void u(Throwable th2) {
        Iterator<b> it = this.f34647k.iterator();
        while (it.hasNext()) {
            it.next().a().f(th2);
        }
        this.f34647k.clear();
    }

    public final Bitmap v(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        p0.t.c(fArr2, i10, 0.5f, 0.5f);
        p0.t.d(fArr2, 0.5f);
        return this.f34638a.p(p0.a0.q(size, i10), fArr2);
    }

    public final void w(final g0.k0 k0Var, final Map<z0.d.e, c0> map) {
        try {
            y1.c.a(new y1.c.InterfaceC0650c() { // from class: x0.l
                @Override // y1.c.InterfaceC0650c
                public final Object a(y1.c.a aVar) {
                    return t.m(this.f34589a, k0Var, map, aVar);
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

    public final void x(jt.r<Surface, Size, float[]> rVar) {
        if (this.f34647k.isEmpty()) {
            return;
        }
        if (rVar == null) {
            u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f34647k.iterator();
                int iC = -1;
                int iB = -1;
                Bitmap bitmapV = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (iC != next.c() || bitmapV == null) {
                        iC = next.c();
                        if (bitmapV != null) {
                            bitmapV.recycle();
                        }
                        bitmapV = v(rVar.e(), rVar.f(), iC);
                        iB = -1;
                    }
                    if (iB != next.b()) {
                        byteArrayOutputStream.reset();
                        iB = next.b();
                        bitmapV.compress(Bitmap.CompressFormat.JPEG, iB, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surfaceD = rVar.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.q(surfaceD, byteArray);
                    next.a().c(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th2) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        } catch (IOException e10) {
            u(e10);
        }
    }

    public t(g0.k0 k0Var, Map<z0.d.e, c0> map) {
        this.f34641e = new AtomicBoolean(false);
        this.f34642f = new float[16];
        this.f34643g = new float[16];
        this.f34644h = new LinkedHashMap();
        this.f34645i = 0;
        this.f34646j = false;
        this.f34647k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f34640d = handler;
        this.f34639c = q0.c.f(handler);
        this.f34638a = new z();
        try {
            w(k0Var, map);
        } catch (RuntimeException e10) {
            a();
            throw e10;
        }
    }
}
