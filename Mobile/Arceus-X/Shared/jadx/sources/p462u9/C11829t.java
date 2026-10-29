package p462u9;

import android.os.StrictMode;

/* JADX INFO: renamed from: u9.t */
/* JADX INFO: loaded from: classes.dex */
public final class C11829t {
    /* JADX INFO: renamed from: a */
    public static StrictMode.VmPolicy m44215a() {
        StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
        if (C11822m.m44204k()) {
            StrictMode.setVmPolicy(C11828s.m44214a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
        }
        return vmPolicy;
    }
}
