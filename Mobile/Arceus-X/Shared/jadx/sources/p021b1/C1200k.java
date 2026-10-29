package p021b1;

import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p140g0.AbstractC5952w2;
import p140g0.C5864a2;
import p140g0.C5883f1;
import p140g0.C5902k0;
import p140g0.C5931r1;
import p296n0.AbstractC8827t3;
import p296n0.AbstractC8828u;
import p296n0.AbstractC8830u1;
import p296n0.C8802o3;
import p296n0.InterfaceC8743e0;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8841w2;
import p347p0.C10085a0;
import p347p0.C10110z;
import p531x0.C12602n0;
import p533x2.C12637g;
import p562y0.AbstractC12980d;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: b1.k */
/* JADX INFO: loaded from: classes.dex */
public class C1200k implements AbstractC5952w2.c {

    /* JADX INFO: renamed from: a */
    public final Set<AbstractC5952w2> f4988a;

    /* JADX INFO: renamed from: e */
    public final InterfaceC8777j4 f4992e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC8804p0 f4993f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC8804p0 f4994g;

    /* JADX INFO: renamed from: i */
    public final Set<InterfaceC8771i4<?>> f4996i;

    /* JADX INFO: renamed from: j */
    public final Map<AbstractC5952w2, InterfaceC8771i4<?>> f4997j;

    /* JADX INFO: renamed from: k */
    public final C1192c f4998k;

    /* JADX INFO: renamed from: l */
    public C1192c f4999l;

    /* JADX INFO: renamed from: b */
    public final Map<AbstractC5952w2, C12602n0> f4989b = new HashMap();

    /* JADX INFO: renamed from: c */
    public final Map<AbstractC5952w2, C1199j> f4990c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final Map<AbstractC5952w2, Boolean> f4991d = new HashMap();

    /* JADX INFO: renamed from: h */
    public final AbstractC8828u f4995h = m6731v();

    /* JADX INFO: renamed from: b1.k$a */
    public static class a extends AbstractC8828u {

        /* JADX INFO: renamed from: a */
        public final WeakReference<C1200k> f5000a;

        public a(C1200k c1200k) {
            this.f5000a = new WeakReference<>(c1200k);
        }

        @Override // p296n0.AbstractC8828u
        /* JADX INFO: renamed from: b */
        public void mo2221b(int i10, InterfaceC8743e0 interfaceC8743e0) {
            C1200k c1200k = this.f5000a.get();
            if (c1200k != null) {
                Iterator<AbstractC5952w2> it = c1200k.f4988a.iterator();
                while (it.hasNext()) {
                    C1200k.m6709S(interfaceC8743e0, it.next().m26720z(), i10);
                }
            }
        }
    }

    public C1200k(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, Set<AbstractC5952w2> set, InterfaceC8777j4 interfaceC8777j4, C1196g.a aVar) {
        this.f4993f = interfaceC8804p0;
        this.f4994g = interfaceC8804p1;
        this.f4992e = interfaceC8777j4;
        this.f4988a = set;
        Map<AbstractC5952w2, InterfaceC8771i4<?>> mapM6710U = m6710U(interfaceC8804p0, set, interfaceC8777j4);
        this.f4997j = mapM6710U;
        HashSet hashSet = new HashSet(mapM6710U.values());
        this.f4996i = hashSet;
        this.f4998k = new C1192c(interfaceC8804p0, hashSet);
        if (interfaceC8804p1 != null) {
            this.f4999l = new C1192c(interfaceC8804p1, hashSet);
        }
        for (AbstractC5952w2 abstractC5952w2 : set) {
            this.f4991d.put(abstractC5952w2, Boolean.FALSE);
            this.f4990c.put(abstractC5952w2, new C1199j(interfaceC8804p0, this, aVar));
        }
    }

    /* JADX INFO: renamed from: A */
    public static AbstractC8827t3 m6704A(AbstractC5952w2 abstractC5952w2, AbstractC8827t3 abstractC8827t3, Map<AbstractC5952w2, Size> map) {
        AbstractC8827t3.a aVarMo35398i = abstractC8827t3.mo35398i();
        Size size = map.get(abstractC5952w2);
        if (size != null) {
            aVarMo35398i.mo35403e(size);
        }
        return aVarMo35398i.mo35399a();
    }

