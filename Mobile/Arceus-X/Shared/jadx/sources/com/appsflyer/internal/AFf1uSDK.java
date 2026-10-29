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
import kotlin.jvm.internal.C7739h0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p229jt.C7345l;

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

    /* JADX INFO: renamed from: v */
    @Nullable
    public Map<? extends String, ? extends Object> f6989v;

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
        AFh1xSDK aFh1xSDKMo8752e = aFc1bSDK.mo8752e();
        Intrinsics.checkNotNullExpressionValue(aFh1xSDKMo8752e, "");
        this.afErrorLog = aFh1xSDKMo8752e;
        AFf1hSDK aFf1hSDKMo8753i = aFc1bSDK.mo8753i();
        Intrinsics.checkNotNullExpressionValue(aFf1hSDKMo8753i, "");
        this.afInfoLog = aFf1hSDKMo8753i;
        AFa1lSDK userPhone = aFc1bSDK.setUserPhone();
        Intrinsics.checkNotNullExpressionValue(userPhone, "");
        this.afDebugLog = userPhone;
        AFc1eSDK androidIdData = aFc1bSDK.setAndroidIdData();
        Intrinsics.checkNotNullExpressionValue(androidIdData, "");
        this.afWarnLog = androidIdData;
        AFe1wSDK aFe1wSDKAfWarnLog = aFc1bSDK.afWarnLog();
        Intrinsics.checkNotNullExpressionValue(aFe1wSDKAfWarnLog, "");
        this.AppsFlyerLib = aFe1wSDKAfWarnLog;
        AFf1aSDK aFf1aSDKMo8755w = aFc1bSDK.mo8755w();
        Intrinsics.checkNotNullExpressionValue(aFf1aSDKMo8755w, "");
        this.getEntries = aFf1aSDKMo8755w;
        this.values = aFc1bSDK.setUserLastName();
        AFd1bSDK aFd1bSDK = AFd1bSDK.RESOLVE_ESP;
        Intrinsics.checkNotNullParameter(aFd1bSDK, "");
        this.AFKeystoreWrapper.add(aFd1bSDK);
        AFd1bSDK aFd1bSDK2 = AFd1bSDK.DLSDK;
        Intrinsics.checkNotNullParameter(aFd1bSDK2, "");
        this.AFKeystoreWrapper.add(aFd1bSDK2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    public static final AppsFlyerConversionListener AFLogger(AFc1bSDK aFc1bSDK) {
        return aFc1bSDK.setUserFirstName();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // com.appsflyer.internal.AFf1tSDK
    /* JADX INFO: renamed from: d */
    public final void mo8849d(@NotNull AFh1pSDK aFh1pSDK) {
        Intrinsics.checkNotNullParameter(aFh1pSDK, "");
        super.mo8849d(aFh1pSDK);
        int i10 = aFh1pSDK.afWarnLog;
        AFh1xSDK aFh1xSDK = this.afErrorLog;
        if (aFh1xSDK.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 1) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            aFh1xSDK.afErrorLog = jCurrentTimeMillis;
            long j10 = aFh1xSDK.f7038e;
            if (j10 != 0) {
                aFh1xSDK.f7037d.put("from_fg", Long.valueOf(jCurrentTimeMillis - j10));
                aFh1xSDK.AFKeystoreWrapper.mo8764d("first_launch", new JSONObject(aFh1xSDK.f7037d).toString());
            } else {
                AFLogger.INSTANCE.m8965i(LogTag.GENERAL, "Metrics: fg ts is missing");
            }
        }
        Object obj = aFh1pSDK.f7027d.get("meta");
        Map map = C7739h0.m32047l(obj) ? (Map) obj : null;
        if (map == null) {
            map = new HashMap();
            Map<String, Object> map2 = aFh1pSDK.f7027d;
            Intrinsics.checkNotNullExpressionValue(map2, "");
            map2.put("meta", map);
        }
        Map<String, ?> mapUnregisterClient = this.afDebugLog.unregisterClient();
        if (!mapUnregisterClient.isEmpty()) {
            aFh1pSDK.AFKeystoreWrapper(mapUnregisterClient);
        }
        AFh1bSDK aFh1bSDKM8834d = this.afInfoLog.m8834d();
        if (aFh1bSDKM8834d != null) {
            HashMap map3 = new HashMap();
            map3.put("cdn_token", aFh1bSDKM8834d.AFKeystoreWrapper);
            String str = aFh1bSDKM8834d.f7017d;
            if (str != null) {
                map3.put("c_ver", str);
            }
            long j11 = aFh1bSDKM8834d.AFLogger;
            if (j11 > 0) {
                map3.put(Payload.LATENCY, Long.valueOf(j11));
            }
            long j12 = aFh1bSDKM8834d.unregisterClient;
            if (j12 > 0) {
                map3.put("delay", Long.valueOf(j12));
            }
            int i11 = aFh1bSDKM8834d.registerClient;
            if (i11 > 0) {
                map3.put("res_code", Integer.valueOf(i11));
            }
            if (aFh1bSDKM8834d.f7018e != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(aFh1bSDKM8834d.f7018e.getClass().getSimpleName());
                sb2.append(": ");
                sb2.append(aFh1bSDKM8834d.f7018e.getMessage());
                map3.put("error", sb2.toString());
            }
            AFh1dSDK aFh1dSDK = aFh1bSDKM8834d.force;
            if (aFh1dSDK != null) {
                map3.put("sig", aFh1dSDK.toString());
            }
            String str2 = aFh1bSDKM8834d.f7019w;
            if (str2 != null) {
                map3.put("cdn_cache_status", str2);
            }
            map.put("rc", map3);
        }
        AFg1rSDK w5 = getW();
        Map<String, Object> map4 = aFh1pSDK.f7027d;
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
            HashMap map6 = new HashMap(this.afErrorLog.f7037d);
            Intrinsics.checkNotNull(map6);
            if (!map6.isEmpty()) {
                map.put("first_launch", map6);
            }
        } else if (i10 == 2) {
            AFh1xSDK aFh1xSDK3 = this.afErrorLog;
            aFh1xSDK3.AFKeystoreWrapper.AFLogger("first_launch");
            HashMap map7 = new HashMap(aFh1xSDK3.f7037d);
            Intrinsics.checkNotNull(map7);
            if (!map7.isEmpty()) {
                map.put("first_launch", map7);
            }
        }
        AFh1sSDK aFh1sSDK = this.values;
        if (aFh1sSDK != null) {
            if (i10 == 1) {
                aFh1sSDK.mo8892d(aFh1pSDK);
            } else if (i10 == 2 && (aFh1pSDK instanceof AFh1kSDK) && !aFh1sSDK.unregisterClient()) {
                aFh1sSDK.unregisterClient(aFh1pSDK);
            }
        }
        if (map.isEmpty()) {
            aFh1pSDK.f7027d.remove("meta");
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
                        throw new C7345l();
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
            Object obj2 = this.f6989v;
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
                aFh1xSDK.f7037d.put("net", Long.valueOf(jCurrentTimeMillis - j10));
                aFh1xSDK.AFKeystoreWrapper.mo8764d("first_launch", new JSONObject(aFh1xSDK.f7037d).toString());
            } else {
                AFLogger.INSTANCE.m8965i(LogTag.GENERAL, "Metrics collection skipped: launch start timestamp not recorded");
            }
        }
        AppsFlyerConversionListener appsFlyerConversionListenerInvoke = this.force.AFKeystoreWrapper.invoke();
        if (appsFlyerConversionListenerInvoke != null) {
            boolean z10 = getForce() == 1;
            if (this.e == aFd1cSDK2 || z10) {
                this.AppsFlyerLib.m8820d(new AFg1lSDK(this, getE(), appsFlyerConversionListenerInvoke));
            }
        }
        AFh1sSDK aFh1sSDK = this.values;
        if (aFh1sSDK != null) {
            aFh1sSDK.unregisterClient(this, new Function0() { // from class: com.appsflyer.internal.p0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AFf1uSDK.m8855d(this.f7157a);
                }
            });
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
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
    /* JADX INFO: renamed from: d */
    public static final Unit m8855d(AFf1uSDK aFf1uSDK) {
        aFf1uSDK.getEntries.mo8824d(new AFh1kSDK());
        return Unit.f29331a;
    }
}
