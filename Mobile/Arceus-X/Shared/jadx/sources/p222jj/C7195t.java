package p222jj;

import android.content.Context;
import com.roblox.client.fcm.C3184a;
import om.AbstractC9810k;
import p151gk.C6127t;
import sg.C11295a1;
import sg.C11356t0;
import sg.C11370y;
import th.C11659h;
import ug.C11854a;

/* JADX INFO: renamed from: jj.t */
/* JADX INFO: loaded from: classes2.dex */
public class C7195t implements AbstractC9810k.b, AbstractC9810k.a {

    /* JADX INFO: renamed from: jj.t$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final C7195t f27880a = new C7195t();
    }

    /* JADX INFO: renamed from: g */
    public static C7195t m30098g() {
        return a.f27880a;
    }

    @Override // om.AbstractC9810k.b
    /* JADX INFO: renamed from: a */
    public void mo30099a(Context context, boolean z10, boolean z11) {
        boolean z12;
        if (context == null) {
            return;
        }
        C7199x c7199x = new C7199x();
        if (c7199x.m30124e(context, "AndroidNotifShowRationalePrefKey")) {
            z12 = z10 != c7199x.m30121b(context, "AndroidNotifShowRationalePrefKey");
        } else {
            z12 = z10;
        }
        if (z10) {
            c7199x.m30125f(context, "AndroidNotifShowRationalePrefKey", true);
        }
        if (!z11 && !z12) {
            C11356t0.m42542l("sysPromptDismiss", false);
        } else {
            C11356t0.m42542l("sysPrompt", z11);
            c7199x.m30125f(context, "AndroidNotifUserInteractedPrefKey", true);
        }
    }

    @Override // om.AbstractC9810k.b
    /* JADX INFO: renamed from: b */
    public boolean mo30100b(Context context) {
        if (context == null) {
            return false;
        }
        if (C11659h.m43403a().mo43450G3() || !m30106i(context)) {
            return m30104f(context, new C7199x());
        }
        return false;
    }

    @Override // om.AbstractC9810k.b
    /* JADX INFO: renamed from: c */
    public boolean mo30101c(Context context, boolean z10) {
        if (context == null || (!C11659h.m43403a().mo43450G3() && m30106i(context))) {
            return false;
        }
        C7199x c7199x = new C7199x();
        if (!z10) {
            return m30104f(context, c7199x);
        }
        c7199x.m30125f(context, "AndroidNotifShowRationalePrefKey", true);
        return false;
    }

    @Override // om.AbstractC9810k.b
    /* JADX INFO: renamed from: d */
    public boolean mo30102d(Context context) {
        if (context != null) {
            return C11659h.m43403a().mo43450G3() || !m30106i(context);
        }
        return false;
    }

    @Override // om.AbstractC9810k.a
    /* JADX INFO: renamed from: e */
    public boolean mo30103e(Context context) {
        if (context == null) {
            return false;
        }
        C7199x c7199x = new C7199x();
        return c7199x.m30124e(context, "AndroidNotifUserInteractedPrefKey") && c7199x.m30121b(context, "AndroidNotifUserInteractedPrefKey");
    }

    /* JADX INFO: renamed from: f */
    public final boolean m30104f(Context context, C7199x c7199x) {
        return ((c7199x.m30124e(context, "AndroidNotifShowRationalePrefKey") && c7199x.m30121b(context, "AndroidNotifShowRationalePrefKey")) || (c7199x.m30124e(context, "AndroidNotifUserInteractedPrefKey") && c7199x.m30121b(context, "AndroidNotifUserInteractedPrefKey"))) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC7194s m30105h(Context context) {
        if (m30106i(context)) {
            return null;
        }
        InterfaceC7194s interfaceC7194sM42593m = C11370y.m42581h().m42593m();
        if (interfaceC7194sM42593m == null) {
            return C6127t.m27090f() ? new C11854a() : new C3184a();
        }
        return interfaceC7194sM42593m;
    }

    /* JADX INFO: renamed from: i */
    public boolean m30106i(Context context) {
        return C11295a1.m42472r(context);
    }
}
