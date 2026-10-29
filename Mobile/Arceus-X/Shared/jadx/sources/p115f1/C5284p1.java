package p115f1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import ne.InterfaceFutureC9440x;
import p002a1.C0054c;
import p115f1.InterfaceC5237a2;
import p140g0.AbstractC5952w2;
import p140g0.C5902k0;
import p140g0.C5918o0;
import p140g0.C5931r1;
import p140g0.C5948v2;
import p140g0.InterfaceC5937t;
import p141g1.C5965a;
import p156h1.AbstractC6268i;
import p234k1.C7407c;
import p260l1.C7970m;
import p282m1.C8374m1;
import p282m1.C8395t1;
import p282m1.InterfaceC8389r1;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8828u;
import p296n0.AbstractC8830u1;
import p296n0.C8734c3;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.EnumC8723a4;
import p296n0.EnumC8832u3;
import p296n0.InterfaceC8721a2;
import p296n0.InterfaceC8722a3;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8841w2;
import p297n1.C8859b;
import p318o1.C9627g;
import p347p0.C10085a0;
import p347p0.C10110z;
import p366q0.C10417c;
import p397r0.C10773n;
import p397r0.InterfaceC10762c;
import p424s0.InterfaceC11156q;
import p503w0.C12274d;
import p531x0.C12602n0;
import p531x0.C12613t;
import p531x0.C12618v0;
import p533x2.C12637g;
import p563y1.C12997c;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: f1.p1 */
/* JADX INFO: loaded from: classes.dex */
public final class C5284p1<T extends InterfaceC5237a2> extends AbstractC5952w2 {

    /* JADX INFO: renamed from: H */
    public static final e f20428H = new e();

    /* JADX INFO: renamed from: A */
    public Rect f20429A;

    /* JADX INFO: renamed from: B */
    public int f20430B;

    /* JADX INFO: renamed from: C */
    public boolean f20431C;

    /* JADX INFO: renamed from: D */
    public f f20432D;

    /* JADX INFO: renamed from: E */
    public C8802o3.c f20433E;

    /* JADX INFO: renamed from: F */
    public Map<C5306x, List<Size>> f20434F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC8722a3.a<AbstractC5257g1> f20435G;

    /* JADX INFO: renamed from: s */
    public AbstractC8830u1 f20436s;

    /* JADX INFO: renamed from: t */
    public C12602n0 f20437t;

    /* JADX INFO: renamed from: u */
    public AbstractC5257g1 f20438u;

    /* JADX INFO: renamed from: v */
    public C8802o3.b f20439v;

    /* JADX INFO: renamed from: w */
    public InterfaceFutureC9440x<Void> f20440w;

    /* JADX INFO: renamed from: x */
    public C5948v2 f20441x;

    /* JADX INFO: renamed from: y */
    public InterfaceC5237a2.a f20442y;

    /* JADX INFO: renamed from: z */
    public C12618v0 f20443z;

