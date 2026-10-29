package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class fd implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f25520a;
    public final long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ gd f25521c;

    public fd(gd gdVar, long j10, long j11) {
        Objects.requireNonNull(gdVar);
        this.f25521c = gdVar;
        this.f25520a = j10;
        this.b = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f25521c.b.f25625a.b().t(new Runnable() { // from class: nb.ed
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                fd fdVar = this.f25496a;
                ld ldVar = fdVar.f25521c.b;
                ldVar.h();
                g7 g7Var = ldVar.f25625a;
                g7Var.a().v().a("Application going to the background");
                g7Var.x().f25685t.b(true);
                ldVar.o(true);
                if (!g7Var.w().N()) {
                    long j10 = fdVar.b;
                    jd jdVar = ldVar.f25735f;
                    jdVar.d(false, false, j10);
                    jdVar.b(j10);
                }
                g7Var.a().u().b("Application backgrounded at: timestamp_millis", Long.valueOf(fdVar.f25520a));
                g7 g7Var2 = ldVar.f25625a;
                qa qaVarB = g7Var2.B();
                qaVarB.h();
                g7 g7Var3 = qaVarB.f25625a;
                qaVarB.j();
                tc tcVarJ = g7Var3.J();
                tcVarJ.h();
                tcVarJ.j();
                if (!tcVarJ.y() || tcVarJ.f25625a.C().W() >= 242600) {
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
