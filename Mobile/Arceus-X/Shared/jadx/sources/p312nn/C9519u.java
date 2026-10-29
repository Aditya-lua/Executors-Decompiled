package p312nn;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import p338on.C9819a;
import p338on.C9822d;
import p338on.C9823e;
import p338on.C9824f;
import p338on.C9825g;
import p338on.C9827i;
import p338on.C9828j;
import p338on.C9829k;
import p338on.C9830l;
import p338on.C9831m;
import p388qn.AbstractC10623s;
import p388qn.C10604b0;
import p388qn.C10613i;
import p388qn.C10628x;
import p388qn.C10630z;
import p418rn.C10935j;
import p418rn.InterfaceC10927b;
import p418rn.InterfaceC10928c;
import p472un.InterfaceC11892a;
import pn.C10297c;
import pn.C10299e;
import sn.C11424h;
import sn.C11425i;
import sn.InterfaceC11417a;
import sn.InterfaceC11418b;
import sn.InterfaceC11419c;
import sn.InterfaceC11420d;
import sn.InterfaceC11421e;
import sn.InterfaceC11422f;
import sn.InterfaceC11423g;
import vn.C12236d;

/* JADX INFO: renamed from: nn.u */
/* JADX INFO: loaded from: classes3.dex */
public class C9519u implements InterfaceC10927b, InterfaceC11419c {

    /* JADX INFO: renamed from: a */
    public final InterfaceC10928c f34255a;

    /* JADX INFO: renamed from: b */
    public final List<InterfaceC11418b> f34256b;

    /* JADX INFO: renamed from: c */
    public final Map<Character, InterfaceC11892a> f34257c;

    /* JADX INFO: renamed from: d */
    public final List<InterfaceC11421e> f34258d;

    /* JADX INFO: renamed from: e */
    public final BitSet f34259e;

    /* JADX INFO: renamed from: f */
    public final BitSet f34260f;

    /* JADX INFO: renamed from: g */
    public Map<Character, List<InterfaceC11417a>> f34261g;

    /* JADX INFO: renamed from: h */
    public C11425i f34262h;

    /* JADX INFO: renamed from: i */
    public boolean f34263i;

    /* JADX INFO: renamed from: j */
    public int f34264j;

    /* JADX INFO: renamed from: k */
    public C9505g f34265k;

    /* JADX INFO: renamed from: l */
    public C9503e f34266l;

    /* JADX INFO: renamed from: nn.u$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34267a;

        static {
            int[] iArr = new int[C9829k.a.values().length];
            f34267a = iArr;
            try {
                iArr[C9829k.a.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34267a[C9829k.a.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: renamed from: nn.u$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        public final List<C10604b0> f34268a;

        /* JADX INFO: renamed from: b */
        public final boolean f34269b;

        /* JADX INFO: renamed from: c */
        public final boolean f34270c;

