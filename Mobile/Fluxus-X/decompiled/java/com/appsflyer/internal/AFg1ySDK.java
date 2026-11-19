package com.appsflyer.internal;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p001kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1ySDK {

    @NotNull
    final String AFKeystoreWrapper;
    final int AFLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final int f5903d;
    final int registerClient;
    final int unregisterClient;

    public AFg1ySDK(int i10, int i11, int i12, int i13, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.unregisterClient = i10;
        this.f5903d = i11;
        this.registerClient = i12;
        this.AFLogger = i13;
        this.AFKeystoreWrapper = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFg1ySDK)) {
            return false;
        }
        AFg1ySDK aFg1ySDK = (AFg1ySDK) obj;
        return this.unregisterClient == aFg1ySDK.unregisterClient && this.f5903d == aFg1ySDK.f5903d && this.registerClient == aFg1ySDK.registerClient && this.AFLogger == aFg1ySDK.AFLogger && Intrinsics.c(this.AFKeystoreWrapper, aFg1ySDK.AFKeystoreWrapper);
    }

    public final int hashCode() {
        return (((((((Integer.hashCode(this.unregisterClient) * 31) + Integer.hashCode(this.f5903d)) * 31) + Integer.hashCode(this.registerClient)) * 31) + Integer.hashCode(this.AFLogger)) * 31) + this.AFKeystoreWrapper.hashCode();
    }

    @NotNull
    public final String toString() {
        return "CmpTcfData(policyVersion=" + this.unregisterClient + ", gdprApplies=" + this.f5903d + ", cmpSdkId=" + this.registerClient + ", cmpSdkVersion=" + this.AFLogger + ", tcString=" + this.AFKeystoreWrapper + ")";
    }
}
