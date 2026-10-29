package p589z;

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
import ne.InterfaceFutureC9440x;
import p001a0.C0008c0;
import p063d0.C4368a;
import p114f0.C5228g;
import p114f0.C5233l;
import p140g0.C5883f1;
import p140g0.C5910m0;
import p140g0.C5914n0;
import p140g0.C5931r1;
import p140g0.InterfaceC5909m;
import p281m0.InterfaceC8308m;
import p296n0.AbstractC8828u;
import p296n0.C8782k3;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p296n0.C8838w;
import p296n0.C8857z3;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8795n1;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.y */
/* JADX INFO: loaded from: classes.dex */
public class C13658y implements InterfaceC8784l0 {

    /* JADX INFO: renamed from: A */
    public int f47835A;

    /* JADX INFO: renamed from: B */
    public long f47836B;

    /* JADX INFO: renamed from: C */
    public final a f47837C;

    /* JADX INFO: renamed from: b */
    public final b f47838b;

    /* JADX INFO: renamed from: c */
    public final Executor f47839c;

    /* JADX INFO: renamed from: d */
    public final Object f47840d = new Object();

    /* JADX INFO: renamed from: e */
    public final C0008c0 f47841e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8784l0.d f47842f;

    /* JADX INFO: renamed from: g */
    public final C8802o3.b f47843g;

    /* JADX INFO: renamed from: h */
    public final C13536h4 f47844h;

    /* JADX INFO: renamed from: i */
    public final C13530g6 f47845i;

    /* JADX INFO: renamed from: j */
    public final C13657x5 f47846j;

    /* JADX INFO: renamed from: k */
    public final C13607q4 f47847k;

    /* JADX INFO: renamed from: l */
    public final C13620s3 f47848l;

    /* JADX INFO: renamed from: m */
    public InterfaceC13546i6 f47849m;

    /* JADX INFO: renamed from: n */
    public final C5228g f47850n;

    /* JADX INFO: renamed from: o */
    public final C13525g1 f47851o;

    /* JADX INFO: renamed from: p */
    public final C13490b6 f47852p;

    /* JADX INFO: renamed from: q */
    public int f47853q;

    /* JADX INFO: renamed from: r */
    public C5883f1.j f47854r;

    /* JADX INFO: renamed from: s */
    public volatile int f47855s;

    /* JADX INFO: renamed from: t */
    public volatile int f47856t;

    /* JADX INFO: renamed from: u */
    public volatile boolean f47857u;

    /* JADX INFO: renamed from: v */
    public volatile int f47858v;

    /* JADX INFO: renamed from: w */
    public final C4368a f47859w;

    /* JADX INFO: renamed from: x */
    public boolean f47860x;

    /* JADX INFO: renamed from: y */
    public final AtomicLong f47861y;

    /* JADX INFO: renamed from: z */
    public volatile InterfaceFutureC9440x<Void> f47862z;

    /* JADX INFO: renamed from: z.y$a */
    public static final class a extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public Set<AbstractC8828u> f47863a = new HashSet();

