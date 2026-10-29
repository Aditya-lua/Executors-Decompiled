package p0;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile Handler f28108a;

    public static Handler a() {
        if (f28108a != null) {
            return f28108a;
        }
        synchronized (o.class) {
            try {
                if (f28108a == null) {
                    f28108a = u2.i.a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f28108a;
    }
}
