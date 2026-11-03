package rl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30773a = "d";

    public static tl.a a(JSONObject jSONObject, String str) {
        try {
            return tl.a.valueOf(jSONObject.getString(str));
        } catch (IllegalArgumentException | NullPointerException | JSONException e10) {
            Log.e(f30773a, "safeGetDurationNeededEnum: ", e10);
            return tl.a.Completion;
        }
    }

    public static JSONObject b(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            Log.e(f30773a, "safeParseJSON: ", e10);
            return new JSONObject();
        }
    }
}
