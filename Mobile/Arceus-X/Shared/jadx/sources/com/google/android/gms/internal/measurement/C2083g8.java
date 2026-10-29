package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.g8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2083g8 {

    /* JADX INFO: renamed from: a */
    public static InterfaceC2064f8 f8201a;

    /* JADX INFO: renamed from: a */
    public static synchronized void m10045a(InterfaceC2064f8 interfaceC2064f8) {
        if (f8201a != null) {
            throw new IllegalStateException("init() already called");
        }
        f8201a = interfaceC2064f8;
    }

    /* JADX INFO: renamed from: b */
    public static synchronized InterfaceC2064f8 m10046b() {
        try {
            if (f8201a == null) {
                m10045a(new C2138j8());
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f8201a;
    }
}
