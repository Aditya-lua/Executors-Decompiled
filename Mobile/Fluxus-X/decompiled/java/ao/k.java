package ao;

import eo.c0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class k implements ho.h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final Set<Class<? extends eo.a>> f3082v = new LinkedHashSet(j.a(new Object[]{eo.b.class, eo.j.class, eo.h.class, eo.k.class, c0.class, eo.q.class, eo.n.class}));

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final Map<Class<? extends eo.a>, ho.e> f3083w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fo.i f3084a;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f3087e;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f3091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List<ho.e> f3092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final fo.d f3093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final List<go.b> f3094l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final List<io.a> f3095m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<go.e> f3096n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Set<Character> f3097o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final fo.a f3098p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final int f3099q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final h f3100r;
    public int b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f3085c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f3086d = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f3088f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f3089g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f3090h = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final f f3101s = new f();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final List<b> f3102t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final List<ho.d> f3103u = new ArrayList();

    public static class a implements ho.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ho.d f3104a;

        public a(ho.d dVar) {
            this.f3104a = dVar;
        }

        @Override // ho.g
        public ho.d a() {
            return this.f3104a;
        }

        @Override // ho.g
        public fo.j b() {
            ho.d dVar = this.f3104a;
            return dVar instanceof z ? ((z) dVar).k() : fo.j.b();
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ho.d f3105a;
        public int b;

        public b(ho.d dVar, int i10) {
            this.f3105a = dVar;
            this.b = i10;
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(eo.b.class, new c.a());
        map.put(eo.j.class, new m.a());
        map.put(eo.h.class, new l.a());
        map.put(eo.k.class, new n.a());
        map.put(c0.class, new b0.a());
        map.put(eo.q.class, new x.a());
        map.put(eo.n.class, new p.a());
        f3083w = Collections.unmodifiableMap(map);
    }

    public k(List<ho.e> list, fo.d dVar, List<go.b> list2, List<io.a> list3, List<go.e> list4, Set<Character> set, fo.a aVar, int i10) {
        this.f3092j = list;
        this.f3093k = dVar;
        this.f3094l = list2;
        this.f3095m = list3;
        this.f3096n = list4;
        this.f3097o = set;
        this.f3098p = aVar;
        this.f3099q = i10;
        h hVar = new h();
        this.f3100r = hVar;
        g(new b(hVar, 0));
    }

    public static List<ho.e> m(List<ho.e> list, Set<Class<? extends eo.a>> set) {
        ArrayList arrayList = new ArrayList(list);
        Iterator<Class<? extends eo.a>> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(f3083w.get(it.next()));
        }
        return arrayList;
    }

    public static Set<Class<? extends eo.a>> t() {
        return f3082v;
    }

    public static String x(String str) {
        return str.indexOf(0) == -1 ? str : str.replace((char) 0, (char) 65533);
    }

    public final void A(String str, int i10) {
        this.b++;
        this.f3085c = 0;
        this.f3086d = 0;
        this.f3087e = false;
        String strX = x(str);
        this.f3084a = fo.i.c(strX, this.f3098p != fo.a.NONE ? eo.y.e(this.b, 0, i10, strX.length()) : null);
    }

    public final void B(int i10) {
        int i11;
        int i12 = this.f3089g;
        if (i10 >= i12) {
            this.f3085c = this.f3088f;
            this.f3086d = i12;
        }
        int length = this.f3084a.a().length();
        while (true) {
            i11 = this.f3086d;
            if (i11 >= i10 || this.f3085c == length) {
                break;
            } else {
                l();
            }
        }
        if (i11 <= i10) {
            this.f3087e = false;
            return;
        }
        this.f3085c--;
        this.f3086d = i10;
        this.f3087e = true;
    }

    public final void C(int i10) {
        int i11 = this.f3088f;
        if (i10 >= i11) {
            this.f3085c = i11;
            this.f3086d = this.f3089g;
        }
        int length = this.f3084a.a().length();
        while (true) {
            int i12 = this.f3085c;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                l();
            }
        }
        this.f3087e = false;
    }

    @Override // ho.h
    public boolean a() {
        return this.f3091i;
    }

    @Override // ho.h
    public fo.i b() {
        return this.f3084a;
    }

    @Override // ho.h
    public int c() {
        return this.f3086d;
    }

    @Override // ho.h
    public int d() {
        return this.f3090h;
    }

    @Override // ho.h
    public int e() {
        return this.f3088f;
    }

    @Override // ho.h
    public ho.d f() {
        List<b> list = this.f3102t;
        return list.get(list.size() - 1).f3105a;
    }

    public final void g(b bVar) {
        this.f3102t.add(bVar);
    }

    @Override // ho.h
    public int getIndex() {
        return this.f3085c;
    }

    public final void h(b bVar) {
        while (!f().g(bVar.f3105a.f())) {
            n(1);
        }
        f().f().c(bVar.f3105a.f());
        g(bVar);
    }

    public final void i(ho.d dVar) {
        Iterator<eo.e<?>> it = dVar.i().iterator();
        while (it.hasNext()) {
            this.f3101s.a(it.next());
        }
    }

    public final void j() {
        CharSequence charSequenceA;
        if (this.f3087e) {
            CharSequence charSequenceSubSequence = this.f3084a.a().subSequence(this.f3085c + 1, this.f3084a.a().length());
            int iA = co.f.a(this.f3086d);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence.length() + iA);
            for (int i10 = 0; i10 < iA; i10++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence);
            charSequenceA = sb2.toString();
        } else {
            charSequenceA = this.f3085c == 0 ? this.f3084a.a() : this.f3084a.a().subSequence(this.f3085c, this.f3084a.a().length());
        }
        f().c(fo.i.c(charSequenceA, (this.f3098p != fo.a.BLOCKS_AND_INLINES || this.f3085c >= this.f3084a.b().c()) ? null : this.f3084a.b().f(this.f3085c)));
        k();
    }

    public final void k() {
        if (this.f3098p != fo.a.NONE) {
            for (int i10 = 1; i10 < this.f3102t.size(); i10++) {
                b bVar = this.f3102t.get(i10);
                int iMin = Math.min(bVar.b, this.f3085c);
                if (this.f3084a.a().length() - iMin != 0) {
                    bVar.f3105a.d(this.f3084a.b().f(iMin));
                }
            }
        }
    }

    public final void l() {
        char cCharAt = this.f3084a.a().charAt(this.f3085c);
        this.f3085c++;
        if (cCharAt != '\t') {
            this.f3086d++;
        } else {
            int i10 = this.f3086d;
            this.f3086d = i10 + co.f.a(i10);
        }
    }

    public final void n(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            ho.d dVar = o().f3105a;
            p(dVar);
            this.f3103u.add(dVar);
        }
    }

    public final b o() {
        List<b> list = this.f3102t;
        return list.remove(list.size() - 1);
    }

    public final void p(ho.d dVar) {
        i(dVar);
        dVar.h();
    }

    public final eo.f q() {
        n(this.f3102t.size());
        y();
        return this.f3100r.f();
    }

    public final d r(ho.d dVar) {
        if (this.f3102t.size() > this.f3099q) {
            return null;
        }
        a aVar = new a(dVar);
        Iterator<ho.e> it = this.f3092j.iterator();
        while (it.hasNext()) {
            ho.f fVarA = it.next().a(this, aVar);
            if (fVarA instanceof d) {
                return (d) fVarA;
            }
        }
        return null;
    }

    public final void s() {
        int i10 = this.f3085c;
        int i11 = this.f3086d;
        this.f3091i = true;
        int length = this.f3084a.a().length();
        while (i10 < length) {
            char cCharAt = this.f3084a.a().charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.f3091i = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f3088f = i10;
        this.f3089g = i11;
        this.f3090h = i11 - this.f3086d;
    }

    public eo.f u(String str) {
        int i10 = 0;
        while (true) {
            int iB = jo.d.b(str, i10);
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
        List<eo.y> listW;
        A(str, i10);
        int i11 = 1;
        for (int i12 = 1; i12 < this.f3102t.size(); i12++) {
            b bVar = this.f3102t.get(i12);
            ho.d dVar = bVar.f3105a;
            s();
            ho.c cVarA = dVar.a(this);
            if (!(cVarA instanceof ao.b)) {
                break;
            }
            ao.b bVar2 = (ao.b) cVarA;
            bVar.b = getIndex();
            if (bVar2.g()) {
                k();
                n(this.f3102t.size() - i12);
                return;
            }
            if (bVar2.f() != -1) {
                C(bVar2.f());
            } else if (bVar2.e() != -1) {
                B(bVar2.e());
            }
            i11++;
        }
        int size = this.f3102t.size() - i11;
        dVar = this.f3102t.get(i11 - 1).f3105a;
        int i13 = this.f3085c;
        boolean zB = (dVar.f() instanceof eo.w) || dVar.b();
        boolean z10 = false;
        while (zB) {
            i13 = this.f3085c;
            s();
            if (a() || (this.f3090h < co.f.f5535a && jo.d.e(this.f3084a.a(), this.f3088f))) {
                C(this.f3088f);
                break;
            }
            d dVarR = r(dVar);
            if (dVarR == null) {
                C(this.f3088f);
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
                ho.d dVarF = f();
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
            for (ho.d dVar2 : dVarR.f()) {
                h(new b(dVar2, index));
                if (listW != null) {
                    dVar2.f().l(listW);
                }
                zB = dVar2.b();
            }
            z10 = true;
        }
        if (!z10 && !a() && f().e()) {
            List<b> list = this.f3102t;
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

    public final List<eo.y> w(ho.d dVar) {
        o();
        dVar.h();
        dVar.f().n();
        return dVar.f().h();
    }

    public final void y() {
        fo.b bVarA = this.f3093k.a(new q(this.f3094l, this.f3095m, this.f3096n, this.f3097o, this.f3101s));
        Iterator<ho.d> it = this.f3103u.iterator();
        while (it.hasNext()) {
            it.next().j(bVarA);
        }
    }

    public final List<eo.y> z(int i10, z zVar) {
        List<eo.y> listL = zVar.l(i10);
        n(1);
        return listL;
    }
}
