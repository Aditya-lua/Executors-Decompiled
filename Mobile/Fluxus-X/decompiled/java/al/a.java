package al;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f495a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f497d;

    public abstract void a(boolean z10, JSONObject jSONObject);

    public String b() {
        return this.f497d;
    }

    public abstract Context c();

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f495a;
    }

    public JSONObject f() {
        if (this.f496c == null) {
            this.f496c = new JSONObject();
        }
        return this.f496c;
    }

    public void g(String str) {
        this.f497d = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(String str) {
        this.f495a = str;
    }

    public void j(JSONObject jSONObject) {
        this.f496c = jSONObject;
    }
}
