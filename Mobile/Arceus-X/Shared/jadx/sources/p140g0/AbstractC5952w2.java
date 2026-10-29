package p140g0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.AeFpsRangeQuirk;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import p002a1.C0054c;
import p182i0.AbstractC6600b;
import p233k0.DynamicRangeFeature;
import p233k0.FpsRangeFeature;
import p233k0.VideoStabilizationFeature;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8830u1;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p347p0.C10085a0;
import p424s0.C11145f;
import p424s0.InterfaceC11156q;
import p503w0.C12275e;
import p531x0.C12626z0;
import p533x2.C12637g;

/* JADX INFO: renamed from: g0.w2 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5952w2 {

    /* JADX INFO: renamed from: e */
    public InterfaceC8771i4<?> f22699e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8771i4<?> f22700f;

    /* JADX INFO: renamed from: g */
    public Set<AbstractC6600b> f22701g;

    /* JADX INFO: renamed from: h */
    public InterfaceC8771i4<?> f22702h;

    /* JADX INFO: renamed from: i */
    public AbstractC8827t3 f22703i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8771i4<?> f22704j;

    /* JADX INFO: renamed from: k */
    public Rect f22705k;

    /* JADX INFO: renamed from: m */
    public InterfaceC8804p0 f22707m;

    /* JADX INFO: renamed from: n */
    public InterfaceC8804p0 f22708n;

    /* JADX INFO: renamed from: o */
    public AbstractC5913n f22709o;

    /* JADX INFO: renamed from: p */
    public String f22710p;

    /* JADX INFO: renamed from: a */
    public boolean f22695a = false;

    /* JADX INFO: renamed from: b */
    public final Set<c> f22696b = new HashSet();

    /* JADX INFO: renamed from: c */
    public final Object f22697c = new Object();

    /* JADX INFO: renamed from: d */
    public b f22698d = b.INACTIVE;

    /* JADX INFO: renamed from: l */
    public Matrix f22706l = new Matrix();

    /* JADX INFO: renamed from: q */
    public C8802o3 f22711q = C8802o3.m35296b();

    /* JADX INFO: renamed from: r */
    public C8802o3 f22712r = C8802o3.m35296b();

    /* JADX INFO: renamed from: g0.w2$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f22713a;

        static {
            int[] iArr = new int[VideoStabilizationFeature.b.values().length];
            f22713a = iArr;
            try {
                iArr[VideoStabilizationFeature.b.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22713a[VideoStabilizationFeature.b.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22713a[VideoStabilizationFeature.b.PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: g0.w2$b */
    public enum b {
        ACTIVE,
        INACTIVE
    }

    /* JADX INFO: renamed from: g0.w2$c */
    public interface c {
        /* JADX INFO: renamed from: g */
        void mo6695g(AbstractC5952w2 abstractC5952w2);

        /* JADX INFO: renamed from: m */
        void mo6699m(AbstractC5952w2 abstractC5952w2);

        /* JADX INFO: renamed from: n */
        void mo6700n(AbstractC5952w2 abstractC5952w2);

        /* JADX INFO: renamed from: s */
        void mo6702s(AbstractC5952w2 abstractC5952w2);
    }

    public AbstractC5952w2(InterfaceC8771i4<?> interfaceC8771i4) {
        this.f22700f = interfaceC8771i4;
        this.f22702h = interfaceC8771i4;
    }

    /* JADX INFO: renamed from: A */
    public Set<C5902k0> mo6654A(InterfaceC8799o0 interfaceC8799o0) {
        return null;
    }

    /* JADX INFO: renamed from: B */
    public Set<Integer> mo6655B() {
        return Collections.EMPTY_SET;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: C */
    public int m26677C() {
        return ((InterfaceC8769i2) this.f22702h).m35185J(0);
    }

    /* JADX INFO: renamed from: D */
    public abstract InterfaceC8771i4.b<?, ?, ?> mo6658D(InterfaceC8795n1 interfaceC8795n1);

    /* JADX INFO: renamed from: E */
    public Rect m26678E() {
        return this.f22705k;
    }

    /* JADX INFO: renamed from: F */
    public boolean m26679F(int i10) {
        Iterator<Integer> it = mo6655B().iterator();
        while (it.hasNext()) {
            if (C12626z0.m47046e(i10, it.next().intValue())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: G */
    public boolean m26680G() {
        return this.f22695a;
    }

    /* JADX INFO: renamed from: H */
    public boolean m26681H(InterfaceC8804p0 interfaceC8804p0) {
        int iM26711q = m26711q();
        if (iM26711q == -1 || iM26711q == 0) {
            return false;
        }
        if (iM26711q == 1) {
            return true;
        }
        if (iM26711q == 2) {
            return interfaceC8804p0.mo35084l();
        }
        throw new AssertionError("Unknown mirrorMode: " + iM26711q);
    }

    /* JADX INFO: renamed from: I */
    public InterfaceC8771i4<?> m26682I(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4<?> interfaceC8771i4, InterfaceC8771i4<?> interfaceC8771i5) {
        C8846x2 c8846x2M35505k0;
        if (interfaceC8771i5 != null) {
            c8846x2M35505k0 = C8846x2.m35506l0(interfaceC8771i5);
            c8846x2M35505k0.m35507m0(InterfaceC11156q.f39400M);
        } else {
            c8846x2M35505k0 = C8846x2.m35505k0();
        }
        if (this.f22700f.mo35023a(InterfaceC8769i2.f31882m) || this.f22700f.mo35023a(InterfaceC8769i2.f31886q)) {
            InterfaceC8795n1.a<C0054c> aVar = InterfaceC8769i2.f31890u;
            if (c8846x2M35505k0.mo35023a(aVar)) {
                c8846x2M35505k0.m35507m0(aVar);
            }
        }
        InterfaceC8771i4<?> interfaceC8771i6 = this.f22700f;
        InterfaceC8795n1.a<C0054c> aVar2 = InterfaceC8769i2.f31890u;
        if (interfaceC8771i6.mo35023a(aVar2)) {
            InterfaceC8795n1.a<Size> aVar3 = InterfaceC8769i2.f31888s;
            if (c8846x2M35505k0.mo35023a(aVar3) && ((C0054c) this.f22700f.mo35027e(aVar2)).m114d() != null) {
                c8846x2M35505k0.m35507m0(aVar3);
            }
        }
        Iterator<InterfaceC8795n1.a<?>> it = this.f22700f.mo35024b().iterator();
        while (it.hasNext()) {
            InterfaceC8795n1.m35289P(c8846x2M35505k0, c8846x2M35505k0, this.f22700f, it.next());
        }
        if (interfaceC8771i4 != null) {
            for (InterfaceC8795n1.a<?> aVar4 : interfaceC8771i4.mo35024b()) {
                if (!aVar4.mo35216c().equals(InterfaceC11156q.f39400M.mo35216c())) {
                    InterfaceC8795n1.m35289P(c8846x2M35505k0, c8846x2M35505k0, interfaceC8771i4, aVar4);
                }
            }
        }
        if (c8846x2M35505k0.mo35023a(InterfaceC8769i2.f31886q)) {
            InterfaceC8795n1.a<Integer> aVar5 = InterfaceC8769i2.f31882m;
            if (c8846x2M35505k0.mo35023a(aVar5)) {
                c8846x2M35505k0.m35507m0(aVar5);
            }
        }
        InterfaceC8795n1.a<C0054c> aVar6 = InterfaceC8769i2.f31890u;
        if (c8846x2M35505k0.mo35023a(aVar6) && ((C0054c) c8846x2M35505k0.mo35027e(aVar6)).m111a() != 0) {
            c8846x2M35505k0.mo35473G(InterfaceC8771i4.f31900E, Boolean.TRUE);
        }
        m26694c(c8846x2M35505k0);
        return mo6664Q(interfaceC8799o0, mo6658D(c8846x2M35505k0));
    }

    /* JADX INFO: renamed from: J */
    public final void m26683J() {
        this.f22698d = b.ACTIVE;
        m26686M();
    }

    /* JADX INFO: renamed from: K */
    public final void m26684K() {
        this.f22698d = b.INACTIVE;
        m26686M();
    }

    /* JADX INFO: renamed from: L */
    public final void m26685L() {
        Iterator<c> it = this.f22696b.iterator();
        while (it.hasNext()) {
            it.next().mo6700n(this);
        }
    }

    /* JADX INFO: renamed from: M */
    public final void m26686M() {
        int iOrdinal = this.f22698d.ordinal();
        if (iOrdinal == 0) {
            Iterator<c> it = this.f22696b.iterator();
            while (it.hasNext()) {
                it.next().mo6702s(this);
            }
        } else {
            if (iOrdinal != 1) {
                return;
            }
            Iterator<c> it2 = this.f22696b.iterator();
            while (it2.hasNext()) {
                it2.next().mo6699m(this);
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m26687N() {
        Iterator<c> it = this.f22696b.iterator();
        while (it.hasNext()) {
            it.next().mo6695g(this);
        }
    }

    /* JADX INFO: renamed from: O */
    public void mo6662O() {
    }

    /* JADX INFO: renamed from: P */
    public void mo6663P() {
    }

    /* JADX INFO: renamed from: Q */
    public InterfaceC8771i4<?> mo6664Q(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        return bVar.mo6688e();
    }

    /* JADX INFO: renamed from: R */
    public void mo6665R() {
        this.f22695a = true;
    }

    /* JADX INFO: renamed from: S */
    public void mo6666S() {
        this.f22695a = false;
    }

    /* JADX INFO: renamed from: T */
    public AbstractC8827t3 mo6667T(InterfaceC8795n1 interfaceC8795n1) {
        AbstractC8827t3 abstractC8827t3 = this.f22703i;
        if (abstractC8827t3 != null) {
            return abstractC8827t3.mo35398i().mo35402d(interfaceC8795n1).mo35399a();
        }
        throw new UnsupportedOperationException("Attempt to update the implementation options for a use case without attached stream specifications.");
    }

    /* JADX INFO: renamed from: U */
    public AbstractC8827t3 mo6668U(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        return abstractC8827t3;
    }

    /* JADX INFO: renamed from: V */
    public void mo6669V() {
    }

    /* JADX INFO: renamed from: W */
    public final void m26688W(c cVar) {
        this.f22696b.remove(cVar);
    }

    /* JADX INFO: renamed from: X */
    public void m26689X(AbstractC5913n abstractC5913n) {
        C12637g.m47069a(abstractC5913n == null || m26679F(abstractC5913n.m26545g()));
        this.f22709o = abstractC5913n;
    }

    /* JADX INFO: renamed from: Y */
    public void m26690Y(Set<AbstractC6600b> set) {
        this.f22701g = set != null ? new HashSet(set) : null;
    }

    /* JADX INFO: renamed from: Z */
    public void mo26591Z(Matrix matrix) {
        this.f22706l = new Matrix(matrix);
    }

    /* JADX INFO: renamed from: a */
    public final void m26691a(c cVar) {
        this.f22696b.add(cVar);
    }

    /* JADX INFO: renamed from: a0 */
    public boolean m26692a0(int i10) {
        int iM35185J = ((InterfaceC8769i2) m26707l()).m35185J(-1);
        if (iM35185J != -1 && iM35185J == i10) {
            return false;
        }
        InterfaceC8771i4.b<?, ?, ?> bVarMo6658D = mo6658D(this.f22700f);
        C12275e.m45573a(bVarMo6658D, i10);
        this.f22700f = bVarMo6658D.mo6688e();
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        if (interfaceC8804p0M26704i == null) {
            this.f22702h = this.f22700f;
            return true;
        }
        this.f22702h = m26682I(interfaceC8804p0M26704i.mo6698k(), this.f22699e, this.f22704j);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m26693b(C8802o3.b bVar, AbstractC8827t3 abstractC8827t3) {
        if (!AbstractC8827t3.f32104a.equals(abstractC8827t3.mo35392c())) {
            bVar.m35336v(abstractC8827t3.mo35392c());
            return;
        }
        synchronized (this.f22697c) {
            try {
                List listM35235c = ((InterfaceC8804p0) C12637g.m47075g(this.f22707m)).mo6698k().mo35049l().m35235c(AeFpsRangeQuirk.class);
                boolean z10 = true;
                if (listM35235c.size() > 1) {
                    z10 = false;
                }
                C12637g.m47070b(z10, "There should not have more than one AeFpsRangeQuirk.");
                if (!listM35235c.isEmpty()) {
                    bVar.m35336v(((AeFpsRangeQuirk) listM35235c.get(0)).mo2037a());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: b0 */
    public void mo24396b0(Rect rect) {
        this.f22705k = rect;
    }

    /* JADX INFO: renamed from: c */
    public final void m26694c(C8846x2 c8846x2) {
        C5931r1.m26561a("UseCase", "applyFeaturesToConfig: mFeatureGroup = " + this.f22701g + ", this = " + this);
        Set<AbstractC6600b> set = this.f22701g;
        if (set == null) {
            return;
        }
        C5902k0 c5902k0M30680f = DynamicRangeFeature.f28485j;
        Range<Integer> range = AbstractC8827t3.f32104a;
        VideoStabilizationFeature.b bVarM30687f = VideoStabilizationFeature.f28503j;
        for (AbstractC6600b abstractC6600b : set) {
            if (abstractC6600b instanceof DynamicRangeFeature) {
                c5902k0M30680f = ((DynamicRangeFeature) abstractC6600b).getDynamicRange();
            } else if (abstractC6600b instanceof FpsRangeFeature) {
                FpsRangeFeature c7402c = (FpsRangeFeature) abstractC6600b;
                range = new Range<>(Integer.valueOf(c7402c.getMinFps()), Integer.valueOf(c7402c.getMaxFps()));
            } else if (abstractC6600b instanceof VideoStabilizationFeature) {
                bVarM30687f = ((VideoStabilizationFeature) abstractC6600b).getMode();
            }
        }
        if ((this instanceof C5864a2) || C11145f.m41959e0(this)) {
            c8846x2.mo35473G(InterfaceC8763h2.f31865l, c5902k0M30680f);
        }
        c8846x2.mo35473G(InterfaceC8771i4.f31898C, range);
        int i10 = a.f22713a[bVarM30687f.ordinal()];
        if (i10 == 1) {
            c8846x2.mo35473G(InterfaceC8771i4.f31903H, 1);
            c8846x2.mo35473G(InterfaceC8771i4.f31904I, 1);
        } else if (i10 == 2) {
            c8846x2.mo35473G(InterfaceC8771i4.f31903H, 0);
            c8846x2.mo35473G(InterfaceC8771i4.f31904I, 2);
        } else {
            if (i10 != 3) {
                return;
            }
            c8846x2.mo35473G(InterfaceC8771i4.f31903H, 2);
            c8846x2.mo35473G(InterfaceC8771i4.f31904I, 0);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m26695c0(InterfaceC8804p0 interfaceC8804p0) {
        mo6669V();
        synchronized (this.f22697c) {
            try {
                InterfaceC8804p0 interfaceC8804p1 = this.f22707m;
                if (interfaceC8804p0 == interfaceC8804p1) {
                    m26688W(interfaceC8804p1);
                    this.f22707m = null;
                }
                InterfaceC8804p0 interfaceC8804p2 = this.f22708n;
                if (interfaceC8804p0 == interfaceC8804p2) {
                    m26688W(interfaceC8804p2);
                    this.f22708n = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22703i = null;
        this.f22705k = null;
        this.f22702h = this.f22700f;
        this.f22699e = null;
        this.f22704j = null;
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: d */
    public final void m26696d(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, InterfaceC8771i4<?> interfaceC8771i4, InterfaceC8771i4<?> interfaceC8771i5) {
        synchronized (this.f22697c) {
            try {
                this.f22707m = interfaceC8804p0;
                this.f22708n = interfaceC8804p1;
                m26691a(interfaceC8804p0);
                if (interfaceC8804p1 != null) {
                    m26691a(interfaceC8804p1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f22699e = interfaceC8771i4;
        this.f22704j = interfaceC8771i5;
        this.f22702h = m26682I(interfaceC8804p0.mo6698k(), this.f22699e, this.f22704j);
        mo6662O();
    }

    /* JADX INFO: renamed from: d0 */
    public void m26697d0(List<C8802o3> list) {
        if (list.isEmpty()) {
            return;
        }
        this.f22711q = list.get(0);
        if (list.size() > 1) {
            this.f22712r = list.get(1);
        }
        Iterator<C8802o3> it = list.iterator();
        while (it.hasNext()) {
            for (AbstractC8830u1 abstractC8830u1 : it.next().m35310p()) {
                if (abstractC8830u1.m35433g() == null) {
                    abstractC8830u1.m35441p(getClass());
                }
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC8771i4<?> m26698e() {
        return this.f22700f;
    }

    /* JADX INFO: renamed from: e0 */
    public void m26699e0(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        this.f22703i = mo6668U(abstractC8827t3, abstractC8827t4);
    }

    /* JADX INFO: renamed from: f */
    public int m26700f() {
        return ((InterfaceC8769i2) this.f22702h).m35194t(-1);
    }

    /* JADX INFO: renamed from: f0 */
    public void m26701f0(InterfaceC8795n1 interfaceC8795n1) {
        this.f22703i = mo6667T(interfaceC8795n1);
    }

    /* JADX INFO: renamed from: g */
    public AbstractC8827t3 m26702g() {
        return this.f22703i;
    }

    /* JADX INFO: renamed from: h */
    public Size m26703h() {
        AbstractC8827t3 abstractC8827t3 = this.f22703i;
        if (abstractC8827t3 != null) {
            return abstractC8827t3.mo35395f();
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC8804p0 m26704i() {
        InterfaceC8804p0 interfaceC8804p0;
        synchronized (this.f22697c) {
            interfaceC8804p0 = this.f22707m;
        }
        return interfaceC8804p0;
    }

    /* JADX INFO: renamed from: j */
    public InterfaceC8784l0 m26705j() {
        synchronized (this.f22697c) {
            try {
                InterfaceC8804p0 interfaceC8804p0 = this.f22707m;
                if (interfaceC8804p0 == null) {
                    return InterfaceC8784l0.f31940a;
                }
                return interfaceC8804p0.mo6694e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public String m26706k() {
        return ((InterfaceC8804p0) C12637g.m47076h(m26704i(), "No camera attached to use case: " + this)).mo6698k().mo6750e();
    }

    /* JADX INFO: renamed from: l */
    public InterfaceC8771i4<?> m26707l() {
        return this.f22702h;
    }

    /* JADX INFO: renamed from: m */
    public abstract InterfaceC8771i4<?> mo6673m(boolean z10, InterfaceC8777j4 interfaceC8777j4);

    /* JADX INFO: renamed from: n */
    public AbstractC5913n m26708n() {
        return this.f22709o;
    }

    /* JADX INFO: renamed from: o */
    public Set<AbstractC6600b> m26709o() {
        return this.f22701g;
    }

    /* JADX INFO: renamed from: p */
    public int m26710p() {
        return this.f22702h.mo26767p();
    }

    /* JADX INFO: renamed from: q */
    public int m26711q() {
        return ((InterfaceC8769i2) this.f22702h).m35189g0(-1);
    }

    /* JADX INFO: renamed from: r */
    public String m26712r() {
        String strM42045u = this.f22702h.m42045u("<UnknownUseCase-" + hashCode() + ">");
        Objects.requireNonNull(strM42045u);
        return strM42045u;
    }

    /* JADX INFO: renamed from: s */
    public String m26713s() {
        return this.f22710p;
    }

    /* JADX INFO: renamed from: t */
    public int m26714t(InterfaceC8804p0 interfaceC8804p0) {
        return m26715u(interfaceC8804p0, false);
    }

    /* JADX INFO: renamed from: u */
    public int m26715u(InterfaceC8804p0 interfaceC8804p0, boolean z10) {
        int iMo6751w = interfaceC8804p0.mo6698k().mo6751w(m26677C());
        return (interfaceC8804p0.mo6701q() || !z10) ? iMo6751w : C10085a0.m38895w(-iMo6751w);
    }

    /* JADX INFO: renamed from: v */
    public InterfaceC8804p0 m26716v() {
        InterfaceC8804p0 interfaceC8804p0;
        synchronized (this.f22697c) {
            interfaceC8804p0 = this.f22708n;
        }
        return interfaceC8804p0;
    }

    /* JADX INFO: renamed from: w */
    public String m26717w() {
        if (m26716v() == null) {
            return null;
        }
        return m26716v().mo6698k().mo6750e();
    }

    /* JADX INFO: renamed from: x */
    public C8802o3 m26718x() {
        return this.f22712r;
    }

    /* JADX INFO: renamed from: y */
    public Matrix m26719y() {
        return this.f22706l;
    }

    /* JADX INFO: renamed from: z */
    public C8802o3 m26720z() {
        return this.f22711q;
    }
}
