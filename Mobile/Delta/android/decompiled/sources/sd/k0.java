package sd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class k0 extends i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final de.t0 f30645c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f30646d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0 f30647e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(n0 n0Var, sb.k kVar, long j10) {
        super(n0Var, kVar);
        this.f30647e = n0Var;
        this.f30645c = new de.t0("OnRequestIntegrityTokenCallback");
        this.f30646d = j10;
    }

    @Override // sd.i0, de.n0
    public final void b(Bundle bundle) {
        super.b(bundle);
        this.f30645c.c("onRequestExpressIntegrityToken", new Object[0]);
        k9.b bVarA = this.f30647e.f30665e.a(bundle);
        if (bVarA != null) {
            this.f30636a.d(bVarA);
            return;
        }
        j0 j0Var = new j0(this, this.f30647e.b, bundle.getLong("request.token.sid"));
        sb.k kVar = this.f30636a;
        a0 a0Var = new a0();
        a0Var.b(bundle.getString("token"));
        a0Var.a(j0Var);
        kVar.e(a0Var.c());
    }
}
