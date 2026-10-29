package p531x0;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
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
import ne.InterfaceFutureC9440x;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.InterfaceC5900j2;
import p229jt.C7351r;
import p347p0.C10085a0;
import p347p0.C10104t;
import p366q0.C10417c;
import p397r0.C10773n;
import p436t.InterfaceC11464a;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;
import p563y1.C12997c;
import p590z0.C13675d;

/* JADX INFO: renamed from: x0.t */
/* JADX INFO: loaded from: classes.dex */
public class C12613t implements InterfaceC12610r0, SurfaceTexture.OnFrameAvailableListener {

    /* JADX INFO: renamed from: a */
    public final C12625z f44900a;

    /* JADX INFO: renamed from: b */
    public final HandlerThread f44901b;

    /* JADX INFO: renamed from: c */
    public final Executor f44902c;

    /* JADX INFO: renamed from: d */
    public final Handler f44903d;

    /* JADX INFO: renamed from: e */
    public final AtomicBoolean f44904e;

    /* JADX INFO: renamed from: f */
    public final float[] f44905f;

    /* JADX INFO: renamed from: g */
    public final float[] f44906g;

    /* JADX INFO: renamed from: h */
    public final Map<InterfaceC5900j2, Surface> f44907h;

    /* JADX INFO: renamed from: i */
    public int f44908i;

    /* JADX INFO: renamed from: j */
    public boolean f44909j;

    /* JADX INFO: renamed from: k */
    public final List<b> f44910k;

