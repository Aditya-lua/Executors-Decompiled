package p486v7;

import android.content.Context;
import com.google.android.gms.internal.play_billing.C2571m0;
import okhttp3.internal.p336ws.RealWebSocket;

/* JADX INFO: renamed from: v7.f2 */
/* JADX INFO: loaded from: classes.dex */
public final class C12037f2 {
    /* JADX INFO: renamed from: a */
    public static synchronized double m44852a(final Context context) {
        return ((Double) m44856e(new InterfaceC12033e2(context) { // from class: v7.d2
            @Override // p486v7.InterfaceC12033e2
            public final Object zza() {
                return Double.valueOf(2.0d);
            }
        }, Double.valueOf(2.0d))).doubleValue();
    }

    /* JADX INFO: renamed from: b */
    public static synchronized long m44853b(final Context context) {
        return ((Long) m44856e(new InterfaceC12033e2(context) { // from class: v7.c2
            @Override // p486v7.InterfaceC12033e2
            public final Object zza() {
                return 3L;
            }
        }, 3L)).longValue();
    }

    /* JADX INFO: renamed from: c */
    public static synchronized long m44854c(final Context context) {
        return ((Long) m44856e(new InterfaceC12033e2(context) { // from class: v7.a2
            @Override // p486v7.InterfaceC12033e2
            public final Object zza() {
                return 100L;
            }
        }, 100L)).longValue();
    }

    /* JADX INFO: renamed from: d */
    public static synchronized long m44855d(final Context context) {
        return ((Long) m44856e(new InterfaceC12033e2(context) { // from class: v7.b2
            @Override // p486v7.InterfaceC12033e2
            public final Object zza() {
                return Long.valueOf(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS);
            }
        }, Long.valueOf(RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS))).longValue();
    }

    /* JADX INFO: renamed from: e */
    public static Object m44856e(InterfaceC12033e2 interfaceC12033e2, Object obj) {
        try {
            return interfaceC12033e2.zza();
        } catch (Exception e10) {
            C2571m0.m11565m("RuntimeFlags", "Fail to get the runtime flags: ".concat(e10.toString()));
            return obj;
        }
    }
}
