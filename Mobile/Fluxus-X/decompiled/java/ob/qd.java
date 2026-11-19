package ob;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class qd extends g5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f27744c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f27745d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final pd f27746e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final od f27747f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ld f27748g;

    public qd(l7 l7Var) {
        super(l7Var);
        this.f27745d = true;
        this.f27746e = new pd(this);
        this.f27747f = new od(this);
        this.f27748g = new ld(this);
    }

    @Override // ob.g5
    public final boolean m() {
        return false;
    }

    public final void o(boolean z10) {
        h();
        this.f27745d = z10;
    }

    public final boolean p() {
        h();
        return this.f27745d;
    }

    public final /* synthetic */ void r(long j10) {
        h();
        q();
        l7 l7Var = this.f27641a;
        l7Var.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (l7Var.w().H(null, e5.V0)) {
            if (l7Var.w().N() || this.f27745d) {
                this.f27747f.a(j10);
            }
        } else if (l7Var.w().N() || l7Var.x().f27700t.a()) {
            this.f27747f.a(j10);
        }
        this.f27748g.a();
        pd pdVar = this.f27746e;
        qd qdVar = pdVar.f27719a;
        qdVar.h();
        if (qdVar.f27641a.g()) {
            pdVar.b(qdVar.f27641a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j10) {
        h();
        q();
        l7 l7Var = this.f27641a;
        l7Var.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f27748g.b(j10);
        if (l7Var.w().N()) {
            this.f27747f.b(j10);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.f27744c;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f27744c == null) {
            this.f27744c = new com.google.android.gms.internal.measurement.q1(Looper.getMainLooper());
        }
    }
}
