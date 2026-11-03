package oh;

import org.json.JSONObject;
import rg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f27892a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f27893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f27894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f27895e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f27896f;

    public g(String str) {
        this.f27892a = str;
    }

    public static g a(String str, String str2) {
        g gVar = new g(str);
        gVar.g(str2);
        return gVar;
    }

    public static g b(String str) {
        g gVar = new g(str);
        gVar.f27895e = true;
        return gVar;
    }

    public static String c(long j10) {
        if (j10 == -1) {
            return a1.B0();
        }
        return a1.g() + "users/" + j10 + "/profile/";
    }

    public String d() {
        return this.f27893c;
    }

    public JSONObject e() {
        return this.f27894d;
    }

    public boolean f() {
        return this.f27896f;
    }

    public void g(String str) {
        this.f27893c = str;
    }

    public void h(JSONObject jSONObject) {
        this.f27894d = jSONObject;
    }

    public void i(String str) {
        this.b = str;
    }

    public void j(boolean z10) {
        this.f27896f = z10;
    }
}
