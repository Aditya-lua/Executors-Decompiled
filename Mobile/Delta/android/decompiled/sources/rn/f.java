package rn;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import nn.k;
import nn.q;
import nn.u;
import qn.s;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<tn.e> f29917a;
    public final List<sn.b> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List<un.a> f29918c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<sn.e> f29919d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<Character> f29920e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final d f29921f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List<h> f29922g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rn.a f29923h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f29924i;

    public static class a {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public d f29931h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<tn.e> f29925a = new ArrayList();
        public final List<sn.b> b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<un.a> f29926c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<sn.e> f29927d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final List<h> f29928e = new ArrayList();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Set<Character> f29929f = new HashSet();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public Set<Class<? extends qn.a>> f29930g = k.t();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public rn.a f29932i = rn.a.NONE;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f29933j = Integer.MAX_VALUE;

        public f k() {
            return new f(this);
        }

        public final d l() {
            d dVar = this.f29931h;
            return dVar != null ? dVar : new d() { // from class: rn.e
                @Override // rn.d
                public final b a(c cVar) {
                    return new u(cVar);
                }
            };
        }
    }

    public final k a() {
        return new k(this.f29917a, this.f29921f, this.b, this.f29918c, this.f29919d, this.f29920e, this.f29923h, this.f29924i);
    }

    public s b(String str) {
        Objects.requireNonNull(str, "input must not be null");
        return c(a().u(str));
    }

    public final s c(s sVar) {
        Iterator<h> it = this.f29922g.iterator();
        while (it.hasNext()) {
            sVar = it.next().a(sVar);
        }
        return sVar;
    }

    public f(a aVar) {
        this.f29917a = k.m(aVar.f29925a, aVar.f29930g);
        d dVarL = aVar.l();
        this.f29921f = dVarL;
        this.f29922g = aVar.f29928e;
        List<sn.b> list = aVar.b;
        this.b = list;
        List<un.a> list2 = aVar.f29926c;
        this.f29918c = list2;
        List<sn.e> list3 = aVar.f29927d;
        this.f29919d = list3;
        Set<Character> set = aVar.f29929f;
        this.f29920e = set;
        this.f29923h = aVar.f29932i;
        this.f29924i = aVar.f29933j;
        dVarL.a(new q(list, list2, list3, set, new nn.f()));
    }
}
