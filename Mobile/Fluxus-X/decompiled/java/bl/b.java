package bl;

import mw.c;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f4455a;

    public static c a() {
        if (f4455a == null) {
            synchronized (b.class) {
                try {
                    if (f4455a == null) {
                        f4455a = c.b().a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f4455a;
    }
}
