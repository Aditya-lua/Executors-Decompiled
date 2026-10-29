package p140g0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import p002a1.C0052a;
import p002a1.C0054c;
import p002a1.C0055d;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.C8734c3;
import p296n0.C8752f3;
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
import p531x0.C12602n0;
import p531x0.C12618v0;
import p533x2.C12637g;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: g0.a2 */
/* JADX INFO: loaded from: classes.dex */
public final class C5864a2 extends AbstractC5952w2 {

    /* JADX INFO: renamed from: A */
    public static final b f22361A = new b();

    /* JADX INFO: renamed from: B */
    public static final Executor f22362B = C10417c.m40084e();

    /* JADX INFO: renamed from: s */
    public c f22363s;

    /* JADX INFO: renamed from: t */
    public Executor f22364t;

    /* JADX INFO: renamed from: u */
    public C8802o3.b f22365u;

    /* JADX INFO: renamed from: v */
    public AbstractC8830u1 f22366v;

    /* JADX INFO: renamed from: w */
    public C12602n0 f22367w;

    /* JADX INFO: renamed from: x */
    public C5948v2 f22368x;

    /* JADX INFO: renamed from: y */
    public C12618v0 f22369y;

    /* JADX INFO: renamed from: z */
    public C8802o3.c f22370z;

    /* JADX INFO: renamed from: g0.a2$a */
    public static final class a implements InterfaceC8771i4.b<C5864a2, C8752f3, a>, InterfaceC8769i2.a<a> {

        /* JADX INFO: renamed from: a */
        public final C8846x2 f22371a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public a() {
            this(C8846x2.m35505k0());
        }

        /* JADX INFO: renamed from: g */
        public static a m26297g(InterfaceC8795n1 interfaceC8795n1) {
            return new a(C8846x2.m35506l0(interfaceC8795n1));
        }

        @Override // p140g0.InterfaceC5906l0
        /* JADX INFO: renamed from: a */
        public InterfaceC8841w2 mo6684a() {
            return this.f22371a;
        }

        /* JADX INFO: renamed from: f */
        public C5864a2 m26298f() {
            C8752f3 c8752f3Mo6688e = mo6688e();
            InterfaceC8769i2.m35182Y(c8752f3Mo6688e);
            return new C5864a2(c8752f3Mo6688e);
        }

        /* JADX DEBUG: Method merged with bridge method: e()Ln0/i4; */
        @Override // p296n0.InterfaceC8771i4.b
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C8752f3 mo6688e() {
            return new C8752f3(C8734c3.m35022j0(this.f22371a));
        }

        /* JADX INFO: renamed from: i */
        public a m26300i(InterfaceC8777j4.b bVar) {
            mo6684a().mo35473G(InterfaceC8771i4.f31902G, bVar);
            return this;
        }

