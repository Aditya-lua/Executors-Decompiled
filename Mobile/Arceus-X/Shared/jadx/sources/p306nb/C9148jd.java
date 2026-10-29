package p306nb;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: renamed from: nb.jd */
/* JADX INFO: loaded from: classes.dex */
public final class C9148jd {

    /* JADX INFO: renamed from: a */
    public long f33085a;

    /* JADX INFO: renamed from: b */
    public long f33086b;

    /* JADX INFO: renamed from: c */
    public final AbstractC9342w f33087c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C9180ld f33088d;

    public C9148jd(C9180ld c9180ld) {
        Objects.requireNonNull(c9180ld);
        this.f33088d = c9180ld;
        this.f33087c = new C9116hd(this, c9180ld.f33067a);
        long jMo44176b = c9180ld.f33067a.mo36325e().mo44176b();
        this.f33085a = jMo44176b;
        this.f33086b = jMo44176b;
    }

    /* JADX INFO: renamed from: a */
    public final void m36390a(long j10) {
        this.f33088d.mo36088h();
        this.f33087c.m36992d();
        this.f33085a = j10;
        this.f33086b = j10;
    }

    /* JADX INFO: renamed from: b */
    public final void m36391b(long j10) {
        this.f33087c.m36992d();
    }

    /* JADX INFO: renamed from: c */
    public final void m36392c() {
        this.f33087c.m36992d();
        long jMo44176b = this.f33088d.f33067a.mo36325e().mo44176b();
        this.f33085a = jMo44176b;
        this.f33086b = jMo44176b;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m36393d(boolean z10, boolean z11, long j10) {
        C9180ld c9180ld = this.f33088d;
        c9180ld.mo36088h();
        c9180ld.m36121j();
        if (c9180ld.f33067a.m36327g()) {
            C9094g7 c9094g7 = c9180ld.f33067a;
            c9094g7.m36339x().f33129q.m36346b(c9094g7.mo36325e().mo44175a());
        }
        long j11 = j10 - this.f33085a;
        if (!z10 && j11 < 1000) {
            c9180ld.f33067a.mo36321a().m37011w().m36912b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j11));
            return false;
        }
        if (!z11) {
            j11 = j10 - this.f33086b;
            this.f33086b = j10;
        }
        C9094g7 c9094g8 = c9180ld.f33067a;
        c9094g8.mo36321a().m37011w().m36912b("Recording user engagement, ms", Long.valueOf(j11));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j11);
        boolean z12 = !c9094g8.m36338w().m36412N();
        C9094g7 c9094g9 = c9180ld.f33067a;
        C9341ve.m36931k0(c9094g9.m36314I().m36380q(z12), bundle, true);
        if (!z11) {
            c9094g9.m36307B().m36712t("auto", "_e", bundle);
        }
        this.f33085a = j10;
        AbstractC9342w abstractC9342w = this.f33087c;
        abstractC9342w.m36992d();
        abstractC9342w.m36990b(((Long) C9395z4.f33804r0.m37079b(null)).longValue());
        return true;
    }
}
