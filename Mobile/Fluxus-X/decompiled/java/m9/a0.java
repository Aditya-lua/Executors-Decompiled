package m9;

import android.app.Activity;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends t1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1.b f22970f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f22971g;

    public a0(j jVar, f fVar, k9.e eVar) {
        super(jVar, eVar);
        this.f22970f = new w1.b();
        this.f22971g = fVar;
        this.f23016a.f("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, f fVar, b bVar) {
        j jVarC = i.c(activity);
        a0 a0Var = (a0) jVarC.d("ConnectionlessLifecycleHelper", a0.class);
        if (a0Var == null) {
            a0Var = new a0(jVarC, fVar, k9.e.o());
        }
        o9.s.m(bVar, "ApiKey cannot be null");
        a0Var.f22970f.add(bVar);
        fVar.b(a0Var);
    }

    @Override // m9.i
    public final void h() {
        super.h();
        v();
    }

    @Override // m9.t1, m9.i
    public final void j() {
        super.j();
        v();
    }

    @Override // m9.t1, m9.i
    public final void k() {
        super.k();
        this.f22971g.c(this);
    }

    @Override // m9.t1
    public final void m(k9.b bVar, int i10) {
        this.f22971g.H(bVar, i10);
    }

    @Override // m9.t1
    public final void n() {
        this.f22971g.I();
    }

    public final w1.b t() {
        return this.f22970f;
    }

    public final void v() {
        if (this.f22970f.isEmpty()) {
            return;
        }
        this.f22971g.b(this);
    }
}
