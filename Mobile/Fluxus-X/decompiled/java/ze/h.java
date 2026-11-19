package ze;

import java.security.GeneralSecurityException;
import java.util.Iterator;
import java.util.List;
import ye.a0;
import ye.j0;
import ye.k0;

/* JADX INFO: loaded from: classes2.dex */
public class h implements k0<g, g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f39254a = new h();

    public static class b implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0<g> f39255a;

        public b(j0<g> j0Var) {
            this.f39255a = j0Var;
        }
    }

    public static void d() {
        a0.c().e(f39254a);
    }

    @Override // ye.k0
    public Class<g> a() {
        return g.class;
    }

    @Override // ye.k0
    public Class<g> b() {
        return g.class;
    }

    @Override // ye.k0
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public g c(j0<g> j0Var) throws GeneralSecurityException {
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
