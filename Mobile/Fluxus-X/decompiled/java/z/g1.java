package z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public class g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f38310a;
    public final d0.b0 b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38311c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0.k3 f38312d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f38313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f38314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f38315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38316h = 1;

    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f38317a;
        public final d0.n b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f38318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f38319d = false;

        public a(y yVar, int i10, d0.n nVar) {
            this.f38317a = yVar;
            this.f38318c = i10;
            this.b = nVar;
        }

        public static /* synthetic */ Object e(a aVar, y1.c.a aVar2) {
            aVar.f38317a.I().R(aVar2);
            aVar.b.b();
            return "AePreCapture";
        }

        @Override // z.g1.e
        public pe.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            if (this.f38317a.b0() || !g1.e(this.f38318c, totalCaptureResult)) {
                return r0.n.p(Boolean.FALSE);
            }
            g0.r1.a("Camera2CapturePipeline", "Trigger AE");
            this.f38319d = true;
            return r0.d.c(y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.e1
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return g1.a.e(this.f38287a, aVar);
                }
            })).f(new t.a() { // from class: z.f1
                @Override // t.a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, q0.c.b());
        }

        @Override // z.g1.e
        public boolean b() {
            return this.f38318c == 0;
        }

        @Override // z.g1.e
        public void c() {
            if (this.f38319d) {
                g0.r1.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f38317a.I().o(false, true);
                this.b.a();
            }
        }
    }

    public static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f38320a;
        public boolean b = false;

        public b(y yVar) {
            this.f38320a = yVar;
        }

        @Override // z.g1.e
        public pe.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            pe.x<Boolean> xVarP = r0.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                g0.r1.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    g0.r1.a("Camera2CapturePipeline", "Trigger AF");
                    this.b = true;
                    this.f38320a.I().S(null, false);
                }
            }
            return xVarP;
        }

        @Override // z.g1.e
        public boolean b() {
            return true;
        }

        @Override // z.g1.e
        public void c() {
            if (this.b) {
                g0.r1.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f38320a.I().o(true, false);
            }
        }
    }

    public static class c implements m0.m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f38321a;
        public final d b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f38322c;

        public c(d dVar, Executor executor, int i10) {
            this.b = dVar;
            this.f38321a = executor;
            this.f38322c = i10;
        }

        public static /* synthetic */ Object c(c cVar, y1.c.a aVar) {
            cVar.b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // m0.m
        public pe.x<Void> a() {
            g0.r1.a("Camera2CapturePipeline", "invokePreCapture");
            return r0.d.c(this.b.k(this.f38322c)).f(new t.a() { // from class: z.i1
                @Override // t.a
                public final Object apply(Object obj) {
                    return g1.c.d((TotalCaptureResult) obj);
                }
            }, this.f38321a);
        }

        @Override // m0.m
        public pe.x<Void> b() {
            return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.h1
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return g1.c.c(this.f38389a, aVar);
                }
            });
        }
    }

    public static class d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final long f38323j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final long f38324k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f38325a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f38326c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final y f38327d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d0.n f38328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f38329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f38330g = f38323j;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List<e> f38331h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e f38332i = new a();

        public class a implements e {
            public a() {
            }

            @Override // z.g1.e
            public pe.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f38331h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().a(totalCaptureResult));
                }
                return r0.n.x(r0.n.k(arrayList), new t.a() { // from class: z.p1
                    @Override // t.a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, q0.c.b());
            }

            @Override // z.g1.e
            public boolean b() {
                Iterator<e> it = d.this.f38331h.iterator();
                while (it.hasNext()) {
                    if (it.next().b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // z.g1.e
            public void c() {
                Iterator<e> it = d.this.f38331h.iterator();
                while (it.hasNext()) {
                    it.next().c();
                }
            }
        }

        public class b extends n0.u {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ y1.c.a f38334a;

            public b(y1.c.a aVar) {
                this.f38334a = aVar;
            }

            @Override // n0.u
            public void a(int i10) {
                this.f38334a.f(new g0.h1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // n0.u
            public void b(int i10, n0.e0 e0Var) {
                this.f38334a.c(null);
            }

            @Override // n0.u
            public void c(int i10, n0.w wVar) {
                this.f38334a.f(new g0.h1(2, "Capture request failed with reason " + wVar.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f38323j = timeUnit.toNanos(1L);
            f38324k = timeUnit.toNanos(5L);
        }

        public d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, y yVar, boolean z10, d0.n nVar) {
            this.f38325a = i10;
            this.b = executor;
            this.f38326c = scheduledExecutorService;
            this.f38327d = yVar;
            this.f38329f = z10;
            this.f38328e = nVar;
        }

        public static /* synthetic */ pe.x a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            if (!dVar.f38327d.b0() && g1.e(i10, totalCaptureResult)) {
                dVar.l(f38324k);
            }
            return dVar.f38332i.a(totalCaptureResult);
        }

        public static /* synthetic */ pe.x d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? g1.i(dVar.f38330g, dVar.f38326c, dVar.f38327d, new f.a() { // from class: z.o1
                @Override // z.g1.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return g1.d(totalCaptureResult, false);
                }
            }) : r0.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, n0.l1.a aVar, y1.c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        public void f(e eVar) {
            this.f38331h.add(eVar);
        }

        public final void g(n0.l1.a aVar) {
            y.a.C0758a c0758a = new y.a.C0758a();
            c0758a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0758a.b());
        }

        public final void h(n0.l1.a aVar, n0.l1 l1Var) {
            int i10;
            if (this.f38325a != 3 || this.f38329f) {
                i10 = (l1Var.k() == -1 || l1Var.k() == 5) ? 2 : -1;
            } else {
                i10 = 4;
            }
            if (i10 != -1) {
                aVar.v(i10);
            }
            g0.r1.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i10);
        }

        public pe.x<List<Void>> i(final List<n0.l1> list, final int i10) {
            r0.d dVarG = r0.d.c(k(i10)).g(new r0.a() { // from class: z.j1
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return this.f38435a.m(list, i10);
                }
            }, this.b);
            dVarG.a(new Runnable() { // from class: z.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38443a.j();
                }
            }, this.b);
            return dVarG;
        }

        public void j() {
            this.f38332i.c();
        }

        public pe.x<TotalCaptureResult> k(final int i10) {
            pe.x<TotalCaptureResult> xVarP = r0.n.p(null);
            if (this.f38331h.isEmpty()) {
                return xVarP;
            }
            return r0.d.c(this.f38332i.b() ? g1.j(this.f38327d, null) : r0.n.p(null)).g(new r0.a() { // from class: z.m1
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return g1.d.a(this.f38487a, i10, (TotalCaptureResult) obj);
                }
            }, this.b).g(new r0.a() { // from class: z.n1
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return g1.d.d(this.f38516a, (Boolean) obj);
                }
            }, this.b);
        }

        public final void l(long j10) {
            this.f38330g = j10;
        }

        public pe.x<List<Void>> m(List<n0.l1> list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (n0.l1 l1Var : list) {
                final n0.l1.a aVarK = n0.l1.a.k(l1Var);
                n0.e0 e0VarA = null;
                if (l1Var.k() == 5 && !this.f38327d.X().h() && !this.f38327d.X().a()) {
                    androidx.camera.core.d dVarF = this.f38327d.X().f();
                    if (dVarF != null) {
                        if (this.f38327d.X().g(dVarF)) {
                            e0VarA = n0.f0.a(dVarF.L2());
                        } else {
                            g0.r1.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (e0VarA == null) {
                            dVarF.close();
                        }
                    } else {
                        g0.r1.a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (e0VarA != null) {
                    aVarK.p(e0VarA);
                } else {
                    h(aVarK, l1Var);
                }
                if (this.f38328e.c(i10)) {
                    g(aVarK);
                }
                arrayList.add(y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.l1
                    @Override // y1.c.InterfaceC0761c
                    public final Object a(y1.c.a aVar) {
                        return g1.d.e(this.f38478a, aVarK, aVar);
                    }
                }));
                arrayList2.add(aVarK.h());
            }
            this.f38327d.q0(arrayList2);
            return r0.n.k(arrayList);
        }
    }

    public interface e {
        pe.x<Boolean> a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    public static class f implements y.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public y1.c.a<TotalCaptureResult> f38335a;
        public final pe.x<TotalCaptureResult> b = y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.q1
            @Override // y1.c.InterfaceC0761c
            public final Object a(y1.c.a aVar) {
                return g1.f.b(this.f38558a, aVar);
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f38336c;

        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            this.f38336c = aVar;
        }

        public static /* synthetic */ Object b(f fVar, y1.c.a aVar) {
            fVar.f38335a = aVar;
            return "waitFor3AResult";
        }

        @Override // z.y.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f38336c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f38335a.c(totalCaptureResult);
            return true;
        }

        public pe.x<TotalCaptureResult> c() {
            return this.b;
        }
    }

    public static class g implements e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f38337f = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f38338a;
        public final Executor b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f38339c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final g0.f1.j f38340d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final d0.a0 f38341e;

        public g(y yVar, Executor executor, ScheduledExecutorService scheduledExecutorService, d0.a0 a0Var) {
            this.f38338a = yVar;
            this.b = executor;
            this.f38339c = scheduledExecutorService;
            this.f38341e = a0Var;
            g0.f1.j jVarN = yVar.N();
            Objects.requireNonNull(jVarN);
            this.f38340d = jVarN;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, y1.c.a aVar) {
            gVar.getClass();
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f38340d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (g0.f1.k) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ pe.x h(final g gVar, Void r10) {
            gVar.getClass();
            return y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.s1
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return g1.g.l(this.f38607a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final y1.c.a aVar) {
            gVar.getClass();
            q0.c.e().execute(new Runnable() { // from class: z.t1
                @Override // java.lang.Runnable
                public final void run() {
                    g1.g.d(this.f38619a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void k(y1.c.a aVar) {
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, y1.c.a aVar) {
            if (!gVar.f38341e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f38338a.F(2);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final y1.c.a aVar) {
            atomicReference.set(new g0.f1.k() { // from class: z.v1
                @Override // g0.f1.k
                public final void a() {
                    g1.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ pe.x p(g gVar, pe.x xVar, Object obj) {
            gVar.getClass();
            return r0.n.q(TimeUnit.SECONDS.toMillis(3L), gVar.f38339c, null, true, xVar);
        }

        @Override // z.g1.e
        public pe.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final pe.x xVarA = y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.x1
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return g1.g.n(atomicReference, aVar);
                }
            });
            return r0.d.c(y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.y1
                @Override // y1.c.InterfaceC0761c
                public final Object a(y1.c.a aVar) {
                    return g1.g.j(this.f38759a, atomicReference, aVar);
                }
            })).g(new r0.a() { // from class: z.z1
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return this.f38778a.f38338a.I().v(true);
                }
            }, this.b).g(new r0.a() { // from class: z.a2
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return g1.g.h(this.f38237a, (Void) obj);
                }
            }, this.b).g(new r0.a() { // from class: z.b2
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return g1.g.p(this.f38243a, xVarA, obj);
                }
            }, this.b).g(new r0.a() { // from class: z.c2
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    return this.f38258a.f38338a.I().Q();
                }
            }, this.b).g(new r0.a() { // from class: z.d2
                @Override // r0.a
                public final pe.x apply(Object obj) {
                    g1.g gVar = this.f38274a;
                    return g1.i(g1.g.f38337f, gVar.f38339c, gVar.f38338a, new g1.f.a() { // from class: z.u1
                        @Override // z.g1.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return g1.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.b).f(new t.a() { // from class: z.e2
                @Override // t.a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, q0.c.b());
        }

        @Override // z.g1.e
        public boolean b() {
            return false;
        }

        @Override // z.g1.e
        public void c() {
            g0.r1.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f38341e.a()) {
                this.f38338a.F(0);
            }
            this.f38338a.I().v(false).a(new Runnable() { // from class: z.r1
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.b);
            this.f38338a.I().o(false, true);
            ScheduledExecutorService scheduledExecutorServiceE = q0.c.e();
            final g0.f1.j jVar = this.f38340d;
            Objects.requireNonNull(jVar);
            scheduledExecutorServiceE.execute(new Runnable() { // from class: z.w1
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.clear();
                }
            });
        }
    }

    public static class h implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f38342g = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y f38343a;
        public final int b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f38344c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Executor f38345d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f38346e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f38347f;

        public h(y yVar, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f38343a = yVar;
            this.b = i10;
            this.f38345d = executor;
            this.f38346e = scheduledExecutorService;
            this.f38347f = z10;
        }

        public static /* synthetic */ pe.x d(h hVar, Void r10) {
            return hVar.f38347f ? hVar.f38343a.I().Q() : r0.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, y1.c.a aVar) {
            hVar.f38343a.U().e(aVar, 2);
            return "TorchOn";
        }

        @Override // z.g1.e
        public pe.x<Boolean> a(TotalCaptureResult totalCaptureResult) {
            g0.r1.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + g1.e(this.b, totalCaptureResult));
            if (g1.e(this.b, totalCaptureResult)) {
                if (this.f38343a.b0()) {
                    g0.r1.a("Camera2CapturePipeline", "Low-light boost already on, not turn on");
                } else {
                    if (!this.f38343a.f0()) {
                        g0.r1.a("Camera2CapturePipeline", "Turn on torch");
                        this.f38344c = true;
                        return r0.d.c(y1.c.a(new y1.c.InterfaceC0761c() { // from class: z.f2
                            @Override // y1.c.InterfaceC0761c
                            public final Object a(y1.c.a aVar) {
                                return g1.h.e(this.f38301a, aVar);
                            }
                        })).g(new r0.a() { // from class: z.g2
                            @Override // r0.a
                            public final pe.x apply(Object obj) {
                                return g1.h.d(this.f38348a, (Void) obj);
                            }
                        }, this.f38345d).g(new r0.a() { // from class: z.h2
                            @Override // r0.a
                            public final pe.x apply(Object obj) {
                                g1.h hVar = this.f38390a;
                                return g1.i(g1.h.f38342g, hVar.f38346e, hVar.f38343a, new g1.f.a() { // from class: z.j2
                                    @Override // z.g1.f.a
                                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                        return g1.d(totalCaptureResult2, true);
                                    }
                                });
                            }
                        }, this.f38345d).f(new t.a() { // from class: z.i2
                            @Override // t.a
                            public final Object apply(Object obj) {
                                return Boolean.FALSE;
                            }
                        }, q0.c.b());
                    }
                    g0.r1.a("Camera2CapturePipeline", "Torch already on, not turn on");
                }
            }
            return r0.n.p(Boolean.FALSE);
        }

        @Override // z.g1.e
        public boolean b() {
            return this.b == 0;
        }

        @Override // z.g1.e
        public void c() {
            if (this.f38344c) {
                this.f38343a.U().e(null, 0);
                g0.r1.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f38347f) {
                    this.f38343a.I().o(false, true);
                }
            }
        }
    }

    public g1(y yVar, a0.c0 c0Var, n0.k3 k3Var, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f38310a = yVar;
        Integer num = (Integer) c0Var.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f38315g = num != null && num.intValue() == 2;
        this.f38313e = executor;
        this.f38314f = scheduledExecutorService;
        this.f38312d = k3Var;
        this.b = new d0.b0(k3Var);
        this.f38311c = d0.g.a(new d1(c0Var));
    }

    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return n0.q1.a(new z.h(totalCaptureResult), z10);
    }

    public static boolean e(int i10, TotalCaptureResult totalCaptureResult) {
        g0.r1.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    return false;
                }
                if (i10 != 3) {
                    throw new AssertionError(i10);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        g0.r1.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    public static pe.x<TotalCaptureResult> i(long j10, ScheduledExecutorService scheduledExecutorService, y yVar, f.a aVar) {
        return r0.n.q(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, j(yVar, aVar));
    }

    public static pe.x<TotalCaptureResult> j(final y yVar, f.a aVar) {
        final f fVar = new f(aVar);
        yVar.B(fVar);
        pe.x<TotalCaptureResult> xVarC = fVar.c();
        xVarC.a(new Runnable() { // from class: z.c1
            @Override // java.lang.Runnable
            public final void run() {
                yVar.g0(fVar);
            }
        }, yVar.f38732c);
        return xVarC;
    }

    public d b(int i10, int i11, int i12) {
        int i13;
        d0.n nVar = new d0.n(this.f38312d);
        d dVar = new d(this.f38316h, this.f38313e, this.f38314f, this.f38310a, this.f38315g, nVar);
        if (i10 == 0) {
            dVar.f(new b(this.f38310a));
        }
        if (i11 != 3) {
            if (this.f38311c) {
                if (f(i12)) {
                    i13 = i11;
                    dVar.f(new h(this.f38310a, i13, this.f38313e, this.f38314f, (this.b.a() || this.f38310a.a0()) ? false : true));
                } else {
                    i13 = i11;
                    dVar.f(new a(this.f38310a, i13, nVar));
                }
            }
            g0.r1.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f38331h);
            return dVar;
        }
        dVar.f(new g(this.f38310a, this.f38313e, this.f38314f, new d0.a0(this.f38312d)));
        i13 = i11;
        g0.r1.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f38331h);
        return dVar;
    }

    public m0.m c(int i10, int i11, int i12) {
        return new c(b(i10, i11, i12), this.f38313e, i11);
    }

    public final boolean f(int i10) {
        return this.b.a() || this.f38316h == 3 || i10 == 1;
    }

    public void g(int i10) {
        this.f38316h = i10;
    }

    public pe.x<List<Void>> h(List<n0.l1> list, int i10, int i11, int i12) {
        return r0.n.s(b(i10, i11, i12).i(list, i11));
    }
}
