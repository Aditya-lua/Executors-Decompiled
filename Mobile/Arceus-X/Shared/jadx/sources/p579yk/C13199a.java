package p579yk;

import okhttp3.Interceptor;
import okhttp3.Response;
import p151gk.C6124q;

/* JADX INFO: renamed from: yk.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13199a implements Interceptor {

    /* JADX INFO: renamed from: a */
    public final String f46473a;

    public C13199a(String str) {
        this.f46473a = str;
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        C6124q.m27057b("rbx.platform", "UserAgentInterceptor.intercept()");
        return chain.proceed(chain.request().newBuilder().header("User-Agent", this.f46473a).build());
    }
}
