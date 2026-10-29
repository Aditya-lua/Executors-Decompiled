package p125fb;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: fb.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5500b {

    /* JADX INFO: renamed from: a */
    public final Object f21265a;

    /* JADX INFO: renamed from: b */
    public final HashMap f21266b;

    /* JADX INFO: renamed from: a */
    public abstract void m25153a(String str, int i10);

    /* JADX INFO: renamed from: b */
    public final void m25154b() {
        synchronized (this.f21265a) {
            try {
                HashMap map = this.f21266b;
                for (Map.Entry entry : map.entrySet()) {
                    m25153a((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
                }
                map.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
