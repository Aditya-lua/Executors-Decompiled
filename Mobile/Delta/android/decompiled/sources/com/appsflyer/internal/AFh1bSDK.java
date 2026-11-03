package com.appsflyer.internal;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1bSDK {

    @NonNull
    public final String AFKeystoreWrapper;
    public final long AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f5462d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Throwable f5463e;
    public final AFh1dSDK force;
    public final int registerClient;
    public final long unregisterClient;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final String f5464w;

    public AFh1bSDK(String str, @NonNull String str2, long j10, long j11, int i10, AFh1dSDK aFh1dSDK, String str3, Throwable th2) {
        this.f5462d = str;
        this.AFKeystoreWrapper = str2;
        this.AFLogger = j10;
        this.unregisterClient = j11;
        this.registerClient = i10;
        this.force = aFh1dSDK;
        this.f5464w = str3;
        this.f5463e = th2;
    }
}
