package fl;

import mv.a0;
import mv.f0;
import mv.h0;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class b implements a0 {
    public static String b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16153a = "rbx.platform";

    public static String a() {
        return b;
    }

    public static void c(String str) {
        b = str;
    }

    public final f0 b(f0 f0Var, String str) {
        if (str == null || !f0Var.getMethod().equals("POST")) {
            return f0Var;
        }
        q.b("rbx.platform", "XSRFTokenInterceptor.putXSRFTokenInRequest() token:" + a());
        return f0Var.j().m("X-CSRF-TOKEN", str).b();
    }

    @Override // mv.a0
    public h0 intercept(a0.a aVar) {
        String strK;
        h0 h0VarA = aVar.a(b(aVar.h(), a()));
        if (h0VarA.getCode() == 403 && (strK = h0VarA.k("X-CSRF-TOKEN")) != null) {
            q.b("rbx.platform", "XSRFTokenInterceptor.intercept() new token:" + strK);
            c(strK);
        }
        return h0VarA;
    }
}
