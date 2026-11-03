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
    public final Executor f37627c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f37628d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.c0 f37629e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.l0.d f37630f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0.o3.b f37631g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h4 f37632h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g6 f37633i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x5 f37634j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q4 f37635k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s3 f37636l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i6 f37637m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0.g f37638n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f37639o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b6 f37640p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f37641q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g0.f1.j f37642r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f37643s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f37644t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f37645u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile int f37646v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0.a f37647w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f37648x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicLong f37649y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile ne.x<Void> f37650z;

    public static final class a extends n0.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<n0.u> f37651a = new HashSet();
        public Map<n0.u, Executor> b = new ArrayMap();

        @Override // n0.u
        public void a(final int i10) {
            for (final n0.u uVar : this.f37651a) {
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
            for (final n0.u uVar : this.f37651a) {
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
            for (final n0.u uVar : this.f37651a) {
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
            this.f37651a.add(uVar);
            this.b.put(uVar, executor);
        }

        public void i(n0.u uVar) {
            this.f37651a.remove(uVar);
            this.b.remove(uVar);
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<c> f37652a = new HashSet();
        public final Executor b;

        public b(Executor executor) {
            this.b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f37652a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f37652a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f37652a.add(cVar);
        }

        public void c(c cVar) {
            this.f37652a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: z.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.b.a(this.f37658a, totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public y(a0.c0 c0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, n0.l0.d dVar, n0.k3 k3Var) {
        n0.o3.b bVar = new n0.o3.b();
        this.f37631g = bVar;
        this.f37641q = 0;
        this.f37643s = 0;
        this.f37645u = false;
        this.f37646v = 2;
        this.f37648x = true;
        this.f37649y = new AtomicLong(0L);
        this.f37650z = r0.n.p(null);
        this.A = 1;
        this.B = 0L;
        a aVar = new a();
        this.C = aVar;
        this.f37629e = c0Var;
        this.f37630f = dVar;
        this.f37627c = executor;
        this.f37640p = new b6(executor);
        b bVar2 = new b(executor);
        this.b = bVar2;
        bVar.B(this.A);
        bVar.j(c3.e(bVar2));
        bVar.j(aVar);
        this.f37636l = new s3(this, c0Var, executor);
        this.f37632h = new h4(this, scheduledExecutorService, executor, k3Var);
        this.f37633i = new g6(this, c0Var, executor);
        this.f37634j = new x5(this, c0Var, executor);
        this.f37644t = c0Var.c();
        this.f37635k = new q4(this, c0Var, executor);
        this.f37637m = new m6(c0Var, executor);
        this.f37647w = new d0.a(k3Var);
        this.f37638n = new f0.g(this, executor);
        this.f37639o = new g1(this, c0Var, k3Var, executor, scheduledExecutorService);
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
            yVar.f37627c.execute(new Runnable() { // from class: z.n
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f37409a.f37648x));
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
        yVar.f37627c.execute(new Runnable() { // from class: z.m
            @Override // java.lang.Runnable
            public final void run() {
                y yVar2 = this.f37380a;
                r0.n.t(yVar2.t0(yVar2.s0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public void B(c cVar) {
        this.b.b(cVar);
    }

    public void C(final Executor executor, final n0.u uVar) {
        this.f37627c.execute(new Runnable() { // from class: z.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f37511a.C.h(executor, uVar);
            }
        });
    }

    public void D() {
        synchronized (this.f37628d) {
            try {
                int i10 = this.f37641q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f37641q = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(boolean z10) {
        if (this.f37645u == z10) {
            return;
        }
        if (z10 && f0()) {
            i0();
            this.f37643s = 0;
            this.f37634j.f();
        }
        this.f37645u = z10;
        s0();
    }

    public void F(int i10) {
        if (this.f37645u) {
            return;
        }
        this.f37643s = i10;
        if (i10 == 0) {
            i0();
        }
        s0();
    }

    public Rect G() {
        return this.f37633i.g();
    }

    public int H() {
        return this.f37646v;
    }

    public h4 I() {
        return this.f37632h;
    }

    public q4 J() {
        return this.f37635k;
    }

    public int K() {
        Integer num = (Integer) this.f37629e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int L() {
        Integer num = (Integer) this.f37629e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int M() {
        Integer num = (Integer) this.f37629e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public g0.f1.j N() {
        return this.f37642r;
    }

    public n0.o3 O() {
        this.f37631g.B(this.A);
        this.f37631g.w(P());
        this.f37631g.o("CameraControlSessionUpdateId", Long.valueOf(this.B));
        return this.f37631g.p();
    }

    public n0.n1 P() {
        y.a.C0662a c0662a = new y.a.C0662a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        n0.n1.c cVar = n0.n1.c.REQUIRED;
        c0662a.g(key, 1, cVar);
        this.f37632h.n(c0662a);
        this.f37633i.e(c0662a);
        int iA = this.f37632h.G() ? 5 : 1;
        if (this.f37645u) {
            iA = 6;
        } else if (f0()) {
            c0662a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f37643s == 1) {
                    c0662a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f37644t), cVar);
                } else if (this.f37643s == 2) {
                    c0662a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f37629e.c()), cVar);
                }
            }
        } else {
            int i10 = this.f37646v;
            if (i10 == 0) {
                iA = this.f37647w.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c0662a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(iA)), cVar);
        c0662a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(T(1)), cVar);
        this.f37636l.c(c0662a);
        this.f37638n.i(c0662a);
        return c0662a.b();
    }

    public int Q(int i10) {
        return R(this.f37629e, i10);
    }

    public int S(int i10) {
        int[] iArr = (int[]) this.f37629e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
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
        int[] iArr = (int[]) this.f37629e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public x5 U() {
        return this.f37634j;
    }

    public int V() {
        int i10;
        synchronized (this.f37628d) {
            i10 = this.f37641q;
        }
        return i10;
    }

    public g6 W() {
        return this.f37633i;
    }

    public i6 X() {
        return this.f37637m;
    }

    public void Y() {
        synchronized (this.f37628d) {
            this.f37641q++;
        }
    }

    public final boolean Z() {
        return V() > 0;
    }

    @Override // n0.l0
    public void a(n0.o3.b bVar) {
        this.f37637m.a(bVar);
    }

    public boolean a0() {
        int iE = this.f37640p.e();
        g0.r1.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iE);
        return iE > 0;
    }

    @Override // n0.l0
    public void b() {
        this.f37637m.b();
    }

    public boolean b0() {
        return this.f37645u;
    }

    @Override // g0.m
    public ne.x<Void> c(boolean z10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f37634j.d(z10));
    }

    @Override // n0.l0
    public void d() {
        this.f37640p.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d0() {
        try {
            return ((Boolean) y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.s
                @Override // y1.c.InterfaceC0665c
                public final Object a(y1.c.a aVar) {
                    return y.p(this.f37500a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    @Override // g0.m
    public ne.x<Void> e(float f10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f37633i.m(f10));
    }

    @Override // n0.l0
    public ne.x<List<Void>> f(final List<n0.l1> list, final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return r0.d.c(r0.n.s(this.f37650z)).g(new r0.a() { // from class: z.q
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    return this.f37448a.f37639o.h(list, i10, iH, i11);
                }
            }, this.f37627c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public boolean f0() {
        return this.f37643s != 0;
    }

    @Override // g0.m
    public ne.x<Void> g(float f10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f37633i.n(f10));
    }

    public void g0(c cVar) {
        this.b.c(cVar);
    }

    @Override // n0.l0
    public void h(g0.f1.j jVar) {
        this.f37642r = jVar;
    }

    public void h0(final n0.u uVar) {
        this.f37627c.execute(new Runnable() { // from class: z.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f37328a.C.i(uVar);
            }
        });
    }

    @Override // n0.l0
    public void i(int i10) {
        if (!Z()) {
            g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f37646v = i10;
        g0.r1.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f37646v);
        i6 i6Var = this.f37637m;
        boolean z10 = true;
        if (this.f37646v != 1 && this.f37646v != 0) {
            z10 = false;
        }
        i6Var.d(z10);
        this.f37650z = r0();
    }

    public final void i0() {
        n0.l1.a aVar = new n0.l1.a();
        aVar.v(this.A);
        aVar.w(true);
        y.a.C0662a c0662a = new y.a.C0662a();
        c0662a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(1)));
        c0662a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0662a.b());
        q0(Collections.singletonList(aVar.h()));
    }

    @Override // n0.l0
    public n0.n1 j() {
        return this.f37638n.n();
    }

    public void j0() {
        o0(1);
    }

    @Override // n0.l0
    public void k() {
        this.f37640p.f();
    }

    public void k0(boolean z10) {
        g0.r1.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f37632h.J(z10);
        this.f37633i.l(z10);
        this.f37635k.d(z10);
        this.f37634j.i(z10);
        this.f37636l.b(z10);
        this.f37638n.o(z10);
        if (z10) {
            return;
        }
        this.f37642r = null;
        this.f37640p.h();
    }

    @Override // n0.l0
    public void l(n0.n1 n1Var) {
        this.f37638n.g(f0.l.a.d(n1Var).c()).a(new Runnable() { // from class: z.u
            @Override // java.lang.Runnable
            public final void run() {
                y.q();
            }
        }, q0.c.b());
    }

    public void l0(boolean z10) {
        this.f37648x = z10;
    }

    @Override // n0.l0
    public ne.x<m0.m> m(final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return r0.d.c(r0.n.s(this.f37650z)).g(new r0.a() { // from class: z.r
                @Override // r0.a
                public final ne.x apply(Object obj) {
                    return r0.n.p(this.f37480a.f37639o.c(i10, iH, i11));
                }
            }, this.f37627c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public void m0(boolean z10) {
        this.f37635k.f(z10);
    }

    @Override // n0.l0
    public void n() {
        this.f37638n.j().a(new Runnable() { // from class: z.l
            @Override // java.lang.Runnable
            public final void run() {
                y.r();
            }
        }, q0.c.b());
    }

    public void n0(Rational rational) {
        this.f37632h.K(rational);
    }

    @Override // g0.m
    public ne.x<g0.n0> o(g0.m0 m0Var) {
        if (Z()) {
            return !d0() ? r0.n.n(new g0.m.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : r0.n.s(this.f37632h.N(m0Var));
        }
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public void o0(int i10) {
        this.A = i10;
        this.f37632h.L(i10);
        this.f37639o.g(this.A);
    }

    public void p0(boolean z10) {
        this.f37637m.e(z10);
    }

    public void q0(List<n0.l1> list) {
        this.f37630f.b(list);
    }

    public ne.x<Void> r0() {
        return r0.n.s(y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.k
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return y.x(this.f37336a, aVar);
            }
        }));
    }

    public long s0() {
        this.B = this.f37649y.getAndIncrement();
        this.f37630f.a();
        return this.B;
    }

    public final ne.x<Void> t0(final long j10) {
        return y1.c.a(new y1.c.InterfaceC0665c() { // from class: z.o
            @Override // y1.c.InterfaceC0665c
            public final Object a(y1.c.a aVar) {
                return y.v(this.f37430a, j10, aVar);
            }
        });
    }
}
