package oj;

import android.content.Context;
import gk.v;
import java.util.Map;
import jj.r;
import jj.t;
import jj.x;
import sg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public String a(Context context, String str, x xVar) {
        return xVar.a(context, str);
    }

    public final String b(Context context) {
        return v.a(context);
    }

    public final x c() {
        return new x();
    }

    public void d(Context context, Map<String, String> map) {
        if (context == null || map == null || t.g().i(context)) {
            return;
        }
        vi.b.f().l(context);
        ei.c.e(context);
        String strA = a(context, r.k().n(context), c());
        String strB = b(context);
        pj.f fVarA = new l().a(map);
        if (fVarA.k() && strB.equals("foreground")) {
            return;
        }
        t0.t("v" + fVarA.n(), strA, fVarA.c(), fVarA.getId(), strB, fVarA.n(), fVarA.b());
        if (th.h.a().F5()) {
            t0.u("v" + fVarA.n(), fVarA, null);
        }
        b bVarA = new m().a(fVarA);
        if (bVarA != null) {
            bVarA.a(context, fVarA);
        }
    }
}
