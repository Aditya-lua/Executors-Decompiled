package ph;

import org.json.JSONObject;
import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28613a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public JSONObject f28615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f28616e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28617f;

    public g(String str) {
        this.f28613a = str;
    }

    public static g a(String str, String str2) {
        g gVar = new g(str);
        gVar.g(str2);
        return gVar;
    }

    public static g b(String str) {
        g gVar = new g(str);
        gVar.f28616e = true;
        return gVar;
    }

    public static String c(long j10) {
        if (j10 == -1) {
            return a1.B0();
        }
        return a1.g() + "users/" + j10 + "/profile/";
    }

    public String d() {
        return this.f28614c;
    }

    public JSONObject e() {
        return this.f28615d;
    }

    public boolean f() {
        return this.f28617f;
    }

    public void g(String str) {
        this.f28614c = str;
    }

    public void h(JSONObject jSONObject) {
        this.f28615d = jSONObject;
    }

    public void i(String str) {
        this.b = str;
    }

    public void j(boolean z10) {
        this.f28617f = z10;
    }
}
