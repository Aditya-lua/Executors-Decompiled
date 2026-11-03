package td;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public final class l extends ee.r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ee.t0 f32257a = new ee.t0("OnRequestIntegrityTokenCallback");
    public final sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ m f32258c;

    public l(m mVar, sb.k kVar) {
        this.f32258c = mVar;
        this.b = kVar;
    }

    @Override // ee.s0
    public final void d(Bundle bundle) {
        this.f32258c.f32269f.v(this.b);
        this.f32257a.c("onRequestIntegrityToken", new Object[0]);
        k9.b bVarA = this.f32258c.f32268e.a(bundle);
        if (bVarA != null) {
            this.b.d(bVarA);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.b.d(new a(-100, null));
            return;
        }
        k kVar = new k(this, this.f32258c.b, bundle.getLong("request.token.sid"));
        sb.k kVar2 = this.b;
        d dVar = new d();
        dVar.b(string);
        dVar.a(kVar);
        kVar2.e(dVar.c());
    }
}
