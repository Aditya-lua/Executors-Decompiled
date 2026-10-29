package p589z;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import androidx.camera.core.InterfaceC0494d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import ne.InterfaceFutureC9440x;
import p001a0.C0008c0;
import p063d0.C4369a0;
import p063d0.C4371b0;
import p063d0.C4376g;
import p063d0.C4383n;
import p140g0.C5883f1;
import p140g0.C5891h1;
import p140g0.C5931r1;
import p281m0.InterfaceC8308m;
import p296n0.AbstractC8828u;
import p296n0.C8749f0;
import p296n0.C8782k3;
import p296n0.C8785l1;
import p296n0.C8810q1;
import p296n0.C8838w;
import p296n0.InterfaceC8743e0;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p436t.InterfaceC11464a;
import p561y.C12964a;
import p563y1.C12997c;

/* JADX INFO: renamed from: z.g1 */
/* JADX INFO: loaded from: classes.dex */
public class C13525g1 {

    /* JADX INFO: renamed from: a */
    public final C13658y f47301a;

    /* JADX INFO: renamed from: b */
    public final C4371b0 f47302b;

    /* JADX INFO: renamed from: c */
    public final boolean f47303c;

    /* JADX INFO: renamed from: d */
    public final C8782k3 f47304d;

    /* JADX INFO: renamed from: e */
    public final Executor f47305e;

    /* JADX INFO: renamed from: f */
    public final ScheduledExecutorService f47306f;

    /* JADX INFO: renamed from: g */
    public final boolean f47307g;

    /* JADX INFO: renamed from: h */
    public int f47308h = 1;

    /* JADX INFO: renamed from: z.g1$a */
    public static class a implements e {

        /* JADX INFO: renamed from: a */
        public final C13658y f47309a;

        /* JADX INFO: renamed from: b */
        public final C4383n f47310b;

        /* JADX INFO: renamed from: c */
        public final int f47311c;

        /* JADX INFO: renamed from: d */
        public boolean f47312d = false;

