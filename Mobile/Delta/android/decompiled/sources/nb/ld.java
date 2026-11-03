package nb;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class ld extends b5 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f26553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f26554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final kd f26555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final jd f26556f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gd f26557g;

    public ld(g7 g7Var) {
        super(g7Var);
        this.f26554d = true;
        this.f26555e = new kd(this);
        this.f26556f = new jd(this);
        this.f26557g = new gd(this);
    }

    @Override // nb.b5
    public final boolean m() {
        return false;
    }

    public final void o(boolean z10) {
        h();
        this.f26554d = z10;
    }

    public final boolean p() {
        h();
        return this.f26554d;
    }

    public final /* synthetic */ void r(long j10) {
        h();
        q();
        g7 g7Var = this.f26446a;
        g7Var.a().w().b("Activity resumed, time", Long.valueOf(j10));
        if (g7Var.w().H(null, z4.V0)) {
            if (g7Var.w().N() || this.f26554d) {
                this.f26556f.a(j10);
            }
        } else if (g7Var.w().N() || g7Var.x().f26506t.a()) {
            this.f26556f.a(j10);
        }
        this.f26557g.a();
        kd kdVar = this.f26555e;
        ld ldVar = kdVar.f26525a;
        ldVar.h();
        if (ldVar.f26446a.g()) {
            kdVar.b(ldVar.f26446a.e().a(), false);
        }
    }

    public final /* synthetic */ void s(long j10) {
        h();
        q();
        g7 g7Var = this.f26446a;
        g7Var.a().w().b("Activity paused, time", Long.valueOf(j10));
        this.f26557g.b(j10);
        if (g7Var.w().N()) {
            this.f26556f.b(j10);
        }
    }

    public final /* synthetic */ Handler t() {
        return this.f26553c;
    }

    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void q() {
        h();
        if (this.f26553c == null) {
            this.f26553c = new com.google.android.gms.internal.measurement.q1(Looper.getMainLooper());
        }
    }
}
