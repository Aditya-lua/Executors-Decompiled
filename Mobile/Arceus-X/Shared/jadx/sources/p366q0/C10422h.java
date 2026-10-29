package p366q0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: renamed from: q0.h */
/* JADX INFO: loaded from: classes.dex */
public final class C10422h {

    /* JADX INFO: renamed from: a */
    public static volatile ScheduledExecutorService f37552a;

    /* JADX INFO: renamed from: a */
    public static ScheduledExecutorService m40094a() {
        if (f37552a != null) {
            return f37552a;
        }
        synchronized (C10422h.class) {
            try {
                if (f37552a == null) {
                    f37552a = new ScheduledExecutorServiceC10419e(new Handler(Looper.getMainLooper()));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f37552a;
    }
}
