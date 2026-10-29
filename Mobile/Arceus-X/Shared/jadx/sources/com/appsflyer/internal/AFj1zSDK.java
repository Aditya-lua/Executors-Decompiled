package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1zSDK implements AFj1uSDK {
    public volatile boolean AFLogger;

    /* JADX INFO: renamed from: d */
    @NotNull
    private final String f7081d = "DeeplinkProcessedCondition";

    @Override // com.appsflyer.internal.AFj1uSDK
    @NotNull
    /* JADX INFO: renamed from: d */
    public final String mo8946d() {
        return this.f7081d;
    }

    @Override // com.appsflyer.internal.AFj1uSDK
    public final void registerClient() {
        this.AFLogger = false;
    }

    @Override // com.appsflyer.internal.AFj1uSDK
    public final boolean unregisterClient() {
        return this.AFLogger;
    }
}
