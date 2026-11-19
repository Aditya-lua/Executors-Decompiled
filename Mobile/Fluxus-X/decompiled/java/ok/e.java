package ok;

import com.github.luben.zstd.BuildConfig;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f28247a;
    public String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f28248c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f28249d;

    public e(String str) {
        q.h("rbx.baseurl", "Incoming base url: " + str);
        String strF = f(e(str));
        if (strF.startsWith("www.")) {
            this.f28247a = strF;
            this.f28248c = strF.substring(4);
        } else {
            this.f28247a = "www." + strF;
            this.f28248c = strF;
        }
        this.b = this.f28247a + "/";
        this.f28249d = this.f28248c + "/";
    }

    public String a() {
        return this.f28248c;
    }

    public String b() {
        return this.f28249d;
    }

    public String c() {
        return this.f28247a;
    }

    public String d() {
        return this.b;
    }

    public final String e(String str) {
        return Pattern.compile("^http:/*|^https:/*", 2).matcher(str).replaceFirst(BuildConfig.FLAVOR);
    }

    public final String f(String str) {
        return str.replaceAll("/+$", BuildConfig.FLAVOR);
    }

    public String toString() {
        return "BaseUrl{url='" + this.f28247a + "'}";
    }
}
