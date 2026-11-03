package nb;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class gd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public fd f26385a;
    public final /* synthetic */ ld b;

    public gd(ld ldVar) {
        Objects.requireNonNull(ldVar);
        this.b = ldVar;
    }

    public final void a() {
        ld ldVar = this.b;
        ldVar.h();
        fd fdVar = this.f26385a;
        if (fdVar != null) {
            ldVar.t().removeCallbacks(fdVar);
        }
        g7 g7Var = ldVar.f26446a;
        g7Var.x().f26506t.b(false);
        ldVar.o(false);
        if (g7Var.w().H(null, z4.U0)) {
            g7 g7Var2 = ldVar.f26446a;
            if (g7Var2.B().v0()) {
                g7Var.a().w().a("Retrying trigger URI registration in foreground");
                g7Var2.B().x0();
            }
        }
    }

    public final void b(long j10) {
        ld ldVar = this.b;
        this.f26385a = new fd(this, ldVar.f26446a.e().a(), j10);
        ldVar.t().postDelayed(this.f26385a, 2000L);
    }
}
