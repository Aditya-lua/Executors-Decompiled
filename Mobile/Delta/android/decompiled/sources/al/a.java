package al;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f586a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f587c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f588d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f589e;

    public a(String str) {
        JSONObject jSONObject;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        this.f588d = str;
        String strOptString2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        int iOptInt = -1;
        if (jSONObject != null) {
            this.f589e = true;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("errors");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                iOptInt = jSONObjectOptJSONObject.optInt("code", -1);
                strOptString2 = jSONObjectOptJSONObject.optString("message");
                strOptString = jSONObjectOptJSONObject.optString("userFacingMessage");
            }
            this.f586a = iOptInt;
            this.b = strOptString2;
            this.f587c = strOptString;
        }
        this.f589e = false;
        strOptString = null;
        this.f586a = iOptInt;
        this.b = strOptString2;
        this.f587c = strOptString;
    }
}
