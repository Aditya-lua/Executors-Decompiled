package ye;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class j0<P> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<gf.a, List<c<P>>> f37774a;
    public final List<c<P>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<P> f37775c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<P> f37776d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f37777e;

    public static class b<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<P> f37778a;
        public Map<gf.a, List<c<P>>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c<P>> f37779c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<P> f37780d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r f37781e;

        public final b<P> a(P p8, re.l lVar, cf.j0.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.b == null) {
                throw new IllegalStateException("addEntry cannot be called after build");
            }
            if (p8 == null) {
                throw new NullPointerException("`fullPrimitive` must not be null");
            }
            if (cVar.h0() != cf.g0.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVar2 = new c<>(p8, gf.a.a(re.f.a(cVar)), cVar.h0(), cVar.g0(), cVar.f0(), cVar.e0().f0(), lVar);
            j0.j(cVar2, this.b, this.f37779c);
            if (!z10) {
                return this;
            }
            if (this.f37780d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f37780d = cVar2;
            return this;
        }

        public b<P> b(P p8, re.l lVar, cf.j0.c cVar) {
            return a(p8, lVar, cVar, false);
        }

        public b<P> c(P p8, re.l lVar, cf.j0.c cVar) {
            return a(p8, lVar, cVar, true);
        }

        public j0<P> d() {
            Map<gf.a, List<c<P>>> map = this.b;
            if (map == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            j0<P> j0Var = new j0<>(map, this.f37779c, this.f37780d, this.f37781e, this.f37778a);
            this.b = null;
            return j0Var;
        }

        public b<P> e(r rVar) {
            if (this.b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f37781e = rVar;
            return this;
        }

        public b(Class<P> cls) {
            this.b = new HashMap();
            this.f37779c = new ArrayList();
            this.f37778a = cls;
            this.f37781e = r.b;
        }
    }

    public static final class c<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P f37782a;
        public final gf.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final cf.g0 f37783c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final cf.p0 f37784d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f37785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f37786f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final re.l f37787g;

        public P b() {
            return this.f37782a;
        }

        public int c() {
            return this.f37785e;
        }

        public String d() {
            return this.f37786f;
        }

        public final gf.a e() {
            return this.b;
        }

        public cf.p0 f() {
            return this.f37784d;
        }

        public cf.g0 g() {
            return this.f37783c;
        }

        public c(P p8, gf.a aVar, cf.g0 g0Var, cf.p0 p0Var, int i10, String str, re.l lVar) {
            this.f37782a = p8;
            this.b = aVar;
            this.f37783c = g0Var;
            this.f37784d = p0Var;
            this.f37785e = i10;
            this.f37786f = str;
            this.f37787g = lVar;
        }
    }

    public static <P> b<P> i(Class<P> cls) {
        return new b<>(cls);
    }

    public static <P> void j(c<P> cVar, Map<gf.a, List<c<P>>> map, List<c<P>> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        List<c<P>> listPut = map.put(cVar.e(), Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(cVar);
            map.put(cVar.e(), Collections.unmodifiableList(arrayList2));
        }
        list.add(cVar);
    }

    public Collection<List<c<P>>> b() {
        return this.f37774a.values();
    }

    public r c() {
        return this.f37777e;
    }

    public c<P> d() {
        return this.f37775c;
    }

    public List<c<P>> e(byte[] bArr) {
        List<c<P>> list = this.f37774a.get(gf.a.a(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class<P> f() {
        return this.f37776d;
    }

    public List<c<P>> g() {
        return e(re.f.f30675a);
    }

    public boolean h() {
        return !this.f37777e.b().isEmpty();
    }

    public j0(Map<gf.a, List<c<P>>> map, List<c<P>> list, c<P> cVar, r rVar, Class<P> cls) {
        this.f37774a = map;
        this.b = list;
        this.f37775c = cVar;
        this.f37776d = cls;
        this.f37777e = rVar;
    }
}
