package fl;

import mv.a0;
import mv.h0;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class a implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16152a;

    public a(String str) {
        this.f16152a = str;
    }

    @Override // mv.a0
    public h0 intercept(a0.a aVar) {
        q.b("rbx.platform", "UserAgentInterceptor.intercept()");
        return aVar.a(aVar.h().j().m("User-Agent", this.f16152a).b());
    }
}
