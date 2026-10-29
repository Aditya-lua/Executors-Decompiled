package p021b1;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Log;
import android.util.Size;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ne.InterfaceFutureC9440x;
import p140g0.AbstractC5913n;
import p140g0.AbstractC5952w2;
import p140g0.C5894i0;
import p140g0.C5902k0;
import p140g0.C5918o0;
import p140g0.C5931r1;
import p296n0.AbstractC8827t3;
import p296n0.C8734c3;
import p296n0.C8802o3;
import p296n0.C8846x2;
import p296n0.EnumC8832u3;
import p296n0.InterfaceC8763h2;
import p296n0.InterfaceC8769i2;
import p296n0.InterfaceC8771i4;
import p296n0.InterfaceC8777j4;
import p296n0.InterfaceC8795n1;
import p296n0.InterfaceC8799o0;
import p296n0.InterfaceC8804p0;
import p296n0.InterfaceC8841w2;
import p347p0.C10085a0;
import p347p0.C10110z;
import p397r0.C10773n;
import p531x0.C12602n0;
import p531x0.C12613t;
import p531x0.C12618v0;
import p533x2.C12637g;
import p562y0.AbstractC12980d;
import p562y0.C12991o;
import p562y0.C12994r;
import p590z0.AbstractC13677f;

/* JADX INFO: renamed from: b1.g */
/* JADX INFO: loaded from: classes.dex */
public class C1196g extends AbstractC5952w2 {

    /* JADX INFO: renamed from: A */
    public C12602n0 f4964A;

    /* JADX INFO: renamed from: B */
    public C12602n0 f4965B;

    /* JADX INFO: renamed from: C */
    public C12602n0 f4966C;

    /* JADX INFO: renamed from: D */
    public C12602n0 f4967D;

    /* JADX INFO: renamed from: E */
    public C12602n0 f4968E;

    /* JADX INFO: renamed from: F */
    public C12602n0 f4969F;

    /* JADX INFO: renamed from: G */
    public C8802o3.b f4970G;

    /* JADX INFO: renamed from: H */
    public C8802o3.b f4971H;

    /* JADX INFO: renamed from: I */
    public C8802o3.c f4972I;

    /* JADX INFO: renamed from: s */
    public final C1198i f4973s;

    /* JADX INFO: renamed from: t */
    public final C1200k f4974t;

    /* JADX INFO: renamed from: u */
    public final C5894i0 f4975u;

    /* JADX INFO: renamed from: v */
    public final C5894i0 f4976v;

    /* JADX INFO: renamed from: w */
    public C12618v0 f4977w;

    /* JADX INFO: renamed from: x */
    public C12618v0 f4978x;

    /* JADX INFO: renamed from: y */
    public C12994r f4979y;

    /* JADX INFO: renamed from: z */
    public C12618v0 f4980z;

