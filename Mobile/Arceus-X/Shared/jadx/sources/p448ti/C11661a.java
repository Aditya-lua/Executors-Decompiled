package p448ti;

import org.json.JSONObject;

/* JADX INFO: renamed from: ti.a */
/* JADX INFO: loaded from: classes2.dex */
public class C11661a {

    /* JADX INFO: renamed from: a */
    public String f41221a;

    /* JADX INFO: renamed from: b */
    public String f41222b;

    /* JADX INFO: renamed from: c */
    public String f41223c;

    public C11661a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject.isNull("signupAndLogin") ? null : jSONObject.getJSONObject("signupAndLogin");
        if (jSONObject2 != null) {
            m43776e(jSONObject2.isNull("locale") ? null : jSONObject2.getString("locale"));
        }
        JSONObject jSONObject3 = jSONObject.isNull("generalExperience") ? null : jSONObject.getJSONObject("generalExperience");
        if (jSONObject3 != null) {
            m43775d(jSONObject3.isNull("locale") ? null : jSONObject3.getString("locale"));
        }
        JSONObject jSONObject4 = jSONObject.isNull("ugc") ? null : jSONObject.getJSONObject("ugc");
        if (jSONObject4 != null) {
            m43777f(jSONObject4.isNull("locale") ? null : jSONObject4.getString("locale"));
        }
    }

    /* JADX INFO: renamed from: a */
    public String m43772a() {
        return this.f41222b;
    }

    /* JADX INFO: renamed from: b */
    public String m43773b() {
        return this.f41221a;
    }

    /* JADX INFO: renamed from: c */
    public String m43774c() {
        return this.f41223c;
    }

    /* JADX INFO: renamed from: d */
    public final void m43775d(String str) {
        this.f41222b = str;
    }

    /* JADX INFO: renamed from: e */
    public final void m43776e(String str) {
        this.f41221a = str;
    }

    /* JADX INFO: renamed from: f */
    public void m43777f(String str) {
        this.f41223c = str;
    }
}
