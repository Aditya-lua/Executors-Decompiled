package w7;

import android.content.Context;
import com.google.android.gms.internal.play_billing.x8;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f35635a;
    public z7.h b;

    public o1(Context context) {
        try {
            c8.t.f(context);
            this.b = c8.t.c().g(a8.a.f304g).a("PLAY_BILLING_LIBRARY", x8.class, z7.c.b("proto"), new z7.g() { // from class: w7.n1
                @Override // z7.g
                public final Object apply(Object obj) {
                    return ((x8) obj).b();
                }
            });
        } catch (Throwable unused) {
            this.f35635a = true;
        }
    }

    public final void a(x8 x8Var) {
        if (this.f35635a) {
            com.google.android.gms.internal.play_billing.m0.m("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.b.a(z7.d.e(x8Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.m0.m("BillingLogger", "logging failed.");
        }
    }
}