    /* JADX INFO: renamed from: b1.g$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        InterfaceFutureC9440x<Void> mo6645a(int i10, int i11);
    }

    public C1196g(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, C5894i0 c5894i0, C5894i0 c5894i1, Set<AbstractC5952w2> set, InterfaceC8777j4 interfaceC8777j4) {
        super(m6653v0(set));
        this.f4973s = m6653v0(set);
        this.f4975u = c5894i0;
        this.f4976v = c5894i1;
        this.f4974t = new C1200k(interfaceC8804p0, interfaceC8804p1, set, interfaceC8777j4, new a() { // from class: b1.f
            @Override // p021b1.C1196g.a
            /* JADX INFO: renamed from: a */
            public final InterfaceFutureC9440x mo6645a(int i10, int i11) {
                return C1196g.m6648h0(this.f4963a, i10, i11);
            }
        });
        m6661F0(set);
    }

    /* JADX INFO: renamed from: A0 */
    public static boolean m6646A0(AbstractC5952w2 abstractC5952w2) {
        return abstractC5952w2 instanceof C1196g;
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m6647g0(C1196g c1196g, String str, String str2, InterfaceC8771i4 interfaceC8771i4, AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4, C8802o3 c8802o3, C8802o3.g gVar) {
        if (c1196g.m26704i() == null) {
            return;
        }
        c1196g.m6649j0();
        c1196g.m26697d0(c1196g.m6674m0(str, str2, interfaceC8771i4, abstractC8827t3, abstractC8827t4));
        c1196g.m26685L();
        c1196g.f4974t.m6725Q();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ InterfaceFutureC9440x m6648h0(C1196g c1196g, int i10, int i11) {
        C12618v0 c12618v0 = c1196g.f4978x;
        return c12618v0 != null ? c12618v0.m47009e().mo46981c(i10, i11) : C10773n.m40991n(new Exception("Failed to take picture: pipeline is not ready."));
    }

    /* JADX INFO: renamed from: j0 */
    private void m6649j0() {
        C8802o3.c cVar = this.f4972I;
        if (cVar != null) {
            cVar.m35341b();
            this.f4972I = null;
        }
        C12602n0 c12602n0 = this.f4964A;
        if (c12602n0 != null) {
            c12602n0.m46951i();
            this.f4964A = null;
        }
        C12602n0 c12602n1 = this.f4965B;
        if (c12602n1 != null) {
            c12602n1.m46951i();
            this.f4965B = null;
        }
        C12602n0 c12602n2 = this.f4966C;
        if (c12602n2 != null) {
            c12602n2.m46951i();
            this.f4966C = null;
        }
        C12602n0 c12602n3 = this.f4967D;
        if (c12602n3 != null) {
            c12602n3.m46951i();
            this.f4967D = null;
        }
        C12602n0 c12602n4 = this.f4968E;
        if (c12602n4 != null) {
            c12602n4.m46951i();
            this.f4968E = null;
        }
        C12602n0 c12602n5 = this.f4969F;
        if (c12602n5 != null) {
            c12602n5.m46951i();
            this.f4969F = null;
        }
        C12618v0 c12618v0 = this.f4978x;
        if (c12618v0 != null) {
            c12618v0.m47010f();
            this.f4978x = null;
        }
        C12994r c12994r = this.f4979y;
        if (c12994r != null) {
            c12994r.m48279d();
            this.f4979y = null;
        }
        C12618v0 c12618v1 = this.f4977w;
        if (c12618v1 != null) {
            c12618v1.m47010f();
            this.f4977w = null;
        }
        C12618v0 c12618v2 = this.f4980z;
        if (c12618v2 != null) {
            c12618v2.m47010f();
            this.f4980z = null;
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static List<InterfaceC8777j4.b> m6650q0(AbstractC5952w2 abstractC5952w2) {
        ArrayList arrayList = new ArrayList();
        if (!m6646A0(abstractC5952w2)) {
            arrayList.add(abstractC5952w2.m26707l().mo35207X());
            return arrayList;
        }
        Iterator<AbstractC5952w2> it = ((C1196g) abstractC5952w2).m6678s0().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().m26707l().mo35207X());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: r0 */
    public static int m6651r0(AbstractC5952w2 abstractC5952w2) {
        return abstractC5952w2.m26707l().m35204S().m35311q();
    }

    /* JADX INFO: renamed from: t0 */
    private Rect m6652t0(Size size) {
        return m26678E() != null ? m26678E() : new Rect(0, 0, size.getWidth(), size.getHeight());
    }

    /* JADX INFO: renamed from: v0 */
    public static C1198i m6653v0(Set<AbstractC5952w2> set) {
        InterfaceC8841w2 interfaceC8841w2Mo6684a = new C1197h().mo6684a();
        interfaceC8841w2Mo6684a.mo35473G(InterfaceC8763h2.f31863j, 34);
        ArrayList arrayList = new ArrayList();
        for (AbstractC5952w2 abstractC5952w2 : set) {
            if (abstractC5952w2.m26707l().mo35023a(InterfaceC8771i4.f31902G)) {
                arrayList.add(abstractC5952w2.m26707l().mo35207X());
            } else {
                Log.e("StreamSharing", "A child does not have capture type.");
            }
        }
        interfaceC8841w2Mo6684a.mo35473G(C1198i.f4982Q, arrayList);
        interfaceC8841w2Mo6684a.mo35473G(InterfaceC8769i2.f31885p, 2);
        interfaceC8841w2Mo6684a.mo35473G(InterfaceC8771i4.f31906K, EnumC8832u3.PREVIEW_VIDEO_STILL);
        return new C1198i(C8734c3.m35022j0(interfaceC8841w2Mo6684a));
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: A */
    public Set<C5902k0> mo6654A(InterfaceC8799o0 interfaceC8799o0) {
        Set<AbstractC5952w2> setM6678s0 = m6678s0();
        HashSet hashSet = null;
        if (setM6678s0.isEmpty()) {
            return null;
        }
        Iterator<AbstractC5952w2> it = setM6678s0.iterator();
        while (it.hasNext()) {
            Set<C5902k0> setMo6654A = it.next().mo6654A(interfaceC8799o0);
            if (setMo6654A != null) {
                if (hashSet == null) {
                    hashSet = new HashSet(setMo6654A);
                } else {
                    hashSet.retainAll(setMo6654A);
                }
            }
        }
        return hashSet;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: B */
    public Set<Integer> mo6655B() {
        HashSet hashSet = new HashSet();
        hashSet.add(3);
        return hashSet;
    }

    /* JADX INFO: renamed from: B0 */
    public final void m6656B0(Size size, C8802o3.b bVar) {
        Iterator<AbstractC5952w2> it = m6678s0().iterator();
        while (it.hasNext()) {
            C8802o3 c8802o3M35331p = C8802o3.b.m35312r(it.next().m26707l(), size).m35331p();
            bVar.m35318c(c8802o3M35331p.m35305k());
            bVar.m35316a(c8802o3M35331p.m35309o());
            bVar.m35319d(c8802o3M35331p.m35307m());
            bVar.m35317b(c8802o3M35331p.m35298c());
            bVar.m35322g(c8802o3M35331p.m35301g());
        }
    }

    /* JADX INFO: renamed from: C0 */
    public final void m6657C0(C8802o3.b bVar) {
        Iterator<AbstractC5952w2> it = m6678s0().iterator();
        int iM35297f = -1;
        while (it.hasNext()) {
            iM35297f = C8802o3.m35297f(iM35297f, m6651r0(it.next()));
        }
        if (iM35297f != -1) {
            bVar.m35314B(iM35297f);
        }
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: D */
    public InterfaceC8771i4.b<?, ?, ?> mo6658D(InterfaceC8795n1 interfaceC8795n1) {
        return new C1197h(C8846x2.m35506l0(interfaceC8795n1));
    }

    /* JADX INFO: renamed from: D0 */
    public final void m6659D0(C12602n0 c12602n0, C12618v0 c12618v0, boolean z10) {
        boolean z11 = m26678E() != null;
        Map<AbstractC5952w2, AbstractC13677f> mapM6714E = this.f4974t.m6714E(c12602n0, m26677C(), z11, z10);
        C12618v0.c cVarM47014j = c12618v0.m47014j(C12618v0.b.m47017c(c12602n0, new ArrayList(mapM6714E.values())));
        HashMap map = new HashMap();
        for (Map.Entry<AbstractC5952w2, AbstractC13677f> entry : mapM6714E.entrySet()) {
            map.put(entry.getKey(), cVarM47014j.get(entry.getValue()));
        }
        this.f4974t.m6726T(map, this.f4974t.m6718J(c12602n0, z11));
    }

    /* JADX INFO: renamed from: E0 */
    public final void m6660E0(C12602n0 c12602n0, C12602n0 c12602n1, C12994r c12994r, AbstractC8827t3 abstractC8827t3) {
        if (m26708n() == null) {
            boolean z10 = m26678E() != null;
            Map<AbstractC5952w2, AbstractC12980d> mapM6715F = this.f4974t.m6715F(c12602n0, c12602n1, m26677C(), z10);
            C12994r.c cVarM48282g = this.f4979y.m48282g(C12994r.b.m48285d(c12602n0, c12602n1, new ArrayList(mapM6715F.values())));
            HashMap map = new HashMap();
            for (Map.Entry<AbstractC5952w2, AbstractC12980d> entry : mapM6715F.entrySet()) {
                map.put(entry.getKey(), cVarM48282g.get(entry.getValue()));
            }
            this.f4974t.m6726T(map, this.f4974t.m6718J(c12602n0, z10));
            return;
        }
        this.f4968E = c12994r.m48282g(C12994r.b.m48285d(c12602n0, c12602n1, Arrays.asList(this.f4974t.m6732y(c12602n0, c12602n1, m26677C(), m26678E() != null)))).values().iterator().next();
        if (m26708n().m26543e() == 1) {
            this.f4969F = this.f4968E;
        } else {
            C12602n0 c12602n2 = this.f4968E;
            Objects.requireNonNull(c12602n2);
            InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
            Objects.requireNonNull(interfaceC8804p0M26704i);
            this.f4969F = m6680w0(c12602n2, interfaceC8804p0M26704i);
        }
        InterfaceC8804p0 interfaceC8804p0M26704i2 = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i2);
        C12618v0 c12618v0M6672l0 = m6672l0(interfaceC8804p0M26704i2, abstractC8827t3);
        this.f4980z = c12618v0M6672l0;
        m6659D0(this.f4969F, c12618v0M6672l0, true);
    }

    /* JADX INFO: renamed from: F0 */
    public void m6661F0(Set<AbstractC5952w2> set) {
        m26690Y(set.iterator().next().m26709o());
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: O */
    public void mo6662O() {
        super.mo6662O();
        this.f4974t.m6729t();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: P */
    public void mo6663P() {
        super.mo6663P();
        this.f4974t.m6722N();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: Q */
    public InterfaceC8771i4<?> mo6664Q(InterfaceC8799o0 interfaceC8799o0, InterfaceC8771i4.b<?, ?, ?> bVar) {
        this.f4974t.m6721M(bVar.mo6684a());
        return bVar.mo6688e();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: R */
    public void mo6665R() {
        super.mo6665R();
        this.f4974t.m6723O();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: S */
    public void mo6666S() {
        super.mo6666S();
        this.f4974t.m6724P();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: T */
    public AbstractC8827t3 mo6667T(InterfaceC8795n1 interfaceC8795n1) {
        this.f4970G.m35322g(interfaceC8795n1);
        m26697d0(C5918o0.m26551a(new Object[]{this.f4970G.m35331p()}));
        return m26702g().mo35398i().mo35402d(interfaceC8795n1).mo35399a();
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: U */
    public AbstractC8827t3 mo6668U(AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        C5931r1.m26561a("StreamSharing", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + abstractC8827t3 + ", secondaryStreamSpec " + abstractC8827t4);
        m26697d0(m6674m0(m26706k(), m26717w(), m26707l(), abstractC8827t3, abstractC8827t4));
        m26683J();
        return abstractC8827t3;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: V */
    public void mo6669V() {
        super.mo6669V();
        m6649j0();
        this.f4974t.m6727V();
    }

    /* JADX INFO: renamed from: i0 */
    public final void m6670i0(C8802o3.b bVar, final String str, final String str2, final InterfaceC8771i4<?> interfaceC8771i4, final AbstractC8827t3 abstractC8827t3, final AbstractC8827t3 abstractC8827t4) {
        C8802o3.c cVar = this.f4972I;
        if (cVar != null) {
            cVar.m35341b();
        }
        C8802o3.c cVar2 = new C8802o3.c(new C8802o3.d() { // from class: b1.e
            @Override // p296n0.C8802o3.d
            /* JADX INFO: renamed from: a */
            public final void mo6644a(C8802o3 c8802o3, C8802o3.g gVar) {
                C1196g.m6647g0(this.f4957a, str, str2, interfaceC8771i4, abstractC8827t3, abstractC8827t4, c8802o3, gVar);
            }
        });
        this.f4972I = cVar2;
        bVar.m35335u(cVar2);
    }

    /* JADX INFO: renamed from: k0 */
    public final C12994r m6671k0(InterfaceC8804p0 interfaceC8804p0, InterfaceC8804p0 interfaceC8804p1, AbstractC8827t3 abstractC8827t3, C5894i0 c5894i0, C5894i0 c5894i1) {
        return new C12994r(interfaceC8804p0, interfaceC8804p1, C12991o.a.m48275a(abstractC8827t3.mo35391b(), c5894i0, c5894i1));
    }

    /* JADX INFO: renamed from: l0 */
    public final C12618v0 m6672l0(InterfaceC8804p0 interfaceC8804p0, AbstractC8827t3 abstractC8827t3) {
        if (m26708n() == null || m26708n().m26543e() != 1) {
            return new C12618v0(interfaceC8804p0, C12613t.a.m47002a(abstractC8827t3.mo35391b()));
        }
        C12618v0 c12618v0 = new C12618v0(interfaceC8804p0, m26708n().m26539a());
        this.f4977w = c12618v0;
        return c12618v0;
    }

    @Override // p140g0.AbstractC5952w2
    /* JADX INFO: renamed from: m */
    public InterfaceC8771i4<?> mo6673m(boolean z10, InterfaceC8777j4 interfaceC8777j4) {
        InterfaceC8795n1 interfaceC8795n1Mo35228a = interfaceC8777j4.mo35228a(this.f4973s.mo35207X(), 1);
        if (z10) {
            interfaceC8795n1Mo35228a = InterfaceC8795n1.m35288L(interfaceC8795n1Mo35228a, this.f4973s.mo6691n());
        }
        if (interfaceC8795n1Mo35228a == null) {
            return null;
        }
        return mo6658D(interfaceC8795n1Mo35228a).mo6688e();
    }

    /* JADX INFO: renamed from: m0 */
    public final List<C8802o3> m6674m0(String str, String str2, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        C10110z.m39008b();
        if (abstractC8827t4 != null) {
            C12602n0 c12602n0M6675n0 = m6675n0(str, str2, interfaceC8771i4, abstractC8827t3, abstractC8827t4);
            C12602n0 c12602n0M6676o0 = m6676o0(str, str2, interfaceC8771i4, abstractC8827t3, abstractC8827t4);
            C12994r c12994rM6671k0 = m6671k0(m26704i(), m26716v(), abstractC8827t3, this.f4975u, this.f4976v);
            this.f4979y = c12994rM6671k0;
            m6660E0(c12602n0M6675n0, c12602n0M6676o0, c12994rM6671k0, abstractC8827t3);
            return C5918o0.m26551a(new Object[]{this.f4970G.m35331p(), this.f4971H.m35331p()});
        }
        C12602n0 c12602n0M6675n1 = m6675n0(str, str2, interfaceC8771i4, abstractC8827t3, null);
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i);
        C12618v0 c12618v0M6672l0 = m6672l0(interfaceC8804p0M26704i, abstractC8827t3);
        this.f4978x = c12618v0M6672l0;
        m6659D0(c12602n0M6675n1, c12618v0M6672l0, false);
        return C5918o0.m26551a(new Object[]{this.f4970G.m35331p()});
    }

    /* JADX INFO: renamed from: n0 */
    public final C12602n0 m6675n0(String str, String str2, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        Matrix matrixM26719y = m26719y();
        InterfaceC8804p0 interfaceC8804p0M26704i = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i);
        boolean zMo6701q = interfaceC8804p0M26704i.mo6701q();
        Rect rectM6652t0 = m6652t0(abstractC8827t3.mo35395f());
        Objects.requireNonNull(rectM6652t0);
        InterfaceC8804p0 interfaceC8804p0M26704i2 = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i2);
        int iM26714t = m26714t(interfaceC8804p0M26704i2);
        InterfaceC8804p0 interfaceC8804p0M26704i3 = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i3);
        C12602n0 c12602n0 = new C12602n0(3, 34, abstractC8827t3, matrixM26719y, zMo6701q, rectM6652t0, iM26714t, -1, m26681H(interfaceC8804p0M26704i3));
        this.f4964A = c12602n0;
        boolean z10 = str2 != null;
        InterfaceC8804p0 interfaceC8804p0M26704i4 = m26704i();
        Objects.requireNonNull(interfaceC8804p0M26704i4);
        this.f4966C = m6683z0(c12602n0, interfaceC8804p0M26704i4, z10);
        C8802o3.b bVarM6677p0 = m6677p0(this.f4964A, interfaceC8771i4, abstractC8827t3);
        this.f4970G = bVarM6677p0;
        m6670i0(bVarM6677p0, str, str2, interfaceC8771i4, abstractC8827t3, abstractC8827t4);
        return this.f4966C;
    }

    /* JADX INFO: renamed from: o0 */
    public final C12602n0 m6676o0(String str, String str2, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3, AbstractC8827t3 abstractC8827t4) {
        Matrix matrixM26719y = m26719y();
        InterfaceC8804p0 interfaceC8804p0M26716v = m26716v();
        Objects.requireNonNull(interfaceC8804p0M26716v);
        boolean zMo6701q = interfaceC8804p0M26716v.mo6701q();
        Rect rectM6652t0 = m6652t0(abstractC8827t4.mo35395f());
        Objects.requireNonNull(rectM6652t0);
        InterfaceC8804p0 interfaceC8804p0M26716v2 = m26716v();
        Objects.requireNonNull(interfaceC8804p0M26716v2);
        int iM26714t = m26714t(interfaceC8804p0M26716v2);
        InterfaceC8804p0 interfaceC8804p0M26716v3 = m26716v();
        Objects.requireNonNull(interfaceC8804p0M26716v3);
        C12602n0 c12602n0 = new C12602n0(3, 34, abstractC8827t4, matrixM26719y, zMo6701q, rectM6652t0, iM26714t, -1, m26681H(interfaceC8804p0M26716v3));
        this.f4965B = c12602n0;
        InterfaceC8804p0 interfaceC8804p0M26716v4 = m26716v();
        Objects.requireNonNull(interfaceC8804p0M26716v4);
        this.f4967D = m6683z0(c12602n0, interfaceC8804p0M26716v4, true);
        C8802o3.b bVarM6677p0 = m6677p0(this.f4965B, interfaceC8771i4, abstractC8827t4);
        this.f4971H = bVarM6677p0;
        m6670i0(bVarM6677p0, str, str2, interfaceC8771i4, abstractC8827t3, abstractC8827t4);
        return this.f4967D;
    }

    /* JADX INFO: renamed from: p0 */
    public final C8802o3.b m6677p0(C12602n0 c12602n0, InterfaceC8771i4<?> interfaceC8771i4, AbstractC8827t3 abstractC8827t3) {
        C8802o3.b bVarM35312r = C8802o3.b.m35312r(interfaceC8771i4, abstractC8827t3.mo35395f());
        m6657C0(bVarM35312r);
        m6656B0(abstractC8827t3.mo35395f(), bVarM35312r);
        bVarM35312r.m35329n(c12602n0.m46957o(), abstractC8827t3.mo35391b(), null, -1);
        bVarM35312r.m35325j(this.f4974t.m6716H());
        if (abstractC8827t3.mo35393d() != null) {
            bVarM35312r.m35322g(abstractC8827t3.mo35393d());
        }
        bVarM35312r.m35313A(abstractC8827t3.mo35396g());
        m26693b(bVarM35312r, abstractC8827t3);
        return bVarM35312r;
    }

    /* JADX INFO: renamed from: s0 */
    public Set<AbstractC5952w2> m6678s0() {
        return this.f4974t.m6713D();
    }

    /* JADX INFO: renamed from: u0 */
    public final Rect m6679u0(C12602n0 c12602n0) {
        return ((AbstractC5913n) C12637g.m47075g(m26708n())).m26546h() == 1 ? C10085a0.m38890r(c12602n0.m46961s().mo35395f()) : c12602n0.m46956n();
    }

    /* JADX INFO: renamed from: w0 */
    public final C12602n0 m6680w0(C12602n0 c12602n0, InterfaceC8804p0 interfaceC8804p0) {
        this.f4977w = new C12618v0(interfaceC8804p0, m26708n().m26539a());
        int iM6682y0 = m6682y0();
        Rect rectM6679u0 = m6679u0(c12602n0);
        AbstractC13677f abstractC13677fM49904i = AbstractC13677f.m49904i(c12602n0.m46962t(), c12602n0.m46958p(), rectM6679u0, C10085a0.m38878f(rectM6679u0, iM6682y0), iM6682y0, m6681x0(), true);
        C12602n0 c12602n1 = this.f4977w.m47014j(C12618v0.b.m47017c(c12602n0, Collections.singletonList(abstractC13677fM49904i))).get(abstractC13677fM49904i);
        Objects.requireNonNull(c12602n1);
        return c12602n1;
    }

    /* JADX INFO: renamed from: x0 */
    public final boolean m6681x0() {
        if (((AbstractC5913n) C12637g.m47075g(m26708n())).m26546h() == 1) {
            InterfaceC8804p0 interfaceC8804p0 = (InterfaceC8804p0) C12637g.m47075g(m26704i());
            if (interfaceC8804p0.mo35084l() && interfaceC8804p0.mo6701q()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y0 */
    public final int m6682y0() {
        if (((AbstractC5913n) C12637g.m47075g(m26708n())).m26546h() == 1) {
            return m26714t((InterfaceC8804p0) C12637g.m47075g(m26704i()));
        }
        return 0;
    }

    /* JADX INFO: renamed from: z0 */
    public final C12602n0 m6683z0(C12602n0 c12602n0, InterfaceC8804p0 interfaceC8804p0, boolean z10) {
        return (m26708n() == null || m26708n().m26546h() == 2 || z10 || m26708n().m26543e() == 1) ? c12602n0 : m6680w0(c12602n0, interfaceC8804p0);
    }
}
