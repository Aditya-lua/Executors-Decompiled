package z;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
public class y implements n0.l0 {
    public int A;
    public long B;
    public final a C;
    public final b b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f38732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f38733d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.c0 f38734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.l0.d f38735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0.o3.b f38736g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h4 f38737h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g6 f38738i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x5 f38739j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q4 f38740k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s3 f38741l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i6 f38742m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0.g f38743n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f38744o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b6 f38745p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f38746q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g0.f1.j f38747r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f38748s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f38749t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f38750u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile int f38751v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0.a f38752w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f38753x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicLong f38754y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile pe.x<Void> f38755z;

    public static final class a extends n0.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<n0.u> f38756a = new HashSet();
        public Map<n0.u, Executor> b = new ArrayMap();

        @Override // n0.u
        public void a(final int i10) {
            for (final n0.u uVar : this.f38756a) {
                try {
                    this.b.get(uVar).execute(new Runnable() { // from class: z.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // n0.u
        public void b(final int i10, final n0.e0 e0Var) {
            for (final n0.u uVar : this.f38756a) {
                try {
                    this.b.get(uVar).execute(new Runnable() { // from class: z.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.b(i10, e0Var);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // n0.u
        public void c(final int i10, final n0.w wVar) {
            for (final n0.u uVar : this.f38756a) {
                try {
                    this.b.get(uVar).execute(new Runnable() { // from class: z.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            uVar.c(i10, wVar);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    g0.r1.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        public void h(Executor executor, n0.u uVar) {
            this.f38756a.add(uVar);
            this.b.put(uVar, executor);
        }

        public void i(n0.u uVar) {
            this.f38756a.remove(uVar);
            this.b.remove(uVar);
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<c> f38757a = new HashSet();
        public final Executor b;

        public b(Executor executor) {
            this.b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f38757a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f38757a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f38757a.add(cVar);
        }

        public void c(c cVar) {
            this.f38757a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: z.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.b.a(this.f38763a, totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public y(a0.c0 c0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, n0.l0.d dVar, n0.k3 k3Var) {
        n0.o3.b bVar = new n0.o3.b();
        this.f38736g = bVar;
        this.f38746q = 0;
        this.f38748s = 0;
        this.f38750u = false;
        this.f38751v = 2;
        this.f38753x = true;
        this.f38754y = new AtomicLong(0L);
        this.f38755z = r0.n.p(null);
        this.A = 1;
        this.B = 0L;
        a aVar = new a();
        this.C = aVar;
        this.f38734e = c0Var;
        this.f38735f = dVar;
        this.f38732c = executor;
        this.f38745p = new b6(executor);
        b bVar2 = new b(executor);
        this.b = bVar2;
        bVar.B(this.A);
        bVar.j(c3.e(bVar2));
        bVar.j(aVar);
        this.f38741l = new s3(this, c0Var, executor);
        this.f38737h = new h4(this, scheduledExecutorService, executor, k3Var);
        this.f38738i = new g6(this, c0Var, executor);
        this.f38739j = new x5(this, c0Var, executor);
        this.f38749t = c0Var.c();
        this.f38740k = new q4(this, c0Var, executor);
        this.f38742m = new m6(c0Var, executor);
        this.f38752w = new d0.a(k3Var);
        this.f38743n = new f0.g(this, executor);
        this.f38744o = new g1(this, c0Var, k3Var, executor, scheduledExecutorService);
    }

    public static /* synthetic */ boolean A(long j10, y1.c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!e0(totalCaptureResult, j10)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public static int R(a0.c0 c0Var, int i10) {
        int[] iArr = (int[]) c0Var.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public static boolean c0(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    public static boolean e0(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof n0.z3) && (l10 = (Long) ((n0.z3) tag).d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    public static /* synthetic */ Object p(final y yVar, final y1.c.a aVar) {
        yVar.getClass();
        try {
            yVar.f38732c.execute(new Runnable() { // from class: z.n
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f38514a.f38753x));
                }
            });
            return "isRepeatingRequestAvailable";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
            return "isRepeatingRequestAvailable";
        }
    }

    public static /* synthetic */ void q() {
    }

    public static /* synthetic */ void r() {
    }

    public static /* synthetic */ Object v(y yVar, final long j10, final y1.c.a aVar) {
        yVar.getClass();
        yVar.B(new c() { // from class: z.p
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return y.A(j10, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    public static /* synthetic */ Object x(final y yVar, final y1.c.a aVar) {
        yVar.f38732c.execute(new Runnable() { // from class: z.m
            @Override // java.lang.Runnable
            public final void run() {
                y yVar2 = this.f38485a;
                r0.n.t(yVar2.t0(yVar2.s0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public void B(c cVar) {
        this.b.b(cVar);
    }

    public void C(final Executor executor, final n0.u uVar) {
        this.f38732c.execute(new Runnable() { // from class: z.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f38616a.C.h(executor, uVar);
            }
        });
    }

    public void D() {
        synchronized (this.f38733d) {
            try {
                int i10 = this.f38746q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f38746q = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(boolean z10) {
        if (this.f38750u == z10) {
            return;
        }
        if (z10 && f0()) {
            i0();
            this.f38748s = 0;
            this.f38739j.f();
        }
        this.f38750u = z10;
        s0();
    }

    public void F(int i10) {
        if (this.f38750u) {
            return;
        }
        this.f38748s = i10;
        if (i10 == 0) {
            i0();
        }
        s0();
    }

    public Rect G() {
        return this.f38738i.g();
    }

    public int H() {
        return this.f38751v;
    }

    public h4 I() {
        return this.f38737h;
    }

    public q4 J() {
        return this.f38740k;
    }

    public int K() {
        Integer num = (Integer) this.f38734e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int L() {
        Integer num = (Integer) this.f38734e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int M() {
        Integer num = (Integer) this.f38734e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public g0.f1.j N() {
        return this.f38747r;
    }

    public n0.o3 O() {
        this.f38736g.B(this.A);
        this.f38736g.w(P());
        this.f38736g.o("CameraControlSessionUpdateId", Long.valueOf(this.B));
        return this.f38736g.p();
    }

    public n0.n1 P() {
        y.a.C0758a c0758a = new y.a.C0758a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        n0.n1.c cVar = n0.n1.c.REQUIRED;
        c0758a.g(key, 1, cVar);
        this.f38737h.n(c0758a);
        this.f38738i.e(c0758a);
        int iA = this.f38737h.G() ? 5 : 1;
        if (this.f38750u) {
            iA = 6;
        } else if (f0()) {
            c0758a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f38748s == 1) {
                    c0758a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f38749t), cVar);
                } else if (this.f38748s == 2) {
                    c0758a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f38734e.c()), cVar);
                }
            }
        } else {
            int i10 = this.f38751v;
            if (i10 == 0) {
                iA = this.f38752w.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c0758a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(iA)), cVar);
        c0758a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(T(1)), cVar);
        this.f38741l.c(c0758a);
        this.f38743n.i(c0758a);
        return c0758a.b();
    }

    public int Q(int i10) {
        return R(this.f38734e, i10);
    }

    public int S(int i10) {
        int[] iArr = (int[]) this.f38734e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        if (c0(4, iArr)) {
            return 4;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public final int T(int i10) {
        int[] iArr = (int[]) this.f38734e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public x5 U() {
        return this.f38739j;
    }

    public int V() {
        int i10;
        synchronized (this.f38733d) {
            i10 = this.f38746q;
        }
        return i10;
    }

    public g6 W() {
        return this.f38738i;
    }

    public i6 X() {
        return this.f38742m;
    }

    public void Y() {
        synchronized (this.f38733d) {
            this.f38746q++;
        }
    }

    public final boolean Z() {
        return V() > 0;
    }

    @Override // g0.m
    public pe.x<Void> a(boolean z10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f38739j.d(z10));
    }

    public boolean a0() {
        int iE = this.f38745p.e();
        g0.r1.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iE);
        return iE > 0;
    }

    @Override // n0.l0
    public void b(n0.o3.b bVar) {
        this.f38742m.b(bVar);
    }

    public boolean b0() {
        return this.f38750u;
    }

    @Override // n0.l0
    public void c() {
        this.f38742m.c();
    }

    @Override // n0.l0
    public void d() {
        this.f38745p.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d0() {
        try {
            return ((Boolean) y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.s
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return y.p(this.f38605a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    @Override // g0.m
    public pe.x<Void> e(float f10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f38738i.m(f10));
    }

    @Override // n0.l0
    public pe.x<List<Void>> f(final List<n0.l1> list, final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return r0.d.c(r0.n.s(this.f38755z)).g(new r0.a() { // from class: z.q
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return this.f38553a.f38744o.h(list, i10, iH, i11);
                }
            }, this.f38732c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public boolean f0() {
        return this.f38748s != 0;
    }

    @Override // g0.m
    public pe.x<Void> g(float f10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f38738i.n(f10));
    }

    public void g0(c cVar) {
        this.b.c(cVar);
    }

    @Override // n0.l0
    public void h(g0.f1.j jVar) {
        this.f38747r = jVar;
    }

    public void h0(final n0.u uVar) {
        this.f38732c.execute(new Runnable() { // from class: z.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f38433a.C.i(uVar);
            }
        });
    }

    @Override // n0.l0
    public void i(int i10) {
        if (!Z()) {
            g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f38751v = i10;
        g0.r1.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f38751v);
        i6 i6Var = this.f38742m;
        boolean z10 = true;
        if (this.f38751v != 1 && this.f38751v != 0) {
            z10 = false;
        }
        i6Var.d(z10);
        this.f38755z = r0();
    }

    public final void i0() {
        n0.l1.a aVar = new n0.l1.a();
        aVar.v(this.A);
        aVar.w(true);
        y.a.C0758a c0758a = new y.a.C0758a();
        c0758a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(1)));
        c0758a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0758a.b());
        q0(Collections.singletonList(aVar.h()));
    }

    @Override // n0.l0
    public n0.n1 j() {
        return this.f38743n.n();
    }

    public void j0() {
        o0(1);
    }

    @Override // n0.l0
    public void k() {
        this.f38745p.f();
    }

    public void k0(boolean z10) {
        g0.r1.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f38737h.J(z10);
        this.f38738i.l(z10);
        this.f38740k.d(z10);
        this.f38739j.i(z10);
        this.f38741l.b(z10);
        this.f38743n.o(z10);
        if (z10) {
            return;
        }
        this.f38747r = null;
        this.f38745p.h();
    }

    @Override // n0.l0
    public void l(n0.n1 n1Var) {
        this.f38743n.g(f0.l.a.d(n1Var).c()).a(new Runnable() { // from class: z.u
            @Override // java.lang.Runnable
            public final void run() {
                y.q();
            }
        }, q0.c.b());
    }

    public void l0(boolean z10) {
        this.f38753x = z10;
    }

    @Override // n0.l0
    public pe.x<m0.m> m(final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return r0.d.c(r0.n.s(this.f38755z)).g(new r0.a() { // from class: z.r
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return r0.n.p(this.f38585a.f38744o.c(i10, iH, i11));
                }
            }, this.f38732c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public void m0(boolean z10) {
        this.f38740k.f(z10);
    }

    @Override // n0.l0
    public void n() {
        this.f38743n.j().a(new Runnable() { // from class: z.l
            @Override // java.lang.Runnable
            public final void run() {
                y.r();
            }
        }, q0.c.b());
    }

    public void n0(Rational rational) {
        this.f38737h.K(rational);
    }

    @Override // g0.m
    public pe.x<g0.n0> o(g0.m0 m0Var) {
        if (Z()) {
            return !d0() ? r0.n.n(new g0.m.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : r0.n.s(this.f38737h.N(m0Var));
        }
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public void o0(int i10) {
        this.A = i10;
        this.f38737h.L(i10);
        this.f38744o.g(this.A);
    }

    public void p0(boolean z10) {
        this.f38742m.e(z10);
    }

    public void q0(List<n0.l1> list) {
        this.f38735f.b(list);
    }

    public pe.x<Void> r0() {
        return r0.n.s(y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.k
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return y.x(this.f38441a, aVar);
            }
        }));
    }

    public long s0() {
        this.B = this.f38754y.getAndIncrement();
        this.f38735f.a();
        return this.B;
    }

    public final pe.x<Void> t0(final long j10) {
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.o
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return y.v(this.f38535a, j10, aVar);
            }
        });
    }
}
