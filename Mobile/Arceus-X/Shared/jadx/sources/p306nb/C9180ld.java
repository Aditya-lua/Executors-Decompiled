package p306nb;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.internal.measurement.HandlerC2257q1;

/* JADX INFO: renamed from: nb.ld */
/* JADX INFO: loaded from: classes.dex */
public final class C9180ld extends AbstractC9008b5 {

    /* JADX INFO: renamed from: c */
    public Handler f33188c;

    /* JADX INFO: renamed from: d */
    public boolean f33189d;

    /* JADX INFO: renamed from: e */
    public final C9164kd f33190e;

    /* JADX INFO: renamed from: f */
    public final C9148jd f33191f;

    /* JADX INFO: renamed from: g */
    public final C9100gd f33192g;

    public C9180ld(C9094g7 c9094g7) {
        super(c9094g7);
        this.f33189d = true;
        this.f33190e = new C9164kd(this);
        this.f33191f = new C9148jd(this);
        this.f33192g = new C9100gd(this);
    }

    @Override // p306nb.AbstractC9008b5
    /* JADX INFO: renamed from: m */
    public final boolean mo36124m() {
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m36467o(boolean z10) {
        mo36088h();
        this.f33189d = z10;
    }

    /* JADX INFO: renamed from: p */
    public final boolean m36468p() {
        mo36088h();
        return this.f33189d;
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m36470r(long j10) {
        mo36088h();
        m36469q();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37011w().m36912b("Activity resumed, time", Long.valueOf(j10));
        if (c9094g7.m36338w().m36406H(null, C9395z4.f33748V0)) {
            if (c9094g7.m36338w().m36412N() || this.f33189d) {
                this.f33191f.m36390a(j10);
            }
        } else if (c9094g7.m36338w().m36412N() || c9094g7.m36339x().f33132t.m36295a()) {
            this.f33191f.m36390a(j10);
        }
        this.f33192g.m36342a();
        C9164kd c9164kd = this.f33190e;
        C9180ld c9180ld = c9164kd.f33155a;
        c9180ld.mo36088h();
        if (c9180ld.f33067a.m36327g()) {
            c9164kd.m36459b(c9180ld.f33067a.mo36325e().mo44175a(), false);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m36471s(long j10) {
        mo36088h();
        m36469q();
        C9094g7 c9094g7 = this.f33067a;
        c9094g7.mo36321a().m37011w().m36912b("Activity paused, time", Long.valueOf(j10));
        this.f33192g.m36343b(j10);
        if (c9094g7.m36338w().m36412N()) {
            this.f33191f.m36391b(j10);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Handler m36472t() {
        return this.f33188c;
    }

    /* JADX DEBUG: Method merged with bridge method: q()V */
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public final void m36469q() {
        mo36088h();
        if (this.f33188c == null) {
            this.f33188c = new HandlerC2257q1(Looper.getMainLooper());
        }
    }
}
