package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.share.AFAdRevenueData;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1lSDK extends AFh1pSDK {
    public final Map<String, Object> AFLoggerLogLevel;

    @NonNull
    public final AFAdRevenueData afDebugLog;

    public AFh1lSDK(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        super("adrevenue_generic", null, Boolean.TRUE);
        this.afDebugLog = aFAdRevenueData;
        this.AFLoggerLogLevel = map;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final AFe1zSDK AFKeystoreWrapper() {
        return AFd1bSDK.ADREVENUE;
    }
}
