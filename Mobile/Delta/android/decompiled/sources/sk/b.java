package sk;

import dv.c;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f31539a;

    public static c a() {
        if (f31539a == null) {
            synchronized (b.class) {
                try {
                    if (f31539a == null) {
                        f31539a = c.b().a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f31539a;
    }
}
