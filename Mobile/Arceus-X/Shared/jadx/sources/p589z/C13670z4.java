package p589z;

import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionShouldUseMrirQuirk;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import ne.InterfaceFutureC9440x;
import p020b0.C1179e;
import p021b1.C1196g;
import p036c0.C1500e;
import p114f0.C5233l;
import p114f0.InterfaceC5230i;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5931r1;
import p140g0.C5942u0;
import p296n0.AbstractC8740d3;
import p296n0.AbstractC8746e3;
import p296n0.AbstractC8828u;
import p296n0.AbstractC8830u1;
import p296n0.C8785l1;
import p296n0.C8802o3;
import p296n0.C8817r3;
import p296n0.C8845x1;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8812q3;
import p366q0.C10417c;
import p397r0.C10763d;
import p397r0.C10773n;
import p397r0.InterfaceC10760a;
import p397r0.InterfaceC10762c;
import p436t.InterfaceC11464a;
import p533x2.C12637g;
import p561y.C12964a;

/* JADX INFO: renamed from: z.z4 */
/* JADX INFO: loaded from: classes.dex */
public final class C13670z4 implements InterfaceC13567l3 {

    /* JADX INFO: renamed from: p */
    public static List<AbstractC8830u1> f47898p = new ArrayList();

    /* JADX INFO: renamed from: q */
    public static int f47899q = 0;

    /* JADX INFO: renamed from: a */
    public final InterfaceC8812q3 f47900a;

    /* JADX INFO: renamed from: b */
    public final C13666z0 f47901b;

    /* JADX INFO: renamed from: c */
    public final Executor f47902c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f47903d;

    /* JADX INFO: renamed from: e */
    public final C13559k3 f47904e;

    /* JADX INFO: renamed from: g */
    public C8802o3 f47906g;

    /* JADX INFO: renamed from: h */
    public C13612r2 f47907h;

    /* JADX INFO: renamed from: i */
    public C8802o3 f47908i;

    /* JADX INFO: renamed from: j */
    public c f47909j;

    /* JADX INFO: renamed from: l */
    public final d f47911l;

    /* JADX INFO: renamed from: o */
    public int f47914o;

    /* JADX INFO: renamed from: f */
    public List<AbstractC8830u1> f47905f = new ArrayList();

    /* JADX INFO: renamed from: k */
    public volatile List<C8785l1> f47910k = null;

    /* JADX INFO: renamed from: m */
    public C5233l f47912m = new C5233l.a().m24216c();

    /* JADX INFO: renamed from: n */
    public C5233l f47913n = new C5233l.a().m24216c();

