package ae;

import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: ae.b1 */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC0154b1 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0157d f524a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0165h f525b;

    public RunnableC0154b1(C0165h c0165h, C0157d c0157d) {
        this.f525b = c0165h;
        this.f524a = c0157d;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0151a1 c0151a1 = this.f525b.f543b;
        List<String> listM497b = this.f524a.m497b();
        List listM523i = C0165h.m523i(this.f524a.m496a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt(NotificationCompat.CATEGORY_STATUS, 5);
        bundle.putInt("error_code", 0);
        if (!listM497b.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(listM497b));
        }
        if (!listM523i.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(listM523i));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        c0151a1.m482j(AbstractC0159e.m503n(bundle));
    }
}
