package p0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f28643a;

    public static Handler a() {
        if (f28643a != null) {
            return f28643a;
        }
        synchronized (o.class) {
            try {
                if (f28643a == null) {
                    f28643a = u2.i.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f28643a;
    }
}
