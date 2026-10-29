package gh;

import android.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: gh.c */
/* JADX INFO: loaded from: classes2.dex */
public class C6098c {

    /* JADX INFO: renamed from: a */
    public JSONObject f23431a;

    /* JADX INFO: renamed from: b */
    public String f23432b;

    /* JADX INFO: renamed from: c */
    public String f23433c;

    /* JADX INFO: renamed from: d */
    public String f23434d;

    /* JADX INFO: renamed from: e */
    public String f23435e;

    /* JADX INFO: renamed from: f */
    public String f23436f;

    /* JADX INFO: renamed from: g */
    public String f23437g;

    /* JADX INFO: renamed from: h */
    public String f23438h;

    /* JADX INFO: renamed from: i */
    public String f23439i;

    /* JADX INFO: renamed from: j */
    public String f23440j;

    /* JADX INFO: renamed from: k */
    public String f23441k;

    /* JADX INFO: renamed from: gh.c$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo8372a(String str);

        /* JADX INFO: renamed from: b */
        void mo8373b(String str);

        /* JADX INFO: renamed from: c */
        void mo8374c(String str);

        /* JADX INFO: renamed from: d */
        void mo8375d(String str);

        /* JADX INFO: renamed from: e */
        void mo8376e(String str);

        /* JADX INFO: renamed from: f */
        void mo8377f(String str);

        /* JADX INFO: renamed from: g */
        void mo8378g(String str);

        C6098c read();
    }

    public C6098c(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.f23432b = str;
        this.f23433c = str2;
        this.f23434d = str3;
        this.f23435e = str4;
        m26988l(str5);
        this.f23436f = str6;
        this.f23437g = str7;
        this.f23438h = str8;
        this.f23439i = str9;
        this.f23440j = str10;
    }

    /* JADX INFO: renamed from: a */
    public String m26977a() {
        return this.f23434d;
    }

    /* JADX INFO: renamed from: b */
    public String m26978b() {
        return this.f23435e;
    }

    /* JADX INFO: renamed from: c */
    public String m26979c() {
        return this.f23433c;
    }

    /* JADX INFO: renamed from: d */
    public String m26980d() {
        return this.f23437g;
    }

    /* JADX INFO: renamed from: e */
    public String m26981e() {
        return this.f23439i;
    }

    /* JADX INFO: renamed from: f */
    public String m26982f() {
        return this.f23440j;
    }

    /* JADX INFO: renamed from: g */
    public String m26983g() {
        return this.f23438h;
    }

    /* JADX INFO: renamed from: h */
    public String m26984h() {
        return this.f23432b;
    }

    /* JADX INFO: renamed from: i */
    public JSONObject m26985i() {
        return this.f23431a;
    }

    /* JADX INFO: renamed from: j */
    public String m26986j() {
        return this.f23431a.toString();
    }

    /* JADX INFO: renamed from: k */
    public String m26987k() {
        return this.f23436f;
    }

    /* JADX INFO: renamed from: l */
    public void m26988l(String str) {
        if (str != null && str.length() >= 2) {
            try {
                this.f23431a = new JSONObject(str);
            } catch (JSONException unused) {
                Log.w("rbx.config", "Settings parse error");
            }
        }
        if (this.f23431a == null) {
            this.f23431a = new JSONObject();
        }
    }

    /* JADX INFO: renamed from: m */
    public void m26989m(String str) {
        this.f23434d = str;
    }

    /* JADX INFO: renamed from: n */
    public void m26990n(String str) {
        this.f23441k = str;
    }

    /* JADX INFO: renamed from: o */
    public void m26991o(String str) {
        this.f23439i = str;
    }

    /* JADX INFO: renamed from: p */
    public void m26992p(String str) {
        this.f23440j = str;
    }

    /* JADX INFO: renamed from: q */
    public void m26993q(String str) {
        this.f23438h = str;
    }

    /* JADX INFO: renamed from: r */
    public void m26994r(String str) {
        this.f23432b = str;
    }

    /* JADX INFO: renamed from: s */
    public void m26995s(String str) {
        this.f23436f = str;
    }
}
