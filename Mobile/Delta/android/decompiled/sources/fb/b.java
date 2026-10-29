package fb;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f16507a;
    public final HashMap b;

    public abstract void a(String str, int i10);

    public final void b() {
        synchronized (this.f16507a) {
            try {
                HashMap map = this.b;
                for (Map.Entry entry : map.entrySet()) {
                    a((String) entry.getKey(), ((AtomicInteger) entry.getValue()).get());
                }
                map.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
