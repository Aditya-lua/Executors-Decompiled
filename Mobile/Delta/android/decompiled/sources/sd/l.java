package sd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends de.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final de.t0 f30648a = new de.t0("OnRequestIntegrityTokenCallback");
    public final sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f30649c;

    public l(m mVar, sb.k kVar) {
        this.f30649c = mVar;
        this.b = kVar;
    }

    @Override // de.s0
    public final void d(Bundle bundle) {
        this.f30649c.f30660f.v(this.b);
        this.f30648a.c("onRequestIntegrityToken", new Object[0]);
        k9.b bVarA = this.f30649c.f30659e.a(bundle);
        if (bVarA != null) {
            this.b.d(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.b.d(new a(-100, null));
            return;
        }
        k kVar = new k(this, this.f30649c.b, bundle.getLong("request.token.sid"));
        sb.k kVar2 = this.b;
        d dVar = new d();
        dVar.b(string);
        dVar.a(kVar);
        kVar2.e(dVar.c());
    }
}
