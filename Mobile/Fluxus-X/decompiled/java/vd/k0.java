package vd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ge.t0 f34288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f34289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f34290e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, tb.k kVar, long j10) {
        super(n0Var, kVar);
        this.f34290e = n0Var;
        this.f34288c = new ge.t0("OnRequestIntegrityTokenCallback");
        this.f34289d = j10;
    }

    @Override // vd.i0, ge.n0
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.f34288c.c("onRequestExpressIntegrityToken", new Object[0]);
        l9.b bVarA = this.f34290e.f34308e.a(bundle);
        if (bVarA != null) {
            this.f34279a.d(bVarA);
            return;
        }
        j0 j0Var = new j0(this, this.f34290e.b, bundle.getLong("request.token.sid"));
        tb.k kVar = this.f34279a;
        a0 a0Var = new a0();
        a0Var.b(bundle.getString("token"));
        a0Var.a(j0Var);
        kVar.e(a0Var.c());
    }
}
