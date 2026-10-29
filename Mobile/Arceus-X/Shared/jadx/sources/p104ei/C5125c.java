package p104ei;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import okhttp3.OkHttpClient;
import okhttp3.Response;
import p151gk.C6124q;
import p493vk.C12225g;
import p520wk.C12485g;
import p520wk.C12488j;

/* JADX INFO: renamed from: ei.c */
/* JADX INFO: loaded from: classes2.dex */
public class C5125c {

    /* JADX INFO: renamed from: a */
    public static C12488j f19997a;

    /* JADX INFO: renamed from: ei.c$a */
    public static class a {
    }

    /* JADX INFO: renamed from: a */
    public static void m23917a() {
        f19997a = null;
        CookieHandler.setDefault(null);
    }

    /* JADX INFO: renamed from: b */
    public static C5132j m23918b(String str, String str2, a[] aVarArr, String str3) {
        return m23920d(C12225g.m45324b(), str, str2, aVarArr, str3);
    }

    /* JADX INFO: renamed from: c */
    public static C5132j m23919c(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        OkHttpClient okHttpClientM45324b = C12225g.m45324b();
        if (i10 >= 0 || i11 >= 0) {
            OkHttpClient.Builder builderNewBuilder = okHttpClientM45324b.newBuilder();
            if (i10 >= 0) {
                builderNewBuilder.connectTimeout(i10, TimeUnit.MILLISECONDS);
            }
            if (i11 >= 0) {
                builderNewBuilder.readTimeout(i11, TimeUnit.MILLISECONDS);
            }
            okHttpClientM45324b = builderNewBuilder.build();
        }
        return m23920d(okHttpClientM45324b, str, str2, aVarArr, str3);
    }

    /* JADX INFO: renamed from: d */
    public static C5132j m23920d(OkHttpClient okHttpClient, String str, String str2, a[] aVarArr, String str3) {
        String str4;
        HashMap map = new HashMap();
        if (aVarArr != null && aVarArr.length > 0) {
            a aVar = aVarArr[0];
            throw null;
        }
        C5132j c5132j = new C5132j();
        c5132j.f19999a = str2 == null ? C5132j.a.GET : C5132j.a.POST;
        c5132j.f20001c = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                str4 = str;
                try {
                    Response responseM46765a = new C12485g().m46765a(okHttpClient, str4, str2, map, str3);
                    c5132j.f20003e = responseM46765a.code();
                    c5132j.m23935d(responseM46765a.body().string());
                    c5132j.m23934c(responseM46765a.header("Last-Modified", ""));
                } catch (SSLHandshakeException e10) {
                    e = e10;
                    C6124q.m27066k("rbx.httpagent", "SSLHandshakeException initial newCall(): url = " + str4 + ", exception = " + e);
                    c5132j.f20005g = true;
                } catch (IOException e11) {
                    e = e11;
                    C6124q.m27066k("rbx.httpagent", "IOException initial newCall(): url = " + str4 + ", exception = " + e);
                }
            } catch (NullPointerException unused) {
                C6124q.m27066k("rbx.httpagent", "null url in newCall()");
            }
        } catch (SSLHandshakeException e12) {
            e = e12;
            str4 = str;
        } catch (IOException e13) {
            e = e13;
            str4 = str;
        }
        c5132j.f20004f = System.currentTimeMillis() - jCurrentTimeMillis;
        return c5132j;
    }

    /* JADX INFO: renamed from: e */
    public static void m23921e(Context context) {
        if (f19997a == null) {
            C12488j c12488jM46781c = C12488j.m46781c();
            f19997a = c12488jM46781c;
            CookieHandler.setDefault(c12488jM46781c);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m23922f(File file, String str) {
    }

    /* JADX INFO: renamed from: g */
    public static void m23923g() {
    }

    /* JADX INFO: renamed from: h */
    public static void m23924h() {
    }

    /* JADX INFO: renamed from: i */
    public static C5132j m23925i(String str, String str2, a[] aVarArr) {
        return m23927k(str, str2, aVarArr, null);
    }

    /* JADX INFO: renamed from: j */
    public static C5132j m23926j(String str, String str2, a[] aVarArr, String str3) {
        return m23927k(str, str2, aVarArr, str3);
    }

    /* JADX INFO: renamed from: k */
    public static C5132j m23927k(String str, String str2, a[] aVarArr, String str3) {
        return m23918b(str, str2, aVarArr, str3);
    }

    /* JADX INFO: renamed from: l */
    public static C5132j m23928l(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        return m23919c(str, str2, aVarArr, str3, i10, i11);
    }
}
