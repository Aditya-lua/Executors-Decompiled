package nn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import qn.c0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements tn.h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set<Class<? extends qn.a>> f26390v = new LinkedHashSet(j.a(new Object[]{qn.b.class, qn.j.class, qn.h.class, qn.k.class, c0.class, qn.q.class, qn.n.class}));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map<Class<? extends qn.a>, tn.e> f26391w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public rn.i f26392a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f26395e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f26399i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<tn.e> f26400j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final rn.d f26401k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<sn.b> f26402l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<un.a> f26403m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<sn.e> f26404n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<Character> f26405o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final rn.a f26406p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f26407q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f26408r;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f26393c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f26394d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f26396f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f26397g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f26398h = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f26409s = new f();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<b> f26410t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<tn.d> f26411u = new ArrayList();

    public static class a implements tn.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tn.d f26412a;

        public a(tn.d dVar) {
            this.f26412a = dVar;
        }

        @Override // tn.g
        public tn.d a() {
            return this.f26412a;
        }

        @Override // tn.g
        public rn.j b() {
            tn.d dVar = this.f26412a;
            return dVar instanceof z ? ((z) dVar).k() : rn.j.b();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final tn.d f26413a;
        public int b;

        public b(tn.d dVar, int i10) {
            this.f26413a = dVar;
            this.b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(qn.b.class, new c.a());
        map.put(qn.j.class, new m.a());
        map.put(qn.h.class, new l.a());
        map.put(qn.k.class, new n.a());
        map.put(c0.class, new b0.a());
        map.put(qn.q.class, new x.a());
        map.put(qn.n.class, new p.a());
        f26391w = Collections.unmodifiableMap(map);
    }

    public k(List<tn.e> list, rn.d dVar, List<sn.b> list2, List<un.a> list3, List<sn.e> list4, Set<Character> set, rn.a aVar, int i10) {
        this.f26400j = list;
        this.f26401k = dVar;
        this.f26402l = list2;
        this.f26403m = list3;
        this.f26404n = list4;
        this.f26405o = set;
        this.f26406p = aVar;
        this.f26407q = i10;
        h hVar = new h();
        this.f26408r = hVar;
        g(new b(hVar, 0));
    }

    public static List<tn.e> m(List<tn.e> list, Set<Class<? extends qn.a>> set) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<Class<? extends qn.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f26391w.get(it.next()));
        }
        return arrayList;
    }

    public static Set<Class<? extends qn.a>> t() {
        return f26390v;
    }

    public static String x(String str) {
        return str.indexOf(0) == -1 ? str : str.replace((char) 0, (char) 65533);
    }

    public final void A(String str, int i10) {
        this.b++;
        this.f26393c = 0;
        this.f26394d = 0;
        this.f26395e = false;
        String strX = x(str);
        this.f26392a = rn.i.c(strX, this.f26406p != rn.a.NONE ? qn.y.e(this.b, 0, i10, strX.length()) : null);
    }

    public final void B(int i10) {
        int i11;
        int i12 = this.f26397g;
        if (i10 >= i12) {
            this.f26393c = this.f26396f;
            this.f26394d = i12;
        }
        int length = this.f26392a.a().length();
        while (true) {
            i11 = this.f26394d;
            if (i11 >= i10 || this.f26393c == length) {
                break;
            } else {
                l();
            }
        }
        if (i11 <= i10) {
            this.f26395e = false;
            return;
        }
        this.f26393c--;
        this.f26394d = i10;
        this.f26395e = true;
    }

    public final void C(int i10) {
        int i11 = this.f26396f;
        if (i10 >= i11) {
            this.f26393c = i11;
            this.f26394d = this.f26397g;
        }
        int length = this.f26392a.a().length();
        while (true) {
            int i12 = this.f26393c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                l();
            }
        }
        this.f26395e = false;
    }

    @Override // tn.h
    public boolean a() {
        return this.f26399i;
    }

    @Override // tn.h
    public rn.i b() {
        return this.f26392a;
    }

    @Override // tn.h
    public int c() {
        return this.f26394d;
    }

    @Override // tn.h
    public int d() {
        return this.f26398h;
    }

    @Override // tn.h
    public int e() {
        return this.f26396f;
    }

    @Override // tn.h
    public tn.d f() {
        List<b> list = this.f26410t;
        return list.get(list.size() - 1).f26413a;
    }

    public final void g(b bVar) {
        this.f26410t.add(bVar);
    }

    @Override // tn.h
    public int getIndex() {
        return this.f26393c;
    }

    public final void h(b bVar) {
        while (!f().e(bVar.f26413a.d())) {
            n(1);
        }
        f().d().c(bVar.f26413a.d());
        g(bVar);
    }

    public final void i(tn.d dVar) {
        Iterator<qn.e<?>> it = dVar.j().iterator();
        while (it.hasNext()) {
            this.f26409s.a(it.next());
        }
    }

    public final void j() {
        CharSequence charSequenceA;
        if (this.f26395e) {
            CharSequence charSequenceSubSequence = this.f26392a.a().subSequence(this.f26393c + 1, this.f26392a.a().length());
            int iA = pn.f.a(this.f26394d);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence.length() + iA);
            for (int i10 = 0; i10 < iA; i10++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence);
            charSequenceA = sb2.toString();
        } else {
            charSequenceA = this.f26393c == 0 ? this.f26392a.a() : this.f26392a.a().subSequence(this.f26393c, this.f26392a.a().length());
        }
        f().g(rn.i.c(charSequenceA, (this.f26406p != rn.a.BLOCKS_AND_INLINES || this.f26393c >= this.f26392a.b().c()) ? null : this.f26392a.b().f(this.f26393c)));
        k();
    }

    public final void k() {
        if (this.f26406p != rn.a.NONE) {
            for (int i10 = 1; i10 < this.f26410t.size(); i10++) {
                b bVar = this.f26410t.get(i10);
                int iMin = Math.min(bVar.b, this.f26393c);
                if (this.f26392a.a().length() - iMin != 0) {
                    bVar.f26413a.i(this.f26392a.b().f(iMin));
                }
            }
        }
    }

    public final void l() {
        char cCharAt = this.f26392a.a().charAt(this.f26393c);
        this.f26393c++;
        if (cCharAt != '\t') {
            this.f26394d++;
        } else {
            int i10 = this.f26394d;
            this.f26394d = i10 + pn.f.a(i10);
        }
    }

    public final void n(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            tn.d dVar = o().f26413a;
            p(dVar);
            this.f26411u.add(dVar);
        }
    }

    public final b o() {
        List<b> list = this.f26410t;
        return list.remove(list.size() - 1);
    }

    public final void p(tn.d dVar) {
        i(dVar);
        dVar.h();
    }

    public final qn.f q() {
        n(this.f26410t.size());
        y();
        return this.f26408r.d();
    }

    public final d r(tn.d dVar) {
        if (this.f26410t.size() > this.f26407q) {
            return null;
        }
        a aVar = new a(dVar);
        Iterator<tn.e> it = this.f26400j.iterator();
        while (it.hasNext()) {
            tn.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    public final void s() {
        int i10 = this.f26393c;
        int i11 = this.f26394d;
        this.f26399i = true;
        int length = this.f26392a.a().length();
        while (i10 < length) {
            char cCharAt = this.f26392a.a().charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f26399i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f26396f = i10;
        this.f26397g = i11;
        this.f26398h = i11 - this.f26394d;
    }

    public qn.f u(String str) {
        int i10 = 0;
        while (true) {
            int iB = vn.d.b(str, i10);
            if (iB == -1) {
                break;
            }
            v(str.substring(i10, iB), i10);
            i10 = iB + 1;
            if (i10 < str.length() && str.charAt(iB) == '\r' && str.charAt(i10) == '\n') {
                i10 = iB + 2;
            }
        }
        if (!str.isEmpty() && (i10 == 0 || i10 < str.length())) {
            v(str.substring(i10), i10);
        }
        return q();
    }

    /* JADX WARN: Code duplicated, block: B:60:0x0116  */
    public final void v(String str, int i10) {
        List<qn.y> listW;
        A(str, i10);
        int i11 = 1;
        for (int i12 = 1; i12 < this.f26410t.size(); i12++) {
            b bVar = this.f26410t.get(i12);
            tn.d dVar = bVar.f26413a;
            s();
            tn.c cVarB = dVar.b(this);
            if (!(cVarB instanceof nn.b)) {
                break;
            }
            nn.b bVar2 = (nn.b) cVarB;
            bVar.b = getIndex();
            if (bVar2.g()) {
                k();
                n(this.f26410t.size() - i12);
                return;
            }
            if (bVar2.f() != -1) {
                C(bVar2.f());
            } else if (bVar2.e() != -1) {
                B(bVar2.e());
            }
            i11++;
        }
        int size = this.f26410t.size() - i11;
        dVar = this.f26410t.get(i11 - 1).f26413a;
        int i13 = this.f26393c;
        boolean zA = (dVar.d() instanceof qn.w) || dVar.a();
        boolean z10 = false;
        while (zA) {
            i13 = this.f26393c;
            s();
            if (a() || (this.f26398h < pn.f.f28739a && vn.d.e(this.f26392a.a(), this.f26396f))) {
                C(this.f26396f);
                break;
            }
            d dVarR = r(dVar);
            if (dVarR == null) {
                C(this.f26396f);
                break;
            }
            int index = getIndex();
            if (size > 0) {
                n(size);
                size = 0;
            }
            if (dVarR.h() != -1) {
                C(dVarR.h());
            } else if (dVarR.g() != -1) {
                B(dVarR.g());
            }
            if (dVarR.i() >= 1 || dVarR.j()) {
                tn.d dVarF = f();
                if (dVarF instanceof z) {
                    listW = z(dVarR.j() ? Integer.MAX_VALUE : dVarR.i(), (z) dVarF);
                } else if (dVarR.j()) {
                    listW = w(dVarF);
                } else {
                    listW = null;
                }
            } else {
                listW = null;
            }
            for (tn.d dVar2 : dVarR.f()) {
                h(new b(dVar2, index));
                if (listW != null) {
                    dVar2.d().l(listW);
                }
                zA = dVar2.a();
            }
            z10 = true;
        }
        if (!z10 && !a() && f().c()) {
            List<b> list = this.f26410t;
            list.get(list.size() - 1).b = i13;
            j();
            return;
        }
        if (size > 0) {
            n(size);
        }
        if (!dVar2.a()) {
            j();
        } else if (a()) {
            k();
        } else {
            h(new b(new z(), i13));
            j();
        }
    }

    public final List<qn.y> w(tn.d dVar) {
        o();
        dVar.h();
        dVar.d().n();
        return dVar.d().h();
    }

    public final void y() {
        rn.b bVarA = this.f26401k.a(new q(this.f26402l, this.f26403m, this.f26404n, this.f26405o, this.f26409s));
        Iterator<tn.d> it = this.f26411u.iterator();
        while (it.hasNext()) {
            it.next().f(bVarA);
        }
    }

    public final List<qn.y> z(int i10, z zVar) {
        List<qn.y> listL = zVar.l(i10);
        n(1);
        return listL;
    }
}
