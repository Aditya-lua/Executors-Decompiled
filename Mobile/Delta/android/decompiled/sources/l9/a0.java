package l9;

import android.app.Activity;
import com.google.android.gms.common.ConnectionResult;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends t1 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w1.b f22985f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f22986g;

    public a0(j jVar, f fVar, j9.c cVar) {
        super(jVar, cVar);
        this.f22985f = new w1.b();
        this.f22986g = fVar;
        this.f23031a.g("ConnectionlessLifecycleHelper", this);
    }

    public static void u(Activity activity, f fVar, b bVar) {
        j jVarC = i.c(activity);
        a0 a0Var = (a0) jVarC.d("ConnectionlessLifecycleHelper", a0.class);
        if (a0Var == null) {
            a0Var = new a0(jVarC, fVar, j9.c.o());
        }
        n9.m.m(bVar, "ApiKey cannot be null");
        a0Var.f22985f.add(bVar);
        fVar.b(a0Var);
    }

    @Override // l9.i
    public final void h() {
        super.h();
        v();
    }

    @Override // l9.t1, l9.i
    public final void j() {
        super.j();
        v();
    }

    @Override // l9.t1, l9.i
    public final void k() {
        super.k();
        this.f22986g.c(this);
    }

    @Override // l9.t1
    public final void m(ConnectionResult connectionResult, int i10) {
        this.f22986g.H(connectionResult, i10);
    }

    @Override // l9.t1
    public final void n() {
        this.f22986g.I();
    }

    public final w1.b t() {
        return this.f22985f;
    }

    public final void v() {
        if (this.f22985f.isEmpty()) {
            return;
        }
        this.f22986g.b(this);
    }
}
