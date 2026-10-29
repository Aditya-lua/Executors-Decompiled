package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFj1zSDK implements AFj1uSDK {
    public volatile boolean AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f5453d = "DeeplinkProcessedCondition";

    @Override // com.appsflyer.internal.AFj1uSDK
    @NotNull
    public final String d() {
        return this.f5453d;
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
