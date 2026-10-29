package ae;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ae.e */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC0159e {
    /* JADX INFO: renamed from: b */
    public static AbstractC0159e m502b(int i10, int i11, int i12, long j10, long j11, List<String> list, List<String> list2) {
        if (i11 != 8) {
            return new C0163g(i10, i11, i12, j10, j11, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC0159e m503n(Bundle bundle) {
        return new C0163g(bundle.getInt("session_id"), bundle.getInt(NotificationCompat.CATEGORY_STATUS), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    /* JADX INFO: renamed from: a */
    public abstract long mo504a();

    /* JADX INFO: renamed from: c */
    public abstract int mo505c();

    /* JADX INFO: renamed from: d */
    public boolean m506d() {
        int iMo511i = mo511i();
        return iMo511i == 0 || iMo511i == 5 || iMo511i == 6 || iMo511i == 7;
    }

    @NonNull
    /* JADX INFO: renamed from: e */
    public List<String> m507e() {
        return mo513k() != null ? new ArrayList(mo513k()) : new ArrayList();
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public List<String> m508f() {
        return mo514l() != null ? new ArrayList(mo514l()) : new ArrayList();
    }

    @Deprecated
    /* JADX INFO: renamed from: g */
    public abstract PendingIntent mo509g();

    /* JADX INFO: renamed from: h */
    public abstract int mo510h();

    /* JADX INFO: renamed from: i */
    public abstract int mo511i();

    /* JADX INFO: renamed from: j */
    public abstract long mo512j();

    /* JADX INFO: renamed from: k */
    public abstract List mo513k();

    /* JADX INFO: renamed from: l */
    public abstract List mo514l();

    /* JADX INFO: renamed from: m */
    public abstract List mo515m();
}
