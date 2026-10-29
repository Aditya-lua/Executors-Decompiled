package com.appsflyer.internal;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFd1hSDK implements AFd1iSDK<Map<String, String>> {
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // com.appsflyer.internal.AFd1iSDK
    public final /* synthetic */ Map<String, String> registerClient(String str) {
        HashMap map = new HashMap();
        if (!str.trim().isEmpty()) {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        }
        return map;
    }
}
