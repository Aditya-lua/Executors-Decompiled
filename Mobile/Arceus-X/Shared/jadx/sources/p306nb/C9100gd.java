package p306nb;

import java.util.Objects;

/* JADX INFO: renamed from: nb.gd */
/* JADX INFO: loaded from: classes.dex */
public final class C9100gd {

    /* JADX INFO: renamed from: a */
    public RunnableC9084fd f32989a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C9180ld f32990b;

    public C9100gd(C9180ld c9180ld) {
        Objects.requireNonNull(c9180ld);
        this.f32990b = c9180ld;
    }

    /* JADX INFO: renamed from: a */
    public final void m36342a() {
        C9180ld c9180ld = this.f32990b;
        c9180ld.mo36088h();
        RunnableC9084fd runnableC9084fd = this.f32989a;
        if (runnableC9084fd != null) {
            c9180ld.m36472t().removeCallbacks(runnableC9084fd);
        }
        C9094g7 c9094g7 = c9180ld.f33067a;
        c9094g7.m36339x().f33132t.m36296b(false);
        c9180ld.m36467o(false);
        if (c9094g7.m36338w().m36406H(null, C9395z4.f33746U0)) {
            C9094g7 c9094g8 = c9180ld.f33067a;
            if (c9094g8.m36307B().m36717v0()) {
                c9094g7.mo36321a().m37011w().m36911a("Retrying trigger URI registration in foreground");
                c9094g8.m36307B().m36721x0();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m36343b(long j10) {
        C9180ld c9180ld = this.f32990b;
        this.f32989a = new RunnableC9084fd(this, c9180ld.f33067a.mo36325e().mo44175a(), j10);
        c9180ld.m36472t().postDelayed(this.f32989a, 2000L);
    }
}
