package gh;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f18220a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18221c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18222d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18223e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f18224f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f18225g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f18226h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f18227i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f18228j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f18229k;

    public interface a {
        void a(String str);

        void b(String str);

        void c(String str);

        void d(String str);

        void e(String str);

        void f(String str);

        void g(String str);

        c read();
    }

    public c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.b = str;
        this.f18221c = str2;
        this.f18222d = str3;
        this.f18223e = str4;
        l(str5);
        this.f18224f = str6;
        this.f18225g = str7;
        this.f18226h = str8;
        this.f18227i = str9;
        this.f18228j = str10;
    }

    public String a() {
        return this.f18222d;
    }

    public String b() {
        return this.f18223e;
    }

    public String c() {
        return this.f18221c;
    }

    public String d() {
        return this.f18225g;
    }

    public String e() {
        return this.f18227i;
    }

    public String f() {
        return this.f18228j;
    }

    public String g() {
        return this.f18226h;
    }

    public String h() {
        return this.b;
    }

    public JSONObject i() {
        return this.f18220a;
    }

    public String j() {
        return this.f18220a.toString();
    }

    public String k() {
        return this.f18224f;
    }

    public void l(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f18220a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", "Settings parse error");
            }
        }
        if (this.f18220a == null) {
            this.f18220a = new JSONObject();
        }
    }

    public void m(String str) {
        this.f18222d = str;
    }

    public void n(String str) {
        this.f18229k = str;
    }

    public void o(String str) {
        this.f18227i = str;
    }

    public void p(String str) {
        this.f18228j = str;
    }

    public void q(String str) {
        this.f18226h = str;
    }

    public void r(String str) {
        this.b = str;
    }

    public void s(String str) {
        this.f18224f = str;
    }
}
