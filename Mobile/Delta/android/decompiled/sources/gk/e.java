package gk;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f18236a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18237c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f18238d;

    public e(String str) {
        p.h("rbx.baseurl", "Incoming base url: " + str);
        String strF = f(e(str));
        if (strF.startsWith("www.")) {
            this.f18236a = strF;
            this.f18237c = strF.substring(4);
        } else {
            this.f18236a = "www." + strF;
            this.f18237c = strF;
        }
        this.b = this.f18236a + "/";
        this.f18238d = this.f18237c + "/";
    }

    public String a() {
        return this.f18237c;
    }

    public String b() {
        return this.f18238d;
    }

    public String c() {
        return this.f18236a;
    }

    public String d() {
        return this.b;
    }

    public final String e(String str) {
        return Pattern.compile("^http:/*|^https:/*", 2).matcher(str).replaceFirst("");
    }

    public final String f(String str) {
        return str.replaceAll("/+$", "");
    }

    public String toString() {
        return "BaseUrl{url='" + this.f18236a + "'}";
    }
}
