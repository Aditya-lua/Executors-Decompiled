package com.google.android.gms.internal.play_billing;

/* JADX INFO: loaded from: classes.dex */
public final class s6 extends RuntimeException {
    public s6(x5 x5Var) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final f5 a() {
        return new f5(getMessage());
    }
}
