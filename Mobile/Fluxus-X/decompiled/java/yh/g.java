package yh;

import bh.a1;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f37866a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f37867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f37868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f37869e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f37870f;

    public g(String str) {
        this.f37866a = str;
    }

    public static g a(String str, String str2) {
        g gVar = new g(str);
        gVar.g(str2);
        return gVar;
    }

    public static g b(String str) {
        g gVar = new g(str);
        gVar.f37869e = true;
        return gVar;
    }

    public static String c(long j10) {
        if (j10 == -1) {
            return a1.B0();
        }
        return a1.g() + "users/" + j10 + "/profile/";
    }

    public String d() {
        return this.f37867c;
    }

    public JSONObject e() {
        return this.f37868d;
    }

    public boolean f() {
        return this.f37870f;
    }

    public void g(String str) {
        this.f37867c = str;
    }

    public void h(JSONObject jSONObject) {
        this.f37868d = jSONObject;
    }

    public void i(String str) {
        this.b = str;
    }

    public void j(boolean z10) {
        this.f37870f = z10;
    }
}
