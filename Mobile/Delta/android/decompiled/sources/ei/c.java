package ei;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static wk.j f15570a;

    public static class a {
    }

    public static void a() {
        f15570a = null;
        CookieHandler.setDefault(null);
    }

    public static j b(String str, String str2, a[] aVarArr, String str3) {
        return d(vk.g.b(), str, str2, aVarArr, str3);
    }

    public static j c(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        OkHttpClient okHttpClientB = vk.g.b();
        if (i10 >= 0 || i11 >= 0) {
            OkHttpClient.Builder builderNewBuilder = okHttpClientB.newBuilder();
            if (i10 >= 0) {
                builderNewBuilder.connectTimeout(i10, TimeUnit.MILLISECONDS);
            }
            if (i11 >= 0) {
                builderNewBuilder.readTimeout(i11, TimeUnit.MILLISECONDS);
            }
            okHttpClientB = builderNewBuilder.build();
        }
        return d(okHttpClientB, str, str2, aVarArr, str3);
    }

    public static j d(OkHttpClient okHttpClient, String str, String str2, a[] aVarArr, String str3) {
        String str4;
        HashMap map = new HashMap();
        if (aVarArr != null && aVarArr.length > 0) {
            a aVar = aVarArr[0];
            throw null;
        }
        j jVar = new j();
        jVar.f15572a = str2 == null ? j.a.GET : j.a.POST;
        jVar.f15573c = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                str4 = str;
                try {
                    Response responseA = new wk.g().a(okHttpClient, str4, str2, map, str3);
                    jVar.f15575e = responseA.code();
                    jVar.d(responseA.body().string());
                    jVar.c(responseA.header("Last-Modified", ""));
                } catch (SSLHandshakeException e10) {
                    e = e10;
                    gk.p.k("rbx.httpagent", "SSLHandshakeException initial newCall(): url = " + str4 + ", exception = " + e);
                    jVar.f15577g = true;
                } catch (IOException e11) {
                    e = e11;
                    gk.p.k("rbx.httpagent", "IOException initial newCall(): url = " + str4 + ", exception = " + e);
                }
            } catch (NullPointerException unused) {
                gk.p.k("rbx.httpagent", "null url in newCall()");
            }
        } catch (SSLHandshakeException e12) {
            e = e12;
            str4 = str;
        } catch (IOException e13) {
            e = e13;
            str4 = str;
        }
        jVar.f15576f = System.currentTimeMillis() - jCurrentTimeMillis;
        return jVar;
    }

    public static void e(Context context) {
        if (f15570a == null) {
            wk.j jVarC = wk.j.c();
            f15570a = jVarC;
            CookieHandler.setDefault(jVarC);
        }
    }

    public static void f(File file, String str) {
    }

    public static void g() {
    }

    public static void h() {
    }

    public static j i(String str, String str2, a[] aVarArr) {
        return k(str, str2, aVarArr, null);
    }

    public static j j(String str, String str2, a[] aVarArr, String str3) {
        return k(str, str2, aVarArr, str3);
    }

    public static j k(String str, String str2, a[] aVarArr, String str3) {
        return b(str, str2, aVarArr, str3);
    }

    public static j l(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        return c(str, str2, aVarArr, str3, i10, i11);
    }
}
