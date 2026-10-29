package v7;

import com.google.android.gms.internal.play_billing.j7;
import com.google.android.gms.internal.play_billing.l7;
import com.google.android.gms.internal.play_billing.n7;
import com.google.android.gms.internal.play_billing.p7;
import com.google.android.gms.internal.play_billing.q7;
import com.google.android.gms.internal.play_billing.s7;
import com.google.android.gms.internal.play_billing.u7;
import com.google.android.gms.internal.play_billing.z7;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f32789a = 0;

    static {
        int i10 = i1.f32800a;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.a0.c(exc.getMessage());
            int i10 = com.google.android.gms.internal.play_billing.m0.f7176a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    public static l7 b(s7 s7Var, int i10, com.android.billingclient.api.d dVar, String str, z7 z7Var) {
        try {
            q7 q7VarC = u7.C();
            q7VarC.t(dVar.c());
            q7VarC.p(dVar.a());
            if (dVar.b() != 0) {
                q7VarC.r(dVar.b());
            }
            if (s7Var != null) {
                q7VarC.s(s7Var);
            }
            if (str != null) {
                q7VarC.o(str);
            }
            j7 j7VarE = l7.E();
            j7VarE.p(q7VarC);
            j7VarE.t(i10);
            if (!z7Var.equals(z7.BROADCAST_ACTION_UNSPECIFIED)) {
                j7VarE.o(z7Var);
            }
            return (l7) j7VarE.i();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    public static p7 c(int i10, z7 z7Var) {
        try {
            n7 n7VarC = p7.C();
            n7VarC.s(i10);
            if (!z7Var.equals(z7.BROADCAST_ACTION_UNSPECIFIED)) {
                n7VarC.o(z7Var);
            }
            return (p7) n7VarC.i();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.m0.n("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}
