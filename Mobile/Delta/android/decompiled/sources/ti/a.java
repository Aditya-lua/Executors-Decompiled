package ti;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31824a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f31825c;

    public a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.isNull("signupAndLogin") ? null : jSONObject.getJSONObject("signupAndLogin");
        if (jSONObject2 != null) {
            e(jSONObject2.isNull("locale") ? null : jSONObject2.getString("locale"));
        }
        JSONObject jSONObject3 = jSONObject.isNull("generalExperience") ? null : jSONObject.getJSONObject("generalExperience");
        if (jSONObject3 != null) {
            d(jSONObject3.isNull("locale") ? null : jSONObject3.getString("locale"));
        }
        JSONObject jSONObject4 = jSONObject.isNull("ugc") ? null : jSONObject.getJSONObject("ugc");
        if (jSONObject4 != null) {
            f(jSONObject4.isNull("locale") ? null : jSONObject4.getString("locale"));
        }
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f31824a;
    }

    public String c() {
        return this.f31825c;
    }

    public final void d(String str) {
        this.b = str;
    }

    public final void e(String str) {
        this.f31824a = str;
    }

    public void f(String str) {
        this.f31825c = str;
    }
}
