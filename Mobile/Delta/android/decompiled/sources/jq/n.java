package jq;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0004\u001a)\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\f\u001a\u00020\u000b*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a!\u0010\u000f\u001a\u00020\u000b*\u00020\u000e2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0012\u0010\r\u001a-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0013\u0010\u0018\u001a\u00020\u0017*\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001b\u0010\u001b\u001a\u00020\u0017*\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001b\u0010\u001c\u001a+\u0010\u001d\u001a\u00020\u000b*\u00020\u000e2\b\b\u0002\u0010\u001a\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u001d\u0010\u0016\u001a\u001b\u0010 \u001a\u00020\u0017*\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!¨\u0006\""}, d2 = {"", "json", "", "", "colorMap", "j", "(Ljava/lang/String;Ljava/util/Map;)Ljava/lang/String;", "Lorg/json/JSONObject;", "", "Ljq/f;", "mappings", "", "h", "(Lorg/json/JSONObject;Ljava/util/List;)V", "Lorg/json/JSONArray;", "f", "(Lorg/json/JSONArray;Ljava/util/List;)V", "gradientJson", "i", "data", "colorStops", "g", "(Lorg/json/JSONArray;ILjava/util/List;)V", "", "b", "(Lorg/json/JSONArray;)Z", "startIndex", "c", "(Lorg/json/JSONArray;I)Z", "d", "", "other", "a", "(DD)Z", "shared_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class n {
    public static final boolean a(double d10, double d11) {
        return d10 < d11 + 0.01d && d10 > d11 - 0.01d;
    }

    public static final boolean b(JSONArray jSONArray) {
        if (jSONArray.length() != 3) {
            return false;
        }
        return c(jSONArray, 0);
    }

    public static final boolean c(JSONArray jSONArray, int i10) {
        int i11 = i10 + 3;
        if (i11 > jSONArray.length()) {
            return false;
        }
        while (i10 < i11) {
            double dOptDouble = jSONArray.optDouble(i10, Double.NaN);
            if (Double.isNaN(dOptDouble) || dOptDouble < 0.0d || dOptDouble > 1.0d) {
                return false;
            }
            i10++;
        }
        return true;
    }

    public static final void d(JSONArray jSONArray, int i10, List<f> list) throws JSONException {
        Object next;
        if (i10 + 3 > jSONArray.length()) {
            return;
        }
        double d10 = jSONArray.getDouble(i10);
        int i11 = i10 + 1;
        double d11 = jSONArray.getDouble(i11);
        int i12 = i10 + 2;
        double d12 = jSONArray.getDouble(i12);
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            f fVar = (f) next;
            if (a(d10, fVar.getSrcR()) && a(d11, fVar.getSrcG()) && a(d12, fVar.getSrcB())) {
                break;
            }
        }
        f fVar2 = (f) next;
        if (fVar2 == null) {
            return;
        }
        jSONArray.put(i10, fVar2.getDestR());
        jSONArray.put(i11, fVar2.getDestG());
        jSONArray.put(i12, fVar2.getDestB());
    }

    public static /* synthetic */ void e(JSONArray jSONArray, int i10, List list, int i11, Object obj) throws JSONException {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        d(jSONArray, i10, list);
    }

    public static final void f(JSONArray jSONArray, List<f> list) throws JSONException {
        if (b(jSONArray)) {
            e(jSONArray, 0, list, 1, null);
            return;
        }
        int length = jSONArray.length();
        for (int i10 = 0; i10 < length; i10++) {
            Object obj = jSONArray.get(i10);
            if (obj instanceof JSONObject) {
                h((JSONObject) obj, list);
            } else if (obj instanceof JSONArray) {
                f((JSONArray) obj, list);
            }
        }
    }

    public static final void g(JSONArray jSONArray, int i10, List<f> list) throws JSONException {
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = (i11 * 4) + 1;
            if (c(jSONArray, i12)) {
                d(jSONArray, i12, list);
            }
        }
    }

    public static final void h(JSONObject jSONObject, List<f> list) throws JSONException {
        if (Intrinsics.c(jSONObject.optString("ty"), "gf")) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("g");
            if (jSONObjectOptJSONObject == null) {
                return;
            }
            i(jSONObjectOptJSONObject, list);
            return;
        }
        Iterator<String> itKeys = jSONObject.keys();
        Intrinsics.checkNotNullExpressionValue(itKeys, "keys(...)");
        while (itKeys.hasNext()) {
            Object obj = jSONObject.get(itKeys.next());
            if (obj instanceof JSONObject) {
                h((JSONObject) obj, list);
            } else if (obj instanceof JSONArray) {
                f((JSONArray) obj, list);
            }
        }
    }

    public static final void i(JSONObject jSONObject, List<f> list) throws JSONException {
        int iOptInt = jSONObject.optInt("p", 0);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("k");
        if (jSONObjectOptJSONObject == null) {
            return;
        }
        if (jSONObjectOptJSONObject.optInt("a", 0) == 0) {
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject.optJSONArray("k");
            if (jSONArrayOptJSONArray == null) {
                return;
            }
            g(jSONArrayOptJSONArray, iOptInt, list);
            return;
        }
        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject.optJSONArray("k");
        if (jSONArrayOptJSONArray2 == null) {
            return;
        }
        int length = jSONArrayOptJSONArray2.length();
        for (int i10 = 0; i10 < length; i10++) {
            JSONObject jSONObjectOptJSONObject2 = jSONArrayOptJSONArray2.optJSONObject(i10);
            if (jSONObjectOptJSONObject2 != null) {
                JSONArray jSONArrayOptJSONArray3 = jSONObjectOptJSONObject2.optJSONArray("s");
                if (jSONArrayOptJSONArray3 != null) {
                    g(jSONArrayOptJSONArray3, iOptInt, list);
                }
                JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject2.optJSONArray("e");
                if (jSONArrayOptJSONArray4 != null) {
                    g(jSONArrayOptJSONArray4, iOptInt, list);
                }
            }
        }
    }

    @NotNull
    public static final String j(@NotNull String json, @NotNull Map<Integer, Integer> colorMap) throws JSONException {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(colorMap, "colorMap");
        if (colorMap.isEmpty()) {
            return json;
        }
        ArrayList arrayList = new ArrayList(colorMap.size());
        for (Map.Entry<Integer, Integer> entry : colorMap.entrySet()) {
            int iIntValue = entry.getKey().intValue();
            int iIntValue2 = entry.getValue().intValue();
            arrayList.add(new f(((double) Color.red(iIntValue)) / 255.0d, ((double) Color.green(iIntValue)) / 255.0d, ((double) Color.blue(iIntValue)) / 255.0d, ((double) Color.red(iIntValue2)) / 255.0d, ((double) Color.green(iIntValue2)) / 255.0d, ((double) Color.blue(iIntValue2)) / 255.0d));
        }
        JSONObject jSONObject = new JSONObject(json);
        h(jSONObject, arrayList);
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
