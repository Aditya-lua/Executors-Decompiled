package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.sdk_base.logger.LoggerDelegate;
import com.appsflyer.share.AppsFlyerConversionListener;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public interface AFc1bSDK {
    @NonNull
    AFc1kSDK AFKeystoreWrapper();

    @NonNull
    AFc1iSDK AFLogger();

    @NonNull
    AFd1uSDK AFLoggerLogLevel();

    @NonNull
    AFf1fSDK AppsFlyerLib();

    @NonNull
    AFi1aSDK afDebugLog();

    @NonNull
    LoggerDelegate afErrorLog();

    @NonNull
    AFj1ySDK afInfoLog();

    @NonNull
    AFe1wSDK afWarnLog();

    @NonNull
    /* JADX INFO: renamed from: d */
    ExecutorService mo8751d();

    @NonNull
    /* JADX INFO: renamed from: e */
    AFh1xSDK mo8752e();

    @NonNull
    AFa1qSDK enableTCFDataCollection();

    @NonNull
    AFg1rSDK force();

    ExceptionManager getEntries();

    @NonNull
    AFi1vSDK getInstance();

    @NonNull
    AFd1jSDK getLevel();

    @NonNull
    AFa1aSDK getSdkVersion();

    @NonNull
    /* JADX INFO: renamed from: i */
    AFf1hSDK mo8753i();

    @NonNull
    AFj1cSDK onPause();

    @NonNull
    AppsFlyerProperties registerClient();

    void registerClient(AppsFlyerConversionListener appsFlyerConversionListener);

    @NonNull
    AFc1eSDK setAndroidIdData();

    @NonNull
    AFj1wSDK setAppInviteOneLink();

    @NonNull
    AFe1vSDK setCustomerUserId();

    @NonNull
    AFh1wSDK setDebugLog();

    AFi1oSDK setImeiData();

    @NonNull
    AFf1eSDK setOaidData();

    @NonNull
    AFb1aSDK setUserEmail();

    AppsFlyerConversionListener setUserFirstName();

    AFh1sSDK setUserLastName();

    @NonNull
    AFa1lSDK setUserPhone();

    @NonNull
    AFi1tSDK stop();

    @NonNull
    AFd1sSDK unregisterClient();

    @NonNull
    AFb1bSDK updateServerUninstallToken();

    @NonNull
    /* JADX INFO: renamed from: v */
    PurchaseHandler mo8754v();

    @NonNull
    AFd1zSDK valueOf();

    @NonNull
    AFc1vSDK values();

    @NonNull
    /* JADX INFO: renamed from: w */
    AFf1aSDK mo8755w();
}
