package we;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import ve.a0;
import ve.j0;
import ve.k0;

/* JADX INFO: loaded from: classes2.dex */
public class h implements k0<g, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f34204a = new h();

    public static class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0<g> f34205a;

        public b(j0<g> j0Var) {
            this.f34205a = j0Var;
        }
    }

    public static void d() {
        a0.c().e(f34204a);
    }

    @Override // ve.k0
    public Class<g> a() {
        return g.class;
    }

    @Override // ve.k0
    public Class<g> c() {
        return g.class;
    }

    @Override // ve.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g b(j0<g> j0Var) throws GeneralSecurityException {
        if (j0Var == null) {
            throw new GeneralSecurityException("primitive set must be non-null");
        }
        if (j0Var.d() == null) {
            throw new GeneralSecurityException("no primary in primitive set");
        }
        Iterator<List<j0.c<g>>> it = j0Var.b().iterator();
        while (it.hasNext()) {
            Iterator<j0.c<g>> it2 = it.next().iterator();
            while (it2.hasNext()) {
                it2.next().b();
            }
        }
        return new b(j0Var);
    }
}
