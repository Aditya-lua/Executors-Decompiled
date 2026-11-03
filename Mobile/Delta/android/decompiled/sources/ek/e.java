package ek;

import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f16134a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f16135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f16136d;

    public e(String str) {
        q.h("rbx.baseurl", "Incoming base url: " + str);
        String strF = f(e(str));
        if (strF.startsWith("www.")) {
            this.f16134a = strF;
            this.f16135c = strF.substring(4);
        } else {
            this.f16134a = "www." + strF;
            this.f16135c = strF;
        }
        this.b = this.f16134a + "/";
        this.f16136d = this.f16135c + "/";
    }

    public String a() {
        return this.f16135c;
    }

    public String b() {
        return this.f16136d;
    }

    public String c() {
        return this.f16134a;
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
        return "BaseUrl{url='" + this.f16134a + "'}";
    }
}
