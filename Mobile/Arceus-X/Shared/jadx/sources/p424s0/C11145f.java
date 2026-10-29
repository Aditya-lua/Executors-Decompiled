package p424s0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p021b1.C1196g;
import p140g0.AbstractC5913n;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5894i0;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p140g0.C5933s;
import p140g0.C5948v2;
import p140g0.C5960y2;
import p140g0.InterfaceC5905l;
import p140g0.InterfaceC5909m;
import p140g0.InterfaceC5937t;
import p155h0.InterfaceC6259a;
import p182i0.AbstractC6600b;
import p204j0.ResolvedFeatureGroup;
import p296n0.AbstractC8827t3;
import p296n0.C8742e;
import p296n0.C8748f;
import p296n0.C8757g2;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.InterfaceC8761h0;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8784l0;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8804p0;
import p366q0.C10417c;
import p480v0.C11990e;
import p531x0.C12626z0;
import p533x2.C12637g;
import p533x2.InterfaceC12631a;

/* JADX INFO: renamed from: s0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C11145f implements InterfaceC5905l {

    /* JADX INFO: renamed from: a */
    public final C8748f f39353a;

    /* JADX INFO: renamed from: b */
    public final C8748f f39354b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC8777j4 f39355c;

    /* JADX INFO: renamed from: d */
    public final C5933s f39356d;

    /* JADX INFO: renamed from: g */
    public final InterfaceC6259a f39359g;

    /* JADX INFO: renamed from: h */
    public C5960y2 f39360h;

    /* JADX INFO: renamed from: l */
    public final InterfaceC8761h0 f39364l;

    /* JADX INFO: renamed from: p */
    public AbstractC5952w2 f39368p;

    /* JADX INFO: renamed from: q */
    public C1196g f39369q;

    /* JADX INFO: renamed from: r */
    public final C5894i0 f39370r;

    /* JADX INFO: renamed from: s */
    public final C5894i0 f39371s;

    /* JADX INFO: renamed from: u */
    public final InterfaceC11152m f39373u;

    /* JADX INFO: renamed from: e */
    public final List<AbstractC5952w2> f39357e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final List<AbstractC5952w2> f39358f = new ArrayList();

    /* JADX INFO: renamed from: i */
    public List<AbstractC5913n> f39361i = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: j */
    public int f39362j = 0;

    /* JADX INFO: renamed from: k */
    public Range<Integer> f39363k = AbstractC8827t3.f32104a;

    /* JADX INFO: renamed from: m */
    public final Object f39365m = new Object();

    /* JADX INFO: renamed from: n */
    public boolean f39366n = true;

    /* JADX INFO: renamed from: o */
    public InterfaceC8795n1 f39367o = null;

    /* JADX INFO: renamed from: t */
    public final C11990e f39372t = new C11990e();

    /* JADX INFO: renamed from: s0.f$a */
    public static final class a extends Exception {
        public a(Throwable th2) {
            super(th2);
        }
    }

    /* JADX INFO: renamed from: s0.f$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public InterfaceC8771i4<?> f39374a;

        /* JADX INFO: renamed from: b */
        public InterfaceC8771i4<?> f39375b;

        public b(InterfaceC8771i4<?> interfaceC8771i4, InterfaceC8771i4<?> interfaceC8771i5) {
            this.f39374a = interfaceC8771i4;
            this.f39375b = interfaceC8771i5;
        }
    }

    public C11145f(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, C8742e c8742e, C8742e c8742e2, C5894i0 c5894i0, C5894i0 c5894i1, InterfaceC6259a interfaceC6259a, InterfaceC11152m interfaceC11152m, InterfaceC8777j4 interfaceC8777j4) {
        this.f39364l = c8742e.m35068C();
        this.f39353a = new C8748f(interfaceC8804p0, c8742e);
        if (interfaceC8804p1 == null || c8742e2 == null) {
            this.f39354b = null;
        } else {
            this.f39354b = new C8748f(interfaceC8804p1, c8742e2);
        }
        this.f39370r = c5894i0;
        this.f39371s = c5894i1;
        this.f39359g = interfaceC6259a;
        this.f39355c = interfaceC8777j4;
        this.f39356d = C5933s.m26575b(c8742e, c8742e2);
        this.f39373u = interfaceC11152m;
    }

    /* JADX INFO: renamed from: B */
    public static Matrix m41942B(Rect rect, Size size) {
        C12637g.m47070b(rect.width() > 0 && rect.height() > 0, "Cannot compute viewport crop rects zero sized sensor rect.");
        RectF rectF = new RectF(rect);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()), rectF, Matrix.ScaleToFit.CENTER);
        matrix.invert(matrix);
        return matrix;
    }

    /* JADX INFO: renamed from: D */
    public static void m41943D(Collection<AbstractC5952w2> collection) {
        Iterator<AbstractC5952w2> it = collection.iterator();
        while (it.hasNext()) {
            it.next().m26690Y(null);
        }
    }

    /* JADX INFO: renamed from: I */
    public static InterfaceC8771i4<?> m41944I(InterfaceC8777j4 interfaceC8777j4, C1196g c1196g) {
        InterfaceC8771i4<?> interfaceC8771i4Mo6673m = new C5864a2.a().m26298f().mo6673m(false, interfaceC8777j4);
        if (interfaceC8771i4Mo6673m == null) {
            return null;
        }
        C8846x2 c8846x2M35506l0 = C8846x2.m35506l0(interfaceC8771i4Mo6673m);
        c8846x2M35506l0.m35507m0(InterfaceC11156q.f39401N);
        return c1196g.mo6658D(c8846x2M35506l0).mo6688e();
    }

    /* JADX INFO: renamed from: K */
    private int m41945K() {
        synchronized (this.f39365m) {
            try {
                return this.f39359g.mo23116e() == 2 ? 1 : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public static Map<AbstractC5952w2, b> m41946L(Collection<AbstractC5952w2> collection, InterfaceC8777j4 interfaceC8777j4, InterfaceC8777j4 interfaceC8777j5, int i10, Range<Integer> range) {
        HashMap map = new HashMap();
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            map.put(abstractC5952w2, new b(C1196g.m6646A0(abstractC5952w2) ? m41944I(interfaceC8777j4, (C1196g) abstractC5952w2) : abstractC5952w2.mo6673m(false, interfaceC8777j4), m41966v(abstractC5952w2, abstractC5952w2.mo6673m(true, interfaceC8777j5), i10, range)));
        }
        return map;
    }

    /* JADX INFO: renamed from: Q */
    public static boolean m41947Q(AbstractC8827t3 abstractC8827t3, C8802o3 c8802o3) {
        InterfaceC8795n1 interfaceC8795n1Mo35393d = abstractC8827t3.mo35393d();
        InterfaceC8795n1 interfaceC8795n1M35301g = c8802o3.m35301g();
        Objects.requireNonNull(interfaceC8795n1Mo35393d);
        if (interfaceC8795n1Mo35393d.mo35024b().size() != c8802o3.m35301g().mo35024b().size()) {
            return true;
        }
        for (InterfaceC8795n1.a<?> aVar : interfaceC8795n1Mo35393d.mo35024b()) {
            if (!interfaceC8795n1M35301g.mo35023a(aVar) || !Objects.equals(interfaceC8795n1M35301g.mo35027e(aVar), interfaceC8795n1Mo35393d.mo35027e(aVar))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m41948R(Collection<AbstractC5952w2> collection) {
        Iterator<AbstractC5952w2> it = collection.iterator();
        while (it.hasNext()) {
            if (m41956a0(it.next().m26707l().m35143M())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: S */
    public static boolean m41949S(Collection<AbstractC5952w2> collection) {
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            if (m41955Z(abstractC5952w2)) {
                InterfaceC8771i4<?> interfaceC8771i4M26707l = abstractC5952w2.m26707l();
                InterfaceC8795n1.a<?> aVar = C8757g2.f31835U;
                if (interfaceC8771i4M26707l.mo35023a(aVar) && ((Integer) C12637g.m47075g((Integer) interfaceC8771i4M26707l.mo35027e(aVar))).intValue() == 2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T */
    public static boolean m41950T(Collection<AbstractC5952w2> collection) {
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            if (m41955Z(abstractC5952w2)) {
                InterfaceC8771i4<?> interfaceC8771i4M26707l = abstractC5952w2.m26707l();
                InterfaceC8795n1.a<?> aVar = C8757g2.f31835U;
                if (interfaceC8771i4M26707l.mo35023a(aVar) && ((Integer) C12637g.m47075g((Integer) interfaceC8771i4M26707l.mo35027e(aVar))).intValue() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U */
    public static boolean m41951U(Collection<AbstractC5952w2> collection) {
        Iterator<AbstractC5952w2> it = collection.iterator();
        while (it.hasNext()) {
            if (m41959e0(it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public static boolean m41952W(Collection<AbstractC5952w2> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            if (m41957b0(abstractC5952w2) || C1196g.m6646A0(abstractC5952w2)) {
                z10 = true;
            } else if (m41955Z(abstractC5952w2)) {
                z11 = true;
            }
        }
        return z10 && !z11;
    }

    /* JADX INFO: renamed from: X */
    public static boolean m41953X(Collection<AbstractC5952w2> collection) {
        boolean z10 = false;
        boolean z11 = false;
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            if (m41957b0(abstractC5952w2) || C1196g.m6646A0(abstractC5952w2)) {
                z11 = true;
            } else if (m41955Z(abstractC5952w2)) {
                z10 = true;
            }
        }
        return z10 && !z11;
    }

    @SafeVarargs
    /* JADX INFO: renamed from: Y */
    public static boolean m41954Y(List<AbstractC5952w2>... listArr) {
        boolean z10 = false;
        for (List<AbstractC5952w2> list : listArr) {
            Iterator<AbstractC5952w2> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().m26709o() != null) {
                    z10 = true;
                    break;
                }
            }
            if (z10) {
                return z10;
            }
        }
        return z10;
    }

    /* JADX INFO: renamed from: Z */
    public static boolean m41955Z(AbstractC5952w2 abstractC5952w2) {
        return abstractC5952w2 instanceof C5883f1;
    }

    /* JADX INFO: renamed from: a0 */
    public static boolean m41956a0(C5902k0 c5902k0) {
        return (c5902k0.m26516a() == 10) || (c5902k0.m26517b() != 1 && c5902k0.m26517b() != 0);
    }

    /* JADX INFO: renamed from: b0 */
    public static boolean m41957b0(AbstractC5952w2 abstractC5952w2) {
        return abstractC5952w2 instanceof C5864a2;
    }

    /* JADX INFO: renamed from: d0 */
    public static boolean m41958d0(Collection<AbstractC5952w2> collection) {
        int[] iArr = {1, 2, 4};
        HashSet hashSet = new HashSet();
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            for (int i10 = 0; i10 < 3; i10++) {
                int i11 = iArr[i10];
                if (abstractC5952w2.m26679F(i11)) {
                    if (hashSet.contains(Integer.valueOf(i11))) {
                        return false;
                    }
                    hashSet.add(Integer.valueOf(i11));
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e0 */
    public static boolean m41959e0(AbstractC5952w2 abstractC5952w2) {
        if (abstractC5952w2 != null) {
            if (abstractC5952w2.m26707l().mo35023a(InterfaceC8771i4.f31902G)) {
                return abstractC5952w2.m26707l().mo35207X() == InterfaceC8777j4.b.VIDEO_CAPTURE;
            }
            Log.e("CameraUseCaseAdapter", abstractC5952w2 + " UseCase does not have capture type.");
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m41960g(C5948v2 c5948v2) {
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(c5948v2.m26655q().getWidth(), c5948v2.m26655q().getHeight());
        surfaceTexture.detachFromGLContext();
        final Surface surface = new Surface(surfaceTexture);
        c5948v2.m26661w(surface, C10417c.m40081b(), new InterfaceC12631a() { // from class: s0.d
            @Override // p533x2.InterfaceC12631a
            public final void accept(Object obj) {
                C11145f.m41963m(surface, surfaceTexture, (C5948v2.g) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public static void m41961g0(Map<AbstractC5952w2, Set<AbstractC6600b>> map) {
        for (Map.Entry<AbstractC5952w2, Set<AbstractC6600b>> entry : map.entrySet()) {
            entry.getKey().m26690Y(entry.getValue());
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static List<AbstractC5913n> m41962j0(List<AbstractC5913n> list, Collection<AbstractC5952w2> collection) {
        ArrayList arrayList = new ArrayList(list);
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            abstractC5952w2.m26689X(null);
            for (AbstractC5913n abstractC5913n : list) {
                if (abstractC5952w2.m26679F(abstractC5913n.m26545g())) {
                    C12637g.m47078j(abstractC5952w2.m26708n() == null, abstractC5952w2 + " already has effect" + abstractC5952w2.m26708n());
                    abstractC5952w2.m26689X(abstractC5913n);
                    arrayList.remove(abstractC5913n);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m41963m(Surface surface, SurfaceTexture surfaceTexture, C5948v2.g gVar) {
        surface.release();
        surfaceTexture.release();
    }

    /* JADX INFO: renamed from: p0 */
    public static void m41964p0(List<AbstractC5913n> list, Collection<AbstractC5952w2> collection, Collection<AbstractC5952w2> collection2) {
        List<AbstractC5913n> listM41962j0 = m41962j0(list, collection);
        ArrayList arrayList = new ArrayList(collection2);
        arrayList.removeAll(collection);
        List<AbstractC5913n> listM41962j1 = m41962j0(listM41962j0, arrayList);
        if (listM41962j1.isEmpty()) {
            return;
        }
        C5931r1.m26572l("CameraUseCaseAdapter", "Unused effects: " + listM41962j1);
    }

    /* JADX INFO: renamed from: u */
    public static Map<AbstractC5952w2, Set<AbstractC6600b>> m41965u(Collection<AbstractC5952w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        HashMap map = new HashMap();
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            map.put(abstractC5952w2, abstractC5952w2.m26709o());
            abstractC5952w2.m26690Y(resolvedFeatureGroup != null ? resolvedFeatureGroup.m29677a() : null);
        }
        return map;
    }

    /* JADX INFO: renamed from: v */
    public static InterfaceC8771i4<?> m41966v(AbstractC5952w2 abstractC5952w2, InterfaceC8771i4<?> interfaceC8771i4, int i10, Range<Integer> range) {
        C8846x2 c8846x2M35506l0 = interfaceC8771i4 != null ? C8846x2.m35506l0(interfaceC8771i4) : C8846x2.m35505k0();
        c8846x2M35506l0.mo35473G(InterfaceC8771i4.f31897B, Integer.valueOf(i10));
        if (!AbstractC8827t3.f32104a.equals(range)) {
            c8846x2M35506l0.mo35472D(InterfaceC8771i4.f31898C, InterfaceC8795n1.c.HIGH_PRIORITY_REQUIRED, range);
            c8846x2M35506l0.mo35473G(InterfaceC8771i4.f31899D, Boolean.TRUE);
        }
        return abstractC5952w2.mo6658D(c8846x2M35506l0).mo6688e();
    }

    /* JADX INFO: renamed from: z */
    public static Collection<AbstractC5952w2> m41967z(Collection<AbstractC5952w2> collection, AbstractC5952w2 abstractC5952w2, C1196g c1196g) {
        ArrayList arrayList = new ArrayList(collection);
        if (abstractC5952w2 != null) {
            arrayList.add(abstractC5952w2);
        }
        if (c1196g != null) {
            arrayList.add(c1196g);
            arrayList.removeAll(c1196g.m6678s0());
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0049  */
    /* JADX INFO: renamed from: A */
    public final AbstractC5952w2 m41968A(Collection<AbstractC5952w2> collection, C1196g c1196g) {
        AbstractC5952w2 abstractC5952w2M41970E;
        synchronized (this.f39365m) {
            try {
                ArrayList arrayList = new ArrayList(collection);
                if (c1196g != null) {
                    arrayList.add(c1196g);
                    arrayList.removeAll(c1196g.m6678s0());
                }
                if (!m41979V()) {
                    abstractC5952w2M41970E = null;
                } else if (m41953X(arrayList)) {
                    abstractC5952w2M41970E = m41957b0(this.f39368p) ? this.f39368p : m41971F();
                } else if (m41952W(arrayList)) {
                    abstractC5952w2M41970E = m41955Z(this.f39368p) ? this.f39368p : m41970E();
                } else {
                    abstractC5952w2M41970E = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return abstractC5952w2M41970E;
    }

    /* JADX INFO: renamed from: C */
    public final void m41969C(Collection<AbstractC5952w2> collection) {
        if (m41978P()) {
            if (m41948R(collection)) {
                throw new IllegalArgumentException("Extensions are only supported for use with standard dynamic range.");
            }
            if (m41949S(collection)) {
                throw new IllegalArgumentException("Extensions are not supported for use with Raw image capture.");
            }
        }
        synchronized (this.f39365m) {
            try {
                if (!this.f39361i.isEmpty() && (m41950T(collection) || m41949S(collection))) {
                    throw new IllegalArgumentException("Ultra HDR image and Raw capture does not support for use with CameraEffect.");
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final C5883f1 m41970E() {
        return new C5883f1.b().m26412s("ImageCapture-Extra").m26400f();
    }

    /* JADX INFO: renamed from: F */
    public final C5864a2 m41971F() {
        C5864a2 c5864a2M26298f = new C5864a2.a().m26307p("Preview-Extra").m26298f();
        c5864a2M26298f.m26293q0(new C5864a2.c() { // from class: s0.e
            @Override // p140g0.C5864a2.c
            /* JADX INFO: renamed from: a */
            public final void mo2356a(C5948v2 c5948v2) {
                C11145f.m41960g(c5948v2);
            }
        });
        return c5864a2M26298f;
    }

    /* JADX INFO: renamed from: G */
    public final C1196g m41972G(Collection<AbstractC5952w2> collection, boolean z10) {
        synchronized (this.f39365m) {
            try {
                Set<AbstractC5952w2> setM41976N = m41976N(collection, z10);
                if (setM41976N.size() >= 2 || (m41978P() && m41951U(setM41976N))) {
                    C1196g c1196g = this.f39369q;
                    if (c1196g == null || !c1196g.m6678s0().equals(setM41976N)) {
                        if (!m41958d0(setM41976N)) {
                            return null;
                        }
                        return new C1196g(this.f39353a, this.f39354b, this.f39370r, this.f39371s, setM41976N, this.f39355c);
                    }
                    this.f39369q.m6661F0(setM41976N);
                    C1196g c1196g2 = this.f39369q;
                    Objects.requireNonNull(c1196g2);
                    return c1196g2;
                }
                return null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public void m41973H() {
        synchronized (this.f39365m) {
            try {
                if (this.f39366n) {
                    this.f39353a.mo6697j(new ArrayList(this.f39358f));
                    C8748f c8748f = this.f39354b;
                    if (c8748f != null) {
                        c8748f.mo6697j(new ArrayList(this.f39358f));
                    }
                    m41995x();
                    this.f39366n = false;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: J */
    public C5933s m41974J() {
        return this.f39356d;
    }

    /* JADX INFO: renamed from: M */
    public final int m41975M(boolean z10) {
        int iM26545g;
        synchronized (this.f39365m) {
            try {
                Iterator<AbstractC5913n> it = this.f39361i.iterator();
                AbstractC5913n abstractC5913n = null;
                while (true) {
                    iM26545g = 0;
                    if (!it.hasNext()) {
                        break;
                    }
                    AbstractC5913n next = it.next();
                    if (C12626z0.m47045d(next.m26545g()) > 1) {
                        C12637g.m47078j(abstractC5913n == null, "Can only have one sharing effect.");
                        abstractC5913n = next;
                    }
                }
                if (abstractC5913n != null) {
                    iM26545g = abstractC5913n.m26545g();
                }
                if (z10) {
                    iM26545g |= 3;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iM26545g;
    }

    /* JADX INFO: renamed from: N */
    public final Set<AbstractC5952w2> m41976N(Collection<AbstractC5952w2> collection, boolean z10) {
        HashSet hashSet = new HashSet();
        int iM41975M = m41975M(z10);
        for (AbstractC5952w2 abstractC5952w2 : collection) {
            C12637g.m47070b(!C1196g.m6646A0(abstractC5952w2), "Only support one level of sharing for now.");
            if (abstractC5952w2.m26679F(iM41975M)) {
                hashSet.add(abstractC5952w2);
            }
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: O */
    public List<AbstractC5952w2> m41977O() {
        ArrayList arrayList;
        synchronized (this.f39365m) {
            arrayList = new ArrayList(this.f39357e);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public final boolean m41978P() {
        boolean z10;
        synchronized (this.f39365m) {
            z10 = this.f39364l.m35139w(null) != null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: V */
    public final boolean m41979V() {
        boolean z10;
        synchronized (this.f39365m) {
            z10 = true;
            if (this.f39364l.m35138v() != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // p140g0.InterfaceC5905l
    /* JADX INFO: renamed from: c */
    public InterfaceC5909m mo22073c() {
        return this.f39353a.mo22073c();
    }

    /* JADX INFO: renamed from: c0 */
    public final boolean m41980c0() {
        return (m41978P() || this.f39354b != null || this.f39362j == 1) ? false : true;
    }

    @Override // p140g0.InterfaceC5905l
    /* JADX INFO: renamed from: d */
    public InterfaceC5937t mo22074d() {
        return this.f39353a.mo22074d();
    }

    /* JADX INFO: renamed from: f0 */
    public void m41981f0(Collection<AbstractC5952w2> collection) {
        synchronized (this.f39365m) {
            m41943D(collection);
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f39357e);
            linkedHashSet.removeAll(collection);
            m41992s(m41996y(linkedHashSet, this.f39354b != null, false));
        }
    }

    /* JADX INFO: renamed from: h */
    public void m41982h(boolean z10) {
        this.f39353a.mo35083h(z10);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m41983h0() {
        synchronized (this.f39365m) {
            try {
                if (this.f39367o != null) {
                    this.f39353a.mo6694e().mo35017l(this.f39367o);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: i0 */
    public void m41984i0(List<AbstractC5913n> list) {
        synchronized (this.f39365m) {
            this.f39361i = list;
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m41985k0(Range<Integer> range) {
        synchronized (this.f39365m) {
            this.f39363k = range;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public void m41986l0(int i10) {
        synchronized (this.f39365m) {
            this.f39362j = i10;
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m41987m0(C5960y2 c5960y2) {
        synchronized (this.f39365m) {
            this.f39360h = c5960y2;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m41988n(Collection<AbstractC5952w2> collection, ResolvedFeatureGroup resolvedFeatureGroup) {
        C5931r1.m26561a("CameraUseCaseAdapter", "addUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f39365m) {
            try {
                m41993t();
                LinkedHashSet linkedHashSet = new LinkedHashSet(this.f39357e);
                linkedHashSet.addAll(collection);
                Map<AbstractC5952w2, Set<AbstractC6600b>> mapM41965u = m41965u(linkedHashSet, resolvedFeatureGroup);
                try {
                    m41992s(m41996y(linkedHashSet, this.f39354b != null, false));
                } catch (IllegalArgumentException e10) {
                    m41961g0(mapM41965u);
                    throw new a(e10);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public final boolean m41989n0(Collection<AbstractC5952w2> collection) {
        if (m41978P() && m41951U(collection)) {
            return true;
        }
        return this.f39372t.m44744a(this.f39353a.mo6698k().mo6750e(), collection);
    }

    /* JADX INFO: renamed from: o0 */
    public CalculatedUseCaseInfo m41990o0(Collection<AbstractC5952w2> collection, ResolvedFeatureGroup resolvedFeatureGroup, boolean z10) {
        CalculatedUseCaseInfo calculatedUseCaseInfoM41996y;
        C5931r1.m26561a("CameraUseCaseAdapter", "simulateAddUseCases: appUseCasesToAdd = " + collection + ", featureGroup = " + resolvedFeatureGroup);
        synchronized (this.f39365m) {
            m41993t();
            LinkedHashSet linkedHashSet = new LinkedHashSet(this.f39357e);
            linkedHashSet.addAll(collection);
            Map<AbstractC5952w2, Set<AbstractC6600b>> mapM41965u = m41965u(linkedHashSet, resolvedFeatureGroup);
            try {
                try {
                    calculatedUseCaseInfoM41996y = m41996y(linkedHashSet, this.f39354b != null, z10);
                    m41961g0(mapM41965u);
                } catch (IllegalArgumentException e10) {
                    throw new a(e10);
                }
            } catch (Throwable th2) {
                m41961g0(mapM41965u);
                throw th2;
            }
        }
        return calculatedUseCaseInfoM41996y;
    }

    /* JADX INFO: renamed from: q0 */
    public final void m41991q0(Map<AbstractC5952w2, AbstractC8827t3> map, Collection<AbstractC5952w2> collection) {
        Map<AbstractC5952w2, AbstractC8827t3> map2;
        synchronized (this.f39365m) {
            try {
                if (this.f39360h == null || collection.isEmpty()) {
                    map2 = map;
                } else {
                    map2 = map;
                    Map<AbstractC5952w2, Rect> mapM42047a = C11158s.m42047a(this.f39353a.mo6698k().mo35046h(), this.f39353a.mo6698k().mo26583i() == 0, this.f39360h.m26751a(), this.f39353a.mo6698k().mo6751w(this.f39360h.m26753c()), this.f39360h.m26754d(), this.f39360h.m26752b(), map2);
                    for (AbstractC5952w2 abstractC5952w2 : collection) {
                        abstractC5952w2.mo24396b0((Rect) C12637g.m47075g(mapM42047a.get(abstractC5952w2)));
                    }
                }
                for (AbstractC5952w2 abstractC5952w3 : collection) {
                    abstractC5952w3.mo26591Z(m41942B(this.f39353a.mo6698k().mo35046h(), ((AbstractC8827t3) C12637g.m47075g(map2.get(abstractC5952w3))).mo35395f()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m41992s(CalculatedUseCaseInfo calculatedUseCaseInfo) {
        m41991q0(calculatedUseCaseInfo.getPrimaryStreamSpecResult().m42014b(), calculatedUseCaseInfo.m41932b());
        m41964p0(this.f39361i, calculatedUseCaseInfo.m41932b(), calculatedUseCaseInfo.m41931a());
        Iterator<AbstractC5952w2> it = calculatedUseCaseInfo.m41934d().iterator();
        while (it.hasNext()) {
            it.next().m26695c0(this.f39353a);
        }
        this.f39353a.mo6697j(calculatedUseCaseInfo.m41934d());
        if (this.f39354b != null) {
            for (AbstractC5952w2 abstractC5952w2 : calculatedUseCaseInfo.m41934d()) {
                C8748f c8748f = this.f39354b;
                Objects.requireNonNull(c8748f);
                abstractC5952w2.m26695c0(c8748f);
            }
            C8748f c8748f2 = this.f39354b;
            Objects.requireNonNull(c8748f2);
            c8748f2.mo6697j(calculatedUseCaseInfo.m41934d());
        }
        if (calculatedUseCaseInfo.m41934d().isEmpty()) {
            for (AbstractC5952w2 abstractC5952w3 : calculatedUseCaseInfo.m41935e()) {
                Map<AbstractC5952w2, AbstractC8827t3> mapM42014b = calculatedUseCaseInfo.getPrimaryStreamSpecResult().m42014b();
                if (mapM42014b.containsKey(abstractC5952w3)) {
                    AbstractC8827t3 abstractC8827t3 = mapM42014b.get(abstractC5952w3);
                    Objects.requireNonNull(abstractC8827t3);
                    InterfaceC8795n1 interfaceC8795n1Mo35393d = abstractC8827t3.mo35393d();
                    if (interfaceC8795n1Mo35393d != null && m41947Q(abstractC8827t3, abstractC5952w3.m26720z())) {
                        abstractC5952w3.m26701f0(interfaceC8795n1Mo35393d);
                        if (this.f39366n) {
                            this.f39353a.mo6695g(abstractC5952w3);
                            C8748f c8748f3 = this.f39354b;
                            if (c8748f3 != null) {
                                Objects.requireNonNull(c8748f3);
                                c8748f3.mo6695g(abstractC5952w3);
                            }
                        }
                    }
                }
            }
        }
        for (AbstractC5952w2 abstractC5952w4 : calculatedUseCaseInfo.m41933c()) {
            b bVar = calculatedUseCaseInfo.m41940j().get(abstractC5952w4);
            Objects.requireNonNull(bVar);
            C8748f c8748f4 = this.f39354b;
            if (c8748f4 != null) {
                C8748f c8748f5 = this.f39353a;
                Objects.requireNonNull(c8748f4);
                abstractC5952w4.m26696d(c8748f5, c8748f4, bVar.f39374a, bVar.f39375b);
                abstractC5952w4.m26699e0((AbstractC8827t3) C12637g.m47075g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().m42014b().get(abstractC5952w4)), ((StreamSpecQueryResult) C12637g.m47075g(calculatedUseCaseInfo.getSecondaryStreamSpecResult())).m42014b().get(abstractC5952w4));
            } else {
                abstractC5952w4.m26696d(this.f39353a, null, bVar.f39374a, bVar.f39375b);
                abstractC5952w4.m26699e0((AbstractC8827t3) C12637g.m47075g(calculatedUseCaseInfo.getPrimaryStreamSpecResult().m42014b().get(abstractC5952w4)), null);
            }
        }
        if (this.f39366n) {
            this.f39353a.mo6696i(calculatedUseCaseInfo.m41933c());
            C8748f c8748f6 = this.f39354b;
            if (c8748f6 != null) {
                Objects.requireNonNull(c8748f6);
                c8748f6.mo6696i(calculatedUseCaseInfo.m41933c());
            }
        }
        Iterator<AbstractC5952w2> it2 = calculatedUseCaseInfo.m41933c().iterator();
        while (it2.hasNext()) {
            it2.next().m26686M();
        }
        this.f39357e.clear();
        this.f39357e.addAll(calculatedUseCaseInfo.m41931a());
        this.f39358f.clear();
        this.f39358f.addAll(calculatedUseCaseInfo.m41932b());
        this.f39368p = calculatedUseCaseInfo.getPlaceholderForExtensions();
        this.f39369q = calculatedUseCaseInfo.getStreamSharing();
    }

    /* JADX INFO: renamed from: t */
    public final void m41993t() {
        this.f39353a.mo35085o(this.f39364l);
        C8748f c8748f = this.f39354b;
        if (c8748f != null) {
            c8748f.mo35085o(this.f39364l);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m41994w() {
        synchronized (this.f39365m) {
            try {
                if (!this.f39366n) {
                    if (!this.f39358f.isEmpty()) {
                        this.f39353a.mo35085o(this.f39364l);
                        C8748f c8748f = this.f39354b;
                        if (c8748f != null) {
                            c8748f.mo35085o(this.f39364l);
                        }
                    }
                    this.f39353a.mo6696i(this.f39358f);
                    C8748f c8748f2 = this.f39354b;
                    if (c8748f2 != null) {
                        c8748f2.mo6696i(this.f39358f);
                    }
                    m41983h0();
                    Iterator<AbstractC5952w2> it = this.f39358f.iterator();
                    while (it.hasNext()) {
                        it.next().m26686M();
                    }
                    this.f39366n = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m41995x() {
        synchronized (this.f39365m) {
            InterfaceC8784l0 interfaceC8784l0Mo6694e = this.f39353a.mo6694e();
            this.f39367o = interfaceC8784l0Mo6694e.mo35015j();
            interfaceC8784l0Mo6694e.mo35019n();
        }
    }

    /* JADX INFO: renamed from: y */
    public final CalculatedUseCaseInfo m41996y(Collection<AbstractC5952w2> collection, boolean z10, boolean z11) {
        StreamSpecQueryResult c11151lMo42015a;
        boolean z12 = z11;
        m41969C(collection);
        if (!z10 && m41989n0(collection)) {
            return m41996y(collection, true, z12);
        }
        C1196g c1196gM41972G = m41972G(collection, z10);
        AbstractC5952w2 abstractC5952w2M41968A = m41968A(collection, c1196gM41972G);
        Collection<AbstractC5952w2> collectionM41967z = m41967z(collection, abstractC5952w2M41968A, c1196gM41972G);
        ArrayList arrayList = new ArrayList(collectionM41967z);
        arrayList.removeAll(this.f39358f);
        ArrayList arrayList2 = new ArrayList(collectionM41967z);
        arrayList2.retainAll(this.f39358f);
        ArrayList arrayList3 = new ArrayList(this.f39358f);
        arrayList3.removeAll(collectionM41967z);
        Map<AbstractC5952w2, b> mapM41946L = m41946L(arrayList, this.f39364l.m35137k(), this.f39355c, this.f39362j, this.f39363k);
        boolean zM41954Y = m41954Y(arrayList, arrayList2);
        try {
            StreamSpecQueryResult c11151lMo42015a2 = this.f39373u.mo42015a(m41945K(), this.f39353a.mo6698k(), arrayList, arrayList2, this.f39364l, this.f39362j, this.f39363k, zM41954Y, z12);
            try {
                if (this.f39354b != null) {
                    InterfaceC11152m interfaceC11152m = this.f39373u;
                    int iM41945K = m41945K();
                    C8748f c8748f = this.f39354b;
                    Objects.requireNonNull(c8748f);
                    z12 = z11;
                    c11151lMo42015a = interfaceC11152m.mo42015a(iM41945K, c8748f.mo6698k(), arrayList, arrayList2, this.f39364l, this.f39362j, this.f39363k, zM41954Y, z12);
                } else {
                    c11151lMo42015a = null;
                }
                return new CalculatedUseCaseInfo(collection, collectionM41967z, arrayList, arrayList2, arrayList3, c1196gM41972G, abstractC5952w2M41968A, mapM41946L, c11151lMo42015a2, c11151lMo42015a);
            } catch (IllegalArgumentException e10) {
                e = e10;
                z12 = z11;
                if (z10 || !m41980c0()) {
                    throw e;
                }
                return m41996y(collection, true, z12);
            }
        } catch (IllegalArgumentException e11) {
            e = e11;
        }
    }
}
