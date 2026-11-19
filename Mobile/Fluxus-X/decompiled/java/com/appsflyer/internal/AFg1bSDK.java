package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1bSDK {
    private static String AFLogger(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            if (i10 == 0 || i10 == str.length() - 1) {
                sb2.append(str.charAt(i10));
            } else {
                sb2.append("*");
            }
        }
        return sb2.toString();
    }

    public static void registerClient(String str, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("appsflyerKey")) {
                    jSONObject.put("appsflyerKey", AFLogger(jSONObject.getString("appsflyerKey")));
                }
                if (jSONObject.has("tcstring")) {
                    jSONObject.put("tcstring", unregisterClient("tcstring"));
                }
                AFLogger aFLogger = AFLogger.INSTANCE;
                LogTag logTag = LogTag.OTHER;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(jSONObject);
                aFLogger.i(logTag, sb2.toString());
            } catch (JSONException e10) {
                AFLogger.INSTANCE.e(LogTag.OTHER, "Not able to log the payload", e10);
            }
        }
    }

    public static String unregisterClient(String str) {
        if (str.length() <= 20) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.substring(0, 10));
        sb2.append("...");
        return sb2.toString();
    }
}
