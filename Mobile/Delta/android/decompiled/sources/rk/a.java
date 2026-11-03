package rk;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f30754a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public JSONObject f30755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f30756d;

    public abstract void a(boolean z10, JSONObject jSONObject);

    public String b() {
        return this.f30756d;
    }

    public abstract Context c();

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f30754a;
    }

    public JSONObject f() {
        if (this.f30755c == null) {
            this.f30755c = new JSONObject();
        }
        return this.f30755c;
    }

    public void g(String str) {
        this.f30756d = str;
    }

    public void h(String str) {
        this.b = str;
    }

    public void i(String str) {
        this.f30754a = str;
    }

    public void j(JSONObject jSONObject) {
        this.f30755c = jSONObject;
    }
}