    /* JADX INFO: renamed from: B */
    public static AbstractC8830u1 m6705B(AbstractC5952w2 abstractC5952w2) {
        List<AbstractC8830u1> listM35310p = abstractC5952w2 instanceof C5883f1 ? abstractC5952w2.m26720z().m35310p() : abstractC5952w2.m26720z().m35306l().m35246i();
        C12637g.m47077i(listM35310p.size() <= 1);
        if (listM35310p.size() == 1) {
            return listM35310p.get(0);
        }
        return null;
    }

    /* JADX INFO: renamed from: C */
    public static int m6706C(AbstractC5952w2 abstractC5952w2) {
        if (abstractC5952w2 instanceof C5864a2) {
            return 1;
        }
        return abstractC5952w2 instanceof C5883f1 ? 4 : 2;
    }

    /* JADX INFO: renamed from: G */
    public static int m6707G(Set<InterfaceC8771i4<?>> set) {
        Iterator<InterfaceC8771i4<?>> it = set.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().m35199B(0));
        }
        return iMax;
    }

    /* JADX DEBUG: Type inference failed for r3v4. Raw type applied. Possible types: android.util.Range<T extends java.lang.Comparable<? super T>>, android.util.Range<java.lang.Integer> */
    /* JADX INFO: renamed from: R */
    public static Range<Integer> m6708R(Set<InterfaceC8771i4<?>> set) {
        Range<Integer> rangeIntersect = AbstractC8827t3.f32104a;
        Iterator<InterfaceC8771i4<?>> it = set.iterator();
        while (it.hasNext()) {
            Range<Integer> rangeM35215z = it.next().m35215z(rangeIntersect);
            Objects.requireNonNull(rangeM35215z);
            if (AbstractC8827t3.f32104a.equals(rangeIntersect)) {
                rangeIntersect = rangeM35215z;
            } else {
                try {
                    rangeIntersect = rangeIntersect.intersect(rangeM35215z);
                } catch (IllegalArgumentException unused) {
                    C5931r1.m26561a("VirtualCameraAdapter", "No intersected frame rate can be found from the target frame rate settings of the UseCases! Resolved: " + rangeIntersect + " <<>> " + rangeM35215z);
                    return rangeIntersect.extend(rangeM35215z);
                }
            }
        }
        return rangeIntersect;
    }

    /* JADX INFO: renamed from: S */
    public static void m6709S(InterfaceC8743e0 interfaceC8743e0, C8802o3 c8802o3, int i10) {
        Iterator<AbstractC8828u> it = c8802o3.m35305k().iterator();
        while (it.hasNext()) {
            it.next().mo2221b(i10, new C1201l(c8802o3.m35306l().m35247j(), interfaceC8743e0));
        }
    }

    /* JADX INFO: renamed from: U */
    public static Map<AbstractC5952w2, InterfaceC8771i4<?>> m6710U(InterfaceC8804p0 interfaceC8804p0, Set<AbstractC5952w2> set, InterfaceC8777j4 interfaceC8777j4) {
        HashMap map = new HashMap();
        for (AbstractC5952w2 abstractC5952w2 : set) {
            map.put(abstractC5952w2, abstractC5952w2.m26682I(interfaceC8804p0.mo6698k(), null, abstractC5952w2.mo6673m(true, interfaceC8777j4)));
        }
        return map;
    }

    /* JADX INFO: renamed from: w */
    public static void m6711w(C12602n0 c12602n0, AbstractC8830u1 abstractC8830u1, C8802o3 c8802o3) {
        c12602n0.m46964v();
        try {
            c12602n0.m46967y(abstractC8830u1);
        } catch (AbstractC8830u1.a unused) {
            if (c8802o3.m35299d() != null) {
                c8802o3.m35299d().mo6644a(c8802o3, C8802o3.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
            }
        }
    }

    /* JADX INFO: renamed from: x */
    public static int m6712x(AbstractC5952w2 abstractC5952w2) {
        return abstractC5952w2 instanceof C5883f1 ? 256 : 34;
    }

    /* JADX INFO: renamed from: D */
    public Set<AbstractC5952w2> m6713D() {
        return this.f4988a;
    }

    /* JADX INFO: renamed from: E */
    public Map<AbstractC5952w2, AbstractC13677f> m6714E(C12602n0 c12602n0, int i10, boolean z10, boolean z11) {
        HashMap map = new HashMap();
        for (AbstractC5952w2 abstractC5952w2 : this.f4988a) {
            C12602n0 c12602n1 = c12602n0;
            AbstractC13677f abstractC13677fM6730u = m6730u(abstractC5952w2, this.f4998k, this.f4993f, c12602n1, i10, z10, z11);
            m6728W(abstractC5952w2);
            map.put(abstractC5952w2, abstractC13677fM6730u);
            c12602n0 = c12602n1;
        }
        return map;
    }

    /* JADX INFO: renamed from: F */
    public Map<AbstractC5952w2, AbstractC12980d> m6715F(C12602n0 c12602n0, C12602n0 c12602n1, int i10, boolean z10) {
        HashMap map = new HashMap();
        for (AbstractC5952w2 abstractC5952w2 : this.f4988a) {
            C12602n0 c12602n2 = c12602n0;
            int i11 = i10;
            boolean z11 = z10;
            AbstractC13677f abstractC13677fM6730u = m6730u(abstractC5952w2, this.f4998k, this.f4993f, c12602n2, i11, z11, false);
            C1192c c1192c = this.f4999l;
            Objects.requireNonNull(c1192c);
            InterfaceC8804p0 interfaceC8804p0 = this.f4994g;
            Objects.requireNonNull(interfaceC8804p0);
            C12602n0 c12602n3 = c12602n1;
            AbstractC13677f abstractC13677fM6730u2 = m6730u(abstractC5952w2, c1192c, interfaceC8804p0, c12602n3, i11, z11, false);
            m6728W(abstractC5952w2);
            map.put(abstractC5952w2, AbstractC12980d.m48261c(abstractC13677fM6730u, abstractC13677fM6730u2));
            c12602n0 = c12602n2;
            c12602n1 = c12602n3;
            i10 = i11;
            z10 = z11;
        }
        return map;
    }

    /* JADX INFO: renamed from: H */
    public AbstractC8828u m6716H() {
        return this.f4995h;
    }

    /* JADX INFO: renamed from: I */
    public final C5864a2 m6717I() {
        for (AbstractC5952w2 abstractC5952w2 : this.f4988a) {
            if (abstractC5952w2 instanceof C5864a2) {
                return (C5864a2) abstractC5952w2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public Map<AbstractC5952w2, Size> m6718J(C12602n0 c12602n0, boolean z10) {
        HashMap map = new HashMap();
        for (AbstractC5952w2 abstractC5952w2 : this.f4988a) {
            C1192c c1192c = this.f4998k;
            InterfaceC8771i4<?> interfaceC8771i4 = this.f4997j.get(abstractC5952w2);
            Objects.requireNonNull(interfaceC8771i4);
            PreferredChildSize preferredChildSizeM6637r = c1192c.m6637r(interfaceC8771i4, c12602n0.m46956n(), C10085a0.m38879g(c12602n0.m46960r()), z10);
            map.put(abstractC5952w2, preferredChildSizeM6637r.getOriginalSelectedChildSize());
            C5931r1.m26561a("VirtualCameraAdapter", "Selected child size: " + preferredChildSizeM6637r.getOriginalSelectedChildSize() + ", useCase: " + abstractC5952w2);
        }
        return map;
    }

    /* JADX INFO: renamed from: K */
    public final C12602n0 m6719K(AbstractC5952w2 abstractC5952w2) {
        C12602n0 c12602n0 = this.f4989b.get(abstractC5952w2);
        Objects.requireNonNull(c12602n0);
        return c12602n0;
    }

    /* JADX INFO: renamed from: L */
    public final boolean m6720L(AbstractC5952w2 abstractC5952w2) {
        Boolean bool = this.f4991d.get(abstractC5952w2);
        Objects.requireNonNull(bool);
        return bool.booleanValue();
    }

    /* JADX INFO: renamed from: M */
    public void m6721M(InterfaceC8841w2 interfaceC8841w2) {
        interfaceC8841w2.mo35473G(InterfaceC8769i2.f31891v, this.f4998k.m6635o(interfaceC8841w2));
        interfaceC8841w2.mo35473G(InterfaceC8771i4.f31896A, Integer.valueOf(m6707G(this.f4996i)));
        C5902k0 c5902k0M6597d = C1190a.m6597d(this.f4996i);
        if (c5902k0M6597d == null) {
            throw new IllegalArgumentException("Failed to merge child dynamic ranges, can not find a dynamic range that satisfies all children.");
        }
        interfaceC8841w2.mo35473G(InterfaceC8763h2.f31865l, c5902k0M6597d);
        interfaceC8841w2.mo35473G(InterfaceC8771i4.f31898C, m6708R(this.f4996i));
        Iterator<AbstractC5952w2> it = this.f4988a.iterator();
        while (it.hasNext()) {
            InterfaceC8771i4<?> interfaceC8771i4 = this.f4997j.get(it.next());
            Objects.requireNonNull(interfaceC8771i4);
            InterfaceC8771i4<?> interfaceC8771i5 = interfaceC8771i4;
            if (interfaceC8771i5.m35214x() != 0) {
                interfaceC8841w2.mo35473G(InterfaceC8771i4.f31904I, Integer.valueOf(interfaceC8771i5.m35214x()));
            }
            if (interfaceC8771i5.m35200E() != 0) {
                interfaceC8841w2.mo35473G(InterfaceC8771i4.f31903H, Integer.valueOf(interfaceC8771i5.m35200E()));
            }
        }
    }

    /* JADX INFO: renamed from: N */
    public void m6722N() {
        Iterator<AbstractC5952w2> it = this.f4988a.iterator();
        while (it.hasNext()) {
            it.next().mo6663P();
        }
    }

    /* JADX INFO: renamed from: O */
    public void m6723O() {
        Iterator<AbstractC5952w2> it = this.f4988a.iterator();
        while (it.hasNext()) {
            it.next().mo6665R();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m6724P() {
        Iterator<AbstractC5952w2> it = this.f4988a.iterator();
        while (it.hasNext()) {
            it.next().mo6666S();
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m6725Q() {
        C10110z.m39008b();
        Iterator<AbstractC5952w2> it = this.f4988a.iterator();
        while (it.hasNext()) {
            mo6700n(it.next());
        }
    }

    /* JADX INFO: renamed from: T */
    public void m6726T(Map<AbstractC5952w2, C12602n0> map, Map<AbstractC5952w2, Size> map2) {
        this.f4989b.clear();
        this.f4989b.putAll(map);
        for (Map.Entry<AbstractC5952w2, C12602n0> entry : this.f4989b.entrySet()) {
            AbstractC5952w2 key = entry.getKey();
            C12602n0 value = entry.getValue();
            key.mo24396b0(value.m46956n());
            key.mo26591Z(value.m46960r());
            key.m26699e0(m6704A(key, value.m46961s(), map2), null);
            key.m26686M();
        }
    }

    /* JADX INFO: renamed from: V */
    public void m6727V() {
        for (AbstractC5952w2 abstractC5952w2 : this.f4988a) {
            C1199j c1199j = this.f4990c.get(abstractC5952w2);
            Objects.requireNonNull(c1199j);
            abstractC5952w2.m26695c0(c1199j);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m6728W(AbstractC5952w2 abstractC5952w2) {
        int iM6733z = m6733z(abstractC5952w2, this.f4993f);
        C1199j c1199j = this.f4990c.get(abstractC5952w2);
        Objects.requireNonNull(c1199j);
        c1199j.m6703t(iM6733z);
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: g */
    public void mo6695g(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        if (m6720L(abstractC5952w2)) {
            C12602n0 c12602n0M6719K = m6719K(abstractC5952w2);
            AbstractC8830u1 abstractC8830u1M6705B = m6705B(abstractC5952w2);
            if (abstractC8830u1M6705B != null) {
                m6711w(c12602n0M6719K, abstractC8830u1M6705B, abstractC5952w2.m26720z());
            } else {
                c12602n0M6719K.m46955m();
            }
        }
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: m */
    public void mo6699m(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        if (m6720L(abstractC5952w2)) {
            this.f4991d.put(abstractC5952w2, Boolean.FALSE);
            m6719K(abstractC5952w2).m46955m();
        }
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: n */
    public void mo6700n(AbstractC5952w2 abstractC5952w2) {
        AbstractC8830u1 abstractC8830u1M6705B;
        C10110z.m39008b();
        C12602n0 c12602n0M6719K = m6719K(abstractC5952w2);
        if (m6720L(abstractC5952w2) && (abstractC8830u1M6705B = m6705B(abstractC5952w2)) != null) {
            m6711w(c12602n0M6719K, abstractC8830u1M6705B, abstractC5952w2.m26720z());
        }
    }

    @Override // p140g0.AbstractC5952w2.c
    /* JADX INFO: renamed from: s */
    public void mo6702s(AbstractC5952w2 abstractC5952w2) {
        C10110z.m39008b();
        if (m6720L(abstractC5952w2)) {
            return;
        }
        this.f4991d.put(abstractC5952w2, Boolean.TRUE);
        AbstractC8830u1 abstractC8830u1M6705B = m6705B(abstractC5952w2);
        if (abstractC8830u1M6705B != null) {
            m6711w(m6719K(abstractC5952w2), abstractC8830u1M6705B, abstractC5952w2.m26720z());
        }
    }

    /* JADX INFO: renamed from: t */
    public void m6729t() {
        for (AbstractC5952w2 abstractC5952w2 : this.f4988a) {
            C1199j c1199j = this.f4990c.get(abstractC5952w2);
            Objects.requireNonNull(c1199j);
            abstractC5952w2.m26696d(c1199j, null, null, abstractC5952w2.mo6673m(true, this.f4992e));
        }
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC13677f m6730u(AbstractC5952w2 abstractC5952w2, C1192c c1192c, InterfaceC8804p0 interfaceC8804p0, C12602n0 c12602n0, int i10, boolean z10, boolean z11) {
        int iMo6751w = interfaceC8804p0.mo22074d().mo6751w(i10);
        boolean zM38884l = C10085a0.m38884l(c12602n0.m46960r());
        InterfaceC8771i4<?> interfaceC8771i4 = this.f4997j.get(abstractC5952w2);
        Objects.requireNonNull(interfaceC8771i4);
        PreferredChildSize preferredChildSizeM6637r = c1192c.m6637r(interfaceC8771i4, c12602n0.m46956n(), C10085a0.m38879g(c12602n0.m46960r()), z10);
        Rect cropRectBeforeScaling = preferredChildSizeM6637r.getCropRectBeforeScaling();
        Size childSizeToScale = preferredChildSizeM6637r.getChildSizeToScale();
        int iM38895w = C10085a0.m38895w((c12602n0.m46959q() + m6733z(abstractC5952w2, interfaceC8804p0)) - iMo6751w);
        return AbstractC13677f.m49903h(m6706C(abstractC5952w2), m6712x(abstractC5952w2), cropRectBeforeScaling, C10085a0.m38889q(childSizeToScale, iM38895w), iM38895w, z11 ? false : abstractC5952w2.m26681H(interfaceC8804p0) ^ zM38884l);
    }

    /* JADX INFO: renamed from: v */
    public AbstractC8828u m6731v() {
        return new a(this);
    }

    /* JADX INFO: renamed from: y */
    public AbstractC12980d m6732y(C12602n0 c12602n0, C12602n0 c12602n1, int i10, boolean z10) {
        C5864a2 c5864a2 = (C5864a2) C12637g.m47075g(m6717I());
        return AbstractC12980d.m48261c(m6730u(c5864a2, this.f4998k, this.f4993f, c12602n0, i10, z10, false), m6730u(c5864a2, this.f4998k, this.f4994g, c12602n1, i10, z10, false));
    }

    /* JADX INFO: renamed from: z */
    public final int m6733z(AbstractC5952w2 abstractC5952w2, InterfaceC8804p0 interfaceC8804p0) {
        return interfaceC8804p0.mo22074d().mo6751w(((InterfaceC8769i2) abstractC5952w2.m26707l()).m35185J(0));
    }
}
