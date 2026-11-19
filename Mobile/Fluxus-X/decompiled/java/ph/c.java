package ph;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f29165a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f29166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f29167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f29168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f29169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f29170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f29171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f29172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f29173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f29174k;

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
        this.f29166c = str2;
        this.f29167d = str3;
        this.f29168e = str4;
        l(str5);
        this.f29169f = str6;
        this.f29170g = str7;
        this.f29171h = str8;
        this.f29172i = str9;
        this.f29173j = str10;
    }

    public String a() {
        return this.f29167d;
    }

    public String b() {
        return this.f29168e;
    }

    public String c() {
        return this.f29166c;
    }

    public String d() {
        return this.f29170g;
    }

    public String e() {
        return this.f29172i;
    }

    public String f() {
        return this.f29173j;
    }

    public String g() {
        return this.f29171h;
    }

    public String h() {
        return this.b;
    }

    public JSONObject i() {
        return this.f29165a;
    }

    public String j() {
        return this.f29165a.toString();
    }

    public String k() {
        return this.f29169f;
    }

    public void l(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f29165a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", "Settings parse error");
            }
        }
        if (this.f29165a == null) {
            this.f29165a = new JSONObject();
        }
    }

    public void m(String str) {
        this.f29167d = str;
    }

    public void n(String str) {
        this.f29174k = str;
    }

    public void o(String str) {
        this.f29172i = str;
    }

    public void p(String str) {
        this.f29173j = str;
    }

    public void q(String str) {
        this.f29171h = str;
    }

    public void r(String str) {
        this.b = str;
    }

    public void s(String str) {
        this.f29169f = str;
    }
}
