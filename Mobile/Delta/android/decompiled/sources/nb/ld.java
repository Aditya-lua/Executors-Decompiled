package nb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ld extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f25732c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f25733d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kd f25734e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jd f25735f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gd f25736g;

    public ld(g7 g7Var) {
        super(g7Var);
        this.f25733d = true;
        this.f25734e = new kd(this);
        this.f25735f = new jd(this);
        this.f25736g = new gd(this);
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(boolean z10) {
        h();
        this.f25733d = z10;
    }

    public final boolean p() {
        h();
        return this.f25733d;
    }

    public final /* synthetic */ void r(long j10) {
        h();
        q();
        g7 g7Var = this.f25625a;
        g7Var.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (g7Var.w().H(null, z4.V0)) {
            if (g7Var.w().N() || this.f25733d) {
                this.f25735f.a(j10);
            }
        } else if (g7Var.w().N() || g7Var.x().f25685t.a()) {
            this.f25735f.a(j10);
        }
        this.f25736g.a();
        kd kdVar = this.f25734e;
        ld ldVar = kdVar.f25704a;
        ldVar.h();
        if (ldVar.f25625a.g()) {
            kdVar.b(ldVar.f25625a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j10) {
        h();
        q();
        g7 g7Var = this.f25625a;
        g7Var.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f25736g.b(j10);
        if (g7Var.w().N()) {
            this.f25735f.b(j10);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.f25732c;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f25732c == null) {
            this.f25732c = new com.google.android.gms.internal.measurement.q1(Looper.getMainLooper());
        }
    }
}