        /* JADX INFO: renamed from: b */
        public Map<AbstractC8828u, Executor> f47864b = new ArrayMap();

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: a */
        public void mo35425a(final int i10) {
            for (final AbstractC8828u abstractC8828u : this.f47863a) {
                try {
                    this.f47864b.get(abstractC8828u).execute(new Runnable() { // from class: z.x
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC8828u.mo35425a(i10);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C5931r1.m26564d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e10);
                }
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(final int i10, final InterfaceC8743e0 interfaceC8743e0) {
            for (final AbstractC8828u abstractC8828u : this.f47863a) {
                try {
                    this.f47864b.get(abstractC8828u).execute(new Runnable() { // from class: z.w
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC8828u.mo2221b(i10, interfaceC8743e0);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C5931r1.m26564d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e10);
                }
            }
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: c */
        public void mo35426c(final int i10, final C8838w c8838w) {
            for (final AbstractC8828u abstractC8828u : this.f47863a) {
                try {
                    this.f47864b.get(abstractC8828u).execute(new Runnable() { // from class: z.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC8828u.mo35426c(i10, c8838w);
                        }
                    });
                } catch (RejectedExecutionException e10) {
                    C5931r1.m26564d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e10);
                }
            }
        }

        /* JADX INFO: renamed from: h */
        public void m49807h(Executor executor, AbstractC8828u abstractC8828u) {
            this.f47863a.add(abstractC8828u);
            this.f47864b.put(abstractC8828u, executor);
        }

        /* JADX INFO: renamed from: i */
        public void m49808i(AbstractC8828u abstractC8828u) {
            this.f47863a.remove(abstractC8828u);
            this.f47864b.remove(abstractC8828u);
        }
    }

    /* JADX INFO: renamed from: z.y$b */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a */
        public final Set<c> f47865a = new HashSet();

        /* JADX INFO: renamed from: b */
        public final Executor f47866b;

        public b(Executor executor) {
            this.f47866b = executor;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m49809a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f47865a) {
                if (cVar.mo49266a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f47865a.removeAll(hashSet);
        }

        /* JADX INFO: renamed from: b */
        public void m49810b(c cVar) {
            this.f47865a.add(cVar);
        }

        /* JADX INFO: renamed from: c */
        public void m49811c(c cVar) {
            this.f47865a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f47866b.execute(new Runnable() { // from class: z.z
                @Override // java.lang.Runnable
                public final void run() {
                    C13658y.b.m49809a(this.f47874a, totalCaptureResult);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z.y$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        boolean mo49266a(TotalCaptureResult totalCaptureResult);
    }

    public C13658y(C0008c0 c0008c0, ScheduledExecutorService scheduledExecutorService, Executor executor, InterfaceC8784l0.d dVar, C8782k3 c8782k3) {
        C8802o3.b bVar = new C8802o3.b();
        this.f47843g = bVar;
        this.f47853q = 0;
        this.f47855s = 0;
        this.f47857u = false;
        this.f47858v = 2;
        this.f47860x = true;
        this.f47861y = new AtomicLong(0L);
        this.f47862z = C10773n.m40993p(null);
        this.f47835A = 1;
        this.f47836B = 0L;
        a aVar = new a();
        this.f47837C = aVar;
        this.f47841e = c0008c0;
        this.f47842f = dVar;
        this.f47839c = executor;
        this.f47852p = new C13490b6(executor);
        b bVar2 = new b(executor);
        this.f47838b = bVar2;
        bVar.m35314B(this.f47835A);
        bVar.m35325j(C13495c3.m49188e(bVar2));
        bVar.m35325j(aVar);
        this.f47848l = new C13620s3(this, c0008c0, executor);
        this.f47844h = new C13536h4(this, scheduledExecutorService, executor, c8782k3);
        this.f47845i = new C13530g6(this, c0008c0, executor);
        this.f47846j = new C13657x5(this, c0008c0, executor);
        this.f47856t = c0008c0.m11c();
        this.f47847k = new C13607q4(this, c0008c0, executor);
        this.f47849m = new C13578m6(c0008c0, executor);
        this.f47859w = new C4368a(c8782k3);
        this.f47850n = new C5228g(this, executor);
        this.f47851o = new C13525g1(this, c0008c0, c8782k3, executor, scheduledExecutorService);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ boolean m49747A(long j10, C12997c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!m49750e0(totalCaptureResult, j10)) {
            return false;
        }
        aVar.m48314c(null);
        return true;
    }

    /* JADX INFO: renamed from: R */
    public static int m49748R(C0008c0 c0008c0, int i10) {
        int[] iArr = (int[]) c0008c0.m9a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m49749c0(i10, iArr)) {
            return i10;
        }
        return m49749c0(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: renamed from: c0 */
    public static boolean m49749c0(int i10, int[] iArr) {
        for (int i11 : iArr) {
            if (i10 == i11) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m49750e0(TotalCaptureResult totalCaptureResult, long j10) {
        Long l10;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof C8857z3) && (l10 = (Long) ((C8857z3) tag).m35564d("CameraControlSessionUpdateId")) != null && l10.longValue() >= j10;
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Object m49751p(final C13658y c13658y, final C12997c.a aVar) {
        c13658y.getClass();
        try {
            c13658y.f47839c.execute(new Runnable() { // from class: z.n
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.m48314c(Boolean.valueOf(this.f47550a.f47860x));
                }
            });
            return "isRepeatingRequestAvailable";
        } catch (RejectedExecutionException unused) {
            aVar.m48317f(new RuntimeException("Unable to check if repeating request is available. Camera executor shut down."));
            return "isRepeatingRequestAvailable";
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ void m49752q() {
    }

    /* JADX INFO: renamed from: r */
    public static /* synthetic */ void m49753r() {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ Object m49757v(C13658y c13658y, final long j10, final C12997c.a aVar) {
        c13658y.getClass();
        c13658y.m49762B(new c() { // from class: z.p
            @Override // p589z.C13658y.c
            /* JADX INFO: renamed from: a */
            public final boolean mo49266a(TotalCaptureResult totalCaptureResult) {
                return C13658y.m49747A(j10, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j10;
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Object m49759x(final C13658y c13658y, final C12997c.a aVar) {
        c13658y.f47839c.execute(new Runnable() { // from class: z.m
            @Override // java.lang.Runnable
            public final void run() {
                C13658y c13658y2 = this.f47513a;
                C10773n.m40997t(c13658y2.m49803t0(c13658y2.m49802s0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    /* JADX INFO: renamed from: B */
    public void m49762B(c cVar) {
        this.f47838b.m49810b(cVar);
    }

    /* JADX INFO: renamed from: C */
    public void m49763C(final Executor executor, final AbstractC8828u abstractC8828u) {
        this.f47839c.execute(new Runnable() { // from class: z.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f47672a.f47837C.m49807h(executor, abstractC8828u);
            }
        });
    }

    /* JADX INFO: renamed from: D */
    public void m49764D() {
        synchronized (this.f47840d) {
            try {
                int i10 = this.f47853q;
                if (i10 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f47853q = i10 - 1;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public void m49765E(boolean z10) {
        if (this.f47857u == z10) {
            return;
        }
        if (z10 && m49789f0()) {
            m49792i0();
            this.f47855s = 0;
            this.f47846j.m49741f();
        }
        this.f47857u = z10;
        m49802s0();
    }

    /* JADX INFO: renamed from: F */
    public void m49766F(int i10) {
        if (this.f47857u) {
            return;
        }
        this.f47855s = i10;
        if (i10 == 0) {
            m49792i0();
        }
        m49802s0();
    }

    /* JADX INFO: renamed from: G */
    public Rect m49767G() {
        return this.f47845i.m49357g();
    }

    /* JADX INFO: renamed from: H */
    public int m49768H() {
        return this.f47858v;
    }

    /* JADX INFO: renamed from: I */
    public C13536h4 m49769I() {
        return this.f47844h;
    }

    /* JADX INFO: renamed from: J */
    public C13607q4 m49770J() {
        return this.f47847k;
    }

    /* JADX INFO: renamed from: K */
    public int m49771K() {
        Integer num = (Integer) this.f47841e.m9a(CameraCharacteristics.CONTROL_MAX_REGIONS_AE);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: L */
    public int m49772L() {
        Integer num = (Integer) this.f47841e.m9a(CameraCharacteristics.CONTROL_MAX_REGIONS_AF);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: M */
    public int m49773M() {
        Integer num = (Integer) this.f47841e.m9a(CameraCharacteristics.CONTROL_MAX_REGIONS_AWB);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX INFO: renamed from: N */
    public C5883f1.j m49774N() {
        return this.f47854r;
    }

    /* JADX INFO: renamed from: O */
    public C8802o3 m49775O() {
        this.f47843g.m35314B(this.f47835A);
        this.f47843g.m35337w(m49776P());
        this.f47843g.m35330o("CameraControlSessionUpdateId", Long.valueOf(this.f47836B));
        return this.f47843g.m35331p();
    }

    /* JADX INFO: renamed from: P */
    public InterfaceC8795n1 m49776P() {
        C12964a.a aVar = new C12964a.a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        InterfaceC8795n1.c cVar = InterfaceC8795n1.c.REQUIRED;
        aVar.m48222g(key, 1, cVar);
        this.f47844h.m49396n(aVar);
        this.f47845i.m49356e(aVar);
        int iM22023a = this.f47844h.m49385G() ? 5 : 1;
        if (this.f47857u) {
            iM22023a = 6;
        } else if (m49789f0()) {
            aVar.m48222g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f47855s == 1) {
                    aVar.m48222g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f47856t), cVar);
                } else if (this.f47855s == 2) {
                    aVar.m48222g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f47841e.m11c()), cVar);
                }
            }
        } else {
            int i10 = this.f47858v;
            if (i10 == 0) {
                iM22023a = this.f47859w.m22023a(2);
            } else if (i10 == 1) {
                iM22023a = 3;
            } else if (i10 == 2) {
                iM22023a = 1;
            }
        }
        aVar.m48222g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m49777Q(iM22023a)), cVar);
        aVar.m48222g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(m49779T(1)), cVar);
        this.f47848l.m49607c(aVar);
        this.f47850n.m24198i(aVar);
        return aVar.m48218b();
    }

    /* JADX INFO: renamed from: Q */
    public int m49777Q(int i10) {
        return m49748R(this.f47841e, i10);
    }

    /* JADX INFO: renamed from: S */
    public int m49778S(int i10) {
        int[] iArr = (int[]) this.f47841e.m9a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m49749c0(i10, iArr)) {
            return i10;
        }
        if (m49749c0(4, iArr)) {
            return 4;
        }
        return m49749c0(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: renamed from: T */
    public final int m49779T(int i10) {
        int[] iArr = (int[]) this.f47841e.m9a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (m49749c0(i10, iArr)) {
            return i10;
        }
        return m49749c0(1, iArr) ? 1 : 0;
    }

    /* JADX INFO: renamed from: U */
    public C13657x5 m49780U() {
        return this.f47846j;
    }

    /* JADX INFO: renamed from: V */
    public int m49781V() {
        int i10;
        synchronized (this.f47840d) {
            i10 = this.f47853q;
        }
        return i10;
    }

    /* JADX INFO: renamed from: W */
    public C13530g6 m49782W() {
        return this.f47845i;
    }

    /* JADX INFO: renamed from: X */
    public InterfaceC13546i6 m49783X() {
        return this.f47849m;
    }

    /* JADX INFO: renamed from: Y */
    public void m49784Y() {
        synchronized (this.f47840d) {
            this.f47853q++;
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m49785Z() {
        return m49781V() > 0;
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: a */
    public void mo35010a(C8802o3.b bVar) {
        this.f47849m.mo49452a(bVar);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m49786a0() {
        int iM49178e = this.f47852p.m49178e();
        C5931r1.m26561a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iM49178e);
        return iM49178e > 0;
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: b */
    public void mo35011b() {
        this.f47849m.mo49453b();
    }

    /* JADX INFO: renamed from: b0 */
    public boolean m49787b0() {
        return this.f47857u;
    }

    @Override // p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: c */
    public InterfaceFutureC9440x<Void> mo26524c(boolean z10) {
        return !m49785Z() ? C10773n.m40991n(new InterfaceC5909m.a("Camera is not active.")) : C10773n.m40996s(this.f47846j.m49739d(z10));
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: d */
    public void mo35012d() {
        this.f47852p.m49177c();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v3, resolved type: V */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d0 */
    public final boolean m49788d0() {
        try {
            return ((Boolean) C12997c.m48311a(new C12997c.c() { // from class: z.s
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13658y.m49751p(this.f47660a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e10) {
            throw new RuntimeException("Unable to check if repeating request is available.", e10);
        }
    }

    @Override // p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: e */
    public InterfaceFutureC9440x<Void> mo26525e(float f10) {
        return !m49785Z() ? C10773n.m40991n(new InterfaceC5909m.a("Camera is not active.")) : C10773n.m40996s(this.f47845i.m49360m(f10));
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<List<Void>> mo6745f(final List<C8785l1> list, final int i10, final int i11) {
        if (m49785Z()) {
            final int iM49768H = m49768H();
            return C10763d.m40973c(C10773n.m40996s(this.f47862z)).m40977g(new InterfaceC10760a() { // from class: z.q
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return this.f47599a.f47851o.m49243h(list, i10, iM49768H, i11);
                }
            }, this.f47839c);
        }
        C5931r1.m26572l("Camera2CameraControlImp", "Camera is not active.");
        return C10773n.m40991n(new InterfaceC5909m.a("Camera is not active."));
    }

    /* JADX INFO: renamed from: f0 */
    public boolean m49789f0() {
        return this.f47855s != 0;
    }

    @Override // p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: g */
    public InterfaceFutureC9440x<Void> mo26526g(float f10) {
        return !m49785Z() ? C10773n.m40991n(new InterfaceC5909m.a("Camera is not active.")) : C10773n.m40996s(this.f47845i.m49361n(f10));
    }

    /* JADX INFO: renamed from: g0 */
    public void m49790g0(c cVar) {
        this.f47838b.m49811c(cVar);
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: h */
    public void mo35013h(C5883f1.j jVar) {
        this.f47854r = jVar;
    }

    /* JADX INFO: renamed from: h0 */
    public void m49791h0(final AbstractC8828u abstractC8828u) {
        this.f47839c.execute(new Runnable() { // from class: z.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f47451a.f47837C.m49808i(abstractC8828u);
            }
        });
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: i */
    public void mo35014i(int i10) {
        if (!m49785Z()) {
            C5931r1.m26572l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f47858v = i10;
        C5931r1.m26561a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f47858v);
        InterfaceC13546i6 interfaceC13546i6 = this.f47849m;
        boolean z10 = true;
        if (this.f47858v != 1 && this.f47858v != 0) {
            z10 = false;
        }
        interfaceC13546i6.mo49455d(z10);
        this.f47862z = m49801r0();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m49792i0() {
        C8785l1.a aVar = new C8785l1.a();
        aVar.m35273v(this.f47835A);
        aVar.m35274w(true);
        C12964a.a aVar2 = new C12964a.a();
        aVar2.m48221f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(m49777Q(1)));
        aVar2.m48221f(CaptureRequest.FLASH_MODE, 0);
        aVar.m35258e(aVar2.m48218b());
        m49800q0(Collections.singletonList(aVar.m35261h()));
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: j */
    public InterfaceC8795n1 mo35015j() {
        return this.f47850n.m24203n();
    }

    /* JADX INFO: renamed from: j0 */
    public void m49793j0() {
        m49798o0(1);
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: k */
    public void mo35016k() {
        this.f47852p.m49179f();
    }

    /* JADX INFO: renamed from: k0 */
    public void m49794k0(boolean z10) {
        C5931r1.m26561a("Camera2CameraControlImp", "setActive: isActive = " + z10);
        this.f47844h.m49386J(z10);
        this.f47845i.m49359l(z10);
        this.f47847k.m49584d(z10);
        this.f47846j.m49744i(z10);
        this.f47848l.m49606b(z10);
        this.f47850n.m24204o(z10);
        if (z10) {
            return;
        }
        this.f47854r = null;
        this.f47852p.m49180h();
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: l */
    public void mo35017l(InterfaceC8795n1 interfaceC8795n1) {
        this.f47850n.m24196g(C5233l.a.m24215d(interfaceC8795n1).m24216c()).mo37173a(new Runnable() { // from class: z.u
            @Override // java.lang.Runnable
            public final void run() {
                C13658y.m49752q();
            }
        }, C10417c.m40081b());
    }

    /* JADX INFO: renamed from: l0 */
    public void m49795l0(boolean z10) {
        this.f47860x = z10;
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: m */
    public InterfaceFutureC9440x<InterfaceC8308m> mo35018m(final int i10, final int i11) {
        if (m49785Z()) {
            final int iM49768H = m49768H();
            return C10763d.m40973c(C10773n.m40996s(this.f47862z)).m40977g(new InterfaceC10760a() { // from class: z.r
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C10773n.m40993p(this.f47636a.f47851o.m49240c(i10, iM49768H, i11));
                }
            }, this.f47839c);
        }
        C5931r1.m26572l("Camera2CameraControlImp", "Camera is not active.");
        return C10773n.m40991n(new InterfaceC5909m.a("Camera is not active."));
    }

    /* JADX INFO: renamed from: m0 */
    public void m49796m0(boolean z10) {
        this.f47847k.m49586f(z10);
    }

    @Override // p296n0.InterfaceC8784l0
    /* JADX INFO: renamed from: n */
    public void mo35019n() {
        this.f47850n.m24199j().mo37173a(new Runnable() { // from class: z.l
            @Override // java.lang.Runnable
            public final void run() {
                C13658y.m49753r();
            }
        }, C10417c.m40081b());
    }

    /* JADX INFO: renamed from: n0 */
    public void m49797n0(Rational rational) {
        this.f47844h.m49387K(rational);
    }

    @Override // p140g0.InterfaceC5909m
    /* JADX INFO: renamed from: o */
    public InterfaceFutureC9440x<C5914n0> mo26527o(C5910m0 c5910m0) {
        if (m49785Z()) {
            return !m49788d0() ? C10773n.m40991n(new InterfaceC5909m.a("Repeating request is not available possibly because it's disable for the ImageCapture.")) : C10773n.m40996s(this.f47844h.m49390N(c5910m0));
        }
        return C10773n.m40991n(new InterfaceC5909m.a("Camera is not active."));
    }

    /* JADX INFO: renamed from: o0 */
    public void m49798o0(int i10) {
        this.f47835A = i10;
        this.f47844h.m49388L(i10);
        this.f47851o.m49242g(this.f47835A);
    }

    /* JADX INFO: renamed from: p0 */
    public void m49799p0(boolean z10) {
        this.f47849m.mo49456e(z10);
    }

    /* JADX INFO: renamed from: q0 */
    public void m49800q0(List<C8785l1> list) {
        this.f47842f.mo35237b(list);
    }

    /* JADX INFO: renamed from: r0 */
    public InterfaceFutureC9440x<Void> m49801r0() {
        return C10773n.m40996s(C12997c.m48311a(new C12997c.c() { // from class: z.k
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13658y.m49759x(this.f47463a, aVar);
            }
        }));
    }

    /* JADX INFO: renamed from: s0 */
    public long m49802s0() {
        this.f47836B = this.f47861y.getAndIncrement();
        this.f47842f.mo35236a();
        return this.f47836B;
    }

    /* JADX INFO: renamed from: t0 */
    public final InterfaceFutureC9440x<Void> m49803t0(final long j10) {
        return C12997c.m48311a(new C12997c.c() { // from class: z.o
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13658y.m49757v(this.f47575a, j10, aVar);
            }
        });
    }
}
