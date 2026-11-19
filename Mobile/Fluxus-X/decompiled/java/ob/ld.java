package ob;

import com.roblox.protocols.calling.CallingHandler;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class ld {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kd f27567a;
    public final /* synthetic */ qd b;

    public ld(qd qdVar) {
        Objects.requireNonNull(qdVar);
        this.b = qdVar;
    }

    public final void a() {
        qd qdVar = this.b;
        qdVar.h();
        kd kdVar = this.f27567a;
        if (kdVar != null) {
            qdVar.t().removeCallbacks(kdVar);
        }
        l7 l7Var = qdVar.f27641a;
        l7Var.x().f27700t.b(false);
        qdVar.o(false);
        if (l7Var.w().H(null, e5.U0)) {
            l7 l7Var2 = qdVar.f27641a;
            if (l7Var2.B().v0()) {
                l7Var.a().w().a("Retrying trigger URI registration in foreground");
                l7Var2.B().x0();
            }
        }
    }

    public final void b(long j10) {
        qd qdVar = this.b;
        this.f27567a = new kd(this, qdVar.f27641a.e().a(), j10);
        qdVar.t().postDelayed(this.f27567a, CallingHandler.AVATAR_TIMEOUT_MS);
    }
}
