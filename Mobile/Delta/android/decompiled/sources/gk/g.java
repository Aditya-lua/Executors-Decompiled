package gk;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes2.dex */
public class g {
    public static long a(String str) {
        try {
            return b(str).getTime();
        } catch (ParseException unused) {
            p.k("rbx.utils", "Exception caught when converting string to date: " + str);
            long jC = c(str);
            p.k("rbx.utils", "Parsing as alternate format: " + jC);
            return jC;
        }
    }

    public static Date b(String str) throws ParseException {
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

    public static long c(String str) {
        Matcher matcher = Pattern.compile("\\/Date\\((\\-?\\d*?)([\\+\\-]\\d*)?\\)\\/").matcher(str);
        if (matcher.matches()) {
            return Long.valueOf(matcher.group(1)).longValue();
        }
        return 0L;
    }
}
