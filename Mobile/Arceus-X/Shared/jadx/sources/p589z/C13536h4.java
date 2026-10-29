package p589z;

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
import ne.InterfaceFutureC9440x;
import p063d0.C4381l;
import p140g0.C5910m0;
import p140g0.C5914n0;
import p140g0.C5931r1;
import p140g0.C5943u1;
import p140g0.InterfaceC5909m;
import p296n0.AbstractC8828u;
import p296n0.C8782k3;
import p296n0.C8785l1;
import p296n0.C8838w;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8795n1;
import p397r0.C10773n;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C13536h4 {

    /* JADX INFO: renamed from: x */
    public static final MeteringRectangle[] f47402x = new MeteringRectangle[0];

    /* JADX INFO: renamed from: a */
    public final C13658y f47403a;

    /* JADX INFO: renamed from: b */
    public final Executor f47404b;

    /* JADX INFO: renamed from: c */
    public final ScheduledExecutorService f47405c;

    /* JADX INFO: renamed from: f */
    public final C4381l f47408f;

    /* JADX INFO: renamed from: i */
    public ScheduledFuture<?> f47411i;

    /* JADX INFO: renamed from: j */
    public ScheduledFuture<?> f47412j;

    /* JADX INFO: renamed from: q */
    public MeteringRectangle[] f47419q;

    /* JADX INFO: renamed from: r */
    public MeteringRectangle[] f47420r;

    /* JADX INFO: renamed from: s */
    public MeteringRectangle[] f47421s;

    /* JADX INFO: renamed from: t */
    public C12997c.a<C5914n0> f47422t;

    /* JADX INFO: renamed from: u */
    public C12997c.a<Void> f47423u;

    /* JADX INFO: renamed from: v */
    public boolean f47424v;

    /* JADX INFO: renamed from: w */
    public C13658y.c f47425w;

    /* JADX INFO: renamed from: d */
    public volatile boolean f47406d = false;

    /* JADX INFO: renamed from: e */
    public volatile Rational f47407e = null;

    /* JADX INFO: renamed from: g */
    public boolean f47409g = false;

    /* JADX INFO: renamed from: h */
    public Integer f47410h = 0;

    /* JADX INFO: renamed from: k */
    public long f47413k = 0;

    /* JADX INFO: renamed from: l */
    public boolean f47414l = false;

    /* JADX INFO: renamed from: m */
    public boolean f47415m = false;

    /* JADX INFO: renamed from: n */
    public int f47416n = 1;

    /* JADX INFO: renamed from: o */
    public C13658y.c f47417o = null;

    /* JADX INFO: renamed from: p */
    public C13658y.c f47418p = null;

    /* JADX INFO: renamed from: z.h4$a */
    public class a extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12997c.a f47426a;

        public a(C12997c.a aVar) {
            this.f47426a = aVar;
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: a */
        public void mo35425a(int i10) {
            C12997c.a aVar = this.f47426a;
            if (aVar != null) {
                aVar.m48317f(new InterfaceC5909m.a("Camera is closed"));
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            C12997c.a aVar = this.f47426a;
            if (aVar != null) {
                aVar.m48314c(interfaceC8743e0);
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: c */
        public void mo35426c(int i10, C8838w c8838w) {
            C12997c.a aVar = this.f47426a;
            if (aVar != null) {
                aVar.m48317f(new InterfaceC8784l0.c(c8838w));
            }
        }
    }

    /* JADX INFO: renamed from: z.h4$b */
    public class b extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C12997c.a f47428a;

        public b(C12997c.a aVar) {
            this.f47428a = aVar;
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: a */
        public void mo35425a(int i10) {
            C12997c.a aVar = this.f47428a;
            if (aVar != null) {
                aVar.m48317f(new InterfaceC5909m.a("Camera is closed"));
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            if (this.f47428a != null) {
                C5931r1.m26561a("FocusMeteringControl", "triggerAePrecapture: triggering capture request completed");
                this.f47428a.m48314c(null);
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: c */
        public void mo35426c(int i10, C8838w c8838w) {
            C12997c.a aVar = this.f47428a;
            if (aVar != null) {
                aVar.m48317f(new InterfaceC8784l0.c(c8838w));
            }
        }
    }

    public C13536h4(C13658y c13658y, ScheduledExecutorService scheduledExecutorService, Executor executor, C8782k3 c8782k3) {
        MeteringRectangle[] meteringRectangleArr = f47402x;
        this.f47419q = meteringRectangleArr;
        this.f47420r = meteringRectangleArr;
        this.f47421s = meteringRectangleArr;
        this.f47422t = null;
        this.f47423u = null;
        this.f47424v = false;
        this.f47425w = null;
        this.f47403a = c13658y;
        this.f47404b = executor;
        this.f47405c = scheduledExecutorService;
        this.f47408f = new C4381l(c8782k3);
    }

    /* JADX INFO: renamed from: C */
    public static PointF m49364C(C5943u1 c5943u1, Rational rational, Rational rational2, int i10, C4381l c4381l) {
        if (c5943u1.m26623b() != null) {
            rational2 = c5943u1.m26623b();
        }
        PointF pointFM22042a = c4381l.m22042a(c5943u1, i10);
        if (!rational2.equals(rational)) {
            if (rational2.compareTo(rational) > 0) {
                float fDoubleValue = (float) (rational2.doubleValue() / rational.doubleValue());
                pointFM22042a.y = (((float) ((((double) fDoubleValue) - 1.0d) / 2.0d)) + pointFM22042a.y) * (1.0f / fDoubleValue);
                return pointFM22042a;
            }
            float fDoubleValue2 = (float) (rational.doubleValue() / rational2.doubleValue());
            pointFM22042a.x = (((float) ((((double) fDoubleValue2) - 1.0d) / 2.0d)) + pointFM22042a.x) * (1.0f / fDoubleValue2);
        }
        return pointFM22042a;
    }

    /* JADX INFO: renamed from: D */
    public static MeteringRectangle m49365D(C5943u1 c5943u1, PointF pointF, Rect rect) {
        int iWidth = (int) (rect.left + (pointF.x * rect.width()));
        int iHeight = (int) (rect.top + (pointF.y * rect.height()));
        int iM26622a = ((int) (c5943u1.m26622a() * rect.width())) / 2;
        int iM26622a2 = ((int) (c5943u1.m26622a() * rect.height())) / 2;
        Rect rect2 = new Rect(iWidth - iM26622a, iHeight - iM26622a2, iWidth + iM26622a, iHeight + iM26622a2);
        rect2.left = m49367I(rect2.left, rect.right, rect.left);
        rect2.right = m49367I(rect2.right, rect.right, rect.left);
        rect2.top = m49367I(rect2.top, rect.bottom, rect.top);
        rect2.bottom = m49367I(rect2.bottom, rect.bottom, rect.top);
        return new MeteringRectangle(rect2, 1000);
    }

    /* JADX INFO: renamed from: H */
    public static boolean m49366H(C5943u1 c5943u1) {
        return c5943u1.m26624c() >= 0.0f && c5943u1.m26624c() <= 1.0f && c5943u1.m26625d() >= 0.0f && c5943u1.m26625d() <= 1.0f;
    }

    /* JADX INFO: renamed from: I */
    public static int m49367I(int i10, int i11, int i12) {
        return Math.min(Math.max(i10, i12), i11);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m49368a(C13536h4 c13536h4, int i10, long j10, TotalCaptureResult totalCaptureResult) {
        c13536h4.getClass();
        if (((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)).intValue() != i10 || !C13658y.m49750e0(totalCaptureResult, j10)) {
            return false;
        }
        c13536h4.m49402t();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m49369b(C13536h4 c13536h4, boolean z10, C12997c.a aVar) {
        c13536h4.f47403a.m49790g0(c13536h4.f47425w);
        c13536h4.f47424v = z10;
        c13536h4.m49405w(aVar);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m49370c(final C13536h4 c13536h4, final C5910m0 c5910m0, final long j10, final C12997c.a aVar) {
        c13536h4.f47404b.execute(new Runnable() { // from class: z.u3
            @Override // java.lang.Runnable
            public final void run() {
                this.f47780a.m49392P(aVar, c5910m0, j10);
            }
        });
        return "startFocusAndMetering";
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ Object m49373f(final C13536h4 c13536h4, final boolean z10, final C12997c.a aVar) {
        c13536h4.f47404b.execute(new Runnable() { // from class: z.g4
            @Override // java.lang.Runnable
            public final void run() {
                C13536h4.m49369b(this.f47350a, z10, aVar);
            }
        });
        return "enableExternalFlashAeMode";
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ boolean m49375h(C13536h4 c13536h4, long j10, C12997c.a aVar, TotalCaptureResult totalCaptureResult) {
        c13536h4.getClass();
        boolean z10 = ((Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_MODE)).intValue() == 5;
        C5931r1.m26561a("FocusMeteringControl", "enableExternalFlashAeMode: isAeModeExternalFlash = " + z10);
        if (z10 != c13536h4.f47424v || !C13658y.m49750e0(totalCaptureResult, j10)) {
            return false;
        }
        C5931r1.m26561a("FocusMeteringControl", "enableExternalFlashAeMode: session updated with isAeModeExternalFlash = " + z10);
        if (aVar != null) {
            aVar.m48314c(null);
        }
        return true;
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Object m49376i(final C13536h4 c13536h4, final C12997c.a aVar) {
        c13536h4.f47404b.execute(new Runnable() { // from class: z.v3
            @Override // java.lang.Runnable
            public final void run() {
                this.f47795a.m49394R(aVar);
            }
        });
        return "triggerAePrecapture";
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m49377j(C13536h4 c13536h4, long j10) {
        if (j10 == c13536h4.f47413k) {
            c13536h4.f47415m = false;
            c13536h4.m49401s(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ boolean m49378k(C13536h4 c13536h4, boolean z10, long j10, TotalCaptureResult totalCaptureResult) {
        c13536h4.getClass();
        Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
        if (c13536h4.m49389M()) {
            if (!z10 || num == null) {
                c13536h4.f47415m = true;
                c13536h4.f47414l = true;
            } else if (c13536h4.f47410h.intValue() == 3) {
                if (num.intValue() == 4) {
                    c13536h4.f47415m = true;
                    c13536h4.f47414l = true;
                } else if (num.intValue() == 5) {
                    c13536h4.f47415m = false;
                    c13536h4.f47414l = true;
                }
            }
        }
        if (c13536h4.f47414l && C13658y.m49750e0(totalCaptureResult, j10)) {
            c13536h4.m49401s(c13536h4.f47415m);
            return true;
        }
        if (!c13536h4.f47410h.equals(num) && num != null) {
            c13536h4.f47410h = num;
        }
        return false;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m49379l(C13536h4 c13536h4, long j10) {
        if (j10 == c13536h4.f47413k) {
            c13536h4.m49399q();
        }
    }

    /* JADX INFO: renamed from: A */
    public int m49381A() {
        return this.f47416n != 3 ? 4 : 3;
    }

    /* JADX INFO: renamed from: B */
    public final Rational m49382B() {
        if (this.f47407e != null) {
            return this.f47407e;
        }
        Rect rectM49767G = this.f47403a.m49767G();
        return new Rational(rectM49767G.width(), rectM49767G.height());
    }

    /* JADX INFO: renamed from: E */
    public final List<MeteringRectangle> m49383E(List<C5943u1> list, int i10, Rational rational, Rect rect, int i11) {
        if (list.isEmpty() || i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        Rational rational2 = new Rational(rect.width(), rect.height());
        for (C5943u1 c5943u1 : list) {
            if (arrayList.size() == i10) {
                break;
            }
            if (m49366H(c5943u1)) {
                MeteringRectangle meteringRectangleM49365D = m49365D(c5943u1, m49364C(c5943u1, rational2, rational, i11, this.f47408f), rect);
                if (meteringRectangleM49365D.getWidth() != 0 && meteringRectangleM49365D.getHeight() != 0) {
                    arrayList.add(meteringRectangleM49365D);
                }
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: F */
    public final boolean m49384F() {
        return this.f47403a.m49778S(1) == 1;
    }

    /* JADX INFO: renamed from: G */
    public boolean m49385G() {
        return this.f47424v;
    }

    /* JADX INFO: renamed from: J */
    public void m49386J(boolean z10) {
        if (z10 == this.f47406d) {
            return;
        }
        this.f47406d = z10;
        if (this.f47406d) {
            return;
        }
        m49399q();
    }

    /* JADX INFO: renamed from: K */
    public void m49387K(Rational rational) {
        this.f47407e = rational;
    }

    /* JADX INFO: renamed from: L */
    public void m49388L(int i10) {
        this.f47416n = i10;
    }

    /* JADX INFO: renamed from: M */
    public final boolean m49389M() {
        return this.f47419q.length > 0;
    }

    /* JADX INFO: renamed from: N */
    public InterfaceFutureC9440x<C5914n0> m49390N(C5910m0 c5910m0) {
        return m49391O(c5910m0, 5000L);
    }

    /* JADX INFO: renamed from: O */
    public InterfaceFutureC9440x<C5914n0> m49391O(final C5910m0 c5910m0, final long j10) {
        return C12997c.m48311a(new C12997c.c() { // from class: z.x3
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13536h4.m49370c(this.f47816a, c5910m0, j10, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: P */
    public void m49392P(C12997c.a<C5914n0> aVar, C5910m0 c5910m0, long j10) {
        if (!this.f47406d) {
            aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
            return;
        }
        Rect rectM49767G = this.f47403a.m49767G();
        Rational rationalM49382B = m49382B();
        List<MeteringRectangle> listM49383E = m49383E(c5910m0.m26530c(), this.f47403a.m49772L(), rationalM49382B, rectM49767G, 1);
        List<MeteringRectangle> listM49383E2 = m49383E(c5910m0.m26529b(), this.f47403a.m49771K(), rationalM49382B, rectM49767G, 2);
        List<MeteringRectangle> listM49383E3 = m49383E(c5910m0.m26531d(), this.f47403a.m49773M(), rationalM49382B, rectM49767G, 4);
        if (listM49383E.isEmpty() && listM49383E2.isEmpty() && listM49383E3.isEmpty()) {
            aVar.m48317f(new IllegalArgumentException("None of the specified AF/AE/AWB MeteringPoints is supported on this camera."));
            return;
        }
        m49407y("Cancelled by another startFocusAndMetering()");
        m49408z("Cancelled by another startFocusAndMetering()");
        m49403u();
        this.f47422t = aVar;
        MeteringRectangle[] meteringRectangleArr = f47402x;
        m49406x((MeteringRectangle[]) listM49383E.toArray(meteringRectangleArr), (MeteringRectangle[]) listM49383E2.toArray(meteringRectangleArr), (MeteringRectangle[]) listM49383E3.toArray(meteringRectangleArr), c5910m0, j10);
    }

    /* JADX INFO: renamed from: Q */
    public InterfaceFutureC9440x<Void> m49393Q() {
        return C12997c.m48311a(new C12997c.c() { // from class: z.f4
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13536h4.m49376i(this.f47290a, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public void m49394R(C12997c.a<Void> aVar) {
        C5931r1.m26561a("FocusMeteringControl", "triggerAePrecapture");
        if (!this.f47406d) {
            if (aVar != null) {
                aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
                return;
            }
            return;
        }
        C8785l1.a aVar2 = new C8785l1.a();
        aVar2.m35273v(this.f47416n);
        aVar2.m35274w(true);
        C12964a.a aVar3 = new C12964a.a();
        aVar3.m48221f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 1);
        aVar2.m35258e(aVar3.m48218b());
        aVar2.m35256c(new b(aVar));
        this.f47403a.m49800q0(Collections.singletonList(aVar2.m35261h()));
    }

    /* JADX INFO: renamed from: S */
    public void m49395S(C12997c.a<InterfaceC8743e0> aVar, boolean z10) {
        if (!this.f47406d) {
            if (aVar != null) {
                aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
                return;
            }
            return;
        }
        C8785l1.a aVar2 = new C8785l1.a();
        aVar2.m35273v(this.f47416n);
        aVar2.m35274w(true);
        C12964a.a aVar3 = new C12964a.a();
        aVar3.m48221f(CaptureRequest.CONTROL_AF_TRIGGER, 1);
        if (z10) {
            aVar3.m48222g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(this.f47403a.m49777Q(1)), InterfaceC8795n1.c.HIGH_PRIORITY_REQUIRED);
        }
        aVar2.m35258e(aVar3.m48218b());
        aVar2.m35256c(new a(aVar));
        this.f47403a.m49800q0(Collections.singletonList(aVar2.m35261h()));
    }

    /* JADX INFO: renamed from: n */
    public void m49396n(C12964a.a aVar) {
        int iM49381A = this.f47409g ? 1 : m49381A();
        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_MODE;
        Integer numValueOf = Integer.valueOf(this.f47403a.m49778S(iM49381A));
        InterfaceC8795n1.c cVar = InterfaceC8795n1.c.REQUIRED;
        aVar.m48222g(key, numValueOf, cVar);
        MeteringRectangle[] meteringRectangleArr = this.f47419q;
        if (meteringRectangleArr.length != 0) {
            aVar.m48222g(CaptureRequest.CONTROL_AF_REGIONS, meteringRectangleArr, cVar);
        }
        MeteringRectangle[] meteringRectangleArr2 = this.f47420r;
        if (meteringRectangleArr2.length != 0) {
            aVar.m48222g(CaptureRequest.CONTROL_AE_REGIONS, meteringRectangleArr2, cVar);
        }
        MeteringRectangle[] meteringRectangleArr3 = this.f47421s;
        if (meteringRectangleArr3.length != 0) {
            aVar.m48222g(CaptureRequest.CONTROL_AWB_REGIONS, meteringRectangleArr3, cVar);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m49397o(boolean z10, boolean z11) {
        if (this.f47406d) {
            C8785l1.a aVar = new C8785l1.a();
            aVar.m35274w(true);
            aVar.m35273v(this.f47416n);
            C12964a.a aVar2 = new C12964a.a();
            if (z10) {
                aVar2.m48221f(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            }
            if (z11) {
                aVar2.m48221f(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, 2);
            }
            aVar.m35258e(aVar2.m48218b());
            this.f47403a.m49800q0(Collections.singletonList(aVar.m35261h()));
        }
    }

    /* JADX INFO: renamed from: p */
    public void m49398p(C12997c.a<Void> aVar) {
        m49408z("Cancelled by another cancelFocusAndMetering()");
        m49407y("Cancelled by cancelFocusAndMetering()");
        this.f47423u = aVar;
        m49403u();
        m49400r();
        if (m49389M()) {
            m49397o(true, false);
        }
        MeteringRectangle[] meteringRectangleArr = f47402x;
        this.f47419q = meteringRectangleArr;
        this.f47420r = meteringRectangleArr;
        this.f47421s = meteringRectangleArr;
        this.f47409g = false;
        final long jM49802s0 = this.f47403a.m49802s0();
        if (this.f47423u != null) {
            final int iM49778S = this.f47403a.m49778S(m49381A());
            C13658y.c cVar = new C13658y.c() { // from class: z.y3
                @Override // p589z.C13658y.c
                /* JADX INFO: renamed from: a */
                public final boolean mo49266a(TotalCaptureResult totalCaptureResult) {
                    return C13536h4.m49368a(this.f47870a, iM49778S, jM49802s0, totalCaptureResult);
                }
            };
            this.f47418p = cVar;
            this.f47403a.m49762B(cVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m49399q() {
        m49398p(null);
    }

    /* JADX INFO: renamed from: r */
    public final void m49400r() {
        ScheduledFuture<?> scheduledFuture = this.f47412j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f47412j = null;
        }
    }

    /* JADX INFO: renamed from: s */
    public void m49401s(boolean z10) {
        m49400r();
        C12997c.a<C5914n0> aVar = this.f47422t;
        if (aVar != null) {
            aVar.m48314c(C5914n0.m26547a(z10));
            this.f47422t = null;
        }
    }

    /* JADX INFO: renamed from: t */
    public final void m49402t() {
        C12997c.a<Void> aVar = this.f47423u;
        if (aVar != null) {
            aVar.m48314c(null);
            this.f47423u = null;
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m49403u() {
        ScheduledFuture<?> scheduledFuture = this.f47411i;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.f47411i = null;
        }
    }

    /* JADX INFO: renamed from: v */
    public InterfaceFutureC9440x<Void> m49404v(final boolean z10) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 28) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in API " + i10);
            return C10773n.m40993p(null);
        }
        if (this.f47403a.m49777Q(5) != 5) {
            Log.d("FocusMeteringControl", "CONTROL_AE_MODE_ON_EXTERNAL_FLASH is not supported in this device");
            return C10773n.m40993p(null);
        }
        Log.d("FocusMeteringControl", "enableExternalFlashAeMode: CONTROL_AE_MODE_ON_EXTERNAL_FLASH supported");
        return C12997c.m48311a(new C12997c.c() { // from class: z.e4
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13536h4.m49373f(this.f47272a, z10, aVar);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final void m49405w(final C12997c.a<Void> aVar) {
        if (!this.f47406d) {
            if (aVar != null) {
                aVar.m48317f(new InterfaceC5909m.a("Camera is not active."));
            }
        } else {
            final long jM49802s0 = this.f47403a.m49802s0();
            C13658y.c cVar = new C13658y.c() { // from class: z.w3
                @Override // p589z.C13658y.c
                /* JADX INFO: renamed from: a */
                public final boolean mo49266a(TotalCaptureResult totalCaptureResult) {
                    return C13536h4.m49375h(this.f47807a, jM49802s0, aVar, totalCaptureResult);
                }
            };
            this.f47425w = cVar;
            this.f47403a.m49762B(cVar);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m49406x(MeteringRectangle[] meteringRectangleArr, MeteringRectangle[] meteringRectangleArr2, MeteringRectangle[] meteringRectangleArr3, C5910m0 c5910m0, long j10) {
        final long jM49802s0;
        this.f47403a.m49790g0(this.f47417o);
        m49403u();
        m49400r();
        this.f47419q = meteringRectangleArr;
        this.f47420r = meteringRectangleArr2;
        this.f47421s = meteringRectangleArr3;
        if (m49389M()) {
            this.f47409g = true;
            this.f47414l = false;
            this.f47415m = false;
            jM49802s0 = this.f47403a.m49802s0();
            m49395S(null, true);
        } else {
            this.f47409g = false;
            this.f47414l = true;
            this.f47415m = false;
            jM49802s0 = this.f47403a.m49802s0();
        }
        this.f47410h = 0;
        final boolean zM49384F = m49384F();
        C13658y.c cVar = new C13658y.c() { // from class: z.z3
            @Override // p589z.C13658y.c
            /* JADX INFO: renamed from: a */
            public final boolean mo49266a(TotalCaptureResult totalCaptureResult) {
                return C13536h4.m49378k(this.f47895a, zM49384F, jM49802s0, totalCaptureResult);
            }
        };
        this.f47417o = cVar;
        this.f47403a.m49762B(cVar);
        final long j11 = this.f47413k + 1;
        this.f47413k = j11;
        Runnable runnable = new Runnable() { // from class: z.a4
            @Override // java.lang.Runnable
            public final void run() {
                C13536h4 c13536h4 = this.f47205a;
                c13536h4.f47404b.execute(new Runnable() { // from class: z.d4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13536h4.m49377j(c13536h4, j);
                    }
                });
            }
        };
        ScheduledExecutorService scheduledExecutorService = this.f47405c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f47412j = scheduledExecutorService.schedule(runnable, j10, timeUnit);
        if (c5910m0.m26532e()) {
            this.f47411i = this.f47405c.schedule(new Runnable() { // from class: z.b4
                @Override // java.lang.Runnable
                public final void run() {
                    C13536h4 c13536h4 = this.f47215a;
                    c13536h4.f47404b.execute(new Runnable() { // from class: z.c4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13536h4.m49379l(c13536h4, j);
                        }
                    });
                }
            }, c5910m0.m26528a(), timeUnit);
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m49407y(String str) {
        this.f47403a.m49790g0(this.f47417o);
        C12997c.a<C5914n0> aVar = this.f47422t;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a(str));
            this.f47422t = null;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m49408z(String str) {
        this.f47403a.m49790g0(this.f47418p);
        C12997c.a<Void> aVar = this.f47423u;
        if (aVar != null) {
            aVar.m48317f(new InterfaceC5909m.a(str));
            this.f47423u = null;
        }
    }
}
