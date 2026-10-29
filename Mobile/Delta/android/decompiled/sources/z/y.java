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
    public final Executor f36932c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f36933d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a0.c0 f36934e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n0.l0.d f36935f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n0.o3.b f36936g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final h4 f36937h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final g6 f36938i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final x5 f36939j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final q4 f36940k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s3 f36941l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public i6 f36942m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final f0.g f36943n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final g1 f36944o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final b6 f36945p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f36946q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public g0.f1.j f36947r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f36948s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f36949t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f36950u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile int f36951v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final d0.a f36952w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f36953x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicLong f36954y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile me.x<Void> f36955z;

    public static final class a extends n0.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<n0.u> f36956a = new HashSet();
        public Map<n0.u, Executor> b = new ArrayMap();

        @Override // n0.u
        public void a(final int i10) {
            for (final n0.u uVar : this.f36956a) {
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
            for (final n0.u uVar : this.f36956a) {
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
            for (final n0.u uVar : this.f36956a) {
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
            this.f36956a.add(uVar);
            this.b.put(uVar, executor);
        }

        public void i(n0.u uVar) {
            this.f36956a.remove(uVar);
            this.b.remove(uVar);
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<c> f36957a = new HashSet();
        public final Executor b;

        public b(Executor executor) {
            this.b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f36957a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f36957a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f36957a.add(cVar);
        }

        public void c(c cVar) {
            this.f36957a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.b.execute(new Runnable() { // from class: z.z
                @Override // java.lang.Runnable
                public final void run() {
                    y.b.a(this.f36963a, totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public y(a0.c0 c0Var, ScheduledExecutorService scheduledExecutorService, Executor executor, n0.l0.d dVar, n0.k3 k3Var) {
        n0.o3.b bVar = new n0.o3.b();
        this.f36936g = bVar;
        this.f36946q = 0;
        this.f36948s = 0;
        this.f36950u = false;
        this.f36951v = 2;
        this.f36953x = true;
        this.f36954y = new AtomicLong(0L);
        this.f36955z = r0.n.p(null);
        this.A = 1;
        this.B = 0L;
        a aVar = new a();
        this.C = aVar;
        this.f36934e = c0Var;
        this.f36935f = dVar;
        this.f36932c = executor;
        this.f36945p = new b6(executor);
        b bVar2 = new b(executor);
        this.b = bVar2;
        bVar.B(this.A);
        bVar.j(c3.e(bVar2));
        bVar.j(aVar);
        this.f36941l = new s3(this, c0Var, executor);
        this.f36937h = new h4(this, scheduledExecutorService, executor, k3Var);
        this.f36938i = new g6(this, c0Var, executor);
        this.f36939j = new x5(this, c0Var, executor);
        this.f36949t = c0Var.c();
        this.f36940k = new q4(this, c0Var, executor);
        this.f36942m = new m6(c0Var, executor);
        this.f36952w = new d0.a(k3Var);
        this.f36943n = new f0.g(this, executor);
        this.f36944o = new g1(this, c0Var, k3Var, executor, scheduledExecutorService);
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
            yVar.f36932c.execute(new Runnable() { // from class: z.n
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f36714a.f36953x));
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
        yVar.f36932c.execute(new Runnable() { // from class: z.m
            @Override // java.lang.Runnable
            public final void run() {
                y yVar2 = this.f36685a;
                r0.n.t(yVar2.t0(yVar2.s0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public void B(c cVar) {
        this.b.b(cVar);
    }

    public void C(final Executor executor, final n0.u uVar) {
        this.f36932c.execute(new Runnable() { // from class: z.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f36816a.C.h(executor, uVar);
            }
        });
    }

    public void D() {
        synchronized (this.f36933d) {
            try {
                int i10 = this.f36946q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f36946q = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void E(boolean z10) {
        if (this.f36950u == z10) {
            return;
        }
        if (z10 && f0()) {
            i0();
            this.f36948s = 0;
            this.f36939j.f();
        }
        this.f36950u = z10;
        s0();
    }

    public void F(int i10) {
        if (this.f36950u) {
            return;
        }
        this.f36948s = i10;
        if (i10 == 0) {
            i0();
        }
        s0();
    }

    public Rect G() {
        return this.f36938i.g();
    }

    public int H() {
        return this.f36951v;
    }

    public h4 I() {
        return this.f36937h;
    }

    public q4 J() {
        return this.f36940k;
    }

    public int K() {
        Integer num = (Integer) this.f36934e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int L() {
        Integer num = (Integer) this.f36934e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public int M() {
        Integer num = (Integer) this.f36934e.a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public g0.f1.j N() {
        return this.f36947r;
    }

    public n0.o3 O() {
        this.f36936g.B(this.A);
        this.f36936g.w(P());
        this.f36936g.o("CameraControlSessionUpdateId", Long.valueOf(this.B));
        return this.f36936g.p();
    }

    public n0.n1 P() {
        y.a.C0647a c0647a = new y.a.C0647a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        n0.n1.c cVar = n0.n1.c.REQUIRED;
        c0647a.g(key, 1, cVar);
        this.f36937h.n(c0647a);
        this.f36938i.e(c0647a);
        int iA = this.f36937h.G() ? 5 : 1;
        if (this.f36950u) {
            iA = 6;
        } else if (f0()) {
            c0647a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f36948s == 1) {
                    c0647a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f36949t), cVar);
                } else if (this.f36948s == 2) {
                    c0647a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f36934e.c()), cVar);
                }
            }
        } else {
            int i10 = this.f36951v;
            if (i10 == 0) {
                iA = this.f36952w.a(2);
            } else if (i10 == 1) {
                iA = 3;
            } else if (i10 == 2) {
                iA = 1;
            }
        }
        c0647a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(iA)), cVar);
        c0647a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(T(1)), cVar);
        this.f36941l.c(c0647a);
        this.f36943n.i(c0647a);
        return c0647a.b();
    }

    public int Q(int i10) {
        return R(this.f36934e, i10);
    }

    public int S(int i10) {
        int[] iArr = (int[]) this.f36934e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
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
        int[] iArr = (int[]) this.f36934e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (c0(i10, iArr)) {
            return i10;
        }
        return c0(1, iArr) ? 1 : 0;
    }

    public x5 U() {
        return this.f36939j;
    }

    public int V() {
        int i10;
        synchronized (this.f36933d) {
            i10 = this.f36946q;
        }
        return i10;
    }

    public g6 W() {
        return this.f36938i;
    }

    public i6 X() {
        return this.f36942m;
    }

    public void Y() {
        synchronized (this.f36933d) {
            this.f36946q++;
        }
    }

    public final boolean Z() {
        return V() > 0;
    }

    @Override // n0.l0
    public void a(n0.o3.b bVar) {
        this.f36942m.a(bVar);
    }

    public boolean a0() {
        int iE = this.f36945p.e();
        g0.r1.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iE);
        return iE > 0;
    }

    @Override // n0.l0
    public void b() {
        this.f36942m.b();
    }

    public boolean b0() {
        return this.f36950u;
    }

    @Override // g0.m
    public me.x<Void> c(boolean z10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f36939j.d(z10));
    }

    @Override // n0.l0
    public void d() {
        this.f36945p.c();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean d0() {
        try {
            return ((Boolean) y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.s
                @Override // y1.c.InterfaceC0650c
                public final Object a(y1.c.a aVar) {
                    return y.p(this.f36805a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    @Override // g0.m
    public me.x<Void> e(float f10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f36938i.m(f10));
    }

    @Override // n0.l0
    public me.x<List<Void>> f(final List<n0.l1> list, final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return r0.d.c(r0.n.s(this.f36955z)).g(new r0.a() { // from class: z.q
                @Override // r0.a
                public final me.x apply(Object obj) {
                    return this.f36753a.f36944o.h(list, i10, iH, i11);
                }
            }, this.f36932c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public boolean f0() {
        return this.f36948s != 0;
    }

    @Override // g0.m
    public me.x<Void> g(float f10) {
        return !Z() ? r0.n.n(new g0.m.a("Camera is not active.")) : r0.n.s(this.f36938i.n(f10));
    }

    public void g0(c cVar) {
        this.b.c(cVar);
    }

    @Override // n0.l0
    public void h(g0.f1.j jVar) {
        this.f36947r = jVar;
    }

    public void h0(final n0.u uVar) {
        this.f36932c.execute(new Runnable() { // from class: z.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f36633a.C.i(uVar);
            }
        });
    }

    @Override // n0.l0
    public void i(int i10) {
        if (!Z()) {
            g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f36951v = i10;
        g0.r1.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f36951v);
        i6 i6Var = this.f36942m;
        boolean z10 = true;
        if (this.f36951v != 1 && this.f36951v != 0) {
            z10 = false;
        }
        i6Var.d(z10);
        this.f36955z = r0();
    }

    public final void i0() {
        n0.l1.a aVar = new n0.l1.a();
        aVar.v(this.A);
        aVar.w(true);
        y.a.C0647a c0647a = new y.a.C0647a();
        c0647a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(Q(1)));
        c0647a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0647a.b());
        q0(Collections.singletonList(aVar.h()));
    }

    @Override // n0.l0
    public n0.n1 j() {
        return this.f36943n.n();
    }

    public void j0() {
        o0(1);
    }

    @Override // n0.l0
    public void k() {
        this.f36945p.f();
    }

    public void k0(boolean z10) {
        g0.r1.a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f36937h.J(z10);
        this.f36938i.l(z10);
        this.f36940k.d(z10);
        this.f36939j.i(z10);
        this.f36941l.b(z10);
        this.f36943n.o(z10);
        if (z10) {
            return;
        }
        this.f36947r = null;
        this.f36945p.h();
    }

    @Override // n0.l0
    public void l(n0.n1 n1Var) {
        this.f36943n.g(f0.l.a.d(n1Var).c()).a(new Runnable() { // from class: z.u
            @Override // java.lang.Runnable
            public final void run() {
                y.q();
            }
        }, q0.c.b());
    }

    public void l0(boolean z10) {
        this.f36953x = z10;
    }

    @Override // n0.l0
    public me.x<m0.m> m(final int i10, final int i11) {
        if (Z()) {
            final int iH = H();
            return r0.d.c(r0.n.s(this.f36955z)).g(new r0.a() { // from class: z.r
                @Override // r0.a
                public final me.x apply(Object obj) {
                    return r0.n.p(this.f36785a.f36944o.c(i10, iH, i11));
                }
            }, this.f36932c);
        }
        g0.r1.l("Camera2CameraControlImp", "Camera is not active.");
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public void m0(boolean z10) {
        this.f36940k.f(z10);
    }

    @Override // n0.l0
    public void n() {
        this.f36943n.j().a(new Runnable() { // from class: z.l
            @Override // java.lang.Runnable
            public final void run() {
                y.r();
            }
        }, q0.c.b());
    }

    public void n0(Rational rational) {
        this.f36937h.K(rational);
    }

    @Override // g0.m
    public me.x<g0.n0> o(g0.m0 m0Var) {
        if (Z()) {
            return !d0() ? r0.n.n(new g0.m.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : r0.n.s(this.f36937h.N(m0Var));
        }
        return r0.n.n(new g0.m.a("Camera is not active."));
    }

    public void o0(int i10) {
        this.A = i10;
        this.f36937h.L(i10);
        this.f36944o.g(this.A);
    }

    public void p0(boolean z10) {
        this.f36942m.e(z10);
    }

    public void q0(List<n0.l1> list) {
        this.f36935f.b(list);
    }

    public me.x<Void> r0() {
        return r0.n.s(y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.k
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return y.x(this.f36641a, aVar);
            }
        }));
    }

    public long s0() {
        this.B = this.f36954y.getAndIncrement();
        this.f36935f.a();
        return this.B;
    }

    public final me.x<Void> t0(final long j10) {
        return y1.c.a(new y1.c.InterfaceC0650c() { // from class: z.o
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return y.v(this.f36735a, j10, aVar);
            }
        });
    }
}
