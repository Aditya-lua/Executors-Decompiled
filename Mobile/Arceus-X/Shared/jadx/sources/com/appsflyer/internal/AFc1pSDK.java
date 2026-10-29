package com.appsflyer.internal;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1pSDK {
    final int AFKeystoreWrapper;

    /* JADX INFO: renamed from: d */
    @NotNull
    final String f6889d;

    @NotNull
    final List<AFe1zSDK> unregisterClient;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: java.util.List<? extends com.appsflyer.internal.AFe1zSDK> */
    /* JADX WARN: Multi-variable type inference failed */
    public AFc1pSDK(@NotNull String str, @NotNull List<? extends AFe1zSDK> list, int i10) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(list, "");
        this.f6889d = str;
        this.unregisterClient = list;
        this.AFKeystoreWrapper = i10;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1pSDK)) {
            return false;
        }
        AFc1pSDK aFc1pSDK = (AFc1pSDK) obj;
        return Intrinsics.m31980c(this.f6889d, aFc1pSDK.f6889d) && Intrinsics.m31980c(this.unregisterClient, aFc1pSDK.unregisterClient) && this.AFKeystoreWrapper == aFc1pSDK.AFKeystoreWrapper;
    }

    public final int hashCode() {
        return (((this.f6889d.hashCode() * 31) + this.unregisterClient.hashCode()) * 31) + Integer.hashCode(this.AFKeystoreWrapper);
    }

    @NotNull
    public final String toString() {
        return "StorageConfigTypeEntry(cacheDirName=" + this.f6889d + ", eventTypes=" + this.unregisterClient + ", maxCapacity=" + this.AFKeystoreWrapper + ")";
    }
}
