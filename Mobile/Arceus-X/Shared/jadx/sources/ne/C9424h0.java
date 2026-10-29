package ne;

import java.util.concurrent.Future;

/* JADX INFO: renamed from: ne.h0 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9424h0 {
    /* JADX INFO: renamed from: a */
    public static <V> V m37242a(Future<V> future) {
        V v5;
        boolean z10 = false;
        while (true) {
            try {
                v5 = future.get();
                break;
            } catch (InterruptedException unused) {
                z10 = true;
            } catch (Throwable th2) {
                if (z10) {
                    Thread.currentThread().interrupt();
                }
                throw th2;
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        return v5;
    }
}
