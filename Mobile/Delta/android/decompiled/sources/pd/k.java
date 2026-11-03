package pd;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends qd.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ib.d f28655a;
    public final sb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f28656c;

    public k(l lVar, sb.k kVar) {
        Objects.requireNonNull(lVar);
        this.f28656c = lVar;
        this.f28655a = new ib.d("OnCheckAgeSignalsCallback");
        this.b = kVar;
    }

    @Override // qd.b
    public final void C0(Bundle bundle) {
        ib.o oVar = this.f28656c.b;
        sb.k kVar = this.b;
        oVar.u(kVar);
        int i10 = bundle.getInt("error.code");
        this.f28655a.a("onError(%d)", Integer.valueOf(i10));
        kVar.d(new a(i10));
    }

    @Override // qd.b
    public final void O(Bundle bundle) {
        ib.o oVar = this.f28656c.b;
        sb.k kVar = this.b;
        oVar.u(kVar);
        this.f28655a.c("onCompleteCheckAgeSignals", new Object[0]);
        kVar.e(e.g(bundle));
    }
}
