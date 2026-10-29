package od;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends pd.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib.d f27327a;
    public final sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f27328c;

    public k(l lVar, sb.k kVar) {
        Objects.requireNonNull(lVar);
        this.f27328c = lVar;
        this.f27327a = new ib.d("OnCheckAgeSignalsCallback");
        this.b = kVar;
    }

    @Override // pd.b
    public final void I0(Bundle bundle) {
        ib.o oVar = this.f27328c.b;
        sb.k kVar = this.b;
        oVar.u(kVar);
        int i10 = bundle.getInt("error.code");
        this.f27327a.a("onError(%d)", Integer.valueOf(i10));
        kVar.d(new a(i10));
    }

    @Override // pd.b
    public final void Q(Bundle bundle) {
        ib.o oVar = this.f27328c.b;
        sb.k kVar = this.b;
        oVar.u(kVar);
        this.f27327a.c("onCompleteCheckAgeSignals", new Object[0]);
        kVar.e(e.g(bundle));
    }
}
