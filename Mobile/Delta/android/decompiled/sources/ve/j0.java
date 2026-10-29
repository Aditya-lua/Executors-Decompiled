package ve;

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
    public final Map<df.a, List<c<P>>> f32963a;
    public final List<c<P>> b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c<P> f32964c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class<P> f32965d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f32966e;

    public static class b<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Class<P> f32967a;
        public Map<df.a, List<c<P>>> b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<c<P>> f32968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public c<P> f32969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public r f32970e;

        public final b<P> a(P p8, oe.l lVar, ze.j0.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.b == null) {
                throw new IllegalStateException("addEntry cannot be called after build");
            }
            if (p8 == null) {
                throw new NullPointerException("`fullPrimitive` must not be null");
            }
            if (cVar.h0() != ze.g0.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVar2 = new c<>(p8, df.a.a(oe.f.a(cVar)), cVar.h0(), cVar.g0(), cVar.f0(), cVar.e0().f0(), lVar);
            j0.j(cVar2, this.b, this.f32968c);
            if (!z10) {
                return this;
            }
            if (this.f32969d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f32969d = cVar2;
            return this;
        }

        public b<P> b(P p8, oe.l lVar, ze.j0.c cVar) {
            return a(p8, lVar, cVar, false);
        }

        public b<P> c(P p8, oe.l lVar, ze.j0.c cVar) {
            return a(p8, lVar, cVar, true);
        }

        public j0<P> d() {
            Map<df.a, List<c<P>>> map = this.b;
            if (map == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            j0<P> j0Var = new j0<>(map, this.f32968c, this.f32969d, this.f32970e, this.f32967a);
            this.b = null;
            return j0Var;
        }

        public b<P> e(r rVar) {
            if (this.b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f32970e = rVar;
            return this;
        }

        public b(Class<P> cls) {
            this.b = new HashMap();
            this.f32968c = new ArrayList();
            this.f32967a = cls;
            this.f32970e = r.b;
        }
    }

    public static final class c<P> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final P f32971a;
        public final df.a b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ze.g0 f32972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final ze.p0 f32973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f32974e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f32975f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final oe.l f32976g;

        public P b() {
            return this.f32971a;
        }

        public int c() {
            return this.f32974e;
        }

        public String d() {
            return this.f32975f;
        }

        public final df.a e() {
            return this.b;
        }

        public ze.p0 f() {
            return this.f32973d;
        }

        public ze.g0 g() {
            return this.f32972c;
        }

        public c(P p8, df.a aVar, ze.g0 g0Var, ze.p0 p0Var, int i10, String str, oe.l lVar) {
            this.f32971a = p8;
            this.b = aVar;
            this.f32972c = g0Var;
            this.f32973d = p0Var;
            this.f32974e = i10;
            this.f32975f = str;
            this.f32976g = lVar;
        }
    }

    public static <P> b<P> i(Class<P> cls) {
        return new b<>(cls);
    }

    public static <P> void j(c<P> cVar, Map<df.a, List<c<P>>> map, List<c<P>> list) {
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
        return this.f32963a.values();
    }

    public r c() {
        return this.f32966e;
    }

    public c<P> d() {
        return this.f32964c;
    }

    public List<c<P>> e(byte[] bArr) {
        List<c<P>> list = this.f32963a.get(df.a.a(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    public Class<P> f() {
        return this.f32965d;
    }

    public List<c<P>> g() {
        return e(oe.f.f27344a);
    }

    public boolean h() {
        return !this.f32966e.b().isEmpty();
    }

    public j0(Map<df.a, List<c<P>>> map, List<c<P>> list, c<P> cVar, r rVar, Class<P> cls) {
        this.f32963a = map;
        this.b = list;
        this.f32964c = cVar;
        this.f32965d = cls;
        this.f32966e = rVar;
    }
}
