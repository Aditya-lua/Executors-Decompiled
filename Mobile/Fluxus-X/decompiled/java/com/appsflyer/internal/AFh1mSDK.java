package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1mSDK extends AFh1pSDK {
    private final boolean AFLoggerLogLevel;
    private final boolean afDebugLog;

    public AFh1mSDK() {
        this(null, null, null);
    }

    public AFh1mSDK(String str, Boolean bool, Boolean bool2) {
        super(null, null, Boolean.FALSE);
        this.afDebugLog = bool != null ? bool.booleanValue() : true;
        this.AFLoggerLogLevel = true;
    }
}
