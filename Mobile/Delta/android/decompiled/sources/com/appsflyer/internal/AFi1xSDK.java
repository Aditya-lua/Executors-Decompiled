package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1xSDK {

    @Nullable
    public final String AFKeystoreWrapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f5430d;

    @Nullable
    public final String registerClient;

    @NotNull
    public final String unregisterClient;

    public AFi1xSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unregisterClient = str;
        this.AFKeystoreWrapper = str2;
        this.registerClient = str3;
        this.f5430d = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1xSDK)) {
            return false;
        }
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return Intrinsics.c(this.unregisterClient, aFi1xSDK.unregisterClient) && Intrinsics.c(this.AFKeystoreWrapper, aFi1xSDK.AFKeystoreWrapper) && Intrinsics.c(this.registerClient, aFi1xSDK.registerClient) && this.f5430d == aFi1xSDK.f5430d;
    }

    public final int hashCode() {
        int iHashCode = this.unregisterClient.hashCode() * 31;
        String str = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registerClient;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f5430d);
    }

    @NotNull
    public final String toString() {
        return "NetworkData(networkType=" + this.unregisterClient + ", carrierName=" + this.AFKeystoreWrapper + ", simOperator=" + this.registerClient + ", isVpnEnabled=" + this.f5430d + ")";
    }
}
