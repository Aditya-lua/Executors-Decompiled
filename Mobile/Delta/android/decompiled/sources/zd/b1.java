package zd;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class b1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f37455a;
    public final /* synthetic */ h b;

    public b1(h hVar, d dVar) {
        this.b = hVar;
        this.f37455a = dVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        a1 a1Var = this.b.b;
        List<String> listB = this.f37455a.b();
        List listI = h.i(this.f37455a.a());
        Bundle bundle = new Bundle();
        bundle.putInt("session_id", 0);
        bundle.putInt("status", 5);
        bundle.putInt("error_code", 0);
        if (!listB.isEmpty()) {
            bundle.putStringArrayList("module_names", new ArrayList<>(listB));
        }
        if (!listI.isEmpty()) {
            bundle.putStringArrayList("languages", new ArrayList<>(listI));
        }
        bundle.putLong("total_bytes_to_download", 0L);
        bundle.putLong("bytes_downloaded", 0L);
        a1Var.j(e.n(bundle));
    }
}
