package z;

import android.graphics.PointF;
import android.graphics.Rect;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.util.Log;
import android.util.Rational;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes.dex */
public class h4 {

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final MeteringRectangle[] f38392x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f38393a;
    public final Executor b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f38394c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d0.l f38397f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture<?> f38400i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ScheduledFuture<?> f38401j;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MeteringRectangle[] f38408q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public MeteringRectangle[] f38409r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public MeteringRectangle[] f38410s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public y1.c.a<g0.n0> f38411t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public y1.c.a<Void> f38412u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f38413v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public y.c f38414w;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f38395d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile Rational f38396e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f38398g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f38399h = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f38402k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f38403l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f38404m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f38405n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public y.c f38406o = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public y.c f38407p = null;

    public class a extends n0.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f38415a;

        public a(y1.c.a aVar) {
            this.f38415a = aVar;
        }

        @Override // n0.u
        public void a(int i10) {
            y1.c.a aVar = this.f38415a;
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is closed"));
            }
        }

        @Override // n0.u
        public void b(int i10, n0.e0 e0Var) {
            y1.c.a aVar = this.f38415a;
            if (aVar != null) {
                aVar.c(e0Var);
            }
        }

        @Override // n0.u
        public void c(int i10, n0.w wVar) {
            y1.c.a aVar = this.f38415a;
            if (aVar != null) {
                aVar.f(new n0.l0.c(wVar));
            }
        }
    }

    public class b extends n0.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f38416a;

        public b(y1.c.a aVar) {
            this.f38416a = aVar;
        }

        @Override // n0.u
        public void a(int i10) {
            y1.c.a aVar = this.f38416a;
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is closed"));
            }
        }

        @Override // n0.u
        public void b(int i10, n0.e0 e0Var) {
            if (this.f38416a != null) {
                g0.r1.a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f38416a.c(null);
            }
        }

        @Override // n0.u
        public void c(int i10, n0.w wVar) {
            y1.c.a aVar = this.f38416a;
            if (aVar != null) {
                aVar.f(new n0.l0.c(wVar));
            }
        }
    }

    public h4(y yVar, ScheduledExecutorService scheduledExecutorService, Executor executor, n0.k3 k3Var) {
        MeteringRectangle[] meteringRectangleArr = f38392x;
        this.f38408q = meteringRectangleArr;
        this.f38409r = meteringRectangleArr;
        this.f38410s = meteringRectangleArr;
        this.f38411t = null;
        this.f38412u = null;
        this.f38413v = false;
        this.f38414w = null;
        this.f38393a = yVar;
        this.b = executor;
        this.f38394c = scheduledExecutorService;
        this.f38397f = new d0.l(k3Var);
    }

    public static PointF C(g0.u1 u1Var, Rational rational, Rational rational2, int i10, d0.l lVar) {
        if (u1Var.b() != null) {
            rational2 = u1Var.b();
        }
        PointF pointFA = lVar.a(u1Var, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFA.y = (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointFA.y) * (1.0f / fDoubleValue);
                return pointFA;
            }
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointFA.x = (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointFA.x) * (1.0f / fDoubleValue2);
        }
        return pointFA;
    }

    public static MeteringRectangle D(g0.u1 u1Var, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iA = ((int) (u1Var.a() * rect.width())) / 2;
        int iA2 = ((int) (u1Var.a() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iA, iHeight - iA2, iWidth + iA, iHeight + iA2);
        rect2.left = I(rect2.left, rect.right, rect.left);
        rect2.right = I(rect2.right, rect.right, rect.left);
        rect2.top = I(rect2.top, rect.bottom, rect.top);
        rect2.bottom = I(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    public static boolean H(g0.u1 u1Var) {
        return u1Var.c() >= 0.0f && u1Var.c() <= 1.0f && u1Var.d() >= 0.0f && u1Var.d() <= 1.0f;
    }

    public static int I(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    public static /* synthetic */ boolean a(h4 h4Var, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        h4Var.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !y.e0(totalCaptureResult, j10)) {
            return false;
        }
        h4Var.t();
        return true;
    }

    public static /* synthetic */ void b(h4 h4Var, boolean z10, y1.c.a aVar) {
        h4Var.f38393a.g0(h4Var.f38414w);
        h4Var.f38413v = z10;
        h4Var.w(aVar);
    }

    public static /* synthetic */ Object c(final h4 h4Var, final g0.m0 m0Var, final long j10, final y1.c.a aVar) {
        h4Var.b.execute(new Runnable() { // from class: z.u3
            @Override // java.lang.Runnable
            public final void run() {
                this.f38689a.P(aVar, m0Var, j10);
            }
        });
        return "startFocusAndMetering";
    }

    public static /* synthetic */ Object f(final h4 h4Var, final boolean z10, final y1.c.a aVar) {
        h4Var.b.execute(new Runnable() { // from class: z.g4
            @Override // java.lang.Runnable
            public final void run() {
                h4.b(this.f38350a, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    public static /* synthetic */ boolean h(h4 h4Var, long j10, y1.c.a aVar, TotalCaptureResult totalCaptureResult) {
        h4Var.getClass();
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        g0.r1.a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != h4Var.f38413v || !y.e0(totalCaptureResult, j10)) {
            return false;
        }
        g0.r1.a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.c(null);
        }
        return true;
    }

    public static /* synthetic */ Object i(final h4 h4Var, final y1.c.a aVar) {
        h4Var.b.execute(new Runnable() { // from class: z.v3
            @Override // java.lang.Runnable
            public final void run() {
                this.f38700a.R(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    public static /* synthetic */ void j(h4 h4Var, long j10) {
        if (j10 == h4Var.f38402k) {
            h4Var.f38404m = false;
            h4Var.s(false);
        }
    }

    public static /* synthetic */ boolean k(h4 h4Var, boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        h4Var.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (h4Var.M()) {
            if (!z10 || num == null) {
                h4Var.f38404m = true;
                h4Var.f38403l = true;
            } else if (h4Var.f38399h.intValue() == 3) {
                if (num.intValue() == 4) {
                    h4Var.f38404m = true;
                    h4Var.f38403l = true;
                } else if (num.intValue() == 5) {
                    h4Var.f38404m = false;
                    h4Var.f38403l = true;
                }
            }
        }
        if (h4Var.f38403l && y.e0(totalCaptureResult, j10)) {
            h4Var.s(h4Var.f38404m);
            return true;
        }
        if (!h4Var.f38399h.equals(num) && num != null) {
            h4Var.f38399h = num;
        }
        return false;
    }

    public static /* synthetic */ void l(h4 h4Var, long j10) {
        if (j10 == h4Var.f38402k) {
            h4Var.q();
        }
    }

    public int A() {
        return this.f38405n != 3 ? 4 : 3;
    }

    public final Rational B() {
        if (this.f38396e != null) {
            return this.f38396e;
        }
        Rect rectG = this.f38393a.G();
        return new Rational(rectG.width(), rectG.height());
    }

    public final List<MeteringRectangle> E(List<g0.u1> list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (g0.u1 u1Var : list) {
            if (arrayList.size() == i10) {
                break;
            }
            if (H(u1Var)) {
                MeteringRectangle meteringRectangleD = D(u1Var, C(u1Var, rational2, rational, i11, this.f38397f), rect);
                if (meteringRectangleD.getWidth() != 0 && meteringRectangleD.getHeight() != 0) {
                    arrayList.add(meteringRectangleD);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final boolean F() {
        return this.f38393a.S(1) == 1;
    }

    public boolean G() {
        return this.f38413v;
    }

    public void J(boolean z10) {
        if (z10 == this.f38395d) {
            return;
        }
        this.f38395d = z10;
        if (this.f38395d) {
            return;
        }
        q();
    }

    public void K(Rational rational) {
        this.f38396e = rational;
    }

    public void L(int i10) {
        this.f38405n = i10;
    }

    public final boolean M() {
        return this.f38408q.length > 0;
    }

    public pe.x<g0.n0> N(g0.m0 m0Var) {
        return O(m0Var, 5000L);
    }

    public pe.x<g0.n0> O(final g0.m0 m0Var, final long j10) {
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.x3
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return h4.c(this.f38716a, m0Var, j10, aVar);
            }
        });
    }

    public void P(y1.c.a<g0.n0> aVar, g0.m0 m0Var, long j10) {
        if (!this.f38395d) {
            aVar.f(new g0.m.a("Camera is not active."));
            return;
        }
        Rect rectG = this.f38393a.G();
        Rational rationalB = B();
        List<MeteringRectangle> listE = E(m0Var.c(), this.f38393a.L(), rationalB, rectG, 1);
        List<MeteringRectangle> listE2 = E(m0Var.b(), this.f38393a.K(), rationalB, rectG, 2);
        List<MeteringRectangle> listE3 = E(m0Var.d(), this.f38393a.M(), rationalB, rectG, 4);
        if (listE.isEmpty() && listE2.isEmpty() && listE3.isEmpty()) {
            aVar.f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        y("Cancelled by another startFocusAndMetering()");
        z("Cancelled by another startFocusAndMetering()");
        u();
        this.f38411t = aVar;
        MeteringRectangle[] meteringRectangleArr = f38392x;
        x((MeteringRectangle[]) listE.toArray(meteringRectangleArr), (MeteringRectangle[]) listE2.toArray(meteringRectangleArr), (MeteringRectangle[]) listE3.toArray(meteringRectangleArr), m0Var, j10);
    }

    public pe.x<Void> Q() {
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.f4
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return h4.i(this.f38302a, aVar);
            }
        });
    }

    public void R(y1.c.a<Void> aVar) {
        g0.r1.a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f38395d) {
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is not active."));
                return;
            }
            return;
        }
        n0.l1.a aVar2 = new n0.l1.a();
        aVar2.v(this.f38405n);
        aVar2.w(true);
        y.a.C0758a c0758a = new y.a.C0758a();
        c0758a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.e(c0758a.b());
        aVar2.c(new b(aVar));
        this.f38393a.q0(Collections.singletonList(aVar2.h()));
    }

    public void S(y1.c.a<n0.e0> aVar, boolean z10) {
        if (!this.f38395d) {
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is not active."));
                return;
            }
            return;
        }
        n0.l1.a aVar2 = new n0.l1.a();
        aVar2.v(this.f38405n);
        aVar2.w(true);
        y.a.C0758a c0758a = new y.a.C0758a();
        c0758a.f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            c0758a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f38393a.Q(1)), n0.n1.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.e(c0758a.b());
        aVar2.c(new a(aVar));
        this.f38393a.q0(Collections.singletonList(aVar2.h()));
    }

    public void n(y.a.C0758a c0758a) {
        int iA = this.f38398g ? 1 : A();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.f38393a.S(iA));
        n0.n1.c cVar = n0.n1.c.REQUIRED;
        c0758a.g(key, numValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f38408q;
        if (meteringRectangleArr.length != 0) {
            c0758a.g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f38409r;
        if (meteringRectangleArr2.length != 0) {
            c0758a.g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f38410s;
        if (meteringRectangleArr3.length != 0) {
            c0758a.g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    public void o(boolean z10, boolean z11) {
        if (this.f38395d) {
            n0.l1.a aVar = new n0.l1.a();
            aVar.w(true);
            aVar.v(this.f38405n);
            y.a.C0758a c0758a = new y.a.C0758a();
            if (z10) {
                c0758a.f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                c0758a.f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.e(c0758a.b());
            this.f38393a.q0(Collections.singletonList(aVar.h()));
        }
    }

    public void p(y1.c.a<Void> aVar) {
        z("Cancelled by another cancelFocusAndMetering()");
        y("Cancelled by cancelFocusAndMetering()");
        this.f38412u = aVar;
        u();
        r();
        if (M()) {
            o(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f38392x;
        this.f38408q = meteringRectangleArr;
        this.f38409r = meteringRectangleArr;
        this.f38410s = meteringRectangleArr;
        this.f38398g = false;
        final long jS0 = this.f38393a.s0();
        if (this.f38412u != null) {
            final int iS = this.f38393a.S(A());
            y.c cVar = new y.c() { // from class: z.y3
                @Override // z.y.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return h4.a(this.f38760a, iS, jS0, totalCaptureResult);
                }
            };
            this.f38407p = cVar;
            this.f38393a.B(cVar);
        }
    }

    public void q() {
        p(null);
    }

    public final void r() {
        ScheduledFuture<?> scheduledFuture = this.f38401j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f38401j = null;
        }
    }

    public void s(boolean z10) {
        r();
        y1.c.a<g0.n0> aVar = this.f38411t;
        if (aVar != null) {
            aVar.c(g0.n0.a(z10));
            this.f38411t = null;
        }
    }

    public final void t() {
        y1.c.a<Void> aVar = this.f38412u;
        if (aVar != null) {
            aVar.c(null);
            this.f38412u = null;
        }
    }

    public final void u() {
        ScheduledFuture<?> scheduledFuture = this.f38400i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f38400i = null;
        }
    }

    public pe.x<Void> v(final boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return r0.n.p(null);
        }
        if (this.f38393a.Q(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return r0.n.p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.e4
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return h4.f(this.f38288a, z10, aVar);
            }
        });
    }

    public final void w(final y1.c.a<Void> aVar) {
        if (!this.f38395d) {
            if (aVar != null) {
                aVar.f(new g0.m.a("Camera is not active."));
            }
        } else {
            final long jS0 = this.f38393a.s0();
            y.c cVar = new y.c() { // from class: z.w3
                @Override // z.y.c
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return h4.h(this.f38709a, jS0, aVar, totalCaptureResult);
                }
            };
            this.f38414w = cVar;
            this.f38393a.B(cVar);
        }
    }

    public final void x(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, g0.m0 m0Var, long j10) {
        final long jS0;
        this.f38393a.g0(this.f38406o);
        u();
        r();
        this.f38408q = meteringRectangleArr;
        this.f38409r = meteringRectangleArr2;
        this.f38410s = meteringRectangleArr3;
        if (M()) {
            this.f38398g = true;
            this.f38403l = false;
            this.f38404m = false;
            jS0 = this.f38393a.s0();
            S(null, true);
        } else {
            this.f38398g = false;
            this.f38403l = true;
            this.f38404m = false;
            jS0 = this.f38393a.s0();
        }
        this.f38399h = 0;
        final boolean zF = F();
        y.c cVar = new y.c() { // from class: z.z3
            @Override // z.y.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return h4.k(this.f38781a, zF, jS0, totalCaptureResult);
            }
        };
        this.f38406o = cVar;
        this.f38393a.B(cVar);
        final long j11 = this.f38402k + 1;
        this.f38402k = j11;
        Runnable runnable = new Runnable() { // from class: z.a4
            @Override // java.lang.Runnable
            public final void run() {
                h4 h4Var = this.f38238a;
                h4Var.b.execute(new Runnable() { // from class: z.d4
                    @Override // java.lang.Runnable
                    public final void run() {
                        h4.j(h4Var, j);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f38394c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f38401j = scheduledExecutorService.schedule(runnable, j10, timeUnit);
        if (m0Var.e()) {
            this.f38400i = this.f38394c.schedule(new Runnable() { // from class: z.b4
                @Override // java.lang.Runnable
                public final void run() {
                    h4 h4Var = this.f38245a;
                    h4Var.b.execute(new Runnable() { // from class: z.c4
                        @Override // java.lang.Runnable
                        public final void run() {
                            h4.l(h4Var, j);
                        }
                    });
                }
            }, m0Var.a(), timeUnit);
        }
    }

    public final void y(String str) {
        this.f38393a.g0(this.f38406o);
        y1.c.a<g0.n0> aVar = this.f38411t;
        if (aVar != null) {
            aVar.f(new g0.m.a(str));
            this.f38411t = null;
        }
    }

    public final void z(String str) {
        this.f38393a.g0(this.f38407p);
        y1.c.a<Void> aVar = this.f38412u;
        if (aVar != null) {
            aVar.f(new g0.m.a(str));
            this.f38412u = null;
        }
    }
}
