package q0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile ScheduledExecutorService f29526a;

    public static ScheduledExecutorService a() {
        if (f29526a != null) {
            return f29526a;
        }
        synchronized (h.class) {
            try {
                if (f29526a == null) {
                    f29526a = new e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f29526a;
    }
}
