package p140g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.C0493c;
import androidx.camera.core.C0496f;
import androidx.camera.core.InterfaceC0494d;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;
import p002a1.C0052a;
import p002a1.C0054c;
import p002a1.C0055d;
import p002a1.InterfaceC0053b;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.C8734c3;
import p296n0.C8751f2;
import p296n0.C8781k2;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8841w2;
import p347p0.C10110z;
import p366q0.C10417c;
import p424s0.InterfaceC11156q;
import p424s0.InterfaceC11157r;
import p503w0.C12274d;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.u0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5942u0 extends AbstractC5952w2 {

    /* JADX INFO: renamed from: B */
    public static final d f22615B = new d();

    /* JADX INFO: renamed from: C */
    public static final Boolean f22616C = null;

    /* JADX INFO: renamed from: A */
    public C8802o3.c f22617A;

    /* JADX INFO: renamed from: s */
    public final Object f22618s;

    /* JADX INFO: renamed from: t */
    public AbstractC5954x0 f22619t;

    /* JADX INFO: renamed from: u */
    public Executor f22620u;

    /* JADX INFO: renamed from: v */
    public a f22621v;

    /* JADX INFO: renamed from: w */
    public Rect f22622w;

    /* JADX INFO: renamed from: x */
    public Matrix f22623x;

    /* JADX INFO: renamed from: y */
    public C8802o3.b f22624y;

    /* JADX INFO: renamed from: z */
    public AbstractC8830u1 f22625z;

    /* JADX INFO: renamed from: g0.u0$a */
    public interface a {
        /* JADX INFO: renamed from: c */
        default Size mo23122c() {
            return null;
        }

        /* JADX INFO: renamed from: d */
        default int mo23123d() {
            return 0;
        }

        /* JADX INFO: renamed from: f */
        default void mo23125f(Matrix matrix) {
        }

        /* JADX INFO: renamed from: k */
        void mo23127k(InterfaceC0494d interfaceC0494d);
    }

    /* JADX INFO: renamed from: g0.u0$b */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: renamed from: g0.u0$c */
    public static final class c implements InterfaceC8769i2.a<c>, InterfaceC8771i4.b<C5942u0, C8751f2, c> {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f22626a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public c() {
            this(C8846x2.m35505k0());
        }

        /* JADX INFO: renamed from: g */
        public static c m26604g(InterfaceC8795n1 interfaceC8795n1) {
            return new c(C8846x2.m35506l0(interfaceC8795n1));
        }

        @Override // p140g0.InterfaceC5906l0
        /* JADX INFO: renamed from: a */
        public InterfaceC8841w2 mo6684a() {
            return this.f22626a;
        }

        /* JADX INFO: renamed from: f */
        public C5942u0 m26605f() {
            C8751f2 c8751f2Mo6688e = mo6688e();
            InterfaceC8769i2.m35182Y(c8751f2Mo6688e);
            return new C5942u0(c8751f2Mo6688e);
        }

        /* JADX DEBUG: Method merged with bridge method: e()Ln0/i4; */
        @Override // p296n0.InterfaceC8771i4.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C8751f2 mo6688e() {
            return new C8751f2(C8734c3.m35022j0(this.f22626a));
        }

        /* JADX INFO: renamed from: i */
        public c m26607i(Executor executor) {
            mo6684a().mo35473G(InterfaceC11157r.f39402O, executor);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public c m26608j(int i10) {
            mo6684a().mo35473G(C8751f2.f31813Q, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: k */
        public c m26609k(InterfaceC8777j4.b bVar) {
            mo6684a().mo35473G(InterfaceC8771i4.f31902G, bVar);
            return this;
        }

        /* JADX INFO: renamed from: l */
        public c m26610l(Size size) {
            mo6684a().mo35473G(InterfaceC8769i2.f31887r, size);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public c m26611m(C5902k0 c5902k0) {
            if (!Objects.equals(C5902k0.f22550d, c5902k0)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            mo6684a().mo35473G(InterfaceC8763h2.f31865l, c5902k0);
            return this;
        }

        /* JADX INFO: renamed from: n */
        public c m26612n(int i10) {
            mo6684a().mo35473G(C8751f2.f31814R, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: o */
        public c m26613o(int i10) {
            mo6684a().mo35473G(C8751f2.f31816T, Integer.valueOf(i10));
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: b(La1/c;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public c mo24411b(C0054c c0054c) {
            mo6684a().mo35473G(InterfaceC8769i2.f31890u, c0054c);
            return this;
        }

        /* JADX INFO: renamed from: q */
        public c m26615q(int i10) {
            mo6684a().mo35473G(InterfaceC8771i4.f31896A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: r */
        public c m26616r(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            mo6684a().mo35473G(InterfaceC8769i2.f31882m, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: s */
        public c m26617s(Class<C5942u0> cls) {
            mo6684a().mo35473G(InterfaceC11156q.f39401N, cls);
            if (mo6684a().mo35030h(InterfaceC11156q.f39400M, null) == null) {
                m26618t(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* JADX INFO: renamed from: t */
        public c m26618t(String str) {
            mo6684a().mo35473G(InterfaceC11156q.f39400M, str);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/util/Size;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        @Deprecated
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public c mo24413d(Size size) {
            mo6684a().mo35473G(InterfaceC8769i2.f31886q, size);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: c(I)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public c mo24412c(int i10) {
            mo6684a().mo35473G(InterfaceC8769i2.f31883n, Integer.valueOf(i10));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(C8846x2 c8846x2) {
            this.f22626a = c8846x2;
            Class cls = (Class) c8846x2.mo35030h(InterfaceC11156q.f39401N, null);
            if (cls == null || cls.equals(C5942u0.class)) {
                m26609k(InterfaceC8777j4.b.IMAGE_ANALYSIS);
                m26617s(C5942u0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: g0.u0$d */
    public static final class d {

        /* JADX INFO: renamed from: a */
        public static final Size f22627a;

        /* JADX INFO: renamed from: b */
        public static final C5902k0 f22628b;

        /* JADX INFO: renamed from: c */
        public static final C0054c f22629c;

        /* JADX INFO: renamed from: d */
        public static final C8751f2 f22630d;

        static {
            Size size = new Size(640, 480);
            f22627a = size;
            C5902k0 c5902k0 = C5902k0.f22550d;
            f22628b = c5902k0;
            C0054c c0054cM116a = new C0054c.a().m118d(C0052a.f98c).m120f(new C0055d(C12274d.f43482c, 1)).m116a();
            f22629c = c0054cM116a;
            f22630d = new c().m26610l(size).m26615q(1).m26616r(0).mo24411b(c0054cM116a).m26611m(c5902k0).mo6688e();
        }

        /* JADX INFO: renamed from: a */
        public C8751f2 m26621a() {
            return f22630d;
        }
    }

    /* JADX INFO: renamed from: g0.u0$e */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public C5942u0(C8751f2 c8751f2) {
        super(c8751f2);
        this.f22618s = new Object();
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m26587g0(C0496f c0496f, C0496f c0496f2) {
        c0496f.m2225j();
        if (c0496f2 != null) {
            c0496f2.m2225j();
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m26588h0(C5942u0 c5942u0, AbstractC5954x0 abstractC5954x0, C8802o3 c8802o3, C8802o3.g gVar) {
        if (c5942u0.m26704i() == null) {
            return;
        }
        c5942u0.m26592k0();
        abstractC5954x0.mo2199f();
        C8802o3.b bVarM26593l0 = c5942u0.m26593l0(c5942u0.m26706k(), (C8751f2) c5942u0.m26707l(), (AbstractC8827t3) C12637g.m47075g(c5942u0.m26702g()));
        c5942u0.f22624y = bVarM26593l0;
        c5942u0.m26697d0(C5918o0.m26551a(new Object[]{bVarM26593l0.m35331p()}));
        c5942u0.m26685L();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ List m26590j0(Size size, List list, int i10) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: D */
    public InterfaceC8771i4.b<?, ?, ?> mo6658D(InterfaceC8795n1 interfaceC8795n1) {
        return c.m26604g(interfaceC8795n1);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r6v6, resolved type: n0.i4 */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: Q */
    public InterfaceC8771i4<?> mo6664Q(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        final Size sizeMo23122c;
        synchronized (this.f22618s) {
            try {
                a aVar = this.f22621v;
                sizeMo23122c = aVar != null ? aVar.mo23122c() : null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (sizeMo23122c == null) {
            return bVar.mo6688e();
        }
        if (interfaceC8799o0.mo6751w(((Integer) bVar.mo6684a().mo35030h(InterfaceC8769i2.f31883n, 0)).intValue()) % 180 == 90) {
            sizeMo23122c = new Size(sizeMo23122c.getHeight(), sizeMo23122c.getWidth());
        }
        InterfaceC8771i4 interfaceC8771i4Mo6688e = bVar.mo6688e();
        InterfaceC8795n1.a<Size> aVar2 = InterfaceC8769i2.f31886q;
        if (!interfaceC8771i4Mo6688e.mo35023a(aVar2)) {
            bVar.mo6684a().mo35473G(aVar2, sizeMo23122c);
        }
        InterfaceC8771i4 interfaceC8771i4Mo6688e2 = bVar.mo6688e();
        InterfaceC8795n1.a aVar3 = InterfaceC8769i2.f31890u;
        if (interfaceC8771i4Mo6688e2.mo35023a(aVar3)) {
            C0054c c0054c = (C0054c) m26698e().mo35030h(aVar3, null);
            C0054c.a aVar4 = c0054c == null ? new C0054c.a() : C0054c.a.m115b(c0054c);
            if (c0054c == null || c0054c.m114d() == null) {
                aVar4.m120f(new C0055d(sizeMo23122c, 1));
            }
            if (c0054c == null) {
                aVar4.m119e(new InterfaceC0053b() { // from class: g0.t0
                    @Override // p002a1.InterfaceC0053b
                    /* JADX INFO: renamed from: a */
                    public final List mo110a(List list, int i10) {
                        return C5942u0.m26590j0(sizeMo23122c, list, i10);
                    }
                });
            }
            bVar.mo6684a().mo35473G(aVar3, aVar4.m116a());
        }
        return bVar.mo6688e();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: T */
    public AbstractC8827t3 mo6667T(InterfaceC8795n1 interfaceC8795n1) {
        this.f22624y.m35322g(interfaceC8795n1);
        m26697d0(C5918o0.m26551a(new Object[]{this.f22624y.m35331p()}));
        return m26702g().mo35398i().mo35402d(interfaceC8795n1).mo35399a();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: U */
    public AbstractC8827t3 mo6668U(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        C5931r1.m26561a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + abstractC8827t3 + ", secondaryStreamSpec " + abstractC8827t4);
        C8802o3.b bVarM26593l0 = m26593l0(m26706k(), (C8751f2) m26707l(), abstractC8827t3);
        this.f22624y = bVarM26593l0;
        m26697d0(C5918o0.m26551a(new Object[]{bVarM26593l0.m35331p()}));
        return abstractC8827t3;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: V */
    public void mo6669V() {
        m26592k0();
        synchronized (this.f22618s) {
            this.f22619t.m26729i();
            this.f22619t = null;
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: Z */
    public void mo26591Z(Matrix matrix) {
        super.mo26591Z(matrix);
        synchronized (this.f22618s) {
            try {
                AbstractC5954x0 abstractC5954x0 = this.f22619t;
                if (abstractC5954x0 != null) {
                    abstractC5954x0.m26738u(matrix);
                }
                this.f22623x = matrix;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: b0 */
    public void mo24396b0(Rect rect) {
        super.mo24396b0(rect);
        synchronized (this.f22618s) {
            try {
                AbstractC5954x0 abstractC5954x0 = this.f22619t;
                if (abstractC5954x0 != null) {
                    abstractC5954x0.m26739v(rect);
                }
                this.f22622w = rect;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m26592k0() {
        C10110z.m39008b();
        C8802o3.c cVar = this.f22617A;
        if (cVar != null) {
            cVar.m35341b();
            this.f22617A = null;
        }
        AbstractC8830u1 abstractC8830u1 = this.f22625z;
        if (abstractC8830u1 != null) {
            abstractC8830u1.mo35430d();
            this.f22625z = null;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public C8802o3.b m26593l0(String str, C8751f2 c8751f2, AbstractC8827t3 abstractC8827t3) {
        final AbstractC5954x0 abstractC5954x0;
        C10110z.m39008b();
        Size sizeMo35395f = abstractC8827t3.mo35395f();
        Executor executor = (Executor) C12637g.m47075g(c8751f2.m42046e0(C10417c.m40082c()));
        boolean z10 = true;
        int iM26595n0 = m26594m0() == 1 ? m26595n0() : 4;
        final C0496f c0496f = c8751f2.m35090j0() != null ? new C0496f(c8751f2.m35090j0().m26538a(sizeMo35395f.getWidth(), sizeMo35395f.getHeight(), m26710p(), iM26595n0, 0L)) : new C0496f(C5915n1.m26550a(sizeMo35395f.getWidth(), sizeMo35395f.getHeight(), m26710p(), iM26595n0));
        synchronized (this.f22618s) {
            m26600s0();
            abstractC5954x0 = this.f22619t;
        }
        boolean zM26598q0 = m26704i() != null ? m26598q0(m26704i()) : false;
        int height = zM26598q0 ? sizeMo35395f.getHeight() : sizeMo35395f.getWidth();
        int width = zM26598q0 ? sizeMo35395f.getWidth() : sizeMo35395f.getHeight();
        int i10 = m26597p0() == 2 ? 1 : 35;
        boolean z11 = m26710p() == 35 && m26597p0() == 2;
        boolean z12 = m26710p() == 35 && m26597p0() == 3;
        if (m26710p() != 35 || ((m26704i() == null || m26714t(m26704i()) == 0) && !Boolean.TRUE.equals(m26596o0()))) {
            z10 = false;
        }
        final C0496f c0496f2 = (z11 || (z10 && !z12)) ? new C0496f(C5915n1.m26550a(height, width, i10, c0496f.mo2211e())) : null;
        if (c0496f2 != null) {
            abstractC5954x0.m26736s(c0496f2);
        }
        m26603v0();
        c0496f.mo2212f(abstractC5954x0, executor);
        C8802o3.b bVarM35312r = C8802o3.b.m35312r(c8751f2, abstractC8827t3.mo35395f());
        if (abstractC8827t3.mo35393d() != null) {
            bVarM35312r.m35322g(abstractC8827t3.mo35393d());
        }
        AbstractC8830u1 abstractC8830u1 = this.f22625z;
        if (abstractC8830u1 != null) {
            abstractC8830u1.mo35430d();
        }
        C8781k2 c8781k2 = new C8781k2(c0496f.getSurface(), sizeMo35395f, m26710p());
        this.f22625z = c8781k2;
        c8781k2.m35437k().mo37173a(new Runnable() { // from class: g0.q0
            @Override // java.lang.Runnable
            public final void run() {
                C5942u0.m26587g0(c0496f, c0496f2);
            }
        }, C10417c.m40084e());
        bVarM35312r.m35313A(abstractC8827t3.mo35396g());
        m26693b(bVarM35312r, abstractC8827t3);
        bVarM35312r.m35329n(this.f22625z, abstractC8827t3.mo35391b(), null, -1);
        C8802o3.c cVar = this.f22617A;
        if (cVar != null) {
            cVar.m35341b();
        }
        C8802o3.c cVar2 = new C8802o3.c(new C8802o3.d() { // from class: g0.r0
            @Override // p296n0.C8802o3.d
            /* JADX INFO: renamed from: a */
            public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                C5942u0.m26588h0(this.f22598a, abstractC5954x0, c8802o3, gVar);
            }
        });
        this.f22617A = cVar2;
        bVarM35312r.m35335u(cVar2);
        return bVarM35312r;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: m */
    public InterfaceC8771i4<?> mo6673m(boolean z10, InterfaceC8777j4 interfaceC8777j4) {
        d dVar = f22615B;
        InterfaceC8795n1 interfaceC8795n1Mo35228a = interfaceC8777j4.mo35228a(dVar.m26621a().mo35207X(), 1);
        if (z10) {
            interfaceC8795n1Mo35228a = InterfaceC8795n1.m35288L(interfaceC8795n1Mo35228a, dVar.m26621a());
        }
        if (interfaceC8795n1Mo35228a == null) {
            return null;
        }
        return mo6658D(interfaceC8795n1Mo35228a).mo6688e();
    }

    /* JADX INFO: renamed from: m0 */
    public int m26594m0() {
        return ((C8751f2) m26707l()).m35088h0(0);
    }

    /* JADX INFO: renamed from: n0 */
    public int m26595n0() {
        return ((C8751f2) m26707l()).m35089i0(6);
    }

    /* JADX INFO: renamed from: o0 */
    public Boolean m26596o0() {
        return ((C8751f2) m26707l()).m35091k0(f22616C);
    }

    /* JADX INFO: renamed from: p0 */
    public int m26597p0() {
        return ((C8751f2) m26707l()).m35092l0(1);
    }

    /* JADX INFO: renamed from: q0 */
    public final boolean m26598q0(InterfaceC8804p0 interfaceC8804p0) {
        return m26599r0() && m26714t(interfaceC8804p0) % 180 != 0;
    }

    /* JADX INFO: renamed from: r0 */
    public boolean m26599r0() {
        return ((C8751f2) m26707l()).m35093m0(Boolean.FALSE).booleanValue();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m26600s0() {
        a aVar;
        synchronized (this.f22618s) {
            try {
                C8751f2 c8751f2 = (C8751f2) m26707l();
                if (c8751f2.m35088h0(0) == 1) {
                    this.f22619t = new C5958y0();
                } else {
                    this.f22619t = new C0493c(c8751f2.m42046e0(C10417c.m40082c()));
                }
                this.f22619t.m26734q(m26597p0());
                this.f22619t.m26735r(m26599r0());
                InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
                Boolean boolM26596o0 = m26596o0();
                boolean zM35233a = interfaceC8804p0M26704i != null ? interfaceC8804p0M26704i.mo6698k().mo35049l().m35233a(OnePixelShiftQuirk.class) : false;
                AbstractC5954x0 abstractC5954x0 = this.f22619t;
                if (boolM26596o0 != null) {
                    zM35233a = boolM26596o0.booleanValue();
                }
                abstractC5954x0.m26733p(zM35233a);
                if (interfaceC8804p0M26704i != null) {
                    this.f22619t.m26737t(m26714t(interfaceC8804p0M26704i));
                }
                Rect rect = this.f22622w;
                if (rect != null) {
                    this.f22619t.m26739v(rect);
                }
                Matrix matrix = this.f22623x;
                if (matrix != null) {
                    this.f22619t.m26738u(matrix);
                }
                Executor executor = this.f22620u;
                if (executor != null && (aVar = this.f22621v) != null) {
                    this.f22619t.m26732o(executor, aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m26601t0(Executor executor, final a aVar) {
        synchronized (this.f22618s) {
            try {
                AbstractC5954x0 abstractC5954x0 = this.f22619t;
                if (abstractC5954x0 != null) {
                    abstractC5954x0.m26732o(executor, new a() { // from class: g0.s0
                        @Override // p140g0.C5942u0.a
                        /* JADX INFO: renamed from: k */
                        public final void mo23127k(InterfaceC0494d interfaceC0494d) {
                            aVar.mo23127k(interfaceC0494d);
                        }
                    });
                }
                if (this.f22621v == null) {
                    m26683J();
                }
                this.f22620u = executor;
                this.f22621v = aVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + m26712r();
    }

    /* JADX INFO: renamed from: u0 */
    public void m26602u0(int i10) {
        if (m26692a0(i10)) {
            m26603v0();
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m26603v0() {
        synchronized (this.f22618s) {
            try {
                InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
                if (interfaceC8804p0M26704i != null) {
                    this.f22619t.m26737t(m26714t(interfaceC8804p0M26704i));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
