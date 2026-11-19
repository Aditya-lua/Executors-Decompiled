package rd;

import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: classes2.dex */
public final class k extends sd.b.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jb.d f30658a;
    public final tb.k b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f30659c;

    public k(l lVar, tb.k kVar) {
        Objects.requireNonNull(lVar);
        this.f30659c = lVar;
        this.f30658a = new jb.d("OnCheckAgeSignalsCallback");
        this.b = kVar;
    }

    @Override // sd.b
    public final void L0(Bundle bundle) {
        jb.o oVar = this.f30659c.b;
        tb.k kVar = this.b;
        oVar.u(kVar);
        int i10 = bundle.getInt("error.code");
        this.f30658a.a("onError(%d)", Integer.valueOf(i10));
        kVar.d(new a(i10));
    }

    @Override // sd.b
    public final void P(Bundle bundle) {
        jb.o oVar = this.f30659c.b;
        tb.k kVar = this.b;
        oVar.u(kVar);
        this.f30658a.c("onCompleteCheckAgeSignals", new Object[0]);
        kVar.e(e.g(bundle));
    }
}
