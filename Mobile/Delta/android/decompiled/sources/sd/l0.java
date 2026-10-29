package sd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.t0 f30650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f30651d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, sb.k kVar) {
        super(n0Var, kVar);
        this.f30651d = n0Var;
        this.f30650c = new de.t0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // sd.i0, de.n0
    public final void C1(Bundle bundle) {
        super.C1(bundle);
        this.f30650c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        k9.b bVarA = this.f30651d.f30665e.a(bundle);
        if (bVarA != null) {
            this.f30636a.d(bVarA);
        } else {
            this.f30636a.e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
