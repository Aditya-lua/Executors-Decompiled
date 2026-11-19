package rj;

import android.content.Context;
import bh.a1;
import bh.t0;

/* JADX INFO: loaded from: classes2.dex */
public class t implements bn.k.b, bn.k.a {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f30768a = new t();
    }

    public static t g() {
        return a.f30768a;
    }

    @Override // bn.k.b
    public void a(Context context, boolean z10, boolean z11) {
        boolean z12;
        if (context == null) {
            return;
        }
        x xVar = new x();
        if (xVar.e(context, "AndroidNotifShowRationalePrefKey")) {
            z12 = z10 != xVar.b(context, "AndroidNotifShowRationalePrefKey");
        } else {
            z12 = z10;
        }
        if (z10) {
            xVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        }
        if (!z11 && !z12) {
            t0.l("sysPromptDismiss", false);
        } else {
            t0.l("sysPrompt", z11);
            xVar.f(context, "AndroidNotifUserInteractedPrefKey", true);
        }
    }

    @Override // bn.k.b
    public boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (bi.h.a().R3() || !i(context)) {
            return f(context, new x());
        }
        return false;
    }

    @Override // bn.k.b
    public boolean c(Context context, boolean z10) {
        if (context == null || (!bi.h.a().R3() && i(context))) {
            return false;
        }
        x xVar = new x();
        if (!z10) {
            return f(context, xVar);
        }
        xVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        return false;
    }

    @Override // bn.k.b
    public boolean d(Context context) {
        if (context != null) {
            return bi.h.a().R3() || !i(context);
        }
        return false;
    }

    @Override // bn.k.a
    public boolean e(Context context) {
        if (context == null) {
            return false;
        }
        x xVar = new x();
        return xVar.e(context, "AndroidNotifUserInteractedPrefKey") && xVar.b(context, "AndroidNotifUserInteractedPrefKey");
    }

    public final boolean f(Context context, x xVar) {
        return ((xVar.e(context, "AndroidNotifShowRationalePrefKey") && xVar.b(context, "AndroidNotifShowRationalePrefKey")) || (xVar.e(context, "AndroidNotifUserInteractedPrefKey") && xVar.b(context, "AndroidNotifUserInteractedPrefKey"))) ? false : true;
    }

    public s h(Context context) {
        if (i(context)) {
            return null;
        }
        s sVarM = bh.y.h().m();
        if (sVarM == null) {
            return ok.t.f() ? new dh.a() : new com.roblox.client.fcm.a();
        }
        return sVarM;
    }

    public boolean i(Context context) {
        return a1.r(context);
    }
}
