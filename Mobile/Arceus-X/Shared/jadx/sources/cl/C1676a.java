package cl;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: cl.a */
/* JADX INFO: loaded from: classes2.dex */
public class C1676a {

    /* JADX INFO: renamed from: a */
    public final int f6450a;

    /* JADX INFO: renamed from: b */
    public final String f6451b;

    /* JADX INFO: renamed from: c */
    public final String f6452c;

    /* JADX INFO: renamed from: d */
    public final String f6453d;

    /* JADX INFO: renamed from: e */
    public final boolean f6454e;

    public C1676a(String str) {
        JSONObject jSONObject;
        String strOptString;
        JSONObject jSONObjectOptJSONObject;
        this.f6453d = str;
        String strOptString2 = null;
        try {
            jSONObject = new JSONObject(str);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        int iOptInt = -1;
        if (jSONObject != null) {
            this.f6454e = true;
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("errors");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0 && (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(0)) != null) {
                iOptInt = jSONObjectOptJSONObject.optInt("code", -1);
                strOptString2 = jSONObjectOptJSONObject.optString("message");
                strOptString = jSONObjectOptJSONObject.optString("userFacingMessage");
            }
            this.f6450a = iOptInt;
            this.f6451b = strOptString2;
            this.f6452c = strOptString;
        }
        this.f6454e = false;
        strOptString = null;
        this.f6450a = iOptInt;
        this.f6451b = strOptString2;
        this.f6452c = strOptString;
    }
}
