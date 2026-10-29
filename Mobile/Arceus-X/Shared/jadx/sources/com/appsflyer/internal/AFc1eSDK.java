package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.share.AppsFlyerConsent;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class AFc1eSDK {

    @Nullable
    public String AFKeystoreWrapper;

    @Nullable
    public String AFLogger;

    @Nullable
    public String AFLoggerLogLevel;

    @Nullable
    public String AppsFlyerLib;

    @Nullable
    public Boolean afDebugLog;
    public boolean afErrorLog;
    public boolean afInfoLog;
    public boolean afWarnLog;

    @Nullable
    public String clearUserPii;

    /* JADX INFO: renamed from: d */
    @Nullable
    public String f6875d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f6876e;

    @Nullable
    public String force;
    public boolean getEntries;

    @Nullable
    public String getLevel;

    @Nullable
    public String getOutOfStore;

    @Nullable
    public String getSdkVersion;

    /* JADX INFO: renamed from: i */
    @Nullable
    public Long f6877i;

    @Nullable
    public String registerClient;
    public boolean setAndroidIdData;
    public boolean setCustomerUserId;

    @Nullable
    public AppsFlyerConsent setImeiData;

    @Nullable
    public AFd1nSDK setOaidData;

    @Nullable
    public AFc1rSDK setUserEmail;
    public boolean setUserFirstName;

    @Nullable
    public String setUserLastName;
    public boolean setUserPhone;

    @Nullable
    public String stop;

    @Nullable
    public String unregisterClient;

    @Nullable
    public AdvertisingIdData updateServerUninstallToken;

    /* JADX INFO: renamed from: v */
    @Nullable
    public AFb1qSDK f6878v;

    @Nullable
    public String valueOf;

    @Nullable
    public String values;

    /* JADX INFO: renamed from: w */
    @Nullable
    public AFb1rSDK f6879w;

    @NotNull
    public AFLogger.LogLevel enableTCFDataCollection = AFLogger.LogLevel.NONE;
    public long getInstance = -1;
    public long onPause = -1;
    public long setDebugLog = TimeUnit.SECONDS.toMillis(5);

    public final synchronized void registerClient(@Nullable AFd1nSDK aFd1nSDK) {
        this.setOaidData = aFd1nSDK;
    }
}
