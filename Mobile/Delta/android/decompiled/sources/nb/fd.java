package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f26341a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gd f26342c;

    public fd(gd gdVar, long j10, long j11) {
        Objects.requireNonNull(gdVar);
        this.f26342c = gdVar;
        this.f26341a = j10;
        this.b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f26342c.b.f26446a.b().t(new Runnable() { // from class: nb.ed
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fd fdVar = this.f26317a;
                ld ldVar = fdVar.f26342c.b;
                ldVar.h();
                g7 g7Var = ldVar.f26446a;
                g7Var.a().v().a("Application going to the background");
                g7Var.x().f26506t.b(true);
                ldVar.o(true);
                if (!g7Var.w().N()) {
                    long j10 = fdVar.b;
                    jd jdVar = ldVar.f26556f;
                    jdVar.d(false, false, j10);
                    jdVar.b(j10);
                }
                g7Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(fdVar.f26341a));
                g7 g7Var2 = ldVar.f26446a;
                qa qaVarB = g7Var2.B();
                qaVarB.h();
                g7 g7Var3 = qaVarB.f26446a;
                qaVarB.j();
                tc tcVarJ = g7Var3.J();
                tcVarJ.h();
                tcVarJ.j();
                if (!tcVarJ.y() || tcVarJ.f26446a.C().W() >= 242600) {
                    g7Var3.J().t();
                }
                if (g7Var.w().H(null, z4.O0)) {
                    long jD = g7Var.C().P(g7Var.d().getPackageName(), g7Var.w().R()) ? 1000L : g7Var.w().D(g7Var.d().getPackageName(), z4.E);
                    g7Var.a().w().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jD));
                    g7Var2.N().o(jD);
                }
            }
        });
    }
}
