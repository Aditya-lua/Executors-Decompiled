package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1bSDK {

    @NonNull
    public final String AFKeystoreWrapper;
    public final long AFLogger;

    /* JADX INFO: renamed from: d */
    public final String f7017d;

    /* JADX INFO: renamed from: e */
    public final Throwable f7018e;
    public final AFh1dSDK force;
    public final int registerClient;
    public final long unregisterClient;

    /* JADX INFO: renamed from: w */
    public final String f7019w;

    public AFh1bSDK(String str, @NonNull String str2, long j10, long j11, int i10, AFh1dSDK aFh1dSDK, String str3, Throwable th2) {
        this.f7017d = str;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = j10;
        this.unregisterClient = j11;
        this.registerClient = i10;
        this.force = aFh1dSDK;
        this.f7019w = str3;
        this.f7018e = th2;
    }
}
