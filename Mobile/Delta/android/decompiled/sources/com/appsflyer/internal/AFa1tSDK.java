package com.appsflyer.internal;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.annotation.NonNull;
import backtraceio.library.services.BacktraceMetrics;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerLib;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.PurchaseHandler;
import com.appsflyer.exception_manager.ExceptionManager;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.BaseReferrerInitProvider;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.sdk_base.referrer.ReferrerCreator;
import com.appsflyer.sdk_base.referrer.ReferrerKt;
import com.appsflyer.sdk_base.referrer.ReferrerProp;
import com.appsflyer.share.AFAdRevenueData;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AFInAppEventType;
import com.appsflyer.share.AFPurchaseDetails;
import com.appsflyer.share.AFPushData;
import com.appsflyer.share.AppsFlyerConsent;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.AppsFlyerInAppPurchaseValidationCallback;
import com.appsflyer.share.SessionReadyListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.deeplink.DeepLinkListener;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.appsflyer.share.platform_extension.PluginInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1tSDK extends AppsFlyerLib {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static AFa1tSDK f5227d = new AFa1tSDK();
    public static final String registerClient = "7.0";
    public static final String unregisterClient = "386";

    @NonNull
    public final AFc1aSDK AFKeystoreWrapper;
    private AFb1hSDK AFLogger;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AFf1mSDK f5228e;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private Map<Long, String> f5229w;

    public AFa1tSDK() {
        AFc1aSDK aFc1aSDK = new AFc1aSDK();
        this.AFKeystoreWrapper = aFc1aSDK;
        aFc1aSDK.setDebugLog().AFLogger();
        aFc1aSDK.setDebugLog().AFKeystoreWrapper();
    }

    private synchronized AFf1mSDK AFKeystoreWrapper() {
        try {
            if (this.f5228e == null) {
                this.f5228e = new AFf1mSDK() { // from class: com.appsflyer.internal.m
                    @Override // com.appsflyer.internal.AFf1mSDK
                    public final void onRemoteConfigUpdateFinished(AFf1pSDK aFf1pSDK) {
                        this.f5505a.AFLogger(aFf1pSDK);
                    }
                };
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f5228e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: AFLogger, reason: merged with bridge method [inline-methods] */
    public void d(AFi1oSDK aFi1oSDK) {
        AFc1iSDK aFc1iSDKAFLogger = this.AFKeystoreWrapper.AFLogger();
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        this.AFKeystoreWrapper.afWarnLog().d(new AFe1dSDK(aFi1oSDK, aFc1iSDKAFLogger, aFc1aSDK, aFc1aSDK.force(), this.AFKeystoreWrapper.valueOf()));
    }

    public static AFa1tSDK d() {
        return f5227d;
    }

    private static String registerClient(Activity activity) {
        Intent intent;
        String string = null;
        if (activity != null && (intent = activity.getIntent()) != null) {
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    string = extras.getString("af");
                    if (string == null) {
                        return string;
                    }
                    AFLogger.INSTANCE.w(LogTag.ENGAGEMENT, "Push Notification received af payload = ".concat(string));
                    extras.remove("af");
                    activity.setIntent(intent.putExtras(extras));
                    return string;
                }
            } catch (Throwable th2) {
                AFLogger.INSTANCE.e(LogTag.ENGAGEMENT, th2.getMessage(), th2);
            }
        }
        return string;
    }

    private void unregisterClient(AppsFlyerRequestListener appsFlyerRequestListener) {
        if (!this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            d("start");
            return;
        }
        if (!this.AFKeystoreWrapper.setAppInviteOneLink().AFLogger()) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "WARNING: SessionReadyListener is not registered! You must call 'registerSessionReadyListener(SessionReadyListener)' before calling 'start()'. The listener ensures that all required data (e.g., deeplink parameters) is available before session initialization.");
            return;
        }
        if (this.AFKeystoreWrapper.setAndroidIdData().setUserPhone) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "AppsFlyer SDK session already started. Skipping duplicate start call.");
            return;
        }
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("start", new String[0]);
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SDK_LIFECYCLE;
        Locale locale = Locale.US;
        String str = unregisterClient;
        aFLogger.i(logTag, String.format(locale, "Starting AppsFlyer: (v%s.%s)", "7.0.1", str));
        StringBuilder sb2 = new StringBuilder("Build Number: ");
        sb2.append(str);
        aFLogger.i(logTag, sb2.toString());
        this.AFKeystoreWrapper.getSdkVersion().unregisterClient();
        AFh1sSDK userLastName = this.AFKeystoreWrapper.setUserLastName();
        if (userLastName != null) {
            userLastName.d();
        }
        this.AFKeystoreWrapper.setAndroidIdData().setUserPhone = true;
        AFKeystoreWrapper(appsFlyerRequestListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void v() {
        if (this.AFKeystoreWrapper.setUserEmail().AFLogger()) {
            this.AFKeystoreWrapper.setUserEmail().unregisterClient();
        }
        AFi1vSDK aFc1bSDK = this.AFKeystoreWrapper.getInstance();
        aFc1bSDK.f5429d = Build.VERSION.SDK_INT >= 31 ? new AFi1sSDK(aFc1bSDK.AFLogger) : new AFi1wSDK(aFc1bSDK.AFLogger);
        this.AFKeystoreWrapper.AppsFlyerLib().d(this.AFKeystoreWrapper.AFLogger());
        AFh1xSDK aFh1xSDKE = this.AFKeystoreWrapper.e();
        aFh1xSDKE.f5411i = System.currentTimeMillis();
        int iAFLogger = aFh1xSDKE.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0);
        if (iAFLogger == 1 && aFh1xSDKE.AFKeystoreWrapper.registerClient("first_launch")) {
            aFh1xSDKE.f5409d.putAll(aFh1xSDKE.AFLogger("first_launch"));
        }
        if (iAFLogger > 0 && aFh1xSDKE.AFKeystoreWrapper.registerClient("gcd")) {
            aFh1xSDKE.AFLogger.putAll(aFh1xSDKE.AFLogger("gcd"));
        }
        aFh1xSDKE.afInfoLog = aFh1xSDKE.AFKeystoreWrapper.unregisterClient("prev_session_dur", 0L);
        this.AFKeystoreWrapper.i().AFKeystoreWrapper(AFKeystoreWrapper());
        this.AFKeystoreWrapper.values().d();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void addPushNotificationDeepLinkPath(String... strArr) {
        List<String> listAsList = Arrays.asList(strArr);
        List<List<String>> list = this.AFKeystoreWrapper.enableTCFDataCollection().registerClient;
        if (list.contains(listAsList)) {
            return;
        }
        list.add(listAsList);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void anonymizeUser(boolean z10) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("anonymizeUser", String.valueOf(z10));
        this.AFKeystoreWrapper.setAndroidIdData().afInfoLog = z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void appendParametersToDeepLinkingURL(String str, Map<String, String> map) {
        AFa1qSDK aFa1qSDKEnableTCFDataCollection = this.AFKeystoreWrapper.enableTCFDataCollection();
        aFa1qSDKEnableTCFDataCollection.AFLogger = str;
        aFa1qSDKEnableTCFDataCollection.f5224d = map;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void clearUserPii() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("clearUserPii", new String[0]);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "clearUserPii");
        AFc1eSDK androidIdData = this.AFKeystoreWrapper.setAndroidIdData();
        androidIdData.AFLogger = null;
        androidIdData.f5247d = null;
        androidIdData.registerClient = null;
        androidIdData.AFKeystoreWrapper = null;
        androidIdData.f5248e = null;
        androidIdData.f5249i = null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void collectDataFromLauncherActivity(Activity activity) {
        AFi1tSDK aFi1tSDKStop = this.AFKeystoreWrapper.stop();
        this.AFKeystoreWrapper.setAndroidIdData().setUserLastName = aFi1tSDKStop.registerClient(activity);
        this.AFKeystoreWrapper.setAndroidIdData().clearUserPii = aFi1tSDKStop.AFLogger(activity);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void disableAppSetId() {
        this.AFKeystoreWrapper.setAndroidIdData().setCustomerUserId = true;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableFacebookDeferredApplinks(boolean z10) {
        this.AFKeystoreWrapper.getSdkVersion().AFLogger(z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void enableTCFDataCollection(boolean z10) {
        this.AFKeystoreWrapper.setAndroidIdData().afDebugLog = Boolean.valueOf(z10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAppsFlyerUID(@NonNull Context context) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("getAppsFlyerUID", new String[0]);
        if (context == null) {
            return null;
        }
        this.AFKeystoreWrapper.f5240d.f5305d = context.getApplicationContext();
        return AFb1jSDK.AFLogger(this.AFKeystoreWrapper.AFLogger().AFKeystoreWrapper);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getAttributionId(Context context) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        return this.AFKeystoreWrapper.AFLogger().registerClient(context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostName() {
        return this.AFKeystoreWrapper.getLevel().d();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getHostPrefix() {
        return this.AFKeystoreWrapper.getLevel().registerClient();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getOutOfStore(Context context) {
        String strAFLogger;
        String str = this.AFKeystoreWrapper.setAndroidIdData().getLevel;
        if (str != null) {
            return str;
        }
        if (context == null) {
            strAFLogger = null;
        } else {
            this.AFKeystoreWrapper.f5240d.f5305d = context.getApplicationContext();
            strAFLogger = this.AFKeystoreWrapper.AFLogger().AFLogger("AF_STORE");
        }
        if (strAFLogger != null) {
            return strAFLogger;
        }
        AFLogger.INSTANCE.i(LogTag.GENERAL, "Out-of-store value not configured via API or manifest");
        return null;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final String getSdkVersion() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("getSdkVersion", new String[0]);
        return AFc1iSDK.d();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final AppsFlyerLib init(@NonNull String str, AppsFlyerConversionListener appsFlyerConversionListener, @NonNull Context context) {
        if (!this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            if (TextUtils.isEmpty(str)) {
                AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the 'init' API method (should be called on Application's onCreate)");
                return this;
            }
            if (context == null) {
                AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK requires a valid Context! Ensure 'init' is called with a non-null Context, typically from Application's onCreate.");
                return this;
            }
            this.AFKeystoreWrapper.AppsFlyerLib().d(str);
            this.AFKeystoreWrapper.f5240d.f5305d = context.getApplicationContext();
            this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName = true;
            Application applicationX_ = AFj1qSDK.X_(context);
            if (applicationX_ != null) {
                AFa1zSDK.INSTANCE.AFLogger(context);
                this.AFKeystoreWrapper.d().execute(new Runnable() { // from class: com.appsflyer.internal.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5486a.v();
                    }
                });
                AFc1iSDK aFc1iSDKAFLogger = this.AFKeystoreWrapper.AFLogger();
                AFf1fSDK aFf1fSDKAppsFlyerLib = this.AFKeystoreWrapper.AppsFlyerLib();
                Intrinsics.checkNotNullParameter(aFc1iSDKAFLogger, "");
                Intrinsics.checkNotNullParameter(aFf1fSDKAppsFlyerLib, "");
                if (aFc1iSDKAFLogger.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0 && !aFf1fSDKAppsFlyerLib.AFLogger()) {
                    this.AFKeystoreWrapper.d().execute(new Runnable() { // from class: com.appsflyer.internal.h
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f5488a.AFLogger();
                        }
                    });
                }
                AFe1wSDK aFe1wSDKAfWarnLog = this.AFKeystoreWrapper.afWarnLog();
                AFe1vSDK customerUserId = this.AFKeystoreWrapper.setCustomerUserId();
                Intrinsics.checkNotNullParameter(customerUserId, "");
                aFe1wSDKAfWarnLog.unregisterClient.add(customerUserId);
                this.AFKeystoreWrapper.afWarnLog().d(new AFe1iSDK(this.AFKeystoreWrapper));
                if (this.AFKeystoreWrapper.getEntries() != null) {
                    this.AFKeystoreWrapper.getEntries().init(new ExceptionManager.ConfigurationChangedListener() { // from class: com.appsflyer.internal.i
                    });
                }
                AFi1aSDK aFi1aSDKAfDebugLog = this.AFKeystoreWrapper.afDebugLog();
                Runnable runnable = new Runnable() { // from class: com.appsflyer.internal.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f5495a.unregisterClient();
                    }
                };
                if (aFi1aSDKAfDebugLog.AFKeystoreWrapper.AFLogger().AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) > 0) {
                    AFLogger.INSTANCE.d(LogTag.REFERRER, "Referrers collection disallowed by counter.");
                } else {
                    AFi1gSDK aFi1gSDKD = aFi1aSDKAfDebugLog.d(runnable);
                    ReferrerProp referrerProp = new ReferrerProp(aFi1aSDKAfDebugLog.unregisterClient(aFi1gSDKD, runnable), aFi1aSDKAfDebugLog.AFKeystoreWrapper.afErrorLog(), aFi1aSDKAfDebugLog.AFKeystoreWrapper.d());
                    aFi1aSDKAfDebugLog.unregisterClient.add(aFi1gSDKD);
                    aFi1aSDKAfDebugLog.unregisterClient.add(new AFi1bSDK(referrerProp));
                    aFi1aSDKAfDebugLog.unregisterClient(referrerProp);
                    aFi1aSDKAfDebugLog.unregisterClient.addAll(aFi1aSDKAfDebugLog.f5415d.AFKeystoreWrapper(referrerProp));
                    Iterator<Pair<ReferrerCreator<Referrer>, Class<? extends BaseReferrerInitProvider>>> it = Referrer.getExternalReferrers().iterator();
                    while (it.hasNext()) {
                        ReferrerKt.disableInitProvider(it.next().d(), aFi1aSDKAfDebugLog.AFKeystoreWrapper.valueOf().f5305d, aFi1aSDKAfDebugLog.AFKeystoreWrapper.afErrorLog());
                    }
                    for (Referrer referrer : (Referrer[]) aFi1aSDKAfDebugLog.unregisterClient.toArray(new Referrer[0])) {
                        referrer.start(aFi1aSDKAfDebugLog.AFKeystoreWrapper.valueOf().f5305d);
                    }
                    String strAFLogger = aFi1aSDKAfDebugLog.AFKeystoreWrapper.AFLogger().AFLogger("AF_PREINSTALL_DISABLED");
                    if (!(strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : false)) {
                        aFi1aSDKAfDebugLog.unregisterClient(aFi1aSDKAfDebugLog.AFKeystoreWrapper.valueOf().f5305d, referrerProp, aFi1aSDKAfDebugLog.AFKeystoreWrapper);
                    }
                }
                if (this.AFLogger == null) {
                    this.AFLogger = new AFb1hSDK(this.AFKeystoreWrapper, new Function0() { // from class: com.appsflyer.internal.k
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return this.f5498a.registerClient();
                        }
                    }, AFKeystoreWrapper(), this.AFKeystoreWrapper.setUserLastName());
                    this.AFKeystoreWrapper.updateServerUninstallToken().unregisterClient(context, this.AFLogger);
                }
                Context baseContext = applicationX_.getBaseContext();
                try {
                    ApplicationInfo applicationInfo = this.AFKeystoreWrapper.AFLogger().r_().applicationInfo;
                    if (applicationInfo != null && (applicationInfo.flags & 32768) != 0) {
                        if (Build.VERSION.SDK_INT >= 31) {
                            if (baseContext.getResources().getIdentifier("appsflyer_data_extraction_rules", "xml", baseContext.getPackageName()) != 0) {
                                AFLogger.INSTANCE.i(LogTag.GENERAL, "appsflyer_data_extraction_rules.xml detected, using AppsFlyer data extraction rules for AppsFlyer SDK data");
                            } else {
                                AFLogger.INSTANCE.w(LogTag.GENERAL, "'allowBackup' is set to true; appsflyer_data_extraction_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <data-extraction-rules> both in <device-transfer> and <cloud-backup>.\nIf Appsflyer's Purchase Connector is in use then you also must add to <device-transfer> and <cloud-backup> the following excludes: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>");
                            }
                        } else if (baseContext.getResources().getIdentifier("appsflyer_backup_rules", "xml", baseContext.getPackageName()) != 0) {
                            AFLogger.INSTANCE.i(LogTag.GENERAL, "appsflyer_backup_rules.xml detected, using AppsFlyer defined backup rules for AppsFlyer SDK data");
                        } else {
                            AFLogger.INSTANCE.w(LogTag.GENERAL, "'allowBackup' is set to true; appsflyer_backup_rules.xml is NOT detected.\nAppsFlyer shared preferences should be excluded from auto backup by adding: <exclude domain=\"sharedpref\" path=\"appsflyer-data\"/> to the Application's <full-backup-content> rules.\nIf Appsflyer's Purchase Connector is in use then you also must add the following to your rules: <exclude domain=\"sharedpref\" path=\"appsflyer-purchase-data\"/> AND <exclude domain=\"database\" path=\"afpurchases.db\"/>");
                        }
                    }
                } catch (Throwable th2) {
                    AFLogger.INSTANCE.e(LogTag.GENERAL, "Exception while checking BackupRules: ", th2);
                }
                this.AFKeystoreWrapper.registerClient().loadProperties();
                this.AFKeystoreWrapper.AFLoggerLogLevel().d("init", str, appsFlyerConversionListener == null ? "null" : "conversionDataListener");
                AFLogger.INSTANCE.force(LogTag.GENERAL, String.format(Locale.US, "Initializing AppsFlyer SDK: (v%s.%s)", "7.0.1", unregisterClient));
                this.AFKeystoreWrapper.registerClient(appsFlyerConversionListener);
                return this;
            }
        }
        return this;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isPreInstalledApp(Context context) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        return this.AFKeystoreWrapper.AFLogger().AFKeystoreWrapper(context);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final boolean isSessionReady() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("isSessionReady", new String[0]);
        return this.AFKeystoreWrapper.setAppInviteOneLink().AFKeystoreWrapper();
    }

    @Override // com.appsflyer.AppsFlyerLib
    @Deprecated
    public final boolean isStopped() {
        return this.AFKeystoreWrapper.AppsFlyerLib().AFLogger();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logAdRevenue(@NonNull AFAdRevenueData aFAdRevenueData, Map<String, Object> map) {
        if (!this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            d("logAdRevenue");
            return;
        }
        if (!aFAdRevenueData.areAllFieldsValid()) {
            AFLogger.INSTANCE.w(LogTag.AD_REVENUE, "Invalid ad revenue parameters provided");
            return;
        }
        if (this.AFKeystoreWrapper.AppsFlyerLib().AFLogger()) {
            AFLogger.INSTANCE.w(LogTag.AD_REVENUE, "SDK is stopped");
            return;
        }
        AFf1fSDK aFf1fSDKAppsFlyerLib = this.AFKeystoreWrapper.AppsFlyerLib();
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAppsFlyerLib}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAppsFlyerLib));
        if (str == null || str.length() == 0) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "WARNING: AppsFlyer SDK is not initialized! You must provide AppsFlyer Dev-Key in the 'init' API method (should be called on Application's onCreate)");
        } else {
            this.AFKeystoreWrapper.w().d(new AFh1lSDK(aFAdRevenueData, map));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(Context context, String str, Map<String, Object> map) {
        logEvent(context, str, map, null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logLocation(Context context, double d10, double d11) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("logLocation", String.valueOf(d10), String.valueOf(d11));
        HashMap map = new HashMap();
        map.put(AFInAppEventParameterName.LONGITUDE, Double.toString(d11));
        map.put(AFInAppEventParameterName.LATITUDE, Double.toString(d10));
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f5402v = AFInAppEventType.LOCATION_COORDINATES;
        aFh1jSDK.AFKeystoreWrapper = map;
        this.AFKeystoreWrapper.w().d(aFh1jSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logSession(Context context) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("logSession", new String[0]);
        this.AFKeystoreWrapper.AFLoggerLogLevel().AFKeystoreWrapper();
        AFh1uSDK aFh1uSDK = AFh1uSDK.logSession;
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        AFh1xSDK aFh1xSDKE = this.AFKeystoreWrapper.e();
        aFh1xSDKE.unregisterClient(aFh1uSDK);
        aFh1xSDKE.AFLogger();
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f5402v = null;
        aFh1jSDK.AFKeystoreWrapper = null;
        this.AFKeystoreWrapper.w().d(aFh1jSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void onPause(Context context) {
        this.AFKeystoreWrapper.updateServerUninstallToken().AFKeystoreWrapper();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void performDeepLinking(@NonNull String str, boolean z10) {
        AFa1kSDK aFa1kSDKUnregisterClient;
        if (str == null || str.length() == 0) {
            this.AFKeystoreWrapper.enableTCFDataCollection().d("performDeepLinking was called with null or empty url", DeepLinkResult.Error.DEVELOPER_ERROR);
            return;
        }
        if (!this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            d("performDeepLinking");
            return;
        }
        if (z10) {
            this.AFKeystoreWrapper.setUserPhone().registerClient();
            aFa1kSDKUnregisterClient = AFa1kSDK.unregisterClient(this.AFKeystoreWrapper.setUserPhone());
        } else {
            aFa1kSDKUnregisterClient = AFa1kSDK.unregisterClient(new HashMap());
        }
        this.AFKeystoreWrapper.enableTCFDataCollection().c_(aFa1kSDKUnregisterClient, Uri.parse(str));
        if (z10) {
            this.AFKeystoreWrapper.w().d(new AFh1fSDK().unregisterClient());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerConversionListener(@NonNull AppsFlyerConversionListener appsFlyerConversionListener) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("registerConversionListener", new String[0]);
        this.AFKeystoreWrapper.registerClient(appsFlyerConversionListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void registerSessionReadyListener(@NonNull SessionReadyListener sessionReadyListener) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("registerSessionReadyListener", "listener");
        this.AFKeystoreWrapper.setAppInviteOneLink().d(sessionReadyListener);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendInAppPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        PurchaseHandler purchaseHandlerV = this.AFKeystoreWrapper.v();
        if (purchaseHandlerV.registerClient(map, purchaseValidationCallback, "purchases")) {
            purchaseHandlerV.unregisterClient.d(new AFe1gSDK(map, purchaseValidationCallback, purchaseHandlerV.AFKeystoreWrapper));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPurchaseData(Context context, Map<String, Object> map, PurchaseHandler.PurchaseValidationCallback purchaseValidationCallback) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        PurchaseHandler purchaseHandlerV = this.AFKeystoreWrapper.v();
        if (purchaseHandlerV.registerClient(map, purchaseValidationCallback, "subscriptions")) {
            purchaseHandlerV.unregisterClient.d(new AFe1tSDK(map, purchaseValidationCallback, purchaseHandlerV.AFKeystoreWrapper));
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0169  */
    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(Activity activity) {
        long j10;
        long jLongValue;
        if (activity != null && activity.getIntent() != null) {
            AFd1uSDK aFd1uSDKAFLoggerLogLevel = this.AFKeystoreWrapper.AFLoggerLogLevel();
            String localClassName = activity.getLocalClassName();
            StringBuilder sb2 = new StringBuilder("activity_intent_");
            sb2.append(activity.getIntent().toString());
            aFd1uSDKAFLoggerLogLevel.d("sendPushNotificationData", localClassName, sb2.toString());
        } else if (activity != null) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().d("sendPushNotificationData", activity.getLocalClassName(), "activity_intent_null");
        } else {
            this.AFKeystoreWrapper.AFLoggerLogLevel().d("sendPushNotificationData", "activity_null");
        }
        AFc1eSDK androidIdData = this.AFKeystoreWrapper.setAndroidIdData();
        String strRegisterClient = registerClient(activity);
        androidIdData.unregisterClient = strRegisterClient;
        if (strRegisterClient != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (this.f5229w == null) {
                AFLogger.INSTANCE.i(LogTag.ENGAGEMENT, "Initializing push notification history cache");
                this.f5229w = new ConcurrentHashMap();
                jLongValue = jCurrentTimeMillis;
                j10 = jLongValue;
            } else {
                try {
                    long jUnregisterClient = this.AFKeystoreWrapper.AFLogger().unregisterClient("AF_PUSH_PAYLOAD_MAX_AGING_MILLIS", BacktraceMetrics.defaultTimeIntervalMs);
                    jLongValue = jCurrentTimeMillis;
                    for (Long l10 : this.f5229w.keySet()) {
                        try {
                            JSONObject jSONObject = new JSONObject(androidIdData.unregisterClient);
                            JSONObject jSONObject2 = new JSONObject(this.f5229w.get(l10));
                            j10 = jCurrentTimeMillis;
                            try {
                                if (jSONObject.opt("pid").equals(jSONObject2.opt("pid")) && jSONObject.opt("c").equals(jSONObject2.opt("c"))) {
                                    AFLogger aFLogger = AFLogger.INSTANCE;
                                    LogTag logTag = LogTag.ENGAGEMENT;
                                    StringBuilder sb3 = new StringBuilder("Push notification already processed: duplicate PID and campaign detected (old: ");
                                    sb3.append(jSONObject2);
                                    sb3.append(", new: ");
                                    sb3.append(jSONObject);
                                    sb3.append(")");
                                    aFLogger.i(logTag, sb3.toString());
                                    androidIdData.unregisterClient = null;
                                    return;
                                }
                                if (j10 - l10.longValue() > jUnregisterClient) {
                                    this.f5229w.remove(l10);
                                }
                                if (l10.longValue() <= jLongValue) {
                                    jLongValue = l10.longValue();
                                }
                                jCurrentTimeMillis = j10;
                            } catch (Throwable th2) {
                                th = th2;
                                AFLogger aFLogger2 = AFLogger.INSTANCE;
                                LogTag logTag2 = LogTag.ENGAGEMENT;
                                StringBuilder sb4 = new StringBuilder("Error while handling push notification measurement: ");
                                sb4.append(th.getClass().getSimpleName());
                                aFLogger2.e(logTag2, sb4.toString(), th);
                                if (this.f5229w.size() == this.AFKeystoreWrapper.AFLogger().unregisterClient("AF_PUSH_PAYLOAD_HISTORY_SIZE", 2L)) {
                                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                                    LogTag logTag3 = LogTag.ENGAGEMENT;
                                    StringBuilder sb5 = new StringBuilder("Push history limit reached, removing oldest entry (timestamp: ");
                                    sb5.append(jLongValue);
                                    sb5.append(")");
                                    aFLogger3.i(logTag3, sb5.toString());
                                    this.f5229w.remove(Long.valueOf(jLongValue));
                                }
                                this.f5229w.put(Long.valueOf(j10), androidIdData.unregisterClient);
                                start();
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            j10 = jCurrentTimeMillis;
                        }
                    }
                    j10 = jCurrentTimeMillis;
                } catch (Throwable th4) {
                    th = th4;
                    j10 = jCurrentTimeMillis;
                    jLongValue = j10;
                }
            }
            if (this.f5229w.size() == this.AFKeystoreWrapper.AFLogger().unregisterClient("AF_PUSH_PAYLOAD_HISTORY_SIZE", 2L)) {
                AFLogger aFLogger4 = AFLogger.INSTANCE;
                LogTag logTag4 = LogTag.ENGAGEMENT;
                StringBuilder sb6 = new StringBuilder("Push history limit reached, removing oldest entry (timestamp: ");
                sb6.append(jLongValue);
                sb6.append(")");
                aFLogger4.i(logTag4, sb6.toString());
                this.f5229w.remove(Long.valueOf(jLongValue));
            }
            this.f5229w.put(Long.valueOf(j10), androidIdData.unregisterClient);
            start();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAdditionalData(Map<String, Object> map) {
        if (map != null) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().d("setAdditionalData", map.toString());
            JSONObject jSONObject = new JSONObject(map);
            this.AFKeystoreWrapper.setAndroidIdData().getSdkVersion = jSONObject.toString();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAndroidIdData(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setAndroidIdData", str);
        this.AFKeystoreWrapper.setAndroidIdData().force = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppId(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setAppId", str);
        this.AFKeystoreWrapper.setAndroidIdData().values = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setAppInviteOneLink(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setAppInviteOneLink", str);
        AFLogger.INSTANCE.i(LogTag.SDK_SETTERS, "setAppInviteOneLink = ".concat(String.valueOf(str)));
        if (str == null || !str.equals(this.AFKeystoreWrapper.setAndroidIdData().AppsFlyerLib)) {
            AppsFlyerProperties appsFlyerPropertiesRegisterClient = this.AFKeystoreWrapper.registerClient();
            appsFlyerPropertiesRegisterClient.remove(AppsFlyerProperties.ONELINK_DOMAIN);
            appsFlyerPropertiesRegisterClient.remove(AppsFlyerProperties.ONELINK_VERSION);
            appsFlyerPropertiesRegisterClient.remove(AppsFlyerProperties.ONELINK_SCHEME);
        }
        this.AFKeystoreWrapper.setAndroidIdData().AppsFlyerLib = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCollectAndroidID(boolean z10) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setCollectAndroidID", String.valueOf(z10));
        this.AFKeystoreWrapper.setAndroidIdData().afWarnLog = z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setConsentData(@NonNull AppsFlyerConsent appsFlyerConsent) {
        Objects.requireNonNull(appsFlyerConsent);
        this.AFKeystoreWrapper.setAndroidIdData().setImeiData = appsFlyerConsent;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCurrencyCode(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setCurrencyCode", str);
        this.AFKeystoreWrapper.setAndroidIdData().stop = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setCustomerUserId(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setCustomerUserId", str);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setCustomerUserId = ".concat(String.valueOf(str)));
        this.AFKeystoreWrapper.setAndroidIdData().valueOf = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDebugLog(boolean z10) {
        setLogLevel(z10 ? AFLogger.LogLevel.DEBUG : AFLogger.LogLevel.NONE);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDeepLinkTimeout(long j10) {
        if (j10 <= 0) {
            AFLogger.INSTANCE.d(LogTag.DDL, "Invalid timeout value. Using default value of 3000 milliseconds");
            j10 = 3000;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.DDL;
        StringBuilder sb2 = new StringBuilder("Setting DeepLink timeout to  ");
        sb2.append(j10);
        sb2.append(" milliseconds");
        aFLogger.d(logTag, sb2.toString());
        this.AFKeystoreWrapper.enableTCFDataCollection().AFKeystoreWrapper = j10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableAdvertisingIdentifiers(boolean z10) {
        AFLogger.INSTANCE.d(LogTag.SDK_SETTERS, "setDisableAdvertisingIdentifiers: ".concat(String.valueOf(z10)));
        AFb1iSDK.unregisterClient = Boolean.valueOf(!z10);
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        aFc1aSDK.setAndroidIdData().setAndroidIdData = z10;
        if (z10) {
            aFc1aSDK.setAndroidIdData().updateServerUninstallToken = null;
        } else {
            aFc1aSDK.afWarnLog().d(new AFe1iSDK(this.AFKeystoreWrapper));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setDisableNetworkData(boolean z10) {
        AFLogger.INSTANCE.d(LogTag.SDK_SETTERS, "setDisableNetworkData: ".concat(String.valueOf(z10)));
        this.AFKeystoreWrapper.setAndroidIdData().afErrorLog = z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setHost(String str, @NonNull String str2) {
        if (str2 == null || str2.trim().length() == 0) {
            AFLogger.INSTANCE.w(LogTag.HTTP_CLIENT, "setHost call ignored: hostname parameter is empty or null");
        } else {
            AFd1jSDK.AFLogger(new AFd1gSDK(str != null ? str.trim() : "", str2.trim()));
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setImeiData(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setImeiData", str);
        this.AFKeystoreWrapper.setAndroidIdData().AFLoggerLogLevel = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setInstallId(@NonNull String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setInstallId", new String[0]);
        if (!this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "AppsFlyerLib.init() method should be called first");
            return;
        }
        String strAFLogger = this.AFKeystoreWrapper.AFLogger().AFLogger("APPSFLYER_ALLOW_CUSTOM_INSTALL_ID");
        if (!(strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : false)) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "APPSFLYER_ALLOW_CUSTOM_INSTALL_ID Manifest flag should be set to true first");
        } else if (str == null) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "AppsFlyer installId can't be null");
        } else {
            AFb1jSDK.d(str, this.AFKeystoreWrapper.AFKeystoreWrapper());
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setIsUpdate(boolean z10) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setIsUpdate", String.valueOf(z10));
        this.AFKeystoreWrapper.setAndroidIdData().getEntries = z10;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setLogLevel(@NonNull AFLogger.LogLevel logLevel) {
        boolean z10 = logLevel.getLevel() > AFLogger.LogLevel.NONE.getLevel();
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("log", String.valueOf(z10));
        AFc1eSDK androidIdData = this.AFKeystoreWrapper.setAndroidIdData();
        Intrinsics.checkNotNullParameter(logLevel, "");
        androidIdData.enableTCFDataCollection = logLevel;
        if (z10) {
            this.AFKeystoreWrapper.setDebugLog().e();
        } else {
            this.AFKeystoreWrapper.setDebugLog().AFKeystoreWrapper();
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setMinTimeBetweenSessions(int i10) {
        this.AFKeystoreWrapper.setAndroidIdData().setDebugLog = TimeUnit.SECONDS.toMillis(i10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOaidData(String str) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setOaidData", str);
        AFb1iSDK.AFLogger = str;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOneLinkCustomDomain(String... strArr) {
        AFLogger.INSTANCE.d(LogTag.DDL, String.format(Locale.US, "setOneLinkCustomDomain %s", Arrays.toString(strArr)));
        this.AFKeystoreWrapper.enableTCFDataCollection().force = strArr;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setOutOfStore(String str) {
        if (str == null) {
            AFLogger.INSTANCE.w(LogTag.GENERAL, "Cannot set setOutOfStore with null");
            return;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        this.AFKeystoreWrapper.setAndroidIdData().getLevel = lowerCase;
        AFLogger.INSTANCE.i(LogTag.SDK_SETTERS, "Store API set with value: ".concat(String.valueOf(lowerCase)));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPartnerData(@NonNull String str, Map<String, Object> map) {
        AFc1eSDK androidIdData = this.AFKeystoreWrapper.setAndroidIdData();
        if (androidIdData.f5250v == null) {
            androidIdData.f5250v = new AFb1qSDK();
        }
        AFb1qSDK aFb1qSDK = androidIdData.f5250v;
        if (str == null || str.isEmpty()) {
            AFLogger.INSTANCE.w(LogTag.PUBLIC_API, "Partner ID is missing or null");
            return;
        }
        if (map == null || map.isEmpty()) {
            AFLogger.INSTANCE.w(LogTag.PUBLIC_API, aFb1qSDK.f5236d.remove(str) == null ? "Partner data is missing or null" : "Cleared partner data for ".concat(str));
            return;
        }
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.PUBLIC_API;
        StringBuilder sb2 = new StringBuilder("Setting partner data for ");
        sb2.append(str);
        sb2.append(": ");
        sb2.append(map);
        aFLogger.d(logTag, sb2.toString());
        int length = new JSONObject(map).toString().length();
        if (length <= 1000) {
            aFb1qSDK.f5236d.put(str, map);
            aFb1qSDK.AFKeystoreWrapper.remove(str);
        } else {
            aFLogger.w(logTag, "Partner data 1000 characters limit exceeded");
            HashMap map2 = new HashMap();
            map2.put("error", "limit exceeded: ".concat(String.valueOf(length)));
            aFb1qSDK.AFKeystoreWrapper.put(str, map2);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setPluginInfo(@NonNull PluginInfo pluginInfo) {
        Objects.requireNonNull(pluginInfo);
        this.AFKeystoreWrapper.onPause().registerClient(pluginInfo);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0021 A[Catch: JSONException -> 0x0016, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0016, blocks: (B:4:0x0012, B:8:0x001a, B:10:0x0021), top: B:23:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x001a A[Catch: JSONException -> 0x0016, TryCatch #0 {JSONException -> 0x0016, blocks: (B:4:0x0012, B:8:0x001a, B:10:0x0021), top: B:23:0x0012 }] */
    @Override // com.appsflyer.AppsFlyerLib
    public final void setPreinstallAttribution(String str, String str2, String str3) {
        AFLogger.INSTANCE.d(LogTag.PREINSTALL, "setPreinstallAttribution API called");
        JSONObject jSONObject = new JSONObject();
        if (str != null) {
            try {
                jSONObject.put("pid", str);
                if (str2 != null) {
                    jSONObject.put("c", str2);
                }
                if (str3 != null) {
                    jSONObject.put("af_siteid", str3);
                }
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(LogTag.PREINSTALL, e10.getMessage() != null ? e10.getMessage() : "Failed to serialize preinstall attribution parameters", e10);
            }
        } else {
            if (str2 != null) {
                jSONObject.put("c", str2);
            }
            if (str3 != null) {
                jSONObject.put("af_siteid", str3);
            }
        }
        if (jSONObject.has("pid")) {
            this.AFKeystoreWrapper.registerClient().set("preInstallName", jSONObject.toString());
        } else {
            AFLogger.INSTANCE.w(LogTag.PREINSTALL, "Preinstall attribution rejected: media source parameter is required");
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setResolveDeepLinkURLs(String... strArr) {
        AFLogger.INSTANCE.d(LogTag.DDL, String.format(Locale.US, "setResolveDeepLinkURLs %s", Arrays.toString(strArr)));
        AFa1qSDK aFa1qSDKEnableTCFDataCollection = this.AFKeystoreWrapper.enableTCFDataCollection();
        aFa1qSDKEnableTCFDataCollection.f5226w.clear();
        aFa1qSDKEnableTCFDataCollection.f5226w.addAll(Arrays.asList(strArr));
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setSharingFilterForPartners(String... strArr) {
        this.AFKeystoreWrapper.setAndroidIdData().f5251w = new AFb1rSDK(strArr);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserEmail(@NonNull String str) {
        if (str == null) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "setUserEmail called with null email");
            return;
        }
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setUserEmail", new String[0]);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setUserEmail");
        String strAFKeystoreWrapper = AFj1jSDK.AFKeystoreWrapper(str);
        this.AFKeystoreWrapper.setAndroidIdData().AFLogger = AFj1nSDK.AFLogger(strAFKeystoreWrapper);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserFbLoginId(long j10) {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setUserFbLoginId", new String[0]);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setUserFbLoginId");
        this.AFKeystoreWrapper.setAndroidIdData().f5249i = Long.valueOf(j10);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserFirstName(@NonNull String str) {
        if (str == null) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "setUserFirstName called with null firstName");
            return;
        }
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setUserFirstName", new String[0]);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setUserFirstName");
        String strAFLogger = AFj1jSDK.AFLogger(str);
        this.AFKeystoreWrapper.setAndroidIdData().AFKeystoreWrapper = AFj1nSDK.AFLogger(strAFLogger);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserLastName(@NonNull String str) {
        if (str == null) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "setUserLastName called with null lastName");
            return;
        }
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setUserLastName", new String[0]);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setUserLastName");
        String strAFLogger = AFj1jSDK.AFLogger(str);
        this.AFKeystoreWrapper.setAndroidIdData().f5248e = AFj1nSDK.AFLogger(strAFLogger);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void setUserPhone(@NonNull String str, @NonNull String str2) {
        if (str == null || str2 == null) {
            AFLogger.INSTANCE.d(LogTag.GENERAL, "setUserPhone called with null argument");
            return;
        }
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("setUserPhone", new String[0]);
        AFLogger.INSTANCE.i(LogTag.GENERAL, "setUserPhone");
        AFj1jSDK aFj1jSDK = AFj1jSDK.INSTANCE;
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(str2, "");
        String strS1 = StringsKt.s1(AFj1jSDK.AFKeystoreWrapper(str, str2), '0');
        String strUnregisterClient = AFj1jSDK.unregisterClient(str, str2);
        AFc1eSDK androidIdData = this.AFKeystoreWrapper.setAndroidIdData();
        androidIdData.f5247d = AFj1nSDK.AFLogger(strS1);
        androidIdData.registerClient = AFj1nSDK.AFLogger(strUnregisterClient);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start() {
        unregisterClient(null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void stop(boolean z10, Context context) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        final AFc1aSDK aFc1aSDK2 = this.AFKeystoreWrapper;
        aFc1aSDK2.AppsFlyerLib().AFLogger(z10);
        aFc1aSDK2.d().submit(new Runnable() { // from class: com.appsflyer.internal.n
            @Override // java.lang.Runnable
            public final void run() {
                AFa1tSDK.d(aFc1aSDK2);
            }
        });
        if (z10) {
            aFc1aSDK2.AFKeystoreWrapper().registerClient("is_stop_tracking_used", true);
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void subscribeForDeepLink(@NonNull DeepLinkListener deepLinkListener) {
        this.AFKeystoreWrapper.enableTCFDataCollection().unregisterClient = deepLinkListener;
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterConversionListener() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("unregisterConversionListener", new String[0]);
        this.AFKeystoreWrapper.registerClient(null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void unregisterSessionReadyListener() {
        this.AFKeystoreWrapper.AFLoggerLogLevel().d("unregisterSessionReadyListener", new String[0]);
        this.AFKeystoreWrapper.setAppInviteOneLink().d(null);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void updateServerUninstallToken(Context context, String str) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        AFg1vSDK aFg1vSDK = new AFg1vSDK();
        if (str == null || str.trim().isEmpty()) {
            AFLogger.INSTANCE.w(LogTag.UNINSTALL, "Firebase Token is either empty or null and was not registered.");
            return;
        }
        AFLogger.INSTANCE.i(LogTag.UNINSTALL, "Firebase Refreshed Token = ".concat(str));
        AFg1sSDK aFg1sSDKD = aFg1vSDK.d();
        if (aFg1sSDKD == null || !str.equals(aFg1sSDKD.AFKeystoreWrapper)) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            boolean z10 = aFg1sSDKD == null || jCurrentTimeMillis - aFg1sSDKD.unregisterClient > TimeUnit.SECONDS.toMillis(2L);
            AFg1sSDK aFg1sSDK = new AFg1sSDK(str, jCurrentTimeMillis, !z10);
            aFg1vSDK.registerClient.d("afUninstallToken", aFg1sSDK.AFKeystoreWrapper);
            aFg1vSDK.registerClient.AFLogger("afUninstallToken_received_time", aFg1sSDK.unregisterClient);
            aFg1vSDK.registerClient.registerClient("afUninstallToken_queued", aFg1sSDK.AFLogger);
            if (z10) {
                AFc1aSDK aFc1aSDK2 = f5227d.AFKeystoreWrapper;
                aFc1aSDK2.afWarnLog().d(new AFf1qSDK(str, aFc1aSDK2));
            }
        }
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void validateAndLogInAppPurchase(@NonNull AFPurchaseDetails aFPurchaseDetails, Map<String, String> map, AppsFlyerInAppPurchaseValidationCallback appsFlyerInAppPurchaseValidationCallback) {
        this.AFKeystoreWrapper.afWarnLog().d(new AFe1eSDK(this.AFKeystoreWrapper, aFPurchaseDetails, map, appsFlyerInAppPurchaseValidationCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(AFc1bSDK aFc1bSDK) {
        aFc1bSDK.values().unregisterClient();
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void logEvent(@NonNull Context context, String str, Map<String, Object> map, AppsFlyerRequestListener appsFlyerRequestListener) {
        HashMap map2 = map == null ? null : new HashMap(map);
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (context != null) {
            aFc1aSDK.f5240d.f5305d = context.getApplicationContext();
        }
        AFh1jSDK aFh1jSDK = new AFh1jSDK();
        aFh1jSDK.f5402v = str;
        aFh1jSDK.AFLogger = appsFlyerRequestListener;
        if (map2 != null && map2.containsKey(AFInAppEventParameterName.TOUCH_OBJ)) {
            HashMap map3 = new HashMap();
            Object obj = map2.get(AFInAppEventParameterName.TOUCH_OBJ);
            if (obj instanceof MotionEvent) {
                MotionEvent motionEvent = (MotionEvent) obj;
                HashMap map4 = new HashMap();
                map4.put("x", Float.valueOf(motionEvent.getX()));
                map4.put("y", Float.valueOf(motionEvent.getY()));
                map3.put("loc", map4);
                map3.put("pf", Float.valueOf(motionEvent.getPressure()));
                map3.put("rad", Float.valueOf(motionEvent.getTouchMajor() / 2.0f));
            } else {
                map3.put("error", "Parsing failed due to invalid input in 'af_touch_obj'.");
                AFLogger.INSTANCE.w(LogTag.PREDICT, "Parsing failed due to invalid input in 'af_touch_obj'.");
            }
            Map<String, ?> mapSingletonMap = Collections.singletonMap("tch_data", map3);
            map2.remove(AFInAppEventParameterName.TOUCH_OBJ);
            aFh1jSDK.AFKeystoreWrapper(mapSingletonMap);
        }
        aFh1jSDK.AFKeystoreWrapper = map2;
        AFd1uSDK aFd1uSDKAFLoggerLogLevel = this.AFKeystoreWrapper.AFLoggerLogLevel();
        Map map5 = aFh1jSDK.AFKeystoreWrapper;
        if (map5 == null) {
            map5 = new HashMap();
        }
        aFd1uSDKAFLoggerLogLevel.d("logEvent", str, new JSONObject(map5).toString());
        if (str == null) {
            AFh1uSDK aFh1uSDK = AFh1uSDK.logEvent;
            AFc1aSDK aFc1aSDK2 = this.AFKeystoreWrapper;
            if (context != null) {
                aFc1aSDK2.f5240d.f5305d = context.getApplicationContext();
            }
            AFh1xSDK aFh1xSDKE = this.AFKeystoreWrapper.e();
            aFh1xSDKE.unregisterClient(aFh1uSDK);
            aFh1xSDKE.AFLogger();
        }
        this.AFKeystoreWrapper.w().d(aFh1jSDK);
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void start(AppsFlyerRequestListener appsFlyerRequestListener) {
        unregisterClient(appsFlyerRequestListener);
    }

    private void AFKeystoreWrapper(AppsFlyerRequestListener appsFlyerRequestListener) {
        AFh1fSDK aFh1fSDK = new AFh1fSDK();
        AFc1eSDK androidIdData = this.AFKeystoreWrapper.setAndroidIdData();
        aFh1fSDK.f5400e = androidIdData.setUserLastName;
        aFh1fSDK.afInfoLog = androidIdData.clearUserPii;
        aFh1fSDK.AFLogger = appsFlyerRequestListener;
        this.AFKeystoreWrapper.w().d(aFh1fSDK);
        androidIdData.setUserLastName = null;
        androidIdData.clearUserPii = null;
    }

    public static String d(AFc1kSDK aFc1kSDK, String str) {
        String strD = aFc1kSDK.d("CACHED_CHANNEL");
        if (strD != null) {
            return strD;
        }
        aFc1kSDK.d("CACHED_CHANNEL", str);
        return str;
    }

    private static void d(String str) {
        AFLogger aFLogger = AFLogger.INSTANCE;
        LogTag logTag = LogTag.SDK_LIFECYCLE;
        StringBuilder sb2 = new StringBuilder("WARNING: AppsFlyer SDK is not initialized! The API call '");
        sb2.append(str);
        sb2.append("()' must be called after the 'init(String, AppsFlyerConversionListener)' API method, which should be called on the Application's onCreate.");
        aFLogger.w(logTag, sb2.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit registerClient() {
        if (!this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            d("finishSdkSession");
        } else if (!this.AFKeystoreWrapper.setAndroidIdData().setUserPhone) {
            AFLogger.INSTANCE.w(LogTag.SDK_LIFECYCLE, "ERROR: AppsFlyer SDK session not started. Skipping session finish.");
        } else {
            AFLogger aFLogger = AFLogger.INSTANCE;
            aFLogger.i(LogTag.SDK_LIFECYCLE, "Finishing AppsFlyer session");
            this.AFKeystoreWrapper.setUserPhone().registerClient();
            this.AFKeystoreWrapper.afInfoLog().AFKeystoreWrapper();
            if (this.AFKeystoreWrapper.getEntries() != null) {
                this.AFKeystoreWrapper.getEntries().sendExceptionsToServerIfNeeded();
            }
            if (this.AFKeystoreWrapper.AFLoggerLogLevel().i()) {
                this.AFKeystoreWrapper.AFLoggerLogLevel().d();
                Context context = this.AFKeystoreWrapper.valueOf().f5305d;
                if (context != null && !AppsFlyerLib.getInstance().isStopped()) {
                    this.AFKeystoreWrapper.AFLoggerLogLevel().v_(context.getPackageName(), context.getPackageManager());
                }
                this.AFKeystoreWrapper.AFLoggerLogLevel().unregisterClient();
            } else {
                aFLogger.d(LogTag.PROXY, "RD status is OFF");
            }
            AFh1sSDK userLastName = this.AFKeystoreWrapper.setUserLastName();
            if (userLastName != null) {
                userLastName.AFLogger();
            }
            this.AFKeystoreWrapper.setAndroidIdData().setUserPhone = false;
        }
        return Unit.f22483a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void AFLogger() {
        AFi1oSDK imeiData;
        try {
            Context context = this.AFKeystoreWrapper.valueOf().f5305d;
            if (AFj1qSDK.AFLogger(context) && AFj1qSDK.unregisterClient(context)) {
                final AFi1oSDK imeiData2 = this.AFKeystoreWrapper.setImeiData();
                if (imeiData2 != null) {
                    imeiData2.AFKeystoreWrapper(new AFi1kSDK() { // from class: com.appsflyer.internal.l
                        @Override // com.appsflyer.internal.AFi1kSDK
                        public final void onRequestFinished() {
                            this.f5501a.d(imeiData2);
                        }
                    });
                    return;
                }
                return;
            }
            if (AFj1qSDK.unregisterClient(context) || (imeiData = this.AFKeystoreWrapper.setImeiData()) == null) {
                return;
            }
            d(imeiData);
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.PLAY_INTEGRITY_API;
            aFLogger.e(logTag, "Failed to request Play Integrity API token", th2, false, false);
            aFLogger.v(logTag, "Play Integrity API token request exception: ".concat(String.valueOf(th2)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void AFLogger(AFf1pSDK aFf1pSDK) {
        AFc1aSDK aFc1aSDK = this.AFKeystoreWrapper;
        if (aFf1pSDK == AFf1pSDK.SUCCESS && aFc1aSDK.getEntries() != null) {
            aFc1aSDK.getEntries().updateExceptionManagerConfiguration();
        }
        if (!aFc1aSDK.AFLoggerLogLevel().AFLogger()) {
            aFc1aSDK.setDebugLog().unregisterClient();
        } else {
            aFc1aSDK.setDebugLog().AFLogger();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void unregisterClient() {
        this.AFKeystoreWrapper.w().d(new AFh1kSDK());
    }

    @Override // com.appsflyer.AppsFlyerLib
    public final void sendPushNotificationData(@NonNull AFPushData aFPushData) {
        if (this.AFKeystoreWrapper.setAndroidIdData().setUserFirstName) {
            this.AFKeystoreWrapper.AFLoggerLogLevel().d("sendPushNotificationData", "push_data:".concat(String.valueOf(aFPushData)));
            AFLogger.INSTANCE.i(LogTag.ATTRIBUTION, "Received campaign details from push");
            this.AFKeystoreWrapper.setUserPhone().registerClient();
            this.AFKeystoreWrapper.setAndroidIdData().unregisterClient = aFPushData.toJson().toString();
            this.AFKeystoreWrapper.w().d(new AFh1fSDK().unregisterClient());
            return;
        }
        d("sendPushNotificationData");
    }

    private /* synthetic */ void registerClient(boolean z10) {
        if (z10) {
            this.AFKeystoreWrapper.setDebugLog().registerClient();
        } else {
            this.AFKeystoreWrapper.setDebugLog().d();
        }
    }
}
