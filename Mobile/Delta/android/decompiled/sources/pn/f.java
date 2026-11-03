package pn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import ln.k;
import ln.q;
import ln.u;
import on.s;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<rn.e> f28777a;
    public final List<qn.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<sn.a> f28778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<qn.e> f28779d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Character> f28780e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f28781f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<h> f28782g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final pn.a f28783h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f28784i;

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d f28791h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<rn.e> f28785a = new ArrayList();
        public final List<qn.b> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<sn.a> f28786c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<qn.e> f28787d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<h> f28788e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Set<Character> f28789f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set<Class<? extends on.a>> f28790g = k.t();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public pn.a f28792i = pn.a.NONE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f28793j = Integer.MAX_VALUE;

        public f k() {
            return new f(this);
        }

        public final d l() {
            d dVar = this.f28791h;
            return dVar != null ? dVar : new d() { // from class: pn.e
                @Override // pn.d
                public final b a(c cVar) {
                    return new u(cVar);
                }
            };
        }
    }

    public final k a() {
        return new k(this.f28777a, this.f28781f, this.b, this.f28778c, this.f28779d, this.f28780e, this.f28783h, this.f28784i);
    }

    public s b(String str) {
        Objects.requireNonNull(str, "input must not be null");
        return c(a().u(str));
    }

    public final s c(s sVar) {
        Iterator<h> it = this.f28782g.iterator();
        while (it.hasNext()) {
            sVar = it.next().a(sVar);
        }
        return sVar;
    }

    public f(a aVar) {
        this.f28777a = k.m(aVar.f28785a, aVar.f28790g);
        d dVarL = aVar.l();
        this.f28781f = dVarL;
        this.f28782g = aVar.f28788e;
        List<qn.b> list = aVar.b;
        this.b = list;
        List<sn.a> list2 = aVar.f28786c;
        this.f28778c = list2;
        List<qn.e> list3 = aVar.f28787d;
        this.f28779d = list3;
        Set<Character> set = aVar.f28789f;
        this.f28780e = set;
        this.f28783h = aVar.f28792i;
        this.f28784i = aVar.f28793j;
        dVarL.a(new q(list, list2, list3, set, new ln.f()));
    }
}
