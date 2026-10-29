package td;

import android.os.Bundle;
import ee.C5096t0;
import p242k9.C7492b;
import sb.C11264k;

/* JADX INFO: renamed from: td.l0 */
/* JADX INFO: loaded from: classes2.dex */
public final class BinderC11599l0 extends BinderC11590i0 {

    /* JADX INFO: renamed from: c */
    public final C5096t0 f40973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C11605n0 f40974d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BinderC11599l0(C11605n0 c11605n0, C11264k c11264k) {
        super(c11605n0, c11264k);
        this.f40974d = c11605n0;
        this.f40973c = new C5096t0("OnWarmUpIntegrityTokenCallback");
    }

    @Override // td.BinderC11590i0, ee.InterfaceC5084n0
    /* JADX INFO: renamed from: B1 */
    public final void mo23820B1(Bundle bundle) {
        super.mo23820B1(bundle);
        this.f40973c.m23841c("onWarmUpExpressIntegrityToken", new Object[0]);
        C7492b c7492bMo43241a = this.f40974d.f40992e.mo43241a(bundle);
        if (c7492bMo43241a != null) {
            this.f40956a.m42329d(c7492bMo43241a);
        } else {
            this.f40956a.m42330e(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
