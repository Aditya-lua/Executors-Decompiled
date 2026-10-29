package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
final class AFf1xSDK {

    @Nullable
    final AFh1dSDK AFKeystoreWrapper;

    @NotNull
    final String AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    final AFd1fSDK<?> f5363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    final String f5364e;
    final long registerClient;

    @Nullable
    final AFh1aSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    final Throwable f5365v;

    public AFf1xSDK(@NotNull String str, long j10, @Nullable AFd1fSDK<?> aFd1fSDK, @Nullable AFh1aSDK aFh1aSDK, @Nullable AFh1dSDK aFh1dSDK, @Nullable String str2, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFLogger = str;
        this.registerClient = j10;
        this.f5363d = aFd1fSDK;
        this.unregisterClient = aFh1aSDK;
        this.AFKeystoreWrapper = aFh1dSDK;
        this.f5364e = str2;
        this.f5365v = th2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1xSDK)) {
            return false;
        }
        AFf1xSDK aFf1xSDK = (AFf1xSDK) obj;
        return Intrinsics.c(this.AFLogger, aFf1xSDK.AFLogger) && this.registerClient == aFf1xSDK.registerClient && Intrinsics.c(this.f5363d, aFf1xSDK.f5363d) && Intrinsics.c(this.unregisterClient, aFf1xSDK.unregisterClient) && this.AFKeystoreWrapper == aFf1xSDK.AFKeystoreWrapper && Intrinsics.c(this.f5364e, aFf1xSDK.f5364e) && Intrinsics.c(this.f5365v, aFf1xSDK.f5365v);
    }

    public final int hashCode() {
        int iHashCode = ((this.AFLogger.hashCode() * 31) + Long.hashCode(this.registerClient)) * 31;
        AFd1fSDK<?> aFd1fSDK = this.f5363d;
        int iHashCode2 = (iHashCode + (aFd1fSDK == null ? 0 : aFd1fSDK.hashCode())) * 31;
        AFh1aSDK aFh1aSDK = this.unregisterClient;
        int iHashCode3 = (iHashCode2 + (aFh1aSDK == null ? 0 : aFh1aSDK.hashCode())) * 31;
        AFh1dSDK aFh1dSDK = this.AFKeystoreWrapper;
        int iHashCode4 = (iHashCode3 + (aFh1dSDK == null ? 0 : aFh1dSDK.hashCode())) * 31;
        String str = this.f5364e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.f5365v;
        return iHashCode5 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SaveMetadataParams(cdnToken=" + this.AFLogger + ", updateStartTime=" + this.registerClient + ", response=" + this.f5363d + ", config=" + this.unregisterClient + ", signatureStatus=" + this.AFKeystoreWrapper + ", cdnCacheStatus=" + this.f5364e + ", error=" + this.f5365v + ")";
    }
}
