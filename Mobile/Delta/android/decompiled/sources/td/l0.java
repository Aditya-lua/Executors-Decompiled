package td;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ee.t0 f32259c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f32260d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, sb.k kVar) {
        super(n0Var, kVar);
        this.f32260d = n0Var;
        this.f32259c = new ee.t0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // td.i0, ee.n0
    public final void B1(Bundle bundle) {
        super.B1(bundle);
        this.f32259c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        k9.b bVarA = this.f32260d.f32274e.a(bundle);
        if (bVarA != null) {
            this.f32245a.d(bVarA);
        } else {
            this.f32245a.e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
