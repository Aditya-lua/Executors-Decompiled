package com.roblox.protocols.appagesignalsplatforminterface.generated;

import androidx.annotation.Keep;
import java.util.HashMap;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public final class AppAgeSignalsPlatformSuccess {
    final HashMap<String, String> payload;
    final AppAgeSignalsProvider provider;

    public AppAgeSignalsPlatformSuccess(AppAgeSignalsProvider appAgeSignalsProvider, HashMap<String, String> map) {
        this.provider = appAgeSignalsProvider;
        this.payload = map;
    }

    public HashMap<String, String> getPayload() {
        return this.payload;
    }

    public AppAgeSignalsProvider getProvider() {
        return this.provider;
    }

    public String toString() {
        return "AppAgeSignalsPlatformSuccess{provider=" + this.provider + ",payload=" + this.payload + "}";
    }
}
