package com.appsflyer.internal;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1nSDK extends AFh1pSDK {
    public final AFe1zSDK AFLoggerLogLevel;

    public AFh1nSDK(String str, byte[] bArr, String str2, AFe1zSDK aFe1zSDK, Map<String, String> map) {
        super(null, str, Boolean.FALSE);
        this.f7031w = str2;
        this.force = bArr;
        this.AFLoggerLogLevel = aFe1zSDK;
        if (map != null) {
            this.registerClient.putAll(map);
        }
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final AFe1zSDK AFKeystoreWrapper() {
        AFe1zSDK aFe1zSDK = this.AFLoggerLogLevel;
        return aFe1zSDK != null ? aFe1zSDK : AFd1bSDK.CACHED_EVENT;
    }
}
