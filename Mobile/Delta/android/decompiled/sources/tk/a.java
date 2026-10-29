package tk;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f31847a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f31848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f31849d;

    public abstract void a(boolean z10, JSONObject jSONObject);

    public String b() {
        return this.f31849d;
    }

    public abstract Context c();

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f31847a;
    }

    public JSONObject f() {
        if (this.f31848c == null) {
            this.f31848c = new JSONObject();
        }
        return this.f31848c;
    }

    public void g(String str) {
        this.f31849d = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(String str) {
        this.f31847a = str;
    }

    public void j(JSONObject jSONObject) {
        this.f31848c = jSONObject;
    }
}
