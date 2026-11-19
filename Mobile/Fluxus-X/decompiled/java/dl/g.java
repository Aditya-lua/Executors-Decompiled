package dl;

import java.util.Map;
import mv.b0;
import mv.d0;
import mv.f0;
import mv.g0;
import mv.h0;
import ok.q;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    public h0 a(d0 d0Var, String str, String str2, Map<String, String> map, String str3) {
        return b(d0Var, str, str2, map, str3, false);
    }

    public h0 b(d0 d0Var, String str, String str2, Map<String, String> map, String str3, boolean z10) {
        return c(d0Var, new f0.a(), str, str2, map, str3, false);
    }

    public h0 c(d0 d0Var, f0.a aVar, String str, String str2, Map<String, String> map, String str3, boolean z10) {
        String str4;
        aVar.t(str);
        if (map != null) {
            for (String str5 : map.keySet()) {
                String str6 = map.get(str5);
                if (str5 != null && str6 != null) {
                    aVar.m(str5, str6);
                }
            }
        }
        if (str2 != null) {
            String str7 = str3 == null ? "application/x-www-form-urlencoded;charset=UTF-8" : str3;
            aVar.p(g0.d(b0.g(str7), str2));
            String strA = fl.b.a();
            if (strA != null) {
                aVar.m("X-CSRF-TOKEN", strA);
            }
            str4 = str7;
        } else {
            str4 = str3;
        }
        h0 h0VarJ = d0Var.a(aVar.b()).j();
        if (h0VarJ.getCode() == 403) {
            String strK = h0VarJ.k("X-CSRF-TOKEN");
            if (!z10 && strK != null) {
                q.b("rbx.platform", "XSRF: got token. retrying");
                fl.b.c(strK);
                return b(d0Var, str, str2, map, str4, true);
            }
            if (z10) {
                q.b("rbx.platform", "XSRF Error: retry already attempted. Will not retry");
                return h0VarJ;
            }
            q.b("rbx.platform", "XSRF Error: token not present in response. Will not retry");
        }
        return h0VarJ;
    }
}
