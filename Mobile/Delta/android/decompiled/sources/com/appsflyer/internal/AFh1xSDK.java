package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import com.appsflyer.share.deeplink.DeepLinkResult;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1xSDK {
    public final AFc1kSDK AFKeystoreWrapper;
    public long afInfoLog;
    public final AFc1iSDK unregisterClient;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, Object> f5409d = new ConcurrentHashMap();
    public final Map<String, Object> registerClient = new ConcurrentHashMap();
    public final Map<String, Object> AFLogger = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public long f5411i = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5410e = 0;
    public final long[] force = new long[2];

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final long[] f5412v = new long[2];

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final long[] f5413w = new long[2];
    public long afErrorLog = 0;
    public long afDebugLog = 0;

    public AFh1xSDK(AFc1kSDK aFc1kSDK, AFc1iSDK aFc1iSDK) {
        this.AFKeystoreWrapper = aFc1kSDK;
        this.unregisterClient = aFc1iSDK;
    }

    public final void AFLogger() {
        this.f5410e = System.currentTimeMillis();
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0) {
            long j10 = this.f5411i;
            if (j10 == 0) {
                AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: initialization timestamp not recorded");
                return;
            }
            this.f5409d.put("init_to_fg", Long.valueOf(this.f5410e - j10));
            this.AFKeystoreWrapper.d("first_launch", new JSONObject(this.f5409d).toString());
        }
    }

    public final void registerClient(DeepLinkResult deepLinkResult, long j10) {
        this.registerClient.put("status", deepLinkResult.getStatus().toString());
        this.registerClient.put("timeout_value", Long.valueOf(j10));
    }

    public final void unregisterClient(AFh1uSDK aFh1uSDK) {
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0) {
            this.f5409d.put("api_name", aFh1uSDK.toString());
            this.AFKeystoreWrapper.d("first_launch", new JSONObject(this.f5409d).toString());
        }
    }

    public final void AFLogger(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.afDebugLog;
        if (j10 != 0) {
            this.AFLogger.put("net", Long.valueOf(jCurrentTimeMillis - j10));
        } else {
            AFLogger.INSTANCE.i(LogTag.GENERAL, "Metrics collection skipped: GCD start timestamp not recorded");
        }
        this.AFLogger.put("retries", Integer.valueOf(i10));
        this.AFKeystoreWrapper.d("gcd", new JSONObject(this.AFLogger).toString());
    }

    public final Map<String, Object> AFLogger(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String strD = this.AFKeystoreWrapper.d(str);
        if (strD != null) {
            try {
                return AFg1dSDK.unregisterClient(new JSONObject(strD));
            } catch (Exception e10) {
                AFLogger.INSTANCE.e(LogTag.GENERAL, "Error while parsing cached JSON data for metrics", e10);
            }
        }
        return map;
    }
}
