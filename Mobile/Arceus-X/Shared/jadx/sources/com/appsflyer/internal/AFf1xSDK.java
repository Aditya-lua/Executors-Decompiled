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

    /* JADX INFO: renamed from: d */
    @Nullable
    final AFd1fSDK<?> f6991d;

    /* JADX INFO: renamed from: e */
    @Nullable
    final String f6992e;
    final long registerClient;

    @Nullable
    final AFh1aSDK unregisterClient;

    /* JADX INFO: renamed from: v */
    @Nullable
    final Throwable f6993v;

    public AFf1xSDK(@NotNull String str, long j10, @Nullable AFd1fSDK<?> aFd1fSDK, @Nullable AFh1aSDK aFh1aSDK, @Nullable AFh1dSDK aFh1dSDK, @Nullable String str2, @Nullable Throwable th2) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFLogger = str;
        this.registerClient = j10;
        this.f6991d = aFd1fSDK;
        this.unregisterClient = aFh1aSDK;
        this.AFKeystoreWrapper = aFh1dSDK;
        this.f6992e = str2;
        this.f6993v = th2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFf1xSDK)) {
            return false;
        }
        AFf1xSDK aFf1xSDK = (AFf1xSDK) obj;
        return Intrinsics.m31980c(this.AFLogger, aFf1xSDK.AFLogger) && this.registerClient == aFf1xSDK.registerClient && Intrinsics.m31980c(this.f6991d, aFf1xSDK.f6991d) && Intrinsics.m31980c(this.unregisterClient, aFf1xSDK.unregisterClient) && this.AFKeystoreWrapper == aFf1xSDK.AFKeystoreWrapper && Intrinsics.m31980c(this.f6992e, aFf1xSDK.f6992e) && Intrinsics.m31980c(this.f6993v, aFf1xSDK.f6993v);
    }

    public final int hashCode() {
        int iHashCode = ((this.AFLogger.hashCode() * 31) + Long.hashCode(this.registerClient)) * 31;
        AFd1fSDK<?> aFd1fSDK = this.f6991d;
        int iHashCode2 = (iHashCode + (aFd1fSDK == null ? 0 : aFd1fSDK.hashCode())) * 31;
        AFh1aSDK aFh1aSDK = this.unregisterClient;
        int iHashCode3 = (iHashCode2 + (aFh1aSDK == null ? 0 : aFh1aSDK.hashCode())) * 31;
        AFh1dSDK aFh1dSDK = this.AFKeystoreWrapper;
        int iHashCode4 = (iHashCode3 + (aFh1dSDK == null ? 0 : aFh1dSDK.hashCode())) * 31;
        String str = this.f6992e;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th2 = this.f6993v;
        return iHashCode5 + (th2 != null ? th2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "SaveMetadataParams(cdnToken=" + this.AFLogger + ", updateStartTime=" + this.registerClient + ", response=" + this.f6991d + ", config=" + this.unregisterClient + ", signatureStatus=" + this.AFKeystoreWrapper + ", cdnCacheStatus=" + this.f6992e + ", error=" + this.f6993v + ")";
    }
}
