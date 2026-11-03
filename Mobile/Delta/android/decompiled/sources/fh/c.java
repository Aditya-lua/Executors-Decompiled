package fh;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public JSONObject f17279a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f17280c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f17281d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f17282e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f17283f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f17284g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f17285h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f17286i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f17287j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f17288k;

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
        this.f17280c = str2;
        this.f17281d = str3;
        this.f17282e = str4;
        l(str5);
        this.f17283f = str6;
        this.f17284g = str7;
        this.f17285h = str8;
        this.f17286i = str9;
        this.f17287j = str10;
    }

    public String a() {
        return this.f17281d;
    }

    public String b() {
        return this.f17282e;
    }

    public String c() {
        return this.f17280c;
    }

    public String d() {
        return this.f17284g;
    }

    public String e() {
        return this.f17286i;
    }

    public String f() {
        return this.f17287j;
    }

    public String g() {
        return this.f17285h;
    }

    public String h() {
        return this.b;
    }

    public JSONObject i() {
        return this.f17279a;
    }

    public String j() {
        return this.f17279a.toString();
    }

    public String k() {
        return this.f17283f;
    }

    public void l(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f17279a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", "Settings parse error");
            }
        }
        if (this.f17279a == null) {
            this.f17279a = new JSONObject();
        }
    }

    public void m(String str) {
        this.f17281d = str;
    }

    public void n(String str) {
        this.f17288k = str;
    }

    public void o(String str) {
        this.f17286i = str;
    }

    public void p(String str) {
        this.f17287j = str;
    }

    public void q(String str) {
        this.f17285h = str;
    }

    public void r(String str) {
        this.b = str;
    }

    public void s(String str) {
        this.f17283f = str;
    }
}
