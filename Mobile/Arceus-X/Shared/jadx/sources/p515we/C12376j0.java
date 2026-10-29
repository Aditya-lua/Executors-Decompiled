package p515we;

import af.C0226j0;
import af.EnumC0220g0;
import af.EnumC0238p0;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p102ef.C5109a;
import pe.AbstractC10231l;
import pe.C10221f;

/* JADX INFO: renamed from: we.j0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C12376j0<P> {

    /* JADX INFO: renamed from: a */
    public final Map<C5109a, List<c<P>>> f44281a;

    /* JADX INFO: renamed from: b */
    public final List<c<P>> f44282b;

    /* JADX INFO: renamed from: c */
    public final c<P> f44283c;

    /* JADX INFO: renamed from: d */
    public final Class<P> f44284d;

    /* JADX INFO: renamed from: e */
    public final C12391r f44285e;

    /* JADX INFO: renamed from: we.j0$b */
    public static class b<P> {

        /* JADX INFO: renamed from: a */
        public final Class<P> f44286a;

        /* JADX INFO: renamed from: b */
        public Map<C5109a, List<c<P>>> f44287b;

        /* JADX INFO: renamed from: c */
        public final List<c<P>> f44288c;

        /* JADX INFO: renamed from: d */
        public c<P> f44289d;

        /* JADX INFO: renamed from: e */
        public C12391r f44290e;

        /* JADX INFO: renamed from: a */
        public final b<P> m46368a(P p8, AbstractC10231l abstractC10231l, C0226j0.c cVar, boolean z10) throws GeneralSecurityException {
            if (this.f44287b == null) {
                throw new IllegalStateException("addEntry cannot be called after build");
            }
            if (p8 == null) {
                throw new NullPointerException("`fullPrimitive` must not be null");
            }
            if (cVar.m819h0() != EnumC0220g0.ENABLED) {
                throw new GeneralSecurityException("only ENABLED key is allowed");
            }
            c<P> cVar2 = new c<>(p8, C5109a.m23847a(C10221f.m39311a(cVar)), cVar.m819h0(), cVar.m818g0(), cVar.m817f0(), cVar.m816e0().m722f0(), abstractC10231l);
            C12376j0.m46360j(cVar2, this.f44287b, this.f44288c);
            if (!z10) {
                return this;
            }
            if (this.f44289d != null) {
                throw new IllegalStateException("you cannot set two primary primitives");
            }
            this.f44289d = cVar2;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b<P> m46369b(P p8, AbstractC10231l abstractC10231l, C0226j0.c cVar) {
            return m46368a(p8, abstractC10231l, cVar, false);
        }

        /* JADX INFO: renamed from: c */
        public b<P> m46370c(P p8, AbstractC10231l abstractC10231l, C0226j0.c cVar) {
            return m46368a(p8, abstractC10231l, cVar, true);
        }

        /* JADX INFO: renamed from: d */
        public C12376j0<P> m46371d() {
            Map<C5109a, List<c<P>>> map = this.f44287b;
            if (map == null) {
                throw new IllegalStateException("build cannot be called twice");
            }
            C12376j0<P> c12376j0 = new C12376j0<>(map, this.f44288c, this.f44289d, this.f44290e, this.f44286a);
            this.f44287b = null;
            return c12376j0;
        }

        /* JADX INFO: renamed from: e */
        public b<P> m46372e(C12391r c12391r) {
            if (this.f44287b == null) {
                throw new IllegalStateException("setAnnotations cannot be called after build");
            }
            this.f44290e = c12391r;
            return this;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public b(Class<P> cls) {
            this.f44287b = new HashMap();
            this.f44288c = new ArrayList();
            this.f44286a = cls;
            this.f44290e = C12391r.f44342b;
        }
    }

    /* JADX INFO: renamed from: we.j0$c */
    public static final class c<P> {

        /* JADX INFO: renamed from: a */
        public final P f44291a;

        /* JADX INFO: renamed from: b */
        public final C5109a f44292b;

        /* JADX INFO: renamed from: c */
        public final EnumC0220g0 f44293c;

        /* JADX INFO: renamed from: d */
        public final EnumC0238p0 f44294d;

        /* JADX INFO: renamed from: e */
        public final int f44295e;

        /* JADX INFO: renamed from: f */
        public final String f44296f;

        /* JADX INFO: renamed from: g */
        public final AbstractC10231l f44297g;

        /* JADX INFO: renamed from: b */
        public P m46374b() {
            return this.f44291a;
        }

        /* JADX INFO: renamed from: c */
        public int m46375c() {
            return this.f44295e;
        }

        /* JADX INFO: renamed from: d */
        public String m46376d() {
            return this.f44296f;
        }

        /* JADX INFO: renamed from: e */
        public final C5109a m46377e() {
            return this.f44292b;
        }

        /* JADX INFO: renamed from: f */
        public EnumC0238p0 m46378f() {
            return this.f44294d;
        }

        /* JADX INFO: renamed from: g */
        public EnumC0220g0 m46379g() {
            return this.f44293c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public c(P p8, C5109a c5109a, EnumC0220g0 enumC0220g0, EnumC0238p0 enumC0238p0, int i10, String str, AbstractC10231l abstractC10231l) {
            this.f44291a = p8;
            this.f44292b = c5109a;
            this.f44293c = enumC0220g0;
            this.f44294d = enumC0238p0;
            this.f44295e = i10;
            this.f44296f = str;
            this.f44297g = abstractC10231l;
        }
    }

    /* JADX INFO: renamed from: i */
    public static <P> b<P> m46359i(Class<P> cls) {
        return new b<>(cls);
    }

    /* JADX INFO: renamed from: j */
    public static <P> void m46360j(c<P> cVar, Map<C5109a, List<c<P>>> map, List<c<P>> list) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cVar);
        List<c<P>> listPut = map.put(cVar.m46377e(), Collections.unmodifiableList(arrayList));
        if (listPut != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(listPut);
            arrayList2.add(cVar);
            map.put(cVar.m46377e(), Collections.unmodifiableList(arrayList2));
        }
        list.add(cVar);
    }

    /* JADX INFO: renamed from: b */
    public Collection<List<c<P>>> m46361b() {
        return this.f44281a.values();
    }

    /* JADX INFO: renamed from: c */
    public C12391r m46362c() {
        return this.f44285e;
    }

    /* JADX INFO: renamed from: d */
    public c<P> m46363d() {
        return this.f44283c;
    }

    /* JADX INFO: renamed from: e */
    public List<c<P>> m46364e(byte[] bArr) {
        List<c<P>> list = this.f44281a.get(C5109a.m23847a(bArr));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: f */
    public Class<P> m46365f() {
        return this.f44284d;
    }

    /* JADX INFO: renamed from: g */
    public List<c<P>> m46366g() {
        return m46364e(C10221f.f36827a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m46367h() {
        return !this.f44285e.m46442b().isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C12376j0(Map<C5109a, List<c<P>>> map, List<c<P>> list, c<P> cVar, C12391r c12391r, Class<P> cls) {
        this.f44281a = map;
        this.f44282b = list;
        this.f44283c = cVar;
        this.f44284d = cls;
        this.f44285e = c12391r;
    }
}
