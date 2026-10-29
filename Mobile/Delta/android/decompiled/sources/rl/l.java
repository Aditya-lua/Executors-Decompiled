package rl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    public static JSONObject a(String str, m mVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(nm.a.r(), str);
            jSONObject.put(nm.a.p(), mVar);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("DeviceIntegrityUtil", "JSON exception on retrieving integrity token: " + e10);
            return jSONObject;
        }
    }
}
