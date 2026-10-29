package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFi1xSDK {

    @Nullable
    public final String AFKeystoreWrapper;

    /* JADX INFO: renamed from: d */
    public final boolean f7058d;

    @Nullable
    public final String registerClient;

    @NotNull
    public final String unregisterClient;

    public AFi1xSDK(@NotNull String str, @Nullable String str2, @Nullable String str3, boolean z10) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unregisterClient = str;
        this.AFKeystoreWrapper = str2;
        this.registerClient = str3;
        this.f7058d = z10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFi1xSDK)) {
            return false;
        }
        AFi1xSDK aFi1xSDK = (AFi1xSDK) obj;
        return Intrinsics.m31980c(this.unregisterClient, aFi1xSDK.unregisterClient) && Intrinsics.m31980c(this.AFKeystoreWrapper, aFi1xSDK.AFKeystoreWrapper) && Intrinsics.m31980c(this.registerClient, aFi1xSDK.registerClient) && this.f7058d == aFi1xSDK.f7058d;
    }

    public final int hashCode() {
        int iHashCode = this.unregisterClient.hashCode() * 31;
        String str = this.AFKeystoreWrapper;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.registerClient;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.f7058d);
    }

    @NotNull
    public final String toString() {
        return "NetworkData(networkType=" + this.unregisterClient + ", carrierName=" + this.AFKeystoreWrapper + ", simOperator=" + this.registerClient + ", isVpnEnabled=" + this.f7058d + ")";
    }
}
