package mi;

import android.content.Context;
import com.github.luben.zstd.BuildConfig;
import java.io.File;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLHandshakeException;
import mv.d0;
import mv.h0;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static dl.j f23256a;

    public static class a {
    }

    public static void a() {
        f23256a = null;
        CookieHandler.setDefault(null);
    }

    public static j b(String str, String str2, a[] aVarArr, String str3) {
        return d(cl.g.b(), str, str2, aVarArr, str3);
    }

    public static j c(String str, String str2, a[] aVarArr, String str3, int i10, int i11) {
        d0 d0VarB = cl.g.b();
        if (i10 >= 0 || i11 >= 0) {
            d0.a aVarA = d0VarB.A();
            if (i10 >= 0) {
                aVarA.f(i10, TimeUnit.MILLISECONDS);
            }
            if (i11 >= 0) {
                aVarA.T(i11, TimeUnit.MILLISECONDS);
            }
            d0VarB = aVarA.c();
        }
        return d(d0VarB, str, str2, aVarArr, str3);
    }

    public static j d(d0 d0Var, String str, String str2, a[] aVarArr, String str3) {
        String str4;
        HashMap map = new HashMap();
        if (aVarArr != null && aVarArr.length > 0) {
            a aVar = aVarArr[0];
            throw null;
        }
        j jVar = new j();
        jVar.f23258a = str2 == null ? j.a.GET : j.a.POST;
        jVar.f23259c = str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            try {
                str4 = str;
                try {
                    h0 h0VarA = new dl.g().a(d0Var, str4, str2, map, str3);
                    jVar.f23261e = h0VarA.getCode();
                    jVar.d(h0VarA.getBody().h());
                    jVar.c(h0VarA.m("Last-Modified", BuildConfig.FLAVOR));
                } catch (SSLHandshakeException e10) {
                    e = e10;
                    ok.q.k("rbx.httpagent", "SSLHandshakeException initial newCall(): url = " + str4 + ", exception = " + e);
                    jVar.f23263g = true;
                } catch (IOException e11) {
                    e = e11;
                    ok.q.k("rbx.httpagent", "IOException initial newCall(): url = " + str4 + ", exception = " + e);
                }
            } catch (NullPointerException unused) {
                ok.q.k("rbx.httpagent", "null url in newCall()");
            }
        } catch (SSLHandshakeException e12) {
            e = e12;
            str4 = str;
        } catch (IOException e13) {
            e = e13;
            str4 = str;
        }
        jVar.f23262f = System.currentTimeMillis() - jCurrentTimeMillis;
        return jVar;
    }

    public static void e(Context context) {
        if (f23256a == null) {
            dl.j jVarE = dl.j.e();
            f23256a = jVarE;
            CookieHandler.setDefault(jVarE);
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
