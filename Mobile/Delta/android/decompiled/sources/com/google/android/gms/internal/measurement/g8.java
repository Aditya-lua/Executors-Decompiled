package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class g8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static f8 f6457a;

    public static synchronized void a(f8 f8Var) {
        if (f6457a != null) {
            throw new IllegalStateException("init() already called");
        }
        f6457a = f8Var;
    }

    public static synchronized f8 b() {
        try {
            if (f6457a == null) {
                a(new j8());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6457a;
    }
}
