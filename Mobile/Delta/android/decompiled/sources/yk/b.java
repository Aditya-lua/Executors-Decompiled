package yk;

import gk.p;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class b implements Interceptor {
    public static String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f35900a = "rbx.platform";

    public static String a() {
        return b;
    }

    public static void c(String str) {
        b = str;
    }

    public final Request b(Request request, String str) {
        if (str == null || !request.method().equals("POST")) {
            return request;
        }
        p.b("rbx.platform", "XSRFTokenInterceptor.putXSRFTokenInRequest() token:" + a());
        return request.newBuilder().header("X-CSRF-TOKEN", str).build();
    }

    @Override // okhttp3.Interceptor
    public Response intercept(Interceptor.Chain chain) {
        String strHeader;
        Response responseProceed = chain.proceed(b(chain.request(), a()));
        if (responseProceed.code() == 403 && (strHeader = responseProceed.header("X-CSRF-TOKEN")) != null) {
            p.b("rbx.platform", "XSRFTokenInterceptor.intercept() new token:" + strHeader);
            c(strHeader);
        }
        return responseProceed;
    }
}
