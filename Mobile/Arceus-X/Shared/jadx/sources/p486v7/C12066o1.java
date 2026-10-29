package p486v7;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C2571m0;
import com.google.android.gms.internal.play_billing.C2700x8;
import p028b8.C1272t;
import p569y7.AbstractC13117d;
import p569y7.C13116c;
import p569y7.InterfaceC13120g;
import p569y7.InterfaceC13121h;
import p597z7.C13732a;

/* JADX INFO: renamed from: v7.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C12066o1 {

    /* JADX INFO: renamed from: a */
    public boolean f42645a;

    /* JADX INFO: renamed from: b */
    public InterfaceC13121h f42646b;

    public C12066o1(Context context) {
        try {
            C1272t.m7051f(context);
            this.f42646b = C1272t.m7049c().m7054g(C13732a.f48305g).mo7043a("PLAY_BILLING_LIBRARY", C2700x8.class, C13116c.m48729b("proto"), new InterfaceC13120g() { // from class: v7.n1
                @Override // p569y7.InterfaceC13120g
                public final Object apply(Object obj) {
                    return ((C2700x8) obj).m11331b();
                }
            });
        } catch (Throwable unused) {
            this.f42645a = true;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m44907a(C2700x8 c2700x8) {
        if (this.f42645a) {
            C2571m0.m11565m("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.f42646b.mo7046a(AbstractC13117d.m48731e(c2700x8));
        } catch (Throwable unused) {
            C2571m0.m11565m("BillingLogger", "logging failed.");
        }
    }
}
