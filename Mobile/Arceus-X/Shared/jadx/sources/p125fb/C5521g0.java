package p125fb;

import android.app.PendingIntent;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Status;
import p305n9.C8947k;
import p305n9.C8953m;

/* JADX INFO: renamed from: fb.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C5521g0 {

    /* JADX INFO: renamed from: a */
    public final String f21294a;

    /* JADX INFO: renamed from: b */
    public final Status f21295b;

    public C5521g0(Status status, String str) {
        this.f21295b = status;
        this.f21294a = str;
    }

    /* JADX INFO: renamed from: a */
    public static C5521g0 m25179a(String str) {
        return new C5521g0(Status.f7405k, str);
    }

    /* JADX INFO: renamed from: b */
    public static C5521g0 m25180b(Status status) {
        C8953m.m36036a(!status.m9163A3());
        return new C5521g0(status, null);
    }

    /* JADX INFO: renamed from: c */
    public final boolean m25181c() {
        return this.f21295b.m9163A3();
    }

    /* JADX INFO: renamed from: d */
    public final String m25182d() {
        return this.f21294a;
    }

    /* JADX INFO: renamed from: e */
    public final PendingIntent m25183e() {
        return this.f21295b.m9165w3();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5521g0)) {
            return false;
        }
        C5521g0 c5521g0 = (C5521g0) obj;
        return C8947k.m36026b(this.f21295b, c5521g0.f21295b) && C8947k.m36026b(this.f21294a, c5521g0.f21294a);
    }

    public final int hashCode() {
        return C8947k.m36027c(this.f21295b, this.f21294a);
    }

    public final String toString() {
        return C8947k.m36028d(this).m36029a(NotificationCompat.CATEGORY_STATUS, this.f21295b).m36029a("gameRunToken", this.f21294a).toString();
    }
}
