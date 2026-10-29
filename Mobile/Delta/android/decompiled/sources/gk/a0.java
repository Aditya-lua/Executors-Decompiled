package gk;

import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class a0 {
    public static String a(String str) {
        char cCharAt;
        char upperCase;
        if (str == null || str.length() == 0 || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
            return str;
        }
        return upperCase + str.substring(1);
    }

    public static String b(String str, Object... objArr) {
        return String.format(Locale.ROOT, str, objArr);
    }

    public static String c(Object obj) {
        return obj == null ? "" : String.valueOf(obj);
    }
}
