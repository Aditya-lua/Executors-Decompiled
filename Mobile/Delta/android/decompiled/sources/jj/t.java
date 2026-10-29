package jj;

import android.content.Context;
import sg.a1;
import sg.t0;

/* JADX INFO: loaded from: classes2.dex */
public class t implements om.k.b, om.k.a {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f21509a = new t();
    }

    public static t g() {
        return a.f21509a;
    }

    @Override // om.k.b
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

    @Override // om.k.b
    public boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (th.h.a().B3() || !i(context)) {
            return f(context, new x());
        }
        return false;
    }

    @Override // om.k.b
    public boolean c(Context context, boolean z10) {
        if (context == null || (!th.h.a().B3() && i(context))) {
            return false;
        }
        x xVar = new x();
        if (!z10) {
            return f(context, xVar);
        }
        xVar.f(context, "AndroidNotifShowRationalePrefKey", true);
        return false;
    }

    @Override // om.k.b
    public boolean d(Context context) {
        if (context != null) {
            return th.h.a().B3() || !i(context);
        }
        return false;
    }

    @Override // om.k.a
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
        s sVarM = sg.y.h().m();
        if (sVarM == null) {
            return gk.s.f() ? new ug.a() : new com.roblox.client.fcm.a();
        }
        return sVarM;
    }

    public boolean i(Context context) {
        return a1.r(context);
    }
}
