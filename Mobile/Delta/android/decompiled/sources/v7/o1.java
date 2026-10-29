package v7;

import android.content.Context;
import com.google.android.gms.internal.play_billing.x8;

/* JADX INFO: loaded from: classes.dex */
public final class o1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f32818a;
    public y7.h b;

    public o1(Context context) {
        try {
            b8.t.f(context);
            this.b = b8.t.c().g(z7.a.f37333g).a("PLAY_BILLING_LIBRARY", x8.class, y7.c.b("proto"), new y7.g() { // from class: v7.n1
                @Override // y7.g
                public final Object apply(Object obj) {
                    return ((x8) obj).b();
                }
            });
        } catch (Throwable unused) {
            this.f32818a = true;
        }
    }

    public final void a(x8 x8Var) {
        if (this.f32818a) {
            com.google.android.gms.internal.play_billing.m0.m("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.b.a(y7.d.e(x8Var));
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.m0.m("BillingLogger", "logging failed.");
        }
    }
}