        /* JADX INFO: renamed from: j */
        public a m26301j(C5902k0 c5902k0) {
            mo6684a().mo35473G(InterfaceC8763h2.f31865l, c5902k0);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public a m26302k(boolean z10) {
            mo6684a().mo35473G(InterfaceC8771i4.f31901F, Boolean.valueOf(z10));
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: b(La1/c;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public a mo24411b(C0054c c0054c) {
            mo6684a().mo35473G(InterfaceC8769i2.f31890u, c0054c);
            return this;
        }

        /* JADX INFO: renamed from: m */
        public a m26304m(int i10) {
            mo6684a().mo35473G(InterfaceC8771i4.f31896A, Integer.valueOf(i10));
            return this;
        }

        @Deprecated
        /* JADX INFO: renamed from: n */
        public a m26305n(int i10) {
            if (i10 == -1) {
                i10 = 0;
            }
            mo6684a().mo35473G(InterfaceC8769i2.f31882m, Integer.valueOf(i10));
            return this;
        }

        /* JADX INFO: renamed from: o */
        public a m26306o(Class<C5864a2> cls) {
            mo6684a().mo35473G(InterfaceC11156q.f39401N, cls);
            if (mo6684a().mo35030h(InterfaceC11156q.f39400M, null) == null) {
                m26307p(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        /* JADX INFO: renamed from: p */
        public a m26307p(String str) {
            mo6684a().mo35473G(InterfaceC11156q.f39400M, str);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: d(Landroid/util/Size;)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        @Deprecated
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public a mo24413d(Size size) {
            mo6684a().mo35473G(InterfaceC8769i2.f31886q, size);
            return this;
        }

        /* JADX DEBUG: Method merged with bridge method: c(I)Ljava/lang/Object; */
        @Override // p296n0.InterfaceC8769i2.a
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public a mo24412c(int i10) {
            mo6684a().mo35473G(InterfaceC8769i2.f31883n, Integer.valueOf(i10));
            mo6684a().mo35473G(InterfaceC8769i2.f31884o, Integer.valueOf(i10));
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public a(C8846x2 c8846x2) {
            this.f22371a = c8846x2;
            Class cls = (Class) c8846x2.mo35030h(InterfaceC11156q.f39401N, null);
            if (cls != null && !cls.equals(C5864a2.class)) {
                throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
            }
            m26300i(InterfaceC8777j4.b.PREVIEW);
            m26306o(C5864a2.class);
            InterfaceC8795n1.a<Integer> aVar = InterfaceC8769i2.f31885p;
            if (((Integer) c8846x2.mo35030h(aVar, -1)).intValue() == -1) {
                c8846x2.mo35473G(aVar, 2);
            }
        }
    }

    /* JADX INFO: renamed from: g0.a2$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public static final C0054c f22372a;

        /* JADX INFO: renamed from: b */
        public static final C8752f3 f22373b;

        /* JADX INFO: renamed from: c */
        public static final C5902k0 f22374c;

        static {
            C0054c c0054cM116a = new C0054c.a().m118d(C0052a.f98c).m120f(C0055d.f110c).m116a();
            f22372a = c0054cM116a;
            C5902k0 c5902k0 = C5902k0.f22549c;
            f22374c = c5902k0;
            f22373b = new a().m26304m(2).m26305n(0).mo24411b(c0054cM116a).m26302k(true).m26301j(c5902k0).mo6688e();
        }

        /* JADX INFO: renamed from: a */
        public C8752f3 m26310a() {
            return f22373b;
        }
    }

    /* JADX INFO: renamed from: g0.a2$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo2356a(C5948v2 c5948v2);
    }

    public C5864a2(C8752f3 c8752f3) {
        super(c8752f3);
        this.f22364t = f22362B;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m26283g0(C5864a2 c5864a2, C8802o3 c8802o3, C8802o3.g gVar) {
        if (c5864a2.m26704i() == null) {
            return;
        }
        c5864a2.m26296t0((C8752f3) c5864a2.m26707l(), c5864a2.m26702g());
        c5864a2.m26685L();
    }

    /* JADX INFO: renamed from: k0 */
    private void m26286k0() {
        C8802o3.c cVar = this.f22370z;
        if (cVar != null) {
            cVar.m35341b();
            this.f22370z = null;
        }
        AbstractC8830u1 abstractC8830u1 = this.f22366v;
        if (abstractC8830u1 != null) {
            abstractC8830u1.mo35430d();
            this.f22366v = null;
        }
        C12618v0 c12618v0 = this.f22369y;
        if (c12618v0 != null) {
            c12618v0.m47010f();
            this.f22369y = null;
        }
        C12602n0 c12602n0 = this.f22367w;
        if (c12602n0 != null) {
            c12602n0.m46951i();
            this.f22367w = null;
        }
        C5948v2 c5948v2 = this.f22368x;
        if (c5948v2 != null) {
            c5948v2.m26650l();
        }
        this.f22368x = null;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: B */
    public Set<Integer> mo6655B() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: D */
    public InterfaceC8771i4.b<?, ?, ?> mo6658D(InterfaceC8795n1 interfaceC8795n1) {
        return a.m26297g(interfaceC8795n1);
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: Q */
    public InterfaceC8771i4<?> mo6664Q(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        bVar.mo6684a().mo35473G(InterfaceC8763h2.f31863j, 34);
        return bVar.mo6688e();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: T */
    public AbstractC8827t3 mo6667T(InterfaceC8795n1 interfaceC8795n1) {
        this.f22365u.m35322g(interfaceC8795n1);
        m26697d0(C5918o0.m26551a(new Object[]{this.f22365u.m35331p()}));
        return m26702g().mo35398i().mo35402d(interfaceC8795n1).mo35399a();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: U */
    public AbstractC8827t3 mo6668U(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        C5931r1.m26561a("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + abstractC8827t3 + ", secondaryStreamSpec " + abstractC8827t4);
        m26296t0((C8752f3) m26707l(), abstractC8827t3);
        return abstractC8827t3;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: V */
    public void mo6669V() {
        m26286k0();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: b0 */
    public void mo24396b0(Rect rect) {
        super.mo24396b0(rect);
        m26292p0();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m26287j0(C8802o3.b bVar, AbstractC8827t3 abstractC8827t3) {
        if (this.f22363s != null) {
            bVar.m35329n(this.f22366v, abstractC8827t3.mo35391b(), m26713s(), m26711q());
        }
        C8802o3.c cVar = this.f22370z;
        if (cVar != null) {
            cVar.m35341b();
        }
        C8802o3.c cVar2 = new C8802o3.c(new C8802o3.d() { // from class: g0.z1
            @Override // p296n0.C8802o3.d
            /* JADX INFO: renamed from: a */
            public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                C5864a2.m26283g0(this.f22765a, c8802o3, gVar);
            }
        });
        this.f22370z = cVar2;
        bVar.m35335u(cVar2);
    }

    /* JADX INFO: renamed from: l0 */
    public final C8802o3.b m26288l0(C8752f3 c8752f3, AbstractC8827t3 abstractC8827t3) {
        C10110z.m39008b();
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i);
        final InterfaceC8804p0 interfaceC8804p0 = interfaceC8804p0M26704i;
        m26286k0();
        C12637g.m47077i(this.f22367w == null);
        Matrix matrixM26719y = m26719y();
        boolean zMo6701q = interfaceC8804p0.mo6701q();
        Rect rectM26289m0 = m26289m0(abstractC8827t3.mo35395f());
        Objects.requireNonNull(rectM26289m0);
        this.f22367w = new C12602n0(1, 34, abstractC8827t3, matrixM26719y, zMo6701q, rectM26289m0, m26715u(interfaceC8804p0, m26681H(interfaceC8804p0)), m26700f(), m26295s0(interfaceC8804p0));
        AbstractC5913n abstractC5913nM26708n = m26708n();
        if (abstractC5913nM26708n != null) {
            this.f22369y = new C12618v0(interfaceC8804p0, abstractC5913nM26708n.m26539a());
            this.f22367w.m46947e(new Runnable() { // from class: g0.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22694a.m26685L();
                }
            });
            AbstractC13677f abstractC13677fM49905j = AbstractC13677f.m49905j(this.f22367w);
            C12602n0 c12602n0 = this.f22369y.m47014j(C12618v0.b.m47017c(this.f22367w, Collections.singletonList(abstractC13677fM49905j))).get(abstractC13677fM49905j);
            Objects.requireNonNull(c12602n0);
            c12602n0.m46947e(new Runnable() { // from class: g0.x1
                @Override // java.lang.Runnable
                public final void run() {
                    C5864a2 c5864a2 = this.f22739a;
                    c5864a2.m26290n0(c5864a2.f22367w, interfaceC8804p0);
                }
            });
            this.f22368x = c12602n0.m46953k(interfaceC8804p0);
            this.f22366v = this.f22367w.m46957o();
        } else {
            this.f22367w.m46947e(new Runnable() { // from class: g0.w1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22694a.m26685L();
                }
            });
            C5948v2 c5948v2M46953k = this.f22367w.m46953k(interfaceC8804p0);
            this.f22368x = c5948v2M46953k;
            this.f22366v = c5948v2M46953k.m26652n();
        }
        if (this.f22363s != null) {
            m26291o0();
        }
        C8802o3.b bVarM35312r = C8802o3.b.m35312r(c8752f3, abstractC8827t3.mo35395f());
        bVarM35312r.m35313A(abstractC8827t3.mo35396g());
        m26693b(bVarM35312r, abstractC8827t3);
        bVarM35312r.m35340z(c8752f3.m35200E());
        if (abstractC8827t3.mo35393d() != null) {
            bVarM35312r.m35322g(abstractC8827t3.mo35393d());
        }
        m26287j0(bVarM35312r, abstractC8827t3);
        return bVarM35312r;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: m */
    public InterfaceC8771i4<?> mo6673m(boolean z10, InterfaceC8777j4 interfaceC8777j4) {
        b bVar = f22361A;
        InterfaceC8795n1 interfaceC8795n1Mo35228a = interfaceC8777j4.mo35228a(bVar.m26310a().mo35207X(), 1);
        if (z10) {
            interfaceC8795n1Mo35228a = InterfaceC8795n1.m35288L(interfaceC8795n1Mo35228a, bVar.m26310a());
        }
        if (interfaceC8795n1Mo35228a == null) {
            return null;
        }
        return mo6658D(interfaceC8795n1Mo35228a).mo6688e();
    }

    /* JADX INFO: renamed from: m0 */
    public final Rect m26289m0(Size size) {
        if (m26678E() != null) {
            return m26678E();
        }
        if (size != null) {
            return new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return null;
    }

    /* JADX INFO: renamed from: n0 */
    public final void m26290n0(C12602n0 c12602n0, InterfaceC8804p0 interfaceC8804p0) {
        C10110z.m39008b();
        if (interfaceC8804p0 == m26704i()) {
            c12602n0.m46964v();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m26291o0() {
        m26292p0();
        final c cVar = (c) C12637g.m47075g(this.f22363s);
        final C5948v2 c5948v2 = (C5948v2) C12637g.m47075g(this.f22368x);
        this.f22364t.execute(new Runnable() { // from class: g0.y1
            @Override // java.lang.Runnable
            public final void run() {
                cVar.mo2356a(c5948v2);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m26292p0() {
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        C12602n0 c12602n0 = this.f22367w;
        if (interfaceC8804p0M26704i == null || c12602n0 == null) {
            return;
        }
        c12602n0.m46968z(m26715u(interfaceC8804p0M26704i, m26681H(interfaceC8804p0M26704i)), m26700f());
    }

    /* JADX INFO: renamed from: q0 */
    public void m26293q0(c cVar) {
        m26294r0(f22362B, cVar);
    }

    /* JADX INFO: renamed from: r0 */
    public void m26294r0(Executor executor, c cVar) {
        C10110z.m39008b();
        if (cVar == null) {
            this.f22363s = null;
            m26684K();
            return;
        }
        this.f22363s = cVar;
        this.f22364t = executor;
        if (m26703h() != null) {
            m26296t0((C8752f3) m26707l(), m26702g());
            m26685L();
        }
        m26683J();
    }

    /* JADX INFO: renamed from: s0 */
    public final boolean m26295s0(InterfaceC8804p0 interfaceC8804p0) {
        return interfaceC8804p0.mo6701q() && m26681H(interfaceC8804p0);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m26296t0(C8752f3 c8752f3, AbstractC8827t3 abstractC8827t3) {
        C8802o3.b bVarM26288l0 = m26288l0(c8752f3, abstractC8827t3);
        this.f22365u = bVarM26288l0;
        m26697d0(C5918o0.m26551a(new Object[]{bVarM26288l0.m35331p()}));
    }

    public String toString() {
        return "Preview:" + m26712r();
    }
}
