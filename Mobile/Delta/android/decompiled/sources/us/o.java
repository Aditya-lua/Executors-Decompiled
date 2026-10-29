package us;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import qn.a0;
import qn.b0;
import qn.c0;
import qn.v;
import qn.w;
import qn.x;

/* JADX INFO: loaded from: classes3.dex */
public class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f32610a;
    public final r b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f32611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<? extends qn.s>, m.c<? extends qn.s>> f32612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m.a f32613e;

    public static class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends qn.s>, m.c<? extends qn.s>> f32614a = new HashMap();
        public m.a b;

        @Override // us.m.b
        @NonNull
        public <N extends qn.s> m.b a(@NonNull Class<N> cls, m.c<? super N> cVar) {
            if (cVar == null) {
                this.f32614a.remove(cls);
                return this;
            }
            this.f32614a.put(cls, cVar);
            return this;
        }

        @Override // us.m.b
        @NonNull
        public m b(@NonNull g gVar, @NonNull r rVar) {
            m.a bVar = this.b;
            if (bVar == null) {
                bVar = new b();
            }
            return new o(gVar, rVar, new u(), Collections.unmodifiableMap(this.f32614a), bVar);
        }
    }

    public o(@NonNull g gVar, @NonNull r rVar, @NonNull u uVar, @NonNull Map<Class<? extends qn.s>, m.c<? extends qn.s>> map, @NonNull m.a aVar) {
        this.f32610a = gVar;
        this.b = rVar;
        this.f32611c = uVar;
        this.f32612d = map;
        this.f32613e = aVar;
    }

    @Override // qn.d0
    public void A(x xVar) {
        G(xVar);
    }

    @Override // us.m
    public void B() {
        if (this.f32611c.length() <= 0 || '\n' == this.f32611c.h()) {
            return;
        }
        this.f32611c.append('\n');
    }

    @Override // qn.d0
    public void C(qn.m mVar) {
        G(mVar);
    }

    @Override // us.m
    public void D(@NonNull qn.s sVar) {
        this.f32613e.b(this, sVar);
    }

    @Override // qn.d0
    public void E(qn.h hVar) {
        G(hVar);
    }

    public <N extends qn.s> void F(@NonNull Class<N> cls, int i10) {
        t tVarA = this.f32610a.c().a(cls);
        if (tVarA != null) {
            d(i10, tVarA.a(this.f32610a, this.b));
        }
    }

    public final void G(@NonNull qn.s sVar) {
        m.c<? extends qn.s> cVar = this.f32612d.get(sVar.getClass());
        if (cVar != null) {
            cVar.a(this, sVar);
        } else {
            h(sVar);
        }
    }

    @Override // qn.d0
    public void a(qn.d dVar) {
        G(dVar);
    }

    @Override // qn.d0
    public void b(qn.n nVar) {
        G(nVar);
    }

    @Override // us.m
    @NonNull
    public u builder() {
        return this.f32611c;
    }

    @Override // us.m
    public boolean c(@NonNull qn.s sVar) {
        return sVar.f() != null;
    }

    @Override // us.m
    public void d(int i10, Object obj) {
        u uVar = this.f32611c;
        u.j(uVar, obj, i10, uVar.length());
    }

    @Override // qn.d0
    public void e(qn.k kVar) {
        G(kVar);
    }

    @Override // qn.d0
    public void f(c0 c0Var) {
        G(c0Var);
    }

    @Override // qn.d0
    public void g(qn.g gVar) {
        G(gVar);
    }

    @Override // us.m
    public void h(@NonNull qn.s sVar) {
        qn.s sVarD = sVar.d();
        while (sVarD != null) {
            qn.s sVarF = sVarD.f();
            sVarD.a(this);
            sVarD = sVarF;
        }
    }

    @Override // qn.d0
    public void i(w wVar) {
        G(wVar);
    }

    @Override // qn.d0
    public void j(qn.l lVar) {
        G(lVar);
    }

    @Override // us.m
    public <N extends qn.s> void k(@NonNull N n10, int i10) {
        F(n10.getClass(), i10);
    }

    @Override // qn.d0
    public void l(qn.b bVar) {
        G(bVar);
    }

    @Override // us.m
    public int length() {
        return this.f32611c.length();
    }

    @Override // qn.d0
    public void m(qn.j jVar) {
        G(jVar);
    }

    @Override // qn.d0
    public void n(b0 b0Var) {
        G(b0Var);
    }

    @Override // us.m
    @NonNull
    public r o() {
        return this.b;
    }

    @Override // qn.d0
    public void p(qn.i iVar) {
        G(iVar);
    }

    @Override // qn.d0
    public void q(qn.c cVar) {
        G(cVar);
    }

    @Override // qn.d0
    public void r(qn.r rVar) {
        G(rVar);
    }

    @Override // qn.d0
    public void s(qn.o oVar) {
        G(oVar);
    }

    @Override // us.m
    public void t(@NonNull qn.s sVar) {
        this.f32613e.a(this, sVar);
    }

    @Override // qn.d0
    public void u(qn.p pVar) {
        G(pVar);
    }

    @Override // qn.d0
    public void v(qn.f fVar) {
        G(fVar);
    }

    @Override // us.m
    @NonNull
    public g w() {
        return this.f32610a;
    }

    @Override // us.m
    public void x() {
        this.f32611c.append('\n');
    }

    @Override // qn.d0
    public void y(a0 a0Var) {
        G(a0Var);
    }

    @Override // qn.d0
    public void z(v vVar) {
        G(vVar);
    }
}
