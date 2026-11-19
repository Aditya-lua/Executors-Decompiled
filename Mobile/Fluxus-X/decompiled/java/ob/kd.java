package ob;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class kd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f27521a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ld f27522c;

    public kd(ld ldVar, long j10, long j11) {
        Objects.requireNonNull(ldVar);
        this.f27522c = ldVar;
        this.f27521a = j10;
        this.b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f27522c.b.f27641a.b().t(new Runnable() { // from class: ob.jd
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                kd kdVar = this.f27499a;
                qd qdVar = kdVar.f27522c.b;
                qdVar.h();
                l7 l7Var = qdVar.f27641a;
                l7Var.a().v().a("Application going to the background");
                l7Var.x().f27700t.b(true);
                qdVar.o(true);
                if (!l7Var.w().N()) {
                    long j10 = kdVar.b;
                    od odVar = qdVar.f27747f;
                    odVar.d(false, false, j10);
                    odVar.b(j10);
                }
                l7Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(kdVar.f27521a));
                l7 l7Var2 = qdVar.f27641a;
                va vaVarB = l7Var2.B();
                vaVarB.h();
                l7 l7Var3 = vaVarB.f27641a;
                vaVarB.j();
                yc ycVarJ = l7Var3.J();
                ycVarJ.h();
                ycVarJ.j();
                if (!ycVarJ.y() || ycVarJ.f27641a.C().W() >= 242600) {
                    l7Var3.J().t();
                }
                if (l7Var.w().H(null, e5.O0)) {
                    long jD = l7Var.C().P(l7Var.d().getPackageName(), l7Var.w().R()) ? 1000L : l7Var.w().D(l7Var.d().getPackageName(), e5.E);
                    l7Var.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jD));
                    l7Var2.N().o(jD);
                }
            }
        });
    }
}
