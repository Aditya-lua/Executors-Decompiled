package ln;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import on.c0;

/* JADX INFO: loaded from: classes3.dex */
public class k implements rn.h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set<Class<? extends on.a>> f23679v = new LinkedHashSet(j.a(new Object[]{on.b.class, on.j.class, on.h.class, on.k.class, c0.class, on.q.class, on.n.class}));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map<Class<? extends on.a>, rn.e> f23680w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public pn.i f23681a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23684e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f23688i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<rn.e> f23689j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final pn.d f23690k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<qn.b> f23691l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<sn.a> f23692m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<qn.e> f23693n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<Character> f23694o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final pn.a f23695p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f23696q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f23697r;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23682c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f23683d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f23685f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f23686g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f23687h = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f23698s = new f();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<b> f23699t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<rn.d> f23700u = new ArrayList();

    public static class a implements rn.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rn.d f23701a;

        public a(rn.d dVar) {
            this.f23701a = dVar;
        }

        @Override // rn.g
        public rn.d a() {
            return this.f23701a;
        }

        @Override // rn.g
        public pn.j b() {
            rn.d dVar = this.f23701a;
            return dVar instanceof z ? ((z) dVar).k() : pn.j.b();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final rn.d f23702a;
        public int b;

        public b(rn.d dVar, int i10) {
            this.f23702a = dVar;
            this.b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(on.b.class, new c.a());
        map.put(on.j.class, new m.a());
        map.put(on.h.class, new l.a());
        map.put(on.k.class, new n.a());
        map.put(c0.class, new b0.a());
        map.put(on.q.class, new x.a());
        map.put(on.n.class, new p.a());
        f23680w = Collections.unmodifiableMap(map);
    }

    public k(List<rn.e> list, pn.d dVar, List<qn.b> list2, List<sn.a> list3, List<qn.e> list4, Set<Character> set, pn.a aVar, int i10) {
        this.f23689j = list;
        this.f23690k = dVar;
        this.f23691l = list2;
        this.f23692m = list3;
        this.f23693n = list4;
        this.f23694o = set;
        this.f23695p = aVar;
        this.f23696q = i10;
        h hVar = new h();
        this.f23697r = hVar;
        g(new b(hVar, 0));
    }

    public static List<rn.e> m(List<rn.e> list, Set<Class<? extends on.a>> set) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<Class<? extends on.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f23680w.get(it.next()));
        }
        return arrayList;
    }

    public static Set<Class<? extends on.a>> t() {
        return f23679v;
    }

    public static String x(String str) {
        return str.indexOf(0) == -1 ? str : str.replace((char) 0, (char) 65533);
    }

    public final void A(String str, int i10) {
        this.b++;
        this.f23682c = 0;
        this.f23683d = 0;
        this.f23684e = false;
        String strX = x(str);
        this.f23681a = pn.i.c(strX, this.f23695p != pn.a.NONE ? on.y.e(this.b, 0, i10, strX.length()) : null);
    }

    public final void B(int i10) {
        int i11;
        int i12 = this.f23686g;
        if (i10 >= i12) {
            this.f23682c = this.f23685f;
            this.f23683d = i12;
        }
        int length = this.f23681a.a().length();
        while (true) {
            i11 = this.f23683d;
            if (i11 >= i10 || this.f23682c == length) {
                break;
            } else {
                l();
            }
        }
        if (i11 <= i10) {
            this.f23684e = false;
            return;
        }
        this.f23682c--;
        this.f23683d = i10;
        this.f23684e = true;
    }

    public final void C(int i10) {
        int i11 = this.f23685f;
        if (i10 >= i11) {
            this.f23682c = i11;
            this.f23683d = this.f23686g;
        }
        int length = this.f23681a.a().length();
        while (true) {
            int i12 = this.f23682c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                l();
            }
        }
        this.f23684e = false;
    }

    @Override // rn.h
    public boolean a() {
        return this.f23688i;
    }

    @Override // rn.h
    public pn.i b() {
        return this.f23681a;
    }

    @Override // rn.h
    public int c() {
        return this.f23683d;
    }

    @Override // rn.h
    public int d() {
        return this.f23687h;
    }

    @Override // rn.h
    public int e() {
        return this.f23685f;
    }

    @Override // rn.h
    public rn.d f() {
        List<b> list = this.f23699t;
        return list.get(list.size() - 1).f23702a;
    }

    public final void g(b bVar) {
        this.f23699t.add(bVar);
    }

    @Override // rn.h
    public int getIndex() {
        return this.f23682c;
    }

    public final void h(b bVar) {
        while (!f().f(bVar.f23702a.g())) {
            n(1);
        }
        f().g().c(bVar.f23702a.g());
        g(bVar);
    }

    public final void i(rn.d dVar) {
        Iterator<on.e<?>> it = dVar.i().iterator();
        while (it.hasNext()) {
            this.f23698s.a(it.next());
        }
    }

    public final void j() {
        CharSequence charSequenceA;
        if (this.f23684e) {
            CharSequence charSequenceSubSequence = this.f23681a.a().subSequence(this.f23682c + 1, this.f23681a.a().length());
            int iA = nn.f.a(this.f23683d);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence.length() + iA);
            for (int i10 = 0; i10 < iA; i10++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence);
            charSequenceA = sb2.toString();
        } else {
            charSequenceA = this.f23682c == 0 ? this.f23681a.a() : this.f23681a.a().subSequence(this.f23682c, this.f23681a.a().length());
        }
        f().a(pn.i.c(charSequenceA, (this.f23695p != pn.a.BLOCKS_AND_INLINES || this.f23682c >= this.f23681a.b().c()) ? null : this.f23681a.b().f(this.f23682c)));
        k();
    }

    public final void k() {
        if (this.f23695p != pn.a.NONE) {
            for (int i10 = 1; i10 < this.f23699t.size(); i10++) {
                b bVar = this.f23699t.get(i10);
                int iMin = Math.min(bVar.b, this.f23682c);
                if (this.f23681a.a().length() - iMin != 0) {
                    bVar.f23702a.d(this.f23681a.b().f(iMin));
                }
            }
        }
    }

    public final void l() {
        char cCharAt = this.f23681a.a().charAt(this.f23682c);
        this.f23682c++;
        if (cCharAt != '\t') {
            this.f23683d++;
        } else {
            int i10 = this.f23683d;
            this.f23683d = i10 + nn.f.a(i10);
        }
    }

    public final void n(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            rn.d dVar = o().f23702a;
            p(dVar);
            this.f23700u.add(dVar);
        }
    }

    public final b o() {
        List<b> list = this.f23699t;
        return list.remove(list.size() - 1);
    }

    public final void p(rn.d dVar) {
        i(dVar);
        dVar.h();
    }

    public final on.f q() {
        n(this.f23699t.size());
        y();
        return this.f23697r.g();
    }

    public final d r(rn.d dVar) {
        if (this.f23699t.size() > this.f23696q) {
            return null;
        }
        a aVar = new a(dVar);
        Iterator<rn.e> it = this.f23689j.iterator();
        while (it.hasNext()) {
            rn.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    public final void s() {
        int i10 = this.f23682c;
        int i11 = this.f23683d;
        this.f23688i = true;
        int length = this.f23681a.a().length();
        while (i10 < length) {
            char cCharAt = this.f23681a.a().charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f23688i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f23685f = i10;
        this.f23686g = i11;
        this.f23687h = i11 - this.f23683d;
    }

    public on.f u(String str) {
        int i10 = 0;
        while (true) {
            int iB = tn.d.b(str, i10);
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
        List<on.y> listW;
        A(str, i10);
        int i11 = 1;
        for (int i12 = 1; i12 < this.f23699t.size(); i12++) {
            b bVar = this.f23699t.get(i12);
            rn.d dVar = bVar.f23702a;
            s();
            rn.c cVarJ = dVar.j(this);
            if (!(cVarJ instanceof ln.b)) {
                break;
            }
            ln.b bVar2 = (ln.b) cVarJ;
            bVar.b = getIndex();
            if (bVar2.g()) {
                k();
                n(this.f23699t.size() - i12);
                return;
            }
            if (bVar2.f() != -1) {
                C(bVar2.f());
            } else if (bVar2.e() != -1) {
                B(bVar2.e());
            }
            i11++;
        }
        int size = this.f23699t.size() - i11;
        dVar = this.f23699t.get(i11 - 1).f23702a;
        int i13 = this.f23682c;
        boolean zB = (dVar.g() instanceof on.w) || dVar.b();
        boolean z10 = false;
        while (zB) {
            i13 = this.f23682c;
            s();
            if (a() || (this.f23687h < nn.f.f27333a && tn.d.e(this.f23681a.a(), this.f23685f))) {
                C(this.f23685f);
                break;
            }
            d dVarR = r(dVar);
            if (dVarR == null) {
                C(this.f23685f);
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
                rn.d dVarF = f();
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
            for (rn.d dVar2 : dVarR.f()) {
                h(new b(dVar2, index));
                if (listW != null) {
                    dVar2.g().l(listW);
                }
                zB = dVar2.b();
            }
            z10 = true;
        }
        if (!z10 && !a() && f().e()) {
            List<b> list = this.f23699t;
            list.get(list.size() - 1).b = i13;
            j();
            return;
        }
        if (size > 0) {
            n(size);
        }
        if (!dVar2.b()) {
            j();
        } else if (a()) {
            k();
        } else {
            h(new b(new z(), i13));
            j();
        }
    }

    public final List<on.y> w(rn.d dVar) {
        o();
        dVar.h();
        dVar.g().n();
        return dVar.g().h();
    }

    public final void y() {
        pn.b bVarA = this.f23690k.a(new q(this.f23691l, this.f23692m, this.f23693n, this.f23694o, this.f23698s));
        Iterator<rn.d> it = this.f23700u.iterator();
        while (it.hasNext()) {
            it.next().c(bVarA);
        }
    }

    public final List<on.y> z(int i10, z zVar) {
        List<on.y> listL = zVar.l(i10);
        n(1);
        return listL;
    }
}
