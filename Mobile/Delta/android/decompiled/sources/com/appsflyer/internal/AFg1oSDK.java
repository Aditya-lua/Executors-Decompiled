package com.appsflyer.internal;

import android.annotation.SuppressLint;
import android.app.UiModeManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.R;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.util.AndroidExtensionsKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1oSDK implements AFg1rSDK {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AppsFlyerLib = 0;
    private static int getLevel = 1;

    @NotNull
    private final AFg1qSDK AFKeystoreWrapper;

    @NotNull
    private final Context AFLogger;

    @NotNull
    private final AFc1eSDK AFLoggerLogLevel;

    @NotNull
    private final jt.h afDebugLog;

    @NotNull
    private final AppsFlyerProperties afErrorLog;

    @NotNull
    private final AFf1bSDK afInfoLog;

    @NotNull
    private final AFd1zSDK afWarnLog;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final AFj1cSDK f5377d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final AFc1kSDK f5378e;

    @NotNull
    private final AFi1vSDK force;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final AFc1iSDK f5379i;

    @NotNull
    private final AFj1ySDK registerClient;

    @NotNull
    private final AFg1wSDK unregisterClient;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFh1xSDK f5380v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @NotNull
    private final AFf1fSDK f5381w;
    private static char[] valueOf = {13891, 31402, 44955, 53476, 1481, 46615, 64288, 11290, 20859, 33360, 14001, 31619, 44172, 53759, 724, 17751, 2465, 56472, 41961, 30409};
    private static long getEntries = 8025551254644932716L;

    public AFg1oSDK(@NotNull Context context, @NotNull AFj1cSDK aFj1cSDK, @NotNull AFg1wSDK aFg1wSDK, @NotNull AFj1ySDK aFj1ySDK, @NotNull AFg1qSDK aFg1qSDK, @NotNull AFh1xSDK aFh1xSDK, @NotNull AFc1kSDK aFc1kSDK, @NotNull AFc1iSDK aFc1iSDK, @NotNull AFi1vSDK aFi1vSDK, @NotNull AFf1fSDK aFf1fSDK, @NotNull AFd1zSDK aFd1zSDK, @NotNull AFf1bSDK aFf1bSDK, @NotNull AFc1eSDK aFc1eSDK, @NotNull AppsFlyerProperties appsFlyerProperties) {
        Intrinsics.checkNotNullParameter(context, "");
        Intrinsics.checkNotNullParameter(aFj1cSDK, "");
        Intrinsics.checkNotNullParameter(aFg1wSDK, "");
        Intrinsics.checkNotNullParameter(aFj1ySDK, "");
        Intrinsics.checkNotNullParameter(aFg1qSDK, "");
        Intrinsics.checkNotNullParameter(aFh1xSDK, "");
        Intrinsics.checkNotNullParameter(aFc1kSDK, "");
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        Intrinsics.checkNotNullParameter(aFi1vSDK, "");
        Intrinsics.checkNotNullParameter(aFf1fSDK, "");
        Intrinsics.checkNotNullParameter(aFd1zSDK, "");
        Intrinsics.checkNotNullParameter(aFf1bSDK, "");
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(appsFlyerProperties, "");
        this.AFLogger = context;
        this.f5377d = aFj1cSDK;
        this.unregisterClient = aFg1wSDK;
        this.registerClient = aFj1ySDK;
        this.AFKeystoreWrapper = aFg1qSDK;
        this.f5380v = aFh1xSDK;
        this.f5378e = aFc1kSDK;
        this.f5379i = aFc1iSDK;
        this.force = aFi1vSDK;
        this.f5381w = aFf1fSDK;
        this.afWarnLog = aFd1zSDK;
        this.afInfoLog = aFf1bSDK;
        this.AFLoggerLogLevel = aFc1eSDK;
        this.afErrorLog = appsFlyerProperties;
        this.afDebugLog = jt.i.b(new Function0() { // from class: com.appsflyer.internal.r0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFg1oSDK.AFLoggerLogLevel();
            }
        });
    }

    private static /* synthetic */ Object AFKeystoreWrapper(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        String str = aFg1oSDK.AFLoggerLogLevel.getOutOfStore;
        if (str != null) {
            map.put("net_token", str);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.REMOTE_CONTROL, "Network token added to event", false, 4, null);
            return null;
        }
        int i10 = AppsFlyerLib + 17;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static void AFLoggerLogLevel(@NotNull Map<String, Object> map) {
        getLevel = (AppsFlyerLib + 119) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Object[] objArr = new Object[1];
        a(TextUtils.indexOf((CharSequence) "", '0', 0) + 16, (char) (18880 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 5 - View.MeasureSpec.getMode(0), objArr);
        map.put(((String) objArr[0]).intern(), Build.BRAND);
        map.put("device", Build.DEVICE);
        map.put("product", Build.PRODUCT);
        map.put("sdk", String.valueOf(Build.VERSION.SDK_INT));
        map.put("model", Build.MODEL);
        map.put("deviceType", Build.TYPE);
        int i10 = AppsFlyerLib + 29;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private void AppsFlyerLib(@NotNull Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 291205159, -291205155, System.identityHashCode(this));
    }

    private static List<AFd1bSDK> afDebugLog() {
        return (List) unregisterClient(new Object[0], 1713251753, -1713251742, (int) System.currentTimeMillis());
    }

    @SuppressLint({"HardwareIds"})
    private final String afErrorLog() {
        String strD = this.f5378e.d("androidIdCached");
        try {
            String string = Settings.Secure.getString(this.AFLogger.getContentResolver(), "android_id");
            if (string != null) {
                return string;
            }
        } catch (Exception e10) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = e10.getMessage();
            if (message == null) {
                AppsFlyerLib = (getLevel + 45) % 128;
                message = "Failed to retrieve Android ID from Settings.Secure";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, e10, false, false, false, false, 120, null);
            AppsFlyerLib = (getLevel + 9) % 128;
        }
        if (strD == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 87) % 128;
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Using cached Android ID (current retrieval failed): " + strD, false, 4, null);
        return strD;
    }

    private final boolean afInfoLog() {
        if (this.AFLoggerLogLevel.afWarnLog) {
            return true;
        }
        int i10 = AppsFlyerLib + 21;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 71 / 0;
            if (!AFj1qSDK.AFLogger(this.AFLogger)) {
                return true;
            }
        } else if (!AFj1qSDK.AFLogger(this.AFLogger)) {
            return true;
        }
        AppsFlyerLib = (getLevel + 11) % 128;
        return false;
    }

    private final void afWarnLog(Map<String, Object> map) {
        AppsFlyerLib = (getLevel + 65) % 128;
        UiModeManager uiModeManager = (UiModeManager) this.AFLogger.getSystemService(UiModeManager.class);
        if (uiModeManager == null || uiModeManager.getCurrentModeType() != 4) {
            return;
        }
        int i10 = getLevel + 117;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("tv", Boolean.TRUE);
            int i11 = 93 / 0;
        } else {
            map.put("tv", Boolean.TRUE);
        }
        getLevel = (AppsFlyerLib + 61) % 128;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0078  */
    private void d(@NotNull Map<String, Object> map, boolean z10) {
        Intrinsics.checkNotNullParameter(map, "");
        HashMap map2 = new HashMap();
        map2.put("cpu_abi", AFLogger("ro.product.cpu.abi"));
        map2.put("cpu_abi2", AFLogger("ro.product.cpu.abi2"));
        map2.put("arch", AFLogger("os.arch"));
        map2.put("build_display_id", AFLogger("ro.build.display.id"));
        if (z10) {
            int i10 = AppsFlyerLib + 5;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                unregisterClient(new Object[]{this, map2}, 1798824484, -1798824476, System.identityHashCode(this));
                if (this.f5379i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= 5) {
                    map2.putAll(this.registerClient.AFLogger());
                }
            } else {
                unregisterClient(new Object[]{this, map2}, 1798824484, -1798824476, System.identityHashCode(this));
                if (this.f5379i.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) <= 2) {
                    map2.putAll(this.registerClient.AFLogger());
                }
            }
        }
        map2.put("dim", this.AFKeystoreWrapper.registerClient(this.AFLogger));
        map.put("deviceData", map2);
        int i11 = AppsFlyerLib + 35;
        getLevel = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
    }

    private void e(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFh1xSDK aFh1xSDK = this.f5380v;
        HashMap map2 = new HashMap(aFh1xSDK.AFLogger);
        aFh1xSDK.AFLogger.clear();
        aFh1xSDK.AFKeystoreWrapper.AFLogger("gcd");
        Intrinsics.checkNotNull(map2);
        if (map2.isEmpty()) {
            getLevel = (AppsFlyerLib + 13) % 128;
        } else {
            AppsFlyerLib = (getLevel + 39) % 128;
            AFj1iSDK.AFLogger(map).put("gcd", map2);
        }
    }

    private void enableTCFDataCollection(@NotNull Map<String, Object> map) {
        AppsFlyerLib = (getLevel + 9) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("af_preinstalled", String.valueOf(this.f5379i.AFKeystoreWrapper(this.AFLogger)));
        getLevel = (AppsFlyerLib + 115) % 128;
    }

    private static /* synthetic */ Object force(Object[] objArr) {
        AFd1nSDK aFd1nSDK;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        AFc1eSDK aFc1eSDK = aFg1oSDK.f5379i.registerClient;
        if (aFc1eSDK.setAndroidIdData) {
            int i10 = getLevel + 45;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                Map<String, Object> map = aFh1pSDK.f5399d;
                Intrinsics.checkNotNullExpressionValue(map, "");
                AFj1iSDK.AFLogger(map).put("ad_ids_disabled", Boolean.TRUE);
                throw null;
            }
            Map<String, Object> map2 = aFh1pSDK.f5399d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            AFj1iSDK.AFLogger(map2).put("ad_ids_disabled", Boolean.TRUE);
            getLevel = (AppsFlyerLib + 63) % 128;
        } else {
            AdvertisingIdData advertisingIdData = aFc1eSDK.updateServerUninstallToken;
            if (advertisingIdData == null) {
                return null;
            }
            String str = advertisingIdData.gaidError;
            if (str != null && str.length() != 0) {
                aFh1pSDK.AFKeystoreWrapper("gaidError", advertisingIdData.gaidError);
            }
            String str2 = advertisingIdData.advertisingId;
            if (str2 != null) {
                getLevel = (AppsFlyerLib + 75) % 128;
                if (advertisingIdData.isEnabled != null) {
                    aFh1pSDK.AFKeystoreWrapper("advertiserId", str2);
                    aFh1pSDK.AFKeystoreWrapper("advertiserIdEnabled", String.valueOf(advertisingIdData.isEnabled));
                    aFh1pSDK.AFKeystoreWrapper("isGaidWithGps", String.valueOf(advertisingIdData.isGaidWithGps));
                }
            }
        }
        AdvertisingIdData advertisingIdData2 = aFg1oSDK.f5379i.registerClient.updateServerUninstallToken;
        aFh1pSDK.AFKeystoreWrapper("GAID_retry", String.valueOf(advertisingIdData2 != null ? Intrinsics.c(advertisingIdData2.retry, Boolean.TRUE) : false));
        if (CollectionsKt.W(kotlin.collections.p.n(AFd1bSDK.CONVERSION, AFd1bSDK.LAUNCH), aFh1pSDK.AFKeystoreWrapper()) && (aFd1nSDK = aFg1oSDK.AFLoggerLogLevel.setOaidData) != null) {
            Map<String, Object> map3 = aFh1pSDK.f5399d;
            Intrinsics.checkNotNullExpressionValue(map3, "");
            AFj1iSDK.AFLogger(map3).put("fetchAdIdLatency", Long.valueOf(aFd1nSDK.registerClient));
        }
        return null;
    }

    private void getEntries(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        long j10 = this.f5380v.afInfoLog;
        if (j10 != 0) {
            getLevel = (AppsFlyerLib + 71) % 128;
            map.put("prev_session_dur", Long.valueOf(j10));
        }
        getLevel = (AppsFlyerLib + 85) % 128;
    }

    private void getInstance(@NotNull Map<String, Object> map) {
        int i10 = AppsFlyerLib + 29;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            this.f5378e.registerClient("is_stop_tracking_used");
            throw null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        if (this.f5378e.registerClient("is_stop_tracking_used")) {
            map.put("istu", String.valueOf(this.f5378e.AFKeystoreWrapper("is_stop_tracking_used")));
        }
        int i11 = getLevel + 19;
        AppsFlyerLib = i11 % 128;
        if (i11 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0031  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x002b A[PHI: r0
      0x002b: PHI (r0v5 java.lang.String) = (r0v4 java.lang.String), (r0v18 java.lang.String) binds: [B:8:0x0029, B:5:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    private void getLevel(@NotNull Map<String, Object> map) {
        String strAFLogger;
        boolean z10;
        int i10 = getLevel + 39;
        AppsFlyerLib = i10 % 128;
        boolean z11 = false;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = this.f5379i.AFLogger("CHANNEL");
            int i11 = 94 / 0;
            if (strAFLogger != null) {
                if (strAFLogger.equals("")) {
                    AppsFlyerLib = (getLevel + 29) % 128;
                    strAFLogger = null;
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = this.f5379i.AFLogger("CHANNEL");
            if (strAFLogger != null) {
                if (strAFLogger.equals("")) {
                    AppsFlyerLib = (getLevel + 29) % 128;
                    strAFLogger = null;
                }
            }
        }
        String strRegisterClient = registerClient(this.f5378e, strAFLogger);
        if (strRegisterClient == null || Intrinsics.c(strRegisterClient, strAFLogger)) {
            z10 = false;
        } else {
            AppsFlyerLib = (getLevel + 71) % 128;
            z10 = true;
        }
        if (strRegisterClient == null && strAFLogger != null) {
            z11 = true;
        }
        if (z10) {
            map.put("af_latestchannel", strAFLogger);
        } else {
            AppsFlyerLib = (getLevel + 23) % 128;
            if (z11) {
                map.put("af_latestchannel", strAFLogger);
            }
        }
        String strForce = force();
        if (strForce != null) {
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            Object lowerCase = strForce.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            map.put("af_installstore", lowerCase);
        }
        String strW = w();
        if (strW != null) {
            Locale locale2 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale2, "");
            Object lowerCase2 = strW.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "");
            map.put("af_preinstall_name", lowerCase2);
        }
        String strE = e();
        if (strE != null) {
            Locale locale3 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale3, "");
            Object lowerCase3 = strE.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "");
            map.put("af_currentstore", lowerCase3);
        }
    }

    private void getSdkVersion(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFb1lSDK aFb1lSDKH_ = AFb1iSDK.h_(this.AFLogger.getContentResolver());
        if (aFb1lSDKH_ != null) {
            int i10 = AppsFlyerLib + 107;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("amazon_aid", aFb1lSDKH_.f5235d);
                map.put("amazon_aid_limit", String.valueOf(aFb1lSDKH_.AFLogger));
                throw null;
            }
            map.put("amazon_aid", aFb1lSDKH_.f5235d);
            map.put("amazon_aid_limit", String.valueOf(aFb1lSDKH_.AFLogger));
            int i11 = getLevel + 63;
            AppsFlyerLib = i11 % 128;
            if (i11 % 2 != 0) {
                throw null;
            }
        }
    }

    private void i(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.AFLoggerLogLevel.AppsFlyerLib;
        String string = this.afErrorLog.getString(AppsFlyerProperties.ONELINK_VERSION);
        if (str != null) {
            int i10 = getLevel + 91;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("onelink_id", str);
                int i11 = 59 / 0;
            } else {
                map.put("onelink_id", str);
            }
        }
        if (string != null) {
            getLevel = (AppsFlyerLib + 83) % 128;
            map.put("onelink_ver", string);
            AppsFlyerLib = (getLevel + 15) % 128;
        }
        int i12 = AppsFlyerLib + 47;
        getLevel = i12 % 128;
        if (i12 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0067  */
    /* JADX WARN: Code duplicated, block: B:12:0x0071  */
    /* JADX WARN: Code duplicated, block: B:9:0x0059  */
    private void onPause(@NotNull Map<String, Object> map) {
        int i10;
        int i11 = AppsFlyerLib + 99;
        getLevel = i11 % 128;
        if (i11 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            boolean zRegisterClient = AFg1vSDK.registerClient(this.AFLogger);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "didConfigureTokenRefreshService=" + zRegisterClient, false, 4, null);
            if (!zRegisterClient) {
                i10 = AppsFlyerLib + 69;
                getLevel = i10 % 128;
                if (i10 % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    int i12 = 11 / 0;
                } else {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                }
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            boolean zRegisterClient2 = AFg1vSDK.registerClient(this.AFLogger);
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.UNINSTALL, "didConfigureTokenRefreshService=" + zRegisterClient2, false, 4, null);
            if (!zRegisterClient2) {
                i10 = AppsFlyerLib + 69;
                getLevel = i10 % 128;
                if (i10 % 2 == 0) {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                    int i13 = 11 / 0;
                } else {
                    map.put("tokenRefreshConfigured", Boolean.FALSE);
                }
            }
        }
        map.put("registeredUninstall", Boolean.valueOf(this.f5378e.AFKeystoreWrapper("sentRegisterRequestToAF")));
    }

    private void setImeiData(@NotNull Map<String, Object> map) {
        String strRegisterClient;
        Intrinsics.checkNotNullParameter(map, "");
        String strAFLogger = this.f5379i.AFLogger("AF_COLLECT_FACEBOOK_ATTR_ID");
        if (strAFLogger != null ? Boolean.parseBoolean(strAFLogger) : true) {
            try {
                this.AFLogger.getPackageManager().getApplicationInfo("com.facebook.katana", 0);
                strRegisterClient = this.f5379i.registerClient(this.AFLogger);
            } catch (Throwable unused) {
                strRegisterClient = null;
            }
            if (strRegisterClient != null) {
                AppsFlyerLib = (getLevel + 19) % 128;
                map.put("fb", strRegisterClient);
            }
        }
        AppsFlyerLib = (getLevel + 31) % 128;
    }

    private void setOaidData(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFf1fSDK aFf1fSDK = this.f5381w;
        String str = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDK}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDK));
        if (str != null && str.length() != 0) {
            int i10 = AppsFlyerLib + 109;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("appsflyerKey", str);
                throw null;
            }
            map.put("appsflyerKey", str);
        }
        getLevel = (AppsFlyerLib + 103) % 128;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static void stop(@NotNull Map<String, Object> map) {
        Locale locale;
        int i10 = getLevel + 35;
        AppsFlyerLib = i10 % 128;
        String str = "";
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                map.put("lang", Locale.getDefault().getDisplayLanguage());
                throw null;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Locale locale2 = Locale.getDefault();
            map.put("lang", locale2.getDisplayLanguage());
            locale = locale2;
            try {
                map.put("lang_code", locale.getLanguage());
            } catch (Exception e10) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device language code", e10, false, false, false, false, 120, null);
            }
            try {
                map.put("country", locale.getCountry());
            } catch (Exception e11) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device country code", e11, false, false, false, false, 120, null);
            }
        } catch (Exception e12) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve device display language name", e12, false, false, false, false, 120, null);
            map.put("lang", "".getLanguage());
            locale = str;
        }
    }

    private final void v(Map<String, Object> map) {
        try {
            long jLongValue = registerClient().longValue();
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
            map.put("installDate", simpleDateFormat.format(new Date(jLongValue)));
            int i10 = getLevel + 107;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to retrieve or format app install date", e10, false, false, false, false, 120, null);
        }
    }

    private void valueOf(@NotNull Map<String, Object> map) {
        Object objRegisterClient;
        String strAFLogger;
        int i10 = AppsFlyerLib + 75;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1uSDK aFa1uSDK = AFa1uSDK.INSTANCE;
            objRegisterClient = AFa1uSDK.registerClient(this.afErrorLog);
            strAFLogger = AFa1uSDK.AFLogger(this.afErrorLog);
            int i11 = 62 / 0;
            if (objRegisterClient == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            AFa1uSDK aFa1uSDK2 = AFa1uSDK.INSTANCE;
            objRegisterClient = AFa1uSDK.registerClient(this.afErrorLog);
            strAFLogger = AFa1uSDK.AFLogger(this.afErrorLog);
            if (objRegisterClient == null) {
                return;
            }
        }
        if (strAFLogger != null) {
            int i12 = AppsFlyerLib + 55;
            getLevel = i12 % 128;
            if (i12 % 2 == 0) {
                Integer.parseInt(strAFLogger);
                throw null;
            }
            if (Integer.parseInt(strAFLogger) > 0) {
                map.put("reinstallCounter", strAFLogger);
                map.put("originalAppsflyerId", objRegisterClient);
            }
        }
    }

    private void values(@NotNull Map<String, Object> map) {
        int i10 = getLevel + 91;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFKeystoreWrapper());
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.putAll(this.afInfoLog.AFKeystoreWrapper());
            int i11 = 55 / 0;
        }
    }

    @Nullable
    private String w() {
        String string = this.afErrorLog.getString("preInstallName");
        if (string != null) {
            AppsFlyerLib = (getLevel + 67) % 128;
            return string;
        }
        String strD = this.f5378e.d("preInstallName");
        if (strD != null) {
            this.afErrorLog.set("preInstallName", strD);
            getLevel = (AppsFlyerLib + 23) % 128;
            return strD;
        }
        String strAfWarnLog = afWarnLog();
        if (strAfWarnLog == null) {
            int i10 = getLevel + 15;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                strAfWarnLog = registerClient("AF_PRE_INSTALL_NAME");
                int i11 = 42 / 0;
            } else {
                strAfWarnLog = registerClient("AF_PRE_INSTALL_NAME");
            }
        }
        if (strAfWarnLog != null) {
            this.f5378e.d("preInstallName", strAfWarnLog);
            this.afErrorLog.set("preInstallName", strAfWarnLog);
            getLevel = (AppsFlyerLib + 115) % 128;
        }
        return strAfWarnLog;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFLogger(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        AFi1ySDK aFi1ySDK = this.force.f5429d;
        AFi1xSDK aFi1xSDKUnregisterClient = aFi1ySDK != null ? aFi1ySDK.unregisterClient() : null;
        if (aFi1xSDKUnregisterClient != null) {
            map.put("network", aFi1xSDKUnregisterClient.unregisterClient);
            map.put("ivc", Boolean.valueOf(aFi1xSDKUnregisterClient.f5430d));
            if (this.AFLoggerLogLevel.afErrorLog) {
                return;
            }
            String str = aFi1xSDKUnregisterClient.registerClient;
            if (str != null) {
                map.put("operator", str);
            }
            String str2 = aFi1xSDKUnregisterClient.AFKeystoreWrapper;
            if (str2 == null) {
                getLevel = (AppsFlyerLib + 53) % 128;
                return;
            }
            int i10 = getLevel + 33;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("carrier", str2);
            } else {
                map.put("carrier", str2);
                int i11 = 22 / 0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x004c  */
    /* JADX WARN: Code duplicated, block: B:12:0x005b  */
    /* JADX WARN: Code duplicated, block: B:7:0x003d  */
    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    @Override // com.appsflyer.internal.AFg1rSDK
    public final void registerClient(@NotNull AFh1pSDK aFh1pSDK) {
        int i10;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.f5399d;
        boolean z10 = false;
        if (aFh1pSDK.f5402v == null) {
            int i11 = (getLevel + 105) % 128;
            AppsFlyerLib = i11;
            if (aFh1pSDK.f5403w == null) {
                getLevel = (i11 + 113) % 128;
                unregisterClient(new Object[]{this, aFh1pSDK, this.AFLoggerLogLevel.f5250v}, -2092575724, 2092575725, System.identityHashCode(this));
                AppsFlyerLib = (getLevel + 41) % 128;
            } else if (!(aFh1pSDK instanceof AFh1eSDK)) {
                i10 = getLevel + 1;
                AppsFlyerLib = i10 % 128;
                if (i10 % 2 != 0) {
                    Intrinsics.checkNotNull(map);
                    String str = aFh1pSDK.f5402v;
                    Intrinsics.checkNotNullExpressionValue(str, "");
                    AFKeystoreWrapper(map, str);
                    int i12 = 40 / 0;
                } else {
                    Intrinsics.checkNotNull(map);
                    String str2 = aFh1pSDK.f5402v;
                    Intrinsics.checkNotNullExpressionValue(str2, "");
                    AFKeystoreWrapper(map, str2);
                }
            }
        } else if (!(aFh1pSDK instanceof AFh1eSDK)) {
            i10 = getLevel + 1;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNull(map);
                String str3 = aFh1pSDK.f5402v;
                Intrinsics.checkNotNullExpressionValue(str3, "");
                AFKeystoreWrapper(map, str3);
                int i13 = 40 / 0;
            } else {
                Intrinsics.checkNotNull(map);
                String str4 = aFh1pSDK.f5402v;
                Intrinsics.checkNotNullExpressionValue(str4, "");
                AFKeystoreWrapper(map, str4);
            }
        }
        AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.LAUNCH;
        if (CollectionsKt.W(kotlin.collections.p.n(aFd1bSDK, aFd1bSDK2, AFd1bSDK.INAPP), aFh1pSDK.AFKeystoreWrapper())) {
            int i14 = AppsFlyerLib + 1;
            getLevel = i14 % 128;
            if (i14 % 2 == 0) {
                Intrinsics.checkNotNull(map);
                unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
                throw null;
            }
            Intrinsics.checkNotNull(map);
            unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
        }
        if (CollectionsKt.W(kotlin.collections.p.n(aFd1bSDK, aFd1bSDK2, AFd1bSDK.ATTR), aFh1pSDK.AFKeystoreWrapper())) {
            Intrinsics.checkNotNull(map);
            unregisterClient(new Object[]{this, map}, 1429136643, -1429136643, System.identityHashCode(this));
        }
        Intrinsics.checkNotNull(map);
        setOaidData(map);
        valueOf(map);
        values(map);
        AFKeystoreWrapper(map);
        if (aFh1pSDK.f5402v == null && aFh1pSDK.f5403w == null) {
            z10 = true;
        }
        AFKeystoreWrapper(map, z10);
        onPause(map);
        getInstance(map);
        AFLogger(map, aFh1pSDK);
        map.put("af_events_api", "1");
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map) {
        Intrinsics.checkNotNullParameter(map, "");
        String str = this.AFLoggerLogLevel.AFLogger;
        if (str != null) {
            map.put("email_hashed", str);
            getLevel = (AppsFlyerLib + 27) % 128;
        }
        String str2 = this.AFLoggerLogLevel.f5247d;
        if (str2 != null) {
            map.put("phone_number_hashed", str2);
        }
        String str3 = this.AFLoggerLogLevel.registerClient;
        if (str3 != null) {
            map.put("phone_number_e164_hashed", str3);
            getLevel = (AppsFlyerLib + 45) % 128;
        }
        String str4 = this.AFLoggerLogLevel.AFKeystoreWrapper;
        if (str4 != null) {
            getLevel = (AppsFlyerLib + 53) % 128;
            map.put("first_name_hashed", str4);
        }
        String str5 = this.AFLoggerLogLevel.f5248e;
        if (str5 != null) {
            int i10 = AppsFlyerLib + 99;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                map.put("last_name_hashed", str5);
                int i11 = 21 / 0;
            } else {
                map.put("last_name_hashed", str5);
            }
        }
        Long l10 = this.AFLoggerLogLevel.f5249i;
        if (l10 != null) {
            map.put("fb_login_id", Long.valueOf(l10.longValue()));
        }
    }

    private static void a(int i10, char c10, int i11, Object[] objArr) {
        AFk1qSDK aFk1qSDK = new AFk1qSDK();
        long[] jArr = new long[i11];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i12 = aFk1qSDK.unregisterClient;
            if (i12 >= i11) {
                break;
            }
            $11 = ($10 + 5) % 128;
            jArr[i12] = (((long) ((char) (((long) valueOf[i10 + i12]) ^ 7057235384081779850L))) ^ (((long) i12) * (7057235384081779850L ^ getEntries))) ^ ((long) c10);
            aFk1qSDK.unregisterClient = i12 + 1;
        }
        char[] cArr = new char[i11];
        aFk1qSDK.unregisterClient = 0;
        while (true) {
            int i13 = aFk1qSDK.unregisterClient;
            if (i13 >= i11) {
                String str = new String(cArr);
                $11 = ($10 + 45) % 128;
                objArr[0] = str;
                return;
            } else {
                cArr[i13] = (char) jArr[i13];
                aFk1qSDK.unregisterClient = i13 + 1;
                $11 = ($10 + 115) % 128;
            }
        }
    }

    private void afDebugLog(@NotNull Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, -1009892585, 1009892590, System.identityHashCode(this));
    }

    private final void afInfoLog(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 884869374, -884869365, System.identityHashCode(this));
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0029  */
    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK) {
        boolean z10;
        int i10 = getLevel + 95;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            Map<String, Object> map = aFh1pSDK.f5399d;
            Intrinsics.checkNotNull(map);
            if (aFh1pSDK.f5402v == null) {
                getLevel = (AppsFlyerLib + 99) % 128;
                if (aFh1pSDK.f5403w == null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            d(map, z10);
            AFLoggerLogLevel(map);
            stop(map);
            AFLogger(map);
            registerClient(map, this.AFLoggerLogLevel.force);
            getSdkVersion(map);
            map.put("cell", kotlin.collections.k0.m(jt.s.a("mcc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mcc)), jt.s.a("mnc", Integer.valueOf(this.AFLogger.getResources().getConfiguration().mnc))));
            map.put("sig", d());
            map.put("last_boot_time", Long.valueOf(AFKeystoreWrapper()));
            map.put("disk", (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis()));
            AppsFlyerLib = (getLevel + 121) % 128;
            return;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNull(aFh1pSDK.f5399d);
        throw null;
    }

    private final void afErrorLog(Map<String, Object> map) {
        getLevel = (AppsFlyerLib + 111) % 128;
        map.put("batteryLevel", String.valueOf(this.unregisterClient.registerClient(this.AFLogger).unregisterClient));
        int i10 = AppsFlyerLib + 47;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    private final String afWarnLog() {
        File fileAFKeystoreWrapper = AFKeystoreWrapper(AFLogger("ro.appsflyer.preinstall.path"));
        if (AFLogger(fileAFKeystoreWrapper)) {
            fileAFKeystoreWrapper = AFKeystoreWrapper(registerClient("AF_PRE_INSTALL_PATH"));
            getLevel = (AppsFlyerLib + 111) % 128;
        }
        if (AFLogger(fileAFKeystoreWrapper)) {
            fileAFKeystoreWrapper = AFKeystoreWrapper("/data/local/tmp/pre_install.appsflyer");
        }
        if (AFLogger(fileAFKeystoreWrapper)) {
            fileAFKeystoreWrapper = AFKeystoreWrapper("/etc/pre_install.appsflyer");
        }
        if (AFLogger(fileAFKeystoreWrapper)) {
            AppsFlyerLib = (getLevel + 49) % 128;
            return null;
        }
        String packageName = this.AFLogger.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "");
        return (String) unregisterClient(new Object[]{fileAFKeystoreWrapper, packageName}, 238881636, -238881626, (int) System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SimpleDateFormat AFLoggerLogLevel() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd_HHmmssZ", Locale.US);
        int i10 = getLevel + R.styleable.AppCompatTheme_windowMinWidthMinor;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            return simpleDateFormat;
        }
        throw null;
    }

    private static /* synthetic */ Object v(Object[] objArr) {
        String str;
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = getLevel + 71;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            AFg1wSDK.AFa1vSDK aFa1vSDKRegisterClient = aFg1oSDK.unregisterClient.registerClient(aFg1oSDK.AFLogger);
            float f10 = aFa1vSDKRegisterClient.unregisterClient;
            str = aFa1vSDKRegisterClient.AFLogger;
            map.put("btl", String.valueOf(f10));
            int i11 = 14 / 0;
            if (str == null) {
                return null;
            }
        } else {
            AFg1wSDK.AFa1vSDK aFa1vSDKRegisterClient2 = aFg1oSDK.unregisterClient.registerClient(aFg1oSDK.AFLogger);
            float f11 = aFa1vSDKRegisterClient2.unregisterClient;
            String str2 = aFa1vSDKRegisterClient2.AFLogger;
            map.put("btl", String.valueOf(f11));
            if (str2 == null) {
                return null;
            }
            str = str2;
        }
        map.put("btch", str);
        AppsFlyerLib = (getLevel + 19) % 128;
        return null;
    }

    @Nullable
    private String e() {
        int i10 = getLevel + 29;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            String strRegisterClient = this.AFLoggerLogLevel.getLevel;
            if (strRegisterClient == null) {
                strRegisterClient = registerClient("AF_STORE");
            }
            int i11 = AppsFlyerLib + 41;
            getLevel = i11 % 128;
            if (i11 % 2 == 0) {
                int i12 = 85 / 0;
            }
            return strRegisterClient;
        }
        String str = this.AFLoggerLogLevel.getLevel;
        throw null;
    }

    private final void w(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 1429136643, -1429136643, System.identityHashCode(this));
    }

    private boolean i() {
        int i10 = getLevel + 93;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            return Boolean.parseBoolean(this.f5378e.d("sentSuccessfully"));
        }
        Boolean.parseBoolean(this.f5378e.d("sentSuccessfully"));
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x013f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private static /* synthetic */ Object e(Object[] objArr) throws Throwable {
        Throwable th2;
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        Throwable th3;
        File file = (File) objArr[0];
        String str = (String) objArr[1];
        if (file == null) {
            int i10 = getLevel + 67;
            AppsFlyerLib = i10 % 128;
            if (i10 % 2 == 0) {
                return null;
            }
            throw null;
        }
        try {
            Properties properties = new Properties();
            inputStreamReader2 = new InputStreamReader(new FileInputStream(file), Charset.defaultCharset());
            try {
                properties.load(inputStreamReader2);
                AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.PREINSTALL, "Preinstall configuration file found and loaded successfully", false, 4, null);
                String property = properties.getProperty(str);
                try {
                    inputStreamReader2.close();
                    return property;
                } catch (Throwable th4) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.PREINSTALL;
                    String message = th4.getMessage();
                    AFLoggerBase.e$default(aFLogger, logTag, "Error closing preinstall configuration file reader: " + (message != null ? message : "unknown error"), th4, false, false, false, false, 120, null);
                    return property;
                }
            } catch (FileNotFoundException unused) {
                try {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.PREINSTALL, "Preinstall configuration file not found at path: " + file.getAbsolutePath(), false, 4, null);
                    if (inputStreamReader2 != null) {
                        try {
                            inputStreamReader2.close();
                        } catch (Throwable th5) {
                            AFLogger aFLogger2 = AFLogger.INSTANCE;
                            LogTag logTag2 = LogTag.PREINSTALL;
                            String message2 = th5.getMessage();
                            AFLoggerBase.e$default(aFLogger2, logTag2, "Error closing preinstall configuration file reader: " + (message2 != null ? message2 : "unknown error"), th5, false, false, false, false, 120, null);
                        }
                    }
                    return null;
                } catch (Throwable th6) {
                    th3 = th6;
                    inputStreamReader = inputStreamReader2;
                    if (inputStreamReader == null) {
                        AppsFlyerLib = (getLevel + 75) % 128;
                        throw th3;
                    }
                    try {
                        inputStreamReader.close();
                        throw th3;
                    } catch (Throwable th7) {
                        AFLogger aFLogger3 = AFLogger.INSTANCE;
                        LogTag logTag3 = LogTag.PREINSTALL;
                        String message3 = th7.getMessage();
                        AFLoggerBase.e$default(aFLogger3, logTag3, "Error closing preinstall configuration file reader: " + (message3 != null ? message3 : "unknown error"), th7, false, false, false, false, 120, null);
                        throw th3;
                    }
                }
            } catch (Throwable th8) {
                th2 = th8;
                inputStreamReader = inputStreamReader2;
                try {
                    AFLogger aFLogger4 = AFLogger.INSTANCE;
                    LogTag logTag4 = LogTag.PREINSTALL;
                    String message4 = th2.getMessage();
                    if (message4 == null) {
                        message4 = "unknown error";
                    }
                    AFLoggerBase.e$default(aFLogger4, logTag4, "Error reading preinstall configuration file: " + message4, th2, false, false, false, false, 120, null);
                    if (inputStreamReader != null) {
                        int i11 = getLevel + 123;
                        AppsFlyerLib = i11 % 128;
                        try {
                            if (i11 % 2 != 0) {
                                inputStreamReader.close();
                                int i12 = 60 / 0;
                            } else {
                                inputStreamReader.close();
                            }
                        } catch (Throwable th9) {
                            AFLogger aFLogger5 = AFLogger.INSTANCE;
                            LogTag logTag5 = LogTag.PREINSTALL;
                            String message5 = th9.getMessage();
                            AFLoggerBase.e$default(aFLogger5, logTag5, "Error closing preinstall configuration file reader: " + (message5 != null ? message5 : "unknown error"), th9, false, false, false, false, 120, null);
                        }
                    }
                    return null;
                } catch (Throwable th10) {
                    th3 = th10;
                    if (inputStreamReader == null) {
                        AppsFlyerLib = (getLevel + 75) % 128;
                        throw th3;
                    }
                    inputStreamReader.close();
                    throw th3;
                }
            }
        } catch (FileNotFoundException unused2) {
            inputStreamReader2 = null;
        } catch (Throwable th11) {
            th2 = th11;
            inputStreamReader = null;
        }
    }

    private final SimpleDateFormat AFLogger() {
        int i10 = getLevel + 121;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) this.afDebugLog.getValue();
        AppsFlyerLib = (getLevel + 51) % 128;
        return simpleDateFormat;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0025 A[PHI: r0
      0x0025: PHI (r0v5 java.lang.Object) = (r0v4 java.lang.Object), (r0v21 java.lang.Object) binds: [B:8:0x0023, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.appsflyer.internal.AFg1rSDK
    public final void d(@NotNull Map<String, Object> map) {
        Object obj;
        Object obj2;
        int i10 = AppsFlyerLib + 77;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            obj = this.AFLoggerLogLevel.values;
            int i11 = 25 / 0;
            if (obj != null) {
                map.put("appid", obj);
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            obj = this.AFLoggerLogLevel.values;
            if (obj != null) {
                map.put("appid", obj);
            }
        }
        String str = this.AFLoggerLogLevel.stop;
        if (str != null) {
            if (str.length() != 3) {
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.GENERAL;
                StringBuilder sb2 = new StringBuilder("WARNING: currency code should be 3 characters!!! '");
                sb2.append(str);
                sb2.append("' is not a legal value.");
                String string = sb2.toString();
                Intrinsics.checkNotNullExpressionValue(string, "");
                AFLoggerBase.w$default(aFLogger, logTag, string, false, 4, null);
            }
            map.put("currency", str);
        }
        map.put("isUpdate", Boolean.valueOf(this.AFLoggerLogLevel.getEntries));
        Object obj3 = this.AFLoggerLogLevel.getSdkVersion;
        if (obj3 != null) {
            map.put("customData", obj3);
        }
        Object obj4 = this.AFLoggerLogLevel.valueOf;
        if (obj4 != null) {
            int i12 = AppsFlyerLib + 65;
            getLevel = i12 % 128;
            if (i12 % 2 != 0) {
                map.put("appUserId", obj4);
            } else {
                map.put("appUserId", obj4);
                throw null;
            }
        }
        AFb1rSDK aFb1rSDK = this.AFLoggerLogLevel.f5251w;
        if (aFb1rSDK != null) {
            int i13 = getLevel + 47;
            AppsFlyerLib = i13 % 128;
            if (i13 % 2 != 0) {
                obj2 = aFb1rSDK.AFKeystoreWrapper;
                int i14 = 69 / 0;
                if (obj2 == null) {
                    return;
                }
            } else {
                obj2 = aFb1rSDK.AFKeystoreWrapper;
                if (obj2 == null) {
                    return;
                }
            }
            map.put("sharing_filter", obj2);
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFLogger(@NotNull AFh1pSDK aFh1pSDK) {
        getLevel = (AppsFlyerLib + 43) % 128;
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map, "");
        v(map);
        Map<String, Object> map2 = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map2, "");
        unregisterClient(map2, aFh1pSDK.afWarnLog);
        Map<String, Object> map3 = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map3, "");
        getLevel(map3);
        Map<String, Object> map4 = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        enableTCFDataCollection(map4);
        Map<String, Object> map5 = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map5, "");
        setImeiData(map5);
        Map<String, Object> map6 = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map6, "");
        AFe1zSDK aFe1zSDKAFKeystoreWrapper = aFh1pSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFe1zSDKAFKeystoreWrapper, "");
        unregisterClient(map6, aFe1zSDKAFKeystoreWrapper);
        int i10 = getLevel + 63;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
    }

    @NotNull
    private static String v() {
        return (String) unregisterClient(new Object[0], -137455512, 137455519, (int) System.currentTimeMillis());
    }

    public static /* synthetic */ Object unregisterClient(Object[] objArr, int i10, int i11, int i12) {
        long seconds;
        int i13 = ~i12;
        int i14 = ~i10;
        int i15 = ~i11;
        switch ((i10 * (-661)) + (i11 * (-661)) + ((i13 | (~(i14 | i15))) * 1324) + (((~(i12 | i11)) | (~(i10 | i12))) * (-1324)) + (((~(i10 | i15)) | (~(i11 | i14))) * 662)) {
            case 1:
                return unregisterClient(objArr);
            case 2:
                return d(objArr);
            case 3:
                return registerClient(objArr);
            case 4:
                AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
                Map map = (Map) objArr[1];
                getLevel = (AppsFlyerLib + 5) % 128;
                Intrinsics.checkNotNullParameter(map, "");
                long jUnregisterClient = aFg1oSDK.f5378e.unregisterClient("AppsFlyerTimePassedSincePrevLaunch", 0L);
                long jCurrentTimeMillis = System.currentTimeMillis();
                aFg1oSDK.f5378e.AFLogger("AppsFlyerTimePassedSincePrevLaunch", jCurrentTimeMillis);
                if (jUnregisterClient > 0) {
                    seconds = TimeUnit.MILLISECONDS.toSeconds(jCurrentTimeMillis - jUnregisterClient);
                    AppsFlyerLib = (getLevel + 1) % 128;
                } else {
                    AppsFlyerLib = (getLevel + 97) % 128;
                    seconds = -1;
                }
                map.put("timepassedsincelastlaunch", String.valueOf(seconds));
                return null;
            case 5:
                return AFLogger(objArr);
            case 6:
                return force(objArr);
            case 7:
                StatFs statFs = new StatFs(Environment.getDataDirectory().getAbsolutePath());
                long blockSizeLong = statFs.getBlockSizeLong();
                long availableBlocksLong = statFs.getAvailableBlocksLong() * blockSizeLong;
                long blockCountLong = statFs.getBlockCountLong() * blockSizeLong;
                double dPow = Math.pow(2.0d, 20.0d);
                String str = ((long) (availableBlocksLong / dPow)) + "/" + ((long) (blockCountLong / dPow));
                getLevel = (AppsFlyerLib + 47) % 128;
                return str;
            case 8:
                return v(objArr);
            case 9:
                AFg1oSDK aFg1oSDK2 = (AFg1oSDK) objArr[0];
                Map map2 = (Map) objArr[1];
                getLevel = (AppsFlyerLib + 75) % 128;
                if (AFg1iSDK.registerClient(aFg1oSDK2.AFLogger)) {
                    map2.put("inst_app", Boolean.TRUE);
                    getLevel = (AppsFlyerLib + 39) % 128;
                }
                return null;
            case 10:
                return e(objArr);
            case 11:
                AppsFlyerLib = (getLevel + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
                List listN = kotlin.collections.p.n(AFd1bSDK.CONVERSION, AFd1bSDK.LAUNCH, AFd1bSDK.INAPP, AFd1bSDK.MANUAL_PURCHASE_VALIDATION, AFd1bSDK.ARS_VALIDATE, AFd1bSDK.PURCHASE_VALIDATE, AFd1bSDK.ADREVENUE);
                AppsFlyerLib = (getLevel + 67) % 128;
                return listN;
            default:
                return AFKeystoreWrapper(objArr);
        }
    }

    private static long AFKeystoreWrapper() {
        int i10 = getLevel + 99;
        AppsFlyerLib = i10 % 128;
        int i11 = i10 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
        getLevel = (AppsFlyerLib + 23) % 128;
        return jCurrentTimeMillis;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, boolean z10) {
        int i10 = AppsFlyerLib + 47;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.f5377d.unregisterClient());
            int i11 = 65 / 0;
            if (!z10) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("platformextension", this.f5377d.unregisterClient());
            if (!z10) {
                return;
            }
        }
        map.put("platform_extension_v2", this.f5377d.AFLogger());
        getLevel = (AppsFlyerLib + 109) % 128;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void registerClient(@NotNull Map<String, Object> map) {
        Object objB;
        AFLogger aFLogger;
        LogTag logTag;
        int i10;
        Object obj;
        String str;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(map, "");
        String str2 = this.AFLoggerLogLevel.unregisterClient;
        if (str2 != null) {
            int i11 = getLevel + 43;
            AppsFlyerLib = i11 % 128;
            if (i11 % 2 == 0) {
                if (map.get("af_deeplink") != null) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GENERAL, "Skipping push payload processing: deeplink already extracted from intent", false, 4, null);
                } else {
                    try {
                        jt.n.Companion companion = jt.n.INSTANCE;
                        JSONObject jSONObject = new JSONObject(str2);
                        jSONObject.put("isPush", "true");
                        map.put("af_deeplink", jSONObject.toString());
                        objB = jt.n.b(Unit.f22483a);
                    } catch (Throwable th2) {
                        jt.n.Companion companion2 = jt.n.INSTANCE;
                        objB = jt.n.b(jt.o.a(th2));
                    }
                    Throwable thE = jt.n.e(objB);
                    if (thE != null) {
                        int i12 = AppsFlyerLib + 17;
                        getLevel = i12 % 128;
                        if (i12 % 2 == 0) {
                            aFLogger = AFLogger.INSTANCE;
                            logTag = LogTag.GENERAL;
                            i10 = 27;
                            obj = null;
                            str = "Exception while trying to create JSONObject from pushPayload";
                            z10 = true;
                            z11 = false;
                            z12 = false;
                            z13 = true;
                        } else {
                            aFLogger = AFLogger.INSTANCE;
                            logTag = LogTag.GENERAL;
                            i10 = 120;
                            obj = null;
                            str = "Exception while trying to create JSONObject from pushPayload";
                            z10 = false;
                            z11 = false;
                            z12 = false;
                            z13 = false;
                        }
                        AFLoggerBase.e$default(aFLogger, logTag, str, thE, z10, z11, z12, z13, i10, obj);
                    }
                    jt.n.a(objB);
                }
            } else {
                map.get("af_deeplink");
                throw null;
            }
        } else {
            getLevel = (AppsFlyerLib + 87) % 128;
        }
        this.AFLoggerLogLevel.unregisterClient = null;
    }

    @NotNull
    private String AFLogger(@NotNull SimpleDateFormat simpleDateFormat, int i10) {
        int i11 = AppsFlyerLib + 91;
        getLevel = i11 % 128;
        String str = "";
        if (i11 % 2 != 0) {
            Intrinsics.checkNotNullParameter(simpleDateFormat, "");
            String strD = this.f5378e.d("appsFlyerFirstInstall");
            if (strD == null || strD.length() == 0) {
                if (i10 <= 1) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.SDK_LIFECYCLE, "First app launch detected, recording install timestamp", false, 4, null);
                    str = simpleDateFormat.format(new Date());
                    getLevel = (AppsFlyerLib + 29) % 128;
                } else {
                    AppsFlyerLib = (getLevel + 103) % 128;
                }
                this.f5378e.d("appsFlyerFirstInstall", str);
                strD = str;
            }
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.GENERAL, "AppsFlyer: first launch date: " + strD, false, 4, null);
            Intrinsics.checkNotNull(strD);
            return strD;
        }
        Intrinsics.checkNotNullParameter(simpleDateFormat, "");
        this.f5378e.d("appsFlyerFirstInstall");
        throw null;
    }

    @Nullable
    private String force() {
        String strD = this.f5378e.d("INSTALL_STORE");
        if (strD != null) {
            getLevel = (AppsFlyerLib + 27) % 128;
            return strD;
        }
        String strE = e();
        if (strE != null) {
            int i10 = AppsFlyerLib + 123;
            getLevel = i10 % 128;
            if (i10 % 2 == 0) {
                this.f5378e.d("INSTALL_STORE", strE);
                int i11 = 97 / 0;
                return strE;
            }
            this.f5378e.d("INSTALL_STORE", strE);
        }
        return strE;
    }

    private void AFKeystoreWrapper(@NotNull Map<String, Object> map, @NotNull String str) {
        int i10 = AppsFlyerLib + 13;
        getLevel = i10 % 128;
        try {
            if (i10 % 2 != 0) {
                Intrinsics.checkNotNullParameter(map, "");
                Intrinsics.checkNotNullParameter(str, "");
                String strD = this.f5378e.d("prev_event_name");
                if (strD != null) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("prev_event_timestamp", this.f5378e.unregisterClient("prev_event_timestamp", -1L));
                    jSONObject.put("prev_event_name", strD);
                    map.put("prev_event", jSONObject);
                    AppsFlyerLib = (getLevel + 31) % 128;
                }
                this.f5378e.d("prev_event_name", str);
                this.f5378e.AFLogger("prev_event_timestamp", System.currentTimeMillis());
                return;
            }
            Intrinsics.checkNotNullParameter(map, "");
            Intrinsics.checkNotNullParameter(str, "");
            this.f5378e.d("prev_event_name");
            throw null;
        } catch (Exception e10) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.GENERAL, "Failed to save previous event metadata to preferences", e10, false, false, false, false, 120, null);
        }
    }

    private final void force(Map<String, Object> map) {
        unregisterClient(new Object[]{this, map}, 1798824484, -1798824476, System.identityHashCode(this));
    }

    private static /* synthetic */ Object AFLogger(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        Map map = (Map) objArr[1];
        int i10 = getLevel + 49;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 == 0) {
            Intrinsics.checkNotNullParameter(map, "");
            map.put("is_pc", Boolean.valueOf(aFg1oSDK.AFLogger.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
            return null;
        }
        Intrinsics.checkNotNullParameter(map, "");
        map.put("is_pc", Boolean.valueOf(aFg1oSDK.AFLogger.getApplicationContext().getPackageManager().hasSystemFeature("com.google.android.play.feature.HPE_EXPERIENCE")));
        throw null;
    }

    private void registerClient(@NotNull Map<String, Object> map, @Nullable String str) {
        Intrinsics.checkNotNullParameter(map, "");
        AFc1eSDK aFc1eSDK = this.AFLoggerLogLevel;
        if (aFc1eSDK.afInfoLog) {
            int i10 = AppsFlyerLib + 7;
            getLevel = i10 % 128;
            if (i10 % 2 != 0) {
                map.put("deviceTrackingDisabled", "true");
                return;
            } else {
                map.put("deviceTrackingDisabled", "true");
                int i11 = 41 / 0;
                return;
            }
        }
        String str2 = aFc1eSDK.AFLoggerLogLevel;
        if (str2 != null && str2.length() != 0) {
            AppsFlyerLib = (getLevel + 39) % 128;
            map.put("imei", str2);
        }
        String strD = d(str);
        if (strD != null) {
            AppsFlyerLib = (getLevel + 47) % 128;
            this.f5378e.d("androidIdCached", strD);
            map.put("android_id", strD);
        } else {
            AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.ADVERTISING_ID, "Android ID collection skipped: not available or not permitted", false, 4, null);
        }
        AFb1lSDK aFb1lSDKUnregisterClient = AFb1iSDK.unregisterClient(this.AFLogger);
        if (aFb1lSDKUnregisterClient != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("isManual", aFb1lSDKUnregisterClient.unregisterClient);
            linkedHashMap.put("val", aFb1lSDKUnregisterClient.f5235d);
            Boolean bool = aFb1lSDKUnregisterClient.AFLogger;
            if (bool != null) {
                int i12 = AppsFlyerLib + 103;
                getLevel = i12 % 128;
                if (i12 % 2 != 0) {
                    linkedHashMap.put("isLat", bool);
                } else {
                    linkedHashMap.put("isLat", bool);
                    throw null;
                }
            }
            map.put("oaid", linkedHashMap);
            int i13 = AppsFlyerLib + 43;
            getLevel = i13 % 128;
            if (i13 % 2 == 0) {
                throw null;
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void AFKeystoreWrapper(@NotNull Map<String, Object> map) {
        String strAFLogger;
        int i10 = getLevel + 83;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = AFb1jSDK.AFLogger(this.f5379i.AFKeystoreWrapper);
            int i11 = 2 / 0;
            if (strAFLogger == null) {
                return;
            }
        } else {
            Intrinsics.checkNotNullParameter(map, "");
            strAFLogger = AFb1jSDK.AFLogger(this.f5379i.AFKeystoreWrapper);
            if (strAFLogger == null) {
                return;
            }
        }
        map.put("uid", strAFLogger);
        if (this.f5379i.AFKeystoreWrapper.AFKeystoreWrapper("CUSTOM_INSTALL_ID_APPLIED")) {
            map.put("custom_install_id", Boolean.TRUE);
            getLevel = (AppsFlyerLib + 119) % 128;
        }
    }

    @Nullable
    private String d() throws PackageManager.NameNotFoundException, NoSuchAlgorithmException, CertificateException {
        int i10 = AppsFlyerLib + 55;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            PackageManager packageManager = this.AFLogger.getApplicationContext().getPackageManager();
            Intrinsics.checkNotNullExpressionValue(packageManager, "");
            String packageName = this.AFLogger.getApplicationContext().getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "");
            return AndroidExtensionsKt.signature(packageManager, packageName);
        }
        PackageManager packageManager2 = this.AFLogger.getApplicationContext().getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager2, "");
        String packageName2 = this.AFLogger.getApplicationContext().getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName2, "");
        AndroidExtensionsKt.signature(packageManager2, packageName2);
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0041  */
    /* JADX WARN: Code duplicated, block: B:22:0x0047 A[DONT_INVERT] */
    private final String d(String str) {
        int i10 = AppsFlyerLib + 49;
        int i11 = i10 % 128;
        getLevel = i11;
        if (i10 % 2 != 0) {
            if (this.AFLoggerLogLevel.afWarnLog) {
                if (str != null) {
                    int i12 = i11 + 39;
                    AppsFlyerLib = i12 % 128;
                    if (i12 % 2 == 0) {
                        if (str.length() != 0) {
                            if (str == null) {
                                str = null;
                            }
                        }
                    } else {
                        str.length();
                        throw null;
                    }
                }
                int i13 = AppsFlyerLib + 79;
                getLevel = i13 % 128;
                if (i13 % 2 != 0) {
                    if (afInfoLog()) {
                        str = afErrorLog();
                    } else {
                        str = null;
                    }
                } else {
                    afInfoLog();
                    throw null;
                }
            } else if (str == null) {
                str = null;
            }
            AppsFlyerLib = (getLevel + 103) % 128;
            return str;
        }
        boolean z10 = this.AFLoggerLogLevel.afWarnLog;
        throw null;
    }

    private final void unregisterClient(Map<String, Object> map, int i10) {
        String string;
        Integer intOrNull;
        getLevel = (AppsFlyerLib + 17) % 128;
        try {
            if (this.f5379i.r_().versionCode > this.f5378e.AFLogger("versionCode", 0)) {
                this.f5378e.d("versionCode", this.f5379i.r_().versionCode);
            }
            map.put("app_version_code", String.valueOf(this.f5379i.r_().versionCode));
            map.put("app_version_name", this.f5379i.r_().versionName);
            map.put("targetSDKver", Integer.valueOf(this.f5379i.f5258d.f5305d.getApplicationInfo().targetSdkVersion));
            map.put("date1", AFLogger().format(new Date(registerClient().longValue())));
            map.put("date2", AFLogger().format(new Date(this.f5379i.r_().lastUpdateTime)));
            Object obj = map.get("counter");
            if (obj == null || (string = obj.toString()) == null || (intOrNull = StringsKt.toIntOrNull(string)) == null) {
                AppsFlyerLib = (getLevel + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
            } else {
                int i11 = getLevel + 9;
                AppsFlyerLib = i11 % 128;
                if (i11 % 2 != 0) {
                    i10 = intOrNull.intValue();
                    int i12 = 25 / 0;
                } else {
                    i10 = intOrNull.intValue();
                }
                getLevel = (AppsFlyerLib + 33) % 128;
            }
            Object[] objArr = new Object[1];
            a(Color.rgb(0, 0, 0) + Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 15023), (ViewConfiguration.getEdgeSlop() >> 16) + 15, objArr);
            String strIntern = ((String) objArr[0]).intern();
            SimpleDateFormat simpleDateFormatAFLogger = AFLogger();
            Intrinsics.checkNotNullExpressionValue(simpleDateFormatAFLogger, "");
            map.put(strIntern, AFLogger(simpleDateFormatAFLogger, i10));
        } catch (Throwable th2) {
            AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.DEVICE_DATA, "Failed to collect app version and update date information", th2, false, true, false, false, 104, null);
        }
    }

    @SuppressLint({"PrivateApi"})
    @Nullable
    private static String AFLogger(@Nullable String str) {
        getLevel = (AppsFlyerLib + 69) % 128;
        try {
            Object objInvoke = Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
            Intrinsics.d(objInvoke, "");
            return (String) objInvoke;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.DEVICE_DATA;
            String message = th2.getMessage();
            if (message == null) {
                AppsFlyerLib = (getLevel + 113) % 128;
                message = "Failed to retrieve system property via reflection";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th2, false, false, false, false, 120, null);
            return null;
        }
    }

    private static File AFKeystoreWrapper(String str) {
        if (str == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 77) % 128;
        try {
            boolean z10 = false;
            if (StringsKt.p1(str).toString().length() > 0) {
                int i10 = AppsFlyerLib;
                int i11 = i10 + 55;
                getLevel = i11 % 128;
                z10 = i11 % 2 != 0;
                getLevel = (i10 + 21) % 128;
            }
            if (z10) {
                return new File(StringsKt.p1(str).toString());
            }
            return null;
        } catch (Throwable th2) {
            AFLogger aFLogger = AFLogger.INSTANCE;
            LogTag logTag = LogTag.PREINSTALL;
            String message = th2.getMessage();
            if (message == null) {
                message = "Failed to create File object from path";
            }
            AFLoggerBase.e$default(aFLogger, logTag, message, th2, false, false, false, false, 120, null);
            return null;
        }
    }

    private static boolean AFLogger(File file) {
        int i10 = AppsFlyerLib + 29;
        int i11 = i10 % 128;
        getLevel = i11;
        if (i10 % 2 == 0) {
            throw null;
        }
        if (file == null) {
            return true;
        }
        int i12 = i11 + 115;
        AppsFlyerLib = i12 % 128;
        if (i12 % 2 == 0) {
            return !file.exists();
        }
        file.exists();
        throw null;
    }

    private static void AFLogger(@NotNull Map<String, Object> map, @NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        String str = aFh1pSDK.f5402v;
        if (str != null) {
            map.put("eventName", str);
            Map map2 = aFh1pSDK.AFKeystoreWrapper;
            if (map2 == null) {
                map2 = new HashMap();
            }
            map.put("eventValue", new JSONObject(map2).toString());
        }
    }

    private static /* synthetic */ Object d(Object[] objArr) {
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map = aFh1pSDK.f5399d;
        Intrinsics.checkNotNull(map);
        map.put("open_referrer", aFh1pSDK.f5400e);
        String str = aFh1pSDK.afInfoLog;
        if (str == null) {
            return null;
        }
        AppsFlyerLib = (getLevel + 35) % 128;
        if (StringsKt.p0(str)) {
            return null;
        }
        int i10 = getLevel + 33;
        AppsFlyerLib = i10 % 128;
        if (i10 % 2 != 0) {
            map.put("af_web_referrer", aFh1pSDK.afInfoLog);
            int i11 = 75 / 0;
            return null;
        }
        map.put("af_web_referrer", aFh1pSDK.afInfoLog);
        return null;
    }

    private void AFKeystoreWrapper(@NotNull AFh1pSDK aFh1pSDK, @Nullable AFb1qSDK aFb1qSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK, aFb1qSDK}, -2092575724, 2092575725, System.identityHashCode(this));
    }

    @NotNull
    private Long registerClient() {
        int i10 = AppsFlyerLib + 15;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return Long.valueOf(this.f5379i.r_().firstInstallTime);
        }
        int i11 = 28 / 0;
        return Long.valueOf(this.f5379i.r_().firstInstallTime);
    }

    private static String d(File file, String str) {
        return (String) unregisterClient(new Object[]{file, str}, 238881636, -238881626, (int) System.currentTimeMillis());
    }

    private static /* synthetic */ Object registerClient(Object[] objArr) {
        AppsFlyerLib = (getLevel + 83) % 128;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = AppsFlyerLib + 45;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            return Long.valueOf(jCurrentTimeMillis);
        }
        throw null;
    }

    private static String registerClient(AFc1kSDK aFc1kSDK, String str) {
        AppsFlyerLib = (getLevel + 81) % 128;
        String strD = aFc1kSDK.d("CACHED_CHANNEL");
        if (strD != null) {
            AppsFlyerLib = (getLevel + 89) % 128;
            return strD;
        }
        aFc1kSDK.d("CACHED_CHANNEL", str);
        int i10 = AppsFlyerLib + 15;
        getLevel = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 34 / 0;
        }
        return str;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK}, 102039780, -102039774, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, int i10, int i11) {
        getLevel = (AppsFlyerLib + 97) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        map.put("counter", String.valueOf(i10));
        map.put("iaecounter", String.valueOf(i11));
        boolean z10 = false;
        if (!i()) {
            int i12 = getLevel + 27;
            AppsFlyerLib = i12 % 128;
            if (i12 % 2 == 0) {
                z10 = true;
            }
        }
        map.put("isFirstCall", String.valueOf(z10));
        getLevel = (AppsFlyerLib + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
    }

    private final String registerClient(String str) {
        AppsFlyerLib = (getLevel + R.styleable.AppCompatTheme_windowMinWidthMinor) % 128;
        String strAFLogger = this.f5379i.AFLogger(str);
        AppsFlyerLib = (getLevel + 69) % 128;
        return strAFLogger;
    }

    private static /* synthetic */ Object unregisterClient(Object[] objArr) {
        AFg1oSDK aFg1oSDK = (AFg1oSDK) objArr[0];
        AFh1pSDK aFh1pSDK = (AFh1pSDK) objArr[1];
        AFb1qSDK aFb1qSDK = (AFb1qSDK) objArr[2];
        int i10 = AppsFlyerLib + 89;
        getLevel = i10 % 128;
        if (i10 % 2 != 0) {
            Intrinsics.checkNotNullParameter(aFh1pSDK, "");
            Map<String, Object> map = aFh1pSDK.f5399d;
            if (aFh1pSDK.AFKeystoreWrapper() == AFd1bSDK.CONVERSION) {
                int i11 = AppsFlyerLib + 9;
                getLevel = i11 % 128;
                if (i11 % 2 != 0) {
                    Intrinsics.checkNotNull(map);
                    aFg1oSDK.afErrorLog(map);
                    aFg1oSDK.afWarnLog(map);
                    unregisterClient(new Object[]{aFg1oSDK, map}, 884869374, -884869365, System.identityHashCode(aFg1oSDK));
                    AFa1uSDK.unregisterClient(aFg1oSDK.afWarnLog, aFg1oSDK.f5379i, aFg1oSDK.afErrorLog);
                } else {
                    Intrinsics.checkNotNull(map);
                    aFg1oSDK.afErrorLog(map);
                    aFg1oSDK.afWarnLog(map);
                    unregisterClient(new Object[]{aFg1oSDK, map}, 884869374, -884869365, System.identityHashCode(aFg1oSDK));
                    AFa1uSDK.unregisterClient(aFg1oSDK.afWarnLog, aFg1oSDK.f5379i, aFg1oSDK.afErrorLog);
                    throw null;
                }
            }
            Intrinsics.checkNotNull(map);
            unregisterClient(new Object[]{aFg1oSDK, map}, 291205159, -291205155, System.identityHashCode(aFg1oSDK));
            aFg1oSDK.i(map);
            aFg1oSDK.e(map);
            aFg1oSDK.getEntries(map);
            if (aFb1qSDK != null) {
                AppsFlyerLib = (getLevel + 109) % 128;
                aFb1qSDK.AFLogger(map);
                getLevel = (AppsFlyerLib + 53) % 128;
            }
            return null;
        }
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Map<String, Object> map2 = aFh1pSDK.f5399d;
        aFh1pSDK.AFKeystoreWrapper();
        AFd1bSDK.Companion companion = AFd1bSDK.INSTANCE;
        throw null;
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull Map<String, Object> map, @NotNull AFe1zSDK aFe1zSDK) {
        getLevel = (AppsFlyerLib + 19) % 128;
        Intrinsics.checkNotNullParameter(map, "");
        Intrinsics.checkNotNullParameter(aFe1zSDK, "");
        if (CollectionsKt.W((List) unregisterClient(new Object[0], 1713251753, -1713251742, (int) System.currentTimeMillis()), aFe1zSDK)) {
            AFc1eSDK aFc1eSDK = this.AFLoggerLogLevel;
            if (aFc1eSDK.setCustomerUserId) {
                map.put("app_set_id", kotlin.collections.j0.g(jt.s.a("app_set_id_disabled", Boolean.TRUE)));
                if (this.AFLoggerLogLevel.setUserEmail != null) {
                    getLevel = (AppsFlyerLib + 59) % 128;
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "App Set Id was collected, but will not be included in the payload.To prevent collection entirely, call disableAppSetId() before initializing the SDK.", false, 4, null);
                    return;
                } else {
                    AFLoggerBase.i$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "App Set ID collection is disabled. Skipping inclusion in the event payload.", false, 4, null);
                    return;
                }
            }
            AFc1rSDK aFc1rSDK = aFc1eSDK.setUserEmail;
            if (aFc1rSDK != null) {
                map.put("app_set_id", kotlin.collections.k0.m(jt.s.a("scope", Integer.valueOf(aFc1rSDK.AFKeystoreWrapper)), jt.s.a("id", aFc1rSDK.unregisterClient)));
            }
        }
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final void unregisterClient(@NotNull AFh1pSDK aFh1pSDK) {
        unregisterClient(new Object[]{this, aFh1pSDK}, 1765853168, -1765853166, System.identityHashCode(this));
    }

    @Override // com.appsflyer.internal.AFg1rSDK
    public final long unregisterClient() {
        return ((Long) unregisterClient(new Object[]{this}, -2087428651, 2087428654, System.identityHashCode(this))).longValue();
    }
}
