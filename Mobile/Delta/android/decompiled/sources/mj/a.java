package mj;

import android.content.Context;
import ek.w;
import hj.r;
import hj.t;
import hj.x;
import java.util.Map;
import rg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class a {
    public String a(Context context, String str, x xVar) {
        return xVar.a(context, str);
    }

    public final String b(Context context) {
        return w.a(context);
    }

    public final x c() {
        return new x();
    }

    public void d(Context context, Map<String, String> map) {
        if (context == null || map == null || t.g().i(context)) {
            return;
        }
        ti.b.f().l(context);
        ci.c.e(context);
        String strA = a(context, r.k().n(context), c());
        String strB = b(context);
        nj.f fVarA = new m().a(map);
        if (fVarA.k() && strB.equals("foreground")) {
            return;
        }
        t0.t("v" + fVarA.o(), strA, fVarA.c(), fVarA.getId(), strB, fVarA.o(), fVarA.b());
        if (rh.h.a().P5()) {
            t0.u("v" + fVarA.o(), fVarA, null);
        }
        c cVarA = new n().a(fVarA);
        if (cVarA != null) {
            cVarA.a(context, fVarA);
        }
    }
}
