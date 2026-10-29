package p106ek;

import org.json.JSONObject;

/* JADX INFO: renamed from: ek.b */
/* JADX INFO: loaded from: classes2.dex */
public class C5159b {

    /* JADX INFO: renamed from: a */
    public String f20067a;

    public C5159b(JSONObject jSONObject) {
        this.f20067a = jSONObject.isNull("themeType") ? null : jSONObject.getString("themeType");
    }

    /* JADX INFO: renamed from: a */
    public String m23996a() {
        return this.f20067a;
    }
}
