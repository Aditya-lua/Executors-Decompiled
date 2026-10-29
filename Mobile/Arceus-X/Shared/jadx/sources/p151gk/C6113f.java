package p151gk;

import sg.C11295a1;

/* JADX INFO: renamed from: gk.f */
/* JADX INFO: loaded from: classes2.dex */
public class C6113f {
    /* JADX INFO: renamed from: c */
    public static String m27028c(String str) {
        if (str == null || str.startsWith("https://") || str.startsWith("http://")) {
            return str;
        }
        if (str.contains(C11295a1.m42396H())) {
            return "https://" + str;
        }
        return C11295a1.m42450g() + str;
    }

    /* JADX INFO: renamed from: a */
    public String m27029a(String str) {
        return str + "/";
    }

    /* JADX INFO: renamed from: b */
    public String m27030b(String str) {
        return str.substring(0, str.indexOf("."));
    }

    /* JADX INFO: renamed from: d */
    public String m27031d(String str) {
        if (str.endsWith("//")) {
            return m27032e(str);
        }
        return !str.endsWith("/") ? m27029a(str) : str;
    }

    /* JADX INFO: renamed from: e */
    public String m27032e(String str) {
        return str.replaceAll("/+$", "/");
    }
}
