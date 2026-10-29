package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.sdk_base.referrer.Payload;
import com.appsflyer.sdk_base.referrer.Referrer;
import com.appsflyer.share.AppsFlyerConversionListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFf1uSDK extends AFf1tSDK {

    @NotNull
    private final AFi1aSDK AFLoggerLogLevel;

    @NotNull
    private final AFe1wSDK AppsFlyerLib;

    @NotNull
    private final AFa1lSDK afDebugLog;

    @NotNull
    private final AFh1xSDK afErrorLog;

    @NotNull
    private final AFf1hSDK afInfoLog;

    @NotNull
    private final AFc1eSDK afWarnLog;

    @NotNull
    private final AFc1dSDK<AppsFlyerConversionListener> force;

    @NotNull
    private final AFf1aSDK getEntries;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @Nullable
    public Map<? extends String, ? extends Object> f5361v;

    @Nullable
    private final AFh1sSDK values;

    public /* synthetic */ class AFa1ySDK {
        public static final /* synthetic */ int[] AFLogger;

        static {
            int[] iArr = new int[Referrer.State.values().length];
            try {
                iArr[Referrer.State.FINISHED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Referrer.State.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Referrer.State.NOT_STARTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            AFLogger = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AFf1uSDK(@NotNull AFh1pSDK aFh1pSDK, @NotNull final AFc1bSDK aFc1bSDK) {
        super(aFh1pSDK, aFc1bSDK, null, 4, null);
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        Intrinsics.checkNotNullParameter(aFc1bSDK, "");
        this.force = new AFc1dSDK<>(new Function0() { // from class: com.appsflyer.internal.o0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AFf1uSDK.AFLogger(aFc1bSDK);
            }
        });
        AFi1aSDK aFi1aSDKAfDebugLog = aFc1bSDK.afDebugLog();
        Intrinsics.checkNotNullExpressionValue(aFi1aSDKAfDebugLog, "");
        this.AFLoggerLogLevel = aFi1aSDKAfDebugLog;
        AFh1xSDK aFh1xSDKE = aFc1bSDK.e();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKE, "");
        this.afErrorLog = aFh1xSDKE;
        AFf1hSDK aFf1hSDKI = aFc1bSDK.i();
        Intrinsics.checkNotNullExpressionValue(aFf1hSDKI, "");
        this.afInfoLog = aFf1hSDKI;
        AFa1lSDK userPhone = aFc1bSDK.setUserPhone();
        Intrinsics.checkNotNullExpressionValue(userPhone, "");
        this.afDebugLog = userPhone;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afWarnLog = androidIdData;
        AFe1wSDK aFe1wSDKAfWarnLog = aFc1bSDK.afWarnLog();
        Intrinsics.checkNotNullExpressionValue(aFe1wSDKAfWarnLog, "");
        this.AppsFlyerLib = aFe1wSDKAfWarnLog;
        AFf1aSDK aFf1aSDKW = aFc1bSDK.w();
        Intrinsics.checkNotNullExpressionValue(aFf1aSDKW, "");
        this.getEntries = aFf1aSDKW;
        this.values = aFc1bSDK.setUserLastName();
        AFd1bSDK aFd1bSDK = AFd1bSDK.RESOLVE_ESP;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.DLSDK;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AppsFlyerConversionListener AFLogger(AFc1bSDK aFc1bSDK) {
        return aFc1bSDK.setUserFirstName();
    }

    @Override // com.appsflyer.internal.AFf1tSDK
    public final void d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        super.d(aFh1pSDK);
        int i10 = aFh1pSDK.afWarnLog;
        AFh1xSDK aFh1xSDK = this.afErrorLog;
        if (aFh1xSDK.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1xSDK.afErrorLog = jCurrentTimeMillis;
            long j10 = aFh1xSDK.f5410e;
            if (j10 != 0) {
                aFh1xSDK.f5409d.put("from_fg", Long.valueOf(jCurrentTimeMillis - j10));
                aFh1xSDK.AFKeystoreWrapper.d("first_launch", new JSONObject(aFh1xSDK.f5409d).toString());
            } else {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics: fg ts is missing");
            }
        }
        Object obj = aFh1pSDK.f5399d.get("meta");
        Map map = kotlin.jvm.internal.h0.l(obj) ? (Map) obj : null;
        if (map == null) {
            map = new HashMap();
            Map<String, Object> map2 = aFh1pSDK.f5399d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            map2.put("meta", map);
        }
        Map<String, ?> mapUnregisterClient = this.afDebugLog.unregisterClient();
        if (!mapUnregisterClient.isEmpty()) {
            aFh1pSDK.AFKeystoreWrapper(mapUnregisterClient);
        }
        AFh1bSDK aFh1bSDKD = this.afInfoLog.d();
        if (aFh1bSDKD != null) {
            HashMap map3 = new HashMap();
            map3.put("cdn_token", aFh1bSDKD.AFKeystoreWrapper);
            String str = aFh1bSDKD.f5389d;
            if (str != null) {
                map3.put("c_ver", str);
            }
            long j11 = aFh1bSDKD.AFLogger;
            if (j11 > 0) {
                map3.put(Payload.LATENCY, Long.valueOf(j11));
            }
            long j12 = aFh1bSDKD.unregisterClient;
            if (j12 > 0) {
                map3.put("delay", Long.valueOf(j12));
            }
            int i11 = aFh1bSDKD.registerClient;
            if (i11 > 0) {
                map3.put("res_code", Integer.valueOf(i11));
            }
            if (aFh1bSDKD.f5390e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFh1bSDKD.f5390e.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(aFh1bSDKD.f5390e.getMessage());
                map3.put("error", sb2.toString());
            }
            AFh1dSDK aFh1dSDK = aFh1bSDKD.force;
            if (aFh1dSDK != null) {
                map3.put("sig", aFh1dSDK.toString());
            }
            String str2 = aFh1bSDKD.f5391w;
            if (str2 != null) {
                map3.put("cdn_cache_status", str2);
            }
            map.put("rc", map3);
        }
        AFg1rSDK w5 = getW();
        Map<String, Object> map4 = aFh1pSDK.f5399d;
        Intrinsics.checkNotNullExpressionValue(map4, "");
        w5.registerClient(map4);
        if (i10 == 1) {
            AFh1xSDK aFh1xSDK2 = this.afErrorLog;
            HashMap map5 = new HashMap(aFh1xSDK2.registerClient);
            aFh1xSDK2.registerClient.clear();
            Intrinsics.checkNotNull(map5);
            if (!map5.isEmpty()) {
                map.put("ddl", map5);
            }
            HashMap map6 = new HashMap(this.afErrorLog.f5409d);
            Intrinsics.checkNotNull(map6);
            if (!map6.isEmpty()) {
                map.put("first_launch", map6);
            }
        } else if (i10 == 2) {
            AFh1xSDK aFh1xSDK3 = this.afErrorLog;
            aFh1xSDK3.AFKeystoreWrapper.AFLogger("first_launch");
            HashMap map7 = new HashMap(aFh1xSDK3.f5409d);
            Intrinsics.checkNotNull(map7);
            if (!map7.isEmpty()) {
                map.put("first_launch", map7);
            }
        }
        AFh1sSDK aFh1sSDK = this.values;
        if (aFh1sSDK != null) {
            if (i10 == 1) {
                aFh1sSDK.d(aFh1pSDK);
            } else if (i10 == 2 && (aFh1pSDK instanceof AFh1kSDK) && !aFh1sSDK.unregisterClient()) {
                aFh1sSDK.unregisterClient(aFh1pSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1pSDK.f5399d.remove("meta");
        }
        if (i10 <= 2) {
            if (i10 == 1) {
                this.AFLoggerLogLevel.AFLogger = true;
            }
            ArrayList arrayList = new ArrayList();
            for (Referrer referrer : (Referrer[]) this.AFLoggerLogLevel.unregisterClient.toArray(new Referrer[0])) {
                boolean z10 = referrer instanceof AFi1gSDK;
                int i12 = AFa1ySDK.AFLogger[referrer.getState().ordinal()];
                if (i12 == 1) {
                    if (z10) {
                        getE().registerClient(AppsFlyerProperties.NEW_REFERRER_SENT, true);
                    }
                    arrayList.add(referrer.map);
                } else if (i12 != 2) {
                    if (i12 != 3) {
                        throw new jt.l();
                    }
                } else if (i10 == 2 && !z10) {
                    HashMap map8 = new HashMap();
                    map8.put(Payload.SOURCE, referrer.getSource());
                    map8.put(Payload.RESPONSE, Payload.RESPONSE_TIMEOUT);
                    map8.put(Payload.TYPE, referrer.getType());
                    arrayList.add(map8);
                }
            }
            if (!arrayList.isEmpty()) {
                aFh1pSDK.AFKeystoreWrapper(Payload.RFRS, arrayList);
            }
            Object obj2 = this.f5361v;
            if (obj2 != null) {
                aFh1pSDK.AFKeystoreWrapper("fb_ddl", obj2);
            }
        }
        AFh1sSDK aFh1sSDK2 = this.values;
        if (aFh1sSDK2 != null && aFh1pSDK.AFKeystoreWrapper() == AFd1bSDK.LAUNCH && aFh1sSDK2.registerClient()) {
            aFh1sSDK2.registerClient(aFh1pSDK);
        }
        getW().unregisterClient(aFh1pSDK);
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final void force() {
        super.force();
        AFd1cSDK aFd1cSDK = this.e;
        AFd1cSDK aFd1cSDK2 = AFd1cSDK.SUCCESS;
        if (aFd1cSDK == aFd1cSDK2) {
            this.afWarnLog.onPause = System.currentTimeMillis();
        }
        AFh1xSDK aFh1xSDK = this.afErrorLog;
        if (aFh1xSDK.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j10 = aFh1xSDK.afErrorLog;
            if (j10 != 0) {
                aFh1xSDK.f5409d.put("net", Long.valueOf(jCurrentTimeMillis - j10));
                aFh1xSDK.AFKeystoreWrapper.d("first_launch", new JSONObject(aFh1xSDK.f5409d).toString());
            } else {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: launch start timestamp not recorded");
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListenerInvoke = this.force.AFKeystoreWrapper.invoke();
        if (appsFlyerConversionListenerInvoke != null) {
            boolean z10 = getForce() == 1;
            if (this.e == aFd1cSDK2 || z10) {
                this.AppsFlyerLib.d(new AFg1lSDK(this, getE(), appsFlyerConversionListenerInvoke));
            }
        }
        AFh1sSDK aFh1sSDK = this.values;
        if (aFh1sSDK != null) {
            aFh1sSDK.unregisterClient(this, new Function0() { // from class: com.appsflyer.internal.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AFf1uSDK.d(this.f5514a);
                }
            });
        }
    }

    @Override // com.appsflyer.internal.AFe1kSDK, com.appsflyer.internal.AFe1ySDK
    public final boolean AFLogger() {
        if (!super.AFLogger()) {
            ResponseNetwork responseNetwork = ((AFe1kSDK) this).v;
            boolean z10 = this.e == AFd1cSDK.FAILURE && responseNetwork != null && responseNetwork.getStatusCode() / 500 == 1;
            AFe1zSDK aFe1zSDK = this.unregisterClient;
            boolean z11 = aFe1zSDK == AFd1bSDK.CONVERSION || aFe1zSDK == AFd1bSDK.ATTR;
            if (!z10 || !z11) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(AFf1uSDK aFf1uSDK) {
        aFf1uSDK.getEntries.d(new AFh1kSDK());
        return Unit.f22483a;
    }
}
