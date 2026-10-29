package nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f25642a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f25643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f25644d;

    public jd(ld ldVar) {
        Objects.requireNonNull(ldVar);
        this.f25644d = ldVar;
        this.f25643c = new hd(this, ldVar.f25625a);
        long jB = ldVar.f25625a.e().b();
        this.f25642a = jB;
        this.b = jB;
    }

    public final void a(long j10) {
        this.f25644d.h();
        this.f25643c.d();
        this.f25642a = j10;
        this.b = j10;
    }

    public final void b(long j10) {
        this.f25643c.d();
    }

    public final void c() {
        this.f25643c.d();
        long jB = this.f25644d.f25625a.e().b();
        this.f25642a = jB;
        this.b = jB;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        ld ldVar = this.f25644d;
        ldVar.h();
        ldVar.j();
        if (ldVar.f25625a.g()) {
            g7 g7Var = ldVar.f25625a;
            g7Var.x().f25682q.b(g7Var.e().a());
        }
        long j11 = j10 - this.f25642a;
        if (!z10 && j11 < 1000) {
            ldVar.f25625a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.b;
            this.b = j10;
        }
        g7 g7Var2 = ldVar.f25625a;
        g7Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !g7Var2.w().N();
        g7 g7Var3 = ldVar.f25625a;
        ve.k0(g7Var3.I().q(z12), bundle, true);
        if (!z11) {
            g7Var3.B().t("auto", "_e", bundle);
        }
        this.f25642a = j10;
        w wVar = this.f25643c;
        wVar.d();
        wVar.b(((Long) z4.f26195r0.b(null)).longValue());
        return true;
    }
}
