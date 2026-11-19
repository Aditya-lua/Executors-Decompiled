package vd;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends ge.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ge.t0 f34291a = new ge.t0("OnRequestIntegrityTokenCallback");
    public final tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f34292c;

    public l(m mVar, tb.k kVar) {
        this.f34292c = mVar;
        this.b = kVar;
    }

    @Override // ge.s0
    public final void d(Bundle bundle) {
        this.f34292c.f34303f.v(this.b);
        this.f34291a.c("onRequestIntegrityToken", new Object[0]);
        l9.b bVarA = this.f34292c.f34302e.a(bundle);
        if (bVarA != null) {
            this.b.d(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.b.d(new a(-100, null));
            return;
        }
        k kVar = new k(this, this.f34292c.b, bundle.getLong("request.token.sid"));
        tb.k kVar2 = this.b;
        d dVar = new d();
        dVar.b(string);
        dVar.a(kVar);
        kVar2.e(dVar.c());
    }
}
