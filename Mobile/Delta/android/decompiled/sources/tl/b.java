package tl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f31861a = "b";

    public static vl.a a(JSONObject jSONObject, String str) {
        try {
            return vl.a.valueOf(jSONObject.getString(str));
        } catch (IllegalArgumentException | NullPointerException | JSONException e10) {
            Log.e(f31861a, "safeGetDurationNeededEnum: ", e10);
            return vl.a.Completion;
        }
    }

    public static JSONObject b(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            Log.e(f31861a, "safeParseJSON: ", e10);
            return new JSONObject();
        }
    }
}
