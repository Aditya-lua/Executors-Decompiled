package nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class jd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f26463a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w f26464c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ld f26465d;

    public jd(ld ldVar) {
        Objects.requireNonNull(ldVar);
        this.f26465d = ldVar;
        this.f26464c = new hd(this, ldVar.f26446a);
        long jB = ldVar.f26446a.e().b();
        this.f26463a = jB;
        this.b = jB;
    }

    public final void a(long j10) {
        this.f26465d.h();
        this.f26464c.d();
        this.f26463a = j10;
        this.b = j10;
    }

    public final void b(long j10) {
        this.f26464c.d();
    }

    public final void c() {
        this.f26464c.d();
        long jB = this.f26465d.f26446a.e().b();
        this.f26463a = jB;
        this.b = jB;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        ld ldVar = this.f26465d;
        ldVar.h();
        ldVar.j();
        if (ldVar.f26446a.g()) {
            g7 g7Var = ldVar.f26446a;
            g7Var.x().f26503q.b(g7Var.e().a());
        }
        long j11 = j10 - this.f26463a;
        if (!z10 && j11 < 1000) {
            ldVar.f26446a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.b;
            this.b = j10;
        }
        g7 g7Var2 = ldVar.f26446a;
        g7Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !g7Var2.w().N();
        g7 g7Var3 = ldVar.f26446a;
        ve.k0(g7Var3.I().q(z12), bundle, true);
        if (!z11) {
            g7Var3.B().t("auto", "_e", bundle);
        }
        this.f26463a = j10;
        w wVar = this.f26464c;
        wVar.d();
        wVar.b(((Long) z4.f27016r0.b(null)).longValue());
        return true;
    }
}
