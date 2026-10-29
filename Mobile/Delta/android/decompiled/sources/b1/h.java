package b1;

import java.util.UUID;
import n0.c3;
import n0.i4;
import n0.j4;
import n0.w2;
import n0.x2;

/* JADX INFO: loaded from: classes.dex */
public class h implements i4.b<g, i, h> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x2 f3802a;

    public h() {
        this(x2.k0());
    }

    @Override // g0.l0
    public w2 a() {
        return this.f3802a;
    }

    @Override // n0.i4.b
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public i e() {
        return new i(c3.j0(this.f3802a));
    }

    public h c(j4.b bVar) {
        a().G(i4.G, bVar);
        return this;
    }

    public h d(Class<g> cls) {
        a().G(s0.q.N, cls);
        if (a().h(s0.q.M, null) == null) {
            f(cls.getCanonicalName() + "-" + UUID.randomUUID());
        }
        return this;
    }

    public h f(String str) {
        a().G(s0.q.M, str);
        return this;
    }

    public h(x2 x2Var) {
        this.f3802a = x2Var;
        Class cls = (Class) x2Var.h(s0.q.N, null);
        if (cls == null || cls.equals(g.class)) {
            c(j4.b.STREAM_SHARING);
            d(g.class);
            return;
        }
        throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
    }
}
