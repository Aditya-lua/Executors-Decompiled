package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.AFInAppEventParameterName;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1mSDK extends AFe1kSDK<Map<String, ? extends Object>> {

    @Nullable
    private final AppsFlyerConversionListener AFLoggerLogLevel;

    @NotNull
    private final AFh1xSDK afDebugLog;

    @Nullable
    private String afInfoLog;

    @Nullable
    private Map<String, ? extends Object> afWarnLog;

    @NotNull
    private final AFc1iSDK force;

    /* JADX INFO: renamed from: v */
    @NotNull
    private final AFc1kSDK f7004v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFg1mSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.GCDSDK, new AFe1zSDK[]{AFd1bSDK.RC_CDN}, aFc1bSDK, "GCD-FETCH");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.force = aFc1iSDKAFLogger;
        AFc1kSDK aFc1kSDKAFKeystoreWrapper = aFc1bSDK.AFKeystoreWrapper();
        Intrinsics.checkNotNullExpressionValue(aFc1kSDKAFKeystoreWrapper, "");
        this.f7004v = aFc1kSDKAFKeystoreWrapper;
        AFh1xSDK aFh1xSDKMo8752e = aFc1bSDK.mo8752e();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKMo8752e, "");
        this.afDebugLog = aFh1xSDKMo8752e;
        this.AFLoggerLogLevel = aFc1bSDK.setUserFirstName();
        AFd1bSDK aFd1bSDK = AFd1bSDK.CONVERSION;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.LAUNCH;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    /* JADX INFO: renamed from: e */
    public final boolean mo8803e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        Map<String, ? extends Object> map = this.afWarnLog;
        if (map != null) {
            AFg1kSDK.m8863d(map, this.AFLoggerLogLevel);
            return;
        }
        String str = this.afInfoLog;
        if (str == null || str.length() == 0) {
            str = null;
        }
        if (str == null) {
            str = "Unknown error";
        }
        AFg1kSDK.registerClient(str, this.AFLoggerLogLevel);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0123  */
    /* JADX WARN: Code duplicated, block: B:79:0x0135 A[SYNTHETIC] */
    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        AFd1cSDK aFd1cSDK;
        String str;
        if (getUnregisterClient().AFLogger()) {
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-E03] 'isStopTracking' enabled", false, 4, null);
            this.afInfoLog = "'isStopTracking' enabled";
            throw new AFe1qSDK();
        }
        int i10 = 0;
        while (i10 < 3) {
            boolean z10 = i10 == 2;
            this.afDebugLog.afDebugLog = System.currentTimeMillis();
            try {
                try {
                    super.registerClient();
                    ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
                    if (responseNetwork != null) {
                        int statusCode = responseNetwork.getStatusCode();
                        boolean z11 = statusCode == 403 || statusCode >= 500;
                        if (responseNetwork.isSuccessful() || statusCode == 404) {
                            Object body = responseNetwork.getBody();
                            Intrinsics.m31981d(body, "");
                            Map<String, ? extends Object> mapM32039d = C7739h0.m32039d(body);
                            if (responseNetwork.getStatusCode() == 404) {
                                mapM32039d.remove("error_reason");
                                mapM32039d.remove("status_code");
                                mapM32039d.put("af_status", "Organic");
                                mapM32039d.put("af_message", "organic install");
                            }
                            Object obj = mapM32039d.get("iscache");
                            Boolean bool = Boolean.FALSE;
                            if (Intrinsics.m31980c(obj, bool)) {
                                this.f7004v.AFLogger("appsflyerConversionDataCacheExpiration", System.currentTimeMillis());
                            }
                            if (mapM32039d.containsKey("af_siteid")) {
                                if (mapM32039d.containsKey(AFInAppEventParameterName.AF_CHANNEL)) {
                                    str = "[Invite] Detected App-Invite via channel: " + mapM32039d.get(AFInAppEventParameterName.AF_CHANNEL);
                                } else {
                                    str = String.format("[CrossPromotion] App was installed via %s's Cross Promotion", Arrays.copyOf(new Object[]{mapM32039d.get("af_siteid")}, 1));
                                    Intrinsics.checkNotNullExpressionValue(str, "");
                                }
                                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, str, false, 4, null);
                            }
                            mapM32039d.put("is_first_launch", bool);
                            this.f7004v.mo8764d("attributionId", new JSONObject(mapM32039d).toString());
                            if (!this.f7004v.AFKeystoreWrapper("sixtyDayConversionData")) {
                                mapM32039d.put("is_first_launch", Boolean.TRUE);
                            }
                            this.afWarnLog = mapM32039d;
                            aFd1cSDK = AFd1cSDK.SUCCESS;
                        } else if (z10 || !z11) {
                            this.afInfoLog = "Error connection to server: " + statusCode;
                            aFd1cSDK = AFd1cSDK.FAILURE;
                        }
                        if (aFd1cSDK == null) {
                            this.afDebugLog.AFLogger(i10);
                            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                            return aFd1cSDK;
                        }
                        this.afDebugLog.AFLogger(i10);
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                        i10++;
                    }
                    aFd1cSDK = null;
                    if (aFd1cSDK == null) {
                        this.afDebugLog.AFLogger(i10);
                        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                        return aFd1cSDK;
                    }
                    this.afDebugLog.AFLogger(i10);
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                    i10++;
                } catch (AFe1uSDK e10) {
                    AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-E05] AppsFlyer dev key is missing", false, 4, null);
                    this.afInfoLog = "AppsFlyer dev key is missing";
                    throw e10;
                } catch (Exception e11) {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.GCD;
                    String message = e11.getMessage();
                    if (message == null) {
                        message = "unknown error during GCD fetch";
                    }
                    AFLoggerBase.e$default(aFLogger, logTag, "[GCD] Error: " + message, e11, true, false, false, false, 64, null);
                    if (z10) {
                        this.afInfoLog = e11.getMessage();
                        throw e11;
                    }
                    this.afDebugLog.AFLogger(i10);
                    AFLoggerBase.d$default(aFLogger, logTag, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                }
            } catch (Throwable th2) {
                this.afDebugLog.AFLogger(i10);
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-A03] Server retrieving attempt finished", false, 4, null);
                throw th2;
            }
        }
        return AFd1cSDK.FAILURE;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Return type fixed from 'com.appsflyer.internal.AFd1pSDK<java.util.Map<java.lang.String, java.lang.Object>>' to match base method */
    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<Map<String, ? extends Object>> AFLogger(@NotNull String str) {
        String str2 = "";
        Intrinsics.checkNotNullParameter(str, "");
        AFc1kSDK aFc1kSDK = this.f7004v;
        String strAFLogger = this.force.AFLogger("CHANNEL");
        if (strAFLogger != null && strAFLogger.equals("")) {
            strAFLogger = null;
        }
        String strM8725d = AFa1tSDK.m8725d(aFc1kSDK, strAFLogger);
        if (strM8725d != null && !StringsKt.m32182p0(strM8725d)) {
            List list = AFg1jSDK.AFKeystoreWrapper;
            Locale locale = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale, "");
            String lowerCase = strM8725d.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "");
            if (list.contains(lowerCase)) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD] AF detected using redundant Google-Play channel for attribution - " + strM8725d + ". Using without channel postfix.", false, 4, null);
            } else {
                str2 = "-" + strM8725d;
            }
        }
        AFd1pSDK<Map<String, ? extends Object>> aFd1pSDKAFKeystoreWrapper = getD().AFKeystoreWrapper(str2, str);
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.GCD, "[GCD-B01] URL: " + aFd1pSDKAFKeystoreWrapper.unregisterClient.f6909d, false, 4, null);
        Intrinsics.checkNotNull(aFd1pSDKAFKeystoreWrapper);
        return aFd1pSDKAFKeystoreWrapper;
    }
}
