package fo;

import ao.k;
import ao.q;
import ao.u;
import eo.s;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<ho.e> f16205a;
    public final List<go.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<io.a> f16206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<go.e> f16207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Character> f16208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f16209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<h> f16210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fo.a f16211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f16212i;

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d f16219h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<ho.e> f16213a = new ArrayList();
        public final List<go.b> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<io.a> f16214c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<go.e> f16215d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<h> f16216e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Set<Character> f16217f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set<Class<? extends eo.a>> f16218g = k.t();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public fo.a f16220i = fo.a.NONE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f16221j = Integer.MAX_VALUE;

        public f k() {
            return new f(this);
        }

        public final d l() {
            d dVar = this.f16219h;
            return dVar != null ? dVar : new d() { // from class: fo.e
                @Override // fo.d
                public final b a(c cVar) {
                    return new u(cVar);
                }
            };
        }
    }

    public final k a() {
        return new k(this.f16205a, this.f16209f, this.b, this.f16206c, this.f16207d, this.f16208e, this.f16211h, this.f16212i);
    }

    public s b(String str) {
        Objects.requireNonNull(str, "input must not be null");
        return c(a().u(str));
    }

    public final s c(s sVar) {
        Iterator<h> it = this.f16210g.iterator();
        while (it.hasNext()) {
            sVar = it.next().a(sVar);
        }
        return sVar;
    }

    public f(a aVar) {
        this.f16205a = k.m(aVar.f16213a, aVar.f16218g);
        d dVarL = aVar.l();
        this.f16209f = dVarL;
        this.f16210g = aVar.f16216e;
        List<go.b> list = aVar.b;
        this.b = list;
        List<io.a> list2 = aVar.f16214c;
        this.f16206c = list2;
        List<go.e> list3 = aVar.f16215d;
        this.f16207d = list3;
        Set<Character> set = aVar.f16217f;
        this.f16208e = set;
        this.f16211h = aVar.f16220i;
        this.f16212i = aVar.f16221j;
        dVarL.a(new q(list, list2, list3, set, new ao.f()));
    }
}