    /* JADX INFO: renamed from: z.z4$a */
    public class a implements InterfaceC10762c<Void> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            C5931r1.m26564d("ProcessingCaptureSession", "open session failed ", th2);
            C13670z4.this.close();
            C13670z4.this.mo49483f(false);
        }
    }

    /* JADX INFO: renamed from: z.z4$b */
    public static class b implements InterfaceC8812q3.a {

        /* JADX INFO: renamed from: a */
        public List<AbstractC8828u> f47916a;

        /* JADX INFO: renamed from: b */
        public final int f47917b;

        /* JADX INFO: renamed from: c */
        public InterfaceC8743e0 f47918c;

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR (r1v0 int), (r2v0 java.util.List) A[MD:(int, java.util.List<n0.u>):void (m)] (LINE:1) call: z.z4.b.<init>(int, java.util.List):void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ b(int i10, List list, a aVar) {
            this(i10, list);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(int i10, List<AbstractC8828u> list) {
            this.f47918c = null;
            this.f47917b = i10;
            this.f47916a = list;
        }
    }

    /* JADX INFO: renamed from: z.z4$c */
    public enum c {
        UNINITIALIZED,
        SESSION_INITIALIZED,
        ON_CAPTURE_SESSION_STARTED,
        ON_CAPTURE_SESSION_ENDED,
        DE_INITIALIZED
    }

    /* JADX INFO: renamed from: z.z4$d */
    public static class d implements InterfaceC8812q3.a {
    }

    public C13670z4(InterfaceC8812q3 interfaceC8812q3, C13666z0 c13666z0, C1179e c1179e, Executor executor, ScheduledExecutorService scheduledExecutorService, InterfaceC5230i interfaceC5230i) {
        this.f47914o = 0;
        this.f47904e = new C13559k3(c1179e, C1500e.m7653b(CaptureSessionShouldUseMrirQuirk.class) != null, interfaceC5230i);
        this.f47900a = interfaceC8812q3;
        this.f47901b = c13666z0;
        this.f47902c = executor;
        this.f47903d = scheduledExecutorService;
        this.f47909j = c.UNINITIALIZED;
        this.f47911l = new d();
        int i10 = f47899q;
        f47899q = i10 + 1;
        this.f47914o = i10;
        C5931r1.m26561a("ProcessingCaptureSession", "New ProcessingCaptureSession (id=" + this.f47914o + ")");
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ Void m49827j(C13670z4 c13670z4, Void r8) {
        c13670z4.m49842y(c13670z4.f47904e);
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m49829l(C13670z4 c13670z4, AbstractC8830u1 abstractC8830u1) {
        C8845x1.m35501c(c13670z4.f47905f);
        if (abstractC8830u1 != null) {
            abstractC8830u1.m35431e();
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ InterfaceFutureC9440x m49830m(final C13670z4 c13670z4, C8802o3 c8802o3, CameraDevice cameraDevice, InterfaceC13537h5.a aVar, List list) {
        AbstractC8740d3 abstractC8740d3M35060a;
        c13670z4.getClass();
        C5931r1.m26561a("ProcessingCaptureSession", "-- getSurfaces done, start init (id=" + c13670z4.f47914o + ")");
        if (c13670z4.f47909j == c.DE_INITIALIZED) {
            return C10773n.m40991n(new IllegalStateException("SessionProcessorCaptureSession is closed."));
        }
        final AbstractC8830u1 abstractC8830u1Mo35348f = null;
        if (list.contains(null)) {
            return C10773n.m40991n(new AbstractC8830u1.a("Surface closed", c8802o3.m35310p().get(list.indexOf(null))));
        }
        AbstractC8740d3 abstractC8740d3M35060a2 = null;
        AbstractC8740d3 abstractC8740d3M35060a3 = null;
        AbstractC8740d3 abstractC8740d3M35060a4 = null;
        for (int i10 = 0; i10 < c8802o3.m35310p().size(); i10++) {
            AbstractC8830u1 abstractC8830u1 = c8802o3.m35310p().get(i10);
            if (m49837t(abstractC8830u1) || m49838u(abstractC8830u1)) {
                abstractC8740d3M35060a2 = AbstractC8740d3.m35060a(abstractC8830u1.m35436j().get(), abstractC8830u1.m35434h(), abstractC8830u1.m35435i());
            } else if (m49836s(abstractC8830u1)) {
                abstractC8740d3M35060a3 = AbstractC8740d3.m35060a(abstractC8830u1.m35436j().get(), abstractC8830u1.m35434h(), abstractC8830u1.m35435i());
            } else if (m49835r(abstractC8830u1)) {
                abstractC8740d3M35060a4 = AbstractC8740d3.m35060a(abstractC8830u1.m35436j().get(), abstractC8830u1.m35434h(), abstractC8830u1.m35435i());
            }
        }
        if (c8802o3.m35304j() != null) {
            abstractC8830u1Mo35348f = c8802o3.m35304j().mo35348f();
            abstractC8740d3M35060a = AbstractC8740d3.m35060a(abstractC8830u1Mo35348f.m35436j().get(), abstractC8830u1Mo35348f.m35434h(), abstractC8830u1Mo35348f.m35435i());
        } else {
            abstractC8740d3M35060a = null;
        }
        c13670z4.f47909j = c.SESSION_INITIALIZED;
        try {
            ArrayList arrayList = new ArrayList(c13670z4.f47905f);
            if (abstractC8830u1Mo35348f != null) {
                arrayList.add(abstractC8830u1Mo35348f);
            }
            C8845x1.m35502d(arrayList);
            C5931r1.m26572l("ProcessingCaptureSession", "== initSession (id=" + c13670z4.f47914o + ")");
            try {
                C8802o3 c8802o3M35383i = c13670z4.f47900a.m35383i(c13670z4.f47901b, AbstractC8746e3.m35077a(abstractC8740d3M35060a2, abstractC8740d3M35060a3, abstractC8740d3M35060a4, abstractC8740d3M35060a));
                c13670z4.f47908i = c8802o3M35383i;
                c8802o3M35383i.m35310p().get(0).m35437k().mo37173a(new Runnable() { // from class: z.u4
                    @Override // java.lang.Runnable
                    public final void run() {
                        C13670z4.m49829l(this.f47784a, abstractC8830u1Mo35348f);
                    }
                }, C10417c.m40081b());
                for (final AbstractC8830u1 abstractC8830u2 : c13670z4.f47908i.m35310p()) {
                    f47898p.add(abstractC8830u2);
                    abstractC8830u2.m35437k().mo37173a(new Runnable() { // from class: z.v4
                        @Override // java.lang.Runnable
                        public final void run() {
                            C13670z4.f47898p.remove(abstractC8830u2);
                        }
                    }, c13670z4.f47902c);
                }
                C8802o3.h hVar = new C8802o3.h();
                hVar.m35358b(c8802o3);
                hVar.m35360d();
                hVar.m35358b(c13670z4.f47908i);
                C12637g.m47070b(hVar.m35363g(), "Cannot transform the SessionConfig");
                InterfaceFutureC9440x<Void> interfaceFutureC9440xMo49478a = c13670z4.f47904e.mo49478a(hVar.m35359c(), (CameraDevice) C12637g.m47075g(cameraDevice), aVar);
                C10773n.m40987j(interfaceFutureC9440xMo49478a, c13670z4.new a(), c13670z4.f47902c);
                return interfaceFutureC9440xMo49478a;
            } catch (Throwable th2) {
                C5931r1.m26564d("ProcessingCaptureSession", "initSession failed", th2);
                C8845x1.m35501c(c13670z4.f47905f);
                if (abstractC8830u1Mo35348f != null) {
                    abstractC8830u1Mo35348f.m35431e();
                }
                throw th2;
            }
        } catch (AbstractC8830u1.a e10) {
            return C10773n.m40991n(e10);
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m49831n(C13670z4 c13670z4) {
        c13670z4.getClass();
        C5931r1.m26561a("ProcessingCaptureSession", "== deInitSession (id=" + c13670z4.f47914o + ")");
        c13670z4.f47900a.m35378d();
    }

    /* JADX INFO: renamed from: o */
    public static void m49832o(List<C8785l1> list) {
        for (C8785l1 c8785l1 : list) {
            Iterator<AbstractC8828u> it = c8785l1.m35240c().iterator();
            while (it.hasNext()) {
                it.next().mo35425a(c8785l1.m35243f());
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static List<C8817r3> m49833p(List<AbstractC8830u1> list) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC8830u1 abstractC8830u1 : list) {
            C12637g.m47070b(abstractC8830u1 instanceof C8817r3, "Surface must be SessionProcessorSurface");
            arrayList.add((C8817r3) abstractC8830u1);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m49834q(C8785l1 c8785l1) {
        for (AbstractC8830u1 abstractC8830u1 : c8785l1.m35246i()) {
            if (m49837t(abstractC8830u1) || m49838u(abstractC8830u1)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: r */
    public static boolean m49835r(AbstractC8830u1 abstractC8830u1) {
        return Objects.equals(abstractC8830u1.m35433g(), C5942u0.class);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m49836s(AbstractC8830u1 abstractC8830u1) {
        return Objects.equals(abstractC8830u1.m35433g(), C5883f1.class);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m49837t(AbstractC8830u1 abstractC8830u1) {
        return Objects.equals(abstractC8830u1.m35433g(), C5864a2.class);
    }

    /* JADX INFO: renamed from: u */
    public static boolean m49838u(AbstractC8830u1 abstractC8830u1) {
        return Objects.equals(abstractC8830u1.m35433g(), C1196g.class);
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: a */
    public InterfaceFutureC9440x<Void> mo49478a(final C8802o3 c8802o3, final CameraDevice cameraDevice, final InterfaceC13537h5.a aVar) {
        C12637g.m47070b(this.f47909j == c.UNINITIALIZED, "Invalid state state:" + this.f47909j);
        C12637g.m47070b(c8802o3.m35310p().isEmpty() ^ true, "SessionConfig contains no surfaces");
        C5931r1.m26561a("ProcessingCaptureSession", "open (id=" + this.f47914o + ")");
        List<AbstractC8830u1> listM35310p = c8802o3.m35310p();
        this.f47905f = listM35310p;
        return C10763d.m40973c(C8845x1.m35503e(listM35310p, false, 5000L, this.f47902c, this.f47903d)).m40977g(new InterfaceC10760a() { // from class: z.x4
            @Override // p397r0.InterfaceC10760a
            public final InterfaceFutureC9440x apply(Object obj) {
                return C13670z4.m49830m(this.f47819a, c8802o3, cameraDevice, aVar, (List) obj);
            }
        }, this.f47902c).m40976f(new InterfaceC11464a() { // from class: z.y4
            @Override // p436t.InterfaceC11464a
            public final Object apply(Object obj) {
                return C13670z4.m49827j(this.f47873a, (Void) obj);
            }
        }, this.f47902c);
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: b */
    public void mo49479b(List<C8785l1> list) {
        if (list.isEmpty()) {
            return;
        }
        C5931r1.m26561a("ProcessingCaptureSession", "issueCaptureRequests (id=" + this.f47914o + ") + state =" + this.f47909j);
        int iOrdinal = this.f47909j.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            if (this.f47910k == null) {
                this.f47910k = list;
                return;
            } else {
                m49832o(list);
                C5931r1.m26561a("ProcessingCaptureSession", "cancel the request because are pending un-submitted request");
                return;
            }
        }
        if (iOrdinal == 2) {
            for (C8785l1 c8785l1 : list) {
                if (m49839v(c8785l1.m35248k())) {
                    m49840w(c8785l1);
                } else {
                    m49841x(c8785l1);
                }
            }
            return;
        }
        if (iOrdinal == 3 || iOrdinal == 4) {
            C5931r1.m26561a("ProcessingCaptureSession", "Run issueCaptureRequests in wrong state, state = " + this.f47909j);
            m49832o(list);
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: c */
    public boolean mo49480c() {
        return this.f47904e.mo49480c();
    }

    @Override // p589z.InterfaceC13567l3
    public void close() {
        C5931r1.m26561a("ProcessingCaptureSession", "close (id=" + this.f47914o + ") state=" + this.f47909j);
        if (this.f47909j == c.ON_CAPTURE_SESSION_STARTED) {
            C5931r1.m26561a("ProcessingCaptureSession", "== onCaptureSessionEnd (id = " + this.f47914o + ")");
            this.f47900a.m35377c();
            C13612r2 c13612r2 = this.f47907h;
            if (c13612r2 != null) {
                c13612r2.m49587a();
            }
            this.f47909j = c.ON_CAPTURE_SESSION_ENDED;
        }
        this.f47904e.close();
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: d */
    public void mo49481d(C8802o3 c8802o3) {
        C5931r1.m26561a("ProcessingCaptureSession", "setSessionConfig (id=" + this.f47914o + ")");
        this.f47906g = c8802o3;
        if (c8802o3 == null) {
            return;
        }
        C13612r2 c13612r2 = this.f47907h;
        if (c13612r2 != null) {
            c13612r2.m49588b(c8802o3);
        }
        if (this.f47909j == c.ON_CAPTURE_SESSION_STARTED) {
            C5233l.a aVarM24215d = C5233l.a.m24215d(c8802o3.m35301g());
            Integer numM49467h = C13558k2.m49467h(c8802o3.m35306l());
            if (numM49467h != null) {
                aVarM24215d.m24217f(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, numM49467h);
            }
            C5233l c5233lM24216c = aVarM24215d.m24216c();
            this.f47912m = c5233lM24216c;
            m49843z(c5233lM24216c, this.f47913n);
            if (m49834q(c8802o3.m35306l())) {
                this.f47900a.m35386l(c8802o3.m35306l().m35247j(), this.f47911l);
            } else {
                this.f47900a.m35375a();
            }
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: e */
    public void mo49482e() {
        C5931r1.m26561a("ProcessingCaptureSession", "cancelIssuedCaptureRequests (id=" + this.f47914o + ")");
        if (this.f47910k != null) {
            for (C8785l1 c8785l1 : this.f47910k) {
                Iterator<AbstractC8828u> it = c8785l1.m35240c().iterator();
                while (it.hasNext()) {
                    it.next().mo35425a(c8785l1.m35243f());
                }
            }
            this.f47910k = null;
        }
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: f */
    public InterfaceFutureC9440x<Void> mo49483f(boolean z10) {
        C5931r1.m26561a("ProcessingCaptureSession", "release (id=" + this.f47914o + ") mProcessorState=" + this.f47909j);
        InterfaceFutureC9440x<Void> interfaceFutureC9440xMo49483f = this.f47904e.mo49483f(z10);
        int iOrdinal = this.f47909j.ordinal();
        if (iOrdinal == 1 || iOrdinal == 3) {
            interfaceFutureC9440xMo49483f.mo37173a(new Runnable() { // from class: z.w4
                @Override // java.lang.Runnable
                public final void run() {
                    C13670z4.m49831n(this.f47810a);
                }
            }, C10417c.m40081b());
        }
        this.f47909j = c.DE_INITIALIZED;
        return interfaceFutureC9440xMo49483f;
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: g */
    public List<C8785l1> mo49484g() {
        return this.f47910k != null ? this.f47910k : Collections.EMPTY_LIST;
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: h */
    public C8802o3 mo49485h() {
        return this.f47906g;
    }

    @Override // p589z.InterfaceC13567l3
    /* JADX INFO: renamed from: i */
    public void mo49486i(Map<AbstractC8830u1, Long> map) {
    }

    /* JADX INFO: renamed from: v */
    public final boolean m49839v(int i10) {
        return i10 == 2 || i10 == 4;
    }

    /* JADX INFO: renamed from: w */
    public void m49840w(C8785l1 c8785l1) {
        C5233l.a aVarM24215d = C5233l.a.m24215d(c8785l1.m35244g());
        InterfaceC8795n1 interfaceC8795n1M35244g = c8785l1.m35244g();
        InterfaceC8795n1.a<Integer> aVar = C8785l1.f31943i;
        if (interfaceC8795n1M35244g.mo35023a(aVar)) {
            aVarM24215d.m24217f(CaptureRequest.JPEG_ORIENTATION, (Integer) c8785l1.m35244g().mo35027e(aVar));
        }
        InterfaceC8795n1 interfaceC8795n1M35244g2 = c8785l1.m35244g();
        InterfaceC8795n1.a<Integer> aVar2 = C8785l1.f31944j;
        if (interfaceC8795n1M35244g2.mo35023a(aVar2)) {
            aVarM24215d.m24217f(CaptureRequest.JPEG_QUALITY, Byte.valueOf(((Integer) c8785l1.m35244g().mo35027e(aVar2)).byteValue()));
        }
        C5233l c5233lM24216c = aVarM24215d.m24216c();
        this.f47913n = c5233lM24216c;
        m49843z(this.f47912m, c5233lM24216c);
        this.f47900a.m35376b(c8785l1.m35250m(), c8785l1.m35247j(), new b(c8785l1.m35243f(), c8785l1.m35240c(), null));
    }

    /* JADX INFO: renamed from: x */
    public void m49841x(C8785l1 c8785l1) {
        C5931r1.m26561a("ProcessingCaptureSession", "issueTriggerRequest");
        C5233l c5233lM24216c = C5233l.a.m24215d(c8785l1.m35244g()).m24216c();
        Iterator<InterfaceC8795n1.a<?>> it = c5233lM24216c.mo35024b().iterator();
        while (it.hasNext()) {
            CaptureRequest.Key key = (CaptureRequest.Key) it.next().mo35217d();
            if (key.equals(CaptureRequest.CONTROL_AF_TRIGGER) || key.equals(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER)) {
                this.f47900a.m35388n(c5233lM24216c, c8785l1.m35247j(), new b(c8785l1.m35243f(), c8785l1.m35240c(), null));
                return;
            }
        }
        m49832o(Arrays.asList(c8785l1));
    }

    /* JADX INFO: renamed from: y */
    public void m49842y(C13559k3 c13559k3) {
        if (this.f47909j != c.SESSION_INITIALIZED) {
            return;
        }
        this.f47907h = new C13612r2(c13559k3, m49833p(this.f47908i.m35310p()));
        C5931r1.m26561a("ProcessingCaptureSession", "== onCaptureSessinStarted (id = " + this.f47914o + ")");
        this.f47900a.m35385k(this.f47907h);
        this.f47909j = c.ON_CAPTURE_SESSION_STARTED;
        C8802o3 c8802o3 = this.f47906g;
        if (c8802o3 != null) {
            mo49481d(c8802o3);
        }
        if (this.f47910k != null) {
            mo49479b(this.f47910k);
            this.f47910k = null;
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m49843z(C5233l c5233l, C5233l c5233l2) {
        C12964a.a aVar = new C12964a.a();
        aVar.m48219c(c5233l);
        aVar.m48219c(c5233l2);
        this.f47900a.m35381g(aVar.m48218b());
    }
}
