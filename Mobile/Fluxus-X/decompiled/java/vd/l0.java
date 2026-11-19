package vd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge.t0 f34293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n0 f34294d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(n0 n0Var, tb.k kVar) {
        super(n0Var, kVar);
        this.f34294d = n0Var;
        this.f34293c = new ge.t0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // vd.i0, ge.n0
    public final void E1(Bundle bundle) {
        super.E1(bundle);
        this.f34293c.c("onWarmUpExpressIntegrityToken", new Object[0]);
        l9.b bVarA = this.f34294d.f34308e.a(bundle);
        if (bVarA != null) {
            this.f34279a.d(bVarA);
        } else {
            this.f34279a.e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
