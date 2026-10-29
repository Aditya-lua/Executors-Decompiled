package tk;

import android.content.Context;
import org.json.JSONObject;

/* JADX INFO: renamed from: tk.a */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC11666a {

    /* JADX INFO: renamed from: a */
    public String f41250a;

    /* JADX INFO: renamed from: b */
    public String f41251b;

    /* JADX INFO: renamed from: c */
    public JSONObject f41252c;

    /* JADX INFO: renamed from: d */
    public String f41253d;

    /* JADX INFO: renamed from: a */
    public abstract void mo43811a(boolean z10, JSONObject jSONObject);

    /* JADX INFO: renamed from: b */
    public String m43812b() {
        return this.f41253d;
    }

    /* JADX INFO: renamed from: c */
    public abstract Context mo43813c();

    /* JADX INFO: renamed from: d */
    public String m43814d() {
        return this.f41251b;
    }

    /* JADX INFO: renamed from: e */
    public String m43815e() {
        return this.f41250a;
    }

    /* JADX INFO: renamed from: f */
    public JSONObject m43816f() {
        if (this.f41252c == null) {
            this.f41252c = new JSONObject();
        }
        return this.f41252c;
    }

    /* JADX INFO: renamed from: g */
    public void m43817g(String str) {
        this.f41253d = str;
    }

    /* JADX INFO: renamed from: h */
    public void m43818h(String str) {
        this.f41251b = str;
    }

    /* JADX INFO: renamed from: i */
    public void m43819i(String str) {
        this.f41250a = str;
    }

    /* JADX INFO: renamed from: j */
    public void m43820j(JSONObject jSONObject) {
        this.f41252c = jSONObject;
    }
}