        public a(C13658y c13658y, int i10, C4383n c4383n) {
            this.f47309a = c13658y;
            this.f47311c = i10;
            this.f47310b = c4383n;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Object m49245e(a aVar, C12997c.a aVar2) {
            aVar.f47309a.m49769I().m49394R(aVar2);
            aVar.f47310b.m22047b();
            return "AePreCapture";
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Boolean> mo49246a(TotalCaptureResult totalCaptureResult) {
            if (this.f47309a.m49787b0() || !C13525g1.m49236e(this.f47311c, totalCaptureResult)) {
                return C10773n.m40993p(Boolean.FALSE);
            }
            C5931r1.m26561a("Camera2CapturePipeline", "Trigger AE");
            this.f47312d = true;
            return C10763d.m40973c(C12997c.m48311a(new C12997c.c() { // from class: z.e1
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13525g1.a.m49245e(this.f47271a, aVar);
                }
            })).m40976f(new InterfaceC11464a() { // from class: z.f1
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, C10417c.m40081b());
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: b */
        public boolean mo49247b() {
            return this.f47311c == 0;
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: c */
        public void mo49248c() {
            if (this.f47312d) {
                C5931r1.m26561a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f47309a.m49769I().m49397o(false, true);
                this.f47310b.m22046a();
            }
        }
    }

    /* JADX INFO: renamed from: z.g1$b */
    public static class b implements e {

        /* JADX INFO: renamed from: a */
        public final C13658y f47313a;

        /* JADX INFO: renamed from: b */
        public boolean f47314b = false;

        public b(C13658y c13658y) {
            this.f47313a = c13658y;
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Boolean> mo49246a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            InterfaceFutureC9440x<Boolean> interfaceFutureC9440xM40993p = C10773n.m40993p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                C5931r1.m26561a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    C5931r1.m26561a("Camera2CapturePipeline", "Trigger AF");
                    this.f47314b = true;
                    this.f47313a.m49769I().m49395S(null, false);
                }
            }
            return interfaceFutureC9440xM40993p;
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: b */
        public boolean mo49247b() {
            return true;
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: c */
        public void mo49248c() {
            if (this.f47314b) {
                C5931r1.m26561a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f47313a.m49769I().m49397o(true, false);
            }
        }
    }

    /* JADX INFO: renamed from: z.g1$c */
    public static class c implements InterfaceC8308m {

        /* JADX INFO: renamed from: a */
        public final Executor f47315a;

        /* JADX INFO: renamed from: b */
        public final d f47316b;

        /* JADX INFO: renamed from: c */
        public int f47317c;

        public c(d dVar, Executor executor, int i10) {
            this.f47316b = dVar;
            this.f47315a = executor;
            this.f47317c = i10;
        }

        /* JADX INFO: renamed from: c */
        public static /* synthetic */ Object m49249c(c cVar, C12997c.a aVar) {
            cVar.f47316b.m49260j();
            aVar.m48314c(null);
            return "invokePostCaptureFuture";
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ Void m49250d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // p281m0.InterfaceC8308m
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Void> mo33779a() {
            C5931r1.m26561a("Camera2CapturePipeline", "invokePreCapture");
            return C10763d.m40973c(this.f47316b.m49261k(this.f47317c)).m40976f(new InterfaceC11464a() { // from class: z.i1
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return C13525g1.c.m49250d((TotalCaptureResult) obj);
                }
            }, this.f47315a);
        }

        @Override // p281m0.InterfaceC8308m
        /* JADX INFO: renamed from: b */
        public InterfaceFutureC9440x<Void> mo33780b() {
            return C12997c.m48311a(new C12997c.c() { // from class: z.h1
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13525g1.c.m49249c(this.f47399a, aVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: z.g1$d */
    public static class d {

        /* JADX INFO: renamed from: j */
        public static final long f47318j;

        /* JADX INFO: renamed from: k */
        public static final long f47319k;

        /* JADX INFO: renamed from: a */
        public final int f47320a;

        /* JADX INFO: renamed from: b */
        public final Executor f47321b;

        /* JADX INFO: renamed from: c */
        public final ScheduledExecutorService f47322c;

        /* JADX INFO: renamed from: d */
        public final C13658y f47323d;

        /* JADX INFO: renamed from: e */
        public final C4383n f47324e;

        /* JADX INFO: renamed from: f */
        public final boolean f47325f;

        /* JADX INFO: renamed from: g */
        public long f47326g = f47318j;

        /* JADX INFO: renamed from: h */
        public final List<e> f47327h = new ArrayList();

        /* JADX INFO: renamed from: i */
        public final e f47328i = new a();

        /* JADX INFO: renamed from: z.g1$d$a */
        public class a implements e {
            public a() {
            }

            @Override // p589z.C13525g1.e
            /* JADX INFO: renamed from: a */
            public InterfaceFutureC9440x<Boolean> mo49246a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator<e> it = d.this.f47327h.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().mo49246a(totalCaptureResult));
                }
                return C10773n.m41001x(C10773n.m40988k(arrayList), new InterfaceC11464a() { // from class: z.p1
                    @Override // p436t.InterfaceC11464a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, C10417c.m40081b());
            }

            @Override // p589z.C13525g1.e
            /* JADX INFO: renamed from: b */
            public boolean mo49247b() {
                Iterator<e> it = d.this.f47327h.iterator();
                while (it.hasNext()) {
                    if (it.next().mo49247b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p589z.C13525g1.e
            /* JADX INFO: renamed from: c */
            public void mo49248c() {
                Iterator<e> it = d.this.f47327h.iterator();
                while (it.hasNext()) {
                    it.next().mo49248c();
                }
            }
        }

        /* JADX INFO: renamed from: z.g1$d$b */
        public class b extends AbstractC8828u {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ C12997c.a f47330a;

            public b(C12997c.a aVar) {
                this.f47330a = aVar;
            }

            @Override // p296n0.AbstractC8828u
            /* JADX INFO: renamed from: a */
            public void mo35425a(int i10) {
                this.f47330a.m48317f(new C5891h1(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // p296n0.AbstractC8828u
            /* JADX INFO: renamed from: b */
            public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
                this.f47330a.m48314c(null);
            }

            @Override // p296n0.AbstractC8828u
            /* JADX INFO: renamed from: c */
            public void mo35426c(int i10, C8838w c8838w) {
                this.f47330a.m48317f(new C5891h1(2, "Capture request failed with reason " + c8838w.m35470a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f47318j = timeUnit.toNanos(1L);
            f47319k = timeUnit.toNanos(5L);
        }

        public d(int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, C13658y c13658y, boolean z10, C4383n c4383n) {
            this.f47320a = i10;
            this.f47321b = executor;
            this.f47322c = scheduledExecutorService;
            this.f47323d = c13658y;
            this.f47325f = z10;
            this.f47324e = c4383n;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ InterfaceFutureC9440x m49251a(d dVar, int i10, TotalCaptureResult totalCaptureResult) {
            if (!dVar.f47323d.m49787b0() && C13525g1.m49236e(i10, totalCaptureResult)) {
                dVar.m49262l(f47319k);
            }
            return dVar.f47328i.mo49246a(totalCaptureResult);
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceFutureC9440x m49254d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? C13525g1.m49237i(dVar.f47326g, dVar.f47322c, dVar.f47323d, new f.a() { // from class: z.o1
                @Override // p589z.C13525g1.f.a
                /* JADX INFO: renamed from: a */
                public final boolean mo49268a(TotalCaptureResult totalCaptureResult) {
                    return C13525g1.m49235d(totalCaptureResult, false);
                }
            }) : C10773n.m40993p(null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Object m49255e(d dVar, C8785l1.a aVar, C12997c.a aVar2) {
            dVar.getClass();
            aVar.m35256c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        /* JADX INFO: renamed from: f */
        public void m49256f(e eVar) {
            this.f47327h.add(eVar);
        }

        /* JADX INFO: renamed from: g */
        public final void m49257g(C8785l1.a aVar) {
            C12964a.a aVar2 = new C12964a.a();
            aVar2.m48221f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.m35258e(aVar2.m48218b());
        }

        /* JADX INFO: renamed from: h */
        public final void m49258h(C8785l1.a aVar, C8785l1 c8785l1) {
            int i10;
            if (this.f47320a != 3 || this.f47325f) {
                i10 = (c8785l1.m35248k() == -1 || c8785l1.m35248k() == 5) ? 2 : -1;
            } else {
                i10 = 4;
            }
            if (i10 != -1) {
                aVar.m35273v(i10);
            }
            C5931r1.m26561a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i10);
        }

        /* JADX INFO: renamed from: i */
        public InterfaceFutureC9440x<List<Void>> m49259i(final List<C8785l1> list, final int i10) {
            C10763d c10763dM40977g = C10763d.m40973c(m49261k(i10)).m40977g(new InterfaceC10760a() { // from class: z.j1
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return this.f47455a.m49263m(list, i10);
                }
            }, this.f47321b);
            c10763dM40977g.mo37173a(new Runnable() { // from class: z.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47465a.m49260j();
                }
            }, this.f47321b);
            return c10763dM40977g;
        }

        /* JADX INFO: renamed from: j */
        public void m49260j() {
            this.f47328i.mo49248c();
        }

        /* JADX INFO: renamed from: k */
        public InterfaceFutureC9440x<TotalCaptureResult> m49261k(final int i10) {
            InterfaceFutureC9440x<TotalCaptureResult> interfaceFutureC9440xM40993p = C10773n.m40993p(null);
            if (this.f47327h.isEmpty()) {
                return interfaceFutureC9440xM40993p;
            }
            return C10763d.m40973c(this.f47328i.mo49247b() ? C13525g1.m49238j(this.f47323d, null) : C10773n.m40993p(null)).m40977g(new InterfaceC10760a() { // from class: z.m1
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C13525g1.d.m49251a(this.f47517a, i10, (TotalCaptureResult) obj);
                }
            }, this.f47321b).m40977g(new InterfaceC10760a() { // from class: z.n1
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C13525g1.d.m49254d(this.f47553a, (Boolean) obj);
                }
            }, this.f47321b);
        }

        /* JADX INFO: renamed from: l */
        public final void m49262l(long j10) {
            this.f47326g = j10;
        }

        /* JADX INFO: renamed from: m */
        public InterfaceFutureC9440x<List<Void>> m49263m(List<C8785l1> list, int i10) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (C8785l1 c8785l1 : list) {
                final C8785l1.a aVarM35253k = C8785l1.a.m35253k(c8785l1);
                InterfaceC8743e0 interfaceC8743e0M35087a = null;
                if (c8785l1.m35248k() == 5 && !this.f47323d.m49783X().mo49459h() && !this.f47323d.m49783X().mo49454c()) {
                    InterfaceC0494d interfaceC0494dMo49457f = this.f47323d.m49783X().mo49457f();
                    if (interfaceC0494dMo49457f != null) {
                        if (this.f47323d.m49783X().mo49458g(interfaceC0494dMo49457f)) {
                            interfaceC8743e0M35087a = C8749f0.m35087a(interfaceC0494dMo49457f.mo2192H2());
                        } else {
                            C5931r1.m26563c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (interfaceC8743e0M35087a == null) {
                            interfaceC0494dMo49457f.close();
                        }
                    } else {
                        C5931r1.m26561a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (interfaceC8743e0M35087a != null) {
                    aVarM35253k.m35267p(interfaceC8743e0M35087a);
                } else {
                    m49258h(aVarM35253k, c8785l1);
                }
                if (this.f47324e.m22048c(i10)) {
                    m49257g(aVarM35253k);
                }
                arrayList.add(C12997c.m48311a(new C12997c.c() { // from class: z.l1
                    @Override // p563y1.C12997c.c
                    /* JADX INFO: renamed from: a */
                    public final Object mo22051a(C12997c.a aVar) {
                        return C13525g1.d.m49255e(this.f47504a, aVarM35253k, aVar);
                    }
                }));
                arrayList2.add(aVarM35253k.m35261h());
            }
            this.f47323d.m49800q0(arrayList2);
            return C10773n.m40988k(arrayList);
        }
    }

    /* JADX INFO: renamed from: z.g1$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        InterfaceFutureC9440x<Boolean> mo49246a(TotalCaptureResult totalCaptureResult);

        /* JADX INFO: renamed from: b */
        boolean mo49247b();

        /* JADX INFO: renamed from: c */
        void mo49248c();
    }

    /* JADX INFO: renamed from: z.g1$f */
    public static class f implements C13658y.c {

        /* JADX INFO: renamed from: a */
        public C12997c.a<TotalCaptureResult> f47332a;

        /* JADX INFO: renamed from: b */
        public final InterfaceFutureC9440x<TotalCaptureResult> f47333b = C12997c.m48311a(new C12997c.c() { // from class: z.q1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C13525g1.f.m49265b(this.f47606a, aVar);
            }
        });

        /* JADX INFO: renamed from: c */
        public final a f47334c;

        /* JADX INFO: renamed from: z.g1$f$a */
        public interface a {
            /* JADX INFO: renamed from: a */
            boolean mo49268a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            this.f47334c = aVar;
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ Object m49265b(f fVar, C12997c.a aVar) {
            fVar.f47332a = aVar;
            return "waitFor3AResult";
        }

        @Override // p589z.C13658y.c
        /* JADX INFO: renamed from: a */
        public boolean mo49266a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f47334c;
            if (aVar != null && !aVar.mo49268a(totalCaptureResult)) {
                return false;
            }
            this.f47332a.m48314c(totalCaptureResult);
            return true;
        }

        /* JADX INFO: renamed from: c */
        public InterfaceFutureC9440x<TotalCaptureResult> m49267c() {
            return this.f47333b;
        }
    }

    /* JADX INFO: renamed from: z.g1$g */
    public static class g implements e {

        /* JADX INFO: renamed from: f */
        public static final long f47335f = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a */
        public final C13658y f47336a;

        /* JADX INFO: renamed from: b */
        public final Executor f47337b;

        /* JADX INFO: renamed from: c */
        public final ScheduledExecutorService f47338c;

        /* JADX INFO: renamed from: d */
        public final C5883f1.j f47339d;

        /* JADX INFO: renamed from: e */
        public final C4369a0 f47340e;

        public g(C13658y c13658y, Executor executor, ScheduledExecutorService scheduledExecutorService, C4369a0 c4369a0) {
            this.f47336a = c13658y;
            this.f47337b = executor;
            this.f47338c = scheduledExecutorService;
            this.f47340e = c4369a0;
            C5883f1.j jVarM49774N = c13658y.m49774N();
            Objects.requireNonNull(jVarM49774N);
            this.f47339d = jVarM49774N;
        }

        /* JADX INFO: renamed from: d */
        public static /* synthetic */ void m49269d(g gVar, AtomicReference atomicReference, C12997c.a aVar) {
            gVar.getClass();
            C5931r1.m26561a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f47339d.mo26438a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (C5883f1.k) atomicReference.get());
            aVar.m48314c(null);
        }

        /* JADX INFO: renamed from: h */
        public static /* synthetic */ InterfaceFutureC9440x m49273h(final g gVar, Void r8) {
            gVar.getClass();
            return C12997c.m48311a(new C12997c.c() { // from class: z.s1
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13525g1.g.m49277l(this.f47662a, aVar);
                }
            });
        }

        /* JADX INFO: renamed from: j */
        public static /* synthetic */ Object m49275j(final g gVar, final AtomicReference atomicReference, final C12997c.a aVar) {
            gVar.getClass();
            C10417c.m40084e().execute(new Runnable() { // from class: z.t1
                @Override // java.lang.Runnable
                public final void run() {
                    C13525g1.g.m49269d(this.f47677a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        /* JADX INFO: renamed from: k */
        public static /* synthetic */ void m49276k(C12997c.a aVar) {
            C5931r1.m26561a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.m48314c(null);
        }

        /* JADX INFO: renamed from: l */
        public static /* synthetic */ Object m49277l(g gVar, C12997c.a aVar) {
            if (!gVar.f47340e.m22024a()) {
                aVar.m48314c(null);
                return "EnableTorchInternal";
            }
            C5931r1.m26561a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f47336a.m49766F(2);
            aVar.m48314c(null);
            return "EnableTorchInternal";
        }

        /* JADX INFO: renamed from: n */
        public static /* synthetic */ Object m49279n(AtomicReference atomicReference, final C12997c.a aVar) {
            atomicReference.set(new C5883f1.k() { // from class: z.v1
                @Override // p140g0.C5883f1.k
                /* JADX INFO: renamed from: a */
                public final void mo26439a() {
                    C13525g1.g.m49276k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        /* JADX INFO: renamed from: p */
        public static /* synthetic */ InterfaceFutureC9440x m49281p(g gVar, InterfaceFutureC9440x interfaceFutureC9440x, Object obj) {
            gVar.getClass();
            return C10773n.m40994q(TimeUnit.SECONDS.toMillis(3L), gVar.f47338c, null, true, interfaceFutureC9440x);
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Boolean> mo49246a(TotalCaptureResult totalCaptureResult) {
            C5931r1.m26561a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final InterfaceFutureC9440x interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: z.x1
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13525g1.g.m49279n(atomicReference, aVar);
                }
            });
            return C10763d.m40973c(C12997c.m48311a(new C12997c.c() { // from class: z.y1
                @Override // p563y1.C12997c.c
                /* JADX INFO: renamed from: a */
                public final Object mo22051a(C12997c.a aVar) {
                    return C13525g1.g.m49275j(this.f47868a, atomicReference, aVar);
                }
            })).m40977g(new InterfaceC10760a() { // from class: z.z1
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return this.f47891a.f47336a.m49769I().m49404v(true);
                }
            }, this.f47337b).m40977g(new InterfaceC10760a() { // from class: z.a2
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C13525g1.g.m49273h(this.f47204a, (Void) obj);
                }
            }, this.f47337b).m40977g(new InterfaceC10760a() { // from class: z.b2
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return C13525g1.g.m49281p(this.f47212a, interfaceFutureC9440xM48311a, obj);
                }
            }, this.f47337b).m40977g(new InterfaceC10760a() { // from class: z.c2
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    return this.f47233a.f47336a.m49769I().m49393Q();
                }
            }, this.f47337b).m40977g(new InterfaceC10760a() { // from class: z.d2
                @Override // p397r0.InterfaceC10760a
                public final InterfaceFutureC9440x apply(Object obj) {
                    C13525g1.g gVar = this.f47254a;
                    return C13525g1.m49237i(C13525g1.g.f47335f, gVar.f47338c, gVar.f47336a, new C13525g1.f.a() { // from class: z.u1
                        @Override // p589z.C13525g1.f.a
                        /* JADX INFO: renamed from: a */
                        public final boolean mo49268a(TotalCaptureResult totalCaptureResult2) {
                            return C13525g1.m49235d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f47337b).m40976f(new InterfaceC11464a() { // from class: z.e2
                @Override // p436t.InterfaceC11464a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, C10417c.m40081b());
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: b */
        public boolean mo49247b() {
            return false;
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: c */
        public void mo49248c() {
            C5931r1.m26561a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f47340e.m22024a()) {
                this.f47336a.m49766F(0);
            }
            this.f47336a.m49769I().m49404v(false).mo37173a(new Runnable() { // from class: z.r1
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f47337b);
            this.f47336a.m49769I().m49397o(false, true);
            ScheduledExecutorService scheduledExecutorServiceM40084e = C10417c.m40084e();
            final C5883f1.j jVar = this.f47339d;
            Objects.requireNonNull(jVar);
            scheduledExecutorServiceM40084e.execute(new Runnable() { // from class: z.w1
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.clear();
                }
            });
        }
    }

    /* JADX INFO: renamed from: z.g1$h */
    public static class h implements e {

        /* JADX INFO: renamed from: g */
        public static final long f47341g = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a */
        public final C13658y f47342a;

        /* JADX INFO: renamed from: b */
        public final int f47343b;

        /* JADX INFO: renamed from: c */
        public boolean f47344c = false;

        /* JADX INFO: renamed from: d */
        public final Executor f47345d;

        /* JADX INFO: renamed from: e */
        public final ScheduledExecutorService f47346e;

        /* JADX INFO: renamed from: f */
        public final boolean f47347f;

        public h(C13658y c13658y, int i10, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z10) {
            this.f47342a = c13658y;
            this.f47343b = i10;
            this.f47345d = executor;
            this.f47346e = scheduledExecutorService;
            this.f47347f = z10;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: ?: TERNARY null = ((wrap boolean:0x0000: IGET (r0v0 z.g1$h) A[WRAPPED] z.g1.h.f boolean) != false) ? (wrap ne.x<java.lang.Void>:0x000a: INVOKE 
          (wrap z.h4:0x0006: INVOKE (wrap z.y:0x0004: IGET (r0v0 z.g1$h) A[WRAPPED] z.g1.h.a z.y) VIRTUAL call: z.y.I():z.h4 A[MD:():z.h4 (m), WRAPPED])
         VIRTUAL call: z.h4.Q():ne.x A[MD:():ne.x<java.lang.Void> (m), WRAPPED]) : (wrap ne.x:0x0010: INVOKE (null java.lang.Object) STATIC call: r0.n.p(java.lang.Object):ne.x A[MD:<V>:(V):ne.x<V> (m), WRAPPED]) */
        /* JADX INFO: renamed from: d */
        public static /* synthetic */ InterfaceFutureC9440x m49282d(h hVar, Void r8) {
            return hVar.f47347f ? hVar.f47342a.m49769I().m49393Q() : C10773n.m40993p(null);
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ Object m49283e(h hVar, C12997c.a aVar) {
            hVar.f47342a.m49780U().m49740e(aVar, 2);
            return "TorchOn";
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: a */
        public InterfaceFutureC9440x<Boolean> mo49246a(TotalCaptureResult totalCaptureResult) {
            C5931r1.m26561a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C13525g1.m49236e(this.f47343b, totalCaptureResult));
            if (C13525g1.m49236e(this.f47343b, totalCaptureResult)) {
                if (this.f47342a.m49787b0()) {
                    C5931r1.m26561a("Camera2CapturePipeline", "Low-light boost already on, not turn on");
                } else {
                    if (!this.f47342a.m49789f0()) {
                        C5931r1.m26561a("Camera2CapturePipeline", "Turn on torch");
                        this.f47344c = true;
                        return C10763d.m40973c(C12997c.m48311a(new C12997c.c() { // from class: z.f2
                            @Override // p563y1.C12997c.c
                            /* JADX INFO: renamed from: a */
                            public final Object mo22051a(C12997c.a aVar) {
                                return C13525g1.h.m49283e(this.f47289a, aVar);
                            }
                        })).m40977g(new InterfaceC10760a() { // from class: z.g2
                            @Override // p397r0.InterfaceC10760a
                            public final InterfaceFutureC9440x apply(Object obj) {
                                return C13525g1.h.m49282d(this.f47348a, (Void) obj);
                            }
                        }, this.f47345d).m40977g(new InterfaceC10760a() { // from class: z.h2
                            @Override // p397r0.InterfaceC10760a
                            public final InterfaceFutureC9440x apply(Object obj) {
                                C13525g1.h hVar = this.f47400a;
                                return C13525g1.m49237i(C13525g1.h.f47341g, hVar.f47346e, hVar.f47342a, new C13525g1.f.a() { // from class: z.j2
                                    @Override // p589z.C13525g1.f.a
                                    /* JADX INFO: renamed from: a */
                                    public final boolean mo49268a(TotalCaptureResult totalCaptureResult2) {
                                        return C13525g1.m49235d(totalCaptureResult2, true);
                                    }
                                });
                            }
                        }, this.f47345d).m40976f(new InterfaceC11464a() { // from class: z.i2
                            @Override // p436t.InterfaceC11464a
                            public final Object apply(Object obj) {
                                return Boolean.FALSE;
                            }
                        }, C10417c.m40081b());
                    }
                    C5931r1.m26561a("Camera2CapturePipeline", "Torch already on, not turn on");
                }
            }
            return C10773n.m40993p(Boolean.FALSE);
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: b */
        public boolean mo49247b() {
            return this.f47343b == 0;
        }

        @Override // p589z.C13525g1.e
        /* JADX INFO: renamed from: c */
        public void mo49248c() {
            if (this.f47344c) {
                this.f47342a.m49780U().m49740e(null, 0);
                C5931r1.m26561a("Camera2CapturePipeline", "Turning off torch");
                if (this.f47347f) {
                    this.f47342a.m49769I().m49397o(false, true);
                }
            }
        }
    }

    public C13525g1(C13658y c13658y, C0008c0 c0008c0, C8782k3 c8782k3, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f47301a = c13658y;
        Integer num = (Integer) c0008c0.m9a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f47307g = num != null && num.intValue() == 2;
        this.f47305e = executor;
        this.f47306f = scheduledExecutorService;
        this.f47304d = c8782k3;
        this.f47302b = new C4371b0(c8782k3);
        this.f47303c = C4376g.m22031a(new C13501d1(c0008c0));
    }

    /* JADX INFO: renamed from: d */
    public static boolean m49235d(TotalCaptureResult totalCaptureResult, boolean z10) {
        if (totalCaptureResult == null) {
            return false;
        }
        return C8810q1.m35374a(new C13531h(totalCaptureResult), z10);
    }

    /* JADX INFO: renamed from: e */
    public static boolean m49236e(int i10, TotalCaptureResult totalCaptureResult) {
        C5931r1.m26561a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i10);
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
        C5931r1.m26561a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    /* JADX INFO: renamed from: i */
    public static InterfaceFutureC9440x<TotalCaptureResult> m49237i(long j10, ScheduledExecutorService scheduledExecutorService, C13658y c13658y, f.a aVar) {
        return C10773n.m40994q(TimeUnit.NANOSECONDS.toMillis(j10), scheduledExecutorService, null, true, m49238j(c13658y, aVar));
    }

    /* JADX INFO: renamed from: j */
    public static InterfaceFutureC9440x<TotalCaptureResult> m49238j(final C13658y c13658y, f.a aVar) {
        final f fVar = new f(aVar);
        c13658y.m49762B(fVar);
        InterfaceFutureC9440x<TotalCaptureResult> interfaceFutureC9440xM49267c = fVar.m49267c();
        interfaceFutureC9440xM49267c.mo37173a(new Runnable() { // from class: z.c1
            @Override // java.lang.Runnable
            public final void run() {
                c13658y.m49790g0(fVar);
            }
        }, c13658y.f47839c);
        return interfaceFutureC9440xM49267c;
    }

    /* JADX INFO: renamed from: b */
    public d m49239b(int i10, int i11, int i12) {
        int i13;
        C4383n c4383n = new C4383n(this.f47304d);
        d dVar = new d(this.f47308h, this.f47305e, this.f47306f, this.f47301a, this.f47307g, c4383n);
        if (i10 == 0) {
            dVar.m49256f(new b(this.f47301a));
        }
        if (i11 != 3) {
            if (this.f47303c) {
                if (m49241f(i12)) {
                    i13 = i11;
                    dVar.m49256f(new h(this.f47301a, i13, this.f47305e, this.f47306f, (this.f47302b.m22026a() || this.f47301a.m49786a0()) ? false : true));
                } else {
                    i13 = i11;
                    dVar.m49256f(new a(this.f47301a, i13, c4383n));
                }
            }
            C5931r1.m26561a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f47327h);
            return dVar;
        }
        dVar.m49256f(new g(this.f47301a, this.f47305e, this.f47306f, new C4369a0(this.f47304d)));
        i13 = i11;
        C5931r1.m26561a("Camera2CapturePipeline", "createPipeline: captureMode = " + i10 + ", flashMode = " + i13 + ", flashType = " + i12 + ", pipeline tasks = " + dVar.f47327h);
        return dVar;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC8308m m49240c(int i10, int i11, int i12) {
        return new c(m49239b(i10, i11, i12), this.f47305e, i11);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m49241f(int i10) {
        return this.f47302b.m22026a() || this.f47308h == 3 || i10 == 1;
    }

    /* JADX INFO: renamed from: g */
    public void m49242g(int i10) {
        this.f47308h = i10;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceFutureC9440x<List<Void>> m49243h(List<C8785l1> list, int i10, int i11, int i12) {
        return C10773n.m40996s(m49239b(i10, i11, i12).m49259i(list, i11));
    }
}
