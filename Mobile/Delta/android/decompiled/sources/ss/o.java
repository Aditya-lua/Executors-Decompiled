package ss;

import androidx.annotation.NonNull;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import on.a0;
import on.b0;
import on.c0;
import on.v;
import on.w;
import on.x;

/* JADX INFO: loaded from: classes3.dex */
public class o implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f31800a;
    public final r b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u f31801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<Class<? extends on.s>, m.c<? extends on.s>> f31802d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final m.a f31803e;

    public static class a implements m.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Map<Class<? extends on.s>, m.c<? extends on.s>> f31804a = new HashMap();
        public m.a b;

        @Override // ss.m.b
        @NonNull
        public m a(@NonNull g gVar, @NonNull r rVar) {
            m.a bVar = this.b;
            if (bVar == null) {
                bVar = new b();
            }
            return new o(gVar, rVar, new u(), Collections.unmodifiableMap(this.f31804a), bVar);
        }

        @Override // ss.m.b
        @NonNull
        public <N extends on.s> m.b b(@NonNull Class<N> cls, m.c<? super N> cVar) {
            if (cVar == null) {
                this.f31804a.remove(cls);
                return this;
            }
            this.f31804a.put(cls, cVar);
            return this;
        }
    }

    public o(@NonNull g gVar, @NonNull r rVar, @NonNull u uVar, @NonNull Map<Class<? extends on.s>, m.c<? extends on.s>> map, @NonNull m.a aVar) {
        this.f31800a = gVar;
        this.b = rVar;
        this.f31801c = uVar;
        this.f31802d = map;
        this.f31803e = aVar;
    }

    @Override // on.d0
    public void A(x xVar) {
        G(xVar);
    }

    @Override // on.d0
    public void B(on.h hVar) {
        G(hVar);
    }

    @Override // on.d0
    public void C(v vVar) {
        G(vVar);
    }

    @Override // on.d0
    public void D(on.d dVar) {
        G(dVar);
    }

    @Override // on.d0
    public void E(on.o oVar) {
        G(oVar);
    }

    public <N extends on.s> void F(@NonNull Class<N> cls, int i10) {
        t tVarA = this.f31800a.c().a(cls);
        if (tVarA != null) {
            b(i10, tVarA.a(this.f31800a, this.b));
        }
    }

    public final void G(@NonNull on.s sVar) {
        m.c<? extends on.s> cVar = this.f31802d.get(sVar.getClass());
        if (cVar != null) {
            cVar.a(this, sVar);
        } else {
            a(sVar);
        }
    }

    @Override // ss.m
    public void a(@NonNull on.s sVar) {
        on.s sVarD = sVar.d();
        while (sVarD != null) {
            on.s sVarF = sVarD.f();
            sVarD.a(this);
            sVarD = sVarF;
        }
    }

    @Override // ss.m
    public void b(int i10, Object obj) {
        u uVar = this.f31801c;
        u.j(uVar, obj, i10, uVar.length());
    }

    @Override // ss.m
    @NonNull
    public u builder() {
        return this.f31801c;
    }

    @Override // on.d0
    public void c(on.p pVar) {
        G(pVar);
    }

    @Override // ss.m
    public boolean d(@NonNull on.s sVar) {
        return sVar.f() != null;
    }

    @Override // on.d0
    public void e(on.k kVar) {
        G(kVar);
    }

    @Override // on.d0
    public void f(on.j jVar) {
        G(jVar);
    }

    @Override // ss.m
    public void g(@NonNull on.s sVar) {
        this.f31803e.b(this, sVar);
    }

    @Override // on.d0
    public void h(on.r rVar) {
        G(rVar);
    }

    @Override // on.d0
    public void i(on.g gVar) {
        G(gVar);
    }

    @Override // on.d0
    public void j(a0 a0Var) {
        G(a0Var);
    }

    @Override // on.d0
    public void k(w wVar) {
        G(wVar);
    }

    @Override // on.d0
    public void l(on.n nVar) {
        G(nVar);
    }

    @Override // ss.m
    public int length() {
        return this.f31801c.length();
    }

    @Override // on.d0
    public void m(c0 c0Var) {
        G(c0Var);
    }

    @Override // ss.m
    @NonNull
    public r n() {
        return this.b;
    }

    @Override // on.d0
    public void o(b0 b0Var) {
        G(b0Var);
    }

    @Override // ss.m
    public <N extends on.s> void p(@NonNull N n10, int i10) {
        F(n10.getClass(), i10);
    }

    @Override // on.d0
    public void q(on.m mVar) {
        G(mVar);
    }

    @Override // on.d0
    public void r(on.l lVar) {
        G(lVar);
    }

    @Override // ss.m
    public void s(@NonNull on.s sVar) {
        this.f31803e.a(this, sVar);
    }

    @Override // on.d0
    public void t(on.c cVar) {
        G(cVar);
    }

    @Override // on.d0
    public void u(on.f fVar) {
        G(fVar);
    }

    @Override // on.d0
    public void v(on.i iVar) {
        G(iVar);
    }

    @Override // on.d0
    public void w(on.b bVar) {
        G(bVar);
    }

    @Override // ss.m
    @NonNull
    public g x() {
        return this.f31800a;
    }

    @Override // ss.m
    public void y() {
        this.f31801c.append('\n');
    }

    @Override // ss.m
    public void z() {
        if (this.f31801c.length() <= 0 || '\n' == this.f31801c.h()) {
            return;
        }
        this.f31801c.append('\n');
    }
}
