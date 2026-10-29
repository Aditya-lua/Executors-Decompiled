package td;

import android.os.Bundle;
import ee.AbstractBinderC5092r0;
import ee.C5096t0;
import p242k9.C7492b;
import sb.C11264k;

/* JADX INFO: renamed from: td.l */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC11598l extends AbstractBinderC5092r0 {

    /* JADX INFO: renamed from: a */
    public final C5096t0 f40970a = new C5096t0("OnRequestIntegrityTokenCallback");

    /* JADX INFO: renamed from: b */
    public final C11264k f40971b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C11601m f40972c;

    public BinderC11598l(C11601m c11601m, C11264k c11264k) {
        this.f40972c = c11601m;
        this.f40971b = c11264k;
    }

    @Override // ee.InterfaceC5094s0
    /* JADX INFO: renamed from: d */
    public final void mo23833d(Bundle bundle) {
        this.f40972c.f40985f.m23795v(this.f40971b);
        this.f40970a.m23841c("onRequestIntegrityToken", new Object[0]);
        C7492b c7492bMo43241a = this.f40972c.f40984e.mo43241a(bundle);
        if (c7492bMo43241a != null) {
            this.f40971b.m42329d(c7492bMo43241a);
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f40971b.m42329d(new C11565a(-100, null));
            return;
        }
        C11595k c11595k = new C11595k(this, this.f40972c.f40981b, bundle.getLong("request.token.sid"));
        C11264k c11264k = this.f40971b;
        C11574d c11574d = new C11574d();
        c11574d.mo43255b(string);
        c11574d.mo43254a(c11595k);
        c11264k.m42330e(c11574d.mo43256c());
    }
}
