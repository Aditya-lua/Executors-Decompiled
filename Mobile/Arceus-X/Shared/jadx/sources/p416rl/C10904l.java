package p416rl;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;
import p311nm.C9494a;

/* JADX INFO: renamed from: rl.l */
/* JADX INFO: loaded from: classes2.dex */
public class C10904l {
    /* JADX INFO: renamed from: a */
    public static JSONObject m41471a(String str, EnumC10905m enumC10905m) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C9494a.m37405r(), str);
            jSONObject.put(C9494a.m37403p(), enumC10905m);
            return jSONObject;
        } catch (JSONException e10) {
            Log.e("DeviceIntegrityUtil", "JSON exception on retrieving integrity token: " + e10);
            return jSONObject;
        }
    }
}
