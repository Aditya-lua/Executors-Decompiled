package p151gk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: gk.g */
/* JADX INFO: loaded from: classes2.dex */
public class C6114g {
    /* JADX INFO: renamed from: a */
    public static long m27033a(String str) {
        try {
            return m27034b(str).getTime();
        } catch (ParseException unused) {
            C6124q.m27066k("rbx.utils", "Exception caught when converting string to date: " + str);
            long jM27035c = m27035c(str);
            C6124q.m27066k("rbx.utils", "Parsing as alternate format: " + jM27035c);
            return jM27035c;
        }
    }

    /* JADX INFO: renamed from: b */
    public static Date m27034b(String str) throws ParseException {
        String strReplace;
        String str2 = "";
        if (str.contains("+00:00")) {
            str = str.replace("+00:00", "");
        }
        if (str.length() == 19) {
            strReplace = str + ".+00:00";
        } else if (str.contains(".Z")) {
            strReplace = str.replace(".Z", ".+00:00");
        } else if (str.endsWith("Z")) {
            strReplace = str.replace("Z", ".+00:00");
        } else {
            strReplace = str + ".+00:00";
        }
        try {
            if (strReplace.length() > 29) {
                strReplace = strReplace.substring(0, 23) + strReplace.substring(strReplace.length() - 6);
            } else if (strReplace.length() < 29) {
                int length = 29 - strReplace.length();
                for (int i10 = 0; i10 < length; i10++) {
                    str2 = str2 + "0";
                }
                strReplace = strReplace.substring(0, 23 - length) + str2 + strReplace.substring(strReplace.length() - 6);
            }
            String str3 = strReplace.substring(0, 26) + strReplace.substring(27);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'.'SSSZ");
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
            return simpleDateFormat.parse(str3);
        } catch (IndexOutOfBoundsException unused) {
            throw new ParseException("Invalid length for: " + strReplace, 0);
        }
    }

    /* JADX INFO: renamed from: c */
    public static long m27035c(String str) {
        Matcher matcher = Pattern.compile("\\/Date\\((\\-?\\d*?)([\\+\\-]\\d*)?\\)\\/").matcher(str);
        if (matcher.matches()) {
            return Long.valueOf(matcher.group(1)).longValue();
        }
        return 0L;
    }
}
