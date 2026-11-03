package ck;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f5044a;

    public b(JSONObject jSONObject) {
        this.f5044a = jSONObject.isNull("themeType") ? null : jSONObject.getString("themeType");
    }

    public String a() {
        return this.f5044a;
    }
}
