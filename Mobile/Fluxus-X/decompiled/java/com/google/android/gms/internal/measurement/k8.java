package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class k8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static j8 f6574a;

    public static synchronized void a(j8 j8Var) {
        if (f6574a != null) {
            throw new IllegalStateException("init() already called");
        }
        f6574a = j8Var;
    }

    public static synchronized j8 b() {
        try {
            if (f6574a == null) {
                a(new n8());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f6574a;
    }
}
