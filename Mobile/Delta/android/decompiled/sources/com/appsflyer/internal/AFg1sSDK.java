package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1sSDK {

    @NotNull
    public final String AFKeystoreWrapper;
    public final boolean AFLogger;
    public final long unregisterClient;

    public AFg1sSDK(@NotNull String str, long j10, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = str;
        this.unregisterClient = j10;
        this.AFLogger = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1sSDK)) {
            return false;
        }
        AFg1sSDK aFg1sSDK = (AFg1sSDK) obj;
        return Intrinsics.c(this.AFKeystoreWrapper, aFg1sSDK.AFKeystoreWrapper) && this.unregisterClient == aFg1sSDK.unregisterClient && this.AFLogger == aFg1sSDK.AFLogger;
    }

    public final int hashCode() {
        return (((this.AFKeystoreWrapper.hashCode() * 31) + Long.hashCode(this.unregisterClient)) * 31) + Boolean.hashCode(this.AFLogger);
    }

    @NotNull
    public final String toString() {
        return "AFUninstallToken(token=" + this.AFKeystoreWrapper + ", receivedTime=" + this.unregisterClient + ", isQueued=" + this.AFLogger + ")";
    }
}