        public b(List<C10604b0> list, boolean z10, boolean z11) {
            this.f34268a = list;
            this.f34270c = z10;
            this.f34269b = z11;
        }
    }

    /* JADX INFO: renamed from: nn.u$c */
    public static class c {

        /* JADX INFO: renamed from: a */
        public final String f34271a;

        /* JADX INFO: renamed from: b */
        public final String f34272b;

        public c(String str, String str2) {
            this.f34271a = str;
            this.f34272b = str2;
        }
    }

    /* JADX INFO: renamed from: nn.u$d */
    public static class d implements InterfaceC11420d {

        /* JADX INFO: renamed from: a */
        public final C10604b0 f34273a;

        /* JADX INFO: renamed from: b */
        public final C10604b0 f34274b;

        /* JADX INFO: renamed from: c */
        public final String f34275c;

        /* JADX INFO: renamed from: d */
        public final String f34276d;

        /* JADX INFO: renamed from: e */
        public final String f34277e;

        /* JADX INFO: renamed from: f */
        public final String f34278f;

        /* JADX INFO: renamed from: g */
        public final C11424h f34279g;

        @Override // sn.InterfaceC11420d
        /* JADX INFO: renamed from: a */
        public C10604b0 mo37579a() {
            return this.f34273a;
        }

        @Override // sn.InterfaceC11420d
        /* JADX INFO: renamed from: b */
        public String mo37580b() {
            return this.f34278f;
        }

        @Override // sn.InterfaceC11420d
        /* JADX INFO: renamed from: c */
        public String mo37581c() {
            return this.f34276d;
        }

        @Override // sn.InterfaceC11420d
        /* JADX INFO: renamed from: d */
        public String mo37582d() {
            return this.f34275c;
        }

        @Override // sn.InterfaceC11420d
        /* JADX INFO: renamed from: e */
        public String mo37583e() {
            return this.f34277e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public d(C10604b0 c10604b0, C10604b0 c10604b1, String str, String str2, String str3, String str4, C11424h c11424h) {
            this.f34273a = c10604b0;
            this.f34274b = c10604b1;
            this.f34275c = str;
            this.f34276d = str2;
            this.f34277e = str3;
            this.f34278f = str4;
            this.f34279g = c11424h;
        }
    }

    public C9519u(InterfaceC10928c interfaceC10928c) {
        this.f34255a = interfaceC10928c;
        List<InterfaceC11418b> listM37565h = m37565h(interfaceC10928c.mo37536e());
        this.f34256b = listM37565h;
        Map<Character, InterfaceC11892a> mapM37543g = m37543g(interfaceC10928c.mo37534c());
        this.f34257c = mapM37543g;
        this.f34258d = m37566j(interfaceC10928c.mo37533b());
        BitSet bitSetM37544i = m37544i(interfaceC10928c.mo37535d());
        this.f34260f = bitSetM37544i;
        this.f34259e = m37545k(bitSetM37544i, mapM37543g.keySet(), listM37565h);
    }

    /* JADX INFO: renamed from: A */
    public static String m37539A(C11425i c11425i) {
        C11424h c11424hM42808o = c11425i.m42808o();
        if (!C10299e.m39572e(c11425i)) {
            return null;
        }
        String strM41535c = c11425i.m42798d(c11424hM42808o, c11425i.m42808o()).m41535c();
        return C10297c.m39565e(strM41535c.substring(1, strM41535c.length() - 1));
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR  A[MD:():void (c)] call: java.util.ArrayList.<init>():void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ List m37540c(Character ch2) {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: e */
    public static void m37541e(char c10, InterfaceC11892a interfaceC11892a, Map<Character, InterfaceC11892a> map) {
        if (map.put(Character.valueOf(c10), interfaceC11892a) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    /* JADX INFO: renamed from: f */
    public static void m37542f(Iterable<InterfaceC11892a> iterable, Map<Character, InterfaceC11892a> map) {
        C9498a0 c9498a0;
        for (InterfaceC11892a interfaceC11892a : iterable) {
            char cMo37446d = interfaceC11892a.mo37446d();
            char cMo37444b = interfaceC11892a.mo37444b();
            if (cMo37446d == cMo37444b) {
                InterfaceC11892a interfaceC11892a2 = map.get(Character.valueOf(cMo37446d));
                if (interfaceC11892a2 == null || interfaceC11892a2.mo37446d() != interfaceC11892a2.mo37444b()) {
                    m37541e(cMo37446d, interfaceC11892a, map);
                } else {
                    if (interfaceC11892a2 instanceof C9498a0) {
                        c9498a0 = (C9498a0) interfaceC11892a2;
                    } else {
                        C9498a0 c9498a1 = new C9498a0(cMo37446d);
                        c9498a1.m37447e(interfaceC11892a2);
                        c9498a0 = c9498a1;
                    }
                    c9498a0.m37447e(interfaceC11892a);
                    map.put(Character.valueOf(cMo37446d), c9498a0);
                }
            } else {
                m37541e(cMo37446d, interfaceC11892a, map);
                m37541e(cMo37444b, interfaceC11892a, map);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static Map<Character, InterfaceC11892a> m37543g(List<InterfaceC11892a> list) {
        HashMap map = new HashMap();
        m37542f(C9508j.m37484a(new Object[]{new C9819a(), new C9831m()}), map);
        m37542f(list, map);
        return map;
    }

    /* JADX INFO: renamed from: i */
    public static BitSet m37544i(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        bitSet.set(33);
        return bitSet;
    }

    /* JADX INFO: renamed from: k */
    public static BitSet m37545k(BitSet bitSet, Set<Character> set, List<InterfaceC11418b> list) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet2.set(it.next().charValue());
        }
        Iterator<InterfaceC11418b> it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator<Character> it3 = it2.next().mo38686b().iterator();
            while (it3.hasNext()) {
                bitSet2.set(it3.next().charValue());
            }
        }
        bitSet2.set(91);
        bitSet2.set(93);
        bitSet2.set(33);
        bitSet2.set(10);
        return bitSet2;
    }

    /* JADX INFO: renamed from: t */
    public static c m37546t(C11425i c11425i) {
        String strM37539A;
        if (!c11425i.m42803i('(')) {
            return null;
        }
        c11425i.m42811r();
        String strM37547v = m37547v(c11425i);
        if (strM37547v == null) {
            return null;
        }
        if (c11425i.m42811r() >= 1) {
            strM37539A = m37539A(c11425i);
            c11425i.m42811r();
        } else {
            strM37539A = null;
        }
        if (c11425i.m42803i(')')) {
            return new c(strM37547v, strM37539A);
        }
        return null;
    }

    /* JADX INFO: renamed from: v */
    public static String m37547v(C11425i c11425i) {
        String strM41535c;
        char cM42805l = c11425i.m42805l();
        C11424h c11424hM42808o = c11425i.m42808o();
        if (!C10299e.m39569b(c11425i)) {
            return null;
        }
        if (cM42805l == '<') {
            String strM41535c2 = c11425i.m42798d(c11424hM42808o, c11425i.m42808o()).m41535c();
            strM41535c = strM41535c2.substring(1, strM41535c2.length() - 1);
        } else {
            strM41535c = c11425i.m42798d(c11424hM42808o, c11425i.m42808o()).m41535c();
        }
        return C10297c.m39565e(strM41535c);
    }

    /* JADX INFO: renamed from: x */
    public static String m37548x(C11425i c11425i) {
        if (!c11425i.m42803i('[')) {
            return null;
        }
        C11424h c11424hM42808o = c11425i.m42808o();
        if (!C10299e.m39571d(c11425i)) {
            return null;
        }
        C11424h c11424hM42808o2 = c11425i.m42808o();
        if (!c11425i.m42803i(']')) {
            return null;
        }
        String strM41535c = c11425i.m42798d(c11424hM42808o, c11424hM42808o2).m41535c();
        if (strM41535c.length() > 999) {
            return null;
        }
        return strM41535c;
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC10623s m37549B() {
        C11424h c11424hM42808o = this.f34262h.m42808o();
        this.f34262h.m42802h();
        C11424h c11424hM42808o2 = this.f34262h.m42808o();
        C10604b0 c10604b0M37560M = m37560M(this.f34262h.m42798d(c11424hM42808o, c11424hM42808o2));
        m37564d(C9503e.m37470a(c10604b0M37560M, c11424hM42808o, c11424hM42808o2, this.f34266l, this.f34265k));
        return c10604b0M37560M;
    }

    /* JADX INFO: renamed from: C */
    public final AbstractC10623s m37550C() {
        char cM42805l;
        C11424h c11424hM42808o = this.f34262h.m42808o();
        this.f34262h.m42802h();
        while (true) {
            cM42805l = this.f34262h.m42805l();
            if (cM42805l == 0 || this.f34259e.get(cM42805l)) {
                break;
            }
            this.f34262h.m42802h();
        }
        C11425i c11425i = this.f34262h;
        C10935j c10935jM42798d = c11425i.m42798d(c11424hM42808o, c11425i.m42808o());
        String strM41535c = c10935jM42798d.m41535c();
        if (cM42805l == '\n') {
            int iM45386j = C12236d.m45386j(' ', strM41535c, strM41535c.length() - 1, 0) + 1;
            this.f34264j = strM41535c.length() - iM45386j;
            strM41535c = strM41535c.substring(0, iM45386j);
        } else if (cM42805l == 0) {
            strM41535c = strM41535c.substring(0, C12236d.m45388l(strM41535c, strM41535c.length() - 1, 0) + 1);
        }
        C10604b0 c10604b0 = new C10604b0(strM41535c);
        c10604b0.m40705l(c10935jM42798d.m41537e());
        return c10604b0;
    }

    /* JADX INFO: renamed from: D */
    public final void m37551D(C9505g c9505g) {
        boolean z10;
        HashMap map = new HashMap();
        C9505g c9505g2 = this.f34265k;
        while (c9505g2 != null) {
            C9505g c9505g3 = c9505g2.f34207f;
            if (c9505g3 == c9505g) {
                break;
            } else {
                c9505g2 = c9505g3;
            }
        }
        while (c9505g2 != null) {
            char c10 = c9505g2.f34203b;
            InterfaceC11892a interfaceC11892a = this.f34257c.get(Character.valueOf(c10));
            if (!c9505g2.mo37477c() || interfaceC11892a == null) {
                c9505g2 = c9505g2.f34208g;
            } else {
                char cMo37446d = interfaceC11892a.mo37446d();
                C9505g c9505g4 = c9505g2.f34207f;
                int iMo37443a = 0;
                boolean z11 = false;
                while (true) {
                    if (c9505g4 == null || c9505g4 == c9505g || c9505g4 == map.get(Character.valueOf(c10))) {
                        z10 = false;
                        break;
                    }
                    if (c9505g4.mo37481g() && c9505g4.f34203b == cMo37446d) {
                        iMo37443a = interfaceC11892a.mo37443a(c9505g4, c9505g2);
                        if (iMo37443a > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    c9505g4 = c9505g4.f34207f;
                }
                if (z10) {
                    for (int i10 = 0; i10 < iMo37443a; i10++) {
                        List<C10604b0> list = c9505g4.f34202a;
                        list.remove(list.size() - 1).m40706n();
                    }
                    for (int i11 = 0; i11 < iMo37443a; i11++) {
                        c9505g2.f34202a.remove(0).m40706n();
                    }
                    m37555H(c9505g4, c9505g2);
                    if (c9505g4.length() == 0) {
                        m37553F(c9505g4);
                    }
                    if (c9505g2.length() == 0) {
                        C9505g c9505g5 = c9505g2.f34208g;
                        m37553F(c9505g2);
                        c9505g2 = c9505g5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c10), c9505g2.f34207f);
                        if (!c9505g2.mo37481g()) {
                            m37554G(c9505g2);
                        }
                    }
                    c9505g2 = c9505g2.f34208g;
                }
            }
        }
        while (true) {
            C9505g c9505g6 = this.f34265k;
            if (c9505g6 == null || c9505g6 == c9505g) {
                return;
            } else {
                m37554G(c9505g6);
            }
        }
    }

    /* JADX INFO: renamed from: E */
    public final void m37552E(C9505g c9505g) {
        C9505g c9505g2 = c9505g.f34207f;
        if (c9505g2 != null) {
            c9505g2.f34208g = c9505g.f34208g;
        }
        C9505g c9505g3 = c9505g.f34208g;
        if (c9505g3 == null) {
            this.f34265k = c9505g2;
        } else {
            c9505g3.f34207f = c9505g2;
        }
    }

    /* JADX INFO: renamed from: F */
    public final void m37553F(C9505g c9505g) {
        m37552E(c9505g);
    }

    /* JADX INFO: renamed from: G */
    public final void m37554G(C9505g c9505g) {
        m37552E(c9505g);
    }

    /* JADX INFO: renamed from: H */
    public final void m37555H(C9505g c9505g, C9505g c9505g2) {
        C9505g c9505g3 = c9505g2.f34207f;
        while (c9505g3 != null && c9505g3 != c9505g) {
            C9505g c9505g4 = c9505g3.f34207f;
            m37554G(c9505g3);
            c9505g3 = c9505g4;
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m37556I() {
        this.f34266l = this.f34266l.f34197f;
    }

    /* JADX INFO: renamed from: J */
    public final AbstractC10623s m37557J(C9503e c9503e, AbstractC10623s abstractC10623s, boolean z10) {
        AbstractC10623s abstractC10623s2;
        C11424h c11424h;
        while (true) {
            C9505g c9505g = this.f34265k;
            if (c9505g == null || c9505g == c9503e.f34198g) {
                break;
            }
            m37554G(c9505g);
        }
        if (this.f34263i) {
            if (!z10 || (c11424h = c9503e.f34193b) == null) {
                c11424h = c9503e.f34195d;
            }
            C11425i c11425i = this.f34262h;
            abstractC10623s.m40705l(c11425i.m42798d(c11424h, c11425i.m42808o()).m41537e());
        }
        m37556I();
        if (!z10 || (abstractC10623s2 = c9503e.f34192a) == null) {
            abstractC10623s2 = c9503e.f34194c;
        }
        while (abstractC10623s2 != null) {
            AbstractC10623s abstractC10623sM40701f = abstractC10623s2.m40701f();
            abstractC10623s2.m40706n();
            abstractC10623s2 = abstractC10623sM40701f;
        }
        if (c9503e.f34192a != null && z10) {
            return abstractC10623s;
        }
        m37568m();
        return abstractC10623s;
    }

    /* JADX INFO: renamed from: K */
    public void m37558K(C10935j c10935j) {
        this.f34262h = C11425i.m42794k(c10935j);
        this.f34263i = !c10935j.m41537e().isEmpty();
        this.f34264j = 0;
        this.f34265k = null;
        this.f34266l = null;
        this.f34261g = m37567l();
    }

    /* JADX INFO: renamed from: L */
    public final b m37559L(InterfaceC11892a interfaceC11892a, char c10) {
        boolean z10;
        int iM42807n = this.f34262h.m42807n();
        C11424h c11424hM42808o = this.f34262h.m42808o();
        if (this.f34262h.m42801g(c10) < interfaceC11892a.mo37445c()) {
            this.f34262h.m42810q(c11424hM42808o);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f34262h.m42810q(c11424hM42808o);
        while (this.f34262h.m42803i(c10)) {
            C11425i c11425i = this.f34262h;
            arrayList.add(m37560M(c11425i.m42798d(c11424hM42808o, c11425i.m42808o())));
            c11424hM42808o = this.f34262h.m42808o();
        }
        int iM42806m = this.f34262h.m42806m();
        boolean z11 = true;
        boolean z12 = iM42807n == 0 || C12236d.m45382f(iM42807n);
        boolean z13 = iM42807n == 0 || C12236d.m45384h(iM42807n);
        boolean z14 = iM42806m == 0 || C12236d.m45382f(iM42806m);
        boolean z15 = iM42806m == 0 || C12236d.m45384h(iM42806m);
        boolean z16 = !z15 && (!z14 || z13 || z12);
        boolean z17 = !z13 && (!z12 || z15 || z14);
        if (c10 == '_') {
            z10 = z16 && (!z17 || z12);
            if (!z17 || (z16 && !z14)) {
                z11 = false;
            }
        } else {
            boolean z18 = z16 && c10 == interfaceC11892a.mo37446d();
            z11 = z17 && c10 == interfaceC11892a.mo37444b();
            z10 = z18;
        }
        return new b(arrayList, z10, z11);
    }

    /* JADX INFO: renamed from: M */
    public final C10604b0 m37560M(C10935j c10935j) {
        C10604b0 c10604b0 = new C10604b0(c10935j.m41535c());
        c10604b0.m40705l(c10935j.m41537e());
        return c10604b0;
    }

    /* JADX INFO: renamed from: N */
    public final AbstractC10623s m37561N(C9503e c9503e, AbstractC10623s abstractC10623s, boolean z10) {
        C10604b0 c10604b0;
        C11424h c11424h;
        AbstractC10623s abstractC10623sM40701f = c9503e.f34194c.m40701f();
        while (abstractC10623sM40701f != null) {
            AbstractC10623s abstractC10623sM40701f2 = abstractC10623sM40701f.m40701f();
            abstractC10623s.mo40695c(abstractC10623sM40701f);
            abstractC10623sM40701f = abstractC10623sM40701f2;
        }
        if (this.f34263i) {
            if (!z10 || (c11424h = c9503e.f34193b) == null) {
                c11424h = c9503e.f34195d;
            }
            C11425i c11425i = this.f34262h;
            abstractC10623s.m40705l(c11425i.m42798d(c11424h, c11425i.m42808o()).m41537e());
        }
        m37551D(c9503e.f34198g);
        m37569n(abstractC10623s);
        if (z10 && (c10604b0 = c9503e.f34192a) != null) {
            c10604b0.m40706n();
        }
        c9503e.f34194c.m40706n();
        m37556I();
        if (c9503e.f34192a == null) {
            m37568m();
        }
        return abstractC10623s;
    }

    @Override // sn.InterfaceC11419c
    /* JADX INFO: renamed from: a */
    public C11425i mo37562a() {
        return this.f34262h;
    }

    @Override // p418rn.InterfaceC10927b
    /* JADX INFO: renamed from: b */
    public void mo37563b(C10935j c10935j, AbstractC10623s abstractC10623s) {
        m37558K(c10935j);
        while (true) {
            List<? extends AbstractC10623s> listM37574s = m37574s();
            if (listM37574s == null) {
                m37551D(null);
                m37569n(abstractC10623s);
                return;
            } else {
                Iterator<? extends AbstractC10623s> it = listM37574s.iterator();
                while (it.hasNext()) {
                    abstractC10623s.mo40695c(it.next());
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m37564d(C9503e c9503e) {
        C9503e c9503e2 = this.f34266l;
        if (c9503e2 != null) {
            c9503e2.f34200i = true;
        }
        this.f34266l = c9503e;
    }

    /* JADX INFO: renamed from: h */
    public final List<InterfaceC11418b> m37565h(List<InterfaceC11418b> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new C9823e.a());
        arrayList.add(new C9824f.a());
        arrayList.add(new C9827i.a());
        arrayList.add(new C9822d.a());
        arrayList.add(new C9828j.a());
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public final List<InterfaceC11421e> m37566j(List<InterfaceC11421e> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new C9825g());
        return arrayList;
    }

    /* JADX INFO: renamed from: l */
    public final Map<Character, List<InterfaceC11417a>> m37567l() {
        HashMap map = new HashMap();
        for (InterfaceC11418b interfaceC11418b : this.f34256b) {
            InterfaceC11417a interfaceC11417aMo38685a = interfaceC11418b.mo38685a();
            Iterator<Character> it = interfaceC11418b.mo38686b().iterator();
            while (it.hasNext()) {
                ((List) map.computeIfAbsent(it.next(), new Function() { // from class: nn.t
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return C9519u.m37540c((Character) obj);
                    }
                })).add(interfaceC11417aMo38685a);
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: m */
    public final void m37568m() {
        for (C9503e c9503e = this.f34266l; c9503e != null; c9503e = c9503e.f34197f) {
            if (c9503e.f34192a == null) {
                c9503e.f34199h = false;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m37569n(AbstractC10623s abstractC10623s) {
        if (abstractC10623s.m40699d() == null) {
            return;
        }
        m37571p(abstractC10623s.m40699d(), abstractC10623s.m40700e());
    }

    /* JADX INFO: renamed from: o */
    public final void m37570o(C10604b0 c10604b0, C10604b0 c10604b1, int i10) {
        C10630z c10630z;
        if (c10604b0 == null || c10604b1 == null || c10604b0 == c10604b1) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(c10604b0.m40639o());
        if (this.f34263i) {
            c10630z = new C10630z();
            c10630z.m40723a(c10604b0.m40702h());
        } else {
            c10630z = null;
        }
        AbstractC10623s abstractC10623sM40701f = c10604b0.m40701f();
        AbstractC10623s abstractC10623sM40701f2 = c10604b1.m40701f();
        while (abstractC10623sM40701f != abstractC10623sM40701f2) {
            sb2.append(((C10604b0) abstractC10623sM40701f).m40639o());
            if (c10630z != null) {
                c10630z.m40723a(abstractC10623sM40701f.m40702h());
            }
            AbstractC10623s abstractC10623sM40701f3 = abstractC10623sM40701f.m40701f();
            abstractC10623sM40701f.m40706n();
            abstractC10623sM40701f = abstractC10623sM40701f3;
        }
        c10604b0.m40640p(sb2.toString());
        if (c10630z != null) {
            c10604b0.m40705l(c10630z.m40725d());
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m37571p(AbstractC10623s abstractC10623s, AbstractC10623s abstractC10623s2) {
        C10604b0 c10604b0 = null;
        C10604b0 c10604b1 = null;
        int length = 0;
        while (abstractC10623s != null) {
            if (abstractC10623s instanceof C10604b0) {
                c10604b1 = (C10604b0) abstractC10623s;
                if (c10604b0 == null) {
                    c10604b0 = c10604b1;
                }
                length += c10604b1.m40639o().length();
            } else {
                m37570o(c10604b0, c10604b1, length);
                m37569n(abstractC10623s);
                c10604b0 = null;
                c10604b1 = null;
                length = 0;
            }
            if (abstractC10623s == abstractC10623s2) {
                break;
            } else {
                abstractC10623s = abstractC10623s.m40701f();
            }
        }
        m37570o(c10604b0, c10604b1, length);
    }

    /* JADX INFO: renamed from: q */
    public final AbstractC10623s m37572q() {
        C11424h c11424hM42808o = this.f34262h.m42808o();
        this.f34262h.m42802h();
        C11424h c11424hM42808o2 = this.f34262h.m42808o();
        C9503e c9503e = this.f34266l;
        if (c9503e == null) {
            return m37560M(this.f34262h.m42798d(c11424hM42808o, c11424hM42808o2));
        }
        if (!c9503e.f34199h) {
            m37556I();
            return m37560M(this.f34262h.m42798d(c11424hM42808o, c11424hM42808o2));
        }
        AbstractC10623s abstractC10623sM37578z = m37578z(c9503e, c11424hM42808o);
        if (abstractC10623sM37578z != null) {
            return abstractC10623sM37578z;
        }
        this.f34262h.m42810q(c11424hM42808o2);
        m37556I();
        return m37560M(this.f34262h.m42798d(c11424hM42808o, c11424hM42808o2));
    }

    /* JADX INFO: renamed from: r */
    public final List<? extends AbstractC10623s> m37573r(InterfaceC11892a interfaceC11892a, char c10) {
        b bVarM37559L = m37559L(interfaceC11892a, c10);
        if (bVarM37559L == null) {
            return null;
        }
        List<C10604b0> list = bVarM37559L.f34268a;
        C9505g c9505g = new C9505g(list, c10, bVarM37559L.f34270c, bVarM37559L.f34269b, this.f34265k);
        this.f34265k = c9505g;
        C9505g c9505g2 = c9505g.f34207f;
        if (c9505g2 != null) {
            c9505g2.f34208g = c9505g;
        }
        return list;
    }

    /* JADX INFO: renamed from: s */
    public final List<? extends AbstractC10623s> m37574s() {
        List<? extends AbstractC10623s> listM37573r;
        char cM42805l = this.f34262h.m42805l();
        if (cM42805l == 0) {
            return null;
        }
        if (cM42805l == '\n') {
            return C9508j.m37484a(new Object[]{m37575u()});
        }
        if (cM42805l == '[') {
            return C9508j.m37484a(new Object[]{m37549B()});
        }
        if (cM42805l == ']') {
            return C9508j.m37484a(new Object[]{m37572q()});
        }
        if (this.f34260f.get(cM42805l)) {
            C11424h c11424hM42808o = this.f34262h.m42808o();
            List<? extends AbstractC10623s> listM37577y = m37577y();
            if (listM37577y != null) {
                return listM37577y;
            }
            this.f34262h.m42810q(c11424hM42808o);
        }
        if (!this.f34259e.get(cM42805l)) {
            return C9508j.m37484a(new Object[]{m37550C()});
        }
        List<InterfaceC11417a> list = this.f34261g.get(Character.valueOf(cM42805l));
        if (list != null) {
            C11424h c11424hM42808o2 = this.f34262h.m42808o();
            Iterator<InterfaceC11417a> it = list.iterator();
            while (it.hasNext()) {
                InterfaceC11423g interfaceC11423gMo38684a = it.next().mo38684a(this);
                if (interfaceC11423gMo38684a instanceof C9830l) {
                    C9830l c9830l = (C9830l) interfaceC11423gMo38684a;
                    AbstractC10623s abstractC10623sM38703c = c9830l.m38703c();
                    this.f34262h.m42810q(c9830l.m38704d());
                    if (this.f34263i && abstractC10623sM38703c.m40702h().isEmpty()) {
                        C11425i c11425i = this.f34262h;
                        abstractC10623sM38703c.m40705l(c11425i.m42798d(c11424hM42808o2, c11425i.m42808o()).m41537e());
                    }
                    return C9508j.m37484a(new Object[]{abstractC10623sM38703c});
                }
                this.f34262h.m42810q(c11424hM42808o2);
            }
        }
        InterfaceC11892a interfaceC11892a = this.f34257c.get(Character.valueOf(cM42805l));
        return (interfaceC11892a == null || (listM37573r = m37573r(interfaceC11892a, cM42805l)) == null) ? C9508j.m37484a(new Object[]{m37550C()}) : listM37573r;
    }

    /* JADX INFO: renamed from: u */
    public final AbstractC10623s m37575u() {
        this.f34262h.m42802h();
        boolean z10 = this.f34264j >= 2;
        this.f34264j = 0;
        return z10 ? new C10613i() : new C10628x();
    }

    /* JADX INFO: renamed from: w */
    public final InterfaceC11420d m37576w(C9503e c9503e, C11424h c11424h) {
        C11424h c11424hM42808o = this.f34262h.m42808o();
        c cVarM37546t = m37546t(this.f34262h);
        if (cVarM37546t != null) {
            return new d(c9503e.f34192a, c9503e.f34194c, this.f34262h.m42798d(c9503e.f34196e, c11424h).m41535c(), null, cVarM37546t.f34271a, cVarM37546t.f34272b, c11424hM42808o);
        }
        this.f34262h.m42810q(c11424hM42808o);
        String strM37548x = m37548x(this.f34262h);
        if (strM37548x == null) {
            this.f34262h.m42810q(c11424hM42808o);
        }
        boolean z10 = strM37548x == null || strM37548x.isEmpty();
        if (c9503e.f34200i && z10 && c9503e.f34192a == null) {
            return null;
        }
        return new d(c9503e.f34192a, c9503e.f34194c, this.f34262h.m42798d(c9503e.f34196e, c11424h).m41535c(), strM37548x, null, null, c11424hM42808o);
    }

    /* JADX INFO: renamed from: y */
    public final List<? extends AbstractC10623s> m37577y() {
        C11424h c11424hM42808o = this.f34262h.m42808o();
        this.f34262h.m42802h();
        C11424h c11424hM42808o2 = this.f34262h.m42808o();
        if (!this.f34262h.m42803i('[')) {
            return null;
        }
        C11424h c11424hM42808o3 = this.f34262h.m42808o();
        C10604b0 c10604b0M37560M = m37560M(this.f34262h.m42798d(c11424hM42808o, c11424hM42808o2));
        C10604b0 c10604b0M37560M2 = m37560M(this.f34262h.m42798d(c11424hM42808o2, c11424hM42808o3));
        m37564d(C9503e.m37471b(c10604b0M37560M, c11424hM42808o, c10604b0M37560M2, c11424hM42808o2, c11424hM42808o3, this.f34266l, this.f34265k));
        return C9508j.m37484a(new Object[]{c10604b0M37560M, c10604b0M37560M2});
    }

    /* JADX INFO: renamed from: z */
    public final AbstractC10623s m37578z(C9503e c9503e, C11424h c11424h) {
        InterfaceC11420d interfaceC11420dM37576w = m37576w(c9503e, c11424h);
        if (interfaceC11420dM37576w == null) {
            return null;
        }
        C11424h c11424hM42808o = this.f34262h.m42808o();
        Iterator<InterfaceC11421e> it = this.f34258d.iterator();
        while (it.hasNext()) {
            InterfaceC11422f interfaceC11422fMo38688a = it.next().mo38688a(interfaceC11420dM37576w, this.f34262h, this.f34255a);
            if (interfaceC11422fMo38688a instanceof C9829k) {
                C9829k c9829k = (C9829k) interfaceC11422fMo38688a;
                AbstractC10623s abstractC10623sM38698d = c9829k.m38698d();
                C11424h c11424hM38699e = c9829k.m38699e();
                boolean zM38701g = c9829k.m38701g();
                int i10 = a.f34267a[c9829k.m38700f().ordinal()];
                if (i10 == 1) {
                    this.f34262h.m42810q(c11424hM38699e);
                    return m37561N(c9503e, abstractC10623sM38698d, zM38701g);
                }
                if (i10 == 2) {
                    this.f34262h.m42810q(c11424hM38699e);
                    return m37557J(c9503e, abstractC10623sM38698d, zM38701g);
                }
            } else {
                this.f34262h.m42810q(c11424hM42808o);
            }
        }
        return null;
    }
}