    /* JADX INFO: renamed from: x0.t$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        public static InterfaceC11464a<C5902k0, InterfaceC12610r0> f44911a = new InterfaceC11464a() { // from class: x0.s
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return new C12613t((C5902k0) obj);
            }
        };

        /* JADX INFO: renamed from: a */
        public static InterfaceC12610r0 m47002a(C5902k0 c5902k0) {
            return f44911a.apply(c5902k0);
        }
    }

    /* JADX INFO: renamed from: x0.t$b */
    public static abstract class b {
        /* JADX INFO: renamed from: d */
        public static C12575a m47003d(int i10, int i11, C12997c.a<Void> aVar) {
            return new C12575a(i10, i11, aVar);
        }

        /* JADX INFO: renamed from: a */
        public abstract C12997c.a<Void> mo46924a();

        /* JADX INFO: renamed from: b */
        public abstract int mo46925b();

        /* JADX INFO: renamed from: c */
        public abstract int mo46926c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C12613t(C5902k0 c5902k0) {
        this(c5902k0, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m46983f(C12613t c12613t, C5948v2 c5948v2, SurfaceTexture surfaceTexture, Surface surface, C5948v2.g gVar) {
        c12613t.getClass();
        c5948v2.m26650l();
        surfaceTexture.setOnFrameAvailableListener(null);
        surfaceTexture.release();
        surface.release();
        c12613t.f44908i--;
        c12613t.m46995r();
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m46984g(C12613t c12613t) {
        c12613t.f44909j = true;
        c12613t.m46995r();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m46985h(C12613t c12613t, C5902k0 c5902k0, Map map, C12997c.a aVar) throws Throwable {
        c12613t.getClass();
        try {
            c12613t.f44900a.mo47030h(c5902k0, map);
            aVar.m48314c(null);
        } catch (RuntimeException e10) {
            aVar.m48317f(e10);
        }
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m46986i(final C12613t c12613t, int i10, int i11, final C12997c.a aVar) {
        c12613t.getClass();
        final C12575a c12575aM47003d = b.m47003d(i10, i11, aVar);
        c12613t.m46997t(new Runnable() { // from class: x0.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f44838a.f44910k.add(c12575aM47003d);
            }
        }, new Runnable() { // from class: x0.k
            @Override // java.lang.Runnable
            public final void run() {
                aVar.m48317f(new Exception("Failed to snapshot: OpenGLRenderer not ready."));
            }
        });
        return "DefaultSurfaceProcessor#snapshot";
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m46987j(C12613t c12613t, C5948v2 c5948v2, C5948v2.h hVar) {
        c12613t.getClass();
        C13675d.e eVar = C13675d.e.DEFAULT;
        if (c5948v2.m26653o().m26518d() && hVar.mo26513e()) {
            eVar = C13675d.e.YUV;
        }
        c12613t.f44900a.m47037o(eVar);
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m46988k(final C12613t c12613t, final InterfaceC5900j2 interfaceC5900j2) {
        Surface surfaceMo26506q2 = interfaceC5900j2.mo26506q2(c12613t.f44902c, new InterfaceC12631a() { // from class: x0.r
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C12613t.m46989l(this.f44895a, interfaceC5900j2, (InterfaceC5900j2.b) obj);
            }
        });
        c12613t.f44900a.m47032j(surfaceMo26506q2);
        c12613t.f44907h.put(interfaceC5900j2, surfaceMo26506q2);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m46989l(C12613t c12613t, InterfaceC5900j2 interfaceC5900j2, InterfaceC5900j2.b bVar) {
        c12613t.getClass();
        interfaceC5900j2.close();
        Surface surfaceRemove = c12613t.f44907h.remove(interfaceC5900j2);
        if (surfaceRemove != null) {
            c12613t.f44900a.m47040r(surfaceRemove);
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ Object m46990m(final C12613t c12613t, final C5902k0 c5902k0, final Map map, final C12997c.a aVar) {
        c12613t.getClass();
        c12613t.m46996s(new Runnable() { // from class: x0.g
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                C12613t.m46985h(this.f44822a, c5902k0, map, aVar);
            }
        });
        return "Init GlRenderer";
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m46991n() {
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m46993p(final C12613t c12613t, final C5948v2 c5948v2) {
        c12613t.f44908i++;
        final SurfaceTexture surfaceTexture = new SurfaceTexture(c12613t.f44900a.m47029g());
        surfaceTexture.setDefaultBufferSize(c5948v2.m26655q().getWidth(), c5948v2.m26655q().getHeight());
        final Surface surface = new Surface(surfaceTexture);
        c5948v2.m26662x(c12613t.f44902c, new C5948v2.i() { // from class: x0.e
            @Override // p140g0.C5948v2.i
            /* JADX INFO: renamed from: a */
            public final void mo24343a(C5948v2.h hVar) {
                C12613t.m46987j(this.f44814a, c5948v2, hVar);
            }
        });
        c5948v2.m26661w(surface, c12613t.f44902c, new InterfaceC12631a() { // from class: x0.f
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C12613t.m46983f(this.f44817a, c5948v2, surfaceTexture, surface, (C5948v2.g) obj);
            }
        });
        surfaceTexture.setOnFrameAvailableListener(c12613t, c12613t.f44903d);
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m46994q(C12613t c12613t, Runnable runnable, Runnable runnable2) {
        if (c12613t.f44909j) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    @Override // p531x0.InterfaceC12610r0
    /* JADX INFO: renamed from: a */
    public void mo46980a() {
        if (this.f44904e.getAndSet(true)) {
            return;
        }
        m46996s(new Runnable() { // from class: x0.q
            @Override // java.lang.Runnable
            public final void run() {
                C12613t.m46984g(this.f44876a);
            }
        });
    }

    @Override // p140g0.InterfaceC5904k2
    /* JADX INFO: renamed from: b */
    public void mo26520b(final C5948v2 c5948v2) {
        if (this.f44904e.get()) {
            c5948v2.m26664z();
            return;
        }
        Runnable runnable = new Runnable() { // from class: x0.o
            @Override // java.lang.Runnable
            public final void run() {
                C12613t.m46993p(this.f44870a, c5948v2);
            }
        };
        Objects.requireNonNull(c5948v2);
        m46997t(runnable, new RunnableC12605p(c5948v2));
    }

    @Override // p531x0.InterfaceC12610r0
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC9440x<Void> mo46981c(final int i10, final int i11) {
        return C10773n.m40996s(C12997c.m48311a(new C12997c.c() { // from class: x0.d
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C12613t.m46986i(this.f44810a, i10, i11, aVar);
            }
        }));
    }

    @Override // p140g0.InterfaceC5904k2
    /* JADX INFO: renamed from: d */
    public void mo26521d(final InterfaceC5900j2 interfaceC5900j2) {
        if (this.f44904e.get()) {
            interfaceC5900j2.close();
            return;
        }
        Runnable runnable = new Runnable() { // from class: x0.m
            @Override // java.lang.Runnable
            public final void run() {
                C12613t.m46988k(this.f44847a, interfaceC5900j2);
            }
        };
        Objects.requireNonNull(interfaceC5900j2);
        m46997t(runnable, new RunnableC12601n(interfaceC5900j2));
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.f44904e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        surfaceTexture.getTransformMatrix(this.f44905f);
        C7351r<Surface, Size, float[]> c7351r = null;
        for (Map.Entry<InterfaceC5900j2, Surface> entry : this.f44907h.entrySet()) {
            Surface value = entry.getValue();
            InterfaceC5900j2 key = entry.getKey();
            key.mo26503N1(this.f44906g, this.f44905f);
            if (key.getFormat() == 34) {
                try {
                    this.f44900a.m47036n(surfaceTexture.getTimestamp(), this.f44906g, value);
                } catch (RuntimeException e10) {
                    C5931r1.m26564d("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e10);
                }
            } else {
                C12637g.m47078j(key.getFormat() == 256, "Unsupported format: " + key.getFormat());
                C12637g.m47078j(c7351r == null, "Only one JPEG output is supported.");
                c7351r = new C7351r<>(value, key.mo26505i(), (float[]) this.f44906g.clone());
            }
        }
        try {
            m47001x(c7351r);
        } catch (RuntimeException e11) {
            m46998u(e11);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m46995r() {
        if (this.f44909j && this.f44908i == 0) {
            Iterator<InterfaceC5900j2> it = this.f44907h.keySet().iterator();
            while (it.hasNext()) {
                it.next().close();
            }
            Iterator<b> it2 = this.f44910k.iterator();
            while (it2.hasNext()) {
                it2.next().mo46924a().m48317f(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            this.f44907h.clear();
            this.f44900a.mo47033k();
            this.f44901b.quit();
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m46996s(Runnable runnable) {
        m46997t(runnable, new Runnable() { // from class: x0.h
            @Override // java.lang.Runnable
            public final void run() {
                C12613t.m46991n();
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final void m46997t(final Runnable runnable, final Runnable runnable2) {
        try {
            this.f44902c.execute(new Runnable() { // from class: x0.i
                @Override // java.lang.Runnable
                public final void run() {
                    C12613t.m46994q(this.f44834a, runnable2, runnable);
                }
            });
        } catch (RejectedExecutionException e10) {
            C5931r1.m26573m("DefaultSurfaceProcessor", "Unable to executor runnable", e10);
            runnable2.run();
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m46998u(Throwable th2) {
        Iterator<b> it = this.f44910k.iterator();
        while (it.hasNext()) {
            it.next().mo46924a().m48317f(th2);
        }
        this.f44910k.clear();
    }

    /* JADX INFO: renamed from: v */
    public final Bitmap m46999v(Size size, float[] fArr, int i10) {
        float[] fArr2 = (float[]) fArr.clone();
        C10104t.m39000c(fArr2, i10, 0.5f, 0.5f);
        C10104t.m39001d(fArr2, 0.5f);
        return this.f44900a.m47038p(C10085a0.m38889q(size, i10), fArr2);
    }

    /* JADX INFO: renamed from: w */
    public final void m47000w(final C5902k0 c5902k0, final Map<C13675d.e, InterfaceC12580c0> map) {
        try {
            C12997c.m48311a(new C12997c.c() { // from class: x0.l
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C12613t.m46990m(this.f44843a, c5902k0, map, aVar);
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

    /* JADX INFO: renamed from: x */
    public final void m47001x(C7351r<Surface, Size, float[]> c7351r) {
        if (this.f44910k.isEmpty()) {
            return;
        }
        if (c7351r == null) {
            m46998u(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator<b> it = this.f44910k.iterator();
                int iMo46926c = -1;
                int iMo46925b = -1;
                Bitmap bitmapM46999v = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    b next = it.next();
                    if (iMo46926c != next.mo46926c() || bitmapM46999v == null) {
                        iMo46926c = next.mo46926c();
                        if (bitmapM46999v != null) {
                            bitmapM46999v.recycle();
                        }
                        bitmapM46999v = m46999v(c7351r.m30475e(), c7351r.m30476f(), iMo46926c);
                        iMo46925b = -1;
                    }
                    if (iMo46925b != next.mo46925b()) {
                        byteArrayOutputStream.reset();
                        iMo46925b = next.mo46925b();
                        bitmapM46999v.compress(Bitmap.CompressFormat.JPEG, iMo46925b, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                    }
                    Surface surfaceM30474d = c7351r.m30474d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.m2185q(surfaceM30474d, byteArray);
                    next.mo46924a().m48314c(null);
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
            m46998u(e10);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12613t(C5902k0 c5902k0, Map<C13675d.e, InterfaceC12580c0> map) {
        this.f44904e = new AtomicBoolean(false);
        this.f44905f = new float[16];
        this.f44906g = new float[16];
        this.f44907h = new LinkedHashMap();
        this.f44908i = 0;
        this.f44909j = false;
        this.f44910k = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.f44901b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.f44903d = handler;
        this.f44902c = C10417c.m40085f(handler);
        this.f44900a = new C12625z();
        try {
            m47000w(c5902k0, map);
        } catch (RuntimeException e10) {
            mo46980a();
            throw e10;
        }
    }
}
