package pl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class l {
    public static JSONObject a(String str, m mVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(lm.a.r(), str);
            jSONObject.put(lm.a.p(), mVar);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("DeviceIntegrityUtil", "JSON exception on retrieving integrity token: " + e10);
            return jSONObject;
        }
    }
}
