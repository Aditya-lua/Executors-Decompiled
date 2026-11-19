package ob;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class od {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f27658a;
    public long b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z f27659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ qd f27660d;

    public od(qd qdVar) {
        Objects.requireNonNull(qdVar);
        this.f27660d = qdVar;
        this.f27659c = new md(this, qdVar.f27641a);
        long jB = qdVar.f27641a.e().b();
        this.f27658a = jB;
        this.b = jB;
    }

    public final void a(long j10) {
        this.f27660d.h();
        this.f27659c.d();
        this.f27658a = j10;
        this.b = j10;
    }

    public final void b(long j10) {
        this.f27659c.d();
    }

    public final void c() {
        this.f27659c.d();
        long jB = this.f27660d.f27641a.e().b();
        this.f27658a = jB;
        this.b = jB;
    }

    public final boolean d(boolean z10, boolean z11, long j10) {
        qd qdVar = this.f27660d;
        qdVar.h();
        qdVar.j();
        if (qdVar.f27641a.g()) {
            l7 l7Var = qdVar.f27641a;
            l7Var.x().f27697q.b(l7Var.e().a());
        }
        long j11 = j10 - this.f27658a;
        if (!z10 && j11 < 1000) {
            qdVar.f27641a.a().w().b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.b;
            this.b = j10;
        }
        l7 l7Var2 = qdVar.f27641a;
        l7Var2.a().w().b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !l7Var2.w().N();
        l7 l7Var3 = qdVar.f27641a;
        ff.k0(l7Var3.I().q(z12), bundle, true);
        if (!z11) {
            l7Var3.B().t("auto", "_e", bundle);
        }
        this.f27658a = j10;
        z zVar = this.f27659c;
        zVar.d();
        zVar.b(((Long) e5.f27270r0.b(null)).longValue());
        return true;
    }
}
