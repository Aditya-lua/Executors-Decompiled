package u9;

import android.os.StrictMode;

/* JADX INFO: loaded from: classes.dex */
public final class t {
    public static StrictMode.VmPolicy a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (m.k()) {
            StrictMode.setVmPolicy(s.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
