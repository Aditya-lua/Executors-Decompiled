package com.google.android.gms.internal.play_billing;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.s6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2643s6 extends RuntimeException {
    public C2643s6(InterfaceC2697x5 interfaceC2697x5) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    /* JADX INFO: renamed from: a */
    public final C2499f5 m11723a() {
        return new C2499f5(getMessage());
    }
}
