package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class i8 extends Exception {
    public i8(String str) {
        super(str);
    }

    public i8(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
