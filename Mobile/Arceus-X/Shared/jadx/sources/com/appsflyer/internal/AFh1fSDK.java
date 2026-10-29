package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1fSDK extends AFh1pSDK {
    @Override // com.appsflyer.internal.AFh1pSDK
    public final AFe1zSDK AFKeystoreWrapper() {
        return this.afWarnLog == 1 ? AFd1bSDK.CONVERSION : AFd1bSDK.LAUNCH;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean AFLogger() {
        return this.afErrorLog;
    }

    @Override // com.appsflyer.internal.AFh1pSDK
    public final boolean registerClient() {
        return true;
    }
}
