package lt;

import androidx.annotation.NonNull;
import eo.a0;
import eo.b0;
import eo.c0;
import eo.v;
import eo.w;
import eo.x;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f22534a;
    public final r b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f22535c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<? extends eo.s>, m.c<? extends eo.s>> f22536d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m.a f22537e;

    public static class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends eo.s>, m.c<? extends eo.s>> f22538a = new HashMap();
        public m.a b;

        @Override // lt.m.b
        @NonNull
        public m a(@NonNull g gVar, @NonNull r rVar) {
            m.a bVar = this.b;
            if (bVar == null) {
                bVar = new b();
            }
            return new o(gVar, rVar, new u(), Collections.unmodifiableMap(this.f22538a), bVar);
        }

        @Override // lt.m.b
        @NonNull
        public <N extends eo.s> m.b b(@NonNull Class<N> cls, m.c<? super N> cVar) {
            if (cVar == null) {
                this.f22538a.remove(cls);
                return this;
            }
            this.f22538a.put(cls, cVar);
            return this;
        }
    }

    public o(@NonNull g gVar, @NonNull r rVar, @NonNull u uVar, @NonNull Map<Class<? extends eo.s>, m.c<? extends eo.s>> map, @NonNull m.a aVar) {
        this.f22534a = gVar;
        this.b = rVar;
        this.f22535c = uVar;
        this.f22536d = map;
        this.f22537e = aVar;
    }

    @Override // eo.d0
    public void A(c0 c0Var) {
        G(c0Var);
    }

    @Override // eo.d0
    public void B(eo.m mVar) {
        G(mVar);
    }

    @Override // eo.d0
    public void C(eo.f fVar) {
        G(fVar);
    }

    @Override // eo.d0
    public void D(eo.g gVar) {
        G(gVar);
    }

    @Override // lt.m
    public void E(@NonNull eo.s sVar) {
        eo.s sVarD = sVar.d();
        while (sVarD != null) {
            eo.s sVarF = sVarD.f();
            sVarD.a(this);
            sVarD = sVarF;
        }
    }

    public <N extends eo.s> void F(@NonNull Class<N> cls, int i10) {
        t tVarA = this.f22534a.c().a(cls);
        if (tVarA != null) {
            c(i10, tVarA.a(this.f22534a, this.b));
        }
    }

    public final void G(@NonNull eo.s sVar) {
        m.c<? extends eo.s> cVar = this.f22536d.get(sVar.getClass());
        if (cVar != null) {
            cVar.a(this, sVar);
        } else {
            E(sVar);
        }
    }

    @Override // eo.d0
    public void a(eo.i iVar) {
        G(iVar);
    }

    @Override // eo.d0
    public void b(eo.k kVar) {
        G(kVar);
    }

    @Override // lt.m
    @NonNull
    public u builder() {
        return this.f22535c;
    }

    @Override // lt.m
    public void c(int i10, Object obj) {
        u uVar = this.f22535c;
        u.j(uVar, obj, i10, uVar.length());
    }

    @Override // lt.m
    public boolean d(@NonNull eo.s sVar) {
        return sVar.f() != null;
    }

    @Override // eo.d0
    public void e(eo.n nVar) {
        G(nVar);
    }

    @Override // eo.d0
    public void f(eo.d dVar) {
        G(dVar);
    }

    @Override // eo.d0
    public void g(eo.j jVar) {
        G(jVar);
    }

    @Override // eo.d0
    public void h(b0 b0Var) {
        G(b0Var);
    }

    @Override // lt.m
    public <N extends eo.s> void i(@NonNull N n10, int i10) {
        F(n10.getClass(), i10);
    }

    @Override // eo.d0
    public void j(eo.c cVar) {
        G(cVar);
    }

    @Override // lt.m
    @NonNull
    public r k() {
        return this.b;
    }

    @Override // eo.d0
    public void l(x xVar) {
        G(xVar);
    }

    @Override // lt.m
    public int length() {
        return this.f22535c.length();
    }

    @Override // eo.d0
    public void m(w wVar) {
        G(wVar);
    }

    @Override // lt.m
    public void n(@NonNull eo.s sVar) {
        this.f22537e.b(this, sVar);
    }

    @Override // eo.d0
    public void o(a0 a0Var) {
        G(a0Var);
    }

    @Override // eo.d0
    public void p(eo.h hVar) {
        G(hVar);
    }

    @Override // eo.d0
    public void q(eo.o oVar) {
        G(oVar);
    }

    @Override // eo.d0
    public void r(eo.l lVar) {
        G(lVar);
    }

    @Override // lt.m
    public void s(@NonNull eo.s sVar) {
        this.f22537e.a(this, sVar);
    }

    @Override // eo.d0
    public void t(eo.r rVar) {
        G(rVar);
    }

    @Override // lt.m
    @NonNull
    public g u() {
        return this.f22534a;
    }

    @Override // lt.m
    public void v() {
        this.f22535c.append('\n');
    }

    @Override // eo.d0
    public void w(eo.b bVar) {
        G(bVar);
    }

    @Override // eo.d0
    public void x(eo.p pVar) {
        G(pVar);
    }

    @Override // lt.m
    public void y() {
        if (this.f22535c.length() <= 0 || '\n' == this.f22535c.h()) {
            return;
        }
        this.f22535c.append('\n');
    }

    @Override // eo.d0
    public void z(v vVar) {
        G(vVar);
    }
}
