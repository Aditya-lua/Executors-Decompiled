package p579yk;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p151gk.C6124q;

/* JADX INFO: renamed from: yk.b */
/* JADX INFO: loaded from: classes2.dex */
public class C13200b implements Interceptor {

    /* JADX INFO: renamed from: b */
    public static String f46474b;

    /* JADX INFO: renamed from: a */
    public final String f46475a = "rbx.platform";

    /* JADX INFO: renamed from: a */
    public static String m48819a() {
        return f46474b;
    }

    /* JADX INFO: renamed from: c */
    public static void m48820c(String str) {
        f46474b = str;
    }

    /* JADX INFO: renamed from: b */
    public final Request m48821b(Request request, String str) {
        if (str == null || !request.method().equals("POST")) {
            return request;
        }
        C6124q.m27057b("rbx.platform", "XSRFTokenInterceptor.putXSRFTokenInRequest() token:" + m48819a());
        return request.newBuilder().header("X-CSRF-TOKEN", str).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String strHeader;
        Response responseProceed = chain.proceed(m48821b(chain.request(), m48819a()));
        if (responseProceed.code() == 403 && (strHeader = responseProceed.header("X-CSRF-TOKEN")) != null) {
            C6124q.m27057b("rbx.platform", "XSRFTokenInterceptor.intercept() new token:" + strHeader);
            m48820c(strHeader);
        }
        return responseProceed;
    }
}
