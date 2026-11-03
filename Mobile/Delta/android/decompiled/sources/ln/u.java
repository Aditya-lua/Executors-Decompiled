package ln;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class u implements pn.b, qn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pn.c f23717a;
    public final List<qn.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Character, sn.a> f23718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<qn.e> f23719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f23720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BitSet f23721f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<Character, List<qn.a>> f23722g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public qn.i f23723h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23724i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f23725j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f23726k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f23727l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23728a;

        static {
            int[] iArr = new int[mn.k.a.values().length];
            f23728a = iArr;
            try {
                iArr[mn.k.a.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23728a[mn.k.a.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<on.b0> f23729a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f23730c;

        public b(List<on.b0> list, boolean z10, boolean z11) {
            this.f23729a = list;
            this.f23730c = z10;
            this.b = z11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f23731a;
        public final String b;

        public c(String str, String str2) {
            this.f23731a = str;
            this.b = str2;
        }
    }

    public static class d implements qn.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final on.b0 f23732a;
        public final on.b0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f23733c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f23734d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f23735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f23736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final qn.h f23737g;

        @Override // qn.d
        public on.b0 a() {
            return this.f23732a;
        }

        @Override // qn.d
        public String b() {
            return this.f23736f;
        }

        @Override // qn.d
        public String c() {
            return this.f23734d;
        }

        @Override // qn.d
        public String d() {
            return this.f23733c;
        }

        @Override // qn.d
        public String e() {
            return this.f23735e;
        }

        public d(on.b0 b0Var, on.b0 b0Var2, String str, String str2, String str3, String str4, qn.h hVar) {
            this.f23732a = b0Var;
            this.b = b0Var2;
            this.f23733c = str;
            this.f23734d = str2;
            this.f23735e = str3;
            this.f23736f = str4;
            this.f23737g = hVar;
        }
    }

    public u(pn.c cVar) {
        this.f23717a = cVar;
        List<qn.b> listH = h(cVar.e());
        this.b = listH;
        Map<Character, sn.a> mapG = g(cVar.c());
        this.f23718c = mapG;
        this.f23719d = j(cVar.b());
        BitSet bitSetI = i(cVar.d());
        this.f23721f = bitSetI;
        this.f23720e = k(bitSetI, mapG.keySet(), listH);
    }

    public static String A(qn.i iVar) {
        qn.h hVarO = iVar.o();
        if (!nn.e.e(iVar)) {
            return null;
        }
        String strC = iVar.d(hVarO, iVar.o()).c();
        return nn.c.e(strC.substring(1, strC.length() - 1));
    }

    public static /* synthetic */ List c(Character ch2) {
        return new ArrayList();
    }

    public static void e(char c10, sn.a aVar, Map<Character, sn.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void f(Iterable<sn.a> iterable, Map<Character, sn.a> map) {
        a0 a0Var;
        for (sn.a aVar : iterable) {
            char c10 = aVar.c();
            char cA = aVar.a();
            if (c10 == cA) {
                sn.a aVar2 = map.get(Character.valueOf(c10));
                if (aVar2 == null || aVar2.c() != aVar2.a()) {
                    e(c10, aVar, map);
                } else {
                    if (aVar2 instanceof a0) {
                        a0Var = (a0) aVar2;
                    } else {
                        a0 a0Var2 = new a0(c10);
                        a0Var2.e(aVar2);
                        a0Var = a0Var2;
                    }
                    a0Var.e(aVar);
                    map.put(Character.valueOf(c10), a0Var);
                }
            } else {
                e(c10, aVar, map);
                e(cA, aVar, map);
            }
        }
    }

    public static Map<Character, sn.a> g(List<sn.a> list) {
        HashMap map = new HashMap();
        f(j.a(new Object[]{new mn.a(), new mn.m()}), map);
        f(list, map);
        return map;
    }

    public static BitSet i(Set<Character> set) {
        BitSet bitSet = new BitSet();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet.set(it.next().charValue());
        }
        bitSet.set(33);
        return bitSet;
    }

    public static BitSet k(BitSet bitSet, Set<Character> set, List<qn.b> list) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet2.set(it.next().charValue());
        }
        Iterator<qn.b> it2 = list.iterator();
        while (it2.hasNext()) {
            Iterator<Character> it3 = it2.next().b().iterator();
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

    public static c t(qn.i iVar) {
        String strA;
        if (!iVar.i('(')) {
            return null;
        }
        iVar.r();
        String strV = v(iVar);
        if (strV == null) {
            return null;
        }
        if (iVar.r() >= 1) {
            strA = A(iVar);
            iVar.r();
        } else {
            strA = null;
        }
        if (iVar.i(')')) {
            return new c(strV, strA);
        }
        return null;
    }

    public static String v(qn.i iVar) {
        String strC;
        char cL = iVar.l();
        qn.h hVarO = iVar.o();
        if (!nn.e.b(iVar)) {
            return null;
        }
        if (cL == '<') {
            String strC2 = iVar.d(hVarO, iVar.o()).c();
            strC = strC2.substring(1, strC2.length() - 1);
        } else {
            strC = iVar.d(hVarO, iVar.o()).c();
        }
        return nn.c.e(strC);
    }

    public static String x(qn.i iVar) {
        if (!iVar.i('[')) {
            return null;
        }
        qn.h hVarO = iVar.o();
        if (!nn.e.d(iVar)) {
            return null;
        }
        qn.h hVarO2 = iVar.o();
        if (!iVar.i(']')) {
            return null;
        }
        String strC = iVar.d(hVarO, hVarO2).c();
        if (strC.length() > 999) {
            return null;
        }
        return strC;
    }

    public final on.s B() {
        qn.h hVarO = this.f23723h.o();
        this.f23723h.h();
        qn.h hVarO2 = this.f23723h.o();
        on.b0 b0VarM = M(this.f23723h.d(hVarO, hVarO2));
        d(e.a(b0VarM, hVarO, hVarO2, this.f23727l, this.f23726k));
        return b0VarM;
    }

    public final on.s C() {
        char cL;
        qn.h hVarO = this.f23723h.o();
        this.f23723h.h();
        while (true) {
            cL = this.f23723h.l();
            if (cL == 0 || this.f23720e.get(cL)) {
                break;
            }
            this.f23723h.h();
        }
        qn.i iVar = this.f23723h;
        pn.j jVarD = iVar.d(hVarO, iVar.o());
        String strC = jVarD.c();
        if (cL == '\n') {
            int iJ = tn.d.j(' ', strC, strC.length() - 1, 0) + 1;
            this.f23725j = strC.length() - iJ;
            strC = strC.substring(0, iJ);
        } else if (cL == 0) {
            strC = strC.substring(0, tn.d.l(strC, strC.length() - 1, 0) + 1);
        }
        on.b0 b0Var = new on.b0(strC);
        b0Var.l(jVarD.e());
        return b0Var;
    }

    public final void D(g gVar) {
        boolean z10;
        HashMap map = new HashMap();
        g gVar2 = this.f23726k;
        while (gVar2 != null) {
            g gVar3 = gVar2.f23676f;
            if (gVar3 == gVar) {
                break;
            } else {
                gVar2 = gVar3;
            }
        }
        while (gVar2 != null) {
            char c10 = gVar2.b;
            sn.a aVar = this.f23718c.get(Character.valueOf(c10));
            if (!gVar2.c() || aVar == null) {
                gVar2 = gVar2.f23677g;
            } else {
                char c11 = aVar.c();
                g gVar4 = gVar2.f23676f;
                int iD = 0;
                boolean z11 = false;
                while (true) {
                    if (gVar4 == null || gVar4 == gVar || gVar4 == map.get(Character.valueOf(c10))) {
                        z10 = false;
                        break;
                    }
                    if (gVar4.g() && gVar4.b == c11) {
                        iD = aVar.d(gVar4, gVar2);
                        if (iD > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    gVar4 = gVar4.f23676f;
                }
                if (z10) {
                    for (int i10 = 0; i10 < iD; i10++) {
                        List<on.b0> list = gVar4.f23672a;
                        list.remove(list.size() - 1).n();
                    }
                    for (int i11 = 0; i11 < iD; i11++) {
                        gVar2.f23672a.remove(0).n();
                    }
                    H(gVar4, gVar2);
                    if (gVar4.length() == 0) {
                        F(gVar4);
                    }
                    if (gVar2.length() == 0) {
                        g gVar5 = gVar2.f23677g;
                        F(gVar2);
                        gVar2 = gVar5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c10), gVar2.f23676f);
                        if (!gVar2.g()) {
                            G(gVar2);
                        }
                    }
                    gVar2 = gVar2.f23677g;
                }
            }
        }
        while (true) {
            g gVar6 = this.f23726k;
            if (gVar6 == null || gVar6 == gVar) {
                return;
            } else {
                G(gVar6);
            }
        }
    }

    public final void E(g gVar) {
        g gVar2 = gVar.f23676f;
        if (gVar2 != null) {
            gVar2.f23677g = gVar.f23677g;
        }
        g gVar3 = gVar.f23677g;
        if (gVar3 == null) {
            this.f23726k = gVar2;
        } else {
            gVar3.f23676f = gVar2;
        }
    }

    public final void F(g gVar) {
        E(gVar);
    }

    public final void G(g gVar) {
        E(gVar);
    }

    public final void H(g gVar, g gVar2) {
        g gVar3 = gVar2.f23676f;
        while (gVar3 != null && gVar3 != gVar) {
            g gVar4 = gVar3.f23676f;
            G(gVar3);
            gVar3 = gVar4;
        }
    }

    public final void I() {
        this.f23727l = this.f23727l.f23667f;
    }

    public final on.s J(e eVar, on.s sVar, boolean z10) {
        on.s sVar2;
        qn.h hVar;
        while (true) {
            g gVar = this.f23726k;
            if (gVar == null || gVar == eVar.f23668g) {
                break;
            }
            G(gVar);
        }
        if (this.f23724i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f23665d;
            }
            qn.i iVar = this.f23723h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        I();
        if (!z10 || (sVar2 = eVar.f23663a) == null) {
            sVar2 = eVar.f23664c;
        }
        while (sVar2 != null) {
            on.s sVarF = sVar2.f();
            sVar2.n();
            sVar2 = sVarF;
        }
        if (eVar.f23663a != null && z10) {
            return sVar;
        }
        m();
        return sVar;
    }

    public void K(pn.j jVar) {
        this.f23723h = qn.i.k(jVar);
        this.f23724i = !jVar.e().isEmpty();
        this.f23725j = 0;
        this.f23726k = null;
        this.f23727l = null;
        this.f23722g = l();
    }

    public final b L(sn.a aVar, char c10) {
        boolean z10;
        int iN = this.f23723h.n();
        qn.h hVarO = this.f23723h.o();
        if (this.f23723h.g(c10) < aVar.b()) {
            this.f23723h.q(hVarO);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f23723h.q(hVarO);
        while (this.f23723h.i(c10)) {
            qn.i iVar = this.f23723h;
            arrayList.add(M(iVar.d(hVarO, iVar.o())));
            hVarO = this.f23723h.o();
        }
        int iM = this.f23723h.m();
        boolean z11 = true;
        boolean z12 = iN == 0 || tn.d.f(iN);
        boolean z13 = iN == 0 || tn.d.h(iN);
        boolean z14 = iM == 0 || tn.d.f(iM);
        boolean z15 = iM == 0 || tn.d.h(iM);
        boolean z16 = !z15 && (!z14 || z13 || z12);
        boolean z17 = !z13 && (!z12 || z15 || z14);
        if (c10 == '_') {
            z10 = z16 && (!z17 || z12);
            if (!z17 || (z16 && !z14)) {
                z11 = false;
            }
        } else {
            boolean z18 = z16 && c10 == aVar.c();
            z11 = z17 && c10 == aVar.a();
            z10 = z18;
        }
        return new b(arrayList, z10, z11);
    }

    public final on.b0 M(pn.j jVar) {
        on.b0 b0Var = new on.b0(jVar.c());
        b0Var.l(jVar.e());
        return b0Var;
    }

    public final on.s N(e eVar, on.s sVar, boolean z10) {
        on.b0 b0Var;
        qn.h hVar;
        on.s sVarF = eVar.f23664c.f();
        while (sVarF != null) {
            on.s sVarF2 = sVarF.f();
            sVar.c(sVarF);
            sVarF = sVarF2;
        }
        if (this.f23724i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f23665d;
            }
            qn.i iVar = this.f23723h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        D(eVar.f23668g);
        n(sVar);
        if (z10 && (b0Var = eVar.f23663a) != null) {
            b0Var.n();
        }
        eVar.f23664c.n();
        I();
        if (eVar.f23663a == null) {
            m();
        }
        return sVar;
    }

    @Override // pn.b
    public void a(pn.j jVar, on.s sVar) {
        K(jVar);
        while (true) {
            List<? extends on.s> listS = s();
            if (listS == null) {
                D(null);
                n(sVar);
                return;
            } else {
                Iterator<? extends on.s> it = listS.iterator();
                while (it.hasNext()) {
                    sVar.c(it.next());
                }
            }
        }
    }

    @Override // qn.c
    public qn.i b() {
        return this.f23723h;
    }

    public final void d(e eVar) {
        e eVar2 = this.f23727l;
        if (eVar2 != null) {
            eVar2.f23670i = true;
        }
        this.f23727l = eVar;
    }

    public final List<qn.b> h(List<qn.b> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new mn.e.a());
        arrayList.add(new mn.f.a());
        arrayList.add(new mn.i.a());
        arrayList.add(new mn.d.a());
        arrayList.add(new mn.j.a());
        return arrayList;
    }

    public final List<qn.e> j(List<qn.e> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new mn.g());
        return arrayList;
    }

    public final Map<Character, List<qn.a>> l() {
        HashMap map = new HashMap();
        for (qn.b bVar : this.b) {
            qn.a aVarA = bVar.a();
            Iterator<Character> it = bVar.b().iterator();
            while (it.hasNext()) {
                ((List) map.computeIfAbsent(it.next(), new Function() { // from class: ln.t
                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return u.c((Character) obj);
                    }
                })).add(aVarA);
            }
        }
        return map;
    }

    public final void m() {
        for (e eVar = this.f23727l; eVar != null; eVar = eVar.f23667f) {
            if (eVar.f23663a == null) {
                eVar.f23669h = false;
            }
        }
    }

    public final void n(on.s sVar) {
        if (sVar.d() == null) {
            return;
        }
        p(sVar.d(), sVar.e());
    }

    public final void o(on.b0 b0Var, on.b0 b0Var2, int i10) {
        on.z zVar;
        if (b0Var == null || b0Var2 == null || b0Var == b0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(b0Var.o());
        if (this.f23724i) {
            zVar = new on.z();
            zVar.a(b0Var.h());
        } else {
            zVar = null;
        }
        on.s sVarF = b0Var.f();
        on.s sVarF2 = b0Var2.f();
        while (sVarF != sVarF2) {
            sb2.append(((on.b0) sVarF).o());
            if (zVar != null) {
                zVar.a(sVarF.h());
            }
            on.s sVarF3 = sVarF.f();
            sVarF.n();
            sVarF = sVarF3;
        }
        b0Var.p(sb2.toString());
        if (zVar != null) {
            b0Var.l(zVar.d());
        }
    }

    public final void p(on.s sVar, on.s sVar2) {
        on.b0 b0Var = null;
        on.b0 b0Var2 = null;
        int length = 0;
        while (sVar != null) {
            if (sVar instanceof on.b0) {
                b0Var2 = (on.b0) sVar;
                if (b0Var == null) {
                    b0Var = b0Var2;
                }
                length += b0Var2.o().length();
            } else {
                o(b0Var, b0Var2, length);
                n(sVar);
                b0Var = null;
                b0Var2 = null;
                length = 0;
            }
            if (sVar == sVar2) {
                break;
            } else {
                sVar = sVar.f();
            }
        }
        o(b0Var, b0Var2, length);
    }

    public final on.s q() {
        qn.h hVarO = this.f23723h.o();
        this.f23723h.h();
        qn.h hVarO2 = this.f23723h.o();
        e eVar = this.f23727l;
        if (eVar == null) {
            return M(this.f23723h.d(hVarO, hVarO2));
        }
        if (!eVar.f23669h) {
            I();
            return M(this.f23723h.d(hVarO, hVarO2));
        }
        on.s sVarZ = z(eVar, hVarO);
        if (sVarZ != null) {
            return sVarZ;
        }
        this.f23723h.q(hVarO2);
        I();
        return M(this.f23723h.d(hVarO, hVarO2));
    }

    public final List<? extends on.s> r(sn.a aVar, char c10) {
        b bVarL = L(aVar, c10);
        if (bVarL == null) {
            return null;
        }
        List<on.b0> list = bVarL.f23729a;
        g gVar = new g(list, c10, bVarL.f23730c, bVarL.b, this.f23726k);
        this.f23726k = gVar;
        g gVar2 = gVar.f23676f;
        if (gVar2 != null) {
            gVar2.f23677g = gVar;
        }
        return list;
    }

    public final List<? extends on.s> s() {
        List<? extends on.s> listR;
        char cL = this.f23723h.l();
        if (cL == 0) {
            return null;
        }
        if (cL == '\n') {
            return j.a(new Object[]{u()});
        }
        if (cL == '[') {
            return j.a(new Object[]{B()});
        }
        if (cL == ']') {
            return j.a(new Object[]{q()});
        }
        if (this.f23721f.get(cL)) {
            qn.h hVarO = this.f23723h.o();
            List<? extends on.s> listY = y();
            if (listY != null) {
                return listY;
            }
            this.f23723h.q(hVarO);
        }
        if (!this.f23720e.get(cL)) {
            return j.a(new Object[]{C()});
        }
        List<qn.a> list = this.f23722g.get(Character.valueOf(cL));
        if (list != null) {
            qn.h hVarO2 = this.f23723h.o();
            Iterator<qn.a> it = list.iterator();
            while (it.hasNext()) {
                qn.g gVarA = it.next().a(this);
                if (gVarA instanceof mn.l) {
                    mn.l lVar = (mn.l) gVarA;
                    on.s sVarC = lVar.c();
                    this.f23723h.q(lVar.d());
                    if (this.f23724i && sVarC.h().isEmpty()) {
                        qn.i iVar = this.f23723h;
                        sVarC.l(iVar.d(hVarO2, iVar.o()).e());
                    }
                    return j.a(new Object[]{sVarC});
                }
                this.f23723h.q(hVarO2);
            }
        }
        sn.a aVar = this.f23718c.get(Character.valueOf(cL));
        return (aVar == null || (listR = r(aVar, cL)) == null) ? j.a(new Object[]{C()}) : listR;
    }

    public final on.s u() {
        this.f23723h.h();
        boolean z10 = this.f23725j >= 2;
        this.f23725j = 0;
        return z10 ? new on.i() : new on.x();
    }

    public final qn.d w(e eVar, qn.h hVar) {
        qn.h hVarO = this.f23723h.o();
        c cVarT = t(this.f23723h);
        if (cVarT != null) {
            return new d(eVar.f23663a, eVar.f23664c, this.f23723h.d(eVar.f23666e, hVar).c(), null, cVarT.f23731a, cVarT.b, hVarO);
        }
        this.f23723h.q(hVarO);
        String strX = x(this.f23723h);
        if (strX == null) {
            this.f23723h.q(hVarO);
        }
        boolean z10 = strX == null || strX.isEmpty();
        if (eVar.f23670i && z10 && eVar.f23663a == null) {
            return null;
        }
        return new d(eVar.f23663a, eVar.f23664c, this.f23723h.d(eVar.f23666e, hVar).c(), strX, null, null, hVarO);
    }

    public final List<? extends on.s> y() {
        qn.h hVarO = this.f23723h.o();
        this.f23723h.h();
        qn.h hVarO2 = this.f23723h.o();
        if (!this.f23723h.i('[')) {
            return null;
        }
        qn.h hVarO3 = this.f23723h.o();
        on.b0 b0VarM = M(this.f23723h.d(hVarO, hVarO2));
        on.b0 b0VarM2 = M(this.f23723h.d(hVarO2, hVarO3));
        d(e.b(b0VarM, hVarO, b0VarM2, hVarO2, hVarO3, this.f23727l, this.f23726k));
        return j.a(new Object[]{b0VarM, b0VarM2});
    }

    public final on.s z(e eVar, qn.h hVar) {
        qn.d dVarW = w(eVar, hVar);
        if (dVarW == null) {
            return null;
        }
        qn.h hVarO = this.f23723h.o();
        Iterator<qn.e> it = this.f23719d.iterator();
        while (it.hasNext()) {
            qn.f fVarA = it.next().a(dVarW, this.f23723h, this.f23717a);
            if (fVarA instanceof mn.k) {
                mn.k kVar = (mn.k) fVarA;
                on.s sVarD = kVar.d();
                qn.h hVarE = kVar.e();
                boolean zG = kVar.g();
                int i10 = a.f23728a[kVar.f().ordinal()];
                if (i10 == 1) {
                    this.f23723h.q(hVarE);
                    return N(eVar, sVarD, zG);
                }
                if (i10 == 2) {
                    this.f23723h.q(hVarE);
                    return J(eVar, sVarD, zG);
                }
            } else {
                this.f23723h.q(hVarO);
            }
        }
        return null;
    }
}
