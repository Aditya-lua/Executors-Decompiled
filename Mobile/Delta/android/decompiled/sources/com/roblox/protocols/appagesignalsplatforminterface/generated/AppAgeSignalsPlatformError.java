package com.roblox.protocols.appagesignalsplatforminterface.generated;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class AppAgeSignalsPlatformError {
    final AppAgeSignalsProvider provider;
    final int sdkErrorCode;
    final String sdkErrorMessage;

    public AppAgeSignalsPlatformError(AppAgeSignalsProvider appAgeSignalsProvider, int i10, String str) {
        this.provider = appAgeSignalsProvider;
        this.sdkErrorCode = i10;
        this.sdkErrorMessage = str;
    }

    public AppAgeSignalsProvider getProvider() {
        return this.provider;
    }

    public int getSdkErrorCode() {
        return this.sdkErrorCode;
    }

    public String getSdkErrorMessage() {
        return this.sdkErrorMessage;
    }

    public String toString() {
        return "AppAgeSignalsPlatformError{provider=" + this.provider + ",sdkErrorCode=" + this.sdkErrorCode + ",sdkErrorMessage=" + this.sdkErrorMessage + "}";
    }
}
