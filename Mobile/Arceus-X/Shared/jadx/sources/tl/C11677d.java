package tl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p494vl.EnumC12228a;

/* JADX INFO: renamed from: tl.d */
/* JADX INFO: loaded from: classes2.dex */
public class C11677d {

    /* JADX INFO: renamed from: a */
    public static final String f41276a = "d";

    /* JADX INFO: renamed from: a */
    public static EnumC12228a m43833a(JSONObject jSONObject, String str) {
        try {
            return EnumC12228a.valueOf(jSONObject.getString(str));
        } catch (IllegalArgumentException | NullPointerException | JSONException e10) {
            Log.e(f41276a, "safeGetDurationNeededEnum: ", e10);
            return EnumC12228a.Completion;
        }
    }

    /* JADX INFO: renamed from: b */
    public static JSONObject m43834b(String str) {
        try {
            return new JSONObject(str);
        } catch (JSONException e10) {
            Log.e(f41276a, "safeParseJSON: ", e10);
            return new JSONObject();
        }
    }
}
