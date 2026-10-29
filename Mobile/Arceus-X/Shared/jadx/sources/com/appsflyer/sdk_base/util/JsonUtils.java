package com.appsflyer.sdk_base.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.AbstractC7678e0;
import kotlin.collections.C7690k0;
import kotlin.collections.C7701q;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.C7764d;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p201iu.C6985m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m31664d1 = {"\u0000\"\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001*\u00020\u0004\u001a\u0016\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0004\u001a\u0014\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007*\u00020\bH\u0002\u001a\u0012\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\n\u001a\u00020\u0003H\u0002¨\u0006\u000b"}, m31665d2 = {"toMap", "", "", "", "Lorg/json/JSONObject;", "toStringMap", "toList", "", "Lorg/json/JSONArray;", "convertJsonValue", "jsonValue", "sdk_base_release"}, m31666k = 2, m31667mv = {2, 0, 0}, m31669xi = 48)
public final class JsonUtils {
    private static final Object convertJsonValue(Object obj) {
        if (obj instanceof JSONArray) {
            return toList((JSONArray) obj);
        }
        if (obj instanceof JSONObject) {
            return toMap((JSONObject) obj);
        }
        if (Intrinsics.m31980c(obj, JSONObject.NULL)) {
            return null;
        }
        return obj;
    }

    private static final List<Object> toList(JSONArray jSONArray) throws JSONException {
        IntRange intRangeM32092q = C7764d.m32092q(0, jSONArray.length());
        ArrayList arrayList = new ArrayList(C7701q.m31905u(intRangeM32092q, 10));
        Iterator<Integer> it = intRangeM32092q.iterator();
        while (it.hasNext()) {
            Object obj = jSONArray.get(((AbstractC7678e0) it).nextInt());
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            arrayList.add(convertJsonValue(obj));
        }
        return arrayList;
    }

    @NotNull
    public static final Map<String, Object> toMap(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        Sequence sequenceM29376e = C6985m.m29376e(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceM29376e) {
            Object obj2 = jSONObject.get((String) obj);
            Intrinsics.checkNotNullExpressionValue(obj2, "get(...)");
            linkedHashMap.put(obj, convertJsonValue(obj2));
        }
        return linkedHashMap;
    }

    @NotNull
    public static final Map<String, String> toStringMap(@NotNull JSONObject jSONObject) throws JSONException {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        if (jSONObject.length() == 0) {
            return C7690k0.m31795j();
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        Sequence sequenceM29376e = C6985m.m29376e(itKeys);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : sequenceM29376e) {
            Object obj2 = jSONObject.get((String) obj);
            linkedHashMap.put(obj, Intrinsics.m31980c(obj2, JSONObject.NULL) ? "null" : obj2.toString());
        }
        return linkedHashMap;
    }
}
