package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes.dex */
public final class m8 extends Exception {
    public m8(String str) {
        super(str);
    }

    public m8(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