    /* JADX INFO: renamed from: f1.p1$a */
    public class a implements InterfaceC8722a3.a<AbstractC5257g1> {
        public a() {
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p296n0.InterfaceC8722a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo2367a(AbstractC5257g1 abstractC5257g1) {
            if (abstractC5257g1 == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (C5284p1.this.f20442y == InterfaceC5237a2.a.INACTIVE) {
                return;
            }
            C5931r1.m26561a("VideoCapture", "Stream info update: old: " + C5284p1.this.f20438u + " new: " + abstractC5257g1);
            C5284p1 c5284p1 = C5284p1.this;
            AbstractC5257g1 abstractC5257g2 = c5284p1.f20438u;
            c5284p1.f20438u = abstractC5257g1;
            AbstractC8827t3 abstractC8827t3 = (AbstractC8827t3) C12637g.m47075g(c5284p1.m26702g());
            if (C5284p1.this.m24392T0(abstractC5257g2.mo24315a(), abstractC5257g1.mo24315a()) || C5284p1.this.m24401k1(abstractC5257g2, abstractC5257g1)) {
                C5284p1.this.m24394V0();
                return;
            }
            if ((abstractC5257g2.mo24315a() != -1 && abstractC5257g1.mo24315a() == -1) || (abstractC5257g2.mo24315a() == -1 && abstractC5257g1.mo24315a() != -1)) {
                C5284p1 c5284p2 = C5284p1.this;
                c5284p2.m24405z0(c5284p2.f20439v, abstractC5257g1, abstractC8827t3);
                C5284p1 c5284p3 = C5284p1.this;
                c5284p3.m26697d0(C5918o0.m26551a(new Object[]{c5284p3.f20439v.m35331p()}));
                C5284p1.this.m26685L();
                return;
            }
            if (abstractC5257g2.mo24317c() != abstractC5257g1.mo24317c()) {
                C5284p1 c5284p4 = C5284p1.this;
                c5284p4.m24405z0(c5284p4.f20439v, abstractC5257g1, abstractC8827t3);
                C5284p1 c5284p5 = C5284p1.this;
                c5284p5.m26697d0(C5918o0.m26551a(new Object[]{c5284p5.f20439v.m35331p()}));
                C5284p1.this.m26687N();
            }
        }

        @Override // p296n0.InterfaceC8722a3.a
        public void onError(Throwable th2) {
            C5931r1.m26573m("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    /* JADX INFO: renamed from: f1.p1$b */
    public class b extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public boolean f20445a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AtomicBoolean f20446b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C12997c.a f20447c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C8802o3.b f20448d;

        public b(AtomicBoolean atomicBoolean, C12997c.a aVar, C8802o3.b bVar) {
            this.f20446b = atomicBoolean;
            this.f20447c = aVar;
            this.f20448d = bVar;
        }

        /* JADX INFO: renamed from: e */
        public static /* synthetic */ void m24407e(b bVar, C8802o3.b bVar2) {
            bVar.getClass();
            bVar2.m35334t(bVar);
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            Object objM35564d;
            super.mo2221b(i10, interfaceC8743e0);
            if (this.f20445a) {
                this.f20445a = false;
                C5931r1.m26561a("VideoCapture", "cameraCaptureResult timestampNs = " + interfaceC8743e0.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.f20446b.get() || (objM35564d = interfaceC8743e0.mo6735c().m35564d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) objM35564d).intValue() != this.f20447c.hashCode() || !this.f20447c.m48314c(null) || this.f20446b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceM40084e = C10417c.m40084e();
            final C8802o3.b bVar = this.f20448d;
            scheduledExecutorServiceM40084e.execute(new Runnable() { // from class: f1.q1
                @Override // java.lang.Runnable
                public final void run() {
                    C5284p1.b.m24407e(this.f20464a, bVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: f1.p1$c */
    public class c implements InterfaceC10762c<Void> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ InterfaceFutureC9440x f20450a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f20451b;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public c(InterfaceFutureC9440x interfaceFutureC9440x, boolean z10) {
            this.f20450a = interfaceFutureC9440x;
            this.f20451b = z10;
        }

        /* JADX DEBUG: Method merged with bridge method: onSuccess(Ljava/lang/Object;)V */
        @Override // p397r0.InterfaceC10762c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            InterfaceFutureC9440x<Void> interfaceFutureC9440x = this.f20450a;
            C5284p1 c5284p1 = C5284p1.this;
            if (interfaceFutureC9440x != c5284p1.f20440w || c5284p1.f20442y == InterfaceC5237a2.a.INACTIVE) {
                return;
            }
            c5284p1.m24397b1(this.f20451b ? InterfaceC5237a2.a.ACTIVE_STREAMING : InterfaceC5237a2.a.ACTIVE_NON_STREAMING);
        }

        @Override // p397r0.InterfaceC10762c
        public void onFailure(Throwable th2) {
            if (th2 instanceof CancellationException) {
                return;
            }
            C5931r1.m26564d("VideoCapture", "Surface update completed with unexpected exception", th2);
        }
    }

    /* JADX INFO: renamed from: f1.p1$d */
    public static final class d<T extends InterfaceC5237a2> implements InterfaceC8771i4.b<C5284p1<T>, C5965a<T>, d<T>>, InterfaceC8769i2.a<d<T>> {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f20453a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public d(T t8) {
            this(m24409g(t8));
        }

        /* JADX INFO: renamed from: g */
        public static <T extends InterfaceC5237a2> C8846x2 m24409g(T t8) {
            C8846x2 c8846x2M35505k0 = C8846x2.m35505k0();
            c8846x2M35505k0.mo35473G(C5965a.f22766Q, t8);
            return c8846x2M35505k0;
        }

        /* JADX INFO: renamed from: h */
        public static d<? extends InterfaceC5237a2> m24410h(InterfaceC8795n1 interfaceC8795n1) {
            return new d<>(C8846x2.m35506l0(interfaceC8795n1));
        }

        @Override // p140g0.InterfaceC5906l0
        /* JADX INFO: renamed from: a */
        public InterfaceC8841w2 mo6684a() {
            return this.f20453a;
        }

        /* JADX INFO: renamed from: f */
        public C5284p1<T> m24414f() {
            return new C5284p1<>(mo6688e());
        }

        /* JADX DEBUG: Method merged with bridge method: e()Ln0/i4; */
        @Override // p296n0.InterfaceC8771i4.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C5965a<T> mo6688e() {
            return new C5965a<>(C8734c3.m35022j0(this.f20453a));
        }

        /* JADX INFO: renamed from: j */
        public d<T> m24416j(InterfaceC8777j4.b bVar) {
            mo6684a().mo35473G(InterfaceC8771i4.f31902G, bVar);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public d<T> m24417k(C5902k0 c5902k0) {
            mo6684a().mo35473G(InterfaceC8763h2.f31865l, c5902k0);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public d<T> m24418l(int i10) {
            mo6684a().mo35473G(InterfaceC8769i2.f31885p, Integer.valueOf(i10));
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: b(La1/c;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public d<T> mo24411b(C0054c c0054c) {
            mo6684a().mo35473G(InterfaceC8769i2.f31890u, c0054c);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public d<T> m24420n(EnumC8832u3 enumC8832u3) {
            mo6684a().mo35473G(InterfaceC8771i4.f31906K, enumC8832u3);
            return this;
        }

        /* JADX INFO: renamed from: o */
        public d<T> m24421o(int i10) {
            mo6684a().mo35473G(InterfaceC8771i4.f31896A, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: p */
        public d<T> m24422p(Class<C5284p1<T>> cls) {
            mo6684a().mo35473G(InterfaceC11156q.f39401N, cls);
            if (mo6684a().mo35030h(InterfaceC11156q.f39400M, null) == null) {
                m24424r(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* JADX INFO: renamed from: q */
        public d<T> m24423q(Range<Integer> range) {
            mo6684a().mo35473G(InterfaceC8771i4.f31898C, range);
            return this;
        }

        /* JADX INFO: renamed from: r */
        public d<T> m24424r(String str) {
            mo6684a().mo35473G(InterfaceC11156q.f39400M, str);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/util/Size;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public d<T> mo24413d(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        /* JADX DEBUG: Method merged with bridge method: c(I)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public d<T> mo24412c(int i10) {
            mo6684a().mo35473G(InterfaceC8769i2.f31883n, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: u */
        public d<T> m24427u(InterfaceC8389r1.a aVar) {
            mo6684a().mo35473G(C5965a.f22767R, aVar);
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(C8846x2 c8846x2) {
            this.f20453a = c8846x2;
            if (!c8846x2.mo35023a(C5965a.f22766Q)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) c8846x2.mo35030h(InterfaceC11156q.f39401N, null);
            if (cls == null || cls.equals(C5284p1.class)) {
                m24416j(InterfaceC8777j4.b.VIDEO_CAPTURE);
                m24422p(C5284p1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: f1.p1$e */
    public static final class e {

        /* JADX INFO: renamed from: a */
        public static final EnumC8832u3 f20454a;

        /* JADX INFO: renamed from: b */
        public static final InterfaceC5237a2 f20455b;

        /* JADX INFO: renamed from: c */
        public static final C5965a<?> f20456c;

        /* JADX INFO: renamed from: d */
        public static final InterfaceC8389r1.a f20457d;

        /* JADX INFO: renamed from: e */
        public static final Range<Integer> f20458e;

        /* JADX INFO: renamed from: f */
        public static final Range<Integer> f20459f;

        /* JADX INFO: renamed from: g */
        public static final C5902k0 f20460g;

        static {
            EnumC8832u3 enumC8832u3 = EnumC8832u3.VIDEO_RECORD;
            f20454a = enumC8832u3;
            InterfaceC5237a2 interfaceC5237a2 = new InterfaceC5237a2() { // from class: f1.r1
                @Override // p115f1.InterfaceC5237a2
                /* JADX INFO: renamed from: a */
                public final void mo24237a(C5948v2 c5948v2) {
                    c5948v2.m26664z();
                }
            };
            f20455b = interfaceC5237a2;
            InterfaceC8389r1.a aVar = C8395t1.f30947d;
            f20457d = aVar;
            f20458e = new Range<>(30, 30);
            f20459f = new Range<>(120, 120);
            C5902k0 c5902k0 = C5902k0.f22550d;
            f20460g = c5902k0;
            f20456c = new d(interfaceC5237a2).m24421o(5).m24420n(enumC8832u3).m24427u(aVar).m24417k(c5902k0).mo6688e();
        }

        /* JADX INFO: renamed from: a */
        public C5965a<?> m24428a() {
            return f20456c;
        }
    }

    /* JADX INFO: renamed from: f1.p1$f */
    public static class f implements InterfaceC8722a3.a<Boolean> {

        /* JADX INFO: renamed from: a */
        public InterfaceC8784l0 f20461a;

        /* JADX INFO: renamed from: b */
        public boolean f20462b = false;

        public f(InterfaceC8784l0 interfaceC8784l0) {
            this.f20461a = interfaceC8784l0;
        }

        /* JADX INFO: renamed from: b */
        public void m24429b() {
            C12637g.m47078j(C10110z.m39010d(), "SourceStreamRequirementObserver can be closed from main thread only");
            C5931r1.m26561a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.f20462b);
            if (this.f20461a == null) {
                C5931r1.m26561a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                m24431d(false);
                this.f20461a = null;
            }
        }

        /* JADX DEBUG: Method merged with bridge method: a(Ljava/lang/Object;)V */
        @Override // p296n0.InterfaceC8722a3.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void mo2367a(Boolean bool) {
            C12637g.m47078j(C10110z.m39010d(), "SourceStreamRequirementObserver can be updated from main thread only");
            m24431d(Boolean.TRUE.equals(bool));
        }

        /* JADX INFO: renamed from: d */
        public final void m24431d(boolean z10) {
            if (this.f20462b == z10) {
                return;
            }
            this.f20462b = z10;
            InterfaceC8784l0 interfaceC8784l0 = this.f20461a;
            if (interfaceC8784l0 == null) {
                C5931r1.m26561a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z10) {
                interfaceC8784l0.mo35016k();
            } else {
                interfaceC8784l0.mo35012d();
            }
        }

        @Override // p296n0.InterfaceC8722a3.a
        public void onError(Throwable th2) {
            C5931r1.m26573m("VideoCapture", "SourceStreamRequirementObserver#onError", th2);
        }
    }

    public C5284p1(C5965a<T> c5965a) {
        super(c5965a);
        this.f20438u = AbstractC5257g1.f20363a;
        this.f20439v = new C8802o3.b();
        this.f20440w = null;
        this.f20442y = InterfaceC5237a2.a.INACTIVE;
        this.f20431C = false;
        this.f20434F = Collections.EMPTY_MAP;
        this.f20435G = new a();
    }

    /* JADX INFO: renamed from: B0 */
    private void m24346B0() {
        C10110z.m39008b();
        C8802o3.c cVar = this.f20433E;
        if (cVar != null) {
            cVar.m35341b();
            this.f20433E = null;
        }
        AbstractC8830u1 abstractC8830u1 = this.f20436s;
        if (abstractC8830u1 != null) {
            abstractC8830u1.mo35430d();
            this.f20436s = null;
        }
        C12618v0 c12618v0 = this.f20443z;
        if (c12618v0 != null) {
            c12618v0.m47010f();
            this.f20443z = null;
        }
        C12602n0 c12602n0 = this.f20437t;
        if (c12602n0 != null) {
            c12602n0.m46951i();
            this.f20437t = null;
        }
        this.f20429A = null;
        this.f20441x = null;
        this.f20438u = AbstractC5257g1.f20363a;
        this.f20430B = 0;
        this.f20431C = false;
    }

    /* JADX INFO: renamed from: F0 */
    public static <T> T m24347F0(InterfaceC8722a3<T> interfaceC8722a3, T t8) {
        InterfaceFutureC9440x<T> interfaceFutureC9440xMo34017b = interfaceC8722a3.mo34017b();
        if (!interfaceFutureC9440xMo34017b.isDone()) {
            return t8;
        }
        try {
            return interfaceFutureC9440xMo34017b.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    /* JADX INFO: renamed from: G0 */
    public static LinkedHashMap<C5306x, List<Size>> m24348G0(InterfaceC8389r1.a aVar, AbstractC5291s abstractC5291s, C5902k0 c5902k0, InterfaceC5260h1 interfaceC5260h1, LinkedHashMap<C5306x, List<Size>> linkedHashMap, Map<C5306x, Size> map) {
        AbstractC6268i abstractC6268iMo24276b;
        InterfaceC8389r1 interfaceC8389r1M24349H0;
        if (linkedHashMap.isEmpty()) {
            return new LinkedHashMap<>();
        }
        LinkedHashMap<C5306x, List<Size>> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry<C5306x, List<Size>> entry : linkedHashMap.entrySet()) {
            ArrayList arrayList = new ArrayList(entry.getValue());
            Iterator<Size> it = arrayList.iterator();
            while (it.hasNext()) {
                Size next = it.next();
                if (!map.containsValue(next) && (abstractC6268iMo24276b = interfaceC5260h1.mo24276b(next, c5902k0)) != null && (interfaceC8389r1M24349H0 = m24349H0(aVar, abstractC6268iMo24276b, c5902k0, abstractC5291s)) != null && !interfaceC8389r1M24349H0.m34063e(next.getWidth(), next.getHeight())) {
                    it.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put(entry.getKey(), arrayList);
            }
        }
        return linkedHashMap2;
    }

    /* JADX INFO: renamed from: H0 */
    public static InterfaceC8389r1 m24349H0(InterfaceC8389r1.a aVar, AbstractC6268i abstractC6268i, C5902k0 c5902k0, AbstractC5291s abstractC5291s) {
        InterfaceC8389r1 interfaceC8389r1M24352Y0;
        int iM45570b;
        if (c5902k0.m26519e()) {
            return m24352Y0(aVar, abstractC6268i, abstractC5291s, c5902k0);
        }
        InterfaceC8389r1 interfaceC8389r1 = null;
        int i10 = EditorInfoCompat.IME_FLAG_FORCE_ASCII;
        for (InterfaceC8721a2.c cVar : abstractC6268i.mo27490b()) {
            if (C8859b.m35574f(cVar, c5902k0) && (interfaceC8389r1M24352Y0 = m24352Y0(aVar, abstractC6268i, abstractC5291s, new C5902k0(C8859b.m35576h(cVar.mo34993g()), C8859b.m35575g(cVar.mo34988b())))) != null && (iM45570b = C12274d.m45570b(((Integer) interfaceC8389r1M24352Y0.mo34059i().getUpper()).intValue(), ((Integer) interfaceC8389r1M24352Y0.mo34060j().getUpper()).intValue())) > i10) {
                interfaceC8389r1 = interfaceC8389r1M24352Y0;
                i10 = iM45570b;
            }
        }
        return interfaceC8389r1;
    }

    /* JADX INFO: renamed from: W0 */
    public static Range<Integer> m24350W0(AbstractC8827t3 abstractC8827t3) {
        Range<Integer> rangeMo35392c = abstractC8827t3.mo35392c();
        if (Objects.equals(rangeMo35392c, AbstractC8827t3.f32104a)) {
            return abstractC8827t3.mo35396g() == 1 ? e.f20459f : e.f20458e;
        }
        return rangeMo35392c;
    }

    /* JADX INFO: renamed from: X0 */
    public static EnumC8723a4 m24351X0(InterfaceC8804p0 interfaceC8804p0, C12618v0 c12618v0) {
        return (c12618v0 == null && interfaceC8804p0.mo6701q()) ? EnumC8723a4.UPTIME : interfaceC8804p0.mo6698k().mo35056t();
    }

    /* JADX INFO: renamed from: Y0 */
    public static InterfaceC8389r1 m24352Y0(InterfaceC8389r1.a aVar, AbstractC6268i abstractC6268i, AbstractC5291s abstractC5291s, C5902k0 c5902k0) {
        InterfaceC8389r1 interfaceC8389r1Mo34064a = aVar.mo34064a(C7970m.m32996e(abstractC5291s, c5902k0, abstractC6268i).mo32977a());
        if (interfaceC8389r1Mo34064a != null) {
            return C9627g.m37990l(interfaceC8389r1Mo34064a, abstractC6268i != null ? abstractC6268i.mo27494k().m34997k() : null);
        }
        C5931r1.m26572l("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    /* JADX INFO: renamed from: Z0 */
    private void m24353Z0() {
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        C12602n0 c12602n0 = this.f20437t;
        if (interfaceC8804p0M26704i == null || c12602n0 == null) {
            return;
        }
        int iM24381I0 = m24381I0(interfaceC8804p0M26704i);
        this.f20430B = iM24381I0;
        c12602n0.m46968z(iM24381I0, m26700f());
    }

    /* JADX INFO: renamed from: f1 */
    public static boolean m24354f1(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    /* JADX INFO: renamed from: g1 */
    public static boolean m24356g1(InterfaceC8804p0 interfaceC8804p0, C5902k0 c5902k0) {
        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) C7407c.m30691b(HdrRepeatingRequestFailureQuirk.class);
        return interfaceC8804p0.mo6701q() && hdrRepeatingRequestFailureQuirk != null && hdrRepeatingRequestFailureQuirk.m2298i(c5902k0);
    }

    /* JADX INFO: renamed from: h1 */
    public static <T extends InterfaceC5237a2> boolean m24358h1(InterfaceC8804p0 interfaceC8804p0, C5965a<T> c5965a) {
        return interfaceC8804p0.mo6701q() && c5965a.m26766j0();
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0036: ARITH (wrap int:0x001a: ARITH (wrap int:0x0009: INVOKE 
      (wrap int:0x0008: ARITH (wrap int:0x0000: INVOKE (r3v0 android.util.Size) VIRTUAL call: android.util.Size.getWidth():int A[MD:():int (c), WRAPPED]) - (wrap int:0x0004: INVOKE (r2v0 android.graphics.Rect) VIRTUAL call: android.graphics.Rect.width():int A[MD:():int (c), WRAPPED]) A[WRAPPED])
     STATIC call: java.lang.Math.abs(int):int A[MD:(int):int (c), WRAPPED]) + (wrap int:0x0016: INVOKE 
      (wrap int:0x0015: ARITH (wrap int:0x000d: INVOKE (r3v0 android.util.Size) VIRTUAL call: android.util.Size.getHeight():int A[MD:():int (c), WRAPPED]) - (wrap int:0x0011: INVOKE (r2v0 android.graphics.Rect) VIRTUAL call: android.graphics.Rect.height():int A[MD:():int (c), WRAPPED]) A[WRAPPED])
     STATIC call: java.lang.Math.abs(int):int A[MD:(int):int (c), WRAPPED]) A[WRAPPED]) - (wrap int:0x0035: ARITH (wrap int:0x0024: INVOKE 
      (wrap int:0x0023: ARITH (wrap int:0x001b: INVOKE (r4v0 android.util.Size) VIRTUAL call: android.util.Size.getWidth():int A[MD:():int (c), WRAPPED]) - (wrap int:0x001f: INVOKE (r2v0 android.graphics.Rect) VIRTUAL call: android.graphics.Rect.width():int A[MD:():int (c), WRAPPED]) A[WRAPPED])
     STATIC call: java.lang.Math.abs(int):int A[MD:(int):int (c), WRAPPED]) + (wrap int:0x0031: INVOKE 
      (wrap int:0x0030: ARITH (wrap int:0x0028: INVOKE (r4v0 android.util.Size) VIRTUAL call: android.util.Size.getHeight():int A[MD:():int (c), WRAPPED]) - (wrap int:0x002c: INVOKE (r2v0 android.graphics.Rect) VIRTUAL call: android.graphics.Rect.height():int A[MD:():int (c), WRAPPED]) A[WRAPPED])
     STATIC call: java.lang.Math.abs(int):int A[MD:(int):int (c), WRAPPED]) A[WRAPPED]) */
    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ int m24359i0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    /* JADX INFO: renamed from: i1 */
    public static boolean m24360i1(InterfaceC8804p0 interfaceC8804p0) {
        if (interfaceC8804p0.mo6701q()) {
            return SurfaceProcessingQuirk.m2260e(C7407c.m30692c()) || SurfaceProcessingQuirk.m2260e(interfaceC8804p0.mo6698k().mo35049l());
        }
        return false;
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m24361j0(C5284p1 c5284p1, AbstractC8830u1 abstractC8830u1) {
        if (abstractC8830u1 == c5284p1.f20436s) {
            c5284p1.m24346B0();
        }
    }

    /* JADX INFO: renamed from: j1 */
    private boolean m24362j1(InterfaceC8804p0 interfaceC8804p0) {
        return interfaceC8804p0.mo6701q() && m26681H(interfaceC8804p0);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m24364l0(AtomicBoolean atomicBoolean, C8802o3.b bVar, AbstractC8828u abstractC8828u) {
        C12637g.m47078j(C10110z.m39010d(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.m35334t(abstractC8828u);
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ Object m24365m0(C5284p1 c5284p1, final C8802o3.b bVar, C12997c.a aVar) {
        c5284p1.getClass();
        bVar.m35330o("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.m48312a(new Runnable() { // from class: f1.n1
            @Override // java.lang.Runnable
            public final void run() {
                C5284p1.m24364l0(atomicBoolean, bVar, bVar2);
            }
        }, C10417c.m40081b());
        bVar.m35325j(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    /* JADX INFO: renamed from: m1 */
    public static <T extends InterfaceC5237a2> C5284p1<T> m24366m1(T t8) {
        return new d((InterfaceC5237a2) C12637g.m47075g(t8)).m24414f();
    }

    /* JADX INFO: renamed from: r0 */
    public static void m24371r0(Set<Size> set, int i10, int i11, Size size, InterfaceC8389r1 interfaceC8389r1) {
        if (i10 > size.getWidth() || i11 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i10, ((Integer) interfaceC8389r1.mo34058h(i10).clamp(Integer.valueOf(i11))).intValue()));
        } catch (IllegalArgumentException e10) {
            C5931r1.m26573m("VideoCapture", "No supportedHeights for width: " + i10, e10);
        }
        try {
            set.add(new Size(((Integer) interfaceC8389r1.mo34053b(i11).clamp(Integer.valueOf(i10))).intValue(), i11));
        } catch (IllegalArgumentException e11) {
            C5931r1.m26573m("VideoCapture", "No supportedWidths for height: " + i11, e11);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public static Rect m24372s0(Rect rect, int i10, boolean z10, InterfaceC8389r1 interfaceC8389r1) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) C7407c.m30691b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z10) {
            i10 = 0;
        }
        return sizeCannotEncodeVideoQuirk.m2333g(rect, i10, interfaceC8389r1);
    }

    /* JADX INFO: renamed from: t0 */
    public static Rect m24373t0(final Rect rect, Size size, InterfaceC8389r1 interfaceC8389r1) {
        C5931r1.m26561a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", C10085a0.m38886n(rect), Integer.valueOf(interfaceC8389r1.mo34056f()), Integer.valueOf(interfaceC8389r1.mo34054c()), interfaceC8389r1.mo34059i(), interfaceC8389r1.mo34060j()));
        if ((!interfaceC8389r1.mo34059i().contains(Integer.valueOf(rect.width())) || !interfaceC8389r1.mo34060j().contains(Integer.valueOf(rect.height()))) && interfaceC8389r1.mo34052a() && interfaceC8389r1.mo34060j().contains(Integer.valueOf(rect.width())) && interfaceC8389r1.mo34059i().contains(Integer.valueOf(rect.height()))) {
            interfaceC8389r1 = new C8374m1(interfaceC8389r1);
        }
        int iMo34056f = interfaceC8389r1.mo34056f();
        int iMo34054c = interfaceC8389r1.mo34054c();
        Range<Integer> rangeMo34059i = interfaceC8389r1.mo34059i();
        Range<Integer> rangeMo34060j = interfaceC8389r1.mo34060j();
        int iM24375x0 = m24375x0(rect.width(), iMo34056f, rangeMo34059i);
        int iM24376y0 = m24376y0(rect.width(), iMo34056f, rangeMo34059i);
        int iM24375x1 = m24375x0(rect.height(), iMo34054c, rangeMo34060j);
        int iM24376y1 = m24376y0(rect.height(), iMo34054c, rangeMo34060j);
        HashSet hashSet = new HashSet();
        m24371r0(hashSet, iM24375x0, iM24375x1, size, interfaceC8389r1);
        m24371r0(hashSet, iM24375x0, iM24376y1, size, interfaceC8389r1);
        m24371r0(hashSet, iM24376y0, iM24375x1, size, interfaceC8389r1);
        m24371r0(hashSet, iM24376y0, iM24376y1, size, interfaceC8389r1);
        if (hashSet.isEmpty()) {
            C5931r1.m26572l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        C5931r1.m26561a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: f1.o1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return C5284p1.m24359i0(rect, (Size) obj, (Size) obj2);
            }
        });
        C5931r1.m26561a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            C5931r1.m26561a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        C12637g.m47077i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
        Rect rect2 = new Rect(rect);
        if (width != rect.width()) {
            int iMax = Math.max(0, rect.centerX() - (width / 2));
            rect2.left = iMax;
            int i10 = iMax + width;
            rect2.right = i10;
            if (i10 > size.getWidth()) {
                int width2 = size.getWidth();
                rect2.right = width2;
                rect2.left = width2 - width;
            }
        }
        if (height != rect.height()) {
            int iMax2 = Math.max(0, rect.centerY() - (height / 2));
            rect2.top = iMax2;
            int i11 = iMax2 + height;
            rect2.bottom = i11;
            if (i11 > size.getHeight()) {
                int height2 = size.getHeight();
                rect2.bottom = height2;
                rect2.top = height2 - height;
            }
        }
        C5931r1.m26561a("VideoCapture", String.format("Adjust cropRect from %s to %s", C10085a0.m38886n(rect), C10085a0.m38886n(rect2)));
        return rect2;
    }

    /* JADX INFO: renamed from: w0 */
    public static int m24374w0(boolean z10, int i10, int i11, Range<Integer> range) {
        int i12 = i10 % i11;
        if (i12 != 0) {
            i10 = z10 ? i10 - i12 : i10 + (i11 - i12);
        }
        return ((Integer) range.clamp(Integer.valueOf(i10))).intValue();
    }

    /* JADX INFO: renamed from: x0 */
    public static int m24375x0(int i10, int i11, Range<Integer> range) {
        return m24374w0(true, i10, i11, range);
    }

    /* JADX INFO: renamed from: y0 */
    public static int m24376y0(int i10, int i11, Range<Integer> range) {
        return m24374w0(false, i10, i11, range);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: A */
    public Set<C5902k0> mo6654A(InterfaceC8799o0 interfaceC8799o0) {
        return m24390R0(interfaceC8799o0, 0).mo24277c();
    }

    /* JADX INFO: renamed from: A0 */
    public final Rect m24377A0(Size size, InterfaceC8389r1 interfaceC8389r1) {
        Rect rectM26678E = m26678E() != null ? m26678E() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (interfaceC8389r1 == null || interfaceC8389r1.m34063e(rectM26678E.width(), rectM26678E.height())) ? rectM26678E : m24373t0(rectM26678E, size, interfaceC8389r1);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: B */
    public Set<Integer> mo6655B() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    /* JADX INFO: renamed from: C0 */
    public final C12618v0 m24378C0(InterfaceC8804p0 interfaceC8804p0, C5965a<T> c5965a, int i10, Rect rect, Size size, C5902k0 c5902k0) {
        if (!m24391S0(interfaceC8804p0, c5965a, i10, rect, size, c5902k0)) {
            return null;
        }
        C5931r1.m26561a("VideoCapture", "Surface processing is enabled.");
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i);
        return new C12618v0(interfaceC8804p0M26704i, m26708n() != null ? m26708n().m26539a() : C12613t.a.m47002a(c5902k0));
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: D */
    public InterfaceC8771i4.b<?, ?, ?> mo6658D(InterfaceC8795n1 interfaceC8795n1) {
        return d.m24410h(interfaceC8795n1);
    }

    /* JADX INFO: renamed from: D0 */
    public final LinkedHashMap<C5306x, List<Size>> m24379D0(InterfaceC8799o0 interfaceC8799o0, AbstractC5291s abstractC5291s, C5902k0 c5902k0, InterfaceC5260h1 interfaceC5260h1, int i10, Range<Integer> range, InterfaceC8389r1.a aVar, List<C5306x> list) {
        int iMo24263b = abstractC5291s.mo24306d().mo24263b();
        Map<C5306x, Size> mapM24234h = C5235a0.m24234h(interfaceC5260h1, c5902k0);
        C5312z c5312z = new C5312z(m24388P0(interfaceC8799o0, i10, range), mapM24234h);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (C5306x c5306x : list) {
            linkedHashMap.put(c5306x, c5312z.m24602g(c5306x, iMo24263b));
        }
        return m24348G0(aVar, abstractC5291s, c5902k0, interfaceC5260h1, linkedHashMap, mapM24234h);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: E0 */
    public final C8802o3.b m24380E0(final C5965a<T> c5965a, AbstractC8827t3 abstractC8827t3) {
        final C5284p1<T> c5284p1 = this;
        C10110z.m39008b();
        final InterfaceC8804p0 interfaceC8804p0 = (InterfaceC8804p0) C12637g.m47075g(c5284p1.m26704i());
        Size sizeMo35395f = abstractC8827t3.mo35395f();
        Runnable runnable = new Runnable() { // from class: f1.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f20380a.m26685L();
            }
        };
        Range<Integer> rangeM24350W0 = m24350W0(abstractC8827t3);
        AbstractC5291s abstractC5291sM24382J0 = c5284p1.m24382J0();
        Objects.requireNonNull(abstractC5291sM24382J0);
        int iMo35396g = abstractC8827t3.mo35396g();
        InterfaceC5260h1 interfaceC5260h1M24390R0 = c5284p1.m24390R0(interfaceC8804p0.mo22074d(), iMo35396g);
        C5902k0 c5902k0Mo35391b = abstractC8827t3.mo35391b();
        InterfaceC8389r1 interfaceC8389r1M24352Y0 = m24352Y0(c5965a.m26764h0(), interfaceC5260h1M24390R0.mo24276b(sizeMo35395f, c5902k0Mo35391b), abstractC5291sM24382J0, c5902k0Mo35391b);
        c5284p1.f20430B = c5284p1.m24381I0(interfaceC8804p0);
        Rect rectM24377A0 = c5284p1.m24377A0(sizeMo35395f, interfaceC8389r1M24352Y0);
        Rect rectM24403u0 = c5284p1.m24403u0(rectM24377A0, c5284p1.f20430B);
        c5284p1.f20429A = rectM24403u0;
        Size sizeM24404v0 = c5284p1.m24404v0(sizeMo35395f, rectM24377A0, rectM24403u0);
        if (c5284p1.m24400e1()) {
            c5284p1.f20431C = true;
        }
        Rect rect = c5284p1.f20429A;
        Rect rectM24372s0 = m24372s0(rect, c5284p1.f20430B, c5284p1.m24391S0(interfaceC8804p0, c5965a, iMo35396g, rect, sizeMo35395f, c5902k0Mo35391b), interfaceC8389r1M24352Y0);
        c5284p1.f20429A = rectM24372s0;
        c5284p1.f20443z = c5284p1.m24378C0(interfaceC8804p0, c5965a, iMo35396g, rectM24372s0, sizeMo35395f, c5902k0Mo35391b);
        final boolean z10 = (interfaceC8804p0.mo6701q() && c5284p1.f20443z == null) ? false : true;
        final EnumC8723a4 enumC8723a4M24351X0 = m24351X0(interfaceC8804p0, c5284p1.f20443z);
        C5931r1.m26561a("VideoCapture", "camera timebase = " + interfaceC8804p0.mo6698k().mo35056t() + ", processing timebase = " + enumC8723a4M24351X0);
        AbstractC8827t3 abstractC8827t3Mo35399a = abstractC8827t3.mo35398i().mo35404f(sizeM24404v0).mo35401c(rangeM24350W0).mo35399a();
        C12637g.m47077i(c5284p1.f20437t == null);
        C12602n0 c12602n0 = new C12602n0(2, 34, abstractC8827t3Mo35399a, c5284p1.m26719y(), interfaceC8804p0.mo6701q(), c5284p1.f20429A, c5284p1.f20430B, c5284p1.m26700f(), c5284p1.m24362j1(interfaceC8804p0));
        c5284p1.f20437t = c12602n0;
        c12602n0.m46947e(runnable);
        if (c5284p1.f20443z != null) {
            AbstractC13677f abstractC13677fM49905j = AbstractC13677f.m49905j(c5284p1.f20437t);
            final C12602n0 c12602n1 = c5284p1.f20443z.m47014j(C12618v0.b.m47017c(c5284p1.f20437t, Collections.singletonList(abstractC13677fM49905j))).get(abstractC13677fM49905j);
            Objects.requireNonNull(c12602n1);
            c5284p1 = this;
            c12602n1.m46947e(new Runnable() { // from class: f1.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20387a.m24393U0(c12602n1, interfaceC8804p0, c5965a, enumC8723a4M24351X0, z10);
                }
            });
            c5284p1.f20441x = c12602n1.m46953k(interfaceC8804p0);
            final AbstractC8830u1 abstractC8830u1M46957o = c5284p1.f20437t.m46957o();
            c5284p1.f20436s = abstractC8830u1M46957o;
            abstractC8830u1M46957o.m35437k().mo37173a(new Runnable() { // from class: f1.l1
                @Override // java.lang.Runnable
                public final void run() {
                    C5284p1.m24361j0(this.f20397a, abstractC8830u1M46957o);
                }
            }, C10417c.m40084e());
        } else {
            C5948v2 c5948v2M46953k = c5284p1.f20437t.m46953k(interfaceC8804p0);
            c5284p1.f20441x = c5948v2M46953k;
            c5284p1.f20436s = c5948v2M46953k.m26652n();
        }
        c5965a.m26765i0().mo24238b(c5284p1.f20441x, enumC8723a4M24351X0, z10);
        c5284p1.m24353Z0();
        c5284p1.f20436s.m35441p(MediaCodec.class);
        C8802o3.b bVarM35312r = C8802o3.b.m35312r(c5965a, abstractC8827t3.mo35395f());
        bVarM35312r.m35313A(iMo35396g);
        c5284p1.m26693b(bVarM35312r, abstractC8827t3);
        bVarM35312r.m35315C(c5965a.m35214x());
        C8802o3.c cVar = c5284p1.f20433E;
        if (cVar != null) {
            cVar.m35341b();
        }
        C8802o3.c cVar2 = new C8802o3.c(new C8802o3.d() { // from class: f1.m1
            @Override // p296n0.C8802o3.d
            /* JADX INFO: renamed from: a */
            public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                this.f20403a.m24394V0();
            }
        });
        c5284p1.f20433E = cVar2;
        bVarM35312r.m35335u(cVar2);
        if (abstractC8827t3.mo35393d() != null) {
            bVarM35312r.m35322g(abstractC8827t3.mo35393d());
        }
        return bVarM35312r;
    }

    /* JADX INFO: renamed from: I0 */
    public final int m24381I0(InterfaceC8804p0 interfaceC8804p0) {
        boolean zM26681H = m26681H(interfaceC8804p0);
        int iM26715u = m26715u(interfaceC8804p0, zM26681H);
        if (!m24400e1()) {
            return iM26715u;
        }
        C5948v2.h hVarMo24316b = this.f20438u.mo24316b();
        Objects.requireNonNull(hVarMo24316b);
        int iMo26510b = hVarMo24316b.mo26510b();
        if (zM26681H != hVarMo24316b.mo26514f()) {
            iMo26510b = -iMo26510b;
        }
        return C10085a0.m38895w(iM26715u - iMo26510b);
    }

    /* JADX INFO: renamed from: J0 */
    public final AbstractC5291s m24382J0() {
        return (AbstractC5291s) m24347F0(m24384L0().mo24239c(), null);
    }

    /* JADX INFO: renamed from: K0 */
    public final AbstractC5291s m24383K0() {
        AbstractC5291s abstractC5291sM24382J0 = m24382J0();
        if (abstractC5291sM24382J0 != null) {
            return abstractC5291sM24382J0;
        }
        throw new IllegalArgumentException("MediaSpec can't be null");
    }

    /* JADX INFO: renamed from: L0 */
    public T m24384L0() {
        return (T) ((C5965a) m26707l()).m26765i0();
    }

    /* JADX INFO: renamed from: M0 */
    public final List<C5306x> m24385M0(List<C5306x> list, C5235a0 c5235a0) {
        List<C5306x> listM24236f = c5235a0.m24236f(list);
        C5931r1.m26561a("VideoCapture", "Found selectedQualities " + listM24236f + " by " + c5235a0);
        if (listM24236f.isEmpty()) {
            throw new IllegalArgumentException("Unable to find selected quality");
        }
        return listM24236f;
    }

    /* JADX INFO: renamed from: N0 */
    public final int m24386N0(C5965a<T> c5965a) {
        return c5965a.m35211o(0);
    }

    /* JADX INFO: renamed from: O0 */
    public final List<C5306x> m24387O0(C5902k0 c5902k0, InterfaceC5260h1 interfaceC5260h1, int i10) {
        List<C5306x> listMo24279e = interfaceC5260h1.mo24279e(c5902k0);
        C5931r1.m26561a("VideoCapture", "supportedQualities = " + listMo24279e);
        if (listMo24279e.isEmpty() && i10 == 1) {
            throw new IllegalArgumentException("No supported quality on the device for high-speed capture.");
        }
        return listMo24279e;
    }

    /* JADX INFO: renamed from: P0 */
    public final List<Size> m24388P0(InterfaceC8799o0 interfaceC8799o0, int i10, Range<Integer> range) {
        if (i10 == 1) {
            return AbstractC8827t3.f32104a.equals(range) ? interfaceC8799o0.mo35059y() : interfaceC8799o0.mo35054r(range);
        }
        return interfaceC8799o0.mo35050m(m26710p());
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: Q */
    public InterfaceC8771i4<?> mo6664Q(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        m24402l1(interfaceC8799o0, bVar);
        return bVar.mo6688e();
    }

    /* JADX INFO: renamed from: Q0 */
    public final Range<Integer> m24389Q0(C5965a<T> c5965a) {
        Range<Integer> rangeM35215z = c5965a.m35215z(AbstractC8827t3.f32104a);
        Objects.requireNonNull(rangeM35215z);
        return rangeM35215z;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: R */
    public void mo6665R() {
        super.mo6665R();
        C5931r1.m26561a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + m26706k());
        if (m26702g() == null || this.f20441x != null) {
            return;
        }
        AbstractC8827t3 abstractC8827t3 = (AbstractC8827t3) C12637g.m47075g(m26702g());
        this.f20438u = (AbstractC5257g1) m24347F0(m24384L0().mo24241e(), AbstractC5257g1.f20363a);
        C8802o3.b bVarM24380E0 = m24380E0((C5965a) m26707l(), abstractC8827t3);
        this.f20439v = bVarM24380E0;
        m24405z0(bVarM24380E0, this.f20438u, abstractC8827t3);
        m26697d0(C5918o0.m26551a(new Object[]{this.f20439v.m35331p()}));
        m26683J();
        m24384L0().mo24241e().mo34018c(C10417c.m40084e(), this.f20435G);
        f fVar = this.f20432D;
        if (fVar != null) {
            fVar.m24429b();
        }
        this.f20432D = new f(m26705j());
        m24384L0().mo24243g().mo34018c(C10417c.m40084e(), this.f20432D);
        m24397b1(InterfaceC5237a2.a.ACTIVE_NON_STREAMING);
    }

    /* JADX INFO: renamed from: R0 */
    public final InterfaceC5260h1 m24390R0(InterfaceC5937t interfaceC5937t, int i10) {
        return m24384L0().mo24242f(interfaceC5937t, i10);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: S */
    public void mo6666S() {
        C5931r1.m26561a("VideoCapture", "VideoCapture#onStateDetached");
        C12637g.m47078j(C10110z.m39010d(), "VideoCapture can only be detached on the main thread.");
        if (this.f20432D != null) {
            m24384L0().mo24243g().mo34019d(this.f20432D);
            this.f20432D.m24429b();
            this.f20432D = null;
        }
        m24397b1(InterfaceC5237a2.a.INACTIVE);
        m24384L0().mo24241e().mo34019d(this.f20435G);
        InterfaceFutureC9440x<Void> interfaceFutureC9440x = this.f20440w;
        if (interfaceFutureC9440x != null && interfaceFutureC9440x.cancel(false)) {
            C5931r1.m26561a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        m24346B0();
    }

    /* JADX INFO: renamed from: S0 */
    public final boolean m24391S0(InterfaceC8804p0 interfaceC8804p0, C5965a<?> c5965a, int i10, Rect rect, Size size, C5902k0 c5902k0) {
        if (i10 == 1) {
            return false;
        }
        return m26708n() != null || m24358h1(interfaceC8804p0, c5965a) || m24360i1(interfaceC8804p0) || m24356g1(interfaceC8804p0, c5902k0) || m24354f1(rect, size) || m24362j1(interfaceC8804p0) || m24400e1();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: T */
    public AbstractC8827t3 mo6667T(InterfaceC8795n1 interfaceC8795n1) {
        this.f20439v.m35322g(interfaceC8795n1);
        m26697d0(C5918o0.m26551a(new Object[]{this.f20439v.m35331p()}));
        AbstractC8827t3 abstractC8827t3M26702g = m26702g();
        Objects.requireNonNull(abstractC8827t3M26702g);
        return abstractC8827t3M26702g.mo35398i().mo35402d(interfaceC8795n1).mo35399a();
    }

    /* JADX INFO: renamed from: T0 */
    public boolean m24392T0(int i10, int i11) {
        Set<Integer> set = AbstractC5257g1.f20364b;
        return (set.contains(Integer.valueOf(i10)) || set.contains(Integer.valueOf(i11)) || i10 == i11) ? false : true;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: U */
    public AbstractC8827t3 mo6668U(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        C5931r1.m26561a("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + abstractC8827t3 + ", secondaryStreamSpec " + abstractC8827t4);
        List<Size> listM35186N = ((C5965a) m26707l()).m35186N(null);
        if (listM35186N != null && !listM35186N.contains(abstractC8827t3.mo35395f())) {
            C5931r1.m26572l("VideoCapture", "suggested resolution " + abstractC8827t3.mo35395f() + " is not in custom ordered resolutions " + listM35186N);
        }
        return abstractC8827t3;
    }

    /* JADX INFO: renamed from: U0 */
    public final void m24393U0(C12602n0 c12602n0, InterfaceC8804p0 interfaceC8804p0, C5965a<T> c5965a, EnumC8723a4 enumC8723a4, boolean z10) {
        if (interfaceC8804p0 == m26704i()) {
            this.f20441x = c12602n0.m46953k(interfaceC8804p0);
            c5965a.m26765i0().mo24238b(this.f20441x, enumC8723a4, z10);
            m24353Z0();
        }
    }

    /* JADX INFO: renamed from: V0 */
    public void m24394V0() {
        if (m26704i() == null) {
            return;
        }
        m24346B0();
        C8802o3.b bVarM24380E0 = m24380E0((C5965a) m26707l(), (AbstractC8827t3) C12637g.m47075g(m26702g()));
        this.f20439v = bVarM24380E0;
        m24405z0(bVarM24380E0, this.f20438u, m26702g());
        m26697d0(C5918o0.m26551a(new Object[]{this.f20439v.m35331p()}));
        m26685L();
    }

    /* JADX INFO: renamed from: a1 */
    public final void m24395a1(InterfaceC8771i4.b<?, ?, ?> bVar, LinkedHashMap<C5306x, List<Size>> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        C5931r1.m26561a("VideoCapture", "Set custom ordered resolutions = " + arrayList);
        bVar.mo6684a().mo35473G(InterfaceC8769i2.f31891v, arrayList);
        this.f20434F = linkedHashMap;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: b0 */
    public void mo24396b0(Rect rect) {
        super.mo24396b0(rect);
        m24353Z0();
    }

    /* JADX INFO: renamed from: b1 */
    public void m24397b1(InterfaceC5237a2.a aVar) {
        if (aVar != this.f20442y) {
            this.f20442y = aVar;
            m24384L0().mo24240d(aVar);
        }
    }

    /* JADX INFO: renamed from: c1 */
    public void m24398c1(int i10) {
        if (m26692a0(i10)) {
            m24353Z0();
        }
    }

    /* JADX INFO: renamed from: d1 */
    public final void m24399d1(final C8802o3.b bVar, boolean z10) {
        InterfaceFutureC9440x<Void> interfaceFutureC9440x = this.f20440w;
        if (interfaceFutureC9440x != null && interfaceFutureC9440x.cancel(false)) {
            C5931r1.m26561a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        InterfaceFutureC9440x<Void> interfaceFutureC9440xM48311a = C12997c.m48311a(new C12997c.c() { // from class: f1.i1
            @Override // p563y1.C12997c.c
            /* JADX INFO: renamed from: a */
            public final Object mo22051a(C12997c.a aVar) {
                return C5284p1.m24365m0(this.f20374a, bVar, aVar);
            }
        });
        this.f20440w = interfaceFutureC9440xM48311a;
        C10773n.m40987j(interfaceFutureC9440xM48311a, new c(interfaceFutureC9440xM48311a, z10), C10417c.m40084e());
    }

    /* JADX INFO: renamed from: e1 */
    public final boolean m24400e1() {
        return this.f20438u.mo24316b() != null;
    }

    /* JADX INFO: renamed from: k1 */
    public boolean m24401k1(AbstractC5257g1 abstractC5257g1, AbstractC5257g1 abstractC5257g2) {
        return this.f20431C && abstractC5257g1.mo24316b() != null && abstractC5257g2.mo24316b() == null;
    }

    /* JADX INFO: renamed from: l1 */
    public final void m24402l1(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        AbstractC5291s abstractC5291sM24383K0 = m24383K0();
        C5235a0 c5235a0Mo24266e = abstractC5291sM24383K0.mo24306d().mo24266e();
        C5965a<T> c5965a = (C5965a) bVar.mo6688e();
        if (c5965a.mo35023a(InterfaceC8769i2.f31891v)) {
            C12637g.m47070b(c5235a0Mo24266e == AbstractC5245c2.f20323b, "Custom ordered resolutions and QualitySelector can't both be set");
            return;
        }
        C5902k0 c5902k0M35143M = c5965a.m35143M();
        int iM24386N0 = m24386N0(c5965a);
        Range<Integer> rangeM24389Q0 = m24389Q0(c5965a);
        InterfaceC5260h1 interfaceC5260h1M24390R0 = m24390R0(interfaceC8799o0, iM24386N0);
        C5931r1.m26561a("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + c5902k0M35143M + ", sessionType = " + iM24386N0 + ", targetFrameRate = " + rangeM24389Q0);
        List<C5306x> listM24387O0 = m24387O0(c5902k0M35143M, interfaceC5260h1M24390R0, iM24386N0);
        if (listM24387O0.isEmpty()) {
            C5931r1.m26572l("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            m24395a1(bVar, m24379D0(interfaceC8799o0, abstractC5291sM24383K0, c5902k0M35143M, interfaceC5260h1M24390R0, iM24386N0, rangeM24389Q0, c5965a.m26764h0(), m24385M0(listM24387O0, c5235a0Mo24266e)));
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: m */
    public InterfaceC8771i4<?> mo6673m(boolean z10, InterfaceC8777j4 interfaceC8777j4) {
        e eVar = f20428H;
        InterfaceC8795n1 interfaceC8795n1Mo35228a = interfaceC8777j4.mo35228a(eVar.m24428a().mo35207X(), 1);
        if (z10) {
            interfaceC8795n1Mo35228a = InterfaceC8795n1.m35288L(interfaceC8795n1Mo35228a, eVar.m24428a());
        }
        if (interfaceC8795n1Mo35228a == null) {
            return null;
        }
        return mo6658D(interfaceC8795n1Mo35228a).mo6688e();
    }

    public String toString() {
        return "VideoCapture:" + m26712r();
    }

    /* JADX INFO: renamed from: u0 */
    public final Rect m24403u0(Rect rect, int i10) {
        return m24400e1() ? C10085a0.m38890r(C10085a0.m38878f(((C5948v2.h) C12637g.m47075g(this.f20438u.mo24316b())).mo26509a(), i10)) : rect;
    }

    /* JADX INFO: renamed from: v0 */
    public final Size m24404v0(Size size, Rect rect, Rect rect2) {
        if (!m24400e1() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    /* JADX INFO: renamed from: z0 */
    public void m24405z0(C8802o3.b bVar, AbstractC5257g1 abstractC5257g1, AbstractC8827t3 abstractC8827t3) {
        AbstractC8830u1 abstractC8830u1;
        boolean z10 = abstractC5257g1.mo24315a() == -1;
        boolean z11 = abstractC5257g1.mo24317c() == AbstractC5257g1.a.ACTIVE;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.m35332q();
        C5902k0 c5902k0Mo35391b = abstractC8827t3.mo35391b();
        if (!z10 && (abstractC8830u1 = this.f20436s) != null) {
            if (z11) {
                bVar.m35329n(abstractC8830u1, c5902k0Mo35391b, null, -1);
            } else {
                bVar.m35324i(abstractC8830u1, c5902k0Mo35391b);
            }
        }
        m24399d1(bVar, z11);
    }
}
