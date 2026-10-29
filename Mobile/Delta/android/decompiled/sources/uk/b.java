package uk;

import fv.c;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c f32349a;

    public static c a() {
        if (f32349a == null) {
            synchronized (b.class) {
                try {
                    if (f32349a == null) {
                        f32349a = c.b().a();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return f32349a;
    }
}
