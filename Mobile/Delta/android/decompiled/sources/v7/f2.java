package v7;

import android.content.Context;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes.dex */
public final class f2 {
    public static synchronized double a(final Context context) {
        return ((Double) e(new e2(context) { // from class: v7.d2
            @Override // v7.e2
            public final Object zza() {
                return Double.valueOf(2.0d);
            }
        }, Double.valueOf(2.0d))).doubleValue();
    }

    public static synchronized long b(final Context context) {
        return ((Long) e(new e2(context) { // from class: v7.c2
            @Override // v7.e2
            public final Object zza() {
                return 3L;
            }
        }, 3L)).longValue();
    }

    public static synchronized long c(final Context context) {
        return ((Long) e(new e2(context) { // from class: v7.a2
            @Override // v7.e2
            public final Object zza() {
                return 100L;
            }
        }, 100L)).longValue();
    }

    public static synchronized long d(final Context context) {
        return ((Long) e(new e2(context) { // from class: v7.b2
            @Override // v7.e2
            public final Object zza() {
                return Long.valueOf(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
            }
        }, Long.valueOf(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS))).longValue();
    }

    public static Object e(e2 e2Var, Object obj) {
        try {
            return e2Var.zza();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.m0.m("RuntimeFlags", "Fail to get the runtime flags: ".concat(e10.toString()));
            return obj;
        }
    }
}
