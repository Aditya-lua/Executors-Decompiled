package p347p0;

import android.os.Handler;
import android.os.Looper;
import p456u2.C11780i;

/* JADX INFO: renamed from: p0.o */
/* JADX INFO: loaded from: classes.dex */
public final class C10099o {

    /* JADX INFO: renamed from: a */
    public static volatile Handler f36384a;

    /* JADX INFO: renamed from: a */
    public static Handler m38990a() {
        if (f36384a != null) {
            return f36384a;
        }
        synchronized (C10099o.class) {
            try {
                if (f36384a == null) {
                    f36384a = C11780i.m44064a(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f36384a;
    }
}
