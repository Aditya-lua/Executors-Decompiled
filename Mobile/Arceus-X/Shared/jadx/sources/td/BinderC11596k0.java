package td;

import android.os.Bundle;
import ee.C5096t0;
import p242k9.C7492b;
import sb.C11264k;

/* JADX INFO: renamed from: td.k0 */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC11596k0 extends BinderC11590i0 {

    /* JADX INFO: renamed from: c */
    public final C5096t0 f40967c;

    /* JADX INFO: renamed from: d */
    public final long f40968d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C11605n0 f40969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC11596k0(C11605n0 c11605n0, C11264k c11264k, long j10) {
        super(c11605n0, c11264k);
        this.f40969e = c11605n0;
        this.f40967c = new C5096t0("OnRequestIntegrityTokenCallback");
        this.f40968d = j10;
    }

    @Override // td.BinderC11590i0, ee.InterfaceC5084n0
    /* JADX INFO: renamed from: b */
    public final void mo23822b(Bundle bundle) {
        super.mo23822b(bundle);
        this.f40967c.m23841c("onRequestExpressIntegrityToken", new Object[0]);
        C7492b c7492bMo43241a = this.f40969e.f40992e.mo43241a(bundle);
        if (c7492bMo43241a != null) {
            this.f40956a.m42329d(c7492bMo43241a);
            return;
        }
        C11593j0 c11593j0 = new C11593j0(this, this.f40969e.f40989b, bundle.getLong("request.token.sid"));
        C11264k c11264k = this.f40956a;
        C11566a0 c11566a0 = new C11566a0();
        c11566a0.mo43237b(bundle.getString("token"));
        c11566a0.mo43236a(c11593j0);
        c11264k.m42330e(c11566a0.mo43238c());
    }
}
