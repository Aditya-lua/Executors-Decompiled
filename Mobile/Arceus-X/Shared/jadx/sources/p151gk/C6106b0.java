package p151gk;

import java.util.Locale;

/* JADX INFO: renamed from: gk.b0 */
/* JADX INFO: loaded from: classes2.dex */
public class C6106b0 {
    /* JADX INFO: renamed from: a */
    public static String m27005a(String str) {
        char cCharAt;
        char upperCase;
        if (str == null || str.length() == 0 || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
            return str;
        }
        return upperCase + str.substring(1);
    }

    /* JADX INFO: renamed from: b */
    public static String m27006b(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    /* JADX INFO: renamed from: c */
    public static String m27007c(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }
}
