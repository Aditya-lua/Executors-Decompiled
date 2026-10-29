package zd;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e {
    public static e b(int i10, int i11, int i12, long j10, long j11, List<String> list, List<String> list2) {
        if (i11 != 8) {
            return new g(i10, i11, i12, j10, j11, list, list2, null, null);
        }
        throw new IllegalArgumentException("REQUIRES_USER_CONFIRMATION state not supported.");
    }

    public static e n(Bundle bundle) {
        return new g(bundle.getInt("session_id"), bundle.getInt("status"), bundle.getInt("error_code"), bundle.getLong("bytes_downloaded"), bundle.getLong("total_bytes_to_download"), bundle.getStringArrayList("module_names"), bundle.getStringArrayList("languages"), (PendingIntent) bundle.getParcelable("user_confirmation_intent"), bundle.getParcelableArrayList("split_file_intents"));
    }

    public abstract long a();

    public abstract int c();

    public boolean d() {
        int i10 = i();
        return i10 == 0 || i10 == 5 || i10 == 6 || i10 == 7;
    }

    @NonNull
    public List<String> e() {
        return k() != null ? new ArrayList(k()) : new ArrayList();
    }

    @NonNull
    public List<String> f() {
        return l() != null ? new ArrayList(l()) : new ArrayList();
    }

    @Deprecated
    public abstract PendingIntent g();

    public abstract int h();

    public abstract int i();

    public abstract long j();

    public abstract List k();

    public abstract List l();

    public abstract List m();
}
