package com.appsflyer.internal;

import androidx.annotation.NonNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class AFg1dSDK {
    private static List<Object> AFLogger(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            Object objUnregisterClient = jSONArray.get(i10);
            if (objUnregisterClient instanceof JSONArray) {
                objUnregisterClient = AFLogger((JSONArray) objUnregisterClient);
            } else if (objUnregisterClient instanceof JSONObject) {
                objUnregisterClient = unregisterClient((JSONObject) objUnregisterClient);
            }
            arrayList.add(objUnregisterClient);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public static JSONObject m8861d(Map<String, ?> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, ?> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), registerClient(entry.getValue()));
            } catch (JSONException unused) {
            }
        }
        return jSONObject;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public static JSONObject registerClient(String str) {
        if (str == null) {
            return null;
        }
        try {
            return new JSONObject(str);
        } catch (JSONException unused) {
            return null;
        }
    }

    public static Map<String, Object> unregisterClient(@NonNull JSONObject jSONObject) throws JSONException {
        HashMap map = new HashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object objUnregisterClient = jSONObject.get(next);
            if (objUnregisterClient instanceof JSONArray) {
                objUnregisterClient = AFLogger((JSONArray) objUnregisterClient);
            } else if (objUnregisterClient instanceof JSONObject) {
                objUnregisterClient = unregisterClient((JSONObject) objUnregisterClient);
            }
            map.put(next, objUnregisterClient);
        }
        return map;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    private static Object registerClient(Object obj) {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                JSONArray jSONArray = new JSONArray();
                Iterator it = ((Collection) obj).iterator();
                while (it.hasNext()) {
                    jSONArray.put(registerClient(it.next()));
                }
                return jSONArray;
            }
            if (!obj.getClass().isArray()) {
                if (obj instanceof Map) {
                    return m8861d((Map) obj);
                }
                return ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) ? obj : obj.toString();
            }
            int length = Array.getLength(obj);
            JSONArray jSONArray2 = new JSONArray();
            for (int i10 = 0; i10 < length; i10++) {
                jSONArray2.put(registerClient(Array.get(obj, i10)));
            }
            return jSONArray2;
        } catch (Exception unused) {
            return JSONObject.NULL;
        }
    }
}
