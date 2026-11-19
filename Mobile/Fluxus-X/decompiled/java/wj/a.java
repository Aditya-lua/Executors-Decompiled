package wj;

import android.content.Context;
import bh.t0;
import java.util.Map;
import ok.w;
import rj.r;
import rj.t;
import rj.x;

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
        dj.b.f().k(context);
        mi.c.e(context);
        String strA = a(context, r.k().n(context), c());
        String strB = b(context);
        xj.f fVarA = new m().a(map);
        if (fVarA.k() && strB.equals("foreground")) {
            return;
        }
        t0.t("v" + fVarA.o(), strA, fVarA.c(), fVarA.getId(), strB, fVarA.o(), fVarA.b());
        t0.u("v" + fVarA.o(), fVarA, null);
        c cVarA = new n().a(fVarA);
        if (cVarA != null) {
            cVarA.a(context, fVarA);
        }
    }
}
