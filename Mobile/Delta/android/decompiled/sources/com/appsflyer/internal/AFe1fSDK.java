package com.appsflyer.internal;

import android.os.Build;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.deeplink.DeepLink;
import com.appsflyer.share.deeplink.DeepLinkResult;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class AFe1fSDK extends AFe1kSDK<DdlResponse> {

    @NotNull
    private final AFa1qSDK AFLoggerLogLevel;
    private int AppsFlyerLib;

    @NotNull
    private final AFh1xSDK afDebugLog;

    @NotNull
    private final AFi1aSDK afErrorLog;

    @NotNull
    private final AFc1eSDK afInfoLog;
    private int afWarnLog;

    @NotNull
    private final AFc1iSDK force;

    @NotNull
    private final CountDownLatch getLevel;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final AFa1oSDK f5309v;

    @NotNull
    private final List<Referrer> valueOf;
    private int values;

    public /* synthetic */ class AFa1tSDK {
        public static final /* synthetic */ int[] AFKeystoreWrapper;
        public static final /* synthetic */ int[] registerClient;

        static {
            int[] iArr = new int[AFd1cSDK.values().length];
            try {
                iArr[AFd1cSDK.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AFd1cSDK.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            registerClient = iArr;
            int[] iArr2 = new int[Referrer.State.values().length];
            try {
                iArr2[Referrer.State.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Referrer.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            AFKeystoreWrapper = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFe1fSDK(@NotNull AFc1bSDK aFc1bSDK) {
        super(AFd1bSDK.DLSDK, new AFe1zSDK[]{AFd1bSDK.RC_CDN, AFd1bSDK.FETCH_ADVERTISING_ID}, aFc1bSDK, "DdlSdk");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        int i10 = 0;
        this.f5309v = new AFa1oSDK();
        AFc1iSDK aFc1iSDKAFLogger = aFc1bSDK.AFLogger();
        Intrinsics.checkNotNullExpressionValue(aFc1iSDKAFLogger, "");
        this.force = aFc1iSDKAFLogger;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afInfoLog = androidIdData;
        AFa1qSDK aFa1qSDKEnableTCFDataCollection = aFc1bSDK.enableTCFDataCollection();
        Intrinsics.checkNotNullExpressionValue(aFa1qSDKEnableTCFDataCollection, "");
        this.AFLoggerLogLevel = aFa1qSDKEnableTCFDataCollection;
        AFh1xSDK aFh1xSDKE = aFc1bSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKE, "");
        this.afDebugLog = aFh1xSDKE;
        AFi1aSDK aFi1aSDKAfDebugLog = aFc1bSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFi1aSDKAfDebugLog, "");
        this.afErrorLog = aFi1aSDKAfDebugLog;
        this.getLevel = new CountDownLatch(1);
        this.valueOf = new ArrayList();
        Referrer[] referrerArr = (Referrer[]) aFi1aSDKAfDebugLog.unregisterClient.toArray(new Referrer[0]);
        Intrinsics.checkNotNullExpressionValue(referrerArr, "");
        ArrayList arrayList = new ArrayList();
        for (Referrer referrer : referrerArr) {
            if (referrer != null && referrer.getState() != Referrer.State.NOT_STARTED) {
                arrayList.add(referrer);
            }
        }
        this.AppsFlyerLib = arrayList.size();
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            final Referrer referrer2 = (Referrer) obj;
            int i11 = AFa1tSDK.AFKeystoreWrapper[referrer2.getState().ordinal()];
            if (i11 == 1) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, referrer2.map.get(Payload.SOURCE) + " referrer collected earlier", false, 4, null);
                Intrinsics.checkNotNull(referrer2);
                AFKeystoreWrapper(referrer2);
            } else if (i11 == 2) {
                referrer2.setAdditionalReferrerDataCollectionFinishedCallback(new Runnable() { // from class: com.appsflyer.internal.f0
                    @Override // java.lang.Runnable
                    public final void run() {
                        AFe1fSDK.unregisterClient(referrer2, this);
                    }
                });
            }
        }
    }

    private final void AFKeystoreWrapper(Referrer referrer) {
        if (!unregisterClient(referrer)) {
            int i10 = this.values + 1;
            this.values = i10;
            if (i10 == this.AppsFlyerLib) {
                this.getLevel.countDown();
                return;
            }
            return;
        }
        this.valueOf.add(referrer);
        this.getLevel.countDown();
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Added non-organic " + referrer.getClass().getSimpleName(), false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void unregisterClient(Referrer referrer, AFe1fSDK aFe1fSDK) {
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, referrer.map.get(Payload.SOURCE) + " referrer collected via callback", false, 4, null);
        Intrinsics.checkNotNull(referrer);
        aFe1fSDK.AFKeystoreWrapper(referrer);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final /* bridge */ /* synthetic */ AppsFlyerRequestListener afWarnLog() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final long d() {
        return this.AFLoggerLogLevel.AFKeystoreWrapper;
    }

    @Override // com.appsflyer.internal.AFe1kSDK
    public final boolean e() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    @NotNull
    public final AFd1cSDK registerClient() {
        AFd1cSDK aFd1cSDK = AFd1cSDK.FAILURE;
        try {
            AFd1cSDK aFd1cSDKRegisterClient = super.registerClient();
            AFh1xSDK aFh1xSDK = this.afDebugLog;
            int i10 = this.afWarnLog;
            if (i10 <= 0 || i10 > 2) {
                AFLogger.INSTANCE.e(LogTag.DDL, "Unexpected ddl requestCount - end", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i10))), false, false);
            } else {
                int i11 = i10 - 1;
                aFh1xSDK.f5412v[i11] = System.currentTimeMillis();
                long j10 = aFh1xSDK.force[i11];
                if (j10 != 0) {
                    long[] jArr = aFh1xSDK.f5413w;
                    jArr[i11] = aFh1xSDK.f5412v[i11] - j10;
                    aFh1xSDK.registerClient.put("net", jArr);
                } else {
                    AFLogger aFLogger = AFLogger.INSTANCE;
                    LogTag logTag = LogTag.GENERAL;
                    StringBuilder sb2 = new StringBuilder("Metrics: ddlStart[");
                    sb2.append(i11);
                    sb2.append("] ts is missing");
                    aFLogger.i(logTag, sb2.toString());
                }
            }
            int i12 = AFa1tSDK.registerClient[aFd1cSDKRegisterClient.ordinal()];
            if (i12 != 1) {
                if (i12 != 2) {
                    return aFd1cSDKRegisterClient;
                }
                AFLogger aFLogger2 = AFLogger.INSTANCE;
                LogTag logTag2 = LogTag.DDL;
                ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
                AFLoggerBase.d$default(aFLogger2, logTag2, "Error occurred. Server response code = " + (responseNetwork != null ? Integer.valueOf(responseNetwork.getStatusCode()) : null), false, 4, null);
                DeepLinkResult deepLinkResult = new DeepLinkResult(null, DeepLinkResult.Error.HTTP_STATUS_CODE);
                this.afDebugLog.registerClient(deepLinkResult, this.AFLoggerLogLevel.AFKeystoreWrapper);
                this.AFLoggerLogLevel.d(deepLinkResult);
                return aFd1cSDKRegisterClient;
            }
            ResponseNetwork responseNetwork2 = ((AFe1kSDK) this).v;
            Intrinsics.checkNotNull(responseNetwork2);
            Object body = responseNetwork2.getBody();
            Intrinsics.checkNotNullExpressionValue(body, "");
            DdlResponse ddlResponse = (DdlResponse) body;
            DeepLink deepLink = ddlResponse.deepLink;
            if (deepLink != null) {
                DeepLinkResult deepLinkResult2 = new DeepLinkResult(deepLink, null);
                this.afDebugLog.registerClient(deepLinkResult2, this.AFLoggerLogLevel.AFKeystoreWrapper);
                this.AFLoggerLogLevel.d(deepLinkResult2);
                return aFd1cSDKRegisterClient;
            }
            if (this.afWarnLog <= 1 && ddlResponse.secondPing) {
                Object obj = this.f5309v.f5399d.get(Payload.RFRS);
                List list = obj instanceof List ? (List) obj : null;
                if ((list != null ? list.size() : 0) < this.AppsFlyerLib && !this.f5309v.f5399d.containsKey(Payload.RFRS)) {
                    AFLogger aFLogger3 = AFLogger.INSTANCE;
                    AFLoggerBase.d$default(aFLogger3, LogTag.DDL, "Waiting for referrers...", false, 4, null);
                    this.getLevel.await();
                    AFh1xSDK aFh1xSDK2 = this.afDebugLog;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long j11 = aFh1xSDK2.f5412v[0];
                    if (j11 != 0) {
                        aFh1xSDK2.registerClient.put("rfr_wait", Long.valueOf(jCurrentTimeMillis - j11));
                    } else {
                        aFLogger3.i(LogTag.GENERAL, "Metrics: ddlEnd[0] ts is missing");
                    }
                    if (this.values != this.AppsFlyerLib) {
                        return registerClient();
                    }
                    DeepLinkResult deepLinkResult3 = new DeepLinkResult(null, null);
                    this.afDebugLog.registerClient(deepLinkResult3, this.AFLoggerLogLevel.AFKeystoreWrapper);
                    this.AFLoggerLogLevel.d(deepLinkResult3);
                    return AFd1cSDK.SUCCESS;
                }
            }
            DeepLinkResult deepLinkResult4 = new DeepLinkResult(null, null);
            this.afDebugLog.registerClient(deepLinkResult4, this.AFLoggerLogLevel.AFKeystoreWrapper);
            this.AFLoggerLogLevel.d(deepLinkResult4);
            return aFd1cSDKRegisterClient;
        } catch (Exception e10) {
            Throwable cause = e10.getCause();
            if ((cause instanceof InterruptedException) || (cause instanceof InterruptedIOException)) {
                AFLogger aFLogger4 = AFLogger.INSTANCE;
                LogTag logTag3 = LogTag.DDL;
                AFLoggerBase.e$default(aFLogger4, logTag3, "[DDL] Timeout", new TimeoutException(), false, false, false, false, 96, null);
                AFLoggerBase.d$default(aFLogger4, logTag3, "Timeout, didn't manage to find deferred deeplink after " + this.afWarnLog + " attempt(s) within " + this.AFLoggerLogLevel.AFKeystoreWrapper + " milliseconds", false, 4, null);
                DeepLinkResult deepLinkResult5 = new DeepLinkResult(null, DeepLinkResult.Error.TIMEOUT);
                this.afDebugLog.registerClient(deepLinkResult5, this.AFLoggerLogLevel.AFKeystoreWrapper);
                this.AFLoggerLogLevel.d(deepLinkResult5);
                return AFd1cSDK.TIMEOUT;
            }
            if (cause instanceof IOException) {
                AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Http Exception: the request was not sent to the server", false, 4, null);
                DeepLinkResult deepLinkResult6 = new DeepLinkResult(null, DeepLinkResult.Error.NETWORK);
                this.afDebugLog.registerClient(deepLinkResult6, this.AFLoggerLogLevel.AFKeystoreWrapper);
                this.AFLoggerLogLevel.d(deepLinkResult6);
                return aFd1cSDK;
            }
            AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Unexpected Exception: " + e10, false, 4, null);
            DeepLinkResult deepLinkResult7 = new DeepLinkResult(null, DeepLinkResult.Error.UNEXPECTED);
            this.afDebugLog.registerClient(deepLinkResult7, this.AFLoggerLogLevel.AFKeystoreWrapper);
            this.AFLoggerLogLevel.d(deepLinkResult7);
            return aFd1cSDK;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x014b  */
    @Override // com.appsflyer.internal.AFe1kSDK
    @NotNull
    public final AFd1pSDK<DdlResponse> AFLogger(@NotNull String str) {
        Map mapM;
        String[] strArr;
        Intrinsics.checkNotNullParameter(str, "");
        int i10 = this.afWarnLog + 1;
        this.afWarnLog = i10;
        AFLoggerBase.d$default(AFLogger.INSTANCE, LogTag.DDL, "Preparing request " + i10, false, 4, null);
        Map<String, Object> map = this.f5309v.f5399d;
        if (this.afWarnLog == 1) {
            map.put("is_first", Boolean.valueOf(this.force.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0));
            Locale locale = Locale.getDefault();
            map.put("lang", locale.getLanguage() + "-" + locale.getCountry());
            map.put("os", Build.VERSION.RELEASE);
            map.put(Payload.TYPE, Build.MODEL);
            map.put("request_id", AFb1jSDK.AFLogger(this.force.AFKeystoreWrapper));
            AFb1rSDK aFb1rSDK = this.afInfoLog.f5251w;
            if (aFb1rSDK != null && (strArr = aFb1rSDK.AFKeystoreWrapper) != null) {
                map.put("sharing_filter", strArr);
            }
            AdvertisingIdData advertisingIdData = this.force.registerClient.updateServerUninstallToken;
            Map<String, String> mapUnregisterClient = unregisterClient(advertisingIdData != null ? new AFb1lSDK(advertisingIdData.advertisingId, advertisingIdData.isLimited) : null);
            if (mapUnregisterClient != null) {
                map.put("gaid", mapUnregisterClient);
            }
            Map<String, String> mapUnregisterClient2 = unregisterClient(AFb1iSDK.unregisterClient(this.force.f5258d.f5305d));
            if (mapUnregisterClient2 != null) {
                map.put("oaid", mapUnregisterClient2);
            }
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        map.put("timestamp", simpleDateFormat.format(new Date(jCurrentTimeMillis)));
        map.put("request_count", Integer.valueOf(this.afWarnLog));
        List<Referrer> list = this.valueOf;
        ArrayList arrayList = new ArrayList();
        for (Referrer referrer : list) {
            if (referrer.getState() == Referrer.State.FINISHED) {
                Object obj = referrer.map.get(Payload.RFR);
                String str2 = obj instanceof String ? (String) obj : null;
                if (str2 != null) {
                    Object obj2 = referrer.map.get(Payload.SOURCE);
                    Intrinsics.d(obj2, "");
                    mapM = kotlin.collections.k0.m(jt.s.a(Payload.SOURCE, (String) obj2), jt.s.a("value", str2));
                } else {
                    mapM = null;
                }
            } else {
                mapM = null;
            }
            if (mapM != null) {
                arrayList.add(mapM);
            }
        }
        if (!arrayList.isEmpty()) {
            map.put(Payload.RFRS, arrayList);
        }
        AFa1oSDK aFa1oSDK = this.f5309v;
        AFj1mSDK aFj1mSDK = new AFj1mSDK(this.force);
        AFf1fSDK aFf1fSDKAfInfoLog = getUnregisterClient();
        String str3 = (String) AFf1fSDK.unregisterClient(new Object[]{aFf1fSDKAfInfoLog}, -1660886869, 1660886871, System.identityHashCode(aFf1fSDKAfInfoLog));
        Object obj3 = this.f5309v.f5399d.get("timestamp");
        Intrinsics.d(obj3, "");
        aFa1oSDK.f5401i = aFj1mSDK.AFLogger(str3, (String) obj3);
        AFh1xSDK aFh1xSDK = this.afDebugLog;
        int i11 = this.afWarnLog;
        if (i11 <= 0 || i11 > 2) {
            AFLogger.INSTANCE.e(LogTag.DDL, "Unexpected ddl requestCount - start", new IllegalStateException("Metrics: Unexpected ddl requestCount = ".concat(String.valueOf(i11))), false, false);
        } else {
            int i12 = i11 - 1;
            aFh1xSDK.force[i12] = System.currentTimeMillis();
            if (i12 == 0) {
                long j10 = aFh1xSDK.f5410e;
                if (j10 != 0) {
                    aFh1xSDK.registerClient.put("from_fg", Long.valueOf(aFh1xSDK.force[i12] - j10));
                } else {
                    AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics: fg ts is missing");
                }
            }
        }
        AFd1sSDK aFd1sSDKAfDebugLog = getD();
        AFd1pSDK<DdlResponse> aFd1pSDK = (AFd1pSDK) AFd1sSDK.d(new Object[]{aFd1sSDKAfDebugLog, this.f5309v}, 232910799, -232910798, System.identityHashCode(aFd1sSDKAfDebugLog));
        Intrinsics.checkNotNullExpressionValue(aFd1pSDK, "");
        return aFd1pSDK;
    }

    private static boolean unregisterClient(Referrer referrer) {
        Object obj = referrer.map.get(Payload.CLICK_TS);
        Long l10 = obj instanceof Long ? (Long) obj : null;
        if (l10 != null) {
            if (System.currentTimeMillis() - TimeUnit.SECONDS.toMillis(l10.longValue()) < TimeUnit.DAYS.toMillis(1L)) {
                return true;
            }
        }
        return false;
    }

    private static Map<String, String> unregisterClient(AFb1lSDK aFb1lSDK) {
        String str;
        if (aFb1lSDK == null || (str = aFb1lSDK.f5235d) == null) {
            return null;
        }
        Boolean bool = aFb1lSDK.AFLogger;
        if (bool == null || !bool.booleanValue()) {
            return kotlin.collections.k0.m(jt.s.a(Payload.TYPE, "unhashed"), jt.s.a("value", str));
        }
        return null;
    }
}
