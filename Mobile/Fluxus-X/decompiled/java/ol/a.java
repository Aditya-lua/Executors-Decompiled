package ol;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f28270a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f28271c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f28272d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f28273e;

    public a(String str) {
        JSONObject jSONObject;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        this.f28272d = str;
        String strOptString2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        int iOptInt = -1;
        if (jSONObject != null) {
            this.f28273e = true;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("errors");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                iOptInt = jSONObjectOptJSONObject.optInt("code", -1);
                strOptString2 = jSONObjectOptJSONObject.optString("message");
                strOptString = jSONObjectOptJSONObject.optString("userFacingMessage");
            }
            this.f28270a = iOptInt;
            this.b = strOptString2;
            this.f28271c = strOptString;
        }
        this.f28273e = false;
        strOptString = null;
        this.f28270a = iOptInt;
        this.b = strOptString2;
        this.f28271c = strOptString;
    }
}
