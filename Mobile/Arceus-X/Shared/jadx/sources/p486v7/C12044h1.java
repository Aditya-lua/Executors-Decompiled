package p486v7;

import com.android.billingclient.api.C1748d;
import com.google.android.gms.internal.play_billing.C2439a0;
import com.google.android.gms.internal.play_billing.C2545j7;
import com.google.android.gms.internal.play_billing.C2567l7;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2589n7;
import com.google.android.gms.internal.play_billing.C2611p7;
import com.google.android.gms.internal.play_billing.C2622q7;
import com.google.android.gms.internal.play_billing.C2666u7;
import com.google.android.gms.internal.play_billing.EnumC2644s7;
import com.google.android.gms.internal.play_billing.EnumC2721z7;

/* JADX INFO: renamed from: v7.h1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C12044h1 {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int f42603a = 0;

    static {
        int i10 = InterfaceC12048i1.f42618a;
    }

    /* JADX INFO: renamed from: a */
    public static String m44857a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + C2439a0.m11167c(exc.getMessage());
            int i10 = C2571m0.f9152a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static C2567l7 m44858b(EnumC2644s7 enumC2644s7, int i10, C1748d c1748d, String str, EnumC2721z7 enumC2721z7) {
        try {
            C2622q7 c2622q7M11790C = C2666u7.m11790C();
            c2622q7M11790C.m11693t(c1748d.m8610c());
            c2622q7M11790C.m11689p(c1748d.m8608a());
            if (c1748d.m8609b() != 0) {
                c2622q7M11790C.m11691r(c1748d.m8609b());
            }
            if (enumC2644s7 != null) {
                c2622q7M11790C.m11692s(enumC2644s7);
            }
            if (str != null) {
                c2622q7M11790C.m11688o(str);
            }
            C2545j7 c2545j7M11545E = C2567l7.m11545E();
            c2545j7M11545E.m11511p(c2622q7M11790C);
            c2545j7M11545E.m11515t(i10);
            if (!enumC2721z7.equals(EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED)) {
                c2545j7M11545E.m11510o(enumC2721z7);
            }
            return (C2567l7) c2545j7M11545E.m11645i();
        } catch (Throwable th2) {
            C2571m0.m11566n("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    /* JADX INFO: renamed from: c */
    public static C2611p7 m44859c(int i10, EnumC2721z7 enumC2721z7) {
        try {
            C2589n7 c2589n7M11664C = C2611p7.m11664C();
            c2589n7M11664C.m11624s(i10);
            if (!enumC2721z7.equals(EnumC2721z7.BROADCAST_ACTION_UNSPECIFIED)) {
                c2589n7M11664C.m11620o(enumC2721z7);
            }
            return (C2611p7) c2589n7M11664C.m11645i();
        } catch (Exception e10) {
            C2571m0.m11566n("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
