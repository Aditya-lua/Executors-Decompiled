package gk;

import sg.a1;

/* JADX INFO: loaded from: classes2.dex */
public class f {
    public static String c(String str) {
        if (str == null || str.startsWith("https://") || str.startsWith("http://")) {
            return str;
        }
        if (str.contains(a1.H())) {
            return "https://" + str;
        }
        return a1.g() + str;
    }

    public String a(String str) {
        return str + "/";
    }

    public String b(String str) {
        return str.substring(0, str.indexOf("."));
    }

    public String d(String str) {
        if (str.endsWith("//")) {
            return e(str);
        }
        return !str.endsWith("/") ? a(str) : str;
    }

    public String e(String str) {
        return str.replaceAll("/+$", "/");
    }
}
