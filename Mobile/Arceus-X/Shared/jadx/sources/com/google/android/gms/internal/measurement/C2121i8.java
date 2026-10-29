package com.google.android.gms.internal.measurement;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.i8 */
/* JADX INFO: loaded from: classes.dex */
public final class C2121i8 extends Exception {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2121i8(String str) {
        super(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2121i8(String str, Throwable th2) {
        super("ContentProvider query failed", th2);
    }
}
