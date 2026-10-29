package com.appsflyer.internal;

import com.appsflyer.share.deeplink.DeepLink;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFa1jSDK implements AFd1iSDK<DdlResponse> {
    @Override // com.appsflyer.internal.AFd1iSDK
    public final /* synthetic */ DdlResponse registerClient(String str) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        DeepLink deferred = null;
        if (str == null || str.length() == 0) {
            return new DdlResponse(false, null, 3, null);
        }
        JSONObject jSONObject = new JSONObject(str);
        boolean zOptBoolean = jSONObject.optBoolean("found", false);
        boolean zOptBoolean2 = jSONObject.optBoolean("is_second_ping", true);
        if (zOptBoolean && (jSONObjectOptJSONObject = jSONObject.optJSONObject("click_event")) != null) {
            deferred = DeepLink.parse(jSONObjectOptJSONObject).setDeferred(true);
        }
        return new DdlResponse(zOptBoolean2, deferred);
    }
}
