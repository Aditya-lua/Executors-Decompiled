package nn;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class u implements rn.b, sn.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rn.c f26428a;
    public final List<sn.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Character, un.a> f26429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<sn.e> f26430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f26431e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BitSet f26432f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<Character, List<sn.a>> f26433g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public sn.i f26434h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26435i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f26436j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f26437k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f26438l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f26439a;

        static {
            int[] iArr = new int[on.k.a.values().length];
            f26439a = iArr;
            try {
                iArr[on.k.a.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26439a[on.k.a.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<qn.b0> f26440a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f26441c;

        public b(List<qn.b0> list, boolean z10, boolean z11) {
            this.f26440a = list;
            this.f26441c = z10;
            this.b = z11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f26442a;
        public final String b;

        public c(String str, String str2) {
            this.f26442a = str;
            this.b = str2;
        }
    }

    public static class d implements sn.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final qn.b0 f26443a;
        public final qn.b0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f26444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f26445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f26446e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f26447f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final sn.h f26448g;

        @Override // sn.d
        public qn.b0 a() {
            return this.f26443a;
        }

        @Override // sn.d
        public String b() {
            return this.f26447f;
        }

        @Override // sn.d
        public String c() {
            return this.f26445d;
        }

        @Override // sn.d
        public String d() {
            return this.f26444c;
        }

        @Override // sn.d
        public String e() {
            return this.f26446e;
        }

        public d(qn.b0 b0Var, qn.b0 b0Var2, String str, String str2, String str3, String str4, sn.h hVar) {
            this.f26443a = b0Var;
            this.b = b0Var2;
            this.f26444c = str;
            this.f26445d = str2;
            this.f26446e = str3;
            this.f26447f = str4;
            this.f26448g = hVar;
        }
    }

    public u(rn.c cVar) {
        this.f26428a = cVar;
        List<sn.b> listH = h(cVar.e());
        this.b = listH;
        Map<Character, un.a> mapG = g(cVar.c());
        this.f26429c = mapG;
        this.f26430d = j(cVar.b());
        BitSet bitSetI = i(cVar.d());
        this.f26432f = bitSetI;
        this.f26431e = k(bitSetI, mapG.keySet(), listH);
    }

    public static String A(sn.i iVar) {
        sn.h hVarO = iVar.o();
        if (!pn.e.e(iVar)) {
            return null;
        }
        String strC = iVar.d(hVarO, iVar.o()).c();
        return pn.c.e(strC.substring(1, strC.length() - 1));
    }

    public static /* synthetic */ List c(Character ch2) {
        return new ArrayList();
    }

    public static void e(char c10, un.a aVar, Map<Character, un.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void f(Iterable<un.a> iterable, Map<Character, un.a> map) {
        a0 a0Var;
        for (un.a aVar : iterable) {
            char cD = aVar.d();
            char cB = aVar.b();
            if (cD == cB) {
                un.a aVar2 = map.get(Character.valueOf(cD));
                if (aVar2 == null || aVar2.d() != aVar2.b()) {
                    e(cD, aVar, map);
                } else {
                    if (aVar2 instanceof a0) {
                        a0Var = (a0) aVar2;
                    } else {
                        a0 a0Var2 = new a0(cD);
                        a0Var2.e(aVar2);
                        a0Var = a0Var2;
                    }
                    a0Var.e(aVar);
                    map.put(Character.valueOf(cD), a0Var);
                }
            } else {
                e(cD, aVar, map);
                e(cB, aVar, map);
            }
        }
    }

    public static Map<Character, un.a> g(List<un.a> list) {
        HashMap map = new HashMap();
        f(j.a(new Object[]{new on.a(), new on.m()}), map);
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

    public static BitSet k(BitSet bitSet, Set<Character> set, List<sn.b> list) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet2.set(it.next().charValue());
        }
        Iterator<sn.b> it2 = list.iterator();
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

    public static c t(sn.i iVar) {
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

    public static String v(sn.i iVar) {
        String strC;
        char cL = iVar.l();
        sn.h hVarO = iVar.o();
        if (!pn.e.b(iVar)) {
            return null;
        }
        if (cL == '<') {
            String strC2 = iVar.d(hVarO, iVar.o()).c();
            strC = strC2.substring(1, strC2.length() - 1);
        } else {
            strC = iVar.d(hVarO, iVar.o()).c();
        }
        return pn.c.e(strC);
    }

    public static String x(sn.i iVar) {
        if (!iVar.i('[')) {
            return null;
        }
        sn.h hVarO = iVar.o();
        if (!pn.e.d(iVar)) {
            return null;
        }
        sn.h hVarO2 = iVar.o();
        if (!iVar.i(']')) {
            return null;
        }
        String strC = iVar.d(hVarO, hVarO2).c();
        if (strC.length() > 999) {
            return null;
        }
        return strC;
    }

    public final qn.s B() {
        sn.h hVarO = this.f26434h.o();
        this.f26434h.h();
        sn.h hVarO2 = this.f26434h.o();
        qn.b0 b0VarM = M(this.f26434h.d(hVarO, hVarO2));
        d(e.a(b0VarM, hVarO, hVarO2, this.f26438l, this.f26437k));
        return b0VarM;
    }

    public final qn.s C() {
        char cL;
        sn.h hVarO = this.f26434h.o();
        this.f26434h.h();
        while (true) {
            cL = this.f26434h.l();
            if (cL == 0 || this.f26431e.get(cL)) {
                break;
            }
            this.f26434h.h();
        }
        sn.i iVar = this.f26434h;
        rn.j jVarD = iVar.d(hVarO, iVar.o());
        String strC = jVarD.c();
        if (cL == '\n') {
            int iJ = vn.d.j(' ', strC, strC.length() - 1, 0) + 1;
            this.f26436j = strC.length() - iJ;
            strC = strC.substring(0, iJ);
        } else if (cL == 0) {
            strC = strC.substring(0, vn.d.l(strC, strC.length() - 1, 0) + 1);
        }
        qn.b0 b0Var = new qn.b0(strC);
        b0Var.l(jVarD.e());
        return b0Var;
    }

    public final void D(g gVar) {
        boolean z10;
        HashMap map = new HashMap();
        g gVar2 = this.f26437k;
        while (gVar2 != null) {
            g gVar3 = gVar2.f26387f;
            if (gVar3 == gVar) {
                break;
            } else {
                gVar2 = gVar3;
            }
        }
        while (gVar2 != null) {
            char c10 = gVar2.b;
            un.a aVar = this.f26429c.get(Character.valueOf(c10));
            if (!gVar2.c() || aVar == null) {
                gVar2 = gVar2.f26388g;
            } else {
                char cD = aVar.d();
                g gVar4 = gVar2.f26387f;
                int iA = 0;
                boolean z11 = false;
                while (true) {
                    if (gVar4 == null || gVar4 == gVar || gVar4 == map.get(Character.valueOf(c10))) {
                        z10 = false;
                        break;
                    }
                    if (gVar4.g() && gVar4.b == cD) {
                        iA = aVar.a(gVar4, gVar2);
                        if (iA > 0) {
                            z10 = true;
                            z11 = true;
                            break;
                        }
                        z11 = true;
                    }
                    gVar4 = gVar4.f26387f;
                }
                if (z10) {
                    for (int i10 = 0; i10 < iA; i10++) {
                        List<qn.b0> list = gVar4.f26383a;
                        list.remove(list.size() - 1).n();
                    }
                    for (int i11 = 0; i11 < iA; i11++) {
                        gVar2.f26383a.remove(0).n();
                    }
                    H(gVar4, gVar2);
                    if (gVar4.length() == 0) {
                        F(gVar4);
                    }
                    if (gVar2.length() == 0) {
                        g gVar5 = gVar2.f26388g;
                        F(gVar2);
                        gVar2 = gVar5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c10), gVar2.f26387f);
                        if (!gVar2.g()) {
                            G(gVar2);
                        }
                    }
                    gVar2 = gVar2.f26388g;
                }
            }
        }
        while (true) {
            g gVar6 = this.f26437k;
            if (gVar6 == null || gVar6 == gVar) {
                return;
            } else {
                G(gVar6);
            }
        }
    }

    public final void E(g gVar) {
        g gVar2 = gVar.f26387f;
        if (gVar2 != null) {
            gVar2.f26388g = gVar.f26388g;
        }
        g gVar3 = gVar.f26388g;
        if (gVar3 == null) {
            this.f26437k = gVar2;
        } else {
            gVar3.f26387f = gVar2;
        }
    }

    public final void F(g gVar) {
        E(gVar);
    }

    public final void G(g gVar) {
        E(gVar);
    }

    public final void H(g gVar, g gVar2) {
        g gVar3 = gVar2.f26387f;
        while (gVar3 != null && gVar3 != gVar) {
            g gVar4 = gVar3.f26387f;
            G(gVar3);
            gVar3 = gVar4;
        }
    }

    public final void I() {
        this.f26438l = this.f26438l.f26378f;
    }

    public final qn.s J(e eVar, qn.s sVar, boolean z10) {
        qn.s sVar2;
        sn.h hVar;
        while (true) {
            g gVar = this.f26437k;
            if (gVar == null || gVar == eVar.f26379g) {
                break;
            }
            G(gVar);
        }
        if (this.f26435i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f26376d;
            }
            sn.i iVar = this.f26434h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        I();
        if (!z10 || (sVar2 = eVar.f26374a) == null) {
            sVar2 = eVar.f26375c;
        }
        while (sVar2 != null) {
            qn.s sVarF = sVar2.f();
            sVar2.n();
            sVar2 = sVarF;
        }
        if (eVar.f26374a != null && z10) {
            return sVar;
        }
        m();
        return sVar;
    }

    public void K(rn.j jVar) {
        this.f26434h = sn.i.k(jVar);
        this.f26435i = !jVar.e().isEmpty();
        this.f26436j = 0;
        this.f26437k = null;
        this.f26438l = null;
        this.f26433g = l();
    }

    public final b L(un.a aVar, char c10) {
        boolean z10;
        int iN = this.f26434h.n();
        sn.h hVarO = this.f26434h.o();
        if (this.f26434h.g(c10) < aVar.c()) {
            this.f26434h.q(hVarO);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f26434h.q(hVarO);
        while (this.f26434h.i(c10)) {
            sn.i iVar = this.f26434h;
            arrayList.add(M(iVar.d(hVarO, iVar.o())));
            hVarO = this.f26434h.o();
        }
        int iM = this.f26434h.m();
        boolean z11 = true;
        boolean z12 = iN == 0 || vn.d.f(iN);
        boolean z13 = iN == 0 || vn.d.h(iN);
        boolean z14 = iM == 0 || vn.d.f(iM);
        boolean z15 = iM == 0 || vn.d.h(iM);
        boolean z16 = !z15 && (!z14 || z13 || z12);
        boolean z17 = !z13 && (!z12 || z15 || z14);
        if (c10 == '_') {
            z10 = z16 && (!z17 || z12);
            if (!z17 || (z16 && !z14)) {
                z11 = false;
            }
        } else {
            boolean z18 = z16 && c10 == aVar.d();
            z11 = z17 && c10 == aVar.b();
            z10 = z18;
        }
        return new b(arrayList, z10, z11);
    }

    public final qn.b0 M(rn.j jVar) {
        qn.b0 b0Var = new qn.b0(jVar.c());
        b0Var.l(jVar.e());
        return b0Var;
    }

    public final qn.s N(e eVar, qn.s sVar, boolean z10) {
        qn.b0 b0Var;
        sn.h hVar;
        qn.s sVarF = eVar.f26375c.f();
        while (sVarF != null) {
            qn.s sVarF2 = sVarF.f();
            sVar.c(sVarF);
            sVarF = sVarF2;
        }
        if (this.f26435i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f26376d;
            }
            sn.i iVar = this.f26434h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        D(eVar.f26379g);
        n(sVar);
        if (z10 && (b0Var = eVar.f26374a) != null) {
            b0Var.n();
        }
        eVar.f26375c.n();
        I();
        if (eVar.f26374a == null) {
            m();
        }
        return sVar;
    }

    @Override // sn.c
    public sn.i a() {
        return this.f26434h;
    }

    @Override // rn.b
    public void b(rn.j jVar, qn.s sVar) {
        K(jVar);
        while (true) {
            List<? extends qn.s> listS = s();
            if (listS == null) {
                D(null);
                n(sVar);
                return;
            } else {
                Iterator<? extends qn.s> it = listS.iterator();
                while (it.hasNext()) {
                    sVar.c(it.next());
                }
            }
        }
    }

    public final void d(e eVar) {
        e eVar2 = this.f26438l;
        if (eVar2 != null) {
            eVar2.f26381i = true;
        }
        this.f26438l = eVar;
    }

    public final List<sn.b> h(List<sn.b> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new on.e.a());
        arrayList.add(new on.f.a());
        arrayList.add(new on.i.a());
        arrayList.add(new on.d.a());
        arrayList.add(new on.j.a());
        return arrayList;
    }

    public final List<sn.e> j(List<sn.e> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new on.g());
        return arrayList;
    }

    public final Map<Character, List<sn.a>> l() {
        HashMap map = new HashMap();
        for (sn.b bVar : this.b) {
            sn.a aVarA = bVar.a();
            Iterator<Character> it = bVar.b().iterator();
            while (it.hasNext()) {
                ((List) map.computeIfAbsent(it.next(), new Function() { // from class: nn.t
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
        for (e eVar = this.f26438l; eVar != null; eVar = eVar.f26378f) {
            if (eVar.f26374a == null) {
                eVar.f26380h = false;
            }
        }
    }

    public final void n(qn.s sVar) {
        if (sVar.d() == null) {
            return;
        }
        p(sVar.d(), sVar.e());
    }

    public final void o(qn.b0 b0Var, qn.b0 b0Var2, int i10) {
        qn.z zVar;
        if (b0Var == null || b0Var2 == null || b0Var == b0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(b0Var.o());
        if (this.f26435i) {
            zVar = new qn.z();
            zVar.a(b0Var.h());
        } else {
            zVar = null;
        }
        qn.s sVarF = b0Var.f();
        qn.s sVarF2 = b0Var2.f();
        while (sVarF != sVarF2) {
            sb2.append(((qn.b0) sVarF).o());
            if (zVar != null) {
                zVar.a(sVarF.h());
            }
            qn.s sVarF3 = sVarF.f();
            sVarF.n();
            sVarF = sVarF3;
        }
        b0Var.p(sb2.toString());
        if (zVar != null) {
            b0Var.l(zVar.d());
        }
    }

    public final void p(qn.s sVar, qn.s sVar2) {
        qn.b0 b0Var = null;
        qn.b0 b0Var2 = null;
        int length = 0;
        while (sVar != null) {
            if (sVar instanceof qn.b0) {
                b0Var2 = (qn.b0) sVar;
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

    public final qn.s q() {
        sn.h hVarO = this.f26434h.o();
        this.f26434h.h();
        sn.h hVarO2 = this.f26434h.o();
        e eVar = this.f26438l;
        if (eVar == null) {
            return M(this.f26434h.d(hVarO, hVarO2));
        }
        if (!eVar.f26380h) {
            I();
            return M(this.f26434h.d(hVarO, hVarO2));
        }
        qn.s sVarZ = z(eVar, hVarO);
        if (sVarZ != null) {
            return sVarZ;
        }
        this.f26434h.q(hVarO2);
        I();
        return M(this.f26434h.d(hVarO, hVarO2));
    }

    public final List<? extends qn.s> r(un.a aVar, char c10) {
        b bVarL = L(aVar, c10);
        if (bVarL == null) {
            return null;
        }
        List<qn.b0> list = bVarL.f26440a;
        g gVar = new g(list, c10, bVarL.f26441c, bVarL.b, this.f26437k);
        this.f26437k = gVar;
        g gVar2 = gVar.f26387f;
        if (gVar2 != null) {
            gVar2.f26388g = gVar;
        }
        return list;
    }

    public final List<? extends qn.s> s() {
        List<? extends qn.s> listR;
        char cL = this.f26434h.l();
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
        if (this.f26432f.get(cL)) {
            sn.h hVarO = this.f26434h.o();
            List<? extends qn.s> listY = y();
            if (listY != null) {
                return listY;
            }
            this.f26434h.q(hVarO);
        }
        if (!this.f26431e.get(cL)) {
            return j.a(new Object[]{C()});
        }
        List<sn.a> list = this.f26433g.get(Character.valueOf(cL));
        if (list != null) {
            sn.h hVarO2 = this.f26434h.o();
            Iterator<sn.a> it = list.iterator();
            while (it.hasNext()) {
                sn.g gVarA = it.next().a(this);
                if (gVarA instanceof on.l) {
                    on.l lVar = (on.l) gVarA;
                    qn.s sVarC = lVar.c();
                    this.f26434h.q(lVar.d());
                    if (this.f26435i && sVarC.h().isEmpty()) {
                        sn.i iVar = this.f26434h;
                        sVarC.l(iVar.d(hVarO2, iVar.o()).e());
                    }
                    return j.a(new Object[]{sVarC});
                }
                this.f26434h.q(hVarO2);
            }
        }
        un.a aVar = this.f26429c.get(Character.valueOf(cL));
        return (aVar == null || (listR = r(aVar, cL)) == null) ? j.a(new Object[]{C()}) : listR;
    }

    public final qn.s u() {
        this.f26434h.h();
        boolean z10 = this.f26436j >= 2;
        this.f26436j = 0;
        return z10 ? new qn.i() : new qn.x();
    }

    public final sn.d w(e eVar, sn.h hVar) {
        sn.h hVarO = this.f26434h.o();
        c cVarT = t(this.f26434h);
        if (cVarT != null) {
            return new d(eVar.f26374a, eVar.f26375c, this.f26434h.d(eVar.f26377e, hVar).c(), null, cVarT.f26442a, cVarT.b, hVarO);
        }
        this.f26434h.q(hVarO);
        String strX = x(this.f26434h);
        if (strX == null) {
            this.f26434h.q(hVarO);
        }
        boolean z10 = strX == null || strX.isEmpty();
        if (eVar.f26381i && z10 && eVar.f26374a == null) {
            return null;
        }
        return new d(eVar.f26374a, eVar.f26375c, this.f26434h.d(eVar.f26377e, hVar).c(), strX, null, null, hVarO);
    }

    public final List<? extends qn.s> y() {
        sn.h hVarO = this.f26434h.o();
        this.f26434h.h();
        sn.h hVarO2 = this.f26434h.o();
        if (!this.f26434h.i('[')) {
            return null;
        }
        sn.h hVarO3 = this.f26434h.o();
        qn.b0 b0VarM = M(this.f26434h.d(hVarO, hVarO2));
        qn.b0 b0VarM2 = M(this.f26434h.d(hVarO2, hVarO3));
        d(e.b(b0VarM, hVarO, b0VarM2, hVarO2, hVarO3, this.f26438l, this.f26437k));
        return j.a(new Object[]{b0VarM, b0VarM2});
    }

    public final qn.s z(e eVar, sn.h hVar) {
        sn.d dVarW = w(eVar, hVar);
        if (dVarW == null) {
            return null;
        }
        sn.h hVarO = this.f26434h.o();
        Iterator<sn.e> it = this.f26430d.iterator();
        while (it.hasNext()) {
            sn.f fVarA = it.next().a(dVarW, this.f26434h, this.f26428a);
            if (fVarA instanceof on.k) {
                on.k kVar = (on.k) fVarA;
                qn.s sVarD = kVar.d();
                sn.h hVarE = kVar.e();
                boolean zG = kVar.g();
                int i10 = a.f26439a[kVar.f().ordinal()];
                if (i10 == 1) {
                    this.f26434h.q(hVarE);
                    return N(eVar, sVarD, zG);
                }
                if (i10 == 2) {
                    this.f26434h.q(hVarE);
                    return J(eVar, sVarD, zG);
                }
            } else {
                this.f26434h.q(hVarO);
            }
        }
        return null;
    }
}
