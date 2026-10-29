package com.appsflyer.internal;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1rSDK {
    public final int AFKeystoreWrapper;

    @NotNull
    public final String unregisterClient;

    public AFc1rSDK(int i10, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.AFKeystoreWrapper = i10;
        this.unregisterClient = str;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AFc1rSDK)) {
            return false;
        }
        AFc1rSDK aFc1rSDK = (AFc1rSDK) obj;
        return this.AFKeystoreWrapper == aFc1rSDK.AFKeystoreWrapper && Intrinsics.c(this.unregisterClient, aFc1rSDK.unregisterClient);
    }

    public final int hashCode() {
        return (Integer.hashCode(this.AFKeystoreWrapper) * 31) + this.unregisterClient.hashCode();
    }

    @NotNull
    public final String toString() {
        return "AppSetIdModel(scope=" + this.AFKeystoreWrapper + ", id=" + this.unregisterClient + ")";
    }
}
