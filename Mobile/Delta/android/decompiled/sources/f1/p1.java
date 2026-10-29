package f1;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.media.MediaCodec;
import android.os.SystemClock;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SurfaceProcessingQuirk;
import androidx.camera.video.internal.compat.quirk.HdrRepeatingRequestFailureQuirk;
import androidx.camera.video.internal.compat.quirk.SizeCannotEncodeVideoQuirk;
import f1.a2;
import g0.v2;
import g0.w2;
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
import n0.a3;
import n0.a4;
import n0.c3;
import n0.h2;
import n0.i2;
import n0.i4;
import n0.j4;
import n0.o3;
import n0.t3;
import n0.u3;
import n0.x2;

/* JADX INFO: loaded from: classes.dex */
public final class p1<T extends a2> extends w2 {
    public static final e H = new e();
    public Rect A;
    public int B;
    public boolean C;
    public f D;
    public o3.c E;
    public Map<x, List<Size>> F;
    public final a3.a<g1> G;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public n0.u1 f15909s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public x0.n0 f15910t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public g1 f15911u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public o3.b f15912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public me.x<Void> f15913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public v2 f15914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public a2.a f15915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public x0.v0 f15916z;

    public class a implements a3.a<g1> {
        public a() {
        }

        @Override // n0.a3.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(g1 g1Var) {
            if (g1Var == null) {
                throw new IllegalArgumentException("StreamInfo can't be null");
            }
            if (p1.this.f15915y == a2.a.INACTIVE) {
                return;
            }
            g0.r1.a("VideoCapture", "Stream info update: old: " + p1.this.f15911u + " new: " + g1Var);
            p1 p1Var = p1.this;
            g1 g1Var2 = p1Var.f15911u;
            p1Var.f15911u = g1Var;
            t3 t3Var = (t3) x2.g.g(p1Var.g());
            if (p1.this.T0(g1Var2.a(), g1Var.a()) || p1.this.k1(g1Var2, g1Var)) {
                p1.this.V0();
                return;
            }
            if ((g1Var2.a() != -1 && g1Var.a() == -1) || (g1Var2.a() == -1 && g1Var.a() != -1)) {
                p1 p1Var2 = p1.this;
                p1Var2.z0(p1Var2.f15912v, g1Var, t3Var);
                p1 p1Var3 = p1.this;
                p1Var3.d0(g0.o0.a(new Object[]{p1Var3.f15912v.p()}));
                p1.this.L();
                return;
            }
            if (g1Var2.c() != g1Var.c()) {
                p1 p1Var4 = p1.this;
                p1Var4.z0(p1Var4.f15912v, g1Var, t3Var);
                p1 p1Var5 = p1.this;
                p1Var5.d0(g0.o0.a(new Object[]{p1Var5.f15912v.p()}));
                p1.this.N();
            }
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            g0.r1.m("VideoCapture", "Receive onError from StreamState observer", th2);
        }
    }

    public class b extends n0.u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f15918a = true;
        public final /* synthetic */ AtomicBoolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ y1.c.a f15919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o3.b f15920d;

        public b(AtomicBoolean atomicBoolean, y1.c.a aVar, o3.b bVar) {
            this.b = atomicBoolean;
            this.f15919c = aVar;
            this.f15920d = bVar;
        }

        public static /* synthetic */ void e(b bVar, o3.b bVar2) {
            bVar.getClass();
            bVar2.t(bVar);
        }

        @Override // n0.u
        public void b(int i10, n0.e0 e0Var) {
            Object objD;
            super.b(i10, e0Var);
            if (this.f15918a) {
                this.f15918a = false;
                g0.r1.a("VideoCapture", "cameraCaptureResult timestampNs = " + e0Var.getTimestamp() + ", current system uptimeMs = " + SystemClock.uptimeMillis() + ", current system realtimeMs = " + SystemClock.elapsedRealtime());
            }
            if (this.b.get() || (objD = e0Var.c().d("androidx.camera.video.VideoCapture.streamUpdate")) == null || ((Integer) objD).intValue() != this.f15919c.hashCode() || !this.f15919c.c(null) || this.b.getAndSet(true)) {
                return;
            }
            ScheduledExecutorService scheduledExecutorServiceE = q0.c.e();
            final o3.b bVar = this.f15920d;
            scheduledExecutorServiceE.execute(new Runnable() { // from class: f1.q1
                @Override // java.lang.Runnable
                public final void run() {
                    p1.b.e(this.f15933a, bVar);
                }
            });
        }
    }

    public class c implements r0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ me.x f15922a;
        public final /* synthetic */ boolean b;

        public c(me.x xVar, boolean z10) {
            this.f15922a = xVar;
            this.b = z10;
        }

        @Override // r0.c
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r8) {
            me.x<Void> xVar = this.f15922a;
            p1 p1Var = p1.this;
            if (xVar != p1Var.f15913w || p1Var.f15915y == a2.a.INACTIVE) {
                return;
            }
            p1Var.b1(this.b ? a2.a.ACTIVE_STREAMING : a2.a.ACTIVE_NON_STREAMING);
        }

        @Override // r0.c
        public void onFailure(Throwable th2) {
            if (th2 instanceof CancellationException) {
                return;
            }
            g0.r1.d("VideoCapture", "Surface update completed with unexpected exception", th2);
        }
    }

    public static final class d<T extends a2> implements i4.b<p1<T>, g1.a<T>, d<T>>, i2.a<d<T>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final x2 f15924a;

        public d(T t8) {
            this(g(t8));
        }

        public static <T extends a2> x2 g(T t8) {
            x2 x2VarK0 = x2.k0();
            x2VarK0.G(g1.a.Q, t8);
            return x2VarK0;
        }

        public static d<? extends a2> h(n0.n1 n1Var) {
            return new d<>(x2.l0(n1Var));
        }

        @Override // g0.l0
        public n0.w2 a() {
            return this.f15924a;
        }

        public p1<T> f() {
            return new p1<>(e());
        }

        @Override // n0.i4.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public g1.a<T> e() {
            return new g1.a<>(c3.j0(this.f15924a));
        }

        public d<T> j(j4.b bVar) {
            a().G(i4.G, bVar);
            return this;
        }

        public d<T> k(g0.k0 k0Var) {
            a().G(h2.f24672l, k0Var);
            return this;
        }

        public d<T> l(int i10) {
            a().G(i2.f24687p, Integer.valueOf(i10));
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public d<T> b(a1.c cVar) {
            a().G(i2.f24692u, cVar);
            return this;
        }

        public d<T> n(u3 u3Var) {
            a().G(i4.K, u3Var);
            return this;
        }

        public d<T> o(int i10) {
            a().G(i4.A, Integer.valueOf(i10));
            return this;
        }

        public d<T> p(Class<p1<T>> cls) {
            a().G(s0.q.N, cls);
            if (a().h(s0.q.M, null) == null) {
                r(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public d<T> q(Range<Integer> range) {
            a().G(i4.C, range);
            return this;
        }

        public d<T> r(String str) {
            a().G(s0.q.M, str);
            return this;
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public d<T> d(Size size) {
            throw new UnsupportedOperationException("setTargetResolution is not supported.");
        }

        @Override // n0.i2.a
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public d<T> c(int i10) {
            a().G(i2.f24685n, Integer.valueOf(i10));
            return this;
        }

        public d<T> u(m1.r1.a aVar) {
            a().G(g1.a.R, aVar);
            return this;
        }

        public d(x2 x2Var) {
            this.f15924a = x2Var;
            if (!x2Var.a(g1.a.Q)) {
                throw new IllegalArgumentException("VideoOutput is required");
            }
            Class cls = (Class) x2Var.h(s0.q.N, null);
            if (cls == null || cls.equals(p1.class)) {
                j(j4.b.VIDEO_CAPTURE);
                p(p1.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final u3 f15925a;
        public static final a2 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g1.a<?> f15926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m1.r1.a f15927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Range<Integer> f15928e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final Range<Integer> f15929f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final g0.k0 f15930g;

        static {
            u3 u3Var = u3.VIDEO_RECORD;
            f15925a = u3Var;
            a2 a2Var = new a2() { // from class: f1.r1
                @Override // f1.a2
                public final void a(v2 v2Var) {
                    v2Var.z();
                }
            };
            b = a2Var;
            m1.r1.a aVar = m1.t1.f23853d;
            f15927d = aVar;
            f15928e = new Range<>(30, 30);
            f15929f = new Range<>(120, 120);
            g0.k0 k0Var = g0.k0.f17470d;
            f15930g = k0Var;
            f15926c = new d(a2Var).o(5).n(u3Var).u(aVar).k(k0Var).e();
        }

        public g1.a<?> a() {
            return f15926c;
        }
    }

    public static class f implements a3.a<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public n0.l0 f15931a;
        public boolean b = false;

        public f(n0.l0 l0Var) {
            this.f15931a = l0Var;
        }

        public void b() {
            x2.g.j(p0.z.d(), "SourceStreamRequirementObserver can be closed from main thread only");
            g0.r1.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.b);
            if (this.f15931a == null) {
                g0.r1.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            } else {
                d(false);
                this.f15931a = null;
            }
        }

        @Override // n0.a3.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Boolean bool) {
            x2.g.j(p0.z.d(), "SourceStreamRequirementObserver can be updated from main thread only");
            d(Boolean.TRUE.equals(bool));
        }

        public final void d(boolean z10) {
            if (this.b == z10) {
                return;
            }
            this.b = z10;
            n0.l0 l0Var = this.f15931a;
            if (l0Var == null) {
                g0.r1.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            } else if (z10) {
                l0Var.k();
            } else {
                l0Var.d();
            }
        }

        @Override // n0.a3.a
        public void onError(Throwable th2) {
            g0.r1.m("VideoCapture", "SourceStreamRequirementObserver#onError", th2);
        }
    }

    public p1(g1.a<T> aVar) {
        super(aVar);
        this.f15911u = g1.f15856a;
        this.f15912v = new o3.b();
        this.f15913w = null;
        this.f15915y = a2.a.INACTIVE;
        this.C = false;
        this.F = Collections.EMPTY_MAP;
        this.G = new a();
    }

    private void B0() {
        p0.z.b();
        o3.c cVar = this.E;
        if (cVar != null) {
            cVar.b();
            this.E = null;
        }
        n0.u1 u1Var = this.f15909s;
        if (u1Var != null) {
            u1Var.d();
            this.f15909s = null;
        }
        x0.v0 v0Var = this.f15916z;
        if (v0Var != null) {
            v0Var.f();
            this.f15916z = null;
        }
        x0.n0 n0Var = this.f15910t;
        if (n0Var != null) {
            n0Var.i();
            this.f15910t = null;
        }
        this.A = null;
        this.f15914x = null;
        this.f15911u = g1.f15856a;
        this.B = 0;
        this.C = false;
    }

    public static <T> T F0(a3<T> a3Var, T t8) {
        me.x<T> xVarB = a3Var.b();
        if (!xVarB.isDone()) {
            return t8;
        }
        try {
            return xVarB.get();
        } catch (InterruptedException | ExecutionException e10) {
            throw new IllegalStateException(e10);
        }
    }

    public static LinkedHashMap<x, List<Size>> G0(m1.r1.a aVar, s sVar, g0.k0 k0Var, h1 h1Var, LinkedHashMap<x, List<Size>> linkedHashMap, Map<x, Size> map) {
        h1.i iVarB;
        m1.r1 r1VarH0;
        if (linkedHashMap.isEmpty()) {
            return new LinkedHashMap<>();
        }
        LinkedHashMap<x, List<Size>> linkedHashMap2 = new LinkedHashMap<>();
        for (Map.Entry<x, List<Size>> entry : linkedHashMap.entrySet()) {
            ArrayList arrayList = new ArrayList(entry.getValue());
            Iterator<Size> it = arrayList.iterator();
            while (it.hasNext()) {
                Size next = it.next();
                if (!map.containsValue(next) && (iVarB = h1Var.b(next, k0Var)) != null && (r1VarH0 = H0(aVar, iVarB, k0Var, sVar)) != null && !r1VarH0.e(next.getWidth(), next.getHeight())) {
                    it.remove();
                }
            }
            if (!arrayList.isEmpty()) {
                linkedHashMap2.put(entry.getKey(), arrayList);
            }
        }
        return linkedHashMap2;
    }

    public static m1.r1 H0(m1.r1.a aVar, h1.i iVar, g0.k0 k0Var, s sVar) {
        m1.r1 r1VarY0;
        int iB;
        if (k0Var.e()) {
            return Y0(aVar, iVar, sVar, k0Var);
        }
        m1.r1 r1Var = null;
        int i10 = Integer.MIN_VALUE;
        for (n0.a2.c cVar : iVar.b()) {
            if (n1.b.f(cVar, k0Var) && (r1VarY0 = Y0(aVar, iVar, sVar, new g0.k0(n1.b.h(cVar.g()), n1.b.g(cVar.b())))) != null && (iB = w0.d.b(((Integer) r1VarY0.i().getUpper()).intValue(), ((Integer) r1VarY0.j().getUpper()).intValue())) > i10) {
                r1Var = r1VarY0;
                i10 = iB;
            }
        }
        return r1Var;
    }

    public static Range<Integer> W0(t3 t3Var) {
        Range<Integer> rangeC = t3Var.c();
        if (Objects.equals(rangeC, t3.f24861a)) {
            return t3Var.g() == 1 ? e.f15929f : e.f15928e;
        }
        return rangeC;
    }

    public static a4 X0(n0.p0 p0Var, x0.v0 v0Var) {
        return (v0Var == null && p0Var.q()) ? a4.UPTIME : p0Var.k().t();
    }

    public static m1.r1 Y0(m1.r1.a aVar, h1.i iVar, s sVar, g0.k0 k0Var) {
        m1.r1 r1VarA = aVar.a(l1.m.e(sVar, k0Var, iVar).a());
        if (r1VarA != null) {
            return o1.g.l(r1VarA, iVar != null ? iVar.k().k() : null);
        }
        g0.r1.l("VideoCapture", "Can't find videoEncoderInfo");
        return null;
    }

    private void Z0() {
        n0.p0 p0VarI = i();
        x0.n0 n0Var = this.f15910t;
        if (p0VarI == null || n0Var == null) {
            return;
        }
        int iI0 = I0(p0VarI);
        this.B = iI0;
        n0Var.z(iI0, f());
    }

    public static boolean f1(Rect rect, Size size) {
        return (size.getWidth() == rect.width() && size.getHeight() == rect.height()) ? false : true;
    }

    public static boolean g1(n0.p0 p0Var, g0.k0 k0Var) {
        HdrRepeatingRequestFailureQuirk hdrRepeatingRequestFailureQuirk = (HdrRepeatingRequestFailureQuirk) k1.c.b(HdrRepeatingRequestFailureQuirk.class);
        return p0Var.q() && hdrRepeatingRequestFailureQuirk != null && hdrRepeatingRequestFailureQuirk.i(k0Var);
    }

    public static <T extends a2> boolean h1(n0.p0 p0Var, g1.a<T> aVar) {
        return p0Var.q() && aVar.j0();
    }

    public static /* synthetic */ int i0(Rect rect, Size size, Size size2) {
        return (Math.abs(size.getWidth() - rect.width()) + Math.abs(size.getHeight() - rect.height())) - (Math.abs(size2.getWidth() - rect.width()) + Math.abs(size2.getHeight() - rect.height()));
    }

    public static boolean i1(n0.p0 p0Var) {
        if (p0Var.q()) {
            return SurfaceProcessingQuirk.e(k1.c.c()) || SurfaceProcessingQuirk.e(p0Var.k().l());
        }
        return false;
    }

    public static /* synthetic */ void j0(p1 p1Var, n0.u1 u1Var) {
        if (u1Var == p1Var.f15909s) {
            p1Var.B0();
        }
    }

    private boolean j1(n0.p0 p0Var) {
        return p0Var.q() && H(p0Var);
    }

    public static /* synthetic */ void l0(AtomicBoolean atomicBoolean, o3.b bVar, n0.u uVar) {
        x2.g.j(p0.z.d(), "Surface update cancellation should only occur on main thread.");
        atomicBoolean.set(true);
        bVar.t(uVar);
    }

    public static /* synthetic */ Object m0(p1 p1Var, final o3.b bVar, y1.c.a aVar) {
        p1Var.getClass();
        bVar.o("androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final b bVar2 = new b(atomicBoolean, aVar, bVar);
        aVar.a(new Runnable() { // from class: f1.n1
            @Override // java.lang.Runnable
            public final void run() {
                p1.l0(atomicBoolean, bVar, bVar2);
            }
        }, q0.c.b());
        bVar.j(bVar2);
        return String.format("%s[0x%x]", "androidx.camera.video.VideoCapture.streamUpdate", Integer.valueOf(aVar.hashCode()));
    }

    public static <T extends a2> p1<T> m1(T t8) {
        return new d((a2) x2.g.g(t8)).f();
    }

    public static void r0(Set<Size> set, int i10, int i11, Size size, m1.r1 r1Var) {
        if (i10 > size.getWidth() || i11 > size.getHeight()) {
            return;
        }
        try {
            set.add(new Size(i10, ((Integer) r1Var.h(i10).clamp(Integer.valueOf(i11))).intValue()));
        } catch (IllegalArgumentException e10) {
            g0.r1.m("VideoCapture", "No supportedHeights for width: " + i10, e10);
        }
        try {
            set.add(new Size(((Integer) r1Var.b(i11).clamp(Integer.valueOf(i10))).intValue(), i11));
        } catch (IllegalArgumentException e11) {
            g0.r1.m("VideoCapture", "No supportedWidths for height: " + i11, e11);
        }
    }

    public static Rect s0(Rect rect, int i10, boolean z10, m1.r1 r1Var) {
        SizeCannotEncodeVideoQuirk sizeCannotEncodeVideoQuirk = (SizeCannotEncodeVideoQuirk) k1.c.b(SizeCannotEncodeVideoQuirk.class);
        if (sizeCannotEncodeVideoQuirk == null) {
            return rect;
        }
        if (!z10) {
            i10 = 0;
        }
        return sizeCannotEncodeVideoQuirk.g(rect, i10, r1Var);
    }

    public static Rect t0(final Rect rect, Size size, m1.r1 r1Var) {
        g0.r1.a("VideoCapture", String.format("Adjust cropRect %s by width/height alignment %d/%d and supported widths %s / supported heights %s", p0.a0.n(rect), Integer.valueOf(r1Var.f()), Integer.valueOf(r1Var.c()), r1Var.i(), r1Var.j()));
        if ((!r1Var.i().contains(Integer.valueOf(rect.width())) || !r1Var.j().contains(Integer.valueOf(rect.height()))) && r1Var.a() && r1Var.j().contains(Integer.valueOf(rect.width())) && r1Var.i().contains(Integer.valueOf(rect.height()))) {
            r1Var = new m1.m1(r1Var);
        }
        int iF = r1Var.f();
        int iC = r1Var.c();
        Range<Integer> rangeI = r1Var.i();
        Range<Integer> rangeJ = r1Var.j();
        int iX0 = x0(rect.width(), iF, rangeI);
        int iY0 = y0(rect.width(), iF, rangeI);
        int iX1 = x0(rect.height(), iC, rangeJ);
        int iY1 = y0(rect.height(), iC, rangeJ);
        HashSet hashSet = new HashSet();
        r0(hashSet, iX0, iX1, size, r1Var);
        r0(hashSet, iX0, iY1, size, r1Var);
        r0(hashSet, iY0, iX1, size, r1Var);
        r0(hashSet, iY0, iY1, size, r1Var);
        if (hashSet.isEmpty()) {
            g0.r1.l("VideoCapture", "Can't find valid cropped size");
            return rect;
        }
        ArrayList arrayList = new ArrayList(hashSet);
        g0.r1.a("VideoCapture", "candidatesList = " + arrayList);
        Collections.sort(arrayList, new Comparator() { // from class: f1.o1
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return p1.i0(rect, (Size) obj, (Size) obj2);
            }
        });
        g0.r1.a("VideoCapture", "sorted candidatesList = " + arrayList);
        Size size2 = (Size) arrayList.get(0);
        int width = size2.getWidth();
        int height = size2.getHeight();
        if (width == rect.width() && height == rect.height()) {
            g0.r1.a("VideoCapture", "No need to adjust cropRect because crop size is valid.");
            return rect;
        }
        x2.g.i(width % 2 == 0 && height % 2 == 0 && width <= size.getWidth() && height <= size.getHeight());
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
        g0.r1.a("VideoCapture", String.format("Adjust cropRect from %s to %s", p0.a0.n(rect), p0.a0.n(rect2)));
        return rect2;
    }

    public static int w0(boolean z10, int i10, int i11, Range<Integer> range) {
        int i12 = i10 % i11;
        if (i12 != 0) {
            i10 = z10 ? i10 - i12 : i10 + (i11 - i12);
        }
        return ((Integer) range.clamp(Integer.valueOf(i10))).intValue();
    }

    public static int x0(int i10, int i11, Range<Integer> range) {
        return w0(true, i10, i11, range);
    }

    public static int y0(int i10, int i11, Range<Integer> range) {
        return w0(false, i10, i11, range);
    }

    @Override // g0.w2
    public Set<g0.k0> A(n0.o0 o0Var) {
        return R0(o0Var, 0).c();
    }

    public final Rect A0(Size size, m1.r1 r1Var) {
        Rect rectE = E() != null ? E() : new Rect(0, 0, size.getWidth(), size.getHeight());
        return (r1Var == null || r1Var.e(rectE.width(), rectE.height())) ? rectE : t0(rectE, size, r1Var);
    }

    @Override // g0.w2
    public Set<Integer> B() {
        HashSet hashSet = new HashSet();
        hashSet.add(2);
        return hashSet;
    }

    public final x0.v0 C0(n0.p0 p0Var, g1.a<T> aVar, int i10, Rect rect, Size size, g0.k0 k0Var) {
        if (!S0(p0Var, aVar, i10, rect, size, k0Var)) {
            return null;
        }
        g0.r1.a("VideoCapture", "Surface processing is enabled.");
        n0.p0 p0VarI = i();
        Objects.requireNonNull(p0VarI);
        return new x0.v0(p0VarI, n() != null ? n().a() : x0.t.a.a(k0Var));
    }

    @Override // g0.w2
    public i4.b<?, ?, ?> D(n0.n1 n1Var) {
        return d.h(n1Var);
    }

    public final LinkedHashMap<x, List<Size>> D0(n0.o0 o0Var, s sVar, g0.k0 k0Var, h1 h1Var, int i10, Range<Integer> range, m1.r1.a aVar, List<x> list) {
        int iB = sVar.d().b();
        Map<x, Size> mapH = a0.h(h1Var, k0Var);
        z zVar = new z(P0(o0Var, i10, range), mapH);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (x xVar : list) {
            linkedHashMap.put(xVar, zVar.g(xVar, iB));
        }
        return G0(aVar, sVar, k0Var, h1Var, linkedHashMap, mapH);
    }

    @SuppressLint({"WrongConstant"})
    public final o3.b E0(final g1.a<T> aVar, t3 t3Var) {
        final p1<T> p1Var = this;
        p0.z.b();
        final n0.p0 p0Var = (n0.p0) x2.g.g(p1Var.i());
        Size sizeF = t3Var.f();
        Runnable runnable = new Runnable() { // from class: f1.j1
            @Override // java.lang.Runnable
            public final void run() {
                this.f15869a.L();
            }
        };
        Range<Integer> rangeW0 = W0(t3Var);
        s sVarJ0 = p1Var.J0();
        Objects.requireNonNull(sVarJ0);
        int iG = t3Var.g();
        h1 h1VarR0 = p1Var.R0(p0Var.d(), iG);
        g0.k0 k0VarB = t3Var.b();
        m1.r1 r1VarY0 = Y0(aVar.h0(), h1VarR0.b(sizeF, k0VarB), sVarJ0, k0VarB);
        p1Var.B = p1Var.I0(p0Var);
        Rect rectA0 = p1Var.A0(sizeF, r1VarY0);
        Rect rectU0 = p1Var.u0(rectA0, p1Var.B);
        p1Var.A = rectU0;
        Size sizeV0 = p1Var.v0(sizeF, rectA0, rectU0);
        if (p1Var.e1()) {
            p1Var.C = true;
        }
        Rect rect = p1Var.A;
        Rect rectS0 = s0(rect, p1Var.B, p1Var.S0(p0Var, aVar, iG, rect, sizeF, k0VarB), r1VarY0);
        p1Var.A = rectS0;
        p1Var.f15916z = p1Var.C0(p0Var, aVar, iG, rectS0, sizeF, k0VarB);
        final boolean z10 = (p0Var.q() && p1Var.f15916z == null) ? false : true;
        final a4 a4VarX0 = X0(p0Var, p1Var.f15916z);
        g0.r1.a("VideoCapture", "camera timebase = " + p0Var.k().t() + ", processing timebase = " + a4VarX0);
        t3 t3VarA = t3Var.i().f(sizeV0).c(rangeW0).a();
        x2.g.i(p1Var.f15910t == null);
        x0.n0 n0Var = new x0.n0(2, 34, t3VarA, p1Var.y(), p0Var.q(), p1Var.A, p1Var.B, p1Var.f(), p1Var.j1(p0Var));
        p1Var.f15910t = n0Var;
        n0Var.e(runnable);
        if (p1Var.f15916z != null) {
            z0.f fVarJ = z0.f.j(p1Var.f15910t);
            final x0.n0 n0Var2 = p1Var.f15916z.j(x0.v0.b.c(p1Var.f15910t, Collections.singletonList(fVarJ))).get(fVarJ);
            Objects.requireNonNull(n0Var2);
            p1Var = this;
            n0Var2.e(new Runnable() { // from class: f1.k1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15876a.U0(n0Var2, p0Var, aVar, a4VarX0, z10);
                }
            });
            p1Var.f15914x = n0Var2.k(p0Var);
            final n0.u1 u1VarO = p1Var.f15910t.o();
            p1Var.f15909s = u1VarO;
            u1VarO.k().a(new Runnable() { // from class: f1.l1
                @Override // java.lang.Runnable
                public final void run() {
                    p1.j0(this.f15884a, u1VarO);
                }
            }, q0.c.e());
        } else {
            v2 v2VarK = p1Var.f15910t.k(p0Var);
            p1Var.f15914x = v2VarK;
            p1Var.f15909s = v2VarK.n();
        }
        aVar.i0().b(p1Var.f15914x, a4VarX0, z10);
        p1Var.Z0();
        p1Var.f15909s.p(MediaCodec.class);
        o3.b bVarR = o3.b.r(aVar, t3Var.f());
        bVarR.A(iG);
        p1Var.b(bVarR, t3Var);
        bVarR.C(aVar.x());
        o3.c cVar = p1Var.E;
        if (cVar != null) {
            cVar.b();
        }
        o3.c cVar2 = new o3.c(new o3.d() { // from class: f1.m1
            @Override // n0.o3.d
            public final void a(o3 o3Var, o3.g gVar) {
                this.f15889a.V0();
            }
        });
        p1Var.E = cVar2;
        bVarR.u(cVar2);
        if (t3Var.d() != null) {
            bVarR.g(t3Var.d());
        }
        return bVarR;
    }

    public final int I0(n0.p0 p0Var) {
        boolean zH = H(p0Var);
        int iU = u(p0Var, zH);
        if (!e1()) {
            return iU;
        }
        v2.h hVarB = this.f15911u.b();
        Objects.requireNonNull(hVarB);
        int iB = hVarB.b();
        if (zH != hVarB.f()) {
            iB = -iB;
        }
        return p0.a0.w(iU - iB);
    }

    public final s J0() {
        return (s) F0(L0().c(), null);
    }

    public final s K0() {
        s sVarJ0 = J0();
        if (sVarJ0 != null) {
            return sVarJ0;
        }
        throw new IllegalArgumentException("MediaSpec can't be null");
    }

    public T L0() {
        return (T) ((g1.a) l()).i0();
    }

    public final List<x> M0(List<x> list, a0 a0Var) {
        List<x> listF = a0Var.f(list);
        g0.r1.a("VideoCapture", "Found selectedQualities " + listF + " by " + a0Var);
        if (listF.isEmpty()) {
            throw new IllegalArgumentException("Unable to find selected quality");
        }
        return listF;
    }

    public final int N0(g1.a<T> aVar) {
        return aVar.o(0);
    }

    public final List<x> O0(g0.k0 k0Var, h1 h1Var, int i10) {
        List<x> listE = h1Var.e(k0Var);
        g0.r1.a("VideoCapture", "supportedQualities = " + listE);
        if (listE.isEmpty() && i10 == 1) {
            throw new IllegalArgumentException("No supported quality on the device for high-speed capture.");
        }
        return listE;
    }

    public final List<Size> P0(n0.o0 o0Var, int i10, Range<Integer> range) {
        if (i10 == 1) {
            return t3.f24861a.equals(range) ? o0Var.y() : o0Var.r(range);
        }
        return o0Var.m(p());
    }

    @Override // g0.w2
    public i4<?> Q(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        l1(o0Var, bVar);
        return bVar.e();
    }

    public final Range<Integer> Q0(g1.a<T> aVar) {
        Range<Integer> rangeZ = aVar.z(t3.f24861a);
        Objects.requireNonNull(rangeZ);
        return rangeZ;
    }

    @Override // g0.w2
    public void R() {
        super.R();
        g0.r1.a("VideoCapture", "VideoCapture#onStateAttached: cameraID = " + k());
        if (g() == null || this.f15914x != null) {
            return;
        }
        t3 t3Var = (t3) x2.g.g(g());
        this.f15911u = (g1) F0(L0().e(), g1.f15856a);
        o3.b bVarE0 = E0((g1.a) l(), t3Var);
        this.f15912v = bVarE0;
        z0(bVarE0, this.f15911u, t3Var);
        d0(g0.o0.a(new Object[]{this.f15912v.p()}));
        J();
        L0().e().c(q0.c.e(), this.G);
        f fVar = this.D;
        if (fVar != null) {
            fVar.b();
        }
        this.D = new f(j());
        L0().g().c(q0.c.e(), this.D);
        b1(a2.a.ACTIVE_NON_STREAMING);
    }

    public final h1 R0(g0.t tVar, int i10) {
        return L0().f(tVar, i10);
    }

    @Override // g0.w2
    public void S() {
        g0.r1.a("VideoCapture", "VideoCapture#onStateDetached");
        x2.g.j(p0.z.d(), "VideoCapture can only be detached on the main thread.");
        if (this.D != null) {
            L0().g().d(this.D);
            this.D.b();
            this.D = null;
        }
        b1(a2.a.INACTIVE);
        L0().e().d(this.G);
        me.x<Void> xVar = this.f15913w;
        if (xVar != null && xVar.cancel(false)) {
            g0.r1.a("VideoCapture", "VideoCapture is detached from the camera. Surface update cancelled.");
        }
        B0();
    }

    public final boolean S0(n0.p0 p0Var, g1.a<?> aVar, int i10, Rect rect, Size size, g0.k0 k0Var) {
        if (i10 == 1) {
            return false;
        }
        return n() != null || h1(p0Var, aVar) || i1(p0Var) || g1(p0Var, k0Var) || f1(rect, size) || j1(p0Var) || e1();
    }

    @Override // g0.w2
    public t3 T(n0.n1 n1Var) {
        this.f15912v.g(n1Var);
        d0(g0.o0.a(new Object[]{this.f15912v.p()}));
        t3 t3VarG = g();
        Objects.requireNonNull(t3VarG);
        return t3VarG.i().d(n1Var).a();
    }

    public boolean T0(int i10, int i11) {
        Set<Integer> set = g1.b;
        return (set.contains(Integer.valueOf(i10)) || set.contains(Integer.valueOf(i11)) || i10 == i11) ? false : true;
    }

    @Override // g0.w2
    public t3 U(t3 t3Var, t3 t3Var2) {
        g0.r1.a("VideoCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + t3Var + ", secondaryStreamSpec " + t3Var2);
        List<Size> listN = ((g1.a) l()).N(null);
        if (listN != null && !listN.contains(t3Var.f())) {
            g0.r1.l("VideoCapture", "suggested resolution " + t3Var.f() + " is not in custom ordered resolutions " + listN);
        }
        return t3Var;
    }

    public final void U0(x0.n0 n0Var, n0.p0 p0Var, g1.a<T> aVar, a4 a4Var, boolean z10) {
        if (p0Var == i()) {
            this.f15914x = n0Var.k(p0Var);
            aVar.i0().b(this.f15914x, a4Var, z10);
            Z0();
        }
    }

    public void V0() {
        if (i() == null) {
            return;
        }
        B0();
        o3.b bVarE0 = E0((g1.a) l(), (t3) x2.g.g(g()));
        this.f15912v = bVarE0;
        z0(bVarE0, this.f15911u, g());
        d0(g0.o0.a(new Object[]{this.f15912v.p()}));
        L();
    }

    public final void a1(i4.b<?, ?, ?> bVar, LinkedHashMap<x, List<Size>> linkedHashMap) {
        ArrayList arrayList = new ArrayList();
        Iterator<List<Size>> it = linkedHashMap.values().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next());
        }
        g0.r1.a("VideoCapture", "Set custom ordered resolutions = " + arrayList);
        bVar.a().G(i2.f24693v, arrayList);
        this.F = linkedHashMap;
    }

    @Override // g0.w2
    public void b0(Rect rect) {
        super.b0(rect);
        Z0();
    }

    public void b1(a2.a aVar) {
        if (aVar != this.f15915y) {
            this.f15915y = aVar;
            L0().d(aVar);
        }
    }

    public void c1(int i10) {
        if (a0(i10)) {
            Z0();
        }
    }

    public final void d1(final o3.b bVar, boolean z10) {
        me.x<Void> xVar = this.f15913w;
        if (xVar != null && xVar.cancel(false)) {
            g0.r1.a("VideoCapture", "A newer surface update is requested. Previous surface update cancelled.");
        }
        me.x<Void> xVarA = y1.c.a(new y1.c.InterfaceC0650c() { // from class: f1.i1
            @Override // y1.c.InterfaceC0650c
            public final Object a(y1.c.a aVar) {
                return p1.m0(this.f15864a, bVar, aVar);
            }
        });
        this.f15913w = xVarA;
        r0.n.j(xVarA, new c(xVarA, z10), q0.c.e());
    }

    public final boolean e1() {
        return this.f15911u.b() != null;
    }

    public boolean k1(g1 g1Var, g1 g1Var2) {
        return this.C && g1Var.b() != null && g1Var2.b() == null;
    }

    public final void l1(n0.o0 o0Var, i4.b<?, ?, ?> bVar) {
        s sVarK0 = K0();
        a0 a0VarE = sVarK0.d().e();
        g1.a<T> aVar = (g1.a) bVar.e();
        if (aVar.a(i2.f24693v)) {
            x2.g.b(a0VarE == c2.b, "Custom ordered resolutions and QualitySelector can't both be set");
            return;
        }
        g0.k0 k0VarM = aVar.M();
        int iN0 = N0(aVar);
        Range<Integer> rangeQ0 = Q0(aVar);
        h1 h1VarR0 = R0(o0Var, iN0);
        g0.r1.a("VideoCapture", "Update custom order resolutions: requestedDynamicRange = " + k0VarM + ", sessionType = " + iN0 + ", targetFrameRate = " + rangeQ0);
        List<x> listO0 = O0(k0VarM, h1VarR0, iN0);
        if (listO0.isEmpty()) {
            g0.r1.l("VideoCapture", "Can't find any supported quality on the device.");
        } else {
            a1(bVar, D0(o0Var, sVarK0, k0VarM, h1VarR0, iN0, rangeQ0, aVar.h0(), M0(listO0, a0VarE)));
        }
    }

    @Override // g0.w2
    public i4<?> m(boolean z10, j4 j4Var) {
        e eVar = H;
        n0.n1 n1VarA = j4Var.a(eVar.a().X(), 1);
        if (z10) {
            n1VarA = n0.n1.L(n1VarA, eVar.a());
        }
        if (n1VarA == null) {
            return null;
        }
        return D(n1VarA).e();
    }

    public String toString() {
        return "VideoCapture:" + r();
    }

    public final Rect u0(Rect rect, int i10) {
        return e1() ? p0.a0.r(p0.a0.f(((v2.h) x2.g.g(this.f15911u.b())).a(), i10)) : rect;
    }

    public final Size v0(Size size, Rect rect, Rect rect2) {
        if (!e1() || rect2.equals(rect)) {
            return size;
        }
        float fHeight = rect2.height() / rect.height();
        return new Size((int) Math.ceil(size.getWidth() * fHeight), (int) Math.ceil(size.getHeight() * fHeight));
    }

    public void z0(o3.b bVar, g1 g1Var, t3 t3Var) {
        n0.u1 u1Var;
        boolean z10 = g1Var.a() == -1;
        boolean z11 = g1Var.c() == g1.a.ACTIVE;
        if (z10 && z11) {
            throw new IllegalStateException("Unexpected stream state, stream is error but active");
        }
        bVar.q();
        g0.k0 k0VarB = t3Var.b();
        if (!z10 && (u1Var = this.f15909s) != null) {
            if (z11) {
                bVar.n(u1Var, k0VarB, null, -1);
            } else {
                bVar.i(u1Var, k0VarB);
            }
        }
        d1(bVar, z11);
    }
}
