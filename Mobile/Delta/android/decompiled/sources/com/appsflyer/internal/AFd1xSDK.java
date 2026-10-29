package com.appsflyer.internal;

import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1xSDK {
    final AFd1mSDK AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final ExecutorService f5304d;

    public AFd1xSDK(AFd1mSDK aFd1mSDK, ExecutorService executorService) {
        this.AFLogger = aFd1mSDK;
        this.f5304d = executorService;
    }
}
