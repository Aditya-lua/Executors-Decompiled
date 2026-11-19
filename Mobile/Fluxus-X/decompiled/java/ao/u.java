package ao;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;

/* JADX INFO: loaded from: classes3.dex */
public class u implements fo.b, go.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fo.c f3120a;
    public final List<go.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Character, io.a> f3121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<go.e> f3122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final BitSet f3123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final BitSet f3124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Map<Character, List<go.a>> f3125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public go.i f3126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f3128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g f3129k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e f3130l;

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3131a;

        static {
            int[] iArr = new int[bo.k.a.values().length];
            f3131a = iArr;
            try {
                iArr[bo.k.a.WRAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3131a[bo.k.a.REPLACE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<eo.b0> f3132a;
        public final boolean b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f3133c;

        public b(List<eo.b0> list, boolean z10, boolean z11) {
            this.f3132a = list;
            this.f3133c = z10;
            this.b = z11;
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f3134a;
        public final String b;

        public c(String str, String str2) {
            this.f3134a = str;
            this.b = str2;
        }
    }

    public static class d implements go.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final eo.b0 f3135a;
        public final eo.b0 b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f3136c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f3137d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f3138e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f3139f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final go.h f3140g;

        @Override // go.d
        public eo.b0 a() {
            return this.f3135a;
        }

        @Override // go.d
        public String b() {
            return this.f3139f;
        }

        @Override // go.d
        public String c() {
            return this.f3137d;
        }

        @Override // go.d
        public String d() {
            return this.f3136c;
        }

        @Override // go.d
        public String e() {
            return this.f3138e;
        }

        public d(eo.b0 b0Var, eo.b0 b0Var2, String str, String str2, String str3, String str4, go.h hVar) {
            this.f3135a = b0Var;
            this.b = b0Var2;
            this.f3136c = str;
            this.f3137d = str2;
            this.f3138e = str3;
            this.f3139f = str4;
            this.f3140g = hVar;
        }
    }

    public u(fo.c cVar) {
        this.f3120a = cVar;
        List<go.b> listH = h(cVar.e());
        this.b = listH;
        Map<Character, io.a> mapG = g(cVar.c());
        this.f3121c = mapG;
        this.f3122d = j(cVar.b());
        BitSet bitSetI = i(cVar.d());
        this.f3124f = bitSetI;
        this.f3123e = k(bitSetI, mapG.keySet(), listH);
    }

    public static String A(go.i iVar) {
        go.h hVarO = iVar.o();
        if (!co.e.e(iVar)) {
            return null;
        }
        String strC = iVar.d(hVarO, iVar.o()).c();
        return co.c.e(strC.substring(1, strC.length() - 1));
    }

    public static /* synthetic */ List c(Character ch2) {
        return new ArrayList();
    }

    public static void e(char c10, io.a aVar, Map<Character, io.a> map) {
        if (map.put(Character.valueOf(c10), aVar) == null) {
            return;
        }
        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c10 + "'");
    }

    public static void f(Iterable<io.a> iterable, Map<Character, io.a> map) {
        a0 a0Var;
        for (io.a aVar : iterable) {
            char cD = aVar.d();
            char cB = aVar.b();
            if (cD == cB) {
                io.a aVar2 = map.get(Character.valueOf(cD));
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

    public static Map<Character, io.a> g(List<io.a> list) {
        HashMap map = new HashMap();
        f(j.a(new Object[]{new bo.a(), new bo.m()}), map);
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

    public static BitSet k(BitSet bitSet, Set<Character> set, List<go.b> list) {
        BitSet bitSet2 = (BitSet) bitSet.clone();
        Iterator<Character> it = set.iterator();
        while (it.hasNext()) {
            bitSet2.set(it.next().charValue());
        }
        Iterator<go.b> it2 = list.iterator();
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

    public static c t(go.i iVar) {
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

    public static String v(go.i iVar) {
        String strC;
        char cL = iVar.l();
        go.h hVarO = iVar.o();
        if (!co.e.b(iVar)) {
            return null;
        }
        if (cL == '<') {
            String strC2 = iVar.d(hVarO, iVar.o()).c();
            strC = strC2.substring(1, strC2.length() - 1);
        } else {
            strC = iVar.d(hVarO, iVar.o()).c();
        }
        return co.c.e(strC);
    }

    public static String x(go.i iVar) {
        if (!iVar.i('[')) {
            return null;
        }
        go.h hVarO = iVar.o();
        if (!co.e.d(iVar)) {
            return null;
        }
        go.h hVarO2 = iVar.o();
        if (!iVar.i(']')) {
            return null;
        }
        String strC = iVar.d(hVarO, hVarO2).c();
        if (strC.length() > 999) {
            return null;
        }
        return strC;
    }

    public final eo.s B() {
        go.h hVarO = this.f3126h.o();
        this.f3126h.h();
        go.h hVarO2 = this.f3126h.o();
        eo.b0 b0VarM = M(this.f3126h.d(hVarO, hVarO2));
        d(e.a(b0VarM, hVarO, hVarO2, this.f3130l, this.f3129k));
        return b0VarM;
    }

    public final eo.s C() {
        char cL;
        go.h hVarO = this.f3126h.o();
        this.f3126h.h();
        while (true) {
            cL = this.f3126h.l();
            if (cL == 0 || this.f3123e.get(cL)) {
                break;
            }
            this.f3126h.h();
        }
        go.i iVar = this.f3126h;
        fo.j jVarD = iVar.d(hVarO, iVar.o());
        String strC = jVarD.c();
        if (cL == '\n') {
            int iJ = jo.d.j(' ', strC, strC.length() - 1, 0) + 1;
            this.f3128j = strC.length() - iJ;
            strC = strC.substring(0, iJ);
        } else if (cL == 0) {
            strC = strC.substring(0, jo.d.l(strC, strC.length() - 1, 0) + 1);
        }
        eo.b0 b0Var = new eo.b0(strC);
        b0Var.l(jVarD.e());
        return b0Var;
    }

    public final void D(g gVar) {
        boolean z10;
        HashMap map = new HashMap();
        g gVar2 = this.f3129k;
        while (gVar2 != null) {
            g gVar3 = gVar2.f3079f;
            if (gVar3 == gVar) {
                break;
            } else {
                gVar2 = gVar3;
            }
        }
        while (gVar2 != null) {
            char c10 = gVar2.b;
            io.a aVar = this.f3121c.get(Character.valueOf(c10));
            if (!gVar2.c() || aVar == null) {
                gVar2 = gVar2.f3080g;
            } else {
                char cD = aVar.d();
                g gVar4 = gVar2.f3079f;
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
                    gVar4 = gVar4.f3079f;
                }
                if (z10) {
                    for (int i10 = 0; i10 < iA; i10++) {
                        List<eo.b0> list = gVar4.f3075a;
                        list.remove(list.size() - 1).n();
                    }
                    for (int i11 = 0; i11 < iA; i11++) {
                        gVar2.f3075a.remove(0).n();
                    }
                    H(gVar4, gVar2);
                    if (gVar4.length() == 0) {
                        F(gVar4);
                    }
                    if (gVar2.length() == 0) {
                        g gVar5 = gVar2.f3080g;
                        F(gVar2);
                        gVar2 = gVar5;
                    }
                } else {
                    if (!z11) {
                        map.put(Character.valueOf(c10), gVar2.f3079f);
                        if (!gVar2.g()) {
                            G(gVar2);
                        }
                    }
                    gVar2 = gVar2.f3080g;
                }
            }
        }
        while (true) {
            g gVar6 = this.f3129k;
            if (gVar6 == null || gVar6 == gVar) {
                return;
            } else {
                G(gVar6);
            }
        }
    }

    public final void E(g gVar) {
        g gVar2 = gVar.f3079f;
        if (gVar2 != null) {
            gVar2.f3080g = gVar.f3080g;
        }
        g gVar3 = gVar.f3080g;
        if (gVar3 == null) {
            this.f3129k = gVar2;
        } else {
            gVar3.f3079f = gVar2;
        }
    }

    public final void F(g gVar) {
        E(gVar);
    }

    public final void G(g gVar) {
        E(gVar);
    }

    public final void H(g gVar, g gVar2) {
        g gVar3 = gVar2.f3079f;
        while (gVar3 != null && gVar3 != gVar) {
            g gVar4 = gVar3.f3079f;
            G(gVar3);
            gVar3 = gVar4;
        }
    }

    public final void I() {
        this.f3130l = this.f3130l.f3070f;
    }

    public final eo.s J(e eVar, eo.s sVar, boolean z10) {
        eo.s sVar2;
        go.h hVar;
        while (true) {
            g gVar = this.f3129k;
            if (gVar == null || gVar == eVar.f3071g) {
                break;
            }
            G(gVar);
        }
        if (this.f3127i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f3068d;
            }
            go.i iVar = this.f3126h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        I();
        if (!z10 || (sVar2 = eVar.f3066a) == null) {
            sVar2 = eVar.f3067c;
        }
        while (sVar2 != null) {
            eo.s sVarF = sVar2.f();
            sVar2.n();
            sVar2 = sVarF;
        }
        if (eVar.f3066a != null && z10) {
            return sVar;
        }
        m();
        return sVar;
    }

    public void K(fo.j jVar) {
        this.f3126h = go.i.k(jVar);
        this.f3127i = !jVar.e().isEmpty();
        this.f3128j = 0;
        this.f3129k = null;
        this.f3130l = null;
        this.f3125g = l();
    }

    public final b L(io.a aVar, char c10) {
        boolean z10;
        int iN = this.f3126h.n();
        go.h hVarO = this.f3126h.o();
        if (this.f3126h.g(c10) < aVar.c()) {
            this.f3126h.q(hVarO);
            return null;
        }
        ArrayList arrayList = new ArrayList();
        this.f3126h.q(hVarO);
        while (this.f3126h.i(c10)) {
            go.i iVar = this.f3126h;
            arrayList.add(M(iVar.d(hVarO, iVar.o())));
            hVarO = this.f3126h.o();
        }
        int iM = this.f3126h.m();
        boolean z11 = true;
        boolean z12 = iN == 0 || jo.d.f(iN);
        boolean z13 = iN == 0 || jo.d.h(iN);
        boolean z14 = iM == 0 || jo.d.f(iM);
        boolean z15 = iM == 0 || jo.d.h(iM);
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

    public final eo.b0 M(fo.j jVar) {
        eo.b0 b0Var = new eo.b0(jVar.c());
        b0Var.l(jVar.e());
        return b0Var;
    }

    public final eo.s N(e eVar, eo.s sVar, boolean z10) {
        eo.b0 b0Var;
        go.h hVar;
        eo.s sVarF = eVar.f3067c.f();
        while (sVarF != null) {
            eo.s sVarF2 = sVarF.f();
            sVar.c(sVarF);
            sVarF = sVarF2;
        }
        if (this.f3127i) {
            if (!z10 || (hVar = eVar.b) == null) {
                hVar = eVar.f3068d;
            }
            go.i iVar = this.f3126h;
            sVar.l(iVar.d(hVar, iVar.o()).e());
        }
        D(eVar.f3071g);
        n(sVar);
        if (z10 && (b0Var = eVar.f3066a) != null) {
            b0Var.n();
        }
        eVar.f3067c.n();
        I();
        if (eVar.f3066a == null) {
            m();
        }
        return sVar;
    }

    @Override // go.c
    public go.i a() {
        return this.f3126h;
    }

    @Override // fo.b
    public void b(fo.j jVar, eo.s sVar) {
        K(jVar);
        while (true) {
            List<? extends eo.s> listS = s();
            if (listS == null) {
                D(null);
                n(sVar);
                return;
            } else {
                Iterator<? extends eo.s> it = listS.iterator();
                while (it.hasNext()) {
                    sVar.c(it.next());
                }
            }
        }
    }

    public final void d(e eVar) {
        e eVar2 = this.f3130l;
        if (eVar2 != null) {
            eVar2.f3073i = true;
        }
        this.f3130l = eVar;
    }

    public final List<go.b> h(List<go.b> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new bo.e.a());
        arrayList.add(new bo.f.a());
        arrayList.add(new bo.i.a());
        arrayList.add(new bo.d.a());
        arrayList.add(new bo.j.a());
        return arrayList;
    }

    public final List<go.e> j(List<go.e> list) {
        ArrayList arrayList = new ArrayList(list);
        arrayList.add(new bo.g());
        return arrayList;
    }

    public final Map<Character, List<go.a>> l() {
        HashMap map = new HashMap();
        for (go.b bVar : this.b) {
            go.a aVarA = bVar.a();
            Iterator<Character> it = bVar.b().iterator();
            while (it.hasNext()) {
                ((List) map.computeIfAbsent(it.next(), new Function() { // from class: ao.t
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
        for (e eVar = this.f3130l; eVar != null; eVar = eVar.f3070f) {
            if (eVar.f3066a == null) {
                eVar.f3072h = false;
            }
        }
    }

    public final void n(eo.s sVar) {
        if (sVar.d() == null) {
            return;
        }
        p(sVar.d(), sVar.e());
    }

    public final void o(eo.b0 b0Var, eo.b0 b0Var2, int i10) {
        eo.z zVar;
        if (b0Var == null || b0Var2 == null || b0Var == b0Var2) {
            return;
        }
        StringBuilder sb2 = new StringBuilder(i10);
        sb2.append(b0Var.o());
        if (this.f3127i) {
            zVar = new eo.z();
            zVar.a(b0Var.h());
        } else {
            zVar = null;
        }
        eo.s sVarF = b0Var.f();
        eo.s sVarF2 = b0Var2.f();
        while (sVarF != sVarF2) {
            sb2.append(((eo.b0) sVarF).o());
            if (zVar != null) {
                zVar.a(sVarF.h());
            }
            eo.s sVarF3 = sVarF.f();
            sVarF.n();
            sVarF = sVarF3;
        }
        b0Var.p(sb2.toString());
        if (zVar != null) {
            b0Var.l(zVar.d());
        }
    }

    public final void p(eo.s sVar, eo.s sVar2) {
        eo.b0 b0Var = null;
        eo.b0 b0Var2 = null;
        int length = 0;
        while (sVar != null) {
            if (sVar instanceof eo.b0) {
                b0Var2 = (eo.b0) sVar;
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

    public final eo.s q() {
        go.h hVarO = this.f3126h.o();
        this.f3126h.h();
        go.h hVarO2 = this.f3126h.o();
        e eVar = this.f3130l;
        if (eVar == null) {
            return M(this.f3126h.d(hVarO, hVarO2));
        }
        if (!eVar.f3072h) {
            I();
            return M(this.f3126h.d(hVarO, hVarO2));
        }
        eo.s sVarZ = z(eVar, hVarO);
        if (sVarZ != null) {
            return sVarZ;
        }
        this.f3126h.q(hVarO2);
        I();
        return M(this.f3126h.d(hVarO, hVarO2));
    }

    public final List<? extends eo.s> r(io.a aVar, char c10) {
        b bVarL = L(aVar, c10);
        if (bVarL == null) {
            return null;
        }
        List<eo.b0> list = bVarL.f3132a;
        g gVar = new g(list, c10, bVarL.f3133c, bVarL.b, this.f3129k);
        this.f3129k = gVar;
        g gVar2 = gVar.f3079f;
        if (gVar2 != null) {
            gVar2.f3080g = gVar;
        }
        return list;
    }

    public final List<? extends eo.s> s() {
        List<? extends eo.s> listR;
        char cL = this.f3126h.l();
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
        if (this.f3124f.get(cL)) {
            go.h hVarO = this.f3126h.o();
            List<? extends eo.s> listY = y();
            if (listY != null) {
                return listY;
            }
            this.f3126h.q(hVarO);
        }
        if (!this.f3123e.get(cL)) {
            return j.a(new Object[]{C()});
        }
        List<go.a> list = this.f3125g.get(Character.valueOf(cL));
        if (list != null) {
            go.h hVarO2 = this.f3126h.o();
            Iterator<go.a> it = list.iterator();
            while (it.hasNext()) {
                go.g gVarA = it.next().a(this);
                if (gVarA instanceof bo.l) {
                    bo.l lVar = (bo.l) gVarA;
                    eo.s sVarC = lVar.c();
                    this.f3126h.q(lVar.d());
                    if (this.f3127i && sVarC.h().isEmpty()) {
                        go.i iVar = this.f3126h;
                        sVarC.l(iVar.d(hVarO2, iVar.o()).e());
                    }
                    return j.a(new Object[]{sVarC});
                }
                this.f3126h.q(hVarO2);
            }
        }
        io.a aVar = this.f3121c.get(Character.valueOf(cL));
        return (aVar == null || (listR = r(aVar, cL)) == null) ? j.a(new Object[]{C()}) : listR;
    }

    public final eo.s u() {
        this.f3126h.h();
        boolean z10 = this.f3128j >= 2;
        this.f3128j = 0;
        return z10 ? new eo.i() : new eo.x();
    }

    public final go.d w(e eVar, go.h hVar) {
        go.h hVarO = this.f3126h.o();
        c cVarT = t(this.f3126h);
        if (cVarT != null) {
            return new d(eVar.f3066a, eVar.f3067c, this.f3126h.d(eVar.f3069e, hVar).c(), null, cVarT.f3134a, cVarT.b, hVarO);
        }
        this.f3126h.q(hVarO);
        String strX = x(this.f3126h);
        if (strX == null) {
            this.f3126h.q(hVarO);
        }
        boolean z10 = strX == null || strX.isEmpty();
        if (eVar.f3073i && z10 && eVar.f3066a == null) {
            return null;
        }
        return new d(eVar.f3066a, eVar.f3067c, this.f3126h.d(eVar.f3069e, hVar).c(), strX, null, null, hVarO);
    }

    public final List<? extends eo.s> y() {
        go.h hVarO = this.f3126h.o();
        this.f3126h.h();
        go.h hVarO2 = this.f3126h.o();
        if (!this.f3126h.i('[')) {
            return null;
        }
        go.h hVarO3 = this.f3126h.o();
        eo.b0 b0VarM = M(this.f3126h.d(hVarO, hVarO2));
        eo.b0 b0VarM2 = M(this.f3126h.d(hVarO2, hVarO3));
        d(e.b(b0VarM, hVarO, b0VarM2, hVarO2, hVarO3, this.f3130l, this.f3129k));
        return j.a(new Object[]{b0VarM, b0VarM2});
    }

    public final eo.s z(e eVar, go.h hVar) {
        go.d dVarW = w(eVar, hVar);
        if (dVarW == null) {
            return null;
        }
        go.h hVarO = this.f3126h.o();
        Iterator<go.e> it = this.f3122d.iterator();
        while (it.hasNext()) {
            go.f fVarA = it.next().a(dVarW, this.f3126h, this.f3120a);
            if (fVarA instanceof bo.k) {
                bo.k kVar = (bo.k) fVarA;
                eo.s sVarD = kVar.d();
                go.h hVarE = kVar.e();
                boolean zG = kVar.g();
                int i10 = a.f3131a[kVar.f().ordinal()];
                if (i10 == 1) {
                    this.f3126h.q(hVarE);
                    return N(eVar, sVarD, zG);
                }
                if (i10 == 2) {
                    this.f3126h.q(hVarE);
                    return J(eVar, sVarD, zG);
                }
            } else {
                this.f3126h.q(hVarO);
            }
        }
        return null;
    }
}
