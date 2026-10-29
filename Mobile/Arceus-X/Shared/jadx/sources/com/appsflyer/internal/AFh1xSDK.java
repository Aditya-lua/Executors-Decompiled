package com.appsflyer.internal;

import androidx.core.app.NotificationCompat;
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

    /* JADX INFO: renamed from: d */
    public final Map<String, Object> f7037d = new ConcurrentHashMap();
    public final Map<String, Object> registerClient = new ConcurrentHashMap();
    public final Map<String, Object> AFLogger = new ConcurrentHashMap();

    /* JADX INFO: renamed from: i */
    public long f7039i = 0;

    /* JADX INFO: renamed from: e */
    public long f7038e = 0;
    public final long[] force = new long[2];

    /* JADX INFO: renamed from: v */
    public final long[] f7040v = new long[2];

    /* JADX INFO: renamed from: w */
    public final long[] f7041w = new long[2];
    public long afErrorLog = 0;
    public long afDebugLog = 0;

    public AFh1xSDK(AFc1kSDK aFc1kSDK, AFc1iSDK aFc1iSDK) {
        this.AFKeystoreWrapper = aFc1kSDK;
        this.unregisterClient = aFc1iSDK;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void AFLogger() {
        this.f7038e = System.currentTimeMillis();
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0) {
            long j10 = this.f7039i;
            if (j10 == 0) {
                AFLogger.INSTANCE.m8965i(LogTag.GENERAL, "Metrics collection skipped: initialization timestamp not recorded");
                return;
            }
            this.f7037d.put("init_to_fg", Long.valueOf(this.f7038e - j10));
            this.AFKeystoreWrapper.mo8764d("first_launch", new JSONObject(this.f7037d).toString());
        }
    }

    public final void registerClient(DeepLinkResult deepLinkResult, long j10) {
        this.registerClient.put(NotificationCompat.CATEGORY_STATUS, deepLinkResult.getStatus().toString());
        this.registerClient.put("timeout_value", Long.valueOf(j10));
    }

    public final void unregisterClient(AFh1uSDK aFh1uSDK) {
        if (this.unregisterClient.AFKeystoreWrapper.AFLogger("appsFlyerCount", 0) == 0) {
            this.f7037d.put("api_name", aFh1uSDK.toString());
            this.AFKeystoreWrapper.mo8764d("first_launch", new JSONObject(this.f7037d).toString());
        }
    }

    public final void AFLogger(int i10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.afDebugLog;
        if (j10 != 0) {
            this.AFLogger.put("net", Long.valueOf(jCurrentTimeMillis - j10));
        } else {
            AFLogger.INSTANCE.m8965i(LogTag.GENERAL, "Metrics collection skipped: GCD start timestamp not recorded");
        }
        this.AFLogger.put("retries", Integer.valueOf(i10));
        this.AFKeystoreWrapper.mo8764d("gcd", new JSONObject(this.AFLogger).toString());
    }

    public final Map<String, Object> AFLogger(String str) {
        Map<String, Object> map = Collections.EMPTY_MAP;
        String strMo8762d = this.AFKeystoreWrapper.mo8762d(str);
        if (strMo8762d != null) {
            try {
                return AFg1dSDK.unregisterClient(new JSONObject(strMo8762d));
            } catch (Exception e10) {
                AFLogger.INSTANCE.m8961e(LogTag.GENERAL, "Error while parsing cached JSON data for metrics", e10);
            }
        }
        return map;
    }
}
