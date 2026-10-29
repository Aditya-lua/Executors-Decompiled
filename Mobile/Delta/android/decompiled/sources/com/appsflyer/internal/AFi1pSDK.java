package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1pSDK {
    public final long AFKeystoreWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f5423d;
    public final long registerClient;

    @Nullable
    public final String unregisterClient;

    public AFi1pSDK(long j10, long j11, @Nullable String str, @Nullable String str2) {
        this.registerClient = j10;
        this.AFKeystoreWrapper = j11;
        this.unregisterClient = str;
        this.f5423d = str2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1pSDK)) {
            return false;
        }
        AFi1pSDK aFi1pSDK = (AFi1pSDK) obj;
        return this.registerClient == aFi1pSDK.registerClient && this.AFKeystoreWrapper == aFi1pSDK.AFKeystoreWrapper && Intrinsics.c(this.unregisterClient, aFi1pSDK.unregisterClient) && Intrinsics.c(this.f5423d, aFi1pSDK.f5423d);
    }

    public final int hashCode() {
        int iHashCode = ((Long.hashCode(this.registerClient) * 31) + Long.hashCode(this.AFKeystoreWrapper)) * 31;
        String str = this.unregisterClient;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f5423d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "PlayIntegrityApiData(piaTimestamp=" + this.registerClient + ", ttrMillis=" + this.AFKeystoreWrapper + ", piaToken=" + this.unregisterClient + ", errorCode=" + this.f5423d + ")";
    }
}
