package com.appsflyer.internal;

/* JADX INFO: loaded from: classes.dex */
public abstract class AFh1mSDK extends AFh1pSDK {
    private final boolean AFLoggerLogLevel;
    private final boolean afDebugLog;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AFh1mSDK() {
        this(null, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public AFh1mSDK(String str, Boolean bool, Boolean bool2) {
        super(null, null, Boolean.FALSE);
        this.afDebugLog = bool != null ? bool.booleanValue() : true;
        this.AFLoggerLogLevel = true;
    }
}
