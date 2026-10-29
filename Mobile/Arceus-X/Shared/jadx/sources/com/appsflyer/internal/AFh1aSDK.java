package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.LogTag;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFh1aSDK {

    @NonNull
    public final String AFKeystoreWrapper;
    private final boolean AFLogger;

    /* JADX INFO: renamed from: d */
    @NonNull
    public final String f7016d;
    public final AFh1gSDK registerClient;

    @NonNull
    public final AFh1iSDK unregisterClient;

    public AFh1aSDK(@NonNull String str) throws JSONException {
        if (str == null) {
            throw new JSONException("Failed to parse remote configuration JSON: originalJson is null");
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String string = jSONObject.getString("ver");
            this.AFKeystoreWrapper = string;
            this.AFLogger = jSONObject.optBoolean("test_mode");
            this.f7016d = str;
            this.unregisterClient = string.startsWith("default") ? AFh1iSDK.DEFAULT : AFh1iSDK.CUSTOM;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("features");
            this.registerClient = jSONObjectOptJSONObject != null ? new AFh1gSDK(jSONObjectOptJSONObject) : null;
        } catch (JSONException e10) {
            AFLogger.INSTANCE.m8963e(LogTag.GENERAL, "Error parsing remote configuration JSON", e10, false, false);
            throw new JSONException("Failed to parse remote configuration JSON");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AFh1aSDK.class != obj.getClass()) {
            return false;
        }
        AFh1aSDK aFh1aSDK = (AFh1aSDK) obj;
        if (this.AFLogger == aFh1aSDK.AFLogger && this.AFKeystoreWrapper.equals(aFh1aSDK.AFKeystoreWrapper)) {
            return this.f7016d.equals(aFh1aSDK.f7016d);
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = ((((this.AFLogger ? 1 : 0) * 31) + this.AFKeystoreWrapper.hashCode()) * 31) + this.f7016d.hashCode();
        AFh1gSDK aFh1gSDK = this.registerClient;
        return aFh1gSDK != null ? (iHashCode * 31) + aFh1gSDK.hashCode() : iHashCode;
    }
}
