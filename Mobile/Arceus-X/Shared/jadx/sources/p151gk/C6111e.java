package p151gk;

import java.util.regex.Pattern;

/* JADX INFO: renamed from: gk.e */
/* JADX INFO: loaded from: classes2.dex */
public class C6111e {

    /* JADX INFO: renamed from: a */
    public String f23452a;

    /* JADX INFO: renamed from: b */
    public String f23453b;

    /* JADX INFO: renamed from: c */
    public String f23454c;

    /* JADX INFO: renamed from: d */
    public String f23455d;

    public C6111e(String str) {
        C6124q.m27063h("rbx.baseurl", "Incoming base url: " + str);
        String strM27024f = m27024f(m27023e(str));
        if (strM27024f.startsWith("www.")) {
            this.f23452a = strM27024f;
            this.f23454c = strM27024f.substring(4);
        } else {
            this.f23452a = "www." + strM27024f;
            this.f23454c = strM27024f;
        }
        this.f23453b = this.f23452a + "/";
        this.f23455d = this.f23454c + "/";
    }

    /* JADX INFO: renamed from: a */
    public String m27019a() {
        return this.f23454c;
    }

    /* JADX INFO: renamed from: b */
    public String m27020b() {
        return this.f23455d;
    }

    /* JADX INFO: renamed from: c */
    public String m27021c() {
        return this.f23452a;
    }

    /* JADX INFO: renamed from: d */
    public String m27022d() {
        return this.f23453b;
    }

    /* JADX INFO: renamed from: e */
    public final String m27023e(String str) {
        return Pattern.compile("^http:/*|^https:/*", 2).matcher(str).replaceFirst("");
    }

    /* JADX INFO: renamed from: f */
    public final String m27024f(String str) {
        return str.replaceAll("/+$", "");
    }

    public String toString() {
        return "BaseUrl{url='" + this.f23452a + "'}";
    }
}
